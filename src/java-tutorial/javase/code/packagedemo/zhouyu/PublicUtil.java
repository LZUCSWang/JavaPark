package zhouyu;

/**
 * 周瑜的公共工具类
 */
public class PublicUtil {
    
    /**
     * 计算兵力
     * @return 返回当前可用兵力
     */
    public static int getArmyForce() {
        return 100000;
    }
    
    /**
     * 周瑜特有的火攻方法
     * @param target 攻击目标
     * @return 攻击结果
     */
    public static String fireAttack(String target) {
        return "周瑜对" + target + "发动了火攻，火光冲天！";
    }
}
