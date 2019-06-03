package com.cskaoyan.springbootdubbo.mapper;

import com.cskaoyan.springbootdubbo.bean.CinemaData;

import java.util.List;

public interface CinemaMapper {
    List<CinemaData> selectCinemaData();
}
