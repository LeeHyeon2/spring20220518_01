package com.its.people.Controller;

import com.its.people.DTO.PeopleDTO;
import com.its.people.Serivce.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PeopleController {
    @Autowired
    public PeopleService peopleService;

    @GetMapping("/save-form")
    public String saveForm() {
        return "save-form";
    }

    @PostMapping("/save")
    public String save(@RequestParam("name") String name,
                       @RequestParam("age") int age){
        System.out.println("peopleController.save");
        System.out.println("name = " + name + ", age = " + age);
        peopleService.save(name,age);
        return null;
    }

    @PostMapping("/save1")
    public String save1(@RequestParam("name") String name,
                       @RequestParam("age") int age){
        System.out.println("peopleController.save");
        System.out.println("name = " + name + ", age = " + age);
        PeopleDTO peopleDTO = new PeopleDTO();
        peopleDTO.setName(name);
        peopleDTO.setAge(age);
        peopleService.save1(peopleDTO);
        return null;
    }

    @PostMapping("/save2")
    public String save2(@ModelAttribute PeopleDTO peopleDTO){
//        System.out.println("name = " + name + ", age = " + age);
//        PeopleDTO peopleDTO = new PeopleDTO();
//        peopleDTO.setName(name);
//        peopleDTO.setAge(age);
        System.out.println("peopleDTO = " + peopleDTO);
        peopleService.save1(peopleDTO);
        return null;
    }
}
