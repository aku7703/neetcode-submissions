class Solution {
    public boolean isAnagram(String s, String t) {
        int ind;

        if (s.length() != t.length()) {
            return false;
        }
        for (char c : s.toCharArray()) {
            if (t.contains(Character.toString(c))) {
                ind = t.indexOf(Character.toString(c));
                t = t.substring(0, ind) + t.substring(ind +1);
            } else {
                return false;
            }
        }
        return true;
    }
}
