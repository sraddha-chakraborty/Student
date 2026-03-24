package com.student.data.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table( name = "mainsubjects")
public class MainSubjects {

    @Column (name="subjectname")
    String subjectName;
    @Id
    @Column (name="subjectid")
    Integer subjectId;
    @Column (name="streamid")
    Integer streamId;

    public MainSubjects() {
    }

    public MainSubjects(String subjectName, Integer subjectId, Integer streamId) {
        this.subjectName = subjectName;
        this.subjectId = subjectId;
        this.streamId = streamId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getStreamId() {
        return streamId;
    }

    public void setStreamId(Integer streamId) {
        this.streamId = streamId;
    }
}
