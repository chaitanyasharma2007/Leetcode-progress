class Solution {
    public int findDuplicate(int[] nums) {
        // aisa socho ki sab elements eek dusre ko point kar raheee hai , agar koi number 2 baar point hogya toh wo number duplicate hai , also isme pakka cycle banega waha par jaha  2 baar point ho raha hai 
        // matlab cycle ka starting element dhoondna hai

        int slow = 0;
        int fast = 0 ;
        while(true){
            slow = nums[slow];
            fast = nums[fast];
            fast = nums[fast];

            if(slow == fast){
                slow = 0;
                while(slow!=fast){
                    slow = nums[slow];
                    fast= nums[fast];

                }
                return slow;
            }
        }
    

    }
}