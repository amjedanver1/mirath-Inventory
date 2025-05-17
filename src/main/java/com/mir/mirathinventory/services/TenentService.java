package com.mir.mirathinventory.services;

import com.mir.mirathinventory.dto.tenent.TenentDetails;

public interface TenentService {
    public void add(TenentDetails tenentDetails) throws Exception;
    public void update(TenentDetails tenentDetails) throws Exception;
    public void delete(TenentDetails tenentDetails);
}
