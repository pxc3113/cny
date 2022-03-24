package com.example.app8.service.impl;

import java.util.List;

import com.example.app8.dao.PurchaseDao;
import com.example.app8.dto.PurchaseDto;
import com.example.app8.model.Purchase;
import com.example.app8.service.PurchaseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchaseServiceImpl implements PurchaseService {

    @Autowired
    private PurchaseDao purchaseDao;

    @Override
    public List<Purchase> get(int page, int size, PurchaseDto purchaseDto) {
        return purchaseDao.get(size*(page-1), size, purchaseDto);
    }
    
    public void update(Purchase purchase){
        purchaseDao.update(purchase);
    }

    @Override
    public Purchase getById(Long id) {
        return purchaseDao.getById(id);
    }

    @Override
    public void pin(Long id) {
        purchaseDao.pin(id);
    }
}
