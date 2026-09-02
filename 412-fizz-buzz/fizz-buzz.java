class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> maps = new ArrayList<>();
        for(int i  = 1 ; i<=n ; i++){
            if(i%15==0){
                maps.add("FizzBuzz");
            }
            else if(i%3==0){
                maps.add("Fizz");
            }
            else if(i%5==0){
                maps.add("Buzz");
            }
            else{
                maps.add(String.valueOf(i));;
            }
        }
        return maps;
    }
}