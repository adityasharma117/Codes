class Solution {
    public int countWords(String[] words1, String[] words2) {

        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        for (String s : words1) {
            map1.merge(s, 1, Integer::sum);
        }

        for (String s : words2) {
            map2.merge(s, 1, Integer::sum);
        }

        int count = 0;

        for (String s : map2.keySet()) {
            if (map1.getOrDefault(s,0) == 1 && map2.get(s) == 1) {
                count++;
            }
        }

        return count;
    }
}