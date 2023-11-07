package javaOne_3_Variables;

public class Variable {
    public static void main(String[] args) {
        VarClass vc = new VarClass();
        System.out.println( "Calling VArClass Class : ");
        vc.varFunction();

        PrintingVar pv = new PrintingVar();
        System.out.println("Calling PrintingVar :");
        pv.printVarMulti();

        Identiers i = new Identiers();
        System.out.println("Calling Identifier class :");
        i.varFunction();

    }
}
