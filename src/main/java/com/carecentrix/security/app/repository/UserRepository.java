package com.carecentrix.security.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.carecentrix.security.app.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>
{

    User findByLogin(String login);
}
