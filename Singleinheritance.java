class a{
    public void p1(){
        System.out.println("hello students");
    }
}
class b extends a{
    public void r(){
        System.out.println("hello teachers");
    }
}
public class Singleinheritance{
    public static void main(String[] args) {
        a h=new a();
        h.p1();
        b y=new b();
        y.p1();
    }
}