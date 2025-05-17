package com.mir.mirathinventory.controller;

import com.mir.mirathinventory.dto.staff.StaffDto;
import com.mir.mirathinventory.services.StaffRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("staff-registration")
public class StaffController {
    @Autowired
    private StaffRegistrationService staffRegistrationService;

    @RequestMapping( path = "/add", method = RequestMethod.POST)
    public ResponseEntity<?> saveItem(@RequestBody StaffDto staffDto)throws Exception{
        staffRegistrationService.add(staffDto);
        return null;
    }
}
