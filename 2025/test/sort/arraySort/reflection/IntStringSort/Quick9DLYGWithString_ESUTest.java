package test.java.InterfaceTest.sort.arraySort.reflection.IntStringSort;

import U_V.ESU.sort.Quick9DLYGWithDoubleObject_ESU;
import U_V.ESU.sort.Quick9DLYGWithDoubleString_ESU;
import U_V.ESU.sort.Quick9DLYGWithDouble_ESU;
import U_V.ESU.sort.Quick9DLYGWithFloatFloat_ESU;
import U_V.ESU.sort.Quick9DLYGWithFloatObject_ESU;
import U_V.ESU.sort.Quick9DLYGWithIntObject_ESU;
import U_V.ESU.sort.Quick9DLYGWithInt_ESU;
import U_V.ESU.sort.Quick9DLYGWithString_ESU;
import jnisort.LYGSortESU9D;
import org.junit.jupiter.api.Test;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313620483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
//重要的本人常用排序接口的测试main移到test单元文件中。--int对应string 的数组list排序
class Quick9DLYGWithString_ESUTest {
    /*
     * 这是一个 用于德塔快速排序4代进行左右比对分词优化的算法对应数据数组排序demo 测试main函数demo的test版本，
     * 在导入了api之后进行系统集成，然后
     * 用下面的对应的函数中源码逻辑进行复制粘贴到工程中，直接运行，即可出结果，源码的逻辑按照输入准备计算的参数，
     * 然后执行，然后获取输出需要的结果，可以用断点来查看数据，也可以用println来显示输出，方便集成，对程序员友好。
     * 系统需要jdk1.8 以上的java环境，本人会把测试的输入输出都注释在这个文件里。及其傻瓜化的流程，方便商业化落地。
     * --罗瑶光
     * */
    @Test
    void sort() {
        System.out.println("int数组排序算法映射int数据数组排序demo");
        sortIntInt();
        System.out.println("int数组排序算法映射String数据数组排序demo");
        sortIntString();
        System.out.println("double数组排序算法映射double数据数组排序demo");
        sortDoubleDouble();
        System.out.println("double数组排序算法映射String数据数组排序demo");
        sortDoubleString();
        System.out.println("int数组排序算法映射Object数据数组排序demo");
        sortIntObject();
        System.out.println("double数组排序算法映射object数据数组排序demo");
        sortDoubleObject();
        System.out.println("float数组排序算法映射object数据数组排序demo");
        sortFloatObject();
        System.out.println("float数组排序算法映射float数据数组排序demo");
        sortFloatFloat();
    }

    void sortIntInt() {
        int[] a = new int[20];
        int[] sa = new int[20];
        for (int i = 0; i < 20; i++) {
            a[i] = (int) (1000000 * Math.random());
            sa[i] = a[i];
        }
        Quick9DLYGWithInt_ESU quick9DLYGWithInt_ESU = new Quick9DLYGWithInt_ESU();
        int v[] = quick9DLYGWithInt_ESU.sort(a, sa);
        for (int i = 0; i < 20; i++) {
            System.out.print(a[i]);
            System.out.print("-");
            System.out.print(sa[i]);
            System.out.println("--");
        }
    }

    void sortIntString() {
        int[] a = new int[20];
        String[] sa = new String[20];
        for (int i = 0; i < 20; i++) {
            a[i] = (int) (1000000 * Math.random());
            sa[i] = "" + a[i];
        }
        int v[] = new LYGSortESU9D().javaSort(a, sa);
        for (int i = 0; i < 20; i++) {
            System.out.print(a[i]);
            System.out.print("-");
            System.out.print(sa[i]);
            System.out.println("--");
        }
    }

    void sortDoubleDouble() {
        double[] a = new double[20];
        double[] sa = new double[20];
        for (int i = 0; i < 20; i++) {
            a[i] = (1000000 * Math.random());
            sa[i] = a[i];
        }
        Quick9DLYGWithDouble_ESU quick9DLYGWithDouble_ESU = new Quick9DLYGWithDouble_ESU();
        double v[] = quick9DLYGWithDouble_ESU.sort(a, sa);
        for (int i = 0; i < 20; i++) {
            System.out.print(a[i]);
            System.out.print("-");
            System.out.print(sa[i]);
            System.out.println("--");
        }
    }

