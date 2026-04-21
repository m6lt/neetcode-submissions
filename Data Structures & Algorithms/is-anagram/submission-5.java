class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> aMap = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (Character c : s.toCharArray()) {
            if (aMap.containsKey(c)) {
                aMap.put(c, aMap.get(c) + 1);
            }
            else {
                aMap.put(c, 1);
            }
        }
        for (Character c : t.toCharArray()) {
            //case: different character
            if (!aMap.containsKey(c)) {return false;}
            //case: different amount of character
            aMap.put(c, aMap.get(c) -1);
            //too many of the same character in t
            if (aMap.get(c) < 0) {return false;}
        }
        return true;

    }
}
