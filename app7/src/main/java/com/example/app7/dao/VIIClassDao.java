package com.example.app7.dao;

import java.util.List;

import com.example.app7.dto.ChargeDto;
import com.example.app7.dto.VIIClassDto;
import com.example.app7.model.*;


public interface VIIClassDao {
    List<VIIClass> get(int page,int size,VIIClassDto viiClassDto);

    VIIClass getById(Long id);

    void charge(ChargeDto chargeDto);
}
