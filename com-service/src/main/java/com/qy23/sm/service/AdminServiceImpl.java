package com.qy23.sm.service;

import com.qy23.sm.entity.Admin;
import com.qy23.sm.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName AdminServiceImpl
 * @Author 刘伟
 * @Date 2020/10/16 20:36
 * @Description
 * @Version 1.0
 **/
@Service
@Transactional
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public List<Admin> findAll() {
        return adminMapper.findAll();
    }
}
