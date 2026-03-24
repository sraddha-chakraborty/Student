package com.student.data.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table( name = "streams")
public class Streams {

    @Column(name="streamname")
    String streamName;
    @Id
    @Column (name="streamid")
    Integer streamId;

    public Streams() {
    }

    public Streams(String streamName, Integer streamId) {
        this.streamName = streamName;
        this.streamId = streamId;
    }

    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    public Integer getStreamId() {
        return streamId;
    }

    public void setStreamId(Integer streamId) {
        this.streamId = streamId;
    }
}
