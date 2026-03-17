class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
       List<List<Integer>> resultList = new ArrayList<>();
       boolean[]  taken = new boolean[nums.length];
        List<Integer> temp = new ArrayList<>();
        backtrack(resultList, temp, nums, taken);
        return resultList;
    }
    private void backtrack(List<List<Integer>> resultList, List<Integer> temp, int[] nums, 
    boolean[] taken) {
        if (temp.size() == nums.length) {
            if(!resultList.contains(temp)){
            resultList.add(new ArrayList<>(temp));
            return;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(taken[i]){
                continue;
            }
            temp.add(nums[i]); 
            taken[i] = true;
            backtrack(resultList, temp, nums, taken);   
            temp.remove(temp.size() - 1); // Backtrack
            taken[i] = false;
        }
    }
}