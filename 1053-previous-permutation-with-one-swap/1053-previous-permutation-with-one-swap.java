class Solution {
    public int[] prevPermOpt1(int[] arr) {
        int ind=-1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>arr[i+1]){
                ind=i;
                break;
            }
        }
        if(ind==-1)return arr;
        int i=arr.length-1;
        while(i>=0){
            while(arr[i]==arr[i-1]){i--;}
            if(arr[i]<arr[ind]){
                int temp=arr[i];
                arr[i]=arr[ind];
                arr[ind]=temp;
                break;
            }
            i--;
        }
        // for(int i=arr.length-1;i>ind;i--){
        //     if(arr[i]<arr[ind]){
        //         int temp=arr[i];
        //         arr[i]=arr[ind];
        //         arr[ind]=temp;
        //         break;
        //     }
        // }
        return arr;
    }
}