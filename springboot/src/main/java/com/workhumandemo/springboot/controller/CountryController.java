package com.workhumandemo.springboot.controller;


import com.workhumandemo.springboot.common.Result;
import com.workhumandemo.springboot.entity.country;
import com.workhumandemo.springboot.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/country")
public class CountryController {

    @Autowired
    private CountryService countryService;

    //if we request localhost:9090/country by POST method
    //this method will get executed
    @GetMapping
    public Result getList(String keyword)
    {
        List<country> countries = countryService.getList(keyword);

        return Result.success(countries);
    }

}
