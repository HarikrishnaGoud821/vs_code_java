public class Long{
    public static void main(String[] args){
        long num1 = 10000000000L; // The 'L' suffix indicates that this is a long literal
        //long num2 = 3000000000000; // This will cause a compilation error because 3000000000000 is out of the long range (-9223372036854775808 to 9223372036854775807)
        System.out.println("The value of num1 is: " + num1);
    }
}
