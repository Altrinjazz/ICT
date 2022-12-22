public class stud {
    int rollno;//instance variable  
   String name;  
   static String college ="ITS";//static variable  
   //constructor  
   stud(int r, String n){  
   rollno = r;  
   name = n;  
   }  
   void display() 
   {
    System.out.println(rollno+" "+name+" "+college);
}  
}  
public class TestStaticVariable{  
 public static void main(String args[]){  
 stud s1 = new stud(111,"Karan");  
 stud s2 = new stud(222,"Aryan");  
 //we can change the college of all objects by the single line of code  
 //Student.college="BBDIT";  
 s1.display();  
 s2.display();  
 }  
}
