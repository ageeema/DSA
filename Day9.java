/*Problem: A secret system stores code names in forward order. To display them in mirror format, you must transform the given code name so that its characters appear in the opposite order.

Input:
- Single line: a lowercase string containing only alphabetic characters (no spaces)

Output:
- Print the transformed code name after applying the mirror operation

Example:
Input:
hello

Output:
olleh

Explanation: The first character moves to the last position, the second to the second-last, and so on until the entire string is mirrored
    
} */

import java.util.Scanner;

public class Day9 
{
    void reverse(char s[])
    {
     int left=0;
     int right=s.length-1;
     while(left<right)
     {
         char temp=s[left];
         s[left]=s[right];
         s[right]=temp;
         left++;
         right--;
     }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the code name: ");
        String str=sc.next();
        char[] s=str.toCharArray();
        Day9 obj = new Day9();
        obj.reverse(s);
        System.out.println(new String(s));
    }
}
