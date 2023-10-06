package com.workhumandemo.springboot.service.impl;

import com.workhumandemo.springboot.mapper.CountryMapper;
import com.workhumandemo.springboot.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryMapper countryMapper;

    @Override
    public List<String> getList(String keyword) {

        //don't execute sql query if a empty string is passed
        if(keyword.isEmpty())
        {
            return null;
        }

        else
        {
            return countryMapper.getList(keyword);
        }
    }
}
