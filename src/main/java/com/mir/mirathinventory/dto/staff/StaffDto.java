package com.mir.mirathinventory.dto.staff;

import com.mir.mirathinventory.dto.BaseDto;
import lombok.Data;
import java.util.Date;
import java.util.List;

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
    private String identityNumber;
    private String staffType;
    private String email;
    private String userName;
    private Date startDate;
    private Date endDate;
    private List<StaffAssignedShop> staffAssignedShops;
}
