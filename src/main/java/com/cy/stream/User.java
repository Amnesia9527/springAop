package com.cy.stream;

import java.util.Arrays;

/**
 * @Auther: xiaocai
 * @Date: 2019/11/4 18:05
 * @Description:
 */
public class User {

    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1;i++){
            for (int j = 0;j < arr.length-i-1;j++){
                int temp;
                if(arr[j+1]>arr[j]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,90,33,43,22};
        bubbleSort(arr);
    }
}
