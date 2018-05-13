package ShellSort;

public class ShellSort {
    public static void main(String args[]){
        int a[] = {1, 3, 1, 4, 8, 3, 10, 2};
        shellSort(a);

        for (int temp: a) {
            System.out.print(temp + "  ");
        }

    }

    static void shellSort(int a[]){
        int d = a.length;
        while (d > 0){
            d = d/2;
            for (int x = 0; x < d; x++){   //增量为d，分成d组
                for (int i = x + d; i < a.length; i += d){      //从第一个元素开始比
                    if (a[i] < a[i-d]) {
                        int temp = a[i];
                        int j = i - d;
                        while (j >= 0 && temp < a[j]) {
                            a[j + d] = a[j];
                            j -= d;
                        }
                        a[j + d] = temp;
                    }
                }
            }
        }
    }
}
//时间复杂度：与d的选取有关
//空间复杂度：O(1)