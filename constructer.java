public class constructer
{
static String name, gender;
static float height,weight;
constructer (String name1,String gender1,float height1,float weight1)
{
    name=name1;
    gender=gender1;
    height=height1;
    weight=weight1;
    System.out.println("Name  : " + name + ";  Gender  : " + gender + ";  Height  : " + height + ";  Weight  : " + weight);
}
public static void main(String[]args) {
    constructer jazz =new constructer("altrin","mail",43,34);
    
}

}
