package testarray;
import javax.swing.*;
public class ArrayWork {
    
    public static void main(String [] args){
        int n;
        String [] arrayList;
        //User will be asked to enter the value of n 
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter value for n" , "N Value", JOptionPane.INFORMATION_MESSAGE));
        
        arrayList = new String[n];
        arrayList = InitializeArray(arrayList);
        DisplayArray(arrayList);
        
    }
    
    //User is entering the strings and they are stored in an array
    public static String [] InitializeArray(String [] n){
        for(int i = 0; i < n.length; i++){
            n[i] = JOptionPane.showInputDialog(null, "Enter value for index " + i , "N Value", JOptionPane.INFORMATION_MESSAGE);
        } 
        return n;
    }
    //Sorting the strings and index value
    public static void DisplayArray(String [] list){
        //using stringbuilder to concatenate the output strings
        StringBuilder stringbuilder = new StringBuilder("Index  |  Value");
        
        for(int i = 0; i < list.length; i++){
            stringbuilder.append("\n|   "+ i + "      |      " + list[i]+"   |");
        }
        JOptionPane.showMessageDialog( null,stringbuilder.toString(), "Output", JOptionPane.INFORMATION_MESSAGE);
    }
}
