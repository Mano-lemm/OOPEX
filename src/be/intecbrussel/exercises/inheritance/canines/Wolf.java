package be.intecbrussel.exercises.inheritance.canines;

public class Wolf {
    String name;
    int age;
    
    public Wolf(){
    }

    public Wolf(String name, int age){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise(){
        System.out.println("Awoooo!");
    }
}
