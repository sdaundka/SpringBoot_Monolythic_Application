package com.goodbooksread.dao;

import org.springframework.data.repository.CrudRepository;

import com.goodbooksread.entity.Rating;

public interface RatingRepository extends CrudRepository<Rating, Integer>{

}
