package com.student.data.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table ( name = "studentinfo")
public class StudentInfo {

    @Column(name= "name")
    String name;
    @Id
    @Column(name= "rollno")
    Integer rollNo;
    @Column(name= "streamid")
    Integer streamId;
    @Column(name= "additionalsubjectid")
    Integer additionalSubjectId;

    public StudentInfo() {
    }

    public StudentInfo(String name, Integer rollNo, Integer streamId, Integer additionalSubjectId) {
        this.name = name;
        this.rollNo = rollNo;
        this.streamId = streamId;
        this.additionalSubjectId = additionalSubjectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public Integer getStreamId() {
        return streamId;
    }

    public void setStreamId(Integer streamId) {
        this.streamId = streamId;
    }

    public Integer getAdditionalSubjectId() {
        return additionalSubjectId;
    }

    public void setAdditionalSubjectId(Integer additionalSubjectId) {
        this.additionalSubjectId = additionalSubjectId;
    }
}
