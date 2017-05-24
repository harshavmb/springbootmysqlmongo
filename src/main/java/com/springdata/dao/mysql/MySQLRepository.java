package com.springdata.dao.mysql;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springdata.models.Users;

@Transactional
public interface MySQLRepository extends JpaRepository<Users, String>{

}

