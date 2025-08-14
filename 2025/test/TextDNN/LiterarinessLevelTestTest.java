package test.java.InterfaceTest.TextDNN;

import A_V.ica.InitBehaviorICAKernel;
import P_V.PEQ.OPM.VEC.test.LiterarinessLevelTest;
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
class LiterarinessLevelTestTest {

    @Test
    void IQ_EducationLevel() {
    }
    /*
     * 这是一个 用于文本的词汇比重计算文学分析程度的德塔图灵分词个人著作权中的权重内核模块计算
     * 测试main函数demo的test版本，在导入了api之后进行系统集成，然后
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
        kernel[0] = new InitBehaviorICAKernel().getBehaviorICAKernel(S_String.text1
            , commonTestInition.NE);
        System.out.println("kernel0->" + kernel[0][0] + "--" + kernel[0][1] + "--" + kernel[0][2]);

        kernel[1] = new InitBehaviorICAKernel().getBehaviorICAKernel(S_String.text2
            , commonTestInition.NE);
        System.out.println("kernel0->" + kernel[1][0] + "--" + kernel[1][1] + "--" + kernel[1][2]);

        kernel[2] = new InitBehaviorICAKernel().getBehaviorICAKernel(S_String.text3
            , commonTestInition.NE);
        System.out.println("kernel0->" + kernel[2][0] + "--" + kernel[2][1] + "--" + kernel[2][2]);
        //下面高级用法商业自适应去开发。
        LiterarinessLevelTest educationLevelTest = new LiterarinessLevelTest();
        educationLevelTest.IQ_EducationLevel(kernel);
        //output
        //建议用public getter，别被我的测试文件进行偷懒操作。
        for (int i = 0; i < educationLevelTest.literarinessLevel.length; i++) {
            System.out.println("EducationLevel" + i + "->" + educationLevelTest.literarinessLevel[i]);
        }
        System.out.println(educationLevelTest.literarinessDuration);
        //end
        commonTestInition.endEnvironment();
    }
}
//输出
//Connected to the target VM, address: '127.0.0.1:54751', transport: 'socket'
//    trif
//    kernel0->7.366666666666666--0.16831683168316833--1.2399339933993399
//    trif
//    kernel0->7.690274841437632--0.09211775878442545--0.7084108828294875
//    trif
//    kernel0->8.787640449438202--0.16123778501628663--1.4168996815869412
//    EducationLevel0->11.936363636363634
//    EducationLevel1->14.609540169133192
//    EducationLevel2->8.175168539325842
//    11.573690781607558
//    Disconnected from the target VM, address: '127.0.0.1:54751', transport: 'socket'
//
//    Process finished with exit code 0