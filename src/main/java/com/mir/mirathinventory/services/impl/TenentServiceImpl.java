package com.mir.mirathinventory.services.impl;

import com.mir.mirathinventory.dto.tenent.TenentDetails;
import com.mir.mirathinventory.entity.Tenent;
import com.mir.mirathinventory.repository.TenentRepository;
import com.mir.mirathinventory.services.TenentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TenentServiceImpl implements TenentService {

    @Autowired
    private TenentRepository tenentRepository;

    @Override
    public void add(TenentDetails tenentDetails) throws Exception{
        Tenent tenent = new Tenent();
        BeanUtils.copyProperties(tenentDetails, tenent);
        try {
            tenentRepository.saveAndFlush(tenent);
        }catch (Exception e){
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public void update(TenentDetails tenentDetails) throws Exception {
        if(tenentDetails.getTenentId() == 0){
            throw new Exception("Unable to update tenent");
        }
        Tenent tenent = new Tenent();
        BeanUtils.copyProperties(tenentDetails, tenent);
        try {
            tenentRepository.saveAndFlush(tenent);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void delete(TenentDetails tenentDetails) {

    }
}
