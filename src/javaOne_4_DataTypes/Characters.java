package javaOne_4_DataTypes;

public class Characters {
    //Characters
    //The char data type is used to store a single character. The character must be surrounded by single quotes, like 'A' or 'c'
    char ch = 'C';
    //Alternatively, if you are familiar with ASCII values, you can use those to display certain characters:
    char var1 = 65, var2 = 66, var3 = 67;
    //String

    public void printCharacter(){
        System.out.println("Character : "+ch);
        System.out.println("Character according to ASCII value : ");
        System.out.println("Char1 : "+var1);
        System.out.println("Char2 : "+var2);
        System.out.println("Char3 : "+var3);

    }
}
