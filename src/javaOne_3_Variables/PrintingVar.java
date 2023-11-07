package javaOne_3_Variables;

public class PrintingVar {
    String firstName = "Miranda";
    String lastName = "Kher";
    String fullname = firstName + lastName;
    int x = 12;
    int y = 17;
    int add = x + y;

    public void printVarMulti(){
        System.out.println("First Name : "+firstName);
        System.out.println("Last Name : "+ lastName);
        System.out.println("Two number : 1st Num = "+x+" 2nd Num = "+y);
        System.out.println("Full Name = "+fullname);
        System.out.println("Add = "+add);
    }

}
