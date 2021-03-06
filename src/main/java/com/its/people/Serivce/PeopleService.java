package com.its.people.Serivce;

import com.its.people.DTO.PeopleDTO;
import com.its.people.Repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeopleService {
    @Autowired
    public PeopleRepository peopleRepository;
    public void save(String name, int age) {
        System.out.println("PeopleService.save");
        System.out.println("name = " + name + ", age = " + age);

        peopleRepository.save(name,age);
    }

    public boolean save1(PeopleDTO peopleDTO) {
        int saveResult = peopleRepository.save1(peopleDTO);
        if (saveResult > 0) {
            return true;
        }else{
            return false;
        }
    }
}
