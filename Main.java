

public class Main {

    public static void main(String[] args) {
        Virus v1 = new Virus();
        Virus v2 = new Virus();
            System.out.println();
    }
}

class Virus {
    int numvir = 0;
    String name;
    public Virus(){
        name = "lex";
    }
    
}
class Beta{
    int numberVirus;
    public static void main(String[] args) {
        Beta test = new Beta();
        test.numberVirus = 1;
        System.out.println("number of test: " + test.numberVirus);
    }

}

class Name {
    String first = "Ash";
    String last = "Grey";
    String full =first+last;
public static void main(String[] args) {
    Name name1 = new Name();
    System.out.println(name1.full);
    name1.first = "Ash";
    name1.last = "Grey";

}
}

class MyClass{
    public static void main(String[] args) {
        int x = 13;
        int y = 6;
        int z = 6;
        System.out.println( y == z);
    }
} 

