public class gradejava {
    public static void main(String[] args) {
        int i = 50, j = 60, k = 85, l = 55, m = 77, avj;
        avj = (i + j + k + l + m) / 5;
        System.out.println("Average =" + avj);
        if (avj < 50) {
            System.out.println("Average = " + avj + ".    Fail");
        } else if (avj >= 50 && avj < 60) {
            System.out.println("Average = " + avj + ".  Grade : A");
        } else if (avj >= 60 && avj < 80) {
            System.out.println("Average = " + avj + ".   Grade  : O");
        } else
            System.out.println("Average = " + avj + ".   Grade  : S");
    }
}