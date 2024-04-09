package recursion;

public class duplicate {

    public static void duplicatenum(String str, int idx, StringBuilder newstr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newstr);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            // duplicate
            duplicatenum(str, idx + 1, newstr, map);
        } else {
            map[currChar - 'a'] = true;
            duplicatenum(str, idx + 1, newstr.append(currChar), map);
        }

    }

    public static void main(String[] args) {

        String str = "ujjwal";
        duplicatenum(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
