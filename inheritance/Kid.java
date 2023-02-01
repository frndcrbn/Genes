package inheritance;

public class Kid extends Toddler{

    int gradeLevel;

    Kid(String name, String sex, int age, String favGame, int gradeLevel){
        super(name,sex,age,favGame);
        this.gradeLevel = gradeLevel;
    }

    void play(){
        System.out.println(name + " is playing " + favGame + ".");
    }

    void checkStatus(){
        super.checkStatus();
        System.out.println("Grade Level : " + gradeLevel);
    }
}
