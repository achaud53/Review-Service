package com.review.service.controller;

import java.io.IOException;
import java.util.List;

import com.review.service.model.ReviewDetails;
import com.review.service.service.ReviewDetailsService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class ReviewDetailsController {
	private static final Logger LOGGER = LoggerFactory.getLogger(ReviewDetailsController.class);

	@Autowired
	private ReviewDetailsService reviewDetailsSerice;

	@GetMapping("reviews")
	public ResponseEntity<List<ReviewDetails>> fetchAllEvents() throws IOException {

		LOGGER.info("entering controller method fetchAllEvents");
		List<ReviewDetails> response = reviewDetailsSerice.getAllReviewdetails();
		LOGGER.info("exiting controller method fetchAllEvents");
		return ResponseEntity.ok().body(response);

	}

	@GetMapping("reviews/{id}")
	public ResponseEntity<ReviewDetails> fetchEventById(@PathVariable("id") Long id) throws IOException {

		LOGGER.info("entering controller method fetchReviewById");
		ReviewDetails response = reviewDetailsSerice.getReviewDetailById(id);

		if (response == null) {
			LOGGER.info("No records found for the given id");
			return ResponseEntity.notFound().build();
		}
		LOGGER.info("exiting controller method fetchReviewById");
		return ResponseEntity.ok().body(response);

	}

}
