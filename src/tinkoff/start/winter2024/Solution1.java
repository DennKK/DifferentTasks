package tinkoff.start.winter2024;
import java.util.Scanner;
public class Solution1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        boolean[] result = new boolean[t];


        for (int i = 0; i < t; i++) {
            String input = scanner.next();
            result[i] = canFormTinkoff(input);
        }
        scanner.close();

        for (int i = 0; i < t; i++) {
            if (result[i]) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }

    private static boolean canFormTinkoff(String input) {
        int[] count = new int[26];

        for (char ch : input.toCharArray()) {
            count[ch - 'A']++;
        }

        return count['T' - 'A'] == 1 && count['I' - 'A'] == 1 && count['N' - 'A'] == 1 &&
                count['K' - 'A'] == 1 && count['O' - 'A'] == 1 && count['F' - 'A'] == 2;
    }
}