/*
Sap xep tang dan
 */
package sapxepsimple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortSimple {
    public static void main(String [] agrs){
        List<String> stringList = new ArrayList<String>();
        
        stringList.add("f");
        stringList.add("a");
        stringList.add("c");
        stringList.add("b");
        
        System.out.println("Sap ky tu: ");
        Collections.sort(stringList);
        for(String s : stringList){
            System.out.println(s);
        }
        
        List<Integer> listInteger = new ArrayList<Integer>();
        
        listInteger.add(2);
        listInteger.add(1);
        listInteger.add(4);
        listInteger.add(3);
        
        System.out.println("Sap xep so:");
        Collections.sort(listInteger);
        for(Integer i : listInteger){
            System.out.println(i);
        }
        
    }
    
}
