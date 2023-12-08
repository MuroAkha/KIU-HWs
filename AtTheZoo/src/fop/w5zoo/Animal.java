package fop.w5zoo;

public class Animal {
	private int foodCosts;
    private String name;

    public Animal(int foodCosts, String name){
        this.foodCosts = foodCosts;
        this.name = name;
    }

    public int getFoodCosts() {
        return foodCosts;
    }

    public String getName() {
        return name;
    }


    public String toString() {
        return "(name: "+name+", foodCosts: "+foodCosts+")";
    }
}
