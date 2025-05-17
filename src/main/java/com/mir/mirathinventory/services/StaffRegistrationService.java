package com.mir.mirathinventory.services;

import com.mir.mirathinventory.dto.StockDto;
import com.mir.mirathinventory.dto.staff.StaffDto;
import org.springframework.stereotype.Service;

@Service
public interface StaffRegistrationService {

    public void add(StaffDto staffDto) throws Exception;
    public void update(StaffDto staffDto) throws Exception;
    public void delete(StaffDto staffDto);
}
