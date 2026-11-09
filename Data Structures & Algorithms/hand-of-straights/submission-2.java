class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false;
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : hand) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> minHeap =
            new PriorityQueue<>(map.keySet());

        while (!minHeap.isEmpty()) {
            int start = minHeap.peek();

            for (int i = 0; i < groupSize; i++) {
                int next = start + i;

                if (map.getOrDefault(next, 0) == 0) {
                    return false;
                }

                map.put(next, map.get(next) - 1);

                if (map.get(next) == 0) {
                    if (minHeap.peek() != next) {
                        return false;
                    }
                    minHeap.poll();
                }
            }
        }

        return true;
    }
}