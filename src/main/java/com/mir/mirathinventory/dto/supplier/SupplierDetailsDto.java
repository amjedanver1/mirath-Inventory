package com.mir.mirathinventory.dto.supplier;

import com.mir.mirathinventory.entity.BaseEntity;
import lombok.Data;
import lombok.NonNull;

import java.util.List;

@Data
public class SupplierDetailsDto extends BaseEntity {
    private int supplierId;
    @NonNull
    private String companyName;
    @NonNull
    private String supplierCode;
    private String firstName;
    private String secondName;
    private String mobileNumber1;
    private String mobileNumber2;
    private String address1;
    private String address2;
    private String address3;
    private List<SupplierAccountDetailsDto> supplierAccountDetails;
}
