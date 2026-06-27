class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(Character ch: s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Character>[] bucket = new ArrayList[s.length()+1];
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            int freq = entry.getValue();
            if(bucket[freq]==null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(entry.getKey());
        } 
        StringBuilder sb = new StringBuilder();
        for(int i=bucket.length-1;i>=1;i--){
            if(bucket[i]!=null){
                for(char ch: bucket[i]){
                    for(int j=0;j<i;j++){
                        sb.append(ch);
                    }
                }
            }
        }
        return sb.toString();
    }
}