class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        List<String> temp = new ArrayList<>();

        if(strs.length == 0 || strs == null) {
            return list;
        }

        temp.add(strs[0]);
        list.add(temp);

        for(int j = 1; j < strs.length; j++) {
            String word = strs[j];
            Boolean found = false;
            for(int i = 0; i < list.size(); i++) {
                if(isAnagram(word,list.get(i).get(0))) {
                    found = true;
                    list.get(i).add(word);
                    break;
                }
            }
            if(!found) {
                List<String> tempList = new ArrayList<>();
                tempList.add(word);
                list.add(tempList);
            }
        }
        return list;
    }
    public boolean isAnagram(String word1, String word2) {
        if(word1.length() != word2.length()) {
            return false;
        }

        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);
        for(int i = 0; i < chars1.length; i++) {
            if(chars1[i] != chars2[i]) {
                return false;
            }
        }
        return true;
    }
}