package com.example.mirathinventory.services;

import com.example.mirathinventory.dto.tenent.TenentDetails;

public interface TenentService {
    public void add(TenentDetails tenentDetails);
    public void update(TenentDetails tenentDetails);
    public void delete(TenentDetails tenentDetails);
}
