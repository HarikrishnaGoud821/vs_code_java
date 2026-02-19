public class Para{
    String name = "Hari";
    void display(String name){
        this.name = name;
    }
    public static void main(String[] args){
        Para obj =new Para();
        System.out.println(obj.name);
        obj.display("Ravi");
        System.out.println(obj.name);
    }
}