    void sortDoubleString() {
        double[] a = new double[20];
        String[] sa = new String[20];
        for (int i = 0; i < 20; i++) {
            a[i] = (1000000 * Math.random());
            sa[i] = "" + a[i];
        }
        Quick9DLYGWithDoubleString_ESU quick9DLYGWithDoubleString_ESU
            = new Quick9DLYGWithDoubleString_ESU();
        double v[] = quick9DLYGWithDoubleString_ESU.sort(a, sa);
        for (int i = 0; i < 20; i++) {
            System.out.print(a[i]);
            System.out.print("-");
            System.out.print(sa[i]);
            System.out.println("--");

        }
    }

    void sortIntObject() {
        int[] a = new int[20];
        Object[] sa = new Object[20];
        for (int i = 0; i < 20; i++) {
            a[i] = (int) (1000000 * Math.random());
            sa[i] = "" + a[i];
        }
        Quick9DLYGWithIntObject_ESU quick9DLYGWithIntObject_ESU
            = new Quick9DLYGWithIntObject_ESU();
        int v[] = quick9DLYGWithIntObject_ESU.sort(a, sa);
        for (int i = 0; i < 20; i++) {
            System.out.print(a[i]);
            System.out.print("-");
            System.out.print((String) sa[i]);
            System.out.println("--");
        }
    }

    void sortDoubleObject() {
        double[] a = new double[20];
        Object[] sa = new Object[20];
        for (int i = 0; i < 20; i++) {
            a[i] = (int) (1000000 * Math.random());
            sa[i] = "" + a[i];
        }
        Quick9DLYGWithDoubleObject_ESU quick9DLYGWithDoubleObject_ESU
            = new Quick9DLYGWithDoubleObject_ESU();
        double v[] = quick9DLYGWithDoubleObject_ESU.sort(a, sa);
        for (int i = 0; i < 20; i++) {
            System.out.print(a[i]);
            System.out.print("-");
            System.out.print((String) sa[i]);
            System.out.println("--");
        }
    }

    void sortFloatObject() {
        float[] a = new float[20];
        Object[] sa = new Object[20];
        for (int i = 0; i < 20; i++) {
            a[i] = (int) (1000000 * Math.random());
            sa[i] = "" + a[i];
        }
        Quick9DLYGWithFloatObject_ESU quick9DLYGWithFloatObject_ESU
            = new Quick9DLYGWithFloatObject_ESU();
        float v[] = quick9DLYGWithFloatObject_ESU.sort(a, sa);
        for (int i = 0; i < 20; i++) {
            System.out.print(a[i]);
            System.out.print("-");
            System.out.print((String) sa[i]);
            System.out.println("--");
        }
    }

    void sortFloatFloat() {
        float[] a = new float[20];
        float[] sa = new float[20];
        for (int i = 0; i < 20; i++) {
            a[i] = (float) Math.random();
            sa[i] = a[i];
        }
        Quick9DLYGWithFloatFloat_ESU quick9DLYGWithFloatFloat_ESU
            = new Quick9DLYGWithFloatFloat_ESU();
        float v[] = quick9DLYGWithFloatFloat_ESU.sort(a, sa);
        for (int i = 0; i < 20; i++) {
            System.out.print(a[i]);
            System.out.print("-");
            System.out.print(sa[i]);
            System.out.println("--");
        }
    }

