package com.example.app8.service;

import java.util.List;

import com.example.app8.dto.PurchaseDto;
import com.example.app8.model.Purchase;

import org.apache.ibatis.annotations.Param;

public interface PurchaseService {
    
    List<Purchase> get(@Param("page") int page, @Param("size") int size, PurchaseDto purchaseDto);

    void update(Purchase purchase);

    Purchase getById(Long id);

    void pin(Long id);
}
