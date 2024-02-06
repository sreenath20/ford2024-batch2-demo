public class Client {
    public static void main(String[] args){

        System.out.println("Hello Ford !");

        int number=100;
        System.out.println("number:"+number);
        Byte numberByte = 100; // Auto boxing
        System.out.println("Byte:"+numberByte); // auto unboxing
        System.out.println("Size of Byte:" + Byte.SIZE);
        System.out.println("max value of  Byte:" + Byte.MAX_VALUE);
        //numberByte = 128; //incompatible types: int cannot be converted to Byte numberByte = 128;

        byte bytePrimitive = numberByte;
        System.out.println("byte primitive:"+bytePrimitive);

        Short shortNumber = 250;
        String shortString = shortNumber.toString();
        System.out.println("Short string:"+shortString);
        Short shortDuplicate = Short.valueOf( shortString);
        System.out.println(" string back to short:"+shortDuplicate);

        Integer numberOne = 500;
        Integer numberTwo =200;

        System.out.println("Are they equal? :"+numberOne.equals(numberTwo));
        System.out.println("n1 compare to n2 ?:"+numberOne.compareTo(numberTwo));
        System.out.println("n1 compare to n2 ?:"+Integer.compare(250,350));
        // String

        String countryName = "India";
        String wokingCountry = "india";

        System.out.println(" hashcode of s1:" +countryName.hashCode());
        System.out.println(" hashcode of s2:" +wokingCountry.hashCode());
        String company = "Ford";
        countryName = countryName + company;
        System.out.println("s1:"+countryName);
        System.out.println(" hashcode of s1:" +countryName.hashCode());



    }
}
