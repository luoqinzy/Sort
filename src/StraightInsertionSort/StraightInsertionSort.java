package StraightInsertionSort;

public class StraightInsertionSort {
    public static void main(String args[]){

        int a[] = {1, 3, 1, 4, 8, 3, 10, 2};
        InsertionSort(a);
        for (int temp: a) {
            System.out.print(temp + "  ");
        }
    }

    static void InsertionSort(int a[]){
        for (int i = 1; i < a.length; i++){
            if (a[i] < a[i - 1]){
                int temp = a[i];
                int j = i - 1;
                while (j >= 0 && temp < a[j]){
                    a[j + 1] = a[j];
                    j --;
                }
                a[j + 1] = temp;
            }
        }
    }

}
//时间复杂度：O(n^2)
//空间复杂度：O(1)
//稳定的排序