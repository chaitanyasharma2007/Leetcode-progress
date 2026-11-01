class Solution {
    public int[][] merge(int[][] intervals) {
        //sort the array make a list to store the new ans
        //start and end according to the intervals
        //if end1 >= start2
        //start1=satrt1 , end 1 = max(end1 , end2) continue;
        //add new start1 and end1
        //start1 =start 2
        //end 1= end 2
        // add that start 1 and end 1
        //return the ans as array
    Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
    List <int[]> ans = new ArrayList<>();
    int n = intervals.length;
    int s1 = intervals[0][0];
    int e1 = intervals[0][1];
    for(int i =0 ; i< n ; i++){
        int s2 = intervals[i][0];
        int e2 = intervals[i][1];
        if(e1>=s2){
            s1= s1;
            e1 = Math.max(e1,e2);
           continue;
        }
         ans.add(new int[]{s1,e1});
         s1 = s2;
         e1 = e2;


    }
    ans.add(new int[]{s1,e1});
    return ans.toArray(new int[ans.size()][]);
        
    }
}
