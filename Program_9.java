package core_java;

// Program 9. Write a Java program to remove elements from an ArrayList.

import java.util.ArrayList;
import java.util.List;
 

public class Program_9 
{
    
    public static void main(String[] args)
    {
        
        List<Integer> al = new ArrayList<>();
 
        
        al.add(5);
        al.add(20);
        al.add(40);
        al.add(7);
        al.add(2);

        System.out.println(al);
 
        al.remove(1);
        al.remove(1);
 
        System.out.println(al);
    }
}
