package com.example.app8.dao;

import java.util.List;

import com.example.app8.dto.PurchaseDto;
import com.example.app8.model.Purchase;

public interface PurchaseDao {
    List<Purchase> get(int page, int size, PurchaseDto purchaseDto);
    void update(Purchase purchase);
    Purchase getById(Long id);
    void pin(Long id);
}
