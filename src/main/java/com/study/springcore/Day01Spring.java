/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.study.springcore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.function.IntFunction;

/**
 *
 * @author User
 */
public class Day01Spring {

    public static void main(String[] args) {
        //int nums[] = {2, 7, 11, 15};
        //int target = 9;
        //int nums[] = {3,2,4};
        //int target = 6;
        int nums[] = {3, 3};
        int target = 6;
        int a[] = new Day01Spring().twoSum(nums, target);
        System.out.print("[");
        for(int i=0;i<a.length;i++){
            System.out.print((i==a.length-1)?a[i]:a[i]+",");
        }
        System.out.print("]");
    }

    public int[] twoSum(int[] nums, int target) { 
        for (int i = 0; i < nums.length; i++) {
            for (int k = i + 1; k < nums.length; k++) {
                if (nums[i] + nums[k] == target) {
                   return new int[]{i,k};
                }
            }
        }
        return null;

    }
}
//示例 1：
//
//输入：nums = [2,7,11,15], target = 9
//输出：[0,1]
//解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
//示例 2：
//
//输入：nums = [3,2,4], target = 6
//输出：[1,2]
//示例 3：

//输入：nums = [3,3], target = 6
//输出：[0,1]
