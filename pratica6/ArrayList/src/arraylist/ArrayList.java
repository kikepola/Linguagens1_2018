
package arraylist;

import java.util.ArrayList;

public class ArrayList {

    public static void main(String[] args) {
        
       ArrayList<String> arrList = new ArrayList<String>();
       
       arrList.add("Vai 1");
       arrList.add("Vai 2");
       arrList.add("Vai 3");
       arrList.remove("Vai 3");
       
       System.out.println(arrList);
    }
    
}
