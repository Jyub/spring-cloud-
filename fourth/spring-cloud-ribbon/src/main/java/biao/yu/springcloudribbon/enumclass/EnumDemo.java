package biao.yu.springcloudribbon.enumclass;

import java.lang.reflect.Modifier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import java.util.List;
import java.util.stream.Stream;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2019/5/17 11:15
 * @description: 枚举类
 */
public class EnumDemo {

    private int num;

    public final static EnumDemo ONE = new EnumDemo(1);
    public final static EnumDemo TWO = new EnumDemo(2);
    public final static EnumDemo THREE = new EnumDemo(3);
    public final static EnumDemo FOUR = new EnumDemo(4);
    public final static EnumDemo FIVE = new EnumDemo(5);

    private EnumDemo(int num){
        this.num = num;
    }

    @Override
    public String toString() {
        return "EnumDemo:"+num;
    }

    static EnumDemo[] values(){
        return Stream.of(EnumDemo.class.getDeclaredFields())
                .filter(field->{
                    int modifiers = field.getModifiers();
                    return Modifier.isPublic(modifiers) && Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers);
                }).map(field -> {
                    try {
                        return field.get(null);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                }).collect(Collectors.toList()).toArray(new EnumDemo[0]);
    }

    public static void main(String[] args) {
        for (EnumDemo demo : EnumDemo.values()){
            System.out.println(demo);
        }
        for (Count count : Count.values()){
            System.out.println(count);
            System.out.println(count.name()+count.ordinal());
        }
    }

}
