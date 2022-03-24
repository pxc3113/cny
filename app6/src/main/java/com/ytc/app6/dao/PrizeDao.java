package com.ytc.app6.dao;

import java.util.List;

import com.ytc.app6.form.PrizeSearchForm;
import com.ytc.app6.model.Prize;

import org.apache.ibatis.annotations.Param;

public interface PrizeDao {
    public List<Prize> get(int page, int size,@Param("prizeSearchForm") PrizeSearchForm prizeSearchForm);
    public void claim(Long pid);
}
