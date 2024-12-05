package com.kh.practiceEx.arraypre;

import java.util.Arrays;

public class ArraysPre {

    public void int1DArray() {
        int[] arr1 = {10, 300, 20, 50, 7000, 9999};
        int[] arr2 = {10, 300, 20, 50, 7000, 9999};

        //1. Arrays toString을 이용해서 arr1과 arr2출력
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        //2. arr1 오름차순 정렬
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        //3. arr1 안에 모든 값을 500으로 변경
        Arrays.fill(arr1, 500);
        System.out.println(Arrays.toString(arr1));

        //4. arr1과 arr2의 값이 모두 같은지 비교하고 비교한 결과 출력
        boolean a = Arrays.equals(arr1, arr2);
        System.out.println("값이 같은지 비교 : "+a);
    }

    public void String1DArray() {
        String[] arr1 = {"apple", "banana", "cherry", "date", "elderberry"};
        String[] arr2 = {"apple", "banana", "cherry", "date", "elderberry"};

        System.out.println("arr1의 결과 : " + Arrays.toString(arr1));
        System.out.println("arr2의 결과 : " + Arrays.toString(arr2));

        Arrays.sort(arr1);
        System.out.println("arr1 오름차순 정렬 : " + Arrays.toString(arr1));

        Arrays.fill(arr1, "mango");
        System.out.println("arr1 값 모두 mango 변경결과 : " + Arrays.toString(arr1));

        boolean flag = Arrays.equals(arr1, arr2);
        System.out.println("arr1과 arr2의 비교 결과 : "+flag);
    }

    public static void main(String[] args) {
        ArraysPre arrayPre = new ArraysPre();
        arrayPre.int1DArray();
        arrayPre.String1DArray();
    }
}
