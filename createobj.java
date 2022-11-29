public class createobj {
    public String name;
    String gender;
    public float hight, weight;

    public String get_details() {
        return ("Name  : " + name + ";  Gender  : " + gender + ";  Height  : " + hight + ";  Weight  : " + weight);

    }
}

public class class_obj {
    public static void main(String[] args) {
        createobj jazz = new createobj();
        jazz.name = "ALTRIN JASH .S";
        jazz.gender = "Maile";
        jazz.hight = 160;
        jazz.weight = 60;
        System.out.println(jazz.get_details());

    }
}