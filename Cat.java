public class Cat {
   
    private String name;
    private String color;

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
        System.out.println("New cat created!");
    }

    public void speak() {
        System.out.println("Meow! my name is " + this.name + ", I am a " + this.color + " cat");
    }

    public String getName() {
        return this.name;
    }
}
