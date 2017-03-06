package com.vv.list;

/**
 * Created by vasudvis on 1/26/2017.
 */
public class Test {

    public static void main(String[] args) {
        int[] arr = new int[]{5,1,6,2,7,3,4,1,0};
        System.out.println(isZigZag(arr));
    }

    public static boolean isZigZag(int[] arr){

        for(int i =1; i < arr.length -1; i++){
            if(!((arr[i-1] > arr[i] && arr[i] < arr[i+1]) || (arr[i-1] < arr[i] && arr[i] > arr[i+1]))){
                return false;
            }
        }
        return true;
    }
}
