package test.java.InterfaceTest.chineseParser;

import A_V.ASQ.PSU.test.TimeCheck;
import A_V.E.RatioMap_E;
import A_V.IVDTIXQCTIV.EmotionInit;
import A_V.IVDTIXQCTIV.EnvironmentInit;
import A_V.IVDTIXQCTIV.LenovoInit;
import E.Nlp_CE_X_S;
import E_A.ME.analysis.E.CogsBinaryForest_AE;
import E_A.ME.liner.E.Quick6DLuoYaoguangSort3DMap_E;
import E_A.ME.nero.E.NERO_C_OneTime_E;
import E_A.OEI.AMV.ECS.SVQ.MPC.SOQ.OEM.E.SensingMap_E;
import E_A.OEI.AVC.SUQ.SVQ.MPC.fhmm.E.EmotionMap_E;
import E_A.OEI.SVQ.MPC.fhmm.E.FMHMMListOneTime_E;
import ME.VPC.M.app.App;
import ME.VPC.S.ne.App_S;
import P.Pos_X_P;
import P_V.PEQ.AMV.ECS.test.ANNTest;
import P_V.PEQ.AMV.ECS.test.DNNTest;
import P_V.PEQ.AMV.ECS.test.RNN_IDETest;
import P_V.PEQ.AMV.ECS.test.SensingTest;
import P_V.PEQ.OPM.VEC.test.SuccessICATest;
import S_A.SVQ.stable.S_Colors;
import S_A.SVQ.stable.S_Common;
import S_A.SVQ.stable.S_MapsInitons;
import S_A.SixActionMap.StudyVerbaMap;
import S_A.SixActionMap.WorkVerbaMap;
import S_A.VSQ.parser.EmotionSample;
import S_A.linePage.PageQ;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_SS;
import S_A.pheromone.IMV_SIQ_S_;
import VSQ.parser.FMHMMListOneTime_E_X_S;
import V_A.SQ.ReadPinYinBihua;
import jnisort.LYGSortESU9D;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

