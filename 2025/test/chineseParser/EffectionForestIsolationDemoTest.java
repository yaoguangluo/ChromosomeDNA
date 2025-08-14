package test.java.InterfaceTest.chineseParser;

import ASQ.basic.Distance_X_getDistance2D;
import A_V.ASQ.PSU.test.TimeCheck;
import P_V.PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import S_A.pheromone.IMV_SIQ;
import org.junit.jupiter.api.Test;
import test.java.InterfaceTest.CommonTestInition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
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
class EffectionForestIsolationDemoTest {
    /* 非著作权算法的坐标仅精度切裂开的非重心静态态用法-因太过简单 其他略。
     * 探索自然语言写作质量流畅度归纳。例子是名词思维在写作中的静态距离变化的切裂方式，用于探索大脑的思绪记忆变化频率。
     * --分词后输出格式化按行长增维进行词性词团--先-3.4 分词归纳-再通过-非重心 scale 距离来进行 普通坐标团切裂。
     * --该测试DEMO用于公文申请书类优化，适用于高等院校进修材料，留学申请，写作优化，作者写作词汇分子空间浓度特征观测
     * --写作习惯，写作特征分析等办公学习场景，适用于教育和传媒宣传领域。一些文学性分析高级用法场景。
     * --适用刑侦-文本加密和特征索引。匿名作家追踪分析。在导入了api之后进行系统集成，然后用下面的对应的函数中源码逻辑
     * 进行复制粘贴到工程中，直接运行，即可出结果，源码的逻辑按照输入准备计算的参数，然后执行，然后获取输出需要的结果，
     * 可以用断点来查看数据，也可以用println来显示输出，方便集成，对程序员友好。系统需要jdk1.8 以上的java环境，
     * 本人会把测试的输入输出都注释在这个文件里。及其傻瓜化的流程，方便商业化落地。
     * 作为一个世界级科学家，就不能思维总定固一个区域的层面，眼光思考的是整个体系的脉络，挑战的是整个环境变化。--罗瑶光
     * */
    @Test
    void main() {
        //初始化
        CommonTestInition commonTestInition = new CommonTestInition();
        commonTestInition.initEnvironment("去弹窗组件流测试");
        //准备计算
        //3.4-输入
        String inputString = "这个API主要应用于数据智能工程用来处理各种形式的海量数据类工程计算问题" +
            "如提供坐标文本列表波形和图片流等各类数据的搜索计算分析和处理服务该文件详细描述如何将DNA元" +
            "基催化与肽计算与德塔大数据软件集在工业农业和手工服务产业变现亲近资本家产业投资者2018年后我" +
            "一直在湖南省浏阳市集里大塘路1段7年大家要找我投资辩论直接来即可来前记得打我短信电话我有齐全" +
            "的个人著作权身份证和法人银行账号等各类权属各类合作可以直接租赁方式交易有时间我文档pdf化农工" +
            "商具体商业逻辑中数据内容操作服务实例DNA十六元基编码索引计算的科普推广版本数据智能工程生物信" +
            "息学计算机应用科学高年级专业基础教学中真实具体的功能实验版本推动社会商业产业真实落地通过创造" +
            "新的生产工具来提高生产力和改变生产环境关系一开始我是基于医学数据搜索来设计的我一个著作权产品" +
            "养疗经api，国内因为严谨性，医学产业被一些部门和证件卡的严实我寸步难行又被迫开源于是利用这严实" +
            "我把养疗经api中公共接口和逻辑全部剥离出来去掉医学组件成为华瑞集API发现用途巨大适用面更广很多" +
            "产业逻辑底层是相同相通的于是将开源编码进行元基编码化一边测试一边开源一边论证一边优化于是形成了" +
            "这个DNA时微分编码体系先把华瑞集Rapi的所有可test文件进行综合功能测试归纳统一打包SRC下面的test" +
            "/java/InterfaceTest区通过一种在真实的环境下用极简源码详细描述直观逻辑具体对象并含有输入" +
            "输出参数实例的测试DEMO进行丰富地论证API的商业前景和使用价值当前例子有2600+函数和100+个功" +
            "能DEMO在面对某具体行业已经体现了许多基础实用价值但面向整个社会各行各业我会写更多的测试DEMO" +
            "补充小目标26000+函数和1000+个功能DEMO扩大鲁棒性华瑞集测试插件的源码优化这个项目罗瑶光主要" +
            "是公开展示下自己的编码实力知道自己的真实斤两同时填补下软算DNA编码领域的国际空白2018年10月" +
            "就贴出了本人生活地址方便各类大佬组织现场技术群挑";
        System.out.println("文字长度->" + inputString.length());
        //计算
        StringBuilder sb = new StringBuilder(inputString);
        //准备POS分词
        IMV_SIQ pos = commonTestInition.NE.app_S._A.getPosCnToCn();
        List<String> sets = new ArrayList<>();
        //执行分词
        TimeCheck t = new TimeCheck();
        t.begin();
        sets = commonTestInition.NE.app_S._A.parserMixedString(sb);
        t.end();
        //输出
        System.out.println("分词词汇数->" + sets.size());
        //将 list<wordString>进行增维 wordString[I][J];
        double worldLengthDouble = (double) sets.size();
        int worldLengthInt = sets.size();
        //可自由设置，用于滑组控件，保证有效观测。我采用正方体
        int weight = (int) Math.sqrt(worldLengthDouble);
        System.out.println("分词词汇增维宽度->" + weight);
        int height = 1 + worldLengthInt / weight;
        System.out.println("分词词汇增维长度->" + height);
        String[][] wordString = new String[weight][height];
        dataList1DSwapToString2D(sets, wordString);
        //1.3-输入
        //获取名词坐标 --动词形容词归纳等类似，可酌情分析修改。我有时间全部测试实例化。
        List<AMV_MVS_VSQ_2D> inputNoun = new ArrayList<>();
        for (int i = 0; i < wordString.length; i++) {
            for (int j = 0; j < wordString[0].length; j++) {
                if (null != wordString[i][j]) {
                    Object wordObjectPOS = pos.get(wordString[i][j]);
                    if (null == wordObjectPOS) {
                        continue;
                    }
                    if (wordString[i][j].length() < 2) {
                        continue;
                    }
                    if (wordObjectPOS.toString().contains("名")) {
                        System.out.println("有效名词-" + wordString[i][j] + "-坐标-" + i + ":" + j);
                        AMV_MVS_VSQ_2D position2D = new AMV_MVS_VSQ_2D();
                        position2D.I_X(i);
                        position2D.I_Y(j);
                        inputNoun.add(position2D);
                    }
                }
            }
        }
        //计算
        //处理fissile
        int scale = weight / 2; //可根据 2D词汇的一行含量来进行精度设置，增加观测质量。我才用正方体除3的9等分。
        System.out.println("精度->" + scale);

        Map<Double, List<AMV_MVS_VSQ_2D>> output = getForestIsolationGroups2D(inputNoun, scale);
        //颜色显示
        Map<String, String> colorCoords = new HashMap<>();
        Iterator<Double> iterator = output.keySet().iterator();
        while (iterator.hasNext()) {
            double temp = iterator.next();
            System.out.println();
            System.out.println("团->" + temp);
            Iterator<AMV_MVS_VSQ_2D> iterator1 = output.get(temp).iterator();
            while (iterator1.hasNext()) {
                AMV_MVS_VSQ_2D temp1 = iterator1.next();
                String coord = (int) temp1.getX() + ":" + (int) temp1.getY();
                System.out.println(coord);
                colorCoords.put(coord, "" + (int) (99 - temp));
            }
        }
        //输出 , 可用转义颜色码但繁琐，我采用原生color 方便其他领域扩展跟进计算。
        for (int i = 0; i < wordString.length; i++) {
            System.out.println();
            for (int j = 0; j < wordString[0].length; j++) {
                String coord = i + ":" + j;
                if (colorCoords.containsKey(coord)) {
                    System.out.print("-" + colorCoords.get(coord));
                } else {
                    System.out.print("---");
                }
            }
        }
        //结束
        System.out.println();
        //关闭
        commonTestInition.endEnvironment();
    }

