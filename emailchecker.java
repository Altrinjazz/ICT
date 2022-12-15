public class emailchecker {
    public static void main(String[] args) {
        strings emailid = "suren_c1629@gmail.com";
        strings regex = "^[a-zA-Z0-9+._-]+@[a-zA-Z0-9.-]+s";
        boolean res=emailid.matches(regex);
        if(res)
        {
            System.out.println("Valid email");
        }
        else{
            System.out.println("Invalid email");
        }
        System.out.println("to check the given email id contain all the details. it can also be used for checking the passwords.");
    }
}
