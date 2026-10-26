class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph
                    .toLowerCase()
                    .replaceAll("[^a-z]", " ")
                    .split("\\s+");
        HashMap<String,Integer> map = new HashMap<>();
        Set<String> banSet = new HashSet<>(Arrays.asList(banned));
        for(String word:words){
            if(!banSet.contains(word)){
                map.put(word,map.getOrDefault(word,0)+1);
            }
        }
        String ans="";
        int max=0;

        for(String word:map.keySet()){
            if(map.get(word)>max){
                max=map.get(word);
                ans=word;

            }
        }

      return ans;
    }
    
}