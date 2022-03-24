package com.ytc.app6.dao;

import java.util.List;

import com.ytc.app6.model.LuckHistory;

public interface LuckHistoryDao {
    public List<LuckHistory> get(int page, int size);
    public void delete(Long id);
    public void claim(Long pid);
}