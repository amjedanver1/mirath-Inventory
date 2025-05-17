package com.mir.mirathinventory.controller;

import com.mir.mirathinventory.dto.tenent.ShopDetails;
import com.mir.mirathinventory.services.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("shop")
public class ShopController {

    @Autowired
    private ShopService shopService;

    @RequestMapping( path = "", method = RequestMethod.POST)
    public ResponseEntity<?> addNewShop(@RequestBody ShopDetails shopDetails)throws Exception{
        shopService.add(shopDetails);
        return null;
    }

    @RequestMapping( path = "/update", method = RequestMethod.PUT)
    public ResponseEntity<?> updateTenent(@RequestBody ShopDetails shopDetails)throws Exception{
        shopService.update(shopDetails);
        return null;
    }

    @RequestMapping( path = "/delete", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteTenent(@RequestBody ShopDetails shopDetails)throws Exception{
        shopService.delete(shopDetails);
        return null;
    }


}
