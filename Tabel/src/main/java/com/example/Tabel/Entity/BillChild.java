package com.example.Tabel.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class BillChild {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private Long billId;
    private String category;
    private String subCategory;
    private String origin;
    private String manufacturer;
    private String hsnCode;
    private String store;
    private String name;

    @ManyToOne
    @JoinColumn(name = "billId", insertable = false, updatable = false)
    private BillParent billParent;

}