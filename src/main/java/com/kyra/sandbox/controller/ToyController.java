package com.kyra.sandbox.controller;

import com.kyra.sandbox.pojo.Toy;
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


    //Map to store employees, ideally we should use database
    Map<Integer, Toy> toyBox = new HashMap<Integer, Toy>();

    @RequestMapping(value = "/toy/sample", method = RequestMethod.GET)
     public @ResponseBody
    Toy getSampleToy() {
        Toy toy = new Toy();
        toy.setId(9999);
        toy.setName("Dummy");
        toyBox.put(9999, toy);
        return toy;
    }


    @RequestMapping(value = "/toys", method = RequestMethod.GET)
    public @ResponseBody List<Toy> getToys() {
        List<Toy> toys = new ArrayList<Toy>();
        Toy toy1 = new Toy();
        toy1.setId(999);
        toy1.setName("Woody");

        Toy toy2 = new Toy();
        toy2.setId(100);
        toy2.setName("Buzz");

        toys.add(toy1);
        toys.add(toy2);

        return toys;
    }

}
