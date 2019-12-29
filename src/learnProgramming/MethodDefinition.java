package learnProgramming;

public class MethodDefinition {

    public static void main(String[] args) {
        int param, result2, result3,result4;
        MethodDefinition myMethodDefinition = new MethodDefinition();

        result2 = myMethodDefinition.mySum(1,2);
        result3 = myMethodDefinition.mySum(a: 1,b:2,c:3);
        result4 = myMethodDefinition.mySum(a: 1,b:2,c:3,d:4);
//        myMethodDefinition.mySum();
        System.out.println(result2);

        String myString = "Bala Jakka";
        String myAnotherString = new String("Bala Jakka");
        myString.toUpperCase();
        System.out.println(myString);
        myString = myString.toUpperCase();
        System.out.println(myString);
        System.out.println(myString.equals(myAnotherString));
        System.out.println(myString.equalsIgnoreCase(myAnotherString));
        System.out.println(myString==myAnotherString);
        myString = myMethodDefinition.abcd();
        System.out.println(myString);
        myMethodDefinition.abc();

    }

    public int mySum(int a, int b){

        int c = a+b;
        return c;
    }

    public String abcd(){
        System.out.println("sdlfkjsdflk");
        return "aslfkjsdl";
    }

    public void abc(){
        System.out.println("I am void method");
    };


    public int mySum(int a, int b,int c){

        return a+b+c;
    }

    public int mySum(int a, int b, int c, int d){

        return a+b+c+d;
    }
}
