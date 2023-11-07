package javaOne_4_DataTypes;
/*
Data types are divided into two groups:

Primitive data types - includes byte, short, int, long, float, double, boolean and char
Non-primitive data types - such as String, Arrays and Classes
 */
public class DataType {
    public static void main(String[] args) {
        DataClass dc = new DataClass();

        System.out.println("======================");
        Number n = new Number();
        System.out.println("Number class is called : ");
        n.printNumber();
        System.out.println("======================");
        Boolean b = new Boolean();
        System.out.println("Boolean class is called : ");
        b.printBool();
        System.out.println("======================");
        Characters c = new Characters();
        System.out.println("Character class is called : ");
        c.printCharacter();
        System.out.println("======================");
    }
}
