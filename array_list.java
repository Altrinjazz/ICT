import java.util.ArrayList;
public class array_list {
    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList <Integer> ();
        ArrayList <Integer> arr1 = new ArrayList <Integer> ();
        arr.add(10,20,30);
         int x = 2;
         int i;
        for (i=0;i<3;i++)
        {
            x=arr.get(i)*2;
            arr1.add(x);

            
        }
        System.out.println(arr1);
        
        
    }
}

