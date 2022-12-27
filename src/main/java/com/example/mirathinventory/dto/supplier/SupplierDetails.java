package com.example.mirathinventory.dto.supplier;

import com.example.mirathinventory.dto.BaseDto;
import lombok.Data;

@Data
public class SupplierDetails extends BaseDto {
    private int id;
    private String companyName;
    private String firstName;
    private String secondName;
    private String mobileNumber1;
    private String mobileNumber2;
    private String address1;
    private String address2;
    private String address3;
    private SupplierAccountDetails supplierAccountDetails;
}
