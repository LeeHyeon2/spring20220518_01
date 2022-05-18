package com.its.people.Repository;

import com.its.people.DTO.PeopleDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PeopleRepository {
    @Autowired
    private SqlSessionTemplate sql;

    public void save(String name, int age) {
        System.out.println("PeopleRepository.save");
        System.out.println("name = " + name + ", age = " + age);
        PeopleDTO peopleDTO = new PeopleDTO();
        peopleDTO.setName(name);
        peopleDTO.setAge(age);

        sql.insert("People.save",peopleDTO);
    }

    public void save1(PeopleDTO peopleDTO) {
        sql.insert("People.save",peopleDTO);
    }
}
