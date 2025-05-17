package com.mir.mirathinventory.dto;

import com.mir.mirathinventory.util.Constants;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class BaseDto {
    private int tenentId;
    private int shopId;
    private Long createdBy;
    @JsonFormat(pattern = Constants.dateFormat)
    private Date createdOn;
    private Long modifiedBy;
    @JsonFormat(pattern = Constants.dateFormat)
    private Date updateOn;
    private Boolean isDeleted = false;
    private Boolean isActive = true;
}
