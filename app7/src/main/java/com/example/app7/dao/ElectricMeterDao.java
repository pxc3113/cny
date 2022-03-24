package com.example.app7.dao;

import javax.transaction.Transactional;

import com.example.app7.model.ElectricMeter;
import com.example.app7.dto.ChargeDto;
import com.example.app7.model.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
@Transactional
public interface ElectricMeterDao{
    void charge(ChargeDto chargeDto);
}
