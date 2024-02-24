public class MedianTwoSorted {
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int m=nums1.length;
            int n=nums2.length;
            int[]res=new int[m+n];
            int i=0,j=0,k=0;
    
            while(i<m && j<n){
                if(nums1[i]<nums2[j]){
                    res[k]=nums1[i];
                    i++;
                }
                else{
                    res[k]=nums2[j];
                    j++;
                }
                k++;
            }
            while(i<m){
                res[k]=nums1[i];
                i++;
                k++;
            }
            while(j<n){
                res[k]=nums2[j];
                j++;
                k++;
            }
            int len=res.length;
            if(len%2==0){
                return (double)(res[len/2]+res[len/2-1])/2;
            }
            return res[len/2];
        }
    }
}
