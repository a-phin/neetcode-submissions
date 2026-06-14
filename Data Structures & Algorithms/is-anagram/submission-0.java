class Solution {
    public boolean isAnagram(String s, String t) {
        Hashtable<Character, Integer> sChars = new Hashtable<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (sChars.containsKey(s.charAt(i))) {
                sChars.replace(s.charAt(i), sChars.get(s.charAt(i)) + 1);
            } else {
                sChars.put(s.charAt(i), 1);
            }
        }
        Hashtable<Character, Integer> tChars = new Hashtable<Character, Integer>();
        for (int i = 0; i < t.length(); i++) {
            if (tChars.containsKey(t.charAt(i))) {
                tChars.replace(t.charAt(i), tChars.get(t.charAt(i)) + 1);
            } else {
                tChars.put(t.charAt(i), 1);
            }
        }
        if (sChars.equals(tChars)) {
            return true;
        } else {
            return false;
        }
    }
}
