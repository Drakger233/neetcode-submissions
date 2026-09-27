class TimeMap {
    //initial default data type
    static class Record{
        int timestamp;
        String value;

        Record(String value, int timestamp){
            this.value = value;
            this.timestamp = timestamp;
        }
    }
    //member variable
    private Map<String, List<Record>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)){
            map.put(key,new ArrayList<>());
        }
        map.get(key).add(new Record(value,timestamp));
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)){
            return "";
        }

        List<Record> records = map.get(key);
        int left = 0;
        int right = records.size() - 1;
        int ans = -1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(records.get(mid).timestamp <= timestamp){
                ans = mid;
                left = mid+ 1;
            }else{
                right = mid - 1;
            }
        }
          if (ans == -1) {
        return "";
    }
        return records.get(ans).value;
    }
}
