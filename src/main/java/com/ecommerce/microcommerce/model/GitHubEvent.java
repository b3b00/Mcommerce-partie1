package com.ecommerce.microcommerce.model;

import org.hibernate.validator.constraints.Length;

import java.util.Date;

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