import java.util.Scanner;
class WrongAge extends Exception{
    WrongAge(){
        super("Age Error");
    }
    WrongAge(String msg){
        super(msg);
    }

}
class InputScanner{
    Scanner s=new Scanner(System.in);
}
class Father extends InputScanner{
    int fatherAge;
    Father() throws WrongAge{
        System.out.println("Enter the father age:");
        fatherAge =s.nextInt();
        if(fatherAge<0){
            throw new WrongAge("Age cannot be negative");
        }

    }
    public void displayFatherAge(){
        System.out.println("Father age is :"+ fatherAge);
    }
}
class Son extends Father{
    int sonAge;
    Son() throws WrongAge{
        System.out.println("Enter the son age:");

        sonAge=s.nextInt();
        if(sonAge>fatherAge){
            throw new WrongAge("Son age cannot be greater than father's age");
        }
        else if(sonAge<0){
            throw new WrongAge("Age cannot be negative,throw new WrongAge");

        }

    }
    public void displaySonAge(){
        System.out.println("Son age is :"+ fatherAge);
    }
}
class ExceptionClass{
    public static void main(String[] args) {
        try{
            Father f=new Father();
            Son s=new Son();
            f.displayFatherAge();
            s.displaySonAge();
        }

        catch(Exception e){
            System.out.println(e.getMessage());
        }
    
    }
    
}
    

