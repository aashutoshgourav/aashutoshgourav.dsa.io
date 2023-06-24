class NumberUtils {
    public static int[] addOneToArray(int[] digits) {
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] += carry;
            carry = digits[i] / 10;
            digits[i] %= 10;
        }

        if (carry == 0) {
            return digits;
        } else {
            int[] result = new int[digits.length + 1];
            result[0] = carry;
            System.arraycopy(digits, 0, result, 1, digits.length);
            return result;
        }
    }

    public static void main(String[] args) {
        int[] digits = { 1, 2, 3 };

        System.out.print("Original Number: ");
        printArray(digits);

        int[] result = addOneToArray(digits);

        System.out.print("Modified Number: ");
        printArray(result);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
