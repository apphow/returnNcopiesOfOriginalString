public class returnFirstThreeCharsNTimes {

    public static void main(String[] args) {
        System.out.println(firstThree("Alphabet", 4));
        System.out.println(firstThree("a", 4));
        System.out.println(firstThree("zebra", 3));
        System.out.println(firstThree("carry", 0));
    }

    public static String firstThree(String str, int n) {
        String one = "";
        String two = "";
        if(str.length() < 3) {
            one = str.substring(0, str.length());
        } else {
            one = str.substring(0, 3);
        }
        for(int i = 0; i < n; i++) {
            two += one;
        }
        return two;
    }
}