//import SVQ.stable.S_Common;
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
        //环境初始化。
        App NE = new App();
        NE.app_S = new App_S();
        App_S app_S = NE.app_S;
        app_S.studyVerbaMap = new StudyVerbaMap();
        //*/
        U_A.PEU.P.wave.Guassian.initKernel(5, 1.7);//later in golbal
        app_S.pageQ = new PageQ();
        app_S.studyVerbaMap.putObject("pageQ", app_S.pageQ);
        /*basic init*/
        S_MapsInitons.init();
        S_Colors.initFlowers3D();
        /*sort init*/
        app_S.quick6DLuoYaoguangSort3DMap_E = new Quick6DLuoYaoguangSort3DMap_E();
        app_S.studyVerbaMap.putObject("quick6DLuoYaoguangSort3DMap_E"
            , app_S.quick6DLuoYaoguangSort3DMap_E);

        app_S.lYGSortESU9D = new LYGSortESU9D();
        app_S.studyVerbaMap.putObject("lYGSortESU9D", app_S.lYGSortESU9D);
        //literature init*/
        ReadPinYinBihua.getPinYinBihuaMap(NE);
        app_S.lenovoInit = new LenovoInit();
        app_S.studyVerbaMap.putObject("lenovoInit", app_S.lenovoInit);
        app_S.environmentInit = new EnvironmentInit();
        app_S.studyVerbaMap.putObject("environmentInit", app_S.environmentInit);
        app_S.emotionInit = new EmotionInit();
        app_S.studyVerbaMap.putObject("emotionInit", app_S.emotionInit);
        app_S.ratioMap_E = new RatioMap_E();//350m 70m*/
        app_S.studyVerbaMap.putObject("ratioMap_E", app_S.ratioMap_E);
        app_S.ratioMap = app_S.ratioMap_E;
        app_S.studyVerbaMap.putObject("ratioMap", app_S.ratioMap);

        app_S.emotionSample = new EmotionSample();//later..*/
        app_S.studyVerbaMap.putObject("emotionSample", app_S.emotionSample);
        app_S.sensingTest = new SensingTest();
        app_S.studyVerbaMap.putObject("sensingTest", app_S.sensingTest);

        app_S.successICATest = new SuccessICATest();
        app_S.studyVerbaMap.putObject("successICATest", app_S.successICATest);
        app_S.sensingMap_E = new SensingMap_E();
        app_S.studyVerbaMap.putObject("sensingMap_E", app_S.sensingMap_E);
        app_S.emotionMap_E = new EmotionMap_E();
        app_S.studyVerbaMap.putObject("emotionMap_E", app_S.emotionMap_E);

        app_S.emotionMap_E.IV_MotivationMap(NE);
        app_S.studyVerbaMap.putObject("emotionMap_E", app_S.emotionMap_E);
        app_S.emotionMap_E.IV_TrendingMap(NE);
        app_S.studyVerbaMap.putObject("emotionMap_E", app_S.emotionMap_E);
        app_S.emotionMap_E.IV_PredictionMap(NE);
        app_S.studyVerbaMap.putObject("emotionMap_E", app_S.emotionMap_E);
        app_S.emotionMap_E.IV_DistinctionMap(NE);
        app_S.studyVerbaMap.putObject("emotionMap_E", app_S.emotionMap_E);
        app_S.emotionMap_E.IV_NegativeMap(NE);
        app_S.studyVerbaMap.putObject("emotionMap_E", app_S.emotionMap_E);
        app_S.emotionMap_E.IV_PositiveMap(NE);
        app_S.studyVerbaMap.putObject("emotionMap_E", app_S.emotionMap_E);
        //cnn*/
        app_S.dNNTest = new DNNTest();
        app_S.studyVerbaMap.putObject("dNNTest", app_S.dNNTest);
        app_S.aNNTest = new ANNTest();
        app_S.studyVerbaMap.putObject("aNNTest", app_S.aNNTest);
        app_S.rNN_IDETest = new RNN_IDETest();
        app_S.studyVerbaMap.putObject("rNN_IDETest", app_S.rNN_IDETest);
        //6 actions map*/
        app_S.workVerbaMap = new WorkVerbaMap();
        app_S.studyVerbaMap.putObject("workVerbaMap", app_S.workVerbaMap);
        app_S.workVerbaMap.initActionMap();
        app_S.studyVerbaMap.putObject("workVerbaMap", app_S.workVerbaMap);
        //bloosm init*/
        //
        //POS init*/
        app_S.nERO_C_OneTime_E = new NERO_C_OneTime_E();
        app_S.studyVerbaMap.putObject("nERO_C_OneTime_E", app_S.nERO_C_OneTime_E);
        app_S.fMHMMListOneTime_E = new FMHMMListOneTime_E();
        app_S.studyVerbaMap.putObject("fMHMMListOneTime_E", app_S.fMHMMListOneTime_E);
        //分词引擎初始化
        app_S._A = new CogsBinaryForest_AE();
        app_S._A.fHMMList = app_S.fMHMMListOneTime_E;
        app_S._A.pos_C = app_S.pos_X_P;
        app_S._A.nlp_C = app_S.nlp_CE_X_S;
        app_S._A.nero_C = app_S.nERO_C_OneTime_E;
        app_S._A.emotionMap = app_S.emotionMap_E;
        app_S._A.sensingTest = app_S.sensingTest;
        app_S._A.quick6DLuoYaoguangSort = app_S.quick6DLuoYaoguangSort3DMap_E;
        //分词初始化
        app_S._A.IV_Mixed(NE);
        app_S.fMHMMListOneTime_E_X_S = (FMHMMListOneTime_E_X_S) app_S._A.fHMMList;
        app_S.studyVerbaMap.putObject("fMHMMListOneTime_E_X_S", app_S.fMHMMListOneTime_E_X_S);
        app_S._A.forestRoots = app_S._A.fHMMList.getMap();
        app_S.studyVerbaMap.putObject("_A.forestRoots ", app_S._A.forestRoots);
        app_S.pos_X_P = new Pos_X_P();
        app_S.studyVerbaMap.putObject("pos_X_P", app_S.pos_X_P);
        app_S.nlp_CE_X_S = new Nlp_CE_X_S();
        app_S.studyVerbaMap.putObject("nlp_CE_X_S", app_S.nlp_CE_X_S);
        //register*/
        app_S.pos_X_P.wordsForest = app_S.fMHMMListOneTime_E_X_S.posCnToCn;
        app_S.studyVerbaMap.putObject("pos_X_P.wordsForest", app_S.pos_X_P.wordsForest);
        app_S.nlp_CE_X_S.wordsForest = app_S.fMHMMListOneTime_E_X_S.posCnToCn;
        app_S.studyVerbaMap.putObject("nlp_CE_X_S.wordsForest", app_S.nlp_CE_X_S.wordsForest);
        app_S._A.wordsForest = app_S.fMHMMListOneTime_E_X_S.posCnToCn;
        app_S.studyVerbaMap.putObject("_A.wordsForest", app_S._A.wordsForest);
        //
        app_S._A.nlp_C = app_S.nlp_CE_X_S;//later..*/
        app_S.studyVerbaMap.putObject("_A.nlp_C", app_S._A.nlp_C);
        app_S._A.nlp_C.pos_X_P = app_S.pos_X_P;//注意不要出现嵌套计算环境。*/
        app_S.studyVerbaMap.putObject("_A.nlp_C.pos_X_P", app_S._A.nlp_C.pos_X_P);
        app_S._A.pos_C = app_S.pos_X_P;
        app_S.studyVerbaMap.putObject("_A.pos_C", app_S._A.pos_C);
        NE._I_U = app_S;
        //词性初始化
        IMV_SIQ pos = app_S._A.getPosCnToCn();
        List<String> sets = new ArrayList<>();
        IMV_SIQ_SS seta = new IMV_SIQ_SS();
        TimeCheck t = new TimeCheck();
        //等待分词的语句
        String ss = new String("罗瑶光先生从2018年10月开始，所有个人著作权作品，全部开源，到现在，和无数群体，技术社团" +
            "正面交锋7年，一直0纠纷，罗瑶光先生认为，一件作品，一个事物，如果有价值，就应该像教材一样在真实" +
            "的环境中实践测试和论证，能经得起所有人长年累月不断地挑剔的东西，才是货真价实的，罗瑶光的个人著作权" +
            "作品都是互联网，大数据产业领域基础作品，2018年后，在60余互联网app上发布德塔开源的作品，罗瑶光先生" +
            "认为开源作品对同行呈现包容性。同时对垄断产业有约束性。");
       StringBuilder sb = new StringBuilder(ss);
        t.begin();
        for (int i = 0; i < 100000; i++) {
            //执行分词
            sets = app_S._A.parserMixedString(sb);
        }
        t.end();
        t.duration();
        System.out.println("-展示分词-");
        for (int i = 0; i < sets.size(); i++) {
            if (sets.get(i) != null) {
                System.out.print(sets.get(i) + " ");
            }
        }
        System.out.println("-展示词性-");
        for (int j = 0; j < 1; j++) {
            for (int i = 0; i < sets.size(); i++) {
                if (!sets.get(i).replaceAll("\\s+", "").equals("")) {
                    System.out.print(sets.get(i) + "/" + pos.get(sets.get(i)) + "----");
                }
            }
        }

        System.out.println("-展示词频统计-");
        IMV_SIQ_S_ fwa = app_S._A.getWordFrequencyByReturnSortMap(sets, NE);
        //		t.end();
        for (int i = fwa.size() - 1; i >= 0; i--) {
            System.out.print(fwa.get(i).get_word() + S_Common.STRING_SYMBOL_PER
                + fwa.get(i).get_frequency() + "----");
        }
        //关闭
        NE.stop();
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