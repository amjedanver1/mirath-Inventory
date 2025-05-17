package com.mir.mirathinventory.dto;

import lombok.Data;

@Data
public class ItemPriceDto extends BaseDto{
    private int itemId;
    private double price;
    private int batchId;
    private String itemName;
    private float costOfUnit;
    private float unitSellingPrice;
}
