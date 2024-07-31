import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        // Create a TreeSet and add elements
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(7);
        treeSet.add(8);
        treeSet.add(10);
        
        System.out.println("Original TreeSet: " + treeSet);
        
        // Specify the element
        int specifiedElement = 6;
        
        // Remove all elements greater than the specified element
        removeElementsGreaterThan(treeSet, specifiedElement);
        
        System.out.println("TreeSet after removing elements greater than " + specifiedElement + ": " + treeSet);
    }

    public static void removeElementsGreaterThan(TreeSet<Integer> treeSet, int specifiedElement) {
        // Create an iterator
        Iterator<Integer> iterator = treeSet.iterator();
        
        // Iterate through the TreeSet
        while (iterator.hasNext()) {
            int currentElement = iterator.next();
            // If the current element is greater than the specified element, remove it
            if (currentElement > specifiedElement) {
                iterator.remove();
            }
        }
    }
}
