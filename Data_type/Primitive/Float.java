public class Float{
    public static void main(String[] args){
        float num1 = 3.14f; // The 'f' suffix indicates that this is a float literal
        //float num2 = 3.14; // This will cause a compilation error because 3.14 is treated as a double literal, which is out of the float range (approximately ±1.4E-45 to ±3.4028235E38)
        System.out.println("The value of num1 is: " + num1);
    }
}