package com.kyra.sandbox.controller;

import com.kyra.sandbox.Service.ToyService;
import com.kyra.sandbox.pojo.Toy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by kannampallil_b on 4/22/15.
 */
@Controller
public class ToyController {

    @Autowired
    private ToyService toyService;

    @RequestMapping(value = "/toys", method = RequestMethod.GET)
    public @ResponseBody List<Toy> getToys() {
        final List<Toy> toys =  toyService.getAllToys();
        return toys;
    }

}
