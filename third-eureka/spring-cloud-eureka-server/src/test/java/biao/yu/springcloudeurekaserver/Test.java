package biao.yu.springcloudeurekaserver;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2019/5/14 9:58
 * @description: 测试字符串
 */
public class Test {
    public static void main(String[] args) {
        String s1 = new String("234");
        String s2 = s1.intern();
        String s3 = "234";
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
    }
}
