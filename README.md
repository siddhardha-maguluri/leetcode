This is a practice repository for commonly asked Leetcode problems in coding interviews. There are many lists out there like [blind75](https://leetcode.com/discuss/general-discussion/460599/blind-75-leetcode-questions), which will help you in  understanding the kind of questions that are commonly asked in interviews but I am using a list from the following [website](https://seanprashad.com/leetcode-patterns/). The problems from blind75 may be repeated in previous list.

I plan to code the solutions for problems in the list in Java and add them on daily basis. 

### 1-April-2023:



### 2-April-2023:


### 7-April-2023:
ascending order: to arrange numbers in increasing order, that is, from smallest to largest. Ex: 1,2,3,4,5
non-decreasing order: every element is greater than or equal to the one before it. Ex: 1,2,2,2,3,4,5

difference b/w ascending order and non-decreasing order:

If you have any number occuring more than once, you can not put them in an ascending order, hence Non-decreasing term is prefered.

Solved 3Sum problem today by learning two pointer apporach. Here's the [wiki](https://en.wikipedia.org/wiki/3SUM) for 3SUM problem. 


### 9-April-2023
Dynamic programming:

Dynamic programming is a technique to solve complex problems by breaking them down into smaller subproblems and solving each subproblem once. The idea is to save the results of each subproblem and use them to solve larger problems.

There are two main types of dynamic programming problems: 
 1. optimization problems: Optimization problems involve finding the best solution to a problem. 
 2. counting problems: counting problems involve counting the number of solutions to a problem.

There are two main approaches to solving dynamic programming problems: 
 1. top-down: The top-down approach involves solving the problem recursively by breaking it down into smaller subproblems. (Memoization).
 2. bottom-up: The bottom-up approach involves solving the problem iteratively by starting with the smallest subproblems and building up to the larger ones. (Tabulation method).


### 18-Aug-2023

[https://leetcode.com/problems/find-smallest-common-element-in-all-rows/description/](https://leetcode.com/problems/find-smallest-common-element-in-all-rows/description/)

<b>Problem statement</b>:
Given an m x n matrix mat where every row is sorted in strictly increasing order, return the smallest common element in all rows.
If there is no common element, return -1.

<b>Sample Input/Output</b>: </br>
<b>Input:</b> mat = [[1,2,3,4,5],[2,4,5,8,10],[3,5,7,9,11],[1,3,5,7,9]] <br>
Output: 5

Approach:


### 20-Sep-2023:
Wanted to focus on Divide-and-Conquer pattern. So, tried the following 2 problems today.

1. [Number of 1 bits](https://leetcode.com/problems/number-of-1-bits/)

<b>Problem statement</b>:
Write a function that takes the binary representation of an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).

<b>Initial approach:</b>
my first intuition is to convert the given number to binary string and count the number of 1 in it.

after reading up about bit manipulation a bit, got to know performing bitwise and(&) operator of number n and n-1 flips the least significant bit. we can 
count the no of 1 bits by performing bitwise & till the number is not equal to zero.

2. [Majority Element](https://leetcode.com/problems/majority-element/)

<b>Problem statement</b>:
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

<b>Basic Approach:</b>

my first intuition is create a hashmap with each key corresponding to element in an array
and value corresponding to count of the element. then by iterating the hashmap, we can compare each value
with n/2 and if it is more than n/2, then we can simply return the key, which is the majority element.

<b>Divide and Conquer approach</b>

<b>Divide:</b> Split the array into 2 equal-sized (or approximately equal-sized) subarrays.

<b>Conquer:</b> Find the majority element in each subarray recursively.

<b>Combine:</b> After finding the majority element in each subarray, check if any element is a majority element in the combined array. If there is a majority element, return it;

[Boyer-Moore majority vote Algorithm](https://en.wikipedia.org/wiki/Boyer%E2%80%93Moore_majority_vote_algorithm) which gives us majority element in an array in linear time and O(1) space complexity.