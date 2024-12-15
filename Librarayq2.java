class library{
    String name;
    int bb;
     library(String name){
     this.name=name;
     this.bb=0;
    }
    public boolean cb(){
        return false;
    }
    public void bob()
    {
        if(cb())
        {
            bb++;
            System.out.println(name+"you borrowed"+bb+"book");
        }
        else{
            System.out.println("your limit exceeded");
        }
    }
public void rb()
{
    if(bb>0){
        bb--;
        System.out.println(name+" you returned books and remaining books are:"+bb);
    }
    else{
        System.out.println(name+"you did not took any book from library");
    }
}
}
class students extends library{
    students(String name){
        super(name);
    }
    @Override
     public boolean cb(){
        return bb<3;
    }
}
class teachers extends library
{
    teachers(String name){
        super(name);
    }
    @Override
    public boolean cb(){
    return bb<10;
   } 
}
public class Libraryq2{
    public static void main(String[] args) {
        library a=new students("amar");
        library b1=new students("lalitha");
        library b=new teachers("Dr.prem kumar");
        b1.bob();
        b1.bob();
        b1.bob();
        b1.bob();
    }
}