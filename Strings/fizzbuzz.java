public class fizzbuzz {
    public static String[] helloWorld(int N) {
        int index = 0;
        String[] result = new String[N];
        for (int i = 1; i <= N; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                result[index] = "HelloWorld";
                index++;
            } else if (i % 5 == 0) {
                result[index] = "World";
                index++;
            } else if (i % 3 == 0) {
                result[index] = "Hello";
                index++;
            } else {
                result[index] = String.valueOf(i);
                index++;
            }
        }
        return result;
    }

    public static void main(String args[]) {
        int N = 15;
        String[] result = helloWorld(N);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
