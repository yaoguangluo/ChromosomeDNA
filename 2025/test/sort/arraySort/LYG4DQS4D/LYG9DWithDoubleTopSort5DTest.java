package test.java.InterfaceTest.sort.arraySort.LYG4DQS4D;

import A_V.ASQ.PSU.test.TimeCheck;
import U_V.OEU.LYG4DQS4D.LYG9DWithDoubleTopSort5D;
import org.junit.jupiter.api.Test;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
//重要的本人常用排序接口的测试main移到test单元文件中。--double list排序
class LYG9DWithDoubleTopSort5DTest {

    @Test
    void sort() {
    }

    /*
     * 这是一个 用于德塔快速排序4代进行左右比对分词优化的算法对double，int，float，long数组排序demo
     * 测试main函数demo的test版本，在导入了api之后进行系统集成，然后
     * 用下面的对应的函数中源码逻辑进行复制粘贴到工程中，直接运行，即可出结果，源码的逻辑按照输入准备计算的参数，
     * 然后执行，然后获取输出需要的结果，可以用断点来查看数据，也可以用println来显示输出，方便集成，对程序员友好。
     * 系统需要jdk1.8 以上的java环境，本人会把测试的输入输出都注释在这个文件里。及其傻瓜化的流程，方便商业化落地。
     * --罗瑶光
     * */
    @Test
    void main() {
        testDouble();
        testLong();
        testInt();
        testFloat();
    }

    void testDouble() {
        double[] doubles = new double[9999999];
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = Math.random();
        }
        LYG9DWithDoubleTopSort5D lYG9DWithDoubleTopSort5D = new LYG9DWithDoubleTopSort5D();
        TimeCheck timecheck = new TimeCheck();
        timecheck.begin();
        lYG9DWithDoubleTopSort5D.sort(doubles, 7, 70);
        timecheck.end();
        timecheck.duration();
        System.out.println("--double 随机排序完成，容错率测试--");
        for (int i = 0; i < doubles.length - 1; i++) {
            if (doubles[i] > doubles[i + 1]) {
                System.out.println(i + "->" + doubles[i]);
            }
        }
    }

    void testLong() {
        long[] longV = new long[9999999];
        for (int i = 0; i < longV.length; i++) {
            longV[i] = (long) (Math.random() * 10000000);
        }
        LYG9DWithLongTopSort5D lYG9DWithLongTopSort5D = new LYG9DWithLongTopSort5D();
        TimeCheck timecheck = new TimeCheck();
        timecheck.begin();
        lYG9DWithLongTopSort5D.sort(longV, 7, 70);
        timecheck.end();
        timecheck.duration();
        System.out.println("--long 随机排序完成，容错率测试--");
        for (int i = 0; i < longV.length - 1; i++) {
            if (longV[i] > longV[i + 1]) {
                System.out.println(i + "->" + longV[i]);
            }
        }
    }

    void testInt() {
        int[] intV = new int[9999999];
        for (int i = 0; i < intV.length; i++) {
            intV[i] = (int) (Math.random() * 10000);//会随机出大量的相同数，真实环境中过滤后不可能出现这种条件。
        }
        LYG9DWithIntTopSort5D lYG9DWithIntTopSort5D = new LYG9DWithIntTopSort5D();
        TimeCheck timecheck = new TimeCheck();
        timecheck.begin();
        lYG9DWithIntTopSort5D.sort(intV, 7, 70);
        timecheck.end();
        timecheck.duration();
        System.out.println("--int 随机排序完成，容错率测试--");
        System.out.println("--int 排序耗时长是因为>=计算 随机大量的相同数导致，真实环境中过滤后不可能出现这种条件。--");
        for (int i = 0; i < intV.length - 1; i++) {
            if (intV[i] > intV[i + 1]) {
                System.out.println(i + "->" + intV[i]);
            }
        }
    }

    void testFloat() {
        float[] floatV = new float[9999999];
        for (int i = 0; i < floatV.length; i++) {
            floatV[i] = (float) Math.random();
        }
        LYG9DWithFloatTopSort5D lYG9DWithFloatTopSort5D = new LYG9DWithFloatTopSort5D();
        TimeCheck timecheck = new TimeCheck();
        timecheck.begin();
        lYG9DWithFloatTopSort5D.sort(floatV, 7, 70);
        timecheck.end();
        timecheck.duration();
        System.out.println("--float 随机排序完成，容错率测试--");
        for (int i = 0; i < floatV.length - 1; i++) {
            if (floatV[i] > floatV[i + 1]) {
                System.out.println(i + "->" + floatV[i]);
            }
        }
    }
}