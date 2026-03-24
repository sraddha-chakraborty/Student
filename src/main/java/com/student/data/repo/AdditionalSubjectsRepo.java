package com.student.data.repo;

import com.student.data.entity.AdditionalSubjects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AdditionalSubjectsRepo extends JpaRepository<AdditionalSubjects, Integer> {
    @Query("SELECT a.addSubjectName FROM AdditionalSubjects a WHERE a.addSubjectId = :additionalSubjectId")
    List<String> findSubjectNameByStreamId(Integer additionalSubjectId);
}
