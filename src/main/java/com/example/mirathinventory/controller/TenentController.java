package com.example.mirathinventory.controller;

import com.example.mirathinventory.MirathInventoryApplication;
import com.example.mirathinventory.dto.tenent.TenentDetails;
import com.example.mirathinventory.services.TenentService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tenent")
public class TenentController {
    private static Logger logger = LogManager.getLogger(MirathInventoryApplication.class);

    @Autowired
    private TenentService tenentService;

    @RequestMapping( path = "", method = RequestMethod.POST)
    public ResponseEntity<?> addNewTenent(@RequestBody TenentDetails tenentDetails)throws Exception{
        tenentService.add(tenentDetails);
        return null;
    }

    @RequestMapping( path = "/update", method = RequestMethod.PUT)
    public ResponseEntity<?> updateTenent(@RequestBody TenentDetails tenentDetails)throws Exception{
        tenentService.update(tenentDetails);
        return null;
    }

    @RequestMapping( path = "/delete", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteTenent(@RequestBody TenentDetails tenentDetails)throws Exception{
        tenentService.delete(tenentDetails);
        return null;
    }
}
