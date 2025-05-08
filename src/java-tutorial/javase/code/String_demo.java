import java.util.Scanner;
import java.util.Arrays;
import java.util.StringJoiner;

public class String_demo{
    public static void StringBuilderMethodTest(){
        StringBuilder stringBuilder = new StringBuilder("村雨遥");
        System.out.println("原字符串: " + stringBuilder);
        System.out.println("length(): " + stringBuilder.length());
        stringBuilder.append("cunyu1943");
        System.out.println("append(): " + stringBuilder);
        System.out.println("toString(): " + stringBuilder.toString());
        System.out.println("reverse(): " + stringBuilder.reverse());
    }
    public static void StringBuilderConstructor(){
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("无参构造: " + stringBuilder);
        StringBuilder  stringBuilder1 = new StringBuilder("村雨遥");
        System.out.println("有参构造: " + stringBuilder1);
    }
    public static void SplitTest(){
        String str  = "010-110-119";
        String[] splitArray = str.split("-");

        System.out.println(Arrays.toString(splitArray));
    }
    public static void ToCharArrayTest(){
        String str = "cunyu1943";
        char[] charArray = str.toCharArray();
        System.out.println(Arrays.toString(charArray));
    }
    public static void ReplaceTest(){
        char ch1 = 'u';
        char ch2 = 'x';
        String str = "cunyu1943";
        System.out.println("原字符串: " + str);
        System.out.println("替换后的字符串: "+ str.replace(ch1,ch2));
    }
    public static void CharAtTest(){
        String str = "cunyu1943";
        System.out.println("原字符串："+str);
        System.out.println("索引为0的字符:"+str.charAt(0));
    }
    public static void StringLengthTest(){
        String str = "cunyu1943";
        char[] charArray = str.toCharArray();
        System.out.println("字符数组的长度为: "+charArray.length);
        System.out.println(Arrays.toString(charArray));
        Arrays.sort(charArray);
        System.out.println("排序后的字符数组: " + Arrays.toString(charArray));
    }
    public static void EqualsIgnoreCaseTest(){
        String str1 = "cunyu1943";
        String str2 = "CUNYU1943";
        System.out.println(str1.equals(str2)); // false
        System.out.println(str1.equalsIgnoreCase(str2)); // true
    }
    public static void SubstringTest(){
        String name = "cunyuyao1943";
        System.out.println(name.substring(2,5));
    }
    public static void StringJoinerConstructorTest(){
        StringJoiner stringJoiner = new StringJoiner("*");
        stringJoiner.add("123");
        stringJoiner.add("13");
        System.out.println(stringJoiner);
    }
    public static void main(String[] args){
        // CharAtTest();
        // StringLengthTest();
        // SubstringTest();
        // ToCharArrayTest();
        // StringBuilderMethodTest();
        StringJoinerConstructorTest();
    }
}