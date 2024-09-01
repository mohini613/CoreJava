package ArrayListPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class removeDuplicate {
public static void main(String[] args) {
ArrayList<Integer> duplicate=new ArrayList<Integer>();
duplicate.add(5);
duplicate.add(86);
duplicate.add(100);
duplicate.add(35);
duplicate.add(86);
duplicate.add(20);
duplicate.add(34);
duplicate.add(88);
duplicate.add(20);
duplicate.add(5);
duplicate.add(90);
duplicate.add(88);
System.out.println("duplicate num:"+ duplicate);

ArrayList<Integer> noDuplicate=new ArrayList<Integer>();
for (Integer num:duplicate) {
    if (!noDuplicate.contains(num)) {
        noDuplicate.add(num);
    }
}
System.out.println("after removing:" + noDuplicate);
}
}//System.out.println("after removing:"+ duplicate);
//ArrayList<Integer> noDuplicatesIntegers
/*ArrayList<Integer> noDuplicArrayList = new ArrayList<Integer>();
for(Integer num: duplicate) {
	  if (!noDuplicate.contains(num)) {
	        noDuplicate.add(num);
       System.out.println("after removing:"+ duplicate);*/
