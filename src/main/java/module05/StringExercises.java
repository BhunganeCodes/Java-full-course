package module05;

public class StringExercises {

    // Exercise 1
    public static String exercise1_extractMiddleName(String fullName) {
        if (fullName.split(" ").length < 3) return "";
        return fullName.substring(fullName.indexOf(" "), fullName.lastIndexOf(" ")).trim();
    }

    // Exercise 2
    public static boolean exercise2_validateIDPrefix(String id) {

        if (id.substring(0, 2).equals("ZA") && id.substring(2).matches("\\d+") && id.substring(2).length() == 4) return true;
        return false;
    }

    // Exercise 3
    public static String exercise3_removeProtocol(String url) {
        String result = url;
        if (url.contains("http://")) {
            result = url.replace("http://", "");
        } else if (url.contains("https://")) {
            result = url.replace("https://", "");
        }
        return result;
    }

    // Exercise 4
    public static boolean exercise4_isPalindrome(String s) {
        String res = s.toLowerCase().trim().replace("\\s+", "");
        String revRes = "";

        for (char ch : res.toCharArray()) {
            revRes = ch + revRes;
        }
        return res.equals(revRes);
    }

    // Exercise 5
    public static String exercise5_formatPhoneNumber(String phone) {

        if (phone.matches("\\d+") && phone.length() == 10) {
            StringBuilder sb = new StringBuilder();
            sb.append("(" + phone.substring(0, 3) + ") ");
            sb.append(phone.substring(3, 6) + "-");
            sb.append(phone.substring(6));
            return sb.toString();
        }
        return "Invalid phone number";
    }

    // Exercise 6
    public static boolean exercise6_validateEmail(String email) {
        if (email.contains("@") && email.indexOf("@") == email.lastIndexOf("@") && (email.endsWith(".org") || email.endsWith(".com"))) return true;
        return false;
    }

    // Exercise 7
    public static String exercise7_capitalizeFirstLetter(String s) {
        if (s.isEmpty() || s == null) return "";
        char firstChar = Character.toUpperCase(s.charAt(0));
        return s.replace(s.charAt(0), firstChar);
    }

    // Exercise 8
    public static String exercise8_extractDomain(String url) {

        if (url.contains("http://")) url = url.replace("http://", "");
        else if (url.contains("https://")) url = url.replace("https://", "");
        String[] res = url.trim().split("/");
        return res[0];
    }
}