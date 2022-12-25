package com.example.mirathinventory.controller;

import com.example.mirathinventory.MirathInventoryApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

@RestController
@RequestMapping("inventory")
public class InventoryController {
    private static Logger logger = LogManager.getLogger(MirathInventoryApplication.class);

    @RequestMapping( path = "/add", method = RequestMethod.POST)
    public ResponseEntity<?> addNewInvetory(@RequestBody Object o)throws Exception{

        return null;
    }
}
