public class returnNcopiesOfOriginalString {

    public static void main(String[] args) {
        System.out.println(stringTimes("Hi", 5));
        System.out.println(stringTimes("Jelly Bean ", 3));
        System.out.println(stringTimes("Yes", 4));
        System.out.println(stringTimes("No", 20));
    }

    public static String stringTimes(String str, int n) {

        int wordLen = Math.min(20, str.length());
        String wd = str.substring(0, wordLen);

        StringBuilder sb = new StringBuilder(wd.length() * n);
        for (int i = 0; i < n; i++) {
            sb.append(wd);
        }
        return sb.toString();
    }

    public static String stringTimesOne(String str, int n) {
            String result = "";
            for (int i=0; i<n; i++) {
                result += str;
            }
            return result;
        }
    }

