package test.java.InterfaceTest.chineseParser;

import S_A.SVQ.stable.S_Maps;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_;
import V_A.SQ.ReadPinYinBihua;
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
/*
 * 这是一个 关于极速分词 测试main函数demo的test版本，这个函数主要用于在导入语料库的词库表的时候避免各类问题
 * 比如1 词库表中有回车空行，2 词库表的KV不对称，3 词库表的多语序列不对齐，4 词库表乱码，5词库表分隔符错误等。
 * --罗瑶光
 * */
class FMHMMListOneTime_ETest {
    @Test
    void doTest() {
        //初始化-----------------------------------------------------------------
        //环境初始化。以后接口优化做 junit系统化测试 下面的环境配置 可以写在 test before()里面。
        CommonTestInition commonTestInition = new CommonTestInition();
        commonTestInition.initEnvironment("去弹窗组件流测试");
        // 1 显示当前所有词库，重要属性
        // 1.1 词汇类词库
        System.out.println("--------词性类词库--------");
        System.out.println("把动词总数-->" + S_Maps.baDongCi.size());
        System.out.println("代词总数-->" + S_Maps.daiCi.size());
        System.out.println("定名词总数-->" + S_Maps.dingMingCi.size());
        System.out.println("动词总数-->" + S_Maps.dongCi.size());
        System.out.println("副词总数-->" + S_Maps.fuCi.size());
        System.out.println("介词总数-->" + S_Maps.jieCi.size());
        System.out.println("连词总数-->" + S_Maps.lianCi.size());
        System.out.println("量词总数-->" + S_Maps.liangCi.size());
        System.out.println("名词总数-->" + S_Maps.mingCi.size());
        System.out.println("情态总数-->" + S_Maps.qingTaiCi.size());
        System.out.println("省略总数-->" + S_Maps.shengLueCi.size());
        System.out.println("时态总数-->" + S_Maps.shiTaiCi.size());
        System.out.println("限定总数-->" + S_Maps.xianDingCi.size());
        System.out.println("形容总数-->" + S_Maps.xingRongCi.size());
        System.out.println("形谓总数-->" + S_Maps.xingWeiCi.size());
        System.out.println("助词总数-->" + S_Maps.zhuCi.size());
        //词性类词库
        IMV_SIQ pos = commonTestInition.NE.app_S._A.getPosCnToCn();
        System.out.println("词性总数-->" + pos.size());
        //词长类词库
        System.out.println("--------词长类词库--------");
        System.out.println("单字词长总数-->" + S_Maps.CiOne.size());
        System.out.println("双字词长总数-->" + S_Maps.CiTwo.size());
        System.out.println("三字词长总数-->" + S_Maps.CiThree.size());
        System.out.println("四字词长总数-->" + S_Maps.CiFour.size());
        //多国语言类词库
        System.out.println("--------语种类词库--------");
        IMV_SIQ chineseToEnglish = commonTestInition.NE.app_S.fMHMMListOneTime_E_X_S.fullCnToEn;
        IMV_SIQ chineseToJapanese = commonTestInition.NE.app_S.fMHMMListOneTime_E_X_S.fullCnToJp;
        IMV_SIQ chineseToArabic = commonTestInition.NE.app_S.fMHMMListOneTime_E_X_S.fullCnToAb;
        IMV_SIQ chineseToTradition = commonTestInition.NE.app_S.fMHMMListOneTime_E_X_S.fullCnToTt;
        IMV_SIQ chineseToRussian = commonTestInition.NE.app_S.fMHMMListOneTime_E_X_S.fullCnToRs;
        IMV_SIQ chineseToKorean = commonTestInition.NE.app_S.fMHMMListOneTime_E_X_S.fullCnToKo;
        IMV_SIQ chineseToFrench = commonTestInition.NE.app_S.fMHMMListOneTime_E_X_S.fullCnToFn;
        IMV_SIQ chineseToSpanish = commonTestInition.NE.app_S.fMHMMListOneTime_E_X_S.fullCnToSp;
        IMV_SIQ chineseToGerman = commonTestInition.NE.app_S.fMHMMListOneTime_E_X_S.fullCnToGm;
        System.out.println("中英对照总数-->" + chineseToEnglish.size());
        System.out.println("繁体对照总数-->" + chineseToTradition.size());
        System.out.println("中韩对照总数-->" + chineseToKorean.size());
        System.out.println("中日对照总数-->" + chineseToJapanese.size());
        System.out.println("中法对照总数-->" + chineseToFrench.size());
        System.out.println("中西对照总数-->" + chineseToSpanish.size());
        System.out.println("中俄对照总数-->" + chineseToRussian.size());
        System.out.println("中德对照总数-->" + chineseToGerman.size());
        System.out.println("中阿对照总数-->" + chineseToArabic.size());
        //其他小语种略先。
        //拼音笔画词库
        System.out.println("--------汉语拼音笔画词库--------");
        IMV_SIQ_ pinYin = ReadPinYinBihua.pinYin;
        IMV_SIQ biHua = ReadPinYinBihua.biHua;
        System.out.println("拼音总数-->" + pinYin.size());
        System.out.println("笔画总数-->" + biHua.size());
        //词灵类词库
        // 2 词库表中有回车空行检测，
        // 3 词库表的KV不对称检测，
        //标本
        System.out.println("--------语种词库表的KV不对称仅仅快速检测--------");
        System.out.println("--------头--------");
        System.out.println("头-中英对照-->" + chineseToEnglish.getString("标本"));
        System.out.println("头-繁体对照-->" + chineseToTradition.getString("标本"));
        System.out.println("头-中韩对照-->" + chineseToKorean.getString("标本"));
        System.out.println("头-中日对照-->" + chineseToJapanese.getString("标本"));
        System.out.println("头-中法对照-->" + chineseToFrench.getString("标本"));
        System.out.println("头-中西对照-->" + chineseToSpanish.getString("标本"));
        System.out.println("头-中俄对照-->" + chineseToRussian.getString("标本"));
        System.out.println("头-中德对照-->" + chineseToGerman.getString("标本"));
        System.out.println("头-中阿对照-->" + chineseToArabic.getString("标本"));
        System.out.println("--------中--------");
        //立足
        System.out.println("中-中英对照-->" + chineseToEnglish.getString("立足"));
        System.out.println("中-繁体对照-->" + chineseToTradition.getString("立足"));
        System.out.println("中-中韩对照-->" + chineseToKorean.getString("立足"));
        System.out.println("中-中日对照-->" + chineseToJapanese.getString("立足"));
        System.out.println("中-中法对照-->" + chineseToFrench.getString("立足"));
        System.out.println("中-中西对照-->" + chineseToSpanish.getString("立足"));
        System.out.println("中-中俄对照-->" + chineseToRussian.getString("立足"));
        System.out.println("中-中德对照-->" + chineseToGerman.getString("立足"));
        System.out.println("中-中阿对照-->" + chineseToArabic.getString("立足"));
        System.out.println("--------尾--------");
        //羌活
        System.out.println("尾-中英对照总数-->" + chineseToEnglish.getString("羌活"));
        System.out.println("尾-中繁体字对照-->" + chineseToTradition.getString("羌活"));
        System.out.println("尾-中韩对照总数-->" + chineseToKorean.getString("羌活"));
        System.out.println("尾-中日对照总数-->" + chineseToJapanese.getString("羌活"));
        System.out.println("尾-中法对照总数-->" + chineseToFrench.getString("羌活"));
        System.out.println("尾-中西对照总数-->" + chineseToSpanish.getString("羌活"));
        System.out.println("尾-中俄对照总数-->" + chineseToRussian.getString("羌活"));
        System.out.println("尾-中德对照总数-->" + chineseToGerman.getString("羌活"));
        System.out.println("尾-中阿对照总数-->" + chineseToArabic.getString("羌活"));
        // 4 词库表的多语序列不对齐检测，
        // 5 词库表乱码检测，
        System.out.println("--------词库表乱码检测仅仅快速检测--------");
        System.out.println("乱码-拼音词库导入检测-->" + pinYin.getString("罗"));
        System.out.println("乱码-笔画词库导入检测-->" + biHua.getString("罗"));

        System.out.println("乱码-单字词长总数-->" + S_Maps.CiOne.get("罗"));
        System.out.println("乱码-双字词长总数-->" + S_Maps.CiTwo.get("信号"));
        System.out.println("乱码-三字词长总数-->" + S_Maps.CiThree.get("看不清"));
        System.out.println("乱码-四字词长总数-->" + S_Maps.CiFour.get("屈指可数"));

        System.out.println("乱码-把动词总数-->" + S_Maps.baDongCi.get("把"));
        System.out.println("乱码-代词总数-->" + S_Maps.daiCi.get("自身"));
        System.out.println("乱码-定名词总数-->" + S_Maps.dingMingCi.get("中"));
        System.out.println("乱码-动词总数-->" + S_Maps.dongCi.get("耍"));
        System.out.println("乱码-副词总数-->" + S_Maps.fuCi.get("仿佛"));//这个副词体系在中文理解上都有问题，因为英文是+地后戳。。
        System.out.println("乱码-介词总数-->" + S_Maps.jieCi.get("在"));
        System.out.println("乱码-连词总数-->" + S_Maps.lianCi.get("假如"));
        System.out.println("乱码-量词总数-->" + S_Maps.liangCi.get("吨"));
        System.out.println("乱码-名词总数-->" + S_Maps.mingCi.get("酒桶"));
        System.out.println("乱码-情态总数-->" + S_Maps.qingTaiCi.get("应该"));
        System.out.println("乱码-省略总数-->" + S_Maps.shengLueCi.get("等"));
        System.out.println("乱码-时态总数-->" + S_Maps.shiTaiCi.get("以前"));
        System.out.println("乱码-限定总数-->" + S_Maps.xianDingCi.get("任何"));
        System.out.println("乱码-形容总数-->" + S_Maps.xingRongCi.get("重大"));
        System.out.println("乱码-形谓总数-->" + S_Maps.xingWeiCi.get("美丽"));
        System.out.println("乱码-助词总数-->" + S_Maps.zhuCi.get("呵"));
        // 6 词库表分隔符错误等检查
        // 7 等。。以后添加
        commonTestInition.endEnvironment();
    }

