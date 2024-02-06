import java.util.Scanner;
import java.lang.Exception;

class WrongAge extends Exception{
    WrongAge(String s){
        super(s);
    }
}
class InputScanner {
    Scanner sc = new Scanner(System.in);
    int Age;
    InputScanner(){
        if (this.getClass() == Father.class){
            System.out.println("Enter father age: ");
            Age = sc.nextInt();
        } 
    }
}
class Father extends InputScanner{
    int FatherAge;
    Father() throws WrongAge{
        FatherAge = Age;
        if (FatherAge < 0){
            throw new WrongAge("Age cannot be < 0 for a person");
        } 
    }
    void display(){
        System.out.println("Father Age = " + FatherAge);
    }
}
class Son extends Father{
    int SonAge;
    Son() throws WrongAge{
        super();
        System.out.println("Enter son age: ");
        SonAge = sc.nextInt();
        if (FatherAge < SonAge){
            throw new WrongAge("Age cannot be greater for son");
        } else if (SonAge < 0){
            throw new WrongAge("Age cannot be < 0 for a person");
        }
    }
    void display(){
        System.out.println("Son Age = " + SonAge);
    }
}
class FatherMain{
    public static void main(String[] args) {
        try{
            Father father = new Father();
            Son son = new Son();
            father.display();
            son.display();
        }
        catch (WrongAge e){
            System.out.println(e.getMessage());
        } 
        
    }
}
