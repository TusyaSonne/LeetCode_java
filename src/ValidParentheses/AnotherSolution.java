package ValidParentheses;

public class AnotherSolution {
    public boolean isValid(String s) {
        while (true) {
            if (s.contains("[]")) {
                s.replace("[]", "");
            }
            if (s.contains("{}")) {
                s.replace("{}", "");
            }
            if (s.contains("()")) {
                s.replace("()", "");
            }
            else {
                return s.isEmpty();
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "";
        System.out.println(solution.isValid(s));

    }
}
