package strings;

public class substrings {
    public static String substr(String str, int si, int ei) {
        String sub = "";
        for (int i = si; i < ei; i++) {
            sub += str.charAt(i);
        }
        return sub;
    }

    public static void main(String[] args) {
        String str = "helloworld";
        System.out.println(substr(str, 0, 6));
    }
}
