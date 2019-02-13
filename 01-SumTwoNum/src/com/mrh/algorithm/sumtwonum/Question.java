package com.mrh.algorithm.sumtwonum;

public class Question {
	
	static int[] nums = {2,7,11,15};
	static int target = 9;
	static int[] answer = {0,1};
	
	public static void main(String[] arg) {
		System.out.println("给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。");
		System.out.println("你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。");
		
		int[] result = new int[2];
		Answer01Violence answer1 = new Answer01Violence();
		result = answer1.solve(nums, target);
		System.out.println("answer1 : "+(result[1] == answer[1] && result[0] == answer[0]));
		
		Answer02HashMap answer2 = new Answer02HashMap();
		result = answer2.solve(nums, target);
		System.out.println("answer2 : "+(result[1] == answer[1] && result[0] == answer[0]));
		
		Answer03HashMapOnce answer3 = new Answer03HashMapOnce();
		result = answer3.solve(nums, target);
		System.out.println("answer2 : "+(result[1] == answer[1] && result[0] == answer[0]));
 	}
}
