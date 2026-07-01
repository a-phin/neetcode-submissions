class Solution {

    public String encode(List<String> strs) {
        String str = "";
        for (String s: strs) {
            str += Integer.toString(s.length()) + '#' + s;
        }
        return str;
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<String>();
        int i = 0;
        String len = "";
        while (i < str.length()) {
            if (str.charAt(i) == '#') {
                int length = Integer.parseInt(len);
                i++;
                String s = str.substring(i, i + length);
                i += length;
                strs.add(s);
                len = "";
            } else {
                len += str.charAt(i);
                i++;
            }
        }
        return strs;
    }
}