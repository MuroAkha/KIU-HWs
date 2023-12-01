package fop.w7geo;

public class Rectangle extends BaseArea {
   private double width;
    private double height;


    public Rectangle(double length, double width){
        this.width = length;
        this.height = width;
    }


    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double circumference() {
        return 2 * (height + width);
    }

    @Override
    public double area() {
        return height* width;
    }
    @Override
    public boolean isSquare(){
        return width == height;
    }
    @Override
    public Square toSquare(){
        if(isSquare()){
        return new Square(width);
        }else{
        return null;
        }
    }


    @Override
    public String toString() {
        return "Rectangle ( circumference : "+ circumference() + "; area:" + area() +")";
    }
}
