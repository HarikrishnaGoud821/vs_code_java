public class Instancee{
    //instance varable which is difined inside the classs nut out side the methodes but we can acces in the class and also methodes and 
    //we can create object in another class and we can access the instance varable based on the modifier(public/private/protected) of the instance varable
    String name  = "Hari";
    static String name2 = "GOUD";

    void display(){
        System.out.println(name);
        System.out.println(name2);
    }


    //paramaterized method are used for changing the value of instance variable
    void display2(String name){
    this.name=name;
    System.out.println(name);


    }

    public static void main(String[] args) {
        Instancee obj = new Instancee();
       // System.out.println("This is an instance of " + obj.name);
       obj.display();
       obj.display2("krishna");

       
       
    }
}


