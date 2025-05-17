package com.mir.mirathinventory.entity;

import com.mir.mirathinventory.util.Constants;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.envers.Audited;

@Entity
@Getter
@Setter
@Table(name="mi_tenent")
@Audited
public class Tenent implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MIR_TEN_SEQ")
    @SequenceGenerator(sequenceName = "MIR_TEN_SEQ", allocationSize = 1, name = "MIR_TEN_SEQ")
    private int tenentId;
    private String tenentName;
    @Column(updatable = false)
    private Long createdBy;
    @Column(updatable = false)
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = Constants.dateFormat)
    private Date createdDate;
    private Long modifiedBy;
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = Constants.dateFormat)
    private Date modifiedDate;
}
