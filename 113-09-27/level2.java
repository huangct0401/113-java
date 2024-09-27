import java.util.Scanner;

public class level2 {
    public static void main(String[] args) {

        var score = 88;
        // var quotient = score / 10;
        var level = '\0';

        Scanner input = new Scanner(System.in);
        System.out.print("請輸入分數");
        while (input.hasNext()) {
            score = input.nextInt();
            switch (score) {
                case 10:
                case 9:
                    level = 'A';
                    break;
                case 8:
                    level = 'B';
                    break;
                case 7:
                    level = 'C';
                    break;
                case 6:
                    level = 'D';
                    break;
                default:
                    level = 'E';
            }
            System.out.printf("得分等級；G%c%n", level);
            System.out.print("請輸入分數");
        }
    }
}
