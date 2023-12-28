package com.leadify.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leadify.crm.entity.Interested;

@Repository
public interface InterestedRepository extends JpaRepository<Interested, Long> {
    // Your custom queries, if any
}