package finkevolution.com.fuud;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by Girondins on 2017-11-13.
 */

public class Controller {
    private LinkedList<Dish> Dishes = new LinkedList<Dish>();
    private MainActivity main;

    public Controller(MainActivity main){
        this.main = main;

        Dishes.add(new Dish ("Korv Stroganoff med Pasta"));
        Dishes.add(new Dish ("Stekt Ris med Bog"));
        Dishes.add(new Dish ("Chili Con Carne"));
        Dishes.add(new Dish ("Spaghetti Köttfärssås"));
        Dishes.add(new Dish ("Taco"));
        Dishes.add(new Dish ("Hemmagjorda Pizzor"));
        Dishes.add(new Dish ("Gulasch Soppa"));

        setRollFragment();
    }

    public void setRollFragment(){
        RollFragment rollFragment = new RollFragment();
        rollFragment.setController(this);
        main.setFragment(rollFragment,true);

    }

    public Dish getRandomDish(){
        Random rand = new Random();
        return Dishes.get(rand.nextInt(Dishes.size()));
    }
}
