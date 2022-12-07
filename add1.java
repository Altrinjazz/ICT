import java.io.*;
public class add1 {
int num1,num2,obj_num;
static int count;
 add1(int n1,int n2) {
    num1=n1;
    num2=n2;
    obj_num=++count;
    }
    void print_num()
    {
        System.out.println("Num 1="+num1);
        System.out.println("Num 2="+num2);
        System.out.println("object number="+obj_num);
    }
}
class mainclass
{
    public static void main(String[] args) {
        add1 ob=new add1(1,2),b=new add1(10, 20);
        System.out.println("object A");
        ob.print_num();
        System.out.println("object B");
        b.print_num();
    }
}