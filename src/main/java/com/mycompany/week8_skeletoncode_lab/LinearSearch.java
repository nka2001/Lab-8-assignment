/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class LinearSearch {
    
    public static int search(int arr[], int x)
    {
        int n = arr.length; // 1
        
        for(int i = 0; i < n; i++){ // 1, n, n
            if(arr[i] == x){// n
                return arr[i];// 1
            }
        }
        
        return -1;// 1
        
        //4 + 3n 
        //big o = O(n), c = 9, n >= 4
        //big omega = omega(n), n >= 1
        //big theta = theta(n)
        // Todo 01: - complete the implementation of linear search and test your code  
         //         - prvoide asymptotic analysis of the developed solution
    }
    
}
