package test.java.InterfaceTest.chineseParser;

import A_V.ASQ.PSU.test.TimeCheck;
import S_A.SVQ.stable.S_Common;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_SS;
import S_A.pheromone.IMV_SIQ_S_;
import test.java.InterfaceTest.CommonTestInition;

import java.util.ArrayList;
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
/*
 * 这是一个 极速分词 测试main函数demo的test版本，在导入了api之后进行系统集成，然后用下面的对应的函数中源码逻辑
 * 进行复制粘贴到工程中，直接运行，即可出结果，源码的逻辑按照输入准备计算的参数，然后执行，然后获取输出需要的结果，
 * 可以用断点来查看数据，也可以用println来显示输出，方便集成，对程序员友好。系统需要jdk1.8 以上的java环境，
 * 本人会把测试的输入输出都注释在这个文件里。及其傻瓜化的流程，方便商业化落地。
 * --罗瑶光
 * */
public class DemoEX {
    int a = 0;
    int b = 0;
    int c = 0;
    int d = 0;
    int e = 0;
    int f = 0;
    int g = 0;

    public static void main(String[] args) {
        CommonTestInition commonTestInition = new CommonTestInition();
        commonTestInition.initEnvironment("去弹窗组件流测试");
        //词性初始化
        IMV_SIQ pos = commonTestInition.NE.app_S._A.getPosCnToCn();
        List<String> sets = new ArrayList<>();
        IMV_SIQ_SS seta = new IMV_SIQ_SS();
        TimeCheck t = new TimeCheck();
        //等待分词的语句
        String ss = new String("罗瑶光先生从2018年10月开始，所有个人著作权作品，全部开源" +
            "，到现在，和无数群体，技术社团正面交锋7年，一直0纠纷，罗瑶光先生认为，一件作品，一个事物，" +
            "如果有价值，就应该像教材一样在真实的环境中实践测试和论证，能经得起所有人长年累月不断地挑剔的" +
            "东西，才是货真价实的，罗瑶光的个人著作权作品都是互联网，大数据产业领域基础作品，2018年后，" +
            "在60余互联网app上发布德塔开源的作品，罗瑶光先生认为开源作品对同行呈现包容性。同时对垄断产业" +
            "有约束性。");
        StringBuilder sb = new StringBuilder(ss);
        t.begin();
        for (int i = 0; i < 100000; i++) {
            //执行分词
            sets = commonTestInition.NE.app_S._A.parserMixedString(sb);
        }
        t.end();
        t.duration();
        System.out.println("-展示分词-");
        for (int i = 0; i < sets.size(); i++) {
            if (sets.get(i) != null) {
                System.out.print(sets.get(i) + " ");
            }
        }
        System.out.println("-展示词性-注意副词库表问题，形容词副词表里面的词汇不是罗瑶光研发设计的" +
            "--具体见DemoPOSTest函数的修正方法");
        new DemoPOSTest().testPOS(sets, pos);
        //
        System.out.println("-展示词频统计-");
        IMV_SIQ_S_ fwa = commonTestInition.NE.app_S._A.getWordFrequencyByReturnSortMap(sets
            , commonTestInition.NE);
        //		t.end();
        for (int i = fwa.size() - 1; i >= 0; i--) {
            System.out.print(fwa.get(i).get_word() + S_Common.STRING_SYMBOL_PER
                + fwa.get(i).get_frequency() + "----");
        }
        //关闭
        commonTestInition.endEnvironment();
    }
}
//64
//			EmotionMap_E emotionMap_E=new EmotionMap_E();
//			NERO_C_OneTime_E nERO_C_OneTime_E=
//			Nlp_CE_X_S nlp_CE_X_S=
//		  Pos_X_P pos_X_P=
//			SensingTest sensingTest=
//			FMHMMListOneTime_E fMHMMListOneTime_E=
//			Quick6DLuoYaoguangSort3DMap_E quick6DLuoYaoguangSort3DMap_E=

//		NERO_C_OneTime_E nERO_C_OneTime_E = new NERO_C_OneTime_E();
//		FMHMMListOneTime_E fMHMMListOneTime_E = new FMHMMListOneTime_E();
//		this.fHMMList = new FMHMMListOneTime_E();
//		_A.forestRoots = fHMMList.getMap();
//		FMHMMListOneTime_E_X_S fMHMMListOneTime_E_X_S = (FMHMMListOneTime_E_X_S)fHMMList;
//		wordsForest = fMHMMListOneTime_E_X_S.posCnToCn;
//		pos_C = new Pos_X_P();
//		nlp_C = new Nlp_CE_X_S();
//		nlp_C.pos_X_P = pos_C;
//		nero_C = new NERO_C_OneTime_E();
//		emotionMap = new EmotionMap_E();
//		sensingTest = new SensingTest();
//		quick6DLuoYaoguangSort = new Quick6DLuoYaoguangSort3DMap_E();

//186
//20230106-System.out.println(S_Count.a1);
//20230106-System.out.println(S_Count.a2);
//20230106-System.out.println(S_Count.a3);
//20230106-System.out.println(S_Count.a4);
//		//20230106-System.out.println(S_Count.a5);
//		//20230106-System.out.println(S_Count.a6);
//		//20230106-System.out.println(S_Count.a7);
//		//20230106-System.out.println(S_Count.a8);
//		//20230106-System.out.println(S_Count.a9);
//		//20230106-System.out.println(S_Count.a10);
//		//20230106-System.out.println(S_Count.a11);
//		//20230106-System.out.println(S_Count.a12);
//68
//        for (int j = 0; j < 1; j++) {
//            for (int i = 0; i < sets.size(); i++) {
//                if (!sets.get(i).replaceAll("\\s+", "").equals("")) {
//                    //System.out.print(sets.get(i) + "/" + pos.get(sets.get(i)) + "----");
//                }
//            }
//        }