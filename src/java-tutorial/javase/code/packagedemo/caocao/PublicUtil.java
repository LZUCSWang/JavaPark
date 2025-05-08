package caocao;

/**
 * 曹操的公共工具类
 */
public class PublicUtil {
    
    /**
     * 计算兵力
     * @return 返回当前可用兵力
     */
    public static int getArmyForce() {
        return 150000;
    }
    
    /**
     * 曹操特有的谋略方法
     * @param strategy 策略名称
     * @return 策略说明
     */
    public static String useStrategy(String strategy) {
        return "曹操使用了" + strategy + "计，效果拔群！";
    }
}
