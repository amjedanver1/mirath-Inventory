package com.example.mirathinventory.dto.staff;

import com.example.mirathinventory.dto.BaseDto;
import lombok.Data;
import java.util.Date;

@Data
public class StaffDto extends BaseDto {
    private int id;
    private String staffCode;
    private String staffFirstName;
    private String staffSecondName;
    private String staffThirdName;
    private String staffFourthName;
    private String mobileNumber;
    private String mobileNumber2;
    private String mobileNumber3;
    private String staffType;
    private String email;
    private String userName;
    private Date startDate;
    private Date endDate;
}
