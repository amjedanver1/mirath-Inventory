package com.example.mirathinventory.dto;

import lombok.Data;

import java.util.Date;
@Data
public class BaseDto {
    private int tenentId;
    private int shopId;
    private Date createdOn;
    private Date updateOn;
    private int createdBy;
    private int modifiedBy;
}
