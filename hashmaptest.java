
import java.util.HashMap;
import java.util.Map.Entry;


import java.util.*;

public class hashmaptest {

    public static void main(String[] args) {

        Map <String,Integer> numbers=new HashMap<>();

        numbers.put("One",10);
        numbers.put("Two",20);
        numbers.put("Three",30);
        System.out.println(numbers.entrySet());

        for(Map.Entry m:numbers.entrySet()){
            System.out.println(m.getKey()+"  "+m.getValue());
        
            }

            Set<Entry<String,Integer>> entris=numbers.entrySet();
            for(Entry <String,Integer> entry:entris)
            {
                entry.setValue(entry.getValue()*100);
            }

            System.out.println(numbers);






        

    }
    
}
