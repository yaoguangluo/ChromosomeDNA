package test.java.InterfaceTest.chineseParser;

import A_V.ASQ.PSU.test.TimeCheck;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_SS;
import org.junit.jupiter.api.Test;
import test.java.InterfaceTest.CommonTestInition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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
 * 这是一个 关于极速分词 测试main函数demo的test版本，对这个测试函数进行广泛的跟进测试，用于补充流水阀门POS函数集合
 * 让分词更加准确目前的四字分词内核函数量99.7%, 可以继续用牺牲分词速度的方式再提高分词质量，价值在面向司法和宣传等
 * 及其严谨的场合环境应用。在导入了api之后进行系统集成，然后用下面的对应的函数中源码逻辑进行复制粘贴到工程中，
 * 直接运行，即可出结果，源码的逻辑按照输入准备计算的参数，然后执行，然后获取输出需要的结果，可以用断点来查看数据，
 * 也可以用println来显示输出，方便集成，对程序员友好。系统需要jdk1.8 以上的java环境，本人会把测试的输入输出
 * 都注释在这个文件里。及其傻瓜化的流程，方便商业化落地。
 * --罗瑶光
 * */
class DemoEXTest {
    Map<String, String>[] verbal;

    @Test
    void main() {
        //初始化测试数据
        double totalVerbals = 0;
        double totalSegbals = 0;
        String[] ss = new String[52];
        String[] ss1 = new String[52];
        double[] score = new double[52];
        Map<String, String>[] verbal = new HashMap[52];
        //初始化待分词数据
        new LoadVerbalInputMap().exec(verbal, ss, ss1);
        new LoadVerbalInputMap1().exec(verbal, ss, ss1);
        new LoadVerbalInputMap2().exec(verbal, ss, ss1);
        //初始化待比较数据
        new LoadVerbalOutputMap().exec(verbal, ss, ss1);
        new LoadVerbalOutputMap1().exec(verbal, ss, ss1);
        new LoadVerbalOutputMap2().exec(verbal, ss, ss1);
        //ss ss1导入字符--见DemoEXTest_input.txt DemoEXTest_input1.txt DemoEXTest_input2.txt 文件
        //初始化-----------------------------------------------------------------
        //环境初始化。以后接口优化做 junit系统化测试 下面的环境配置 可以写在 test before()里面。
        CommonTestInition commonTestInition = new CommonTestInition();
        commonTestInition.initEnvironment("去弹窗组件流测试");
        //词性初始化
        IMV_SIQ pos = commonTestInition.NE.app_S._A.getPosCnToCn();
        List<String> sets = new ArrayList<>();
        IMV_SIQ_SS seta = new IMV_SIQ_SS();
        //loop测试---------------------------------------------------------
        for (int i = 0; i < ss.length; i++) {
            StringBuilder sb = new StringBuilder(ss[i]);
            //执行分词-输出 list格式 的 sets变量
            TimeCheck t = new TimeCheck();
            t.begin();
            sets = commonTestInition.NE.app_S._A.parserMixedString(sb);
            t.end();
            t.duration();
            //输入
            System.out.println("array->" + i);
            System.out.println("输入->" + ss[i]);
            //输出和统计观测开始------
            System.out.print("输出->");
            for (int j = 0; j < sets.size(); j++) {
                if (sets.get(j) != null//不为null
                    && !sets.get(j).equals(" ")//不为空
                    && !sets.get(j).equals("-")//不为测试自身的拆解符
                ) {
                    if (verbal[i].containsKey(sets.get(j))) {
                        score[i] += 1;
                        totalVerbals++;
                        totalSegbals++;
                        System.out.print(sets.get(j) + "=");
                    } else {
                        totalVerbals++;
                        System.out.print(sets.get(j) + "x");
                    }
                }
            }
            String size = verbal[i].get("-size-");
            double sizeD = Double.valueOf(size);
            score[i] = score[i]/ sizeD;
            System.out.println();
            System.out.println("数据保持单字拆解条件下-分词后过滤新兴潮流代词缩写词人名" +
                "等行业专业名词后对比正确率为->" + (score[i] * 100) + "%");
            System.out.println("采样数据可自适应修改。注意保持对比格式的严谨～");
            //对比
            System.out.println("理想->" + ss1[i]);
        }
        System.out.println("共计分词量总数-->" + totalVerbals);
        System.out.println("共计正确分词数-->" + totalSegbals);
        double ratio = totalSegbals / totalVerbals;
        System.out.println("总分词正确比率-->" + +(ratio * 100) + "%");
        System.out.println("分词环境-总分词正确比率-代表数据保持单字拆解条件下-分词后过滤新兴潮流代词" +
            "缩写词人名等行业专业名词后的对比正确率");
        System.out.println("分词环境-总分词正确比率 含有社会10余个专业领域的-web随机短文摘录分词");
        System.out.println("分词环境-总分词正确比率 含有罗瑶光先生以前的笔记随机长文摘录分词");
        System.out.println("分词环境-总分词正确比率 含有当前流行的浏览器AI自动生成的随机长文摘录分词");
        System.out.println("分词环境-总分词正确比率 属于全部去标点符号的歧义短文分词比率");
        System.out.println("分词环境-总分词正确比率 不适用太多单字词的古文，古文建议用分句api，不应该用分词api。");
        //结束
        commonTestInition.endEnvironment();
    }
}
//ss ss1输出字符--见DemoEXTest_output.txt DemoEXTest_output1.txt DemoEXTest_output2.txt 文件
