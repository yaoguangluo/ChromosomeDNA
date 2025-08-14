package test.java.InterfaceTest.TextDNN;

import E_A.OSI.AOP.PCS.PP.port_E.RestNLPPortImpl;
import S_A.pheromone.IMV_SIQ;
import org.junit.jupiter.api.Test;
import test.java.InterfaceTest.CommonTestInition;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

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
 * 这是一个 极速分词 测试main函数demo的test版本，用于挖掘文本的主要词性比重来确定文本的属性
 * 用于作文写作水平打分。当时我用了形谓词和状词，没有用副词。社会上的事情，我从不cover。
 * 其实我也可以cover，给我钱。
 * --罗瑶光
 * */
class RestNLPPortImplTest {

    @Test
    void dataWS() {
    }

    @Test
    void dataCX() {
    }

    @Test
    void dataCY() {
    }

    @Test
    void dataCG() {
    }

    @Test
    void dataCJ() {
    }

    @Test
    void dataCL() {
    }

    @Test
    void dataXX() {
    }

    @Test
    void dataHF() {
    }

    @Test
    void dataCP() {
    }

    @Test
    void dataZF() {
    }

    @Test
    void dataXL() {
    }

    @Test
    void dataRN() {
    }

    @Test
    void dataSB() {
    }

    @Test
    void dataYL() {
    }

    @Test
    void testDataZF() throws UnsupportedEncodingException {
        //初始化环境
        CommonTestInition commonTestInition = new CommonTestInition();
        commonTestInition.initEnvironment("去弹窗组件流测试");
        //计算
        String ss = new String("罗瑶光先生从2018年10月开始，所有个人著作权作品，全部开源，" +
            "到现在，和无数群体，技术社团" +
            "正面交锋7年，一直0纠纷，罗瑶光先生认为，一件作品，一个事物，如果有价值，就应该像教材一样在真实" +
            "的环境中实践测试和论证，能经得起所有人长年累月不断地挑剔的东西，才是货真价实的，罗瑶光的个人著作权" +
            "作品都是互联网，大数据产业领域基础作品，2018年后，在60余互联网app上发布德塔开源的作品，罗瑶光先生" +
            "认为开源作品对同行呈现包容性。同时对垄断产业有约束性。");
        Object object = RestNLPPortImpl.dataZF(ss, commonTestInition.NE);
        IMV_SIQ _IMV_SIQ = (IMV_SIQ) object;
        String string= _IMV_SIQ.getString("zf");
        string= URLDecoder.decode(string,"UTF8");
        System.out.println(string);
        commonTestInition.endEnvironment();
    }
}
//    Connected to the target VM, address: '127.0.0.1:53857', transport: 'socket'
//    参考属性:
//    定义:55.0状词:10.0修饰:12.0点缀:48.0高级定义:40.0高级状词:9.0高级修饰:8.0高级点缀:16.0
//    重要指数:
//    0.8441558441558441
//    散文艺术:
//    0.15584415584415584
//    叙述艺术:
//    0.12987012987012986
//    议论艺术:
//    0.7142857142857143
//    分析能力:
//    0.38095238095238093
//    学习能力:
//    0.5801526717557252
//    文学造诣:
//    0.616
//    评价:
//    这段文章主题无与伦比;抒情一般;刻画一般;解释无与伦比;组织优秀;教育水平卓越;文学修养卓越;
//
//    Disconnected from the target VM, address: '127.0.0.1:53857', transport: 'socket'
//
//    Process finished with exit code 0