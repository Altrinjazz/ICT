public class switchgradejava {
    public static void main(String[] args) {
        int i = 97, j = 93, k = 95, l = 97, m = 77, avj;
        avj = (i + j + k + l + m) / 5;
        System.out.println("Average =" + avj);
        switch (avj) {
            case 1:
                if (avj < 50) {
                    System.out.println("Average = " + avj + ".    Fail");
                    break;
                }
            case 2:
                if (avj >= 50 && avj < 60) {
                    System.out.println("Average = " + avj + ".  Grade : A");
                    break;
                }
            case 3:
                if (avj >= 60 && avj < 80) {
                    System.out.println("Average = " + avj + ".   Grade  : O");
                    break;
                }
            default:
                System.out.println("Average = " + avj + ".   Grade  : S");
        }
    }
}