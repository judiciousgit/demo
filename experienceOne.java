1.1
import java.util.Scanner;
public class experienceOnePointOne {
    public static void getChineseString(char ch, int code) {
        for (int i = 0; i < 12; i++) {
            if(i<6) {
                int code1 = (char) ch;
                System.out.print(ch + "(" + code1 + ")");
                ch = (char) (ch + 1);
            }
            else {
                if(i==6){
                    System.out.println();
                }
                char ch1 = (char) code;
                System.out.print(ch1 + "(" + code + ")");
                code++;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入字符和Unicode：");
        char ch = sc.next().charAt(0);
        int code = sc.nextInt();
        getChineseString(ch, code);
        }
}