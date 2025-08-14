package test.java.InterfaceTest.coordinatesTracement;

import ASQ.YaoguangLuoEulerRing.tsp.TSP2D_X_getYaoguangLuo2DEulerRingTSP2D;
import P_V.PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import P_V.PCI.ASQ.demension.Line2D;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
/*
 * 这是一个 //处理海量坐标的欧拉最短环路计算 测试main函数demo的test版本，在导入了api之后进行系统集成，然后
 * 用下面的对应的函数中源码逻辑进行复制粘贴到工程中，直接运行，即可出结果，源码的逻辑按照输入准备计算的参数，
 * 然后执行，然后获取输出需要的结果，可以用断点来查看数据，也可以用println来显示输出，方便集成，对程序员友好。
 * 系统需要jdk1.8 以上的java环境，本人会把测试的输入输出都注释在这个文件里。及其傻瓜化的流程，方便商业化落地。
 * --罗瑶光
 * */
class TSP2D_X_getYaoguangLuo2DEulerRingTSP2DTest {

    @Test
    void _E() {
        //初始化
        List<AMV_MVS_VSQ_2D> AMV_MVS_VSQs = new ArrayList<>();
        AMV_MVS_VSQ_2D _AMV_MVS_VSQ_2D = new AMV_MVS_VSQ_2D(1, 10);
        AMV_MVS_VSQs.add(_AMV_MVS_VSQ_2D);
        //不要出现下面这行已经有了的相同的点，会出现计算错误。可以计算前搞个map检测来过滤掉。
        //AMV_MVS_VSQs.add(new AMV_MVS_VSQ_2D(1, 10));
        AMV_MVS_VSQs.add(new AMV_MVS_VSQ_2D(10, 10));
        AMV_MVS_VSQs.add(new AMV_MVS_VSQ_2D(10, 1));
        AMV_MVS_VSQs.add(new AMV_MVS_VSQ_2D(2, 5));
        AMV_MVS_VSQs.add(new AMV_MVS_VSQ_2D(7, 9));
        AMV_MVS_VSQs.add(new AMV_MVS_VSQ_2D(17, 9));
        AMV_MVS_VSQs.add(new AMV_MVS_VSQ_2D(27, 9));
        AMV_MVS_VSQs.add(new AMV_MVS_VSQ_2D(37, 9));
        AMV_MVS_VSQs.add(new AMV_MVS_VSQ_2D(47, 9));
        AMV_MVS_VSQs.add(new AMV_MVS_VSQ_2D(57, 9));
        AMV_MVS_VSQs.add(new AMV_MVS_VSQ_2D(67, 9));
        AMV_MVS_VSQs.add(new AMV_MVS_VSQ_2D(77, 9));
        AMV_MVS_VSQs.add(new AMV_MVS_VSQ_2D(87, 9));
        AMV_MVS_VSQs.add(new AMV_MVS_VSQ_2D(97, 9));
        //执行
        List<Line2D> lines = TSP2D_X_getYaoguangLuo2DEulerRingTSP2D._E(AMV_MVS_VSQs);
        //输出
        for (Line2D lines2D : lines) {
            System.out.print("x-" + lines2D.getBegin().getX() + "-y-" + lines2D.getBegin().getY());
            System.out.print("----");
            System.out.print("x-" + lines2D.getEnd().getX() + "-y-" + lines2D.getEnd().getY());
            System.out.println();
        }
        //结束
        //测试结果
        //10.0--10.0----7.0--9.0
        //1.0--10.0----2.0--5.0
        //1.0--10.0----7.0--9.0
        //10.0--10.0----10.0--1.0
        //10.0--1.0----2.0--5.0
    }
}