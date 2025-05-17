package com.mir.mirathinventory.entity;

import com.mir.mirathinventory.util.Constants;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;
@Data
public class BaseEntity implements Serializable {
    private int tenentId;
    private int shopId;
    @Column(updatable = false)
    private Long createdBy;
    @Column(updatable = false)
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = Constants.dateFormat)
    private Date createdOn;
    private Long modifiedBy;
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = Constants.dateFormat)
    private Date updateOn;
    private Boolean isDeleted = false;
    private Boolean isActive = true;
}
