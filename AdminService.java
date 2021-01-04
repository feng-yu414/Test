package com.fy.mall.service;

import com.fy.mall.entity.Admin;

public interface AdminService {

    public Admin login(String adminName,String adminPassword);

  //222
    public Admin get(String adminName,Integer adminId);

   //333
    public Admin set(String adminName,Integer adminId);
}
