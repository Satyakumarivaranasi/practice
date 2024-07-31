import java.util.*;

public class TopKFrequentWords {
    public static List<String> topKFrequent(String[] words, int k) {
        // Create a HashMap to store the frequency of each word
        HashMap<String, Integer> frequencyMap = new HashMap<>();
        
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        
        // Create a priority queue to keep track of the top K elements
        PriorityQueue<String> heap = new PriorityQueue<>((w1, w2) -> 
            frequencyMap.get(w1).equals(frequencyMap.get(w2)) ? 
            w2.compareTo(w1) : frequencyMap.get(w1) - frequencyMap.get(w2));
        
        // Maintain a heap of size K
        for (String word : frequencyMap.keySet()) {
            heap.offer(word);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        
        // Extract elements from the heap and sort them
        List<String> result = new ArrayList<>();
        while (!heap.isEmpty()) {
            result.add(heap.poll());
        }
        Collections.reverse(result);
        
        return result;
    }
    
    public static void main(String[] args) {
        String[] words = {"i", "love", "coding", "i", "love", "MyCountry"};
        int k = 2;
        System.out.println(topKFrequent(words, k)); // Output: ["i", "love"]
    }
}
