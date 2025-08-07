package test.java.InterfaceTest.TextDNN;

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
import S_A.SVQ.stable.S_Maps;
import S_A.SVQ.stable.S_MapsInitons;
import S_A.SixActionMap.StudyVerbaMap;
import S_A.SixActionMap.WorkVerbaMap;
import S_A.VSQ.parser.EmotionSample;
import S_A.linePage.PageQ;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_;
import VSQ.parser.FMHMMListOneTime_E_X_S;
import V_A.SQ.ReadPinYinBihua;
import jnisort.LYGSortESU9D;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
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
 * 这是一个 关于极速罗氏ANN计算前的属性词库测试 测试main函数demo的test版本，这个函数主要用于在导入属性
 * 词库表的时候避免各类问题比如1 词库表中有回车空行，2 词库表的KV不对称，3 词库表的多语序列不对齐，
 * 4 词库表乱码，5词库表分隔符错误等。
 * --罗瑶光
 * */
class SensingTestTest {
    @Test
    void doTest() {
        //初始化-----------------------------------------------------------------
        //环境初始化。以后接口优化做 junit系统化测试 下面的环境配置 可以写在 test before()里面。
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
        app_S._A.nlp_C.pos_X_P = app_S.pos_X_P;//注意不要出现嵌套计算环境。*/xxxx
        app_S.studyVerbaMap.putObject("_A.nlp_C.pos_X_P", app_S._A.nlp_C.pos_X_P);
        app_S._A.pos_C = app_S.pos_X_P;
        app_S.studyVerbaMap.putObject("_A.pos_C", app_S._A.pos_C);
        NE._I_U = app_S;
        // 1 显示当前所有词库，重要属性
        IMV_SIQ _getDistinctionMap = NE.app_S.emotionMap_E.getDistinctionMap();
        IMV_SIQ _getMotivationMap = NE.app_S.emotionMap_E.getMotivationMap();
        IMV_SIQ _getNegativeMap = NE.app_S.emotionMap_E.getNegativeMap();
        IMV_SIQ _getPositiveMap = NE.app_S.emotionMap_E.getPositiveMap();
        IMV_SIQ _getPredictionMap = NE.app_S.emotionMap_E.getPredictionMap();
        IMV_SIQ _getTrendingMap = NE.app_S.emotionMap_E.getTrendingMap();
        // --下列这些词库-代表个人思维强烈，商业应用请大佬们面向产业领域重新设计和修改。
        System.out.println("-----词汇分类和总数测试----");
        // 1 褒义类词库
        System.out.println("褒义词总数-->" + _getPositiveMap.size());
        // 2 贬义类词库
        System.out.println("贬义词总数-->" + _getNegativeMap.size());
        // 3 动机类词库
        System.out.println("动机词总数-->" + _getMotivationMap.size());
        // 4 区别类词库
        System.out.println("区别词总数-->" + _getDistinctionMap.size());
        // 5 预测类词库
        System.out.println("预测词总数-->" + _getPredictionMap.size());
        // 6 趋势类词库
        System.out.println("趋势词总数-->" + _getTrendingMap.size());
        //
        System.out.println("-----词汇文件编码格式简单检测是否是乱码-----");
        // 1 褒义类词库
        System.out.println("褒义词显示-->连贯-->" + _getPositiveMap.getString("连贯"));
        // 2 贬义类词库
        System.out.println("贬义词显示-->破烂-->" + _getNegativeMap.getString("破烂"));
        // 3 动机类词库
        System.out.println("动机词显示-->严谨-->" + _getMotivationMap.getString("严谨"));
        // 4 区别类词库
        System.out.println("区别词显示-->学习-->" + _getDistinctionMap.getString("学习"));
        // 5 预测类词库
        System.out.println("预测词显示-->稳重-->" + _getPredictionMap.getString("稳重"));
        // 6 趋势类词库
        System.out.println("趋势词显示-->微笑-->" + _getTrendingMap.getString("微笑"));
        // 7 同义类词库--trif 涉及英文拓扑。
        // 8 古拉丁语十六元基编码反义词自动词库，--trif -略先。
    }

    @Test
    void getSets() {
    }

    @Test
    void i_Sets() {
    }

    @Test
    void getPosCnToCn() {
    }

    @Test
    void getMatrix() {
    }

    @Test
    void testGetMatrix() {
    }

    @Test
    void main() {
    }
}
//输出
//Connected to the target VM, address: '127.0.0.1:63241', transport: 'socket'
//    -----词汇分类和总数测试----
//    褒义词总数-->3477
//    贬义词总数-->971
//    动机词总数-->244
//    区别词总数-->400
//    预测词总数-->25
//    趋势词总数-->241
//    -----词汇文件编码格式简单检测是否是乱码-----
//    褒义词显示-->连贯-->true
//    贬义词显示-->破烂-->true
//    动机词显示-->严谨-->疑虑
//    区别词显示-->学习-->学徒
//    预测词显示-->稳重-->防御
//    趋势词显示-->微笑-->自信
//    Disconnected from the target VM, address: '127.0.0.1:63241', transport: 'socket'
//
//    Process finished with exit code 0
