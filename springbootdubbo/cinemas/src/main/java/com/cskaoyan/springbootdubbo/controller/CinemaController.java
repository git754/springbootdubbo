package com.cskaoyan.springbootdubbo.controller;

import com.cskaoyan.springbootdubbo.api.CinemaService;
import com.cskaoyan.springbootdubbo.bean.Cinema;
import com.cskaoyan.springbootdubbo.bean.CinemaData;
import com.cskaoyan.springbootdubbo.bean.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("cinema")
public class CinemaController {

    @Autowired
    CinemaService cinemaService;

    @RequestMapping("getCinemas")
    @ResponseBody
    public ResponseVO getCinemas(){
        List<CinemaData> cinemaList = cinemaService.getCinemas();
        /*if (cinemaList.isEmpty()||cinemaList==null){
        }*/
        ResponseVO<Object> responseVO = new ResponseVO<>();
        responseVO.setData(cinemaList);
        responseVO.setStatus(0);
        return responseVO;
    }
}
