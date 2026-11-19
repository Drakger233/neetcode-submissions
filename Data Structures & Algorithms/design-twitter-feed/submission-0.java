class Twitter {
    private static class Tweet {
        int id; int time; Tweet next;
        Tweet(int id, int time, Tweet next){
            this.id = id;
            this.time = time;
            this.next = next;
        }
    }
    private Map<Integer, Set<Integer>> user_following_list;
    private Map<Integer, Tweet> latestTweet;
    private int time;
    public Twitter() {
        user_following_list = new HashMap<>();
        latestTweet = new HashMap<>();
        time = 0;
    }

    public void follow(int followerId, int followeeId) {
        //avoid self follow
        if(followerId == followeeId)return;
        user_following_list.computeIfAbsent(
            followerId, k -> new HashSet<>()
        ).add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        //copy reference from exist hashmap
        Set<Integer> set = user_following_list.get(followerId);
        if(set!=null){
            set.remove(followeeId);
        }
    }

    public void postTweet(int userId, int tweetId) {
        //linkedlist structure
        Tweet oldHead = latestTweet.get(userId);
        Tweet newHead = new Tweet(tweetId, time++, oldHead);
        latestTweet.put(userId,newHead);
    }
    
    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<Tweet> maxHeap = new PriorityQueue<>(
            (a,b) -> Integer.compare(b.time, a.time)
        );

        //add own tweet
        Tweet own = latestTweet.get(userId);
        if(own != null){
            maxHeap.offer(own);
        }
        //add followee tweet
        //reference
        Set<Integer> users = user_following_list.get(userId);
        if(users != null){
            for(int followee: users){
                Tweet head  = latestTweet.get(followee);

                if(head!=null){
                    maxHeap.offer(head);
                }
            }
        }
        //k merge
        List<Integer> result = new ArrayList<>();

        while(!maxHeap.isEmpty() && result.size() < 10){
            Tweet newest = maxHeap.poll();
            result.add(newest.id);

            if(newest.next!=null){
                maxHeap.offer(newest.next);
            }
        }
        return result;
    }
}
