package com.example.Tabel.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BillDetailsDTO {
    private Long serialNumber;
    private Long billId;
    private Date billDate;
    private String station;
    private String customer;
    private String category;
    private String subCategory;
    private String origin;
    private String manufacturer;
    private String hsnCode;
    private String store;
    private String name;


}