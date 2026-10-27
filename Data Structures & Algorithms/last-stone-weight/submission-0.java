class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> mh = new PriorityQueue<>();
        for( int s : stones){
            mh.offer(-s);
        }
        while(mh.size()>1){
            int first=mh.poll();
            int second=mh.poll();
            if(second>first){
                mh.offer(first - second);
            }
        }
    mh.offer(0);
    return Math.abs(mh.peek());


        
    }
}
