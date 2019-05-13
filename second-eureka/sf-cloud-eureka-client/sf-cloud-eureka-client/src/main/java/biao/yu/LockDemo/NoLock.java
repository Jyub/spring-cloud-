package biao.yu.LockDemo;

import sun.misc.Unsafe;

import java.io.IOException;
import java.lang.reflect.Field;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2019/5/10 11:48
 * @description: 无锁示例
 **/
public class NoLock {
    volatile int i=0;

     static Unsafe unsafe;
     static long offset;
    static {
        try {
            Field theUnsafe = Unsafe.class.getDeclaredField("theUnsafe");
            theUnsafe.setAccessible(true);
            unsafe = (Unsafe)theUnsafe.get(null);//反射获取`static`成员的时候参数是`null`。因为static成员不依附于实例
            offset = unsafe.objectFieldOffset(NoLock.class.getDeclaredField("i"));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    private void add() {
        int current;
        int n;
        do{
             current = i; //取值
             n = current +1;//计算
            //i=current;//赋值（会造成线程安全问题）
        }while (!unsafe.compareAndSwapInt(this,offset,current,n));



    }

    public static void main(String[] args) throws IOException {
        NoLock noLock = new NoLock();
        for (int i = 0; i < 2; i++) {
            new Thread(() -> {
                for (int j = 0; j < 100000; j++) {
                    noLock.add();
                }
            }).start();
        }
        System.in.read();
        System.out.println(noLock.i);
    }
}
