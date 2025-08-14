package test.java.InterfaceTest;

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
import S_A.SVQ.stable.S_MapsInitons;
import S_A.SixActionMap.StudyVerbaMap;
import S_A.SixActionMap.WorkVerbaMap;
import S_A.VSQ.parser.EmotionSample;
import S_A.linePage.PageQ;
import VSQ.parser.FMHMMListOneTime_E_X_S;
import V_A.SQ.ReadPinYinBihua;
import jnisort.LYGSortESU9D;

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
 * 这是一个 功能测试的环境函数提出项，用于测试源码去重。 测试main函数demo的test版本。
 * --罗瑶光
 * */
public class CommonTestInition {
    public App NE;

    public void initEnvironment(String stringConfigUI) {
        if (null != NE) {
            return;
        }
        //环境初始化。
        System.out.println("*环境初始化*");
        NE = new App();
        NE.tempString = stringConfigUI.toString();//注意哦，这行别乱用
        NE.app_S = new App_S();
        App_S app_S = NE.app_S;
        app_S.studyVerbaMap = new StudyVerbaMap();
        //*/
        System.out.println("*卷积环境 init*");
        U_A.PEU.P.wave.Guassian.initKernel(5, 1.7);//later in golbal
        app_S.pageQ = new PageQ();
        app_S.studyVerbaMap.putObject("pageQ", app_S.pageQ);
        /*basic init*/
        System.out.println("*PDE环境 init*");
        S_MapsInitons.init();
        S_Colors.initFlowers3D();
        /*sort init*/
        System.out.println("*排序环境 init*");
        app_S.quick6DLuoYaoguangSort3DMap_E = new Quick6DLuoYaoguangSort3DMap_E();
        app_S.studyVerbaMap.putObject("quick6DLuoYaoguangSort3DMap_E"
            , app_S.quick6DLuoYaoguangSort3DMap_E);
        app_S.lYGSortESU9D = new LYGSortESU9D();
        app_S.studyVerbaMap.putObject("lYGSortESU9D", app_S.lYGSortESU9D);
        //literature init*/
        System.out.println("*语料库表环境 init*");
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
        System.out.println("*CNN type init*");
        System.out.println("*ANN RNN DNN init*");
        app_S.dNNTest = new DNNTest();
        app_S.studyVerbaMap.putObject("dNNTest", app_S.dNNTest);
        app_S.aNNTest = new ANNTest();
        app_S.studyVerbaMap.putObject("aNNTest", app_S.aNNTest);
        app_S.rNN_IDETest = new RNN_IDETest();
        app_S.studyVerbaMap.putObject("rNN_IDETest", app_S.rNN_IDETest);
        //6 actions map*/
        System.out.println("*六元催化 map*");
        app_S.workVerbaMap = new WorkVerbaMap();
        app_S.studyVerbaMap.putObject("workVerbaMap", app_S.workVerbaMap);
        app_S.workVerbaMap.initActionMap();
        app_S.studyVerbaMap.putObject("workVerbaMap", app_S.workVerbaMap);
        //bloosm init*/
        System.out.println("*花孢环境 init*");
        System.out.println("*略先 init*");
        //POS init*/
        System.out.println("*词性环境 init*");
        app_S.nERO_C_OneTime_E = new NERO_C_OneTime_E();
        app_S.studyVerbaMap.putObject("nERO_C_OneTime_E", app_S.nERO_C_OneTime_E);
        app_S.fMHMMListOneTime_E = new FMHMMListOneTime_E();
        app_S.studyVerbaMap.putObject("fMHMMListOneTime_E", app_S.fMHMMListOneTime_E);
        //分词引擎初始化
        System.out.println("*分词引擎 init*");
        app_S._A = new CogsBinaryForest_AE();
        app_S._A.fHMMList = app_S.fMHMMListOneTime_E;
        app_S._A.pos_C = app_S.pos_X_P;
        app_S._A.nlp_C = app_S.nlp_CE_X_S;
        app_S._A.nero_C = app_S.nERO_C_OneTime_E;
        app_S._A.emotionMap = app_S.emotionMap_E;
        app_S._A.sensingTest = app_S.sensingTest;
        app_S._A.quick6DLuoYaoguangSort = app_S.quick6DLuoYaoguangSort3DMap_E;
        //分词初始化
        System.out.println("*自然语言环境 init*");
        app_S._A.IV_Mixed(NE);
        app_S.fMHMMListOneTime_E_X_S = (FMHMMListOneTime_E_X_S) app_S._A.fHMMList;
        app_S.studyVerbaMap.putObject("fMHMMListOneTime_E_X_S", app_S.fMHMMListOneTime_E_X_S);
        app_S._A.forestRoots = app_S._A.fHMMList.getMap();
        app_S.studyVerbaMap.putObject("_A.forestRoots ", app_S._A.forestRoots);
        app_S.pos_X_P = new Pos_X_P();
        app_S.studyVerbaMap.putObject("pos_X_P", app_S.pos_X_P);
        app_S.nlp_CE_X_S = new Nlp_CE_X_S();
        app_S.studyVerbaMap.putObject("nlp_CE_X_S", app_S.nlp_CE_X_S);
        //枝叶 register*/
        System.out.println("*其他枝叶 register*");
        app_S.pos_X_P.wordsForest = app_S.fMHMMListOneTime_E_X_S.posCnToCn;
        app_S.studyVerbaMap.putObject("pos_X_P.wordsForest", app_S.pos_X_P.wordsForest);
        app_S.nlp_CE_X_S.wordsForest = app_S.fMHMMListOneTime_E_X_S.posCnToCn;
        app_S.studyVerbaMap.putObject("nlp_CE_X_S.wordsForest", app_S.nlp_CE_X_S.wordsForest);
        app_S._A.wordsForest = app_S.fMHMMListOneTime_E_X_S.posCnToCn;
        app_S.studyVerbaMap.putObject("_A.wordsForest", app_S._A.wordsForest);
        app_S._A.nlp_C = app_S.nlp_CE_X_S;//later..*/
        app_S.studyVerbaMap.putObject("_A.nlp_C", app_S._A.nlp_C);
        app_S._A.nlp_C.pos_X_P = app_S.pos_X_P;//注意不要出现嵌套计算环境。*/
        app_S.studyVerbaMap.putObject("_A.nlp_C.pos_X_P", app_S._A.nlp_C.pos_X_P);
        app_S._A.pos_C = app_S.pos_X_P;
        app_S.studyVerbaMap.putObject("_A.pos_C", app_S._A.pos_C);
        NE._I_U = app_S;
        app_S._AE = app_S._A;//注意接口注册关系
    }

