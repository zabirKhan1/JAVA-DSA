import java.security.PublicKey;
import java.util.Scanner;

import static jdk.internal.org.jline.utils.Colors.h;

public class Main {

    //---------------------(1) PRINT ALL PRIME-------------------------
    public static void printAllPrime() {
        Scanner scanner = new Scanner(System.in);
        int low = scanner.nextInt();
        int high = scanner.nextInt();
        for (int i = low; i <= high; i++) {
            int count = 0;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("PRIME is " + i);
            }
        }
    }

    //    ----------------- (2) CHECK PRIME-----------------------------
    public static boolean CheckPrime(int num) {
        int count = 0;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                count++;
                break;
            }

        }
        return count > 0 ? false : true;
    }


    //    -----------------------(3)  PRINT FIBONACCI---------------------
    public static void PrintFabonacci() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int n1 = 0;
        int n2 = 1;

        for (int i = 0; i <= n; i++) {
            System.out.println(n1);
            int n3 = n1 + n2;

            n1 = n2;
            n2 = n3;
        }
    }

    //    -----------------------(4)  CHECK PALINDROM---------------------
    public static void checkStringPalindrom() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String revStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            revStr = revStr + str.charAt(i);
            System.out.println(str.charAt(i));
        }

        if (str.equals(revStr)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

    //    -----------------------(5)  COUNT NUMBER OF DIGIT---------------------
    public static void CountNumberOfDigit() {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        int count = 0;

        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println(count);
    }

    //    ---------------------(6)  DIGIT OF NUMBER-----------------------------
    public static void digitOfNumebr() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int num = n;
        int count = 0;

        while (num != 0) {
            num = num / 10;
            count++;
        }
        int diva = (int) Math.pow(10, count - 1);
        while (diva > 0) {
            int dig = n / diva;
            System.out.println(dig);
            n = n % diva;
            diva = diva / 10;
        }
    }

    //----------------------- (7)  REVERSE A NUMBER--------------------------------
    public static void reverseANumber() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        while (n != 0) {
            int dig = n % 10;
            n = n / 10;
            System.out.println(dig);
        }
    }

    //------------------(8) INVERSE A NUMBER--------------------
    public static void inveseANumber() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = 0;
        int temp = n;
        int index = 1;
        while (temp != 0) {

            int dig = temp % 10;
            temp = temp / 10;
            int sum = (index * (int) Math.pow(10, dig - 1));
            ans += sum;
            index++;
        }
        System.out.println("ans  " + ans);
    }

    //------------------(8) ROTATE A NUMBER--------------------
    public static void rotateANumber() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int rotateBy = scn.nextInt();
        int count = 0;
        int temp = n;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }
        if (rotateBy > count) {
            rotateBy = rotateBy % count;
        } else if (rotateBy < 0) {
            rotateBy = rotateBy + count;
        }
        System.out.println(rotateBy);
        int number = (n % (int) Math.pow(10, rotateBy)) * (int) Math.pow(10, count - rotateBy);
        int Se = (n / (int) Math.pow(10, rotateBy));
        int ans = number + Se;
        System.out.println(ans);

    }

    //    -----------(9) LCM HCF-----------------
    public static void LCM() {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int on1 = n1;
        int on2 = n2;
        while (n1 % n2 != 0) {
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;

        }
        int lcd = n2;
        int hcf = (on1 * on2) / lcd;
        System.out.println(lcd);
        System.out.println(hcf);
    }

    //-----------------(10) PRINT ALL PRIME FATCORs-------------
    public static void printAllFactors() {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        for (int i = 2; i <= num && num != 0; ) {
            if (num % i == 0) {
                System.out.println(i);
                num = num / i;
            } else {
                i++;
            }
        }
    }

    //-------------------(11) Phythogorus Throem------------------
    public static void pythagorousValid() {
        Scanner scn = new Scanner(System.in);
        int h = scn.nextInt();
        int b = scn.nextInt();
        int p = scn.nextInt();


        int Hypotnus = (int) Math.pow(h, 2);
        int PandLSum = (int) Math.pow(p, 2) + (int) Math.pow(b, 2);
        boolean result = Hypotnus == PandLSum;
        System.out.println(result);
    }

    //-------------------(12) Phythogorus Throem------------------
    public static void pythagorousValids() {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int max = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        if (c > max) {
            max = c;
        }
        int Hypotnus = 0;
        int PandLSum = 0;

        if (max == a) {
            Hypotnus = (int) Math.pow(a, 2);
            PandLSum = (int) Math.pow(b, 2) + (int) Math.pow(c, 2);
        } else if (max == c) {
            Hypotnus = (int) Math.pow(c, 2);
            PandLSum = (int) Math.pow(a, 2) + (int) Math.pow(b, 2);
        } else {
            Hypotnus = (int) Math.pow(b, 2);
            PandLSum = (int) Math.pow(a, 2) + (int) Math.pow(c, 2);
        }
        boolean result = Hypotnus == PandLSum;
        System.out.println(result);
    }

    //--------------------(13) BRNJAMIN BULb--------------------------
    public static void benjaMinBulb() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 1; i * i <= n; i++) {
            System.out.println(i * i);
        }
    }

    //--------------------(14) PATTERN 1--------------------------
    public static void pattern1() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //--------------------(15) PATTERN 2--------------------------
    public static void pattern2() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //--------------------(16) PATTERN 3--------------------------
    public static void pattern3() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j < count) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
            count--;
        }
    }

    //--------------------(17) PATTERN 4--------------------------
    public static void pattern4() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp = 0;
        int str = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < str; j++) {
                System.out.print("*");
            }
            for (int k = 0; k < sp; k++) {
                System.out.print("  ");
            }
            sp++;
            str--;
            System.out.println();
        }
    }

    //--------------------(18) PATTERN 5--------------------------
    public static void pattern5() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int str = 1;
        int sp = n / 2;
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= sp; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= str; j++) {
                System.out.print("*");
            }
            if (i <= n / 2) {
                str = str + 2;
                sp--;
            } else {
                str = str - 2;
                sp++;
            }

            System.out.println();
        }
    }

    //--------------------(19) PATTERN 6--------------------------
    public static void pattern6() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    //--------------------(20) PATTERN 7--------------------------
    public static void pattern7() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int str1 = (n / 2) + 1;
        int sp = 1;
        int str2 = (n / 2) + 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= str1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= str2; k++) {
                System.out.print("*");
            }
            if (i <= n / 2) {
                str1 = str1 - 1;
                str2 = str2 - 1;
                sp = sp + 2;
            } else {
                str1 = str1 + 1;
                str2 = str2 + 1;
                sp = sp - 2;
            }
            System.out.println();
        }
    }

    //--------------------(21) PATTERN 8--------------------------
    public static void pattern8() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    //--------------------(22) PATTERN 9--------------------------
    public static void pattern9() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }

    //--------------------(23) PATTERN 10--------------------------
    public static void pattern10() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;
        int y = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == x && j == y) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            x++;
            y--;
            System.out.println();
        }
    }

    //--------------------(24) PATTERN 11--------------------------
    public static void pattern11() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;
        int y = n;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || (i == x && j == y)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            x++;
            y--;
            System.out.println();
        }
    }

    //--------------------(25) PATTERN 12--------------------------
    public static void pattern12() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int firstHalf = n / 2 + 1;
        int secondHalf = n / 2 + 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == firstHalf || j == secondHalf) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            if (i <= n / 2) {
                firstHalf--;
                secondHalf++;
            } else {
                firstHalf++;
                secondHalf--;
            }
            System.out.println();
        }

    }

    //--------------------(26) PATTERN 13--------------------------
    public static void pattern13() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("\t" + count);
                count++;
            }
            System.out.println();
        }
    }

    //--------------------(27) PATTERN 14--------------------------
    public static void pattern14() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("\t" + a);
                int c = a + b;
                a = b;
                b = c;
            }
            System.out.println();
        }
    }

    //--------------------(28) PATTERN 15--------------------------
    public static void pattern15() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int v = n * i;
            System.out.println(n + "*" + i + "=" + v);
        }
    }

    //--------------------(29) PATTERN 16--------------------------
    public static void pattern16() {
        Scanner ab = new Scanner(System.in);
        int n = ab.nextInt();
        int Fsp = n / 2;
        int FStr = 1;
        int val = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= Fsp; j++) {
                System.out.print("\t");
            }

            int cval = val;
            for (int k = 1; k <= FStr; k++) {
                System.out.print("\t" + cval);
                if (k < FStr / 2) {
                    cval--;
                } else {
                    cval++;
                }
            }

            if (i <= n / 2) {
                Fsp--;
                FStr += 2;
                val++;

            } else {
                Fsp++;
                FStr -= 2;
                val--;

            }
            System.out.println();
        }
    }

    //--------------------(30) PATTERN 17--------------------------
    public static void pattern17() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int str = 1;
        for (int i = 0; i < n; i++) {


            for (int j = 0; j < n / 2; j++) {
                if (i == n / 2) {
                    System.out.print("\t *");
                } else {
                    System.out.print("\t ");
                }
            }

            for (int k = 0; k < str; k++) {
                System.out.print("\t *");
            }

            if (i < n / 2) {
                str++;
            } else {
                str--;
            }
            System.out.println();
        }
    }

    //--------------------(31) PATTERN 18--------------------------
    public static void pattern18() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int str = n;
        int sp = 0;
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= sp; k++) {
                System.out.print("\t ");
            }

            for (int l = 1; l <= str; l++) {
                if (i <= n / 2 && i != 1 && i != n && l != 1 && l != str) {
                    System.out.print("\t");
                } else {
                    System.out.print("\t *");
                }


            }

            if (i <= n / 2) {
                str = str - 2;
                sp++;
            } else {
                str = str + 2;
                sp--;
            }
            System.out.println();
        }
    }

    //--------------------(32) PATTERN 19--------------------------
    public static void pattern19() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if ((j == n / 2 + 1 || i == n / 2 + 1) || (i == 1 && i < n / 2 && j <= n / 2)
                        || (i == n && j >= n / 2 + 1) || (j == n && i <= n / 2 + 1) || (j == 1 && i >= n / 2 + 1)
                ) {
                    System.out.print("\t *");
                } else {
                    System.out.print("\t ");
                }

            }
            System.out.println();
        }
    }

    //--------------------(33) PATTERN 19--------------------------
    public static void pattern20() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n || (i == j && i >= n / 2 + 1) || (i + j == n + 1 && i >= n / 2 + 1)) {
                    System.out.print("\t*");
                } else {
                    System.out.print("\t ");
                }

            }
            System.out.println();
        }
    }

    //Find Factorial based on value
    public static int findFactorial(int n) {
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac = fac * i;
        }
        return fac;
    }

    //find permutaion and combination by using factorial function
    public static void findPrmutaionCombination() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int res = findFactorial(n) / findFactorial(n - r);
        System.out.println(res);
    }

    public static void main(String[] args) {
        findPrmutaionCombination();

    }

}