package finkevolution.com.fuud;

import java.util.LinkedList;

/**
 * Created by Girondins on 2017-11-13.
 */

public class Dish {
    private String dishName, dishRecipe;
    private LinkedList<Product> products;

    public Dish(String dishName){
        this.dishName = dishName;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public String getDishRecipe() {
        return dishRecipe;
    }

    public void setDishRecipe(String dishRecipe) {
        this.dishRecipe = dishRecipe;
    }

    public void addIngridient(Product product){

    }

    public Product iterateIngridients(int index){
        return products.get(index);
    }

    public int getIngridientSize(){
        return products.size();
    }

}
