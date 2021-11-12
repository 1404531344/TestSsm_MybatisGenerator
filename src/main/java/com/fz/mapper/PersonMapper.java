package com.fz.mapper;

import com.fz.entity.Person;

import java.util.List;

public interface PersonMapper {

    List<Person> selectByAll();

    int deleteByPrimaryKey(Integer pid);

    int insert(Person record);

    int insertSelective(Person record);

    Person selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);
}