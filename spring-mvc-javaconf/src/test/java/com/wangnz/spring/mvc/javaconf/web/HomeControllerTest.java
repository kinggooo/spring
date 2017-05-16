package com.wangnz.spring.mvc.javaconf.web;

import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

@Controller
public class HomeControllerTest {
    @Test
    public void testHome() throws Exception {
        HomeController home = new HomeController();
        MockMvc mockMvc = standaloneSetup(home).build();
        mockMvc.perform(get("/homePage/test1")).andExpect(view().name("home"));
    }
}
