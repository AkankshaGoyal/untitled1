interface Printable{
    void print();
}

interface Showable extends Printable{
    void show();
}
public class TestInterface4 implements Showable{
    public void print(){
        System.out.print("hello");
    }
    public void show(){
        System.out.print("welcome");
    }
    public static void main(String args[]){
        TestInterface4 obj = new TestInterface4();
        obj.print();
        obj.show();
    }
}
