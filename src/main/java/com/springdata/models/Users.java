package com.springdata.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Entity
@Table(name = "users")
@Document(collection="users")
@Data
public class Users {

    @org.springframework.data.annotation.Id
    @Id
    private String id;
    private String name;
    private Integer age;

}