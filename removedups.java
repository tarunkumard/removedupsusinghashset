package Q2_01_Remove_Dups;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class removedups {
    public static void main(String[] argv) {
        List<String> list1 = new ArrayList<String>();
        list1.add("tarun");
        list1.add("tarun");
        list1.add("tarun");
        list1.add("tarun");
        list1.add("tarun");
        list1.add("mitali");
        list1.add("rumit");
        list1.add("almighty");
        list1.add("rumit");
        list1.add("tarun");
        list1.add("mitali");
        HashSet<String> set1 = new HashSet<String>(list1);
        List<String> list2 = new ArrayList<String>(set1);
        for(Object obj: list2)
        {
            System.out.println("After removing duplicates :" +list2);
        }

    }
}
