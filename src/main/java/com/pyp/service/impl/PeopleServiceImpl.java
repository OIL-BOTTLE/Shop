package com.pyp.service.impl;

import com.pyp.dao.PeopleMapper;
import com.pyp.pojo.people;
import com.pyp.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class PeopleServiceImpl implements PeopleService {
    @Autowired
    private PeopleMapper peopleMapper;

    public void setPeopleMapper(PeopleMapper peopleMapper) {
        this.peopleMapper = peopleMapper;
    }

    public int addPeople(people people) {
        return peopleMapper.addPeople(people);
    }

    public int deletePeopleById(int id) {
        return peopleMapper.deletePeopleById(id);
    }

    public int updatePeople(people people) {
        return peopleMapper.updatePeople(people);
    }

    public people queryPeopleById(int id) {
        return peopleMapper.queryPeopleById(id);
    }

    public List<people> queryAllPeople() {
        return peopleMapper.queryAllPeople();
    }
}
