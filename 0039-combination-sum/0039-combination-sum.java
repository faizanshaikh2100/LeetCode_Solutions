class Solution {
    List<List<Integer>>res=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        combinations(candidates,target,0,new ArrayList<Integer>());
        return res;
    }
    public void combinations(int candidates[],int target,int current,ArrayList<Integer>list){
        //failure case
        if(target<0)return;
        
        //success case
        if(target==0){
            res.add(new ArrayList(list));
            return;
        }

        //case generation
        for(int i=current;i<candidates.length;i++){
            list.add(candidates[i]);
            combinations(candidates,target-candidates[i],i,list);
            list.remove(list.size()-1);
        }
        return;
    }
}