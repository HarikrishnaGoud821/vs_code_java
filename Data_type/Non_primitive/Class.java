public class Class{
    String brand;
    String year;
    public Class(String brand, String year){
        this.brand = brand;
        this.year = year;

    }
    public String display(){
        System.out.println("The brand of the car is: " + brand);
        System.out.println("The year of the car is: " + year);
        return "Car details displayed successfully.";
    }
    public static void main(String[] args){
        Class car1 = new Class("HERO","2020");
        car1.display();
    }
}