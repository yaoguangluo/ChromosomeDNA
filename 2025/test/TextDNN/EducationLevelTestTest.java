package test.java.InterfaceTest.TextDNN;

import A_V.ica.EducationRatio;
import P_V.PEQ.OPM.VEC.test.EducationLevelTest;
import S_A.SVQ.stable.S_String;
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
class EducationLevelTestTest {

    @Test
    void IQ_EducationLevel() {
    }
    /*
     * 这是一个 用于文本的词汇比重计算教育程度的德塔图灵分词个人著作权中的权重内核模块计算 测试main函数demo的test版本，在导入了api之后进行系统集成，然后
     * 用下面的对应的函数中源码逻辑进行复制粘贴到工程中，直接运行，即可出结果，源码的逻辑按照输入准备计算的参数，
     * 然后执行，然后获取输出需要的结果，可以用断点来查看数据，也可以用println来显示输出，方便集成，对程序员友好。
     * 系统需要jdk1.8 以上的java环境，本人会把测试的输入输出都注释在这个文件里。及其傻瓜化的流程，方便商业化落地。
     * --罗瑶光
     * */
    @Test
    void main() {
        //环境初始化。
        CommonTestInition commonTestInition = new CommonTestInition();
        commonTestInition.initEnvironment("去弹窗组件流测试");
        //exec
        //ICA kernel
        double[][] kernel = new double[3][];
        kernel[0] = new EducationRatio().getEducationKernel(S_String.text1, commonTestInition.NE.app_S._A, commonTestInition.NE);
        System.out.println("kernel0->" + kernel[0][0] + "--" + kernel[0][1] + "--" + kernel[0][2]);
        kernel[1] = new EducationRatio().getEducationKernel(S_String.text2, commonTestInition.NE.app_S._A, commonTestInition.NE);
        System.out.println("kernel1->" + kernel[1][0] + "--" + kernel[1][1] + "--" + kernel[1][2]);
        kernel[2] = new EducationRatio().getEducationKernel(S_String.text3, commonTestInition.NE.app_S._A, commonTestInition.NE);
        System.out.println("kernel2->" + kernel[2][0] + "--" + kernel[2][1] + "--" + kernel[2][2]);

        //ANN kernel
        double[][] kernelRatio = new double[3][];
        kernelRatio[0] = new EducationRatio().getEducationRatioKernel(kernel[0]);
        System.out.println("kernelRatio0->" + kernelRatio[0][0] + "--" + kernelRatio[0][1] + "--" + kernelRatio[0][2]);
        kernelRatio[1] = new EducationRatio().getEducationRatioKernel(kernel[1]);
        System.out.println("kernelRatio1->" + kernelRatio[1][0] + "--" + kernelRatio[1][1] + "--" + kernelRatio[1][2]);
        kernelRatio[2] = new EducationRatio().getEducationRatioKernel(kernel[2]);
        System.out.println("kernelRatio2->" + kernelRatio[2][0] + "--" + kernelRatio[2][1] + "--" + kernelRatio[2][2]);
        EducationLevelTest educationLevelTest = new EducationLevelTest();
        educationLevelTest.IQ_EducationLevel(kernelRatio);
        //output
        //建议用public getter，别被我的测试文件进行偷懒操作。
        for (int i = 0; i < educationLevelTest.EducationLevel.length; i++) {
            System.out.println("EducationLevel" + i + "->" + educationLevelTest.EducationLevel[i]);
        }
        System.out.println(educationLevelTest.EducationDuration);
        //end
        commonTestInition.NE.stop();
        commonTestInition.endEnvironment();
    }
}
//输出
//Connected to the target VM, address: '127.0.0.1:55131', transport: 'socket'
//    kernel0->442.0--56.0--49.0
//    kernel1->3242.0--185.0--112.0
//    kernel2->1662.0--129.0--97.0
//    kernelRatio0->1.0--0.12669683257918551--0.11085972850678733
//    kernelRatio1->1.0--0.05706354102405922--0.03454657618753856
//    kernelRatio2->1.0--0.0776173285198556--0.05836341756919374
//    EducationLevel0->0.11188811188811189
//    EducationLevel1->0.11278195488721805
//    EducationLevel2->0.13312693498452013
//    0.11926566725328336
//    Disconnected from the target VM, address: '127.0.0.1:55131', transport: 'socket'
//
//    Process finished with exit code 0