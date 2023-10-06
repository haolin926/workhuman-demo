package com.workhumandemo.springboot.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CountryMapper {

    List<String> getList(String keyword);
}
