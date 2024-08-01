package BinarySearchProblems.BinarySearch6;

public class KokoEatingBanana_ {
    public static int maxnum(int arr[]){
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i = 0 ; i < n ; i ++){
            max = Math.max(max,arr[i]);
        }    return max;
    }

    public static double cal_total_hours(int arr[], int hourly){
        double totalh = 0;
        int  n = arr.length;
        for(int i = 0 ; i < n ; i++ ){
            totalh = totalh + Math.ceil((double)(arr[i])/(double)(hourly));
        } 
        return totalh;
    }

    public static int min_rate_to_eat_banana(int arr[] , int h){
        int maxi = maxnum(arr);
        for (int i = 1; i <= maxi; i++) {
            double reqTime = cal_total_hours(arr, i);
            if (reqTime <= h) {
                return i;
            }
        }

        return maxi;
    }
    public static void main(String[] args) {
        int[] arr = {7, 15, 6, 3};
        int h = 8;
        int ans = min_rate_to_eat_banana(arr, h);
        System.out.println("Koko should eat at least " + ans + " bananas/hr.");
    }



}
