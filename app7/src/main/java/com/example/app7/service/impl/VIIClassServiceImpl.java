
package com.example.app7.service.impl;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import com.example.app7.dao.VIIClassDao;
import com.example.app7.dto.ChargeDto;
import com.example.app7.dto.VIIClassDto;
import com.example.app7.model.VIIClass;
import com.example.app7.service.VIIClassService;


@Service
public class VIIClassServiceImpl implements VIIClassService {

	@Autowired
	private VIIClassDao viiClassDao;



	@Override
	public List<VIIClass> get(int page, int size, VIIClassDto viiClassDto) {

		return viiClassDao.get(page,size,viiClassDto);
	}

	@Override
	public void add(VIIClass viiclass) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(VIIClass VIIClass) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public VIIClass getById(Long id) {
		return viiClassDao.getById(id);
	}

	@Override
	public void charge(ChargeDto chargeDto) {
		viiClassDao.charge(chargeDto);
	}
}
