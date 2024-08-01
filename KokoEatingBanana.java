package BinarySearchProblems.BinarySearch6;

public class KokoEatingBanana {
    //finding maximum
    public static int findmax(int arr[]){
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i = 0 ; i < n ;i++){
            max = Math.max(max,arr[i]);
        }return max;
    }
    //find total hours
    public static double cal_total_hours(int arr[], int hourly){
        double totalh = 0 ;
        int n = arr.length;
        for(int i = 0 ; i < n ;i++ ){
            totalh = totalh + Math.ceil((double)(arr[i]) / (double)(hourly));
        }
        return totalh;
    }   
    //binary search
    public static int minimumRateToEatBananas(int[] arr, int h) {
        int low = 1, high = findmax(arr);

        //apply binary search:
        while (low <= high) {
            int mid = (low + high) / 2;
            double totalH = cal_total_hours(arr, mid);
            if (totalH <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {7, 15, 6, 3};
        int h = 8;
        int ans = minimumRateToEatBananas(arr, h);
        System.out.println("Koko should eat at least " + ans + " bananas/hr.");
    } 
}
