package com.wangnz.spring.servlet3.web;

import com.wangnz.spring.servlet3.entity.Spittle;
import com.wangnz.spring.servlet3.service.SpittleService;
import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

@Controller
public class SpittleControllerTest {
//    @Test
//    public void testSpittles() throws Exception {
//        List<Spittle> spittles = createSpittleList(20);
//        SpittleService mockService = mock(SpittleService.class);
//
//    }
//
//    private List<Spittle> createSpittleList(int count) {
//        List<Spittle> spittles = new ArrayList<Spittle>();
//        for (int i = 0; i < count; i++) {
//            spittles.add(new Spittle());
//        }
//        return spittles;
//    }
}
