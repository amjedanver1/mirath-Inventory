package com.example.mirathinventory.dto.supplier;

import lombok.Data;

@Data
public class SupplierAccountDetails {
    private int id;
    private String accountNumber;
    private String accountName;
    private String bankName;
    private String branch;
}
