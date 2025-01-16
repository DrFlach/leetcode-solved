package org.example.leetcode;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicate {
    public boolean containsDuplicate(int[] nums) {
        // Преобразуем массив в Integer[]
        Integer[] boxedNums = Arrays.stream(nums).boxed().toArray(Integer[]::new);

        // Создаем Set из массива
        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(boxedNums));

        // Проверяем, есть ли дубликаты
        if (set.size() < nums.length) {
            return true; // Если размер Set меньше, значит, есть дубликаты
        } else {
            return false; // Если размер Set равен длине массива, значит, дубликатов нет
        }
    }
}
