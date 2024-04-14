package RomanToInteger;

public class Solution {
    public static int romanToInt(String s) {
        int itegerRoman = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                if (i + 1 < s.length()) {
                    if (s.charAt(i + 1) == 'V') {
                        itegerRoman += 4;
                        i++;
                        continue;
                    }
                    if (s.charAt(i + 1) == 'X') {
                        itegerRoman += 9;
                        i++;
                        continue;
                    }
                }
                itegerRoman += 1;
            }


            if (s.charAt(i) == 'V') {
                itegerRoman += 5;
            }
            if (s.charAt(i) == 'X') {
                if (i + 1 < s.length()) {
                    if (s.charAt(i + 1) == 'L') {
                        itegerRoman += 40;
                        i++;
                        continue;
                    }
                    if (s.charAt(i + 1) == 'C') {
                        itegerRoman += 90;
                        i++;
                        continue;
                    }
                }
                itegerRoman += 10;
            }

            if (s.charAt(i) == 'L') {
                itegerRoman += 50;
            }
            if (s.charAt(i) == 'C') {
                if (i + 1 < s.length()) {
                    if (s.charAt(i + 1) == 'D') {
                        itegerRoman += 400;
                        i++;
                        continue;
                    }
                    if (s.charAt(i + 1) == 'M') {
                        itegerRoman += 900;
                        i++;
                        continue;
                    }
                }
                itegerRoman += 100;
            }

            if (s.charAt(i) == 'D') {
                itegerRoman += 500;
            }
            if (s.charAt(i) == 'M') {
                itegerRoman += 1000;
            }
        }
        return itegerRoman;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
}
