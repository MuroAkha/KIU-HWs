package fop.w7geo;

public class Circle extends BaseArea {
        private double radius;

    public  Circle(double radius){
        this.radius = radius;
    }




    public double circumference(){
        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }


    @Override
    public String toString() {
        return "Circle ( circumference: " + circumference() + "; Area :" +area() + ")" ;
    }
    
}
