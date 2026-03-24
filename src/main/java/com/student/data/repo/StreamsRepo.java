package com.student.data.repo;

import com.student.data.entity.Streams;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StreamsRepo extends JpaRepository<Streams, Integer> {
}
