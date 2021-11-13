package com.fz.controllers;

import com.fz.entity.Person;
import com.fz.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PersonController implements PersonMapper {

private final PersonMapper personMapper;

    public PersonController(PersonMapper personMapper) {
        this.personMapper = personMapper;
    }

    @ResponseBody
  @RequestMapping("test")
public String String(){
    System.out.println("test进来了");
    return "test";
}

  
  
    @Override
    @ResponseBody
    @RequestMapping("selectByAll")
    public List<Person> selectByAll() {
        return personMapper.selectByAll();
    }

    @Override
    public int deleteByPrimaryKey(Integer pid) {
        return 0;
    }

    @Override
    public int insert(Person record) {
        return 0;
    }

    @Override
    public int insertSelective(Person record) {
        return 0;
    }

    @Override
    public Person selectByPrimaryKey(Integer pid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Person record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Person record) {
        return 0;
    }
}
