package org.example.leetcode;

public class Palindrome {
    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        } else {
            String str = String.valueOf(x);
            String reverse = new StringBuilder(str).reverse().toString();
            return str.equals(reverse);
        }
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(121));
    }
}
