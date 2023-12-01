package fop.w7geo;

public class Prism {
    private  BaseArea base;
    private double height;

    public Prism(BaseArea base, double height){
        this.base = base;
        this.height = height;

    }

    public double getHeight() {
        return height;
    }

    public BaseArea getBase() {
        return base;
    }
    public double surface(){
        return height* base.circumference() + 2* base.area();
    }
    public boolean isCube(){
        if(base.isSquare())
            return base.toSquare().getLength() == height;
        else
            return false;
    }
    public double volume(){
        return height* base.area();

    }

    @Override
    public String toString() {
        return "Prism (surface :" +surface() +"; volume" +volume() +"Cube?" +isCube();
    }
}
