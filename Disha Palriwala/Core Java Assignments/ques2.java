package com.company;
public class ques2 {
    static int[] b_nums = {0,1,1,0,1,1,0,1,0,0};
    public static void sort() {
        int zeros = 0;
        int k;
        for (int i = 0; i < b_nums.length; i++) {
            if (b_nums[i] == 0) {
                zeros++;
            }
        }
            for (k = 0; k < zeros; k++) {
                b_nums[k] = 0;
            }
            for (k = zeros; k < b_nums.length; k++) {
                b_nums[k] = 1;
            }
        }
        public static void main (String[]args){
            sort();
            for (int j = 0; j < b_nums.length; j++) {
                System.out.println(b_nums[j] + " ");
            }
        }
    }