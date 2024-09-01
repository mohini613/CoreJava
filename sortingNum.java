package ArrayListPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class sortingNum {

	public static void main(String[] args) {
ArrayList<Integer> num= new ArrayList<Integer>();
num.add(2);
num.add(94);
num.add(3);
num.add(9);
num.add(53);
num.add(21);
num.add(82);
num.add(7);
System.out.println("ascending order"+ num);
Collections.sort( num);
//System.out.println(num);
Collections.sort(num,Comparator.reverseOrder());
System.out.println("descending order"+ num);

	}

}
