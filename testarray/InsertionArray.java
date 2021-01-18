package testarray;

import java.util.*;
import javax.swing.JOptionPane;
import static testarray.ArrayWork.InitializeArray;
public class InsertionArray {
     
    public static void main (String[] args)
    {
        int [] intList;
        intList = InitializeArray(new int[10]);
        DisplayArray(intList,"Initital array");
        intList = descendingOrder(intList);
        DisplayArray(intList,"Descending Order");
        intList = ascendingOrder(intList);
        DisplayArray(intList, "Ascending Order");  
    }
    
    //initialize the array using the random number generated
    public static int [] InitializeArray(int [] n){
        Random random = new Random();

        // generate a random integer from 0 to 899, then add 100
        for(int i = 0; i < n.length; i++){
            n[i] = random.nextInt(900) + 100;
        }
         System.out.println("initial "+Arrays.toString(n));
        return n;
    }
    
    //Descending Order method using insertion sort technique
    public static int [] descendingOrder(int [] n){
       int temp, b, a = 1;
        while(a < n.length){
            temp = n[a];
            b = a - 1;
            while(b >= 0 && n[b] < temp){
                n[b + 1] = n[b];
                --b;
            }
            n[b + 1] = temp;
            ++a;
        }
        System.out.println("Descending Order"+Arrays.toString(n));
        return n;
    }
    
    //Ascending Order method using insertion sort technique
    public static int [] ascendingOrder(int [] c){
        int temp, b, a = 1;
        while(a < c.length){
            temp = c[a];
            b = a - 1;
            while(b >= 0 && c[b] > temp){
                c[b + 1] = c[b];
                --b;
            }
            c[b + 1] = temp;
            ++a;
        }
        System.out.println("Ascending Order"+Arrays.toString(c));
        return c;
    }
    
    
    public static void DisplayArray(int [] lst, String type){
        //using stringbuilder to concatenate the output strings
        StringBuilder stringbuilder = new StringBuilder();
        
        for(int i = 0; i < lst.length; i++){
            stringbuilder.append(lst[i]).append("  |  ");
        }
        JOptionPane.showMessageDialog( null,stringbuilder.toString(), type, JOptionPane.INFORMATION_MESSAGE);
    }
}
