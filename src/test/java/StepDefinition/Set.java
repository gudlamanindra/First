package StepDefinition;
import java.util.HashSet;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {
    HashSet<Integer> hashSet= new HashSet<Integer>();
    hashSet.add(45);
    hashSet.add(98);
    hashSet.add(98);
    hashSet.add(98);
    hashSet.add(55);
    hashSet.add(66);
    hashSet.add(48);
    hashSet.add(71);
    hashSet.add(22);
    for(int element:hashSet) {
    	System.out.println(element+" ");
    }
    TreeSet<Integer> treeSet= new TreeSet<Integer>();
    treeSet.add(53);
    treeSet.add(62);
    treeSet.add(81);
    treeSet.add(38);
    treeSet.add(37);
    treeSet.add(68);
    treeSet.add(89);
    treeSet.add(73);
    for(int element:treeSet) {
    	System.out.println(element+" ");
    }
	
	}

}
