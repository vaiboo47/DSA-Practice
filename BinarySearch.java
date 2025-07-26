    // Input: nums = [-1,0,3,5,9,12], target = 9
// Output: 4

// Input: nums = [-1,0,3,5,9,12], target = 2
// Output: -1
public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {41,50,55,69,77,79,86,91,100};
        System.out.println(binarySearch(a, 69));   
    }
    static int binarySearch(int[] a,int target)
    {
        int low=0,high=a.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(a[mid]==target)
                return mid;
            else if(target>a[mid])
                low=mid+1;
            else
                high=mid-1;
        }
        return -1;
    }
}

