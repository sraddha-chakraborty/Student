package com.student.data.repo;

import com.student.data.entity.MainSubjects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MainSubjectsRepo extends JpaRepository<MainSubjects, Integer> {
    @Query("SELECT m.subjectName FROM MainSubjects m WHERE m.streamId = :streamId")
    List<String> findSubjectNameByStreamId(Integer streamId);
}