    @Test
    void indexMixed() {
    }

    @Test
    void indexAll() {
    }

    @Test
    void flushRedundant() {
    }
}
//当前输出 202508070504
//从数据上看我的词库很多'未知'词汇，而且没有拼写语法校正，一些总数还很少，而且还不 balancing 说明分词算法还
//可以更快。从分词的 POS 匹配的map看，里面包含有8国语言词汇，如在导入词汇时候就全部剔除掉，只做纯中文的文本
//分词该分词测试速度要翻8倍。
//Connected to the target VM, address: '127.0.0.1:54570', transport: 'socket'
//--------词性类词库--------
//把动词总数-->8
//代词总数-->115
//定名词总数-->3
//动词总数-->21745
//副词总数-->5378
//介词总数-->143
//连词总数-->113
//量词总数-->335
//名词总数-->53895
//情态总数-->80
//省略总数-->13
//时态总数-->34
//限定总数-->100
//形容总数-->6504
//形谓总数-->7840
//助词总数-->64
//词性总数-->206740
//--------词长类词库--------
//单字词长总数-->4232
//双字词长总数-->29930
//三字词长总数-->10559
//四字词长总数-->9671
//--------语种类词库--------
//中英对照总数-->26031
//繁体对照总数-->26031
//中韩对照总数-->26031
//中日对照总数-->26031
//中法对照总数-->26031
//中西对照总数-->26031
//中俄对照总数-->26031
//中德对照总数-->26031
//中阿对照总数-->26031
//--------汉语拼音笔画词库--------
//拼音总数-->20966
//笔画总数-->20901
//--------语种词库表的KV不对称仅仅快速检测--------
//--------头--------
//头-中英对照-->specimen
//头-繁体对照-->標本
//头-中韩对照-->표본
//头-中日对照-->標本
//头-中法对照-->spécimen
//头-中西对照-->especimen
//头-中俄对照-->образец
//头-中德对照-->exemplar
//头-中阿对照-->عينة
//--------中--------
//中-中英对照-->foothold
//中-繁体对照-->立足
//中-中韩对照-->입각하다
//中-中日对照-->に即して
//中-中法对照-->verbe sur
//中-中西对照-->base
//中-中俄对照-->на
//中-中德对照-->auf
//中-中阿对照-->تستند
//--------尾--------
//尾-中英对照总数-->rhizoma et radix et rhizoma et radix
//尾-中繁体字对照总数-->羌活
//尾-中韩对照总数-->羌살
//尾-中日对照总数-->生き羌
//尾-中法对照总数-->qiang live
//尾-中西对照总数-->qiang vivir
//尾-中俄对照总数-->национальность цян жить
//尾-中德对照总数-->zhao, komm. komm
//尾-中阿对照总数-->اللورد شين العيش
//--------词库表乱码检测仅仅快速检测--------
//乱码-拼音词库导入检测-->luo
//乱码-笔画词库导入检测-->8
//乱码-单字词长总数-->人名词
//乱码-双字词长总数-->名词
//乱码-三字词长总数-->动词
//乱码-四字词长总数-->未知
//乱码-把动词总数-->把动词
//乱码-代词总数-->人称代词
//乱码-定名词总数-->定名词
//乱码-动词总数-->动词
//乱码-副词总数-->副词
//乱码-介词总数-->介词
//乱码-连词总数-->从属连词
//乱码-量词总数-->量词
//乱码-名词总数-->名词
//乱码-情态总数-->情态词
//乱码-省略总数-->省略词
//乱码-时态总数-->时态词
//乱码-限定总数-->限定词
//乱码-形容总数-->形容词
//乱码-形谓总数-->形谓词
//乱码-助词总数-->叹词助词
//Disconnected from the target VM, address: '127.0.0.1:54570', transport: 'socket'
//
//Process finished with exit code 0