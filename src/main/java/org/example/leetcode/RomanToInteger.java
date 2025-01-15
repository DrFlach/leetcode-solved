package org.example.leetcode;

import java.util.HashMap;

public class RomanToInteger {
    public int romanToInt(String s) {
        // Создаем HashMap для сопоставления римских символов с их значениями
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        // Идем с конца строки
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = romanMap.get(currentChar);

            // Если текущее значение меньше предыдущего, вычитаем, иначе добавляем
            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }

            // Обновляем предыдущее значение
            prevValue = currentValue;
        }

        return total;
    }
    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.println(romanToInteger.romanToInt("III"));
    }
}
