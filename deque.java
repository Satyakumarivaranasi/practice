public static void main(String[] args) {
        // Create a Deque and add elements
        Deque<Integer> deque = new ArrayDeque<>();
        
        // Adding elements at the end of the deque
        deque.add(111);
        deque.add(70);
        deque.add(50);
        System.out.println("Deque after adding elements at the end: " + deque);
        
        // Adding elements at the beginning of the deque
        deque.addFirst(100);
        deque.addLast(20);
        System.out.println("Deque after adding elements at the beginning and end: " + deque);
        
        // Accessing elements
        System.out.println("First element: " + deque.getFirst());
        System.out.println("Last element: " + deque.getLast());
        
        // Removing elements
        deque.removeFirst(); // removes 0
        deque.removeLast(); // removes 4
        System.out.println("Deque after removing first and last elements: " + deque);
        
        // Iterating through the deque
        System.out.println("Iterating through the deque:");
        for (int num : deque) {
            System.out.println(num);
        }
    }
}
