package com.example.app7.service;


import com.example.app7.dto.ChargeDto;
import com.example.app7.dto.VIIClassDto;
import com.example.app7.model.VIIClass;
import com.example.app7.model.*;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;


public interface VIIClassService {

	void add(VIIClass viiclass);

	void update(VIIClass VIIClass);

    VIIClass getById(Long id);

    List<VIIClass> get(int page, int size, VIIClassDto viiClassDto);

    void charge(ChargeDto chargeDto);

}
