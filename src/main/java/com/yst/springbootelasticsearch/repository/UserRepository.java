package com.yst.springbootelasticsearch.repository;

import com.yst.springbootelasticsearch.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {


}
