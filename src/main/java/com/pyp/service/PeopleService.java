package com.pyp.service;

import com.pyp.pojo.people;

import java.util.List;

public interface PeopleService {

    int addPeople(people people);

    int deletePeopleById(int id);

    int updatePeople(people people);

    people queryPeopleById(int id);

    List<people> queryAllPeople();
}
