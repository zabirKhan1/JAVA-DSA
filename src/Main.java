import java.security.PublicKey;
import java.util.Scanner;
import java.util.Stack;


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

                if ((j == n / 2 + 1 || i == n / 2 + 1) || (i == 1 && i < n / 2 && j <= n / 2) || (i == n && j >= n / 2 + 1) || (j == n && i <= n / 2 + 1) || (j == 1 && i >= n / 2 + 1)) {
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

    //--------------------(34) Find factorial--------------------------
    //Find Factorial based on value
    public static int findFactorial(int n) {
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac = fac * i;
        }
        return fac;
    }

    //-------------------(35) find permutaion and combination by using factorial function-----------
    public static void findPrmutaionCombination() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int res = findFactorial(n) / findFactorial(n - r);
        System.out.println(res);
    }

    //--------------------(36) Digit Of Number --------------------------
    public static int DigitOfNumber(int n, int num) {
        int count = 0;
        while (n != 0) {
            int digit = n % 10;
            n = n / 10;
            if (num == digit) {
                count++;
            }
        }
        return count;
    }

    public static void findDigitOfNumber() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = sc.nextInt();
        int count = DigitOfNumber(n, num);
        System.out.println(count);
    }
//    ---------------------------------------------------------------------------


    //--------------------(37) Decimal to any base --------------------------
    public static void convertDecimalToAnyBase() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        int ans = 0;
        while (n != 0) {
            int dig = n % b;
            n = n / b;
            ans = ans + (dig * (int) Math.pow(10, count));
            count++;
        }
        System.out.println(ans);
    }

    //    ----------------------------------------------------------------
//--------------------(38) Any base to decimal --------------------------
    public static void anyBaseToDecimal() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        int ans = 0;
        while (n != 0) {
            int dig = n % 10;
            n = n / 10;
            ans = ans + (dig * (int) Math.pow(b, count));
            count++;
        }
        System.out.println(ans);
    }

    //--------------------(39) Any base to Any base --------------------------
    public static void anyBaseToAnyBase() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int decimalValue = anyBaseToDecimal(n, b1);
        int convertedValueToAnyBase = decimalToAnyBase(decimalValue, b2);
        System.out.println(convertedValueToAnyBase);
    }

    public static int anyBaseToDecimal(int n, int currentBase) {
        int ans = 0;
        int count = 0;
        while (n != 0) {
            int dig = n % 10;
            n = n / 10;
            ans = ans + (dig * (int) Math.pow(currentBase, count));
            count++;
        }
        return ans;
    }

    public static int decimalToAnyBase(int n, int conversionBase) {
        int ans = 0;
        int count = 0;
        while (n != 0) {
            int dig = n % conversionBase;
            n = n / conversionBase;
            ans = ans + (dig * (int) Math.pow(10, count));
            count++;
        }
        return ans;

    }
//    ------------------------------------------------------------------


    //--------------------(40) Any base to Any base Addition --------------------------
    public static void anyBaseAnyBaseAddition() {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = 0;
        int count = 0;
        int c = 0;
        while (n1 > 0 || n2 > 0 || c > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;
            int dig = d1 + d2 + c;
            int rem = dig % b;
            c = dig / b;
            sum = sum + rem * (int) Math.pow(10, count);
            count++;
        }

        System.out.println(sum);
    }

    //--------------------(41) Any base to Any base Substraction --------------------------
    public static void anyBaseAnyBaseSubtraction() {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = 0;
        int count = 0;
        int borrow = 0;
        while (n2 > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;


            int dig = 0;
            d2 = d2 + borrow;
            if (d2 >= d1) {
                borrow = 0;
                dig = d2 - d1;
            } else {
                borrow = -1;
                dig = d2 + b - d1;
            }


            sum = sum + dig * (int) Math.pow(10, count);
            count++;
        }
        System.out.println(sum);
    }

    //--------------------(42) Any base to Any base Multiplication --------------------------
    public static void anyBaseAnyBaseMultiplication() {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int count = 0;
        int sum = 0;
        while (num2 > 0) {
            int val = num2 % 10;
            num2 = num2 / 10;
            int mul = getMultipliedValue(num1, val, b, count);
            sum = anyBaseAnyBaseAdditionHelper(b, sum, mul * (int) Math.pow(10, count));
            count++;
        }
        System.out.println(sum);
    }

    public static int anyBaseAnyBaseAdditionHelper(int b, int n1, int n2) {
        int sum = 0;
        int count = 0;
        int carry = 0;
        while (n1 > 0 || n2 > 0 || carry > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;
            int dig = d1 + d2 + carry;
            int rem = dig % b;
            carry = dig / b;
            sum = sum + rem * (int) Math.pow(10, count);
            count++;
        }
        return sum;
    }

    public static int getMultipliedValue(int n, int val, int b, int multi) {
        int temp = n;
        int sum = 0;
        int count = 0;
        int carry = 0;
        while (temp > 0 || carry != 0) {
            int dig = temp % 10;
            temp = temp / 10;
            int num = dig * val + carry;
            int rem = num % b;
            int q = num / b;
            carry = q;
            sum = sum + rem * (int) Math.pow(10, count);
            count++;
        }
        return sum;
    }

