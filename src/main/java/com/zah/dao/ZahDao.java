package com.zah.dao;

import com.zah.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ZahDao {
    List<User> find();
}
