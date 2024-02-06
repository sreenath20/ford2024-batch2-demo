package interfaces;

public class ABDriver {

    public static void main(String [] args){

        ABImpl abObj = new ABImpl();
        abObj.functionOne();
        abObj.functionTwo();
        A a;
        B b;
        a = abObj;
        a.functionOne();
        //a.functionTwo();
        b=abObj;
        b.functionTwo();
       // b.functionOne();


    }
}
