package com.example.Tabel.Service;

import com.example.Tabel.Dto.BillDetailsDTO;
import com.example.Tabel.Entity.BillChild;
import com.example.Tabel.Entity.BillParent;
import com.example.Tabel.Repository.BillChildRepository;
import com.example.Tabel.Repository.BillParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BillService {

    @Autowired
    private BillParentRepository billParentRepository;

    @Autowired
    private BillChildRepository billChildRepository;

    public List<BillDetailsDTO> getBillDetails() {
        List<BillDetailsDTO> billDetailsList = new ArrayList<>();
        List<BillParent> billParents = billParentRepository.findAll();

        long serialNumber = 1;
        for (BillParent billParent : billParents) {
            List<BillChild> billChildren = billChildRepository.findByBillId(billParent.getBillId());

            for (BillChild billChild : billChildren) {
                BillDetailsDTO dto = new BillDetailsDTO(
                        serialNumber++, // Serial Number
                        billParent.getBillId(),
                        billParent.getBillDate(),
                        billParent.getStation(),
                        billParent.getCustomer(),
                        billChild.getCategory(),
                        billChild.getSubCategory(),
                        billChild.getOrigin(),
                        billChild.getManufacturer(),
                        billChild.getHsnCode(),
                        billChild.getStore(),
                        billChild.getName()
                );
                billDetailsList.add(dto);
            }
        }
        return billDetailsList;
    }
}