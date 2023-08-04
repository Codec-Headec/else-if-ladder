//else if Ladder demo

package elseifladder;
import java.util.*;

public class ElseIfLadder{
    public static void main(String[] args) {
        int m1, m2, m3, per;
        Scanner sc;

        sc = new Scanner(System.in);
        System.out.println("Enter the marks of 3 subjects");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        per = (m1 + m2 + m3) * 100 / 30;

        if (per >=60)
            System.out.println("First Division");

        else if (per >= 50)
            System.out.println("Second Division");

        else if (per >= 40)
            System.out.println("Third Division");

        else
            System.out.println("Fail");
    }
}