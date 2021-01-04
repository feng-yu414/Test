package com.fy.mall.service;

import com.fy.mall.entity.Admin;

public interface AdminService {

    public Admin login(String adminName,String adminPassword);

    public Admin get(String adminName,Integer adminId);

    public Admin set(String adminName,Integer adminId);
}
