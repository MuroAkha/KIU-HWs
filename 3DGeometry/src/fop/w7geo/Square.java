package fop.w7geo;

public class Square extends BaseArea {
   private double length;

    public Square(double length){
        this.length = length;
    }




    @Override
    public boolean isSquare(){
        return true;
    }
    @Override
    public Square toSquare(){
        return this;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double circumference() {
        return 4*length;
    }

    @Override
    public double area() {
        return Math.pow(length,2);
    }
    public String toString(){
        return "Square ( circumference:" + circumference() + ";area :" + area()+ ")";
    }
}
