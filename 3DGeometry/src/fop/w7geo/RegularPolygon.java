package fop.w7geo;

public class RegularPolygon extends BaseArea {
    private int n;

    private double length;

    public RegularPolygon(int n, double length){
        this.n = n;
        this.length = length;

    }

    public double getLength() {
        return length;
    }

    public int getN() {
        return n;
    }


    @Override
    public double circumference() {
        return length * n ;
    }

    @Override
    public double area() {
        return (n * Math.pow(length,2))/(4*Math.tan(Math.PI/n)) ;
    }

    @Override
    public boolean isSquare() {
        return  n ==4;
    }

    @Override
    public Square toSquare() {
        if(isSquare())
            return new Square(length);
        else
            return null;


    }


    @Override
    public String toString() {
        return "corner :" + n + "; area :" + area() + super.toString();
    }

}
