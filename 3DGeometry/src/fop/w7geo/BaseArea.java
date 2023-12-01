package fop.w7geo;

public abstract class BaseArea {
  public abstract double circumference();

    public abstract double area();

    public Square toSquare(){
        return null;
    }
    public boolean isSquare(){
        return false;
    }





@Override
    public String toString(){
        return "length" + circumference() +  "; area " + area() + "; Square?" +isSquare();
    } 
}
