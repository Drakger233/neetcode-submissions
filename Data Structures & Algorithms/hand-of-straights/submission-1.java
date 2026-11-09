class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize != 0) return false;
        Arrays.sort(hand);
        Map<Integer,Integer> map= new HashMap<>();
        for(int num: hand){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num: hand){
            if(map.get(num) == 0){
                continue;
            }
            for(int i = 0;i < groupSize; i++){
                int next = num + i;
                int curFreq = map.getOrDefault(next,0);
                if(curFreq == 0){
                    return false;
                }
                map.put(next,curFreq - 1);
            }
        }
        return true;
    }
}
