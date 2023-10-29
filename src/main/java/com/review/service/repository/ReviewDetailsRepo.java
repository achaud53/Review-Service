package com.review.service.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.review.service.model.ReviewDetails;

@Repository
public interface ReviewDetailsRepo extends JpaRepository<ReviewDetails, Long> {


}