//-------------------------------------------------------------------
//--------------------(43) Array --------------------------

    public static void learnArray() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println(arr);
    }

    //--------------------(44)Span in Array --------------------------
    public static void spanInArray() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxi) {
                maxi = arr[i];
            }
            if (arr[i] < mini) {
                mini = arr[i];
            }
        }
        int span = maxi - mini;
        System.out.println(span);
    }

    //--------------------(45)Span in Array --------------------------
    public static void findEleInArray() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = sc.nextInt();
        int[] arr = new int[n];
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                ans = i;
            }
        }
        System.out.println(ans);
    }

    //--------------------(46)barChanrt By Array --------------------------
    public static void printBarChart() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxi) {
                maxi = arr[i];
            }
        }

        System.out.println(maxi);

        for (int i = maxi; i > 0; i--) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] >= i) {
                    System.out.print("\t *");
                } else {
                    System.out.print("\t ");
                }
            }
            System.out.println();
        }
    }

    //--------------------(46) Direct Sum Of two Array --------------------------
    public static void sumOfTwoArray() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int n1 = sc.nextInt();
        int[] arr2 = new int[n1];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] ans = new int[n1];
        int i = 0;
        int j = 0;
        if (n1 == n) {
            while (i != n1) {
                ans[i] = arr[i] + arr2[j];
                i++;
                j++;
            }
        } else if (n > n1) {
            while (i != n1) {
                ans[i] = arr[i] + arr2[j];
                i++;
                j++;
            }
            if (j < n) {
                while (j != n) {
                    ans[j] = arr[j];
                    j++;
                }
            }
        } else {
            while (i != n) {
                ans[i] = arr[i] + arr2[j];
                i++;
                j++;
            }
            if (j < n1) {
                while (j != n1) {
                    ans[j] = arr2[j];
                    j++;
                }
            }
        }

        for (int l = 0; l < n1; l++) {
            System.out.println(ans[l]);
        }

    }

    //--------------------(47) Sum Of two Array --------------------------
    public static void sumOfTwoArrayWithCarry() {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] ans = new int[n1 > n2 ? n1 : n2];

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = ans.length - 1;
        int c = 0;
        int sum = 0;
        while (k != 0) {
            sum = c;
            if (i >= 0) {
                sum = sum + arr1[i];
            }
            if (j >= 0) {
                sum = sum + arr2[j];
            }
            c = sum / 10;
            int dig = sum % 10;
            ans[k] = dig;
            j--;
            i--;
            k--;
        }

        if (c != 0) {
            System.out.println(c);
        }
        for (int m = 0; m < ans.length; m++) {
            System.out.println(ans[m]);
        }

    }

    //--------------------(48) DIff Of two Array --------------------------
    public static void subOftwoArray() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr1 = new int[a];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        int b = sc.nextInt();
        int[] arr2 = new int[b];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }


        int[] ans = new int[b];


        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = ans.length - 1;
        int borrow = 0;

        while (k >= 0) {
            int dig = 0;
            int valA = i >= 0 ? arr1[i] : 0;

            if (arr2[j] + borrow >= valA) {
                dig = arr2[j] + borrow - valA;
            } else {
                dig = arr2[j] + 10 + borrow - valA;
                borrow = -1;
            }

            ans[k] = dig;
            i--;
            j--;
            k--;

        }
        int idx = 0;
        while (idx < ans.length) {
            if (ans[idx] == 0) {
                idx++;
            } else {
                break;
            }
        }

        for (int m = idx; m < ans.length; m++) {

            System.out.println(ans[m]);
        }
    }

    //--------------------(49) Check Stack--------------------------
    public static void checkStack() {
        Stack<Integer> st = new Stack<>();
        st.push(30);
        System.out.println(st);
        st.push(20);
        st.push(10);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.peek();

    }

    //--------------------(50) Check bracket--------------------------
    public static void checkBracket() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')') {
                if (st.peek() == '(') {
                    System.out.println(true);
                    return;
                } else {
                    while (st.peek() != '(') {
                        st.pop();
                    }
                    st.pop();

                }
            } else {
                st.push(ch);
            }
        }

        System.out.println(false);
    }

    //-------------------------------(51)Check Balance bracket---------------------------
    public static boolean isOpener(char bracket) {
        String opener = "([{";
        for (int i = 0; i < opener.length(); i++) {
            char ch = opener.charAt(i);
            if (ch == bracket) {
                return true;
            }
        }
        return false;
    }

    public static boolean isCloser(char bracket) {
        String closer = ")]}";
        for (int i = 0; i < closer.length(); i++) {
            char ch = closer.charAt(i);
            if (ch == bracket) {
                return true;
            }
        }
        return false;
    }

    public static char getOpnerBasedOnCloser(char bracket) {
        if (bracket == ')') {
            return '(';
        } else if (bracket == ']') {
            return '[';
        } else {
            return '{';
        }

    }


    public static void checkBalanceBracket() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> sta = new Stack<>();


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (isOpener(ch)) {
                sta.push(ch);
            } else {
                if (sta.isEmpty()) {
                    System.out.println(false);
                    return;
                }
                if (sta.peek() == getOpnerBasedOnCloser(ch)) {
                    sta.pop();
                }

            }
        }

        System.out.println(sta.isEmpty());
    }
