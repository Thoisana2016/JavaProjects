package javaOne_3_Variables;

public class VarClass {
    /*
    String - stores text, such as "Hello". String values are surrounded by double quotes
    int - stores integers (whole numbers), without decimals, such as 123 or -123
    float - stores floating point numbers, with decimals, such as 19.99 or -19.99
    char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
    boolean - stores values with two states: true or false
     */

    String string= "Hello Java!";
    int a = 12;
    float f = (float) 99.95;
    char ch = 'A';
    boolean bool = true;


    //use the final keyword (this will declare the variable as "final" or "constant", which means unchangeable and read-only):
    final int myNum = 15;

    public void varFunction(){
        System.out.println("String = "+string);
        System.out.println("Integer a = "+a);
        System.out.println("Float f = "+f);
        System.out.println("Char ch = "+ch);
        System.out.println("Boolean bool = "+bool);
        System.out.println("Final int myNUm = "+myNum);
        //myNum = 20;  // will generate an error: cannot assign a value to a final variable
        System.out.println("final error = "+myNum);
    }

}
