package com.yst.springbootelasticsearch.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {

    boolean insertA(Audit audit);
}
