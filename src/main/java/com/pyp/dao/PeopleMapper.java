package com.pyp.dao;

import com.pyp.pojo.people;

import java.util.List;

public interface PeopleMapper {
    int addPeople(people people);

    int deletePeopleById(int id);

    int updatePeople(people people);

    people queryPeopleById(int id);

    List<people> queryAllPeople();
}
