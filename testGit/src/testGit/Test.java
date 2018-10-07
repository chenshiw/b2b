package testGit;

import java.util.HashMap;
import java.util.Map;

public class Test {
	
	public static void main(String[] args) {
		System.out.println("git");
		System.out.println("新增一点代码");
		Map map = new HashMap();
		map.put("token", "123456");
	}

	class Solution {
	    public int[] twoSum(int[] nums, int target) {
	        for(int i=0;i<nums.length;i++) {
	        	for(int j=i+1;j<nums.length;j++) {
	        		int target1 = nums[i]+nums[j];
	        		if(target==target1) {
	        			return new int[]{i,j};
	        		}
	        	}
	        }
	        throw  new IllegalAccessError("抛出异常！");
	    }
	}
}
