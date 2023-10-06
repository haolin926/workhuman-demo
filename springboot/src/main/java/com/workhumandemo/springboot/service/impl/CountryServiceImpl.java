package com.workhumandemo.springboot.service.impl;

import com.workhumandemo.springboot.entity.country;
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
    public List<country> getList(String keyword) {
        return countryMapper.getList(keyword);
    }
}
