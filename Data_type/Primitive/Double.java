public class Double{
    public static void main(String[] args){
        double num1 = 3.14;
        //double num2 = 1.7e-308; // This will cause a compilation error because 1.7e-308 is out of the double range (approximately ±4.9e-324 to ±1.7e+308)
        System.out.println("The value of num1 is: " + num1);
    }
}