package Polymorphism.Ex.wildFarm.animals;

import Polymorphism.Ex.wildFarm.foods.Food;
public class Zebra extends Mammal{
    public Zebra(String name, String type, double weight, String livingRegion) {
        super(name, type, weight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }

    @Override
    public void eat(Food food) {

        if (!food.getClass().getSimpleName().equals("Vegetable") ){

        }
        super.eat(food);
    }
}
