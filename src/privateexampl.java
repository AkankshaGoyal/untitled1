
public class A{
    private int data = 40;
    private void msg(){
        System.out.println("hello java");
    }
}
public class privateexampl {
   public static void main(String args[]){
       A obj = new A();
       System.out.println(obj.data);
       obj.msg();
   }

}

