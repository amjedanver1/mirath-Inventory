package com.mir.mirathinventory.dto;

import lombok.Data;

import java.util.List;

@Data
public class StockDto extends BaseDto{

    private int stockId;
    private int itemId;
    private int itemCode;
    private Integer dimensionId;
    private String dimension;
    private int quantity;
    private int batchId;
    private ItemPriceDto itemPriceDto;
    private List<StockLocationDto> stockLocationDto;
}
