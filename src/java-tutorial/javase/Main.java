import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void array() {
        int[] arr1 = { 1, 3, 5, 8, 10 };
        int[] arr2 = new int[5];
        int[][] arr3 = { { 1, 2, 4 }, { 3, 4, 5 } };
        int[][] arr4 = new int[3][];
        arr4 = new int[][] {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        String[] arr = new String[5];
        arr = new String[] {
                "hello",
                "world",
                "java",
                "python",
                "c++"
        };
        for (int i = 0; i < arr.length; i++) {
            System.out.println("第" + (i + 1) + " 个元素是：" + arr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void print() {
        System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入整型");
        int num = scanner.nextInt();
        System.out.println("输入的整型：" + num);

        System.out.println("输入浮点型");
        float floatNum = scanner.nextFloat();
        System.out.println("输入的浮点型:" + floatNum);

        System.out.println("Input 3 string");
        String str1 = scanner.next();
        String str2 = scanner.next();
        String str3 = scanner.next();
        System.out.println("输入的字符串1:" + str1);
        System.out.println("输入的字符串2:" + str2);
        System.out.println("输入的字符串3:" + str3);
        String str4 = scanner.nextLine();
        System.out.println("输入的字符串4:" + str4);

        int num1 = 10;
        double num2 = 34.9;
        float num3 = 3.34f;
        String name = "张三";

        System.out.println(name);
        System.out.print(name);
        System.out.println(num1);
    }

    public static void BubbleSort() {
        char[] chArray = { 'c', 'u', 'n', 'y', 'u' };
        System.out.println(Arrays.toString(chArray));
        for (int i = 0; i < chArray.length - 1; i++) {
            for (int j = 0; j < chArray.length - i - 1; j++) {
                if (chArray[j] < chArray[j + 1]) {
                    char temp = chArray[j];
                    chArray[j] = chArray[j + 1];
                    chArray[j + 1] = temp;
                }
            }
        }
        Arrays.sort(chArray);
        System.out.println(Arrays.toString(chArray));
    }

    public static void arrayMethods() {
        String[] arr = new String[5];
        arr = new String[] {
                "hello",
                "world",
                "java",
                "python",
                "c++"
        };
        System.out.println(Arrays.toString(arr));
        System.out.println("数组转列表");
        List<String> list = new ArrayList<String>(Arrays.asList(arr));
        System.out.println(list);
        System.out.println("列表转数组");
        list.add("php");
        String[] newArr = new String[list.size()];
        list.toArray(newArr);
        System.out.println(Arrays.toString(newArr));
    }

    public static void main(String[] args) {
        // print();
        // array();
        // BubbleSort();
        arrayMethods();
    }
}