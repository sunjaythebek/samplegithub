import java.util.HashSet;
import java.util.Iterator;


public class hashtest{

public static void main(String[] args) {

    HashSet<Integer> set=new HashSet<>();
    set.add(11);
    set.add(12);
    set.add(13);
    set.add(15);
    
    System.out.println(set);
    if(set.contains(11))
    {
        System.out.println("Contain value 11");
    }
    if(!set.contains(14))
    {
        System.out.println("Does not contain 14");

    }
    Iterator it=set.iterator();
    while (it.hasNext()) {
        System.out.println(it.next());
        
    }
    
}


}