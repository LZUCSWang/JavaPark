public class Demo {
    private String name;// 成员变量，实例变量
    private int age;// 成员变量，实例变量
    private int ID; // 成员变量，实例变量

    public static final String school = "清华大学"; // 成员变量，静态变量（类变量）
    public static String level = "SSS"; // 成员变量，静态变量（类变量）

    public int getAge() {
        return age;
    }

    public int getId() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void study() {
        String subject1 = "Java";
        String subject2 = "数据结构";
        System.out.println("我在" + school + "学习" + subject1 + "和" + subject2);
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.setAge(20);
        demo.setName("张三");
        System.out.println("ID: " + demo.getId() +
                "Age: " + demo.getAge() +
                "Name: " + demo.getName());
        System.out.print("主修科目：");
        demo.study();
        System.out.println("学校: " + school);
        System.out.println("等级: " + level);
    }
}
