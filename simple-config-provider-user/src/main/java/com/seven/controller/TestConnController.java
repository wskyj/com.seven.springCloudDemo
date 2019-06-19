package com.seven.controller;

import com.seven.dao.SysUserInfoDOMapper;
import com.seven.model.SysUserInfoDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by keyj on 2019/3/1.
 */
@RestController
@RequestMapping(value = "/test")
public class TestConnController {

    @Autowired
    private SysUserInfoDOMapper sysUserInfoDOMapper;

    @RequestMapping(value = "/getAllUserInfo")
    public List<SysUserInfoDO> getAllUserInfo(){
        Long start=System.currentTimeMillis();
        List<SysUserInfoDO> list=sysUserInfoDOMapper.selectAll();
        return  list;
    }

}
