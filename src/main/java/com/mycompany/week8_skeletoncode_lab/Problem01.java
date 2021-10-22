/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {
    
    public static long getSumOfPrimes(int n){
        
        long sum = 0; //1
        int count;//1
        
        for(int i = 2; i <= n; i++){ //1, n, n
           count = 0; //1
          
           for(int j = 2; j <= i/2; j++){//1, n, n
              
               if(i % j == 0){// 1
                   count++;//1
               }
               
           }
           if(count == 0 && i != 1){
               sum = sum + i;
           }
        }
           
        
        return sum;
        
        
        
    // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
    //          Test your solution
    //          Analyze its space and time  
                //Time Complexity: O(n^2)
                //Space Complexity: O(n^2)
    }
    
}
