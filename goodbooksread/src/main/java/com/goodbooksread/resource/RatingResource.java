package com.goodbooksread.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goodbooksread.dao.BookRepository;
import com.goodbooksread.dao.RatingRepository;
import com.goodbooksread.dao.UserRepository;
import com.goodbooksread.entity.Book;
import com.goodbooksread.entity.Rating;
import com.goodbooksread.entity.User;


@RestController
@RequestMapping("/ratings")
public class RatingResource {
	
	@Autowired
	private RatingRepository ratingRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BookRepository bookRepository;
	
	@GetMapping
	public List<Rating> getRatings() {
		List<Rating> ratingList = new ArrayList<>();
		ratingRepository.findAll().forEach(ratingList::add);
		return ratingList;
	}
	
	@PostMapping
	public void addRating(@RequestBody Rating rating) {
		System.out.println("Saving the Rating");
		System.out.println(rating);
		User ratingUser = rating.getUser();
		User user = userRepository.findByNameAndEmail(ratingUser.getName(), ratingUser.getEmail());
		if(user != null)
			rating.setUser(user);
		
		Book bookRating = rating.getBook();
		
		Book book = bookRepository.findByNameAndAuthor(bookRating.getName(), bookRating.getAuthor());
		if(book != null)
			rating.setBook(book);
		
		userRepository.save(rating.getUser());
		bookRepository.save(rating.getBook());
		ratingRepository.save(rating);
	}
}
