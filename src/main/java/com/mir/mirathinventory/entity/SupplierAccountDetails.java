package com.mir.mirathinventory.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "mi_supplier_account_details")
@Audited
public class SupplierAccountDetails implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MIR_SUP_ACC_SEQ")
    @SequenceGenerator(name="MIR_SUP_ACC_SEQ", sequenceName="MIR_SUP_ACC_SEQ", allocationSize=1)
    private int id;
    private String accountNumber;
    private String accountName;
    private String bankName;
    private String branch;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="supplier_id", nullable=false)
    private SupplierRegistration supplierRegistration;
}
