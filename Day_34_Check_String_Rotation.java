class Day_34_Check_String_Rotation{

    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "cdab";

        boolean isRotation = checkStringRotation(str1, str2);
        System.out.println("Is Rotation: " + isRotation);
    }

    static boolean checkStringRotation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        String result = str1 + str1;

        return result.contains(str2);
    }
}
