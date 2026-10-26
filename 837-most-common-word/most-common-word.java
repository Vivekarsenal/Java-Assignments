class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph
                    .toLowerCase()
                    .replaceAll("[^a-z]", " ")
                    .split("\\s+");
        HashMap<String,Integer> map = new HashMap<>();
        for(String word:words){
            if(!isbanned(word,banned)){
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
    private boolean isbanned(String word,String []banned){
        for(String b:banned){
             if(b.equals(word))return true;
        }
        return false;
    }
}