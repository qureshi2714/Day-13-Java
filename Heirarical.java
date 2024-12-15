class a{
}
class b extends a{
    public void r(){
        System.out.println("hello teachers");
    }
}
class c extends a{
    public void r1(){
        System.out.println("hello professor");
    }
}
public class Heirarchical{
    public static void main(String[] args) {
        b h=new b();
        h.p1();
        h.r();
        c h1=new c();
        h1.r1();
        h1.p1();
    }
}