package test.java.InterfaceTest.tinShell;

import E_A.ME.analysis.E.CogsBinaryForest_AE;
import S_A.SEM.bloom.StaticFunctionMapQ_VECS_E;
import S_A.pheromone.AES_QMS_XSD_TIH;
import S_A.pheromone.IMV_SIQ;
import org.junit.jupiter.api.Test;
import test.java.InterfaceTest.CommonTestInition;

import java.util.ArrayList;
import java.util.Iterator;
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
class StaticFunctionMapQ_VECS_ETest {

    @Test
    void searchFromTable() {
    }

    @Test
    void searchFromTablewithScale() {
    }

    /*
     * 这是一个 最简线性表格 执行字符串条件搜索逻辑，测试main函数demo的test版本，在导入了api之后进行系统集成，然后
     * 用下面的对应的函数中源码逻辑进行复制粘贴到工程中，直接运行，即可出结果，源码的逻辑按照输入准备计算的参数，
     * 然后执行，然后获取输出需要的结果，可以用断点来查看数据，也可以用println来显示输出，方便集成，对程序员友好。
     * 系统需要jdk1.8 以上的java环境，本人会把测试的输入输出都注释在这个文件里。及其傻瓜化的流程，方便商业化落地。
     * 注意搜索前滤掉一些符号和字母特殊标记等，增加中文行搜索的精确度 --罗瑶光
     * */
    @Test
    void main() throws InterruptedException {
        //启动测试开始
        CommonTestInition commonTestInition = new CommonTestInition();
        commonTestInition.initEnvironment("去弹窗组件流测试");
        //优化后 索引变化了。
        commonTestInition.NE._I_U._AE = (CogsBinaryForest_AE) commonTestInition.NE.app_S._AE;
        //计算搜索
        //配置环境，
        String[] argv = commonTestInition.NE._I_U.argv;
        CogsBinaryForest_AE _AE = commonTestInition.NE._I_U._AE;
        ArrayList<String> nameContent = new ArrayList<String>();
        IMV_SIQ textContent = new IMV_SIQ();
        double lookrot = 0.0;
        //设置输入待搜索列表，
        nameContent.add("罗瑶光");
        nameContent.add("罗罗罗");
        nameContent.add("罗光瑶");
        nameContent.add("罗振旺");
        nameContent.add("罗旺振");

        textContent.put("罗瑶光", "罗瑶光luoyaoguang");
        textContent.put("罗罗罗", "罗罗罗luoluoluo");
        textContent.put("罗光瑶", "罗光瑶luoguangyao");
        textContent.put("罗振旺", "罗振旺luozhenwang");
        textContent.put("罗旺振", "罗旺振luowangzhen");

        AES_QMS_XSD_TIH searchkey = new AES_QMS_XSD_TIH("罗瑶光");
        System.out.println("测试搜索关键字->" + searchkey._S_);
        commonTestInition.NE._I_U.searchkey = searchkey;
        commonTestInition.NE._I_U.nameContent = nameContent;
        commonTestInition.NE._I_U.textContent = textContent;
        commonTestInition.NE._I_U.lookrot = lookrot;
        commonTestInition.NE._I_U._AE = _AE;
        List<Object[]> outputList
            = new StaticFunctionMapQ_VECS_E().searchFromTablewithScale(commonTestInition.NE);
        Iterator<Object[]> iterator = outputList.iterator();
        while (iterator.hasNext()) {
            Object[] object = iterator.next();
            for (int i = 0; i < object.length; i++) {
                System.out.println(object[i].toString());
            }
        }
        searchkey._S_ = "罗瑶";
        System.out.println("测试搜索关键字->" + searchkey._S_);
        commonTestInition.NE._I_U.searchkey = searchkey;
        commonTestInition.NE._I_U.nameContent = nameContent;
        commonTestInition.NE._I_U.textContent = textContent;
        commonTestInition.NE._I_U.lookrot = lookrot;
        commonTestInition.NE._I_U._AE = _AE;

        outputList = new StaticFunctionMapQ_VECS_E().searchFromTablewithScale(commonTestInition.NE);
        iterator = outputList.iterator();
        while (iterator.hasNext()) {
            Object[] object = iterator.next();
            for (int i = 0; i < object.length; i++) {
                System.out.println(object[i].toString());
            }
        }

        searchkey._S_ = "罗振";
        System.out.println("测试搜索关键字->" + searchkey._S_);
        commonTestInition.NE._I_U.searchkey = searchkey;
        commonTestInition.NE._I_U.nameContent = nameContent;
        commonTestInition.NE._I_U.textContent = textContent;
        commonTestInition.NE._I_U.lookrot = lookrot;
        commonTestInition.NE._I_U._AE = _AE;
        outputList = new StaticFunctionMapQ_VECS_E().searchFromTablewithScale(commonTestInition.NE);
        iterator = outputList.iterator();
        while (iterator.hasNext()) {
            Object[] object = iterator.next();
            for (int i = 0; i < object.length; i++) {
                System.out.println(object[i].toString());
            }
        }
        commonTestInition.endEnvironment();
    }
}
/* 测试搜索结果 正确
* Connected to the target VM, address: '127.0.0.1:61891', transport: 'socket'
1
802400
罗瑶光
罗瑶光luoyaoguang
2
3
罗旺振
罗旺振luowangzhen
3
3
罗振旺
罗振旺luozhenwang
4
3
罗光瑶
罗光瑶luoguangyao
5
3
罗罗罗
罗罗罗luoluoluo
测试搜索关键字->罗瑶
1
205224
罗瑶光
罗瑶光luoyaoguang
2
1224
罗光瑶
罗光瑶luoguangyao
3
600
罗旺振
罗旺振luowangzhen
4
Disconnected from the target VM, address: '127.0.0.1:61891', transport: 'socket'
600
罗振旺
罗振旺luozhenwang
5
600
罗罗罗
罗罗罗luoluoluo
测试搜索关键字->罗振
1
382280
罗振旺
罗振旺luozhenwang
2
2280
罗旺振
罗旺振luowangzhen
3
600
罗光瑶
罗光瑶luoguangyao
4
600
罗罗罗
罗罗罗luoluoluo
5
600
罗瑶光
罗瑶光luoyaoguang

Process finished with exit code 0
* */