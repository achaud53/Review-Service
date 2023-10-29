package com.review.service.service;

import java.util.List;

import com.review.service.model.ReviewDetails;
import com.review.service.repository.ReviewDetailsRepo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewDetailsService {

	private static final Logger LOGGER = LoggerFactory.getLogger(ReviewDetailsService.class);

	@Autowired
	private ReviewDetailsRepo reviewDetailsRepo;


	public List<ReviewDetails> getAllReviewdetails() {
		LOGGER.info("entering service method getAllReviewdetails");
		return reviewDetailsRepo.findAll();
	}

	
	public ReviewDetails getReviewDetailById(Long id) {
		LOGGER.info("entering service method getReviewDetailById");
		return reviewDetailsRepo.findById(id).orElse(null);
	}
	
}
