package test.java.InterfaceTest.TextDNN;

import A_V.ica.InitBehaviorICAKernel;
import S_A.SVQ.stable.S_String;
import org.junit.jupiter.api.Test;
import test.java.InterfaceTest.CommonTestInition;

import java.util.List;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
class InitBehaviorICAKernelTest {
    /*
     * 这是一个 用于文本的词汇比重计算文章作者的写作习惯的德塔图灵分词个人著作权中的权重内核模块计算
     *  测试main函数demo的test版本，在导入了api之后进行系统集成，然后
     * 用下面的对应的函数中源码逻辑进行复制粘贴到工程中，直接运行，即可出结果，源码的逻辑按照输入准备计算的参数，
     * 然后执行，然后获取输出需要的结果，可以用断点来查看数据，也可以用println来显示输出，方便集成，对程序员友好。
     * 系统需要jdk1.8 以上的java环境，本人会把测试的输入输出都注释在这个文件里。及其傻瓜化的流程，方便商业化落地。
     * --罗瑶光
     * */
    @Test
    void getKernel() {
    }

    @Test
    void getForRestReturn() {
    }

    @Test
    void getTrustRate() {
    }

    @Test
    void getBehaviorICAKernel() {
    }

    @Test
    void main() {
        //环境初始化。
        CommonTestInition commonTestInition = new CommonTestInition();
        commonTestInition.initEnvironment("去弹窗组件流测试");
        //exec
        InitBehaviorICAKernel initBehaviorICAKernel = new InitBehaviorICAKernel();
        initBehaviorICAKernel.getBehaviorICAKernel(S_String.text1, commonTestInition.NE);
        //output
        List<String> list = initBehaviorICAKernel.getForRestReturn();
        for(String string:list){
            System.out.println(string);
        }
        commonTestInition.endEnvironment();
    }
}
/*输出观测
* Connected to the target VM, address: '127.0.0.1:54314', transport: 'socket'
trif
正面情感：30.0
负面情感：4.0
渲染比率：7.366666666666666
情绪比率：0.16831683168316833
感染比率：1.2399339933993399
观测角度：
    物资       逻辑                              学者      化学 哲学         哲学                                 娱乐 宇宙   地理            哲学
0.2727272727272727
信任比率：
危险 警惕 利益 了解 贪婪 远离 教育 帮助 纠正 需求 英雄 疑虑 进步 思想 了解
0.375
执行比率：
自闭 善良 自恋 平庸 自恋 逆商 优秀
0.5714285714285714
成功比率：
防御 合作 合作 示威
1.0
Disconnected from the target VM, address: '127.0.0.1:54314', transport: 'socket'

Process finished with exit code 0
* */