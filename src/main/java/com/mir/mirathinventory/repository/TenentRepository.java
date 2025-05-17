package com.mir.mirathinventory.repository;

import com.mir.mirathinventory.entity.Tenent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TenentRepository extends JpaRepository<Tenent, Integer> {

}
