public class Main{
    void display(int a){
        System.out.println("Integer: "+a);
    }
    void display(double a){
        System.out.println("Double: "+a);
    }
    public static void main(String[] args) {
//        System.out.println("Hello, World!");
        Main m = new Main();
        m.display(5);
        m.display(5.5);
    }
}
