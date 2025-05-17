package com.mir.mirathinventory.services.impl;

import com.mir.mirathinventory.dto.ItemMaster.ItemMasterDto;
import com.mir.mirathinventory.dto.tenent.ShopDetails;
import com.mir.mirathinventory.entity.ItemMaster;
import com.mir.mirathinventory.repository.ItemMasterRepository;
import com.mir.mirathinventory.services.ItemMasterService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemMasterServiceImpl implements ItemMasterService {

    @Autowired
    private ItemMasterRepository itemMasterRepository;

    private static Logger logger = LogManager.getLogger(ItemMasterServiceImpl.class);

    @Override
    public void add(ItemMasterDto itemMasterDto) throws Exception {

        ItemMaster itemMaster = new ItemMaster();
        BeanUtils.copyProperties(itemMasterDto, itemMaster);
        itemMasterRepository.save(itemMaster);
    }

    @Override
    public void update(ItemMasterDto itemMasterDto) throws Exception {

    }

    @Override
    public void delete(ItemMasterDto itemMasterDto){
    }


}
