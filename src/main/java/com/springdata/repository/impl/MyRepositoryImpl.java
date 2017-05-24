package com.springdata.repository.impl;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdata.dao.mongo.MyMongoRepository;
import com.springdata.dao.mysql.MySQLRepository;

@Service
public class MyRepositoryImpl {

    @Autowired
    private MyMongoRepository myMongoRepository;

    @Autowired
    private MySQLRepository mySQLRepository;

    @PostConstruct
    public void extractUsers(){
        myMongoRepository.findAll().forEach((user) -> System.out.println("user name from mongo is : "+user.getName()));
        mySQLRepository.findAll().forEach((user) -> System.out.println("User name from mysql is : "+user.getName()));
    }

}
