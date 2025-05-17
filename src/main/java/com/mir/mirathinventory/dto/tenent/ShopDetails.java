package com.mir.mirathinventory.dto.tenent;

import com.mir.mirathinventory.dto.BaseDto;
import com.mir.mirathinventory.entity.BaseEntity;
import com.mir.mirathinventory.util.Constants;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class ShopDetails {
    private int shopId;
    private String shopCode;
    private String shopName;
    private int tenentId;
    @JsonFormat(pattern = Constants.dateFormat)
    private Date createdOn;
    private Long createdBy;
    @JsonFormat(pattern = Constants.dateFormat)
    private Date updateOn;
    private Long modifiedBy;
}
