package com.workhumandemo.springboot.service;

import com.workhumandemo.springboot.entity.country;

import java.util.List;

public interface CountryService {

    List<country> getList(String keyword);
}
