public class returnNcopiesOfOriginalString {

    public static void main(String[] args) {
        System.out.println(stringTimes("Hi", 5));
        System.out.println(stringTimes("Jelly Bean ", 3));
        System.out.println(stringTimes("Yes", 4));
        System.out.println(stringTimes("No", 20));
    }

    public static String stringTimes(String str, int n) {

        int frontLen = Math.min(20, str.length());
        String front = str.substring(0, frontLen);

        StringBuilder sb = new StringBuilder(front.length() * n);
        for (int i = 0; i < n; ++i) {
            sb.append(front);
        }
        return sb.toString();
    }
}
