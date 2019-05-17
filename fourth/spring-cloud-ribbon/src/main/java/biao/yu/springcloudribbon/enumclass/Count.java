package biao.yu.springcloudribbon.enumclass;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2019/5/17 11:47
 * @description: 枚举
 */
public enum Count {
    ONE(1,"一"),
    TWO(2,"二"),
    THREE(3,"三"),
    FOUR(4,"四"),
    FIVE(5,"五"),
    ;


    private int code;
    private String value;

    Count(int code, String value) {
        this.code = code;
        this.value = value;
    }
}
