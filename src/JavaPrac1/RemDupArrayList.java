package JavaPrac1;

import java.util.ArrayList;
import java.util.HashSet;

public class RemDupArrayList {
    public static void main(String[] args) {
        ArrayList <String> alist=new ArrayList<>();
        alist.add("mj");
        alist.add("john");
        alist.add("mj");

//        System.out.println(alist);
        HashSet <String> set=new HashSet<>(alist);
        System.out.println(set);
    }
}
