class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> outerList = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            //sort the word
            char[] inChars = s.toCharArray();
            Arrays.sort(inChars);
            String sortedWord = new String (inChars);
            if (!map.containsKey(sortedWord)){
                map.put(sortedWord, new ArrayList<>());
            }
            List<String> anagrams = map.get(sortedWord);
            if (anagrams != null) {
                anagrams.add(s);
            }
        }
        return new ArrayList<>(map.values());
    }
}
