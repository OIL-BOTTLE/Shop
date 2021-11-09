package com.pyp.controller;

import com.pyp.pojo.people;
import com.pyp.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/people")
public class PeopleController {
//    @Autowired
//    @Qualifier("peopleServiceImpl")
    @Autowired
    private PeopleService peopleService;

    @RequestMapping("/allPeople")
    public  String list(Model model) {
        List<people> list = peopleService.queryAllPeople();
        model.addAttribute("list",list);
        System.out.println(list);
        return "0";
    }
}
