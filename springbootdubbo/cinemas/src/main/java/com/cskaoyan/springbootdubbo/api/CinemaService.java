package com.cskaoyan.springbootdubbo.api;


import com.cskaoyan.springbootdubbo.bean.CinemaData;

import java.util.List;

public interface CinemaService {
    List<CinemaData> getCinemas();
}
