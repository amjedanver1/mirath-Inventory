package com.mir.mirathinventory.services;

import com.mir.mirathinventory.dto.ItemMaster.ItemMasterDto;
import com.mir.mirathinventory.dto.supplier.SupplierDetailsDto;
import org.springframework.stereotype.Service;

@Service
public interface ItemMasterService {
    public void add(ItemMasterDto itemMasterDto) throws Exception;
    public void update(ItemMasterDto itemMasterDto) throws Exception;
    public void delete(ItemMasterDto itemMasterDto);

}
