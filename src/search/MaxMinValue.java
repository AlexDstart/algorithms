package search;

public class MaxMinValue {
    public static void main(String[] args) {
        int [] array = {330,10,33,44,345,234,999,12,1,7,100};
        int maxValue =  funMaxValue(array);
        System.out.println(maxValue);
        int minValue=funMinValue(array);
        System.out.println(minValue);

    }


    public static int funMaxValue (int [] arr){
        int n=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > n){
                n = arr[i];
            }
        }
        return n;
    }


    public static int funMinValue(int[]arr){
        int q=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<q){
                q=arr[i];
            }

        }
        return q;
    }

}
