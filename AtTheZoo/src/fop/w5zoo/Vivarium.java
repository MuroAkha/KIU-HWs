package fop.w5zoo;

public class Vivarium {
	private int area;
    private int constructionYear;
    private Animal[] inhabitants;
    public Vivarium(int area, int constructionYear, Animal[] inhabitants){
        this.area = area;
        this.constructionYear = constructionYear;
        this.inhabitants = inhabitants;
    }

    public Animal[] getInhabitants() {
        return inhabitants;
    }

    public int getArea() {
        return area;
    }

    public int getConstructionYear() {
        return constructionYear;
    }
    public int getCosts(){
        int sumOfMaintenance = 900+(area*100)+(area*(2021-constructionYear)*5);
        int sumOfFood = 0;
        for (Animal animal : inhabitants){
                 sumOfFood += animal.getFoodCosts();
        }
        return sumOfFood+sumOfMaintenance;
    }
    public String toString(){
        return "[area: "+area+", constructionYear: "+constructionYear+", animals: "+inhabitants.toString()+", ";
    }

}
