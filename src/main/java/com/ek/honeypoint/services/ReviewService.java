package com.ek.honeypoint.services;

import java.util.ArrayList;

import com.ek.honeypoint.models.Review;

public interface ReviewService {
  Review selectReview(int revNo);
  int insertReview(Review review);
  int updateReview(Review review);
  int deleteReview(int revNo);
  ArrayList<Review> getReviewsByRestaurant(int restaurantId);
  ArrayList<Review> getReviewsByMember(int memberId);
  int selectReviewCount(int restaurantId);
}
