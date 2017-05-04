package com.wangnz.spring.servlet3.web;

import com.wangnz.spring.servlet3.entity.Spittle;
import com.wangnz.spring.servlet3.service.SpittleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Long.MAX_VALUE;


@Controller
@RequestMapping("/spittles")
public class SpittleController {
    private SpittleService spittleService;
    private static final String MAX_LONG_AS_STRING = "30";
//    @Autowired
//    public SpittleController(SpittleService spittleService) {
//        this.spittleService = spittleService;
//    }

    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    public String test1(Model model) {
        model.addAttribute("spittleList", createSpittleList(20));
        return "spittles";
    }

    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    public String test2(@RequestParam(value = "max", defaultValue = MAX_LONG_AS_STRING) long max) {
        System.out.println(max);
        return "spittles";
    }

    @RequestMapping(value = "/test3/{spittleId}", method = RequestMethod.GET)
    public String test3(@PathVariable(value = "spittleId") long spittleId) {
        System.out.println(spittleId);
        return "spittles";
    }

    private List<Spittle> createSpittleList(int count) {
        List<Spittle> spittles = new ArrayList<Spittle>();
        for (int i = 0; i < count; i++) {
            spittles.add(new Spittle());
        }
        return spittles;
    }
}
