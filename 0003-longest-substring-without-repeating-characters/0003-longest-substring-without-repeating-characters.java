class Solution {
    public int lengthOfLongestSubstring(String s) {
     int[] lastSeen = new int[128];
Arrays.fill(lastSeen, -1);

int left = 0;
int right = 0;
int maxLength = 0;

while (right < s.length()) {
    char ch = s.charAt(right);

    if (lastSeen[ch] >= left) {
        left = lastSeen[ch] + 1;
    }

    lastSeen[ch] = right;

    maxLength = Math.max(maxLength, right - left + 1);

    right++;
}
return maxLength;
    }
}