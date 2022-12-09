import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String ip = scanner.next();
            System.out.println(ip.matches(new MyRegex().pattern));
        }
        scanner.close();
    }
}

// 0 - 199 -> [01]?\\d{1,2}
// 200 - 249 -> 2[0-4]\\d
// 250 - 255 -> 25[0-5]
class MyRegex {
    String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
    String pattern = num + "." + num + "." + num + "." + num;
}

