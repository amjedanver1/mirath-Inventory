package com.mir.mirathinventory.controller;

import com.mir.mirathinventory.MirathInventoryApplication;
import com.mir.mirathinventory.dto.StockDto;
import com.mir.mirathinventory.services.StockService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("item-stock")
public class StockController {

    @Autowired
    private StockService stockService;
    private static Logger logger = LogManager.getLogger(StockController.class);

    @RequestMapping( path = "/add", method = RequestMethod.POST)
    public ResponseEntity<?> saveStock(@RequestBody StockDto stockDto)throws Exception{

        return null;
    }
}
