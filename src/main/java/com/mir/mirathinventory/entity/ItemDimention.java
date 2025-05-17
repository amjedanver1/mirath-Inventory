package com.mir.mirathinventory.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "mi_item_dimention")
@Audited
@Data
public class ItemDimention implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MIR_ITM_SEQ")
    @SequenceGenerator(sequenceName = "MIR_ITM_SEQ", allocationSize = 1, name = "MIR_ITM_SEQ")
    private Integer dimensionId;
    private String dimension;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="item_Id", nullable=false)
    private ItemMaster itemMaster;

}
