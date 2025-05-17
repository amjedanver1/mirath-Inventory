package com.mir.mirathinventory.dto.ItemMaster;

import com.mir.mirathinventory.dto.BaseDto;
import lombok.Data;

import java.util.List;

@Data
public class ItemMasterDto extends BaseDto {

    private int itemId;
    private String itemDescription;
    private String itemCode;
    private String itemColour;
    private int supplierId;
    private List<ItemDimentionDto> itemDimensions;
}
