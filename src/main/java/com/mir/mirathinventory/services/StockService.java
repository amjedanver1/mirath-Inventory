package com.mir.mirathinventory.services;

import com.mir.mirathinventory.dto.StockDto;
import org.springframework.stereotype.Service;

@Service
public interface StockService {
    public void add(StockDto stockDto) throws Exception;
    public void update(StockDto stockDto) throws Exception;
    public void delete(StockDto stockDto);

}
