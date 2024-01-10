package com.leadify.crm.repository;

import com.leadify.crm.entity.Stage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StageRepository extends JpaRepository<Stage, Long> {
    // You can add custom query methods here if needed
}