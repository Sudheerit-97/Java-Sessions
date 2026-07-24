package mapconcept;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadCheck {

	
		public static void main(String[] args) throws InterruptedException {
	        int numberOfThreads = 5;
	        int itemsPerThread = 1000;
	        int expectedTotalSize = numberOfThreads * itemsPerThread; // Should be 5000

	        // 1. Testing HASHTABLE
	        Map<String, String> hashtable = new Hashtable<>();
	        runMultiThreadedTest(hashtable, numberOfThreads, itemsPerThread);
	        System.out.println("Hashtable Expected Size: " + expectedTotalSize);
	        System.out.println("Hashtable Actual Size:   " + hashtable.size());

	        System.out.println("------------------------------------");

	        // 2. Testing HASHMAP
	        Map<String, String> map = new HashMap<>();
	        runMultiThreadedTest(map, numberOfThreads, itemsPerThread);
	        System.out.println("HashMap Expected Size:   " + expectedTotalSize);
	        System.out.println("HashMap Actual Size:     " + map.size());
	    }

	    private static void runMultiThreadedTest(Map<String, String> map, int threadCount, int itemsPerThread) throws InterruptedException {
	        ExecutorService executor = Executors.newFixedThreadPool(threadCount);

	        for (int t = 0; t < threadCount; t++) {
	            final int threadId = t;
	            executor.execute(() -> {
	                for (int i = 0; i < itemsPerThread; i++) {
	                    // Generate a unique key for every single insertion
	                    map.put("Key-" + threadId + "-" + i, "Value");
	                }
	            });
	        }

	        executor.shutdown();
	        executor.awaitTermination(5, TimeUnit.SECONDS);

	}

}
