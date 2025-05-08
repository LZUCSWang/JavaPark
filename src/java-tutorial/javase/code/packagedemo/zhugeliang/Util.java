package zhugeliang;

// 不要同时导入两个同名的类
// 移除这两行导入语句
// import caocao.PublicUtil;
// import zhouyu.PublicUtil;

/**
 * 诸葛亮的工具类，需要同时使用曹操和周瑜的工具类
 */
public class Util {
    
    public static void main(String[] args) {
        // 通过完全限定类名来区分同名类
        System.out.println("曹操军队兵力: " + caocao.PublicUtil.getArmyForce());
        System.out.println("周瑜军队兵力: " + zhouyu.PublicUtil.getArmyForce());
        
        // 使用曹操的特有方法
        System.out.println(caocao.PublicUtil.useStrategy("美人"));
        
        // 使用周瑜的特有方法
        System.out.println(zhouyu.PublicUtil.fireAttack("曹操水军"));
        
        // 诸葛亮的自有方法
        System.out.println(borrowArrows(50000));
    }
    
    /**
     * 诸葛亮特有的借箭方法
     * @param count 需要的箭数
     * @return 借箭结果
     */
    public static String borrowArrows(int count) {
        return "诸葛亮使用草船借箭之计，成功借得" + count + "支箭！";
    }
}
