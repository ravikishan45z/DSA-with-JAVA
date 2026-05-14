package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class slidingwindow {
    public static void main(String[] args) {

        // ! Most frequent character in a string.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.nextLine();
        int n = s.length();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        System.out.println(arr);
        int maxfreq = -1;
        char ans = s.charAt(0);
        int i = 0, j = 0;

        // ? this block of code for counting the max occurence form "1 to last - 1"
        while (j < n) {
            if (arr[i] == arr[j]) {
                j++;
            } else {
                int freq = j - i;
                if (freq > maxfreq) {
                    maxfreq = freq;
                    ans = arr[i];
                }
                i = j;
            }
        }
        // ! This block of code for counting the max occurencr at last position.
        int freq = j - i;
        if (freq > maxfreq) {
            maxfreq = freq;
            ans = arr[i];
        }
        System.out.println(ans);

        sc.close();
    }
}

class another_method {
    //using hashmap
    public static void main(String[] args) {
        //!usong the array method of Integer. --->>
        Scanner sc = new Scanner(System.in);
        String s = "ravikishannn";
        int n = s.length();
        int maxfreq = 0;
        char ans = s.charAt(0);
        
        int[] arr = new int[26];
        for(int i = 0; i<n;i++){
            char ch = s.charAt(i);
            int index = ch - 97;
            arr[index]++;
        }
        for(int i = 0; i<26;i++){
            if(arr[i]> maxfreq){
                maxfreq = arr[i];
                ans = (char)(i+97);
            }
        }
        System.out.println(ans);

        sc.close();
    }
}
