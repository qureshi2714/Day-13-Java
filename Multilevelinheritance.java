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
class c extends b{
    public void r1(){
        System.out.println("hello professor");
    }
}
public class Multilevelinheritance{
    public static void main(String[] args) {
        c f=new c();
        f.p1();
        f.r1();
        f.r();
    }
}