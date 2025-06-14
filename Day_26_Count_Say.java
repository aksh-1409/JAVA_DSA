class Day_26_Count_Say{

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Count and Say term " + n + ": " + countAndSay(n));
    }

    static String countAndSay(int n) {
       
        String result = "1";

        for (int i = 2; i <= n; i++) {
            StringBuilder current = new StringBuilder();
            
            int count = 1;

            for (int j = 1; j < result.length(); j++) {
                if (result.charAt(j) == result.charAt(j - 1)) {
                    count++;
                } else {
                    current.append(count).append(result.charAt(j - 1));
                    count = 1;
                }
            }

            current.append(count).append(result.charAt(result.length() - 1));
            result = current.toString();
        }

        return result;
    }

}
