package com.example.Tabel.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;



@Getter
@Setter
@Entity
public class BillParent {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long billId;
    private Date billDate;
    private String station;
    private String customer;

    @OneToMany(mappedBy = "billParent", cascade = CascadeType.ALL)
    private List<BillChild> billChildren;


}
