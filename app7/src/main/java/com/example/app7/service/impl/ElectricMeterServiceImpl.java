
package com.example.app7.service.impl;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import com.example.app7.dao.ElectricMeterDao;
import com.example.app7.dto.ChargeDto;
import com.example.app7.model.ElectricMeter;
import com.example.app7.service.ElectricMeterService;


@Service
public class ElectricMeterServiceImpl implements ElectricMeterService {

	@Autowired
	private ElectricMeterDao electricmeterDao;

	@Override
	public void charge(ChargeDto chargeDto) {
		electricmeterDao.charge(chargeDto);
	}


}
