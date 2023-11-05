# [1. Two Sum](https://leetcode.com/problems/two-sum/)

## 题目

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

```
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
```

## 题目大意

在数组中找到 2 个数之和等于给定值的数字，结果返回 2 个数字在数组中的下标。

## 解题思路

这道题最优的做法时间复杂度是 O(n)。

顺序扫描数组，对每一个元素，在 map 中找能组合给定值的另一半数字，如果找到了，直接返回 2 个数字的下标即可。如果找不到，就把这个数字存入 map 中，等待扫到“另一半”数字的时候，再取出来返回结果。

### Brute Force

One brute force approach is to consider every pair of elements and check if their sum equals the target. This can be done using nested loops, where the outer loop iterates from the first element to the second-to-last element, and the inner loop iterates from the next element to the last element. However, this approach has a time complexity of O(n^2).

### Hash

A more efficient approach is to use a hash table or hashmap. We can iterate through the array once, and for each element, check if the target minus the current element exists in the hash table. If it does, we have found a valid pair of numbers. If not, we add the current element to the hash table.

1. Create an empty hash table to store elements and their indices Iterate through the array from left to right.

2. For each element nums[i], calculate the complement by subtracting it from the target: complement = target - nums[i].
   Check if the complement exists in the hash table. If it does, we have found a solution.

3. If the complement does not exist in the hash table, add the current element nums[i] to the hash table with its index as the value.

4. Repeat steps 3-5 until we find a solution or reach the end of the array.

5. If no solution is found, return an empty array or an appropriate indicator.

6. This approach has a time complexity of O(n) since hash table lookups take constant time on average. It allows us to solve the Two Sum problem efficiently by making just one pass through the array.
