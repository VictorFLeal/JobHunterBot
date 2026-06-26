package com.victordev.jobhunterbot.repository;

import com.victordev.jobhunterbot.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JobRepository extends JpaRepository<Job, UUID> {
}
