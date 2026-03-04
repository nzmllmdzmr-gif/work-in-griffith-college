/**
 Name: Zihan Wang
 Student Number: 3184485
 */
public abstract class Shape {

    private String name;

    public Shape(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    //abstract methods
    public abstract double area();
    public abstract double perimeter();

    public String toString(){
        return "Shape name: " + name;
    }
}
