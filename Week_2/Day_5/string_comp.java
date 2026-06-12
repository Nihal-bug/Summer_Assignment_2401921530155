class Solution {
    public int compress(char[] chars) {

        int write = 0;
        int read = 0;

        while (read < chars.length) {

            char currentChar = chars[read];
            int frequency = 0;

            while (read < chars.length && chars[read] == currentChar) {
                frequency++;
                read++;
            }

            chars[write++] = currentChar;

            if (frequency > 1) {
                String countStr = Integer.toString(frequency);

                for (char digit : countStr.toCharArray()) {
                    chars[write++] = digit;
                }
            }
        }

        return write;
    }
}
