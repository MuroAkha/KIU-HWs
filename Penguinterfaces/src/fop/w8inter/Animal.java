package fop.w8inter;

public abstract class Animal {
    protected int age;
    public Animal(int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void birthday(){
        age++;
    }



}

