package com.student.data.service;

import com.student.data.entity.AdditionalSubjects;
import com.student.data.entity.MainSubjects;
import com.student.data.entity.StudentInfo;
import com.student.data.repo.AdditionalSubjectsRepo;
import com.student.data.repo.MainSubjectsRepo;
import com.student.data.repo.StreamsRepo;
import com.student.data.repo.StudentInfoRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    StudentInfoRepo studentInfoRepo;
    MainSubjectsRepo mainSubjectsRepo;
    AdditionalSubjectsRepo additionalSubjectsRepo;
    StreamsRepo streamsRepo;

    public StudentService(StudentInfoRepo studentInfoRepo, MainSubjectsRepo mainSubjectsRepo, AdditionalSubjectsRepo additionalSubjectsRepo, StreamsRepo streamsRepo) {
        this.studentInfoRepo = studentInfoRepo;
        this.mainSubjectsRepo = mainSubjectsRepo;
        this.additionalSubjectsRepo = additionalSubjectsRepo;
        this.streamsRepo = streamsRepo;
    }

    public List<String> getSubjects(Integer rollNumber)
    {
        List<String> subjects = new ArrayList<String>();
        Optional<StudentInfo> studentInfo = studentInfoRepo.findById(rollNumber);

        if (studentInfo.isPresent())
        {
            StudentInfo student = studentInfo.get();
            List<String> mainSubjects = mainSubjectsRepo.findSubjectNameByStreamId(student.getStreamId());
            List<String> additionalSubjects = additionalSubjectsRepo.findSubjectNameByStreamId(student.getAdditionalSubjectId());

            subjects.addAll(mainSubjects);
            subjects.addAll(additionalSubjects);

            return subjects;
        }
        else
        {
            return null;
        }
    }

    public StudentInfo getStudentDetail(Integer rollNumber)
    {
        Optional<StudentInfo> studentInfo = studentInfoRepo.findById(rollNumber);

        if (studentInfo.isPresent())
        {
            return studentInfo.get();
        }
        else {
            return null;
        }
    }
}
