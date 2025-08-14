package test.java.InterfaceTest.TextDNN;

import M_V.MSU.OCI.ME.SMS.translator.C.Translator;
import M_V.MSU.OEI.ME.SMS.SEU.OSD.OSI.E.Translator_E;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.Verbal;
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
class DemoTSLTTest {
    /*
     * 这是一个 用于中英文翻译测试探索， 测试main函数demo的test版本，在导入了api之后进行系统集成，然后
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
//        IMV_SIQ ce = ((BinaryForest_AE) _A).getCnToEn();
//        IMV_SIQ ec = ((BinaryForest_AE) _A).getEnToCn();
//        IMV_SIQ poscc = ((BinaryForest_AE) _A).getPosCnToCn();
//        IMV_SIQ posec = ((BinaryForest_AE) _A).getPosEnToCn();
//        IMV_SIQ posee = ((BinaryForest_AE) _A).getPosEnToEn();
//        IMV_SIQ fce = ((BinaryForest_AE) _A).getFullCnToEn();
//        IMV_SIQ fec = ((BinaryForest_AE) _A).getFullEnToCn();
        System.out.println("输入");
        String v = "如流枫之回雪, 若浣花洗月";
////		 //String v= "数据一直在更新中";
//		String v= "中国正在崛起的道路上奔跑";
//		String v= "我一直在奔跑, 我需要一双翅膀！";
//		String v= "他也一直在奔跑, 他同样需要一双翅膀！";
        System.out.println(v);
        Translator ts = new Translator_E();
        ts.IV_(commonTestInition.NE.app_S._A);
//		TimeCheck t= new TimeCheck();
//		t.begin();
        List<Verbal> verbals = ts.index(commonTestInition.NE.app_S._A, v);
        String ch = ts.getChineseSentenseFromVerbalList(verbals);
//		t.end();
        System.out.println("中文");
        System.out.println(ch);

        for (int i = 0; i < verbals.size(); i++) {
            System.out.print(verbals.get(i).getChinese());
            System.out.print(verbals.get(i).getEnglish());
            System.out.print(verbals.get(i).getExplain());
            System.out.println(verbals.get(i).getPartOfSpeech());
        }
        List<Verbal> verbalsFix = ts.fixPos(verbals);
        String en = ts.getEnglishSentenseFromVerbalFixList(verbalsFix);
        System.out.println("");
        System.out.println("英文");
        System.out.println(en);

        for (int i = 0; i < verbalsFix.size(); i++) {
            System.out.print(verbalsFix.get(i).getChinese());
            System.out.print(verbalsFix.get(i).getEnglish());
            System.out.print(verbalsFix.get(i).getExplain());
            System.out.println(verbalsFix.get(i).getPartOfSpeech());
        }

        System.out.println("");
        System.out.println("中文解释");
        for (int i = 0; i < verbals.size(); i++) {
            System.out.print(verbals.get(i).getExplain()
                == null ? verbals.get(i).getChinese() : verbals.get(i).getExplain());
        }
//		t.duration();

//		ReadEnglish readEnglish= new ReadEnglish();
//		readEnglish.setPreReadText(en);
//		readEnglish.start();
        //output

        //end
        commonTestInition.endEnvironment();
    }
}