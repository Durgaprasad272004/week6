/*Write a Java class 'AccessSpecifierDemo' with the following members:
Member Variables :
1. private int priVar
2. protected int proVar
3. public int pubVar
Member Methods:
1. public void setVar(int priValue,int proValue, int pubValue)
2. public void getVar()
Assign values for each member variable(priVar,proVar,pubvar) and using methods(setVar(),getVar()) and disaply them. */
import java.util.Scanner;
class AbsEncapJava{
    private
        int privar;
    protected
        int provar;
    public
        int pubvar;
    void setVar(int priValue,int proValue, int pubValue){
        privar=priValue;
        provar=proValue;
        pubvar=pubValue;
    }
    void getVar(){
        System.out.println("Private variable :"+privar);
        System.out.println("Protceted variable :"+provar);
        System.out.println("Public variable :"+pubvar);
    }
}
class AccessSpecifierDemo{
    public static void main(String[] args) {
        AbsEncapJava obj = new AbsEncapJava();
        obj.setVar(90, 89, 45);
        obj.getVar();
    }
}