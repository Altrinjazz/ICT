public class methodoverloading {
    static String n,a, status,value;
    static float h,w;
    methodoverloading()
    {
        n="Ram";
        a="Male";
        h=45;
        w=77;
        System.out.println("Name  : " + n + ";  Gender  : " + a + ";  Height  : " + h + ";  Weight  : " + w);
    } 
    public static void main(String[] args) {
        methodoverloading obb=new methodoverloading();
        obb.get_details();
        obb.get_details("Ram");
        System.out.println("value :"+ value +"   "+ "Status :"+status);
        System.out.println("Name  : " + n + ";  Gender  : " + a + ";  Height  : " + h + ";  Weight  : " + w);

    }
    public String get_details() {
        return("Name  : " + n + ";  Gender  : " + a + ";  Height  : " + h + ";  Weight  : " + w);
    }
    public String get_details( String status) {
        
         value=n;
         if(status==value)
         {
             value="Name :"+ n ;
         }
         else if (status=="height")
         {
             value="Heaight :"+ h;
         } 
        return("value"+value +"status"+status);
    }
}
