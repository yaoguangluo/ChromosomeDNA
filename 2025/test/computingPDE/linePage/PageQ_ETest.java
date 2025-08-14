package test.java.InterfaceTest.computingPDE.linePage;

import A_I.MPE.MAQPVDCOISIV.pdi.RangePDI;
import jniLYGAFDCDFFT.LYGAFDCTDFFT_F;
import org.junit.jupiter.api.Test;
import test.java.InterfaceTest.CommonTestInition;

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
 * 这是一个 //非卷积肽数字滤波变换 测试main函数demo的test版本，在导入了api之后进行系统集成，然后用下面的对应的函数中源码逻辑
 * 进行复制粘贴到工程中，直接运行，即可出结果，源码的逻辑按照输入准备计算的参数，然后执行，然后获取输出需要的结果，
 * 可以用断点来查看数据，也可以用println来显示输出，方便集成，对程序员友好。系统需要jdk1.8 以上的java环境，
 * 本人会把测试的输入输出都注释在这个文件里。及其傻瓜化的流程，方便商业化落地。
 * --罗瑶光
 * */
class PageQ_ETest {
    //非卷积肽数字滤波变换
    @Test
    void clt4() {
        //commonTestInition.NE初始化
        CommonTestInition commonTestInition = new CommonTestInition();
        commonTestInition.initEnvironment("去弹窗组件流测试");
        //测试肽计算滤波
        LYGAFDCTDFFT_F lYGAFDCTDFFT_F = new LYGAFDCTDFFT_F();
        //初始化
        commonTestInition.NE.app_S.sourcePagePDE = 100;
        //0～100为酸和碱的浓度模拟区间，0是酸变成碱的概率浓度 100是碱变换成酸的概率浓度，
        //不同的浓度不同的环境计算输出。我还是多写点字。
        float[] bili0 = new float[32];
        for (int i = 0; i < 32; i++) {
            bili0[i] = (float) ((int)(Math.random()*100000) % 255);
        }
        //执行非卷积肽变换滤 255峰值 波测试
        bili0 = RangePDI.Double_IPE_AOPM_VECS_IDUQ_TXH_AC(bili0, commonTestInition.NE);
        //输出
        for (int i = 0; i < 32; i++) {
            System.out.println(bili0[i]);
        }
        //关闭
        commonTestInition.endEnvironment();
    }

    @Test
    void render() {
    }

    @Test
    void clt4WithoutErazer() {
    }
}