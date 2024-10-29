package com.example.Tabel.Controller;


import com.example.Tabel.Dto.BillDetailsDTO;
import com.example.Tabel.Service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/bills")
public class BillController {

    @Autowired
    private BillService billService;

    @GetMapping("/details")
    public ResponseEntity<List<BillDetailsDTO>> getBillDetails() {
        List<BillDetailsDTO> billDetails = billService.getBillDetails();
        return ResponseEntity.ok(billDetails);
    }
}