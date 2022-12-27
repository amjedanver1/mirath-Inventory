package com.example.mirathinventory.dto.tenent;

import com.example.mirathinventory.dto.BaseDto;
import lombok.Data;

import java.util.Date;

@Data
public class ShopDetails extends BaseDto {
    private int id;
    private String shopCode;
    private String shopName;
    private int tenentId;
    private Date createdOn;
    private Date updateOn;
    private int createdBy;
    private int modifiedBy;
}
