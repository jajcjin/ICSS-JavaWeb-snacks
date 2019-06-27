package com.kitiyou.snacks.service;

import com.kitiyou.snacks.dao.HelloDao;
import com.kitiyou.snacks.entity.FirstCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private HelloDao helloDAO;

    @Override
    public List<FirstCategory> hello() {
        return helloDAO.listAll();
    }

}
