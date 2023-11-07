package javaOne_4_DataTypes;

/*
Numbers -
    Primitive number types are divided into two groups:
    -Integer types stores whole numbers, positive or negative (such as 123 or -456), without decimals. Valid types are byte, short, int and long.
        Which type you should use, depends on the numeric value.
    -Floating point types represents numbers with a fractional part, containing one or more decimals. There are two types: float and double.
 */

public class Number {
    //Byte: The byte data type can store whole numbers from -128 to 127. This can be used instead of int or other integer types to save memory
    //      when you are certain that the value will be within -128 and 127:
    byte myByte = 100;
    //Short: The short data type can store whole numbers from -32768 to 32767:
    short myShort = 500;
    //Int: The int data type can store whole numbers from -2147483648 to 2147483647. In general, and in our tutorial, the int data type is the preferred data type
    //      when we create variables with a numeric value.
    int myInt = 10000;
    //Long: The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807.
    //      This is used when int is not large enough to store the value. Note that you should end the value with an "L":
    long myLong = 150000L;
    //Floating Point Types
    //You should use a floating point type whenever you need a number with a decimal, such as 9.99 or 3.14515.
    //
    //The float and double data types can store fractional numbers. Note that you should end the value with an "f" for floats and "d" for doubles:
    float myFloat = 5.75f;
    double myDouble = 19.9d;

    //Scientific Numbers
    //A floating point number can also be a scientific number with an "e" to indicate the power of 10:
    float myFloatScientific = 35e3f;
    double myDoubleScientific = 12E4d;

    public void printNumber(){
        System.out.println("Byte : "+myByte);
        System.out.println("Short : "+myShort);
        System.out.println("Integer : "+myInt);
        System.out.println("Long : "+myLong);
        System.out.println("Float : "+myFloat);
        System.out.println("Double : "+myDouble);

        System.out.println("Float Scientific : "+myFloatScientific);
        System.out.println("Double Scientific : "+myDoubleScientific);

    }
}
