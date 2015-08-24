import java.util.ArrayList;

public class CatCorral {
    
    private static ArrayList<Cat> corral = new ArrayList<Cat>();
        
    public static void main(String[] args) {
        Cat cream = new Cat("cream", "calico"); 
        corral.add(cream);
        Cat mysteryCat = corral.get(0);
        mysteryCat.speak();
        printCats();
    }

    public static void printCats() {
        int size = corral.size();
        for (int i = 0; i < size; i++) {
            System.out.println(corral.get(i).getName());
        }
    }
}
