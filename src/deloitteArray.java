public class deloitteArray {
        public static void findHighestAbsolutePair(int[] arr) {
            int[] maxPair = null;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (maxPair == null || Math.abs(arr[i]) + Math.abs(arr[j]) > Math.abs(maxPair[0]) + Math.abs(maxPair[1])) {
                        maxPair = new int[]{arr[i], arr[j]};
                    }
                }
            }

            if (maxPair != null) {
                System.out.printf("The returned result is a pair of %d and |%d|\n", maxPair[0], maxPair[1]);
            } else {
                System.out.println("The returned result is information about the lack of pair");
            }
        }

        public static void main(String[] args) {
            int[][] testCases = {
                    {3, 2, -2, 5, -3},
                    {1, 1, 2, -1, 2, -1},
                    {1, 2, 3, -4},
                    {1, 1}
            };

            for (int[] testCase : testCases) {
                findHighestAbsolutePair(testCase);
            }
        }
    }
