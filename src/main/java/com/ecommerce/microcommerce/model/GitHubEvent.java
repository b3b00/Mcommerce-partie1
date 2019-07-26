package com.ecommerce.microcommerce.model;

import org.hibernate.validator.constraints.Length;

import java.nio.charset.StandardCharsets;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
//@JsonFilter("monFiltreDynamique")
public class GitHubEvent {

    @Id
    @GeneratedValue
    private int id;

    @Column(length = 16000)
    private String payload;

    private Date date;

    private String eventType;

    public String getDecode() {
        try {
            String result = java.net.URLDecoder.decode(getPayload(), StandardCharsets.UTF_8.name());
            return result;
        } catch (Exception e) {
            return "decoding error";
        }
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String type) {
        this.eventType = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPayload() {
        return payload;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }
}