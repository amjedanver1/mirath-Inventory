package com.mir.mirathinventory.repository;

import com.mir.mirathinventory.entity.SupplierRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<SupplierRegistration, Integer> {
}
