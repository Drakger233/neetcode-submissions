class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for(char task:tasks){
            freq[task-'A']++;
        }
        PriorityQueue<Integer>heap = new PriorityQueue<>(Collections.reverseOrder());
        for(int count: freq){
            if(count > 0){
                heap.offer(count);
            }
        }
        int times = 0;
        while(!heap.isEmpty()){
            int used = 0;
            List<Integer> remaining = new ArrayList<>();
            for(int i = 0; i < n + 1 && !heap.isEmpty();i++){
                int count = heap.poll() - 1;
                if(count > 0){
                    remaining.add(count);
                }
                used++;
            }
            for(int count:remaining){
                heap.offer(count);
            }
            
            times += heap.isEmpty()? used : n + 1;
        }
        return times;
    }
}
