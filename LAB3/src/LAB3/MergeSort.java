package LAB3;

public class MergeSort {
    public static void main(String[] args) {
        int[] intArr01 = {1, 2, 4, 78, 344};
        int[] intArr02 = {3, 4, 89, 100, 346, 1000};
        int[] merArr = new int[11];

        for (int i = 0; i < intArr01.length; i++) {
            for (int j = 0; j < intArr02.length; j++){
                if (intArr01[i] > intArr02[j]) {
                    merArr[i++] = intArr01[i++];
                }
            }
        }


        for (int i = 0; i < intArr01.length; i++) {
            for (int j = 0; j < intArr02.length; j++){
                if (intArr02[j] > intArr01[i]) {
                    merArr[i++] = intArr02[j++];
                }
            }
        }

        System.out.println("Array After Bubble Sort");
        for (int i = 0; i < merArr.length; i++) {
            System.out.print(merArr[i] + " ");
        }

    }
}
