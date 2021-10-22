/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class BinarySearch {

    public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) { 
        int index = Integer.MAX_VALUE;// 1

        while (low <= high) {// n
            int mid = low + ((high - low) / 2);//1
            if (sortedArray[mid] < key) {//n
                low = mid + 1;//1
            } else if (sortedArray[mid] > key) {//n
                high = mid - 1;//1
            } else if (sortedArray[mid] == key) {//n
                index = mid;//1
                break;//1
            }
        }
        return index;//1
    }
    //ToDo 2: Call the above method and test the algorithm  
    // provide time and space analysis 
    //time complexity: O(log n)
    //space Complexity: O(n)
   
}
