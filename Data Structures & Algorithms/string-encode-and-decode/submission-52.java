class Solution {

    public String encode(List<String> strs) {
        if (strs.isEmpty()) {
            return "😡";
        }
        return String.join("😭", strs);
    }
    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        if (str.equals("😡")) {
            return new ArrayList<>();
        }
        String[] lsStr = str.split("😭", -1);
        for (String s : lsStr){
            res.add(s);
        }
        return res;
    }
}
 