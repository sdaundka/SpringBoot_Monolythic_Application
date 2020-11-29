package com.goodbooksread.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Rating {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ManyToOne
	//@JoinColumn(name = "userId")
	private User user;
	
	@ManyToOne
	//@JoinColumn(name = "bookId")
	private Book book;
	
	private int ratingScore;
	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rating(int id, User user, Book book, int ratingScore) {
		super();
		this.id = id;
		this.user = user;
		this.book = book;
		this.ratingScore = ratingScore;
	}
	
	public Rating(User user, Book book, int ratingScore) {
		// TODO Auto-generated constructor stub
		//this.id = id;
		this.user = user;
		this.book = book;
		this.ratingScore = ratingScore;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public int getRatingScore() {
		return ratingScore;
	}
	public void setRatingScore(int ratingScore) {
		this.ratingScore = ratingScore;
	}
	
}
