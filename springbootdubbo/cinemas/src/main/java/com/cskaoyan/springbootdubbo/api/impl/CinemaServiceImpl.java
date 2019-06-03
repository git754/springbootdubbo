package com.cskaoyan.springbootdubbo.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cskaoyan.springbootdubbo.api.CinemaService;
import com.cskaoyan.springbootdubbo.bean.CinemaData;
import com.cskaoyan.springbootdubbo.mapper.CinemaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Service(interfaceClass = CinemaService.class)
@Component
public class CinemaServiceImpl implements CinemaService {

    @Autowired
    CinemaMapper cinemaMapper;

    @Override
    public List<CinemaData> getCinemas() {
        List<CinemaData> cinemaDataList = cinemaMapper.selectCinemaData();
        return cinemaDataList;
    }
}
