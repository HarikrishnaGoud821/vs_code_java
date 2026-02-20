import java.util.Scanner;
class Exam{
    public static void main(String[] args){
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter the Number:");
        int a=obj.nextInt();
        System.out.println("Number:"+a);
        obj.close();
        for (int i=1;i<=10;i++){
            
            System.out.println(a+" x "+i+" = "+(a*i));
        }


    }
}