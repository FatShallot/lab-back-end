package com.lpc.dao;

import com.lpc.entity.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuMapper {
    public List<Menu> selectMenus(List<Integer> menuIds);
}