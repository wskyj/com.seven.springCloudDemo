package com.seven.controller;

import com.seven.model.SysUserInfoDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by keyj on 2019/3/1.
 */
@RestController
@RequestMapping(value = "/test")
public class TestConnController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping(value = "/getAllUserInfo")
    public List<SysUserInfoDO> getAllUserInfo(){
        Long start=System.currentTimeMillis();
        return restTemplate.getForObject("http://simple-provider-user/test/getAllUserInfo",List.class);
//        return  restTemplate.getForObject("http://simple-provider-user/test/getAllUserInfo",SysUserInfoDO.class);
    }

    @GetMapping("/providerInstance")
    public ServiceInstance providerInstance(){
        ServiceInstance serviceInstance=this.loadBalancerClient.choose("simple-provider-user");
        return serviceInstance;
    }

}
