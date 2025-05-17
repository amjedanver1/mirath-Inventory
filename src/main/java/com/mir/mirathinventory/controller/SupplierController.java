package com.mir.mirathinventory.controller;

import com.mir.mirathinventory.dto.supplier.SupplierDetailsDto;
import com.mir.mirathinventory.services.SupplierService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("supplier")
public class SupplierController {
    private static Logger logger = LogManager.getLogger(SupplierController.class);

    @Autowired
    private SupplierService supplierService;

    @RequestMapping( path = "/add", method = RequestMethod.POST)
    public ResponseEntity<?> saveSupplier(@RequestBody SupplierDetailsDto supplierDetails)throws Exception{
        supplierService.add(supplierDetails);
        return null;
    }
}