    public void endEnvironment() {
        if (null == NE) {
            return;
        }
        NE.stop();
    }
}
//输出
//    Connected to the target VM, address: '127.0.0.1:51668', transport: 'socket'
//    *环境初始化*
//    *卷积环境 init*
//    *PDE环境 init*
//    *排序环境 init*
//    *语料库表环境 init*
//    *CNN type init*
//    *ANN RNN DNN init*
//    *六元催化 map*
//    *花苞环境 init*
//    *略先 init*
//    *词性环境 init*
//    *分词引擎 init*
//    *自然语言环境 init*
//    *其他枝叶 register*
//    end cost: 4164 ms
//    -展示分词-
//    罗瑶光 先生 从 2018 年 10 月 开始 ， 所有 个人 著作权 作品 ， 全部 开源 ， 到 现在 ， 无数 群体
//    ， 技术 社团 正面 交锋 7 年 ， 一直 0 纠纷 ， 罗瑶光 先生 认为 ， 一件 作品 ， 一个 事 物 ， 如果
//    有 价值 ， 就 应该 像 教材 一样 在 真实 的 环境 中 实践 测试 和 论证 ， 能 经得起 所有 人 长年累月
//    不断 地 挑剔 的 东西 ， 才是 货真价实 的 ， 罗瑶光 的 个人 著作权 作品 都是 互联网 ， 大 数据 产业
//    领域 基础 作品 ， 2018 年后 ， 在 60 余 互联网 app 上 发布 德塔 开源 的 作品 ， 罗瑶光 先生 认为
//    开源 作品 对 同行 呈现 包容 性 。 同时 对 垄断 产业 有 约束 性 。     -展示词性-注意副词库表问题，
//    形容词副词表里面的词汇不是罗瑶光研发设计的--具体见DemoPOSTest函数的修正方法
//    -展示词性-
//    罗瑶光/人物名词----先生/名词----从/介词----2018/NULL----年/量词----10/数词----月/名词----
//    开始/动词----，/标点----所有/名词----个人/名词----著作权/名词----作品/名词----，/标点----
//    全部/副词----开源/未知----，/标点----到/动词----现在/时态词----，/标点----无数/数词----
//    群体/未知----，/标点----技术/名词----社团/名词----正面/名词----交锋/形谓词作形容词----7/名词-
//    ---年/量词----，/标点----一直/形谓词作形容词----0/名词----纠纷/名词----，/标点----罗瑶光/人物名词
//    ----先生/名词----认为/动词----，/标点----一件/形谓词作形容词----作品/名词----，/标点----
//    一个/量词----事/名词----物/名词----，/标点----如果/从属连词----有/动词----价值/名词----，/标点-
//    ---就/副词----应该/情态词----像/形谓词作形容词----教材/名词----一样/形谓词----在/介词----
//    真实/形谓词作形容词----的/结构助词----环境/名词----中/定名词----实践/名词----测试/动词----
//    和/并列连词----论证/名词----，/标点----能/情态词----经得起/形谓词作形容词----所有/名词----
//    人/名词----长年累月/名词----
//    不断/形谓词作副词----地/形谓词作副词----挑剔/动词----的/结构助词----东西/名词----，/标点---
//    -才是/副词----货真价实/形谓词作形容词----的/结构助词----，/标点----罗瑶光/人物名词----的/结构助词
//    ----个人/名词----著作权/名词----作品/名词----都是/形谓词作形容词----互联网/名词----，/标点----
//    大/形谓词作形容词----数据/名词----产业/名词----领域/名词----基础/名词----作品/名词----，/标点
//    ----2018/NULL----年后/未知----，/标点----在/介词----60/NULL----余/实体名----互联网/名词
//    ----app/实体名----上/名词----发布/动词----德塔/名词----开源/形谓词作形容词----的/结构助词
//    ----作品/名词----，/标点----罗瑶光/人物名词----先生/名词----认为/动词----开源/形谓词作形容词
//    ----作品/名词----对/介词----同行/名词----呈现/动词----包容/动词----性/名词----。/标点----
//    同时/连词----对/介词----垄断/动词----产业/名词----有/动词----约束/名词----性/名词----。/标点----
//    --词汇->罗瑶光-词性->名词-平均距离->55-出现频率->4.0
//    --词汇->先生-词性->名词-平均距离->48-出现频率->3.0
//    --词汇->月-词性->名词-平均距离->6-出现频率->1.0
//    --词汇->所有-词性->名词-平均距离->37-出现频率->2.0
//    --词汇->个人-词性->名词-平均距离->45-出现频率->2.0
//    --词汇->著作权-词性->名词-平均距离->46-出现频率->2.0
//    --词汇->作品-词性->名词-平均距离->74-出现频率->6.0
//    --词汇->技术-词性->名词-平均距离->23-出现频率->1.0
//    --词汇->社团-词性->名词-平均距离->24-出现频率->1.0
//    --词汇->正面-词性->名词-平均距离->25-出现频率->1.0
//    --词汇->7-词性->名词-平均距离->27-出现频率->1.0
//    --词汇->0-词性->名词-平均距离->31-出现频率->1.0
//    --词汇->纠纷-词性->名词-平均距离->32-出现频率->1.0
//    --词汇->事-词性->名词-平均距离->42-出现频率->1.0
//    --词汇->物-词性->名词-平均距离->43-出现频率->1.0
//    --词汇->价值-词性->名词-平均距离->47-出现频率->1.0
//    --词汇->教材-词性->名词-平均距离->52-出现频率->1.0
//    --词汇->环境-词性->名词-平均距离->57-出现频率->1.0
//    --词汇->中-词性->名词-平均距离->58-出现频率->1.0
//    --词汇->实践-词性->名词-平均距离->59-出现频率->1.0
//    --词汇->论证-词性->名词-平均距离->62-出现频率->1.0
//    --词汇->人-词性->名词-平均距离->67-出现频率->1.0
//    --词汇->长年累月-词性->名词-平均距离->68-出现频率->1.0
//    --词汇->东西-词性->名词-平均距离->73-出现频率->1.0
//    --词汇->互联网-词性->名词-平均距离->92-出现频率->2.0
//    --词汇->数据-词性->名词-平均距离->88-出现频率->1.0
//    --词汇->产业-词性->名词-平均距离->106-出现频率->2.0
//    --词汇->领域-词性->名词-平均距离->90-出现频率->1.0
//    --词汇->基础-词性->名词-平均距离->91-出现频率->1.0
//    --词汇->余-词性->名词-平均距离->99-出现频率->1.0
//    --词汇->app-词性->名词-平均距离->101-出现频率->1.0
//    --词汇->上-词性->名词-平均距离->102-出现频率->1.0
//    --词汇->德塔-词性->名词-平均距离->104-出现频率->1.0
//    --词汇->同行-词性->名词-平均距离->115-出现频率->1.0
//    --词汇->性-词性->名词-平均距离->122-出现频率->2.0
//    --词汇->约束-词性->名词-平均距离->125-出现频率->1.0
//    --词汇->开始-词性->动词-平均距离->7-出现频率->1.0
//    --词汇->到-词性->动词-平均距离->17-出现频率->1.0
//    --词汇->认为-词性->动词-平均距离->73-出现频率->2.0
//    --词汇->有-词性->动词-平均距离->85-出现频率->2.0
//    --词汇->测试-词性->动词-平均距离->60-出现频率->1.0
//    --词汇->挑剔-词性->动词-平均距离->71-出现频率->1.0
//    --词汇->发布-词性->动词-平均距离->103-出现频率->1.0
//    --词汇->呈现-词性->动词-平均距离->116-出现频率->1.0
//    --词汇->包容-词性->动词-平均距离->117-出现频率->1.0
//    --词汇->垄断-词性->动词-平均距离->122-出现频率->1.0
//    --词汇->开源-词性->形谓词作形容词-平均距离->77-出现频率->3.0
//    --词汇->群体-词性->null-平均距离->21-出现频率->1.0
//    --词汇->交锋-词性->形谓词作形容词-平均距离->26-出现频率->1.0
//    --词汇->一直-词性->形谓词作形容词-平均距离->30-出现频率->1.0
//    --词汇->一件-词性->形谓词作形容词-平均距离->38-出现频率->1.0
//    --词汇->像-词性->形谓词作形容词-平均距离->51-出现频率->1.0
//    --词汇->一样-词性->null-平均距离->53-出现频率->1.0
//    --词汇->真实-词性->形谓词作形容词-平均距离->55-出现频率->1.0
//    --词汇->经得起-词性->形谓词作形容词-平均距离->65-出现频率->1.0
//    --词汇->不断-词性->形谓词作副词-平均距离->69-出现频率->1.0
//    --词汇->地-词性->形谓词作副词-平均距离->70-出现频率->1.0
//    --词汇->货真价实-词性->形谓词作形容词-平均距离->76-出现频率->1.0
//    --词汇->都是-词性->形谓词作形容词-平均距离->84-出现频率->1.0
//    --词汇->大-词性->形谓词作形容词-平均距离->87-出现频率->1.0
//    --词汇->年后-词性->null-平均距离->95-出现频率->1.0
//    --词汇->全部-词性->null-平均距离->14-出现频率->1.0
//    --词汇->开源-词性->null-平均距离->15-出现频率->1.0
//    --词汇->群体-词性->null-平均距离->21-出现频率->1.0
//    --词汇->就-词性->null-平均距离->49-出现频率->1.0
//    --词汇->不断-词性->形谓词作副词-平均距离->69-出现频率->1.0
//    --词汇->地-词性->形谓词作副词-平均距离->70-出现频率->1.0
//    --词汇->才是-词性->null-平均距离->75-出现频率->1.0
//    --词汇->年后-词性->null-平均距离->95-出现频率->1.0-展示词频统计-
//    ，:18.0----作品:6.0----的:5.0----罗瑶光:4.0----开源:3.0----先生:3.0---- :2.0----产业:2.0
//    ----2018:2.0----年:2.0----对:2.0----所有:2.0----个人:2.0----著作权:2.0----。:2.0----
//    认为:2.0----有:2.0----性:2.0----互联网:2.0----在:2.0----包容:1.0----数据:1.0----大:1.0-
//    ---领域:1.0----都是:1.0----货真价实:1.0----才是:1.0----东西:1.0----挑剔:1.0----地:1.0----
//    不断:1.0----长年累月:1.0----人:1.0----经得起:1.0----能:1.0----论证:1.0----和:1.0----
//    测试:1.0----实践:1.0----中:1.0----环境:1.0----基础:1.0----真实:1.0----年后:1.0----
//    一样:1.0----教材:1.0----像:1.0----应该:1.0----就:1.0----价值:1.0----60:1.0----如果:1.0
//    ----物:1.0----事:1.0----一个:1.0----一件:1.0----余:1.0----纠纷:1.0----0:1.0----一直:1.0
//    ----7:1.0----交锋:1.0----正面:1.0----社团:1.0----技术:1.0----群体:1.0----无数:1.0----
//    现在:1.0----到:1.0----app:1.0----全部:1.0----同时:1.0----上:1.0----发布:1.0----德塔:1.0
//    ----垄断:1.0----开始:1.0----月:1.0----10:1.0----同行:1.0----从:1.0----约束:1.0----
//    呈现:1.0----
//    Disconnected from the target VM, address: '127.0.0.1:51668', transport: 'socket'
//
//    Process finished with exit code 0