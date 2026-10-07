class Solution {
    public int[] sortByReflection(int[] nums) {
        Integer[] arr=new Integer[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        Arrays.sort(arr,(a,b)->{
            int ra=refl(a);
            int rb=refl(b);
            if(ra!=rb){
                return Integer.compare(ra,rb);
            }
            else{
                return Integer.compare(a,b);
            }
        });
         for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }
        return nums;
    }
    int refl(int n){
        String str=Integer.toBinaryString(n);
        String rev=new StringBuilder(str).reverse().toString();
        return Integer.parseInt(rev,2);
    }
}