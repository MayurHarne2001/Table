package com.example.Tabel.Repository;

import com.example.Tabel.Entity.BillChild;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BillChildRepository extends JpaRepository <BillChild,Long>{
    List<BillChild> findByBillId(Long billId);
}
