// Container With Most Water
//
// You are given an integer array heights where heights[i] represents the height of the ith bar
// Input: height = [1,7,2,5,4,7,3,6]
// Output: 36

public class ContainerWater{
    public static void main(String[] args) {
        int[] heights = {1,7,2,5,4,7,3,6};
        int water = containerWater(heights);
        System.out.println("Container with most water = "+water);
    }

    public static int containerWater(int[] a)
    {
        int left=0;
        int right=a.length-1;
        int maxArea = 0;
        while(left<right){
            int min = Math.min(a[left],a[right]);
            int curArea = min*(right-left);
            maxArea = Math.max(maxArea,curArea);
            if(a[left]<a[right])
            {
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }
}