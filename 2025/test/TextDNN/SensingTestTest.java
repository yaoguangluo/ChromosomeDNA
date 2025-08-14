package test.java.InterfaceTest.TextDNN;

import S_A.pheromone.IMV_SIQ;
import org.junit.jupiter.api.Test;
import test.java.InterfaceTest.CommonTestInition;

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
        CommonTestInition commonTestInition = new CommonTestInition();
        commonTestInition.initEnvironment("去弹窗组件流测试");
        // 1 显示当前所有词库，重要属性
        IMV_SIQ _getDistinctionMap = commonTestInition.NE.app_S.emotionMap_E.getDistinctionMap();
        IMV_SIQ _getMotivationMap = commonTestInition.NE.app_S.emotionMap_E.getMotivationMap();
        IMV_SIQ _getNegativeMap = commonTestInition.NE.app_S.emotionMap_E.getNegativeMap();
        IMV_SIQ _getPositiveMap = commonTestInition.NE.app_S.emotionMap_E.getPositiveMap();
        IMV_SIQ _getPredictionMap = commonTestInition.NE.app_S.emotionMap_E.getPredictionMap();
        IMV_SIQ _getTrendingMap = commonTestInition.NE.app_S.emotionMap_E.getTrendingMap();
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
        commonTestInition.endEnvironment();
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