    @Test
    void sortZhongYao() {
    }
}
/*
* 排序demo 输出
Connected to the target VM, address: '127.0.0.1:64084', transport: 'socket'
int数组排序算法映射int数据数组排序demo
3827-3827--
126803-126803--
170482-170482--
207156-207156--
209513-209513--
261996-261996--
347769-347769--
439072-439072--
507365-507365--
538370-538370--
589796-589796--
660619-660619--
670302-670302--
689047-689047--
812844-812844--
850927-850927--
865307-865307--
931609-931609--
932409-932409--
952439-952439--
int数组排序算法映射String数据数组排序demo
146571-146571--
147713-147713--
222270-222270--
292018-292018--
337155-337155--
361503-361503--
505772-505772--
535207-535207--
548278-548278--
582218-582218--
588024-588024--
593018-593018--
636875-636875--
750190-750190--
781706-781706--
840534-840534--
874051-874051--
907460-907460--
922082-922082--
934017-934017--
double数组排序算法映射double数据数组排序demo
14162.674831387556-14162.674831387556--
53107.94876379388-53107.94876379388--
93133.91328777709-93133.91328777709--
118544.11822424116-118544.11822424116--
148532.49123853096-148532.49123853096--
155699.0119614087-155699.0119614087--
162869.0833258617-162869.0833258617--
163224.01416014886-163224.01416014886--
164133.38717720448-164133.38717720448--
230770.69750714864-230770.69750714864--
268557.7741076348-268557.7741076348--
297433.1255655523-297433.1255655523--
392661.52957297175-392661.52957297175--
402596.92761852173-402596.92761852173--
466301.4761821013-466301.4761821013--
498739.29111585714-498739.29111585714--
588349.7276737283-588349.7276737283--
627980.8082885527-627980.8082885527--
663144.652694151-663144.652694151--
823628.307044199-823628.307044199--
double数组排序算法映射String数据数组排序demo
61171.20613818061-61171.20613818061--
73248.20859679404-73248.20859679404--
145683.74078955303-145683.74078955303--
229736.33787996785-229736.33787996785--
238356.49178841745-238356.49178841745--
240966.9065600707-240966.9065600707--
250600.1688137428-250600.1688137428--
308209.2345771092-308209.2345771092--
339411.8258074588-339411.8258074588--
355353.1012321336-355353.1012321336--
401351.7294528102-401351.7294528102--
535999.493318201-535999.493318201--
666850.3390741954-666850.3390741954--
682397.0164252894-682397.0164252894--
746537.5657049087-746537.5657049087--
840805.8387484577-840805.8387484577--
843023.0799736886-843023.0799736886--
954854.2333594095-954854.2333594095--
960890.9528643406-960890.9528643406--
981940.0631624458-981940.0631624458--
int数组排序算法映射Object数据数组排序demo
46028-46028--
203105-203105--
232063-232063--
356324-356324--
363329-363329--
363613-363613--
393280-393280--
442092-442092--
500038-500038--
587202-587202--
596417-596417--
634098-634098--
693708-693708--
712078-712078--
769275-769275--
830538-830538--
873909-873909--
947961-947961--
948832-948832--
989088-989088--
double数组排序算法映射object数据数组排序demo
3186.0-3186.0--
225230.0-225230.0--
241133.0-241133.0--
253859.0-253859.0--
280384.0-280384.0--
285714.0-285714.0--
314487.0-314487.0--
336466.0-336466.0--
386201.0-386201.0--
548384.0-548384.0--
564445.0-564445.0--
601598.0-601598.0--
635520.0-635520.0--
641980.0-641980.0--
682624.0-682624.0--
724886.0-724886.0--
735633.0-735633.0--
738793.0-738793.0--
773688.0-773688.0--
813989.0-813989.0--
float数组排序算法映射object数据数组排序demo
1243.0-1243.0--
39969.0-39969.0--
122670.0-122670.0--
184523.0-184523.0--
208143.0-208143.0--
325452.0-325452.0--
343843.0-343843.0--
419773.0-419773.0--
429579.0-429579.0--
520415.0-520415.0--
554952.0-554952.0--
625505.0-625505.0--
667654.0-667654.0--
678701.0-678701.0--
700680.0-700680.0--
722620.0-722620.0--
754235.0-754235.0--
856695.0-856695.0--
943784.0-943784.0--
952015.0-952015.0--
float数组排序算法映射float数据数组排序demo
0.005085763-0.005085763--
0.009551705-0.009551705--
0.066002764-0.066002764--
0.06631199-0.06631199--
0.084600344-0.084600344--
0.2154415-0.2154415--
0.2629231-0.2629231--
0.2687803-0.2687803--
0.36032584-0.36032584--
0.38796058-0.38796058--
0.43182933-0.43182933--
0.4383683-0.4383683--
0.47008467-0.47008467--
0.49151075-0.49151075--
0.6502688-0.6502688--
0.7751084-0.7751084--
0.86116195-0.86116195--
0.9082388-0.9082388--
0.9449608-0.9449608--
0.95464116-0.95464116--
Disconnected from the target VM, address: '127.0.0.1:64084', transport: 'socket'

Process finished with exit code 0
* */