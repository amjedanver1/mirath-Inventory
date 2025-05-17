package com.mir.mirathinventory.entity;

import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "mi_item_master")
@Audited
@Data
public class ItemMaster extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MIR_ITM_SEQ")
    @SequenceGenerator(sequenceName = "MIR_ITM_SEQ", allocationSize = 1, name = "MIR_ITM_SEQ")
    private int itemId;
    private String itemDescription;
    private String itemCode;
    private String itemColour;
    private int supplierId;
    @OneToMany(mappedBy = "itemMaster", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    @Fetch(value = FetchMode.SELECT)
    private List<ItemDimention> itemDimentions;
}
