package com.mir.mirathinventory.dto.tenent;

import lombok.Data;

import java.util.List;

@Data
public class TenentDetails {
    private int tenentId;
    private String tenentName;
    private Long createdBy;
    private List<ShopDetails> shopDetails;
}