//*************************************************************

    //--------------------(52) First Greater to Right--------------------------
    public static void firstGreater() {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int num = firstGreater(arr, i, arr[i]);
            System.out.println("First areater Number for " + arr[i] + " is " + num);
        }

    }

    public static int firstGreater(int[] arr, int i, int ele) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] > ele) {
                return arr[j];
            }
        }
        return -1;
    }


    //--------------------(53) First Greater to Right by stack--------------------------
    public static void firstGreaterRightByStack() {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = new int[length];
        Stack<Integer> st = new Stack<>();

        st.push(arr[arr.length - 1]);
        ans[arr.length - 1] = -1;

        for (int i = arr.length - 2; i >= 0; i--) {
            while (st.size() != 0 && st.peek() <= arr[i]) {
                st.pop();
            }
            if (st.size() == 0) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }

            st.push(arr[i]);


        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }

    //--------------------(54) SPAN IN STOCK--------------------------
    public static void stockQ() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Stack<Integer> st = new Stack<>();

        int[] ans = new int[n];


        st.push(0);
        ans[0] = 1;

        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                ans[i] = i + 1;
            } else {
                ans[i] = i - st.peek();
            }
            st.push(i);
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.println(ans[i]);
        }
    }

    //--------------------(56) BIGGEST HISTOGRAM --------------------------
    public static void biggestHistogram() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] lb = new int[n];
        int[] rb = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        st.push(arr.length - 1);
        rb[arr.length - 1] = arr.length - 1;

        for (int i = arr.length - 2; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                rb[i] = arr.length;
            } else {
                rb[i] = st.peek();
            }
            st.push(i);
        }

        st = new Stack<>();
        lb[0] = -1;
        st.push(0);
        for (int i = 1; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                lb[i] = -1;
            } else {
                lb[i] = st.peek();
            }
            st.push(i);
        }

        int maxArea = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int width =  rb[i] -lb[i] - 1;
            int area = width * arr[i];
            if (area > maxArea) {
                maxArea = area;
            }
        }

        System.out.println(maxArea);

    }



    public static void main(String[] args) {
        biggestHistogram();

    }

}