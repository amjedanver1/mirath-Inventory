package com.mir.mirathinventory.entity;

import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.envers.Audited;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="mi_supplier_registration")
@Data
@Audited
public class SupplierRegistration extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MIR_SUP_SEQ")
    @SequenceGenerator(sequenceName = "MIR_SUP_SEQ", allocationSize = 1, name = "MIR_SUP_SEQ")
    private int supplierId;
    @Column(unique = true, nullable = false)
    private String companyName;
    @Column(unique = true, nullable = false)
    private String supplierCode;
    private String firstName;
    private String secondName;
    private String mobileNumber1;
    private String mobileNumber2;
    private String address1;
    private String address2;
    private String address3;
    @OneToMany(mappedBy = "supplierRegistration", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @Fetch(value = FetchMode.SELECT)
    private List<SupplierAccountDetails> supplierAccountDetails;
}
