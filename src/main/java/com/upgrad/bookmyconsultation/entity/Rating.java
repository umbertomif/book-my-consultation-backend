package com.upgrad.bookmyconsultation.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity //mark this class as an 'entity class'
@Data //Use Data annotation to generate boilerplate code
@NoArgsConstructor //Use NoArgsConstructor annotation
public class Rating { //create a class name Rating
    //Set access modifiers for all these members to 'private'
    @Id //create a primary key called 'id' of type String
    private String id = UUID.randomUUID().toString(); //initialise id with a UUID using UUID.randomUUID
    private String appointmentId; //create appointmentId of type String
    private String doctorId; //create doctorId of type String
    private Integer rating; //create rating of type Integer
    private String comments; //create comments of type String
}