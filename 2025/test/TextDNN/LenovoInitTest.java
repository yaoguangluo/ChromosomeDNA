package test.java.InterfaceTest.TextDNN;

import S_A.SVQ.stable.S_String;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_X_;
import org.junit.jupiter.api.Test;
import test.java.InterfaceTest.CommonTestInition;

import java.util.Iterator;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
class LenovoInitTest {

    @Test
    void getSensingMap() {
    }

    @Test
    void i_SensingMap() {
    }

    @Test
    void getEnvironmentInit() {
    }

    /*
     * 这是一个 用于文本的词汇意义来计算文章的内容属性的德塔图灵分词个人著作权中的权重内核模块
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
        //计算
        String text = S_String.text1;
        commonTestInition.NE.app_S.lenovoInit.IV_Exclude_A(text, commonTestInition.NE);
        IMV_SIQ_X_ environmentSampleMap = commonTestInition.NE.app_S.lenovoInit
            .getEnvironmentInit().getEmotionSampleMap();
        IMV_SIQ lenovo = commonTestInition.NE.app_S.lenovoInit.getSensingMap().getLenovoMap();
        //reduce
        System.out.println("环    境：");
        Iterator<String> Iterator = environmentSampleMap.keySet().iterator();
        while (Iterator.hasNext()) {
            String word = Iterator.next();
            commonTestInition.NE.app_S.emotionSample = environmentSampleMap.get_S(word);
            if (null != commonTestInition.NE.app_S.emotionSample.getDistinction()) {
                if (lenovo.containsKey(commonTestInition.NE.app_S.emotionSample.getDistinction())) {
                    System.out.print(lenovo.get(commonTestInition.NE.app_S.emotionSample.getDistinction()).toString() + " ");
                } else {
                    System.out.print(commonTestInition.NE.app_S.emotionSample.getDistinction() + " ");
                }
            }
        }
        System.out.println("");
        System.out.println("动机联想：");
        Iterator = environmentSampleMap.keySet().iterator();
        while (Iterator.hasNext()) {
            String word = Iterator.next();
            commonTestInition.NE.app_S.emotionSample = environmentSampleMap.get_S(word);
            if (null != commonTestInition.NE.app_S.emotionSample.getMotivation()) {
                if (commonTestInition.NE.app_S.emotionSample.getMotivation().contains("语料库空")) {
                    continue;
                }
                if (lenovo.containsKey(commonTestInition.NE.app_S.emotionSample.getMotivation())) {
                    System.out.print(lenovo.get(commonTestInition.NE.app_S.emotionSample.getMotivation()).toString() + " ");
                } else {
                    System.out.print(commonTestInition.NE.app_S.emotionSample.getMotivation() + " ");
                }
            }
        }
        System.out.println("");
        System.out.println("倾向探索：");
        Iterator = environmentSampleMap.keySet().iterator();
        while (Iterator.hasNext()) {
            String word = Iterator.next();
            commonTestInition.NE.app_S.emotionSample = environmentSampleMap.get_S(word);
            if (null != commonTestInition.NE.app_S.emotionSample.getTrending()) {
                if (commonTestInition.NE.app_S.emotionSample.getTrending().contains("语料库空")) {
                    continue;
                }
                if (lenovo.containsKey(commonTestInition.NE.app_S.emotionSample.getTrending())) {
                    System.out.print(lenovo.get(commonTestInition.NE.app_S.emotionSample.getTrending()).toString() + " ");
                } else {
                    System.out.print(commonTestInition.NE.app_S.emotionSample.getTrending() + " ");
                }
            }
        }

        //reduce
        System.out.println("");
        System.out.println("决策挖掘：");
        Iterator = environmentSampleMap.keySet().iterator();
        while (Iterator.hasNext()) {
            String word = Iterator.next();
            commonTestInition.NE.app_S.emotionSample = environmentSampleMap.get_S(word);
            if (null != commonTestInition.NE.app_S.emotionSample.getPrediction()) {
                if (commonTestInition.NE.app_S.emotionSample.getPrediction().contains("语料库空")) {
                    continue;
                }
                if (lenovo.containsKey(commonTestInition.NE.app_S.emotionSample.getPrediction())) {
                    System.out.print(lenovo.get(commonTestInition.NE.app_S.emotionSample.getPrediction()).toString() + " ");
                } else {
                    System.out.print(commonTestInition.NE.app_S.emotionSample.getPrediction() + " ");
                }
            }
        }
        //
        commonTestInition.endEnvironment();
    }

    @Test
    void IV_() {
    }

    @Test
    void IV_Exclude_A() {
    }
}
//输出
//Connected to the target VM, address: '127.0.0.1:54933', transport: 'socket'
//    trif
//    环    境：
//    物资       逻辑  学者  化学 哲学  哲学    娱乐 宇宙   地理            哲学
//    动机联想：
//    危险 警惕 利益 了解 贪婪 远离 教育 帮助 纠正 需求 疑虑 进步 思想 了解
//    倾向探索：
//    自闭 善良 自恋，自爱 平庸，碌碌之人 自恋，自爱 逆商 优秀
//    决策挖掘：
//    防御 合作 合作 示威 Disconnected from the target VM, address: '127.0.0.1:54933', transport: 'socket'
//
//    Process finished with exit code 0