package com.upgrad.bookmyconsultation.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

//Mark it with Data, Entity, Builder, NoArgsConstructor, AllArgsConstructor
@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User { //create a class named User
    //all the mentioned members must be private
    @Id
    private String emailId; //create primary key 'emailId' of type String
    private String firstName; //create firstName of type String
    private String lastName; //create lastName of type String
    private String dob; //create dob of type String
    private String mobile; //create mobile of type String
    private String password; //create password of type String
    private String createdDate; //create createdDate of type String
    private String salt; //create salt of type String
}