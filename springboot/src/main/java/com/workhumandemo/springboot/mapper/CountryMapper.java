package com.workhumandemo.springboot.mapper;

import com.workhumandemo.springboot.entity.country;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CountryMapper {

    @Select("select name from country where name LIKE concat('%',#{keyword},'%')")
    List<country> getList(String keyword);
}
