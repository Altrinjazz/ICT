public class human {
    static String name, grade;
    static float height, weight;

    public human() {
        name = "Vibin";
        grade = "Male";
        height = 160;
        weight = 60;
        System.out.println("Name  : " + name + ";  Gender  : " + grade + ";  Height  : " + height + ";  Weight  : " + weight);
    }

    public static void main(String[] args) {
        human obb=new human();
        System.out.println("Name  : " + name + ";  Gender  : " + grade + ";  Height  : " + height + ";  Weight  : " + weight);
    }

}