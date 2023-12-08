package fop.w5zoo;

public class Zoo {
	private Vivarium[] vivaria;

    public Zoo(Vivarium[] vivaria){
        this.vivaria = vivaria;
    }

    public Vivarium[] getVivaria() {
        return vivaria;
    }
    public int getCosts(){
        int sum = 0;
        for(Vivarium vivarium : vivaria ){
            sum += vivarium.getCosts();
        }
        return sum;
    }

    public String toString(){
        return "{"+vivaria.toString()+", "+"}";
    }
}