    //词汇的是静态的维度数据，跟我的动态的坐标计算不适用，测试下静态的切裂看看效果。
    //静态切裂的逻辑比较简单。
    private Map<Double, List<AMV_MVS_VSQ_2D>> getForestIsolationGroups2D(List<AMV_MVS_VSQ_2D> inputNoun
        , int scale) {
        Map<Double, List<AMV_MVS_VSQ_2D>> output = new HashMap<>();
        Map<String, String> didCoords = new HashMap<>();
        Double groupID = 0.0;
        //根据精度来，每一个点对应其他的点的距离 归纳
        Herei:
        for (AMV_MVS_VSQ_2D _AMV_MVS_VSQ_2D_i : inputNoun) {
            String coordHearti = _AMV_MVS_VSQ_2D_i.getX() + ":" + _AMV_MVS_VSQ_2D_i.getY();
            if (didCoords.containsKey(coordHearti)) {
                continue Herei;
            }
            List<AMV_MVS_VSQ_2D> listi;
            groupID+=1;
            if (output.containsKey(groupID)) {
                listi = output.get(groupID);
            } else {
                listi = new ArrayList<>();
            }
            AMV_MVS_VSQ_2D _AMV_MVS_VSQ_2D_i_= new AMV_MVS_VSQ_2D();
            _AMV_MVS_VSQ_2D_i_.I_X(_AMV_MVS_VSQ_2D_i.getX());
            _AMV_MVS_VSQ_2D_i_.I_Y(_AMV_MVS_VSQ_2D_i.getY());
            listi.add(_AMV_MVS_VSQ_2D_i_);
            output.put(groupID, listi);
            didCoords.put(coordHearti, "");
            Herej:
            for (AMV_MVS_VSQ_2D _AMV_MVS_VSQ_2D_j : inputNoun) {
                String coordHeartj = _AMV_MVS_VSQ_2D_j.getX() + ":" + _AMV_MVS_VSQ_2D_j.getY();
                if (didCoords.containsKey(coordHeartj)) {
                    continue Herej;
                }
                double distance = Distance_X_getDistance2D._E(_AMV_MVS_VSQ_2D_i, _AMV_MVS_VSQ_2D_j);
                if (distance < scale) {
                    List<AMV_MVS_VSQ_2D> list;
                    if (output.containsKey(groupID)) {
                        list = output.get(groupID);
                    } else {
                        list = new ArrayList<>();
                    }
                    AMV_MVS_VSQ_2D _AMV_MVS_VSQ_2D_j_= new AMV_MVS_VSQ_2D();
                    _AMV_MVS_VSQ_2D_j_.I_X(_AMV_MVS_VSQ_2D_j.getX());
                    _AMV_MVS_VSQ_2D_j_.I_Y(_AMV_MVS_VSQ_2D_j.getY());
                    list.add(_AMV_MVS_VSQ_2D_j_);
                    output.put(groupID, list);
                    didCoords.put(coordHeartj, "");
                }
            }
        }
        //距离 归纳小于精度，只加载一次 map观测过滤
        //输出
        return output;
    }

