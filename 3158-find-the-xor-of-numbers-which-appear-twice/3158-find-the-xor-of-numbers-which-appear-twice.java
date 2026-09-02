class Solution {
    public int duplicateNumbersXOR(int[] nums) {
       HashSet<Integer> ans=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int cnt=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j])cnt++;
            }
            if(cnt==2){ans.add(nums[i]);}
        }
        int xor=0;
        for(int num:ans){
            xor^=num;
        }
        return xor;

    //   HashSet<Integer> seen = new HashSet<>();
    //     int xor = 0;

    //     for (int num : nums) {
    //         if (seen.contains(num)) {
    //             xor ^= num;
    //         } else {
    //             seen.add(num);
    //         }
    //     }
    //     return xor;

        // Arrays.sort(nums);

        // int xor = 0;
        // for (int i = 1; i < nums.length; i++) {
        //     if (nums[i] == nums[i - 1]) {
        //         xor ^= nums[i];
        //     }
        // }
        // return xor;

    }
}