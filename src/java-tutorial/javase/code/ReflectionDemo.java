import java.lang.reflect.Field;

public class ReflectionDemo {
    public static void Demo2() throws ClassNotFoundException {
        try {
            // 确保使用正确的类路径
            Class<?> class1 = Class.forName("Person"); // 或者包含包名

            // 先打印所有public字段
            System.out.println("所有public字段:");
            printPublicFields(class1);

            // 然后尝试获取特定字段
            try {
                Field field4 = class1.getField("id");
                System.out.println("id字段: " + field4);
            } catch (NoSuchFieldException e) {
                System.out.println("找不到id字段: " + e.getMessage());
            }

            try {
                Field field5 = class1.getField("grade");
                System.out.println("grade字段: " + field5);
            } catch (NoSuchFieldException e) {
                System.out.println("找不到grade字段: " + e.getMessage());
            }
        } catch (ClassNotFoundException e) {
            System.out.println("找不到Person类: " + e.getMessage());
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            // 第一种方式，Class.forName("全类名")
            Class<?> class1 = Class.forName("Person");
            System.out.println(class1);

            // 第二种方式，类名.class
            Class<?> class2 = Person.class;
            System.out.println(class2);

            // 第三种方式，对象.getName()
            Person person = new Person();
            Class<?> class3 = person.getClass();
            System.out.println(class3);

            // 比较三个对象是否相同
            System.out.println(class1 == class2);
            System.out.println(class1 == class3);

            Class<?> class4 = Class.forName("Person");
            Field[] fields = class4.getDeclaredFields(); // Using getDeclaredFields() to get all fields
            for (Field field : fields) {
                System.out.println(field);
            }
            Demo2();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}