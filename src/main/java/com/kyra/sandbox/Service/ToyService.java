package com.kyra.sandbox.Service;

import com.kyra.sandbox.pojo.Toy;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kannampallil_b on 4/24/15.
 */
@Service
public class ToyService {

    public List<Toy> getAllToys(){
        List<Toy> toys = makeToys();

        return toys;
    }

    private List<Toy> makeToys() {
        List<Toy> toys = new ArrayList<Toy>();
        Toy toy1 = new Toy();
        toy1.setId(1);
        toy1.setName("Woody");
        toy1.setGender("Male");
        toy1.setTitle("Sheriff");

        Toy toy2 = new Toy();
        toy2.setId(2);
        toy2.setName("Buzz");
        toy2.setGender("Male");
        toy2.setTitle("Space Ranger");

        Toy toy3 = new Toy();
        toy3.setId(3);
        toy3.setName("Bo Peep");
        toy3.setGender("Female");
        toy3.setTitle("Shepherdess");

        Toy toy4 = new Toy();
        toy4.setId(4);
        toy4.setName("Rex");
        toy4.setGender("Male");
        toy4.setTitle("Tyrannosaurus");


        Toy toy5 = new Toy();
        toy5.setId(5);
        toy5.setName("Slinky Dog");
        toy5.setGender("Male");
        toy5.setTitle("Dachshund");

        Toy toy6 = new Toy();
        toy6.setId(6);
        toy6.setName("Mr. Potato Head");
        toy6.setGender("Male");
        toy6.setTitle("Potato");

        toys.add(toy1);
        toys.add(toy2);
        toys.add(toy3);
        toys.add(toy4);
        toys.add(toy5);

        return toys;
    }


}
