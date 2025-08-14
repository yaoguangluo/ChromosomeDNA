package test.java.InterfaceTest.TextDNN;

import A_V.ica.InitBehaviorICAKernel;
import P_V.PEQ.OPM.VEC.test.SuccessICATest;
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
class SuccessICATestTest {

    @Test
    void IQ_KernelCNN() {
    }
    /*
     * 这是一个 情绪执行成功率，用于执行力 决策力测试 测试main函数demo的test版本，在导入了api之后进行系统集成，然后
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
        kernel[1] = new InitBehaviorICAKernel().getBehaviorICAKernel(S_String.text2
            , commonTestInition.NE);
        kernel[2] = new InitBehaviorICAKernel().getBehaviorICAKernel(S_String.text3
            , commonTestInition.NE);
        SuccessICATest successICATest = new SuccessICATest();
        successICATest.IQ_KernelCNN(kernel);
        for (int i = 0; i < successICATest.kernelCNN.length; i++) {
            for (int j = 0; j < successICATest.kernelCNN[0].length; j++) {
                System.out.print(successICATest.kernelCNN[i][j] + " ");
            }
            System.out.println();
        }
        //do ICA normalization
        //do ROBUST ICA
        //do map
        //do reduce sets
        //sets Turing
        //output
        //end
        commonTestInition.endEnvironment();
    }
}
//输出
//Connected to the target VM, address: '127.0.0.1:54853', transport: 'socket'
//    trif
//    trif
//    trif
//    0.3089450961976898 0.3991649476445315 0.36845286340916816 0.45627376425855515 0.25348189415041783 0.5386064030131826 0.38414634146341464
//    0.32251665620017506 0.21845813038788195 0.21050799448860433 0.29277566539923955 0.31197771587743733 0.2900188323917138 0.27439024390243905
//    0.3685382476021351 0.38237692196758666 0.42103914210222754 0.25095057034220536 0.43454038997214484 0.17137476459510356 0.3414634146341463
//    Disconnected from the target VM, address: '127.0.0.1:54853', transport: 'socket'
//
//    Process finished with exit code 0