    //该逻辑可以归纳到 data swap 染色体函数区。同样需要sonar测试，功能测试和接口测试等。
    private void dataList1DSwapToString2D(List<String> sets, String[][] wordString) {
        Iterator<String> iterators = sets.iterator();
        for (int i = 0; i < wordString.length; i++) {
            for (int j = 0; j < wordString[0].length; j++) {
                if (iterators.hasNext()) {
                    wordString[i][j] = iterators.next();
                } else {
                    return;
                }
            }
        }
    }
}
//输出结果
//Connected to the target VM, address: '127.0.0.1:52732', transport: 'socket'
//    文字长度->839
//    分词词汇数->479
//    分词词汇增维宽度->21
//    分词词汇增维长度->23
//    有效名词-数据-坐标-0:4
//    有效名词-智能-坐标-0:5
//    有效名词-工程-坐标-0:6
//    有效名词-处理-坐标-0:9
//    有效名词-海量-坐标-0:12
//    有效名词-数据-坐标-0:13
//    有效名词-工程-坐标-0:15
//    有效名词-问题-坐标-0:17
//    有效名词-图片-坐标-1:2
//    有效名词-数据-坐标-1:6
//    有效名词-搜索-坐标-1:8
//    有效名词-处理-坐标-1:12
//    有效名词-服务-坐标-1:13
//    有效名词-文件-坐标-1:15
//    有效名词-德塔-坐标-2:6
//    有效名词-数据-坐标-2:8
//    有效名词-软件-坐标-2:9
//    有效名词-工业-坐标-2:12
//    有效名词-农业-坐标-2:13
//    有效名词-手工-坐标-2:15
//    有效名词-服务-坐标-2:16
//    有效名词-产业-坐标-2:17
//    有效名词-资本-坐标-2:21
//    有效名词-产业-坐标-3:0
//    有效名词-投资者-坐标-3:1
//    有效名词-浏阳-坐标-3:7
//    有效名词-投资-坐标-3:22
//    有效名词-辩论-坐标-4:0
//    有效名词-短信-坐标-4:9
//    有效名词-电话-坐标-4:10
//    有效名词-个人-坐标-4:15
//    有效名词-著作权-坐标-4:16
//    有效名词-身份证-坐标-4:17
//    有效名词-法人-坐标-4:19
//    有效名词-银行-坐标-4:20
//    有效名词-合作-坐标-5:5
//    有效名词-租赁-坐标-5:8
//    有效名词-方式-坐标-5:9
//    有效名词-交易-坐标-5:10
//    有效名词-时间-坐标-5:12
//    有效名词-商业-坐标-5:19
//    有效名词-逻辑-坐标-5:20
//    有效名词-数据-坐标-5:22
//    有效名词-内容-坐标-6:0
//    有效名词-操作-坐标-6:1
//    有效名词-服务-坐标-6:2
//    有效名词-推广-坐标-6:13
//    有效名词-版本-坐标-6:14
//    有效名词-数据-坐标-6:15
//    有效名词-智能-坐标-6:16
//    有效名词-工程-坐标-6:17
//    有效名词-生物-坐标-6:18
//    有效名词-信息-坐标-6:19
//    有效名词-计算机-坐标-6:21
//    有效名词-基础-坐标-7:2
//    有效名词-教学-坐标-7:3
//    有效名词-功能-坐标-7:8
//    有效名词-实验-坐标-7:9
//    有效名词-版本-坐标-7:10
//    有效名词-社会-坐标-7:12
//    有效名词-商业-坐标-7:13
//    有效名词-产业-坐标-7:14
//    有效名词-创造-坐标-7:18
//    有效名词-生产力-坐标-8:0
//    有效名词-生产-坐标-8:3
//    有效名词-环境-坐标-8:4
//    有效名词-关系-坐标-8:5
//    有效名词-医学-坐标-8:10
//    有效名词-数据-坐标-8:11
//    有效名词-搜索-坐标-8:12
//    有效名词-著作权-坐标-8:18
//    有效名词-产品-坐标-8:19
//    有效名词-国内-坐标-9:2
//    有效名词-医学-坐标-9:7
//    有效名词-产业-坐标-9:8
//    有效名词-部门-坐标-9:11
//    有效名词-证件-坐标-9:13
//    有效名词-逻辑-坐标-10:13
//    有效名词-医学-坐标-10:20
//    有效名词-用途-坐标-11:5
//    有效名词-产业-坐标-11:12
//    有效名词-逻辑-坐标-11:13
//    有效名词-微分-坐标-12:22
//    有效名词-所有-坐标-13:10
//    有效名词-test-坐标-13:12
//    有效名词-文件-坐标-13:13
//    有效名词-功能-坐标-13:16
//    有效名词-test-坐标-14:1
//    有效名词-环境-坐标-14:12
//    有效名词-逻辑-坐标-15:0
//    有效名词-对象-坐标-15:2
//    有效名词-输出-坐标-15:6
//    有效名词-参数-坐标-15:7
//    有效名词-论证-坐标-15:15
//    有效名词-商业-坐标-15:18
//    有效名词-前景-坐标-15:19
//    有效名词-例子-坐标-16:0
//    有效名词-函数-坐标-16:4
//    有效名词-行业-坐标-16:16
//    有效名词-基础-坐标-16:21
//    有效名词-社会-坐标-17:4
//    有效名词-目标-坐标-17:14
//    有效名词-函数-坐标-17:17
//    有效名词-项目-坐标-18:17
//    有效名词-罗瑶光-坐标-18:18
//    有效名词-实力-坐标-19:3
//    有效名词-领域-坐标-19:16
//    有效名词-国际-坐标-19:18
//    有效名词-空白-坐标-19:19
//    有效名词-地址-坐标-20:8
//    有效名词-方便-坐标-20:9
//    有效名词-现场-坐标-20:13
//    有效名词-技术-坐标-20:14
//    精度->10
//
//    团->1.0
//    0:4
//    0:5
//    0:6
//    0:9
//    0:12
//    0:13
//    1:2
//    1:6
//    1:8
//    1:12
//    2:6
//    2:8
//    2:9
//    3:0
//    3:1
//    3:7
//    4:0
//    4:9
//    5:5
//    5:8
//    6:1
//    6:2
//    7:2
//    7:3
//    8:3
//    8:4
//    8:5
//
//    团->2.0
//    0:15
//    0:17
//    1:13
//    1:15
//    2:12
//    2:13
//    2:15
//    2:16
//    2:17
//    2:21
//    4:10
//    4:15
//    4:16
//    4:17
//    4:19
//    4:20
//    5:12
//    5:19
//    6:13
//    6:14
//    6:15
//    6:16
//    6:17
//    6:18
//    7:13
//    7:14
//
//    团->4.0
//    5:9
//    5:10
//    7:8
//    7:9
//    7:10
//    7:12
//    8:10
//    8:11
//    8:12
//    9:7
//    9:8
//    9:11
//    9:13
//    10:13
//    11:12
//    13:10
//
//    团->8.0
//    16:0
//    19:3
//
//    团->9.0
//    16:21
//    18:18
//    19:18
//    19:19
//
//    团->5.0
//    6:0
//    8:0
//    9:2
//    14:1
//    15:0
//
//    团->10.0
//    20:8
//    20:9
//
//    团->3.0
//    3:22
//    5:20
//    5:22
//    6:19
//    6:21
//    7:18
//    8:18
//    8:19
//    10:20
//    12:22
//
//    团->6.0
//    11:5
//    11:13
//    13:12
//    15:2
//    15:6
//    15:7
//    16:4
//    17:4
//
//    团->7.0
//    13:13
//    13:16
//    14:12
//    15:15
//    15:18
//    15:19
//    16:16
//    17:14
//    17:17
//    18:17
//    19:16
//    20:13
//    20:14
//
//    -------------98-98-98-------98-------98-98----97----97---------------
//    -------98----------98----98----------98-97----97---------------------
//    -------------------98----98-98-------97-97----97-97-97----------97---
//    -98-98----------------98-------------------------------------------96
//    -98-------------------------98-97-------------97-97-97----97-97------
//    ----------------98-------98-95-95----97-------------------97-96----96
//    -94-98-98-------------------------------97-97-97-97-97-97-96----96---
//    -------98-98-------------95-95-95----95-97-97----------96------------
//    -94-------98-98-98-------------95-95-95----------------96-96---------
//    -------94-------------95-95-------95----95---------------------------
//    ----------------------------------------95-------------------96------
//    ----------------93-------------------95-93---------------------------
//    -------------------------------------------------------------------96
//    -------------------------------95----93-92-------92------------------
//    ----94-------------------------------92------------------------------
//    -94----93----------93-93----------------------92-------92-92---------
//    -91----------93----------------------------------92-------------90---
//    -------------93----------------------------92-------92---------------
//    ----------------------------------------------------92-90------------
//    ----------91-------------------------------------92----90-90---------
//    -------------------------89-89----------92-92------------------------
//    Disconnected from the target VM, address: '127.0.0.1:52732', transport: 'socket'
//
//    Process finished with exit code 0