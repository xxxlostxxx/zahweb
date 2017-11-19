package com.zah.service;

import com.zah.dao.ZahDao;
import com.zah.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoService {
    @Autowired
    private ZahDao zahDao;

    public List<User> find(){
        return zahDao.find();
    }

}
