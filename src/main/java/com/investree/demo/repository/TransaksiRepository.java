package com.investree.demo.repository;

import com.investree.demo.model.Transaksi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransaksiRepository extends JpaRepository<Transaksi, Long>{
    @Query(value = "SELECT * FROM transaksi", nativeQuery = true)
    Page<Transaksi> findAll(Pageable pageable);
}