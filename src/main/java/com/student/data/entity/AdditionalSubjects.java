package com.student.data.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table( name = "additionalsubjects")
public class AdditionalSubjects {

    @Column(name="addsubjectname")
    String addSubjectName;
    @Id
    @Column (name="addsubjectid")
    Integer addSubjectId;
    @Column (name="streamid")
    Integer streamId;

    public AdditionalSubjects() {
    }

    public AdditionalSubjects(String addSubjectName, Integer addSubjectId, Integer streamId) {
        this.addSubjectName = addSubjectName;
        this.addSubjectId = addSubjectId;
        this.streamId = streamId;
    }

    public String getAddSubjectName() {
        return addSubjectName;
    }

    public void setAddSubjectName(String addSubjectName) {
        this.addSubjectName = addSubjectName;
    }

    public Integer getAddSubjectId() {
        return addSubjectId;
    }

    public void setAddSubjectId(Integer addSubjectId) {
        this.addSubjectId = addSubjectId;
    }

    public Integer getStreamId() {
        return streamId;
    }

    public void setStreamId(Integer streamId) {
        this.streamId = streamId;
    }
}
