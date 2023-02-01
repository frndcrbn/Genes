package inheritance;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Charlie", "Male", 29);
        Toddler t = new Toddler("Alex", "Female", 20, "Valorant");
        Kid k = new Kid("Efren", "Male", 12, "Roblox", 3);

        p.checkStatus();
        t.checkStatus();
        k.checkStatus();

        t.drink();
        k.play();
    }
}
