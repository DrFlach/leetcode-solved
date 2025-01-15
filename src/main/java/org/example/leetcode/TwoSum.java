package org.example.leetcode;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Проходим по массиву
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Проверяем, есть ли уже число в HashMap
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Добавляем текущее число и его индекс в HashMap
            map.put(nums[i], i);
        }
        // Если решения нет, выбрасываем исключение
        throw new IllegalArgumentException("No two sum solution");
    }
}
