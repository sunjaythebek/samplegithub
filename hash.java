import java.util.HashSet;
public class hash{

public static void main(String[] args) {

    HashSet<Integer> set=new HashSet<>();
    set.add(11);
    set.add(12);
    set.add(13);
    
    System.out.println(set);
    if(set.contains(11))
    {
        System.out.println("Contain value 11");
    }
    if(!set.contains(14))
    {
        System.out.println("Does not contain 14");

    }
    
}


}