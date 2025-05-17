package com.mir.mirathinventory.controller;

import com.mir.mirathinventory.dto.ItemMaster.ItemMasterDto;
import com.mir.mirathinventory.services.ItemMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("item-master")
public class ItemMasterController {

    @Autowired
    private ItemMasterService itemMasterService;

    @RequestMapping( path = "/add", method = RequestMethod.POST)
    public ResponseEntity<?> saveItem(@RequestBody ItemMasterDto itemMasterDto)throws Exception{
        itemMasterService.add(itemMasterDto);
        return null;
    }
}
