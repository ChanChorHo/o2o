package com.o2o.service;

import com.o2o.BaseTest;
import com.o2o.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class AreaServiceTest extends BaseTest {

    @Autowired(required = false)
    private AreaService areaService;

    @Test
    public void check() {
        List<Area> areaList = areaService.getAreaList();
        assertEquals("广西", areaList.get(0).getAreaName());

        for (int i = 0; i < areaList.size(); i++) {
            System.out.print(areaList.get(i).getAreaName() + "  ");
        }

    }



}
