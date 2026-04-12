package string;

public class string {
    public static void subsequences(String str, int index, String newString) {
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }
        char currentchar = str.charAt(index);
        // to be
        subsequences(str, index + 1, newString + currentchar);
        // not to be
        subsequences(str, index + 1, newString);
    }
    public static void main(String[] args) {
        String str = "abc";
        subsequences(str, 0, "");

    }
}
