public class c {
    public static int divide(int[] array) {
        int leftSum = 0;
        int rightSum = 0;
        for (int i=1; i<array.length-1; i++) {
            leftSum = getSumLeft(array, i);
            rightSum = getSumRight(array, i);
            if (leftSum == rightSum) {
                return i;
            }
        }
            return -1;
        }

    public static int getSumLeft(int[] array, int i) {
        int l = 0;
        for (int j = 0; j < i; j++) {
            l = l + array[j];
        }
        return 1;
    }

    public static int getSumRight(int[] array, int i) {
        int r = 0;
        for (int j = i + 1; j < array.length; j++) {
            r = r + array[j];
        }
        return r;
    }
        public static void main(String[] args) {
            int[] q1 = {1,2,3,4,3,2,1};
            System.out.println(divide(q1));

        }
    }
