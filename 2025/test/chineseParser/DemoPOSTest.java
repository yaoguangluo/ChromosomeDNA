package test.java.InterfaceTest.chineseParser;

import A_V.ASQ.PSU.test.TimeCheck;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_SS;
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
/*
 * 这是一个 极速分词后词汇归纳的 测试main函数demo的test版本，在导入了api之后进行系统集成，
 * 然后用下面的对应的函数中源码逻辑
 * 进行复制粘贴到工程中，直接运行，即可出结果，源码的逻辑按照输入准备计算的参数，然后执行，然后获取输出需要的结果，
 * 可以用断点来查看数据，也可以用println来显示输出，方便集成，对程序员友好。系统需要jdk1.8 以上的java环境，
 * 本人会把测试的输入输出都注释在这个文件里。及其傻瓜化的流程，方便商业化落地。
 * 作为一个世界级科学家，就不能思维总定固一个区域的层面，眼光思考的是整个体系的脉络，挑战的是整个环境变化。--罗瑶光
 * */
class DemoPOSTest {

    @Test
    void main() {
        //初始化
        CommonTestInition commonTestInition = new CommonTestInition();
        commonTestInition.initEnvironment("去弹窗组件流测试");
        //准备计算
        //词性初始化
        IMV_SIQ pos = commonTestInition.NE.app_S._A.getPosCnToCn();
        List<String> sets = new ArrayList<>();
        IMV_SIQ_SS seta = new IMV_SIQ_SS();
        TimeCheck t = new TimeCheck();
        //等待分词的语句
        String ss = "罗瑶光先生从2018年10月开始，所有个人著作权作品，全部开源，到现在，和无数群体，技术社团" +
            "正面地交锋7年，一直0纠纷，罗瑶光先生认为，一件作品，一个事物，如果有价值，就应该像教材一样在真实" +
            "的环境中不断地实践测试和论证，能经得起所有人长年累月地不断地挑剔的东西，才是货真价实的，罗瑶光的个人著作权" +
            "作品都是互联网，大数据产业领域基础作品，2018年后，在60余互联网app上发布德塔开源的作品，罗瑶光先生" +
            "认为开源作品对同行呈现包容性。同时对垄断的产业有约束性。";
        //DemoEX demoEX=new DemoEX();
        StringBuilder sb = new StringBuilder(ss);
        //分词
        //执行分词
        t.begin();
        sets = commonTestInition.NE.app_S._A.parserMixedString(sb);
        t.end();
        //词性归纳
        testPOS(sets, pos);
        //关闭
        commonTestInition.endEnvironment();
    }
    public void testPOS(List<String> sets, IMV_SIQ pos){
        //结果归纳
        //1 名词 动词 形容词归纳
        IMV_SIQ_SS noun = new IMV_SIQ_SS();
        IMV_SIQ_SS verb = new IMV_SIQ_SS();
        IMV_SIQ_SS adj = new IMV_SIQ_SS();
        IMV_SIQ_SS adv = new IMV_SIQ_SS();
        System.out.println("-展示词性-");
        for (int j = 0; j < 1; j++) {
            for (int i = 0; i < sets.size(); i++) {
                String string = sets.get(i);
                if (!string.replaceAll("\\s+", "").equals("")) {
                    String word = sets.get(i);
                    Object wordObjectPOS = pos.get(string);
                    if (null == wordObjectPOS) {
                        System.out.print(word + "/" + "NULL" + "----");
                        continue;
                    }
                    String wordPOS = wordObjectPOS.toString();
                    // 早期20000词汇因为是通过2018年FNLP直接loop花2分钟生成的，里面副词出现了整体性问题，
                    // 到现在2025年，这7年没有一个人告知我这个问题，我的自己工程又从来没有用过这副词的逻辑，
                    // 所以一直没碰，现在商业化测试呢，我罗瑶光就还是给出一个解决方案。就是所有出现形容词和
                    // 副词的词汇，就看他下一个词汇是 动词还是名词，动词就改副，名词就改形容词。即可。或者
                    // 统一语料库后缀形副词。我选择前者。这个词性属性不影响分词引擎。
                    if (word.equals("不断")) {
                        System.out.println();
                    }
                    if (wordPOS.contains("未知") || wordPOS.contains("形")
                        || wordPOS.contains("副")) {
                        if (i + 1 < sets.size()) {
                            String wordNext = sets.get(i + 1);
                            Object wordNextObjectPOS = pos.get(wordNext);
                            if (null != wordNextObjectPOS) {
                                String wordNextPOS = wordNextObjectPOS.toString();
                                if (wordNext.equals("地")) {
                                    wordPOS = "形谓词作副词";
                                } else if (wordNext.equals("的")) {
                                    wordPOS = "形谓词作形容词";
                                } else if (wordNextPOS.contains("动词")) {
                                    wordPOS = "形谓词作副词";
                                } else if (wordNextPOS.contains("名词")) {
                                    wordPOS = "形谓词作形容词";
                                }
                            }
                        }
                    }
                    System.out.print(word + "/" + wordPOS + "----");
                    if (wordPOS.contains("名")) {
                        WordFrequency wordFrequency;
                        if (noun.containsKey(word)) {
                            wordFrequency = noun.get(word);
                            double f = wordFrequency.get_frequency();
                            wordFrequency.I_frequency(f + 1);//2 词频归纳
                        } else {
                            wordFrequency = new WordFrequency(1, word);
                        }
                        wordFrequency.positions.add(i);
                        wordFrequency.I_pos("名词");
                        noun.put(word, wordFrequency);
                    }
                    if (wordPOS.contains("动")) {
                        WordFrequency wordFrequency;
                        if (verb.containsKey(word)) {
                            wordFrequency = verb.get(word);
                            double f = wordFrequency.get_frequency();
                            wordFrequency.I_frequency(f + 1);//2 词频归纳
                        } else {
                            wordFrequency = new WordFrequency(1, word);
                        }
                        wordFrequency.positions.add(i);
                        wordFrequency.I_pos("动词");
                        verb.put(word, wordFrequency);
                    }
                    if (wordPOS.contains("未知") || wordPOS.contains("形")) {
                        WordFrequency wordFrequency;
                        if (adj.containsKey(word)) {
                            wordFrequency = adj.get(word);
                            double f = wordFrequency.get_frequency();
                            wordFrequency.I_frequency(f + 1);//2 词频归纳
                        } else {
                            wordFrequency = new WordFrequency(1, word);
                        }
                        wordFrequency.positions.add(i);
                        //早期20000词汇因为是通过2018年FNLP直接loop花2分钟生成的，里面副词出现了整体性问题，
                        //到现在2025年，这7年没有一个人告知我这个问题，我的自己工程又从来没有用过这副词的逻辑，
                        // 所以一直没碰，现在商业化测试呢，我罗瑶光就还是给出一个解决方案。就是所有出现形容词和
                        // 副词的词汇，就看他下一个词汇是 动词还是名词，动词就改副，名词就改形容词。即可。或者
                        // 统一语料库后缀形副词。我选择前者。这个词性属性不影响分词引擎。
                        if (i + 1 < sets.size()) {
                            String wordNext = sets.get(i + 1);
                            Object wordNextObjectPOS = pos.get(wordNext);
                            if (null != wordNextObjectPOS) {
                                String wordNextPOS = wordNextObjectPOS.toString();
                                if (wordNext.equals("地")) {
                                    wordFrequency.I_pos("形谓词作副词");
                                } else if (wordNext.equals("的")) {
                                    wordFrequency.I_pos("形谓词作形容词");
                                } else if (wordNextPOS.contains("动词")) {
                                    wordFrequency.I_pos("形谓词作副词");
                                } else if (wordNextPOS.contains("名词")) {
                                    wordFrequency.I_pos("形谓词作形容词");
                                }
                            } else {
                                wordFrequency.I_pos("形谓词作形容词");
                            }
                        } else {
                            wordFrequency.I_pos("形谓词作形容词");
                        }
                        adj.put(word, wordFrequency);
                    }
                    if (wordPOS.contains("未知") || wordPOS.contains("副")) {
                        WordFrequency wordFrequency;
                        if (adv.containsKey(word)) {
                            wordFrequency = adv.get(word);
                            double f = wordFrequency.get_frequency();
                            wordFrequency.I_frequency(f + 1);//2 词频归纳
                        } else {
                            wordFrequency = new WordFrequency(1, word);
                        }
                        wordFrequency.positions.add(i);
                        //早期20000词汇因为是通过2018年FNLP直接loop花2分钟生成的，里面副词出现了整体性问题，
                        //到现在2025年，这7年没有一个人告知我这个问题，我的自己工程又从来没有用过这副词的逻辑，
                        // 所以一直没碰，现在商业化测试呢，我罗瑶光就还是给出一个解决方案。就是所有出现形容词和
                        // 副词的词汇，就看他下一个词汇是 动词还是名词，动词就改副，名词就改形容词。即可。或者
                        // 统一语料库后缀形副词。我选择前者。这个词性属性不影响分词引擎。
                        //这种修改不适用于 歧义缺少地后戳的 连词结构 比如 丰富和缓慢地测试，丰富不会被修改。注意哦～
                        //因为语料库本就不属于德塔图灵分词的著作权源码内容，所以一直不碰。要我优化可以，记得给我钱，
                        //--罗瑶光-送大神送到西。
                        if (i + 1 < sets.size()) {
                            String wordNext = sets.get(i + 1);
                            Object wordNextObjectPOS = pos.get(wordNext);
                            if (null != wordNextObjectPOS) {
                                String wordNextPOS = wordNextObjectPOS.toString();
                                if (wordNext.equals("地")) {
                                    wordFrequency.I_pos("形谓词作副词");
                                } else if (wordNext.equals("的")) {
                                    wordFrequency.I_pos("形谓词作形容词");
                                } else if (wordNextPOS.contains("动词")) {
                                    wordFrequency.I_pos("形谓词作副词");
                                } else if (wordNextPOS.contains("名词")) {
                                    wordFrequency.I_pos("形谓词作形容词");
                                }
                            } else {
                                wordFrequency.I_pos("形谓词作副词");
                            }
                        } else {
                            wordFrequency.I_pos("形谓词作副词");
                        }
                        adv.put(word, wordFrequency);
                    }
                }
            }
        }

        //输出显示
        //名词
        //输出词汇
        //输出词性
        //输出词频
        //输出词平均距离
        Iterator<String> iteratorNoun = noun.keySet().iterator();
        while (iteratorNoun.hasNext()) {
            String wordNoun = iteratorNoun.next();
            WordFrequency wordFrequency = noun.get(wordNoun);
            System.out.println();
            System.out.print("--词汇->" + wordFrequency.get_word());
            System.out.print("-词性->" + wordFrequency.get_pos());
            System.out.print("-平均距离->" + wordFrequency.getAveragePosition());
            System.out.print("-出现频率->" + wordFrequency.get_frequency());
        }

        //动词
        //输出词汇
        //输出词性
        //输出词频
        //输出词平均距离
        Iterator<String> iteratorVerb = verb.keySet().iterator();
        while (iteratorVerb.hasNext()) {
            String wordVerb = iteratorVerb.next();
            WordFrequency wordFrequency = verb.get(wordVerb);
            System.out.println();
            System.out.print("--词汇->" + wordFrequency.get_word());
            System.out.print("-词性->" + wordFrequency.get_pos());
            System.out.print("-平均距离->" + wordFrequency.getAveragePosition());
            System.out.print("-出现频率->" + wordFrequency.get_frequency());
        }

        //形容词
        //输出词汇
        //输出词性
        //输出词频
        //输出词平均距离
        Iterator<String> iteratorAdj = adj.keySet().iterator();
        while (iteratorAdj.hasNext()) {
            String wordAdj = iteratorAdj.next();
            WordFrequency wordFrequency = adj.get(wordAdj);
            System.out.println();
            System.out.print("--词汇->" + wordFrequency.get_word());
            System.out.print("-词性->" + wordFrequency.get_pos());
            System.out.print("-平均距离->" + wordFrequency.getAveragePosition());
            System.out.print("-出现频率->" + wordFrequency.get_frequency());
        }

        //副词
        //输出词汇
        //输出词性
        //输出词频
        //输出词平均距离
        Iterator<String> iteratorAdv = adv.keySet().iterator();
        while (iteratorAdv.hasNext()) {
            String wordAdv = iteratorAdv.next();
            WordFrequency wordFrequency = adv.get(wordAdv);
            System.out.println();
            System.out.print("--词汇->" + wordFrequency.get_word());
            System.out.print("-词性->" + wordFrequency.get_pos());
            System.out.print("-平均距离->" + wordFrequency.getAveragePosition());
            System.out.print("-出现频率->" + wordFrequency.get_frequency());
        }
    }

}
//输出观测 --发现量词含有形容词的属性，形容多少，程度等。
//    Connected to the target VM, address: '127.0.0.1:49981', transport: 'socket'
//    -展示词性-
//    罗瑶光/人物名词----先生/名词----从/介词----2018/NULL----年/量词----10/数词----月/名词----
//    开始/动词----，/标点----所有/名词----个人/名词----著作权/名词----作品/名词----，/标点---
//    -全部/副词----开源/未知----，/标点----到/动词----现在/时态词----，/标点----无数/数词---
//    -群体/未知----，/标点----技术/名词----社团/名词----正面/名词----地/名词副词性结构助词---(正面在我词库中是名词，所以没有参与形容词副词区别分析，后面的地已经表明了副词结构助词，说明了正面这里是名词作副词用)
//    -交锋/形谓词作形容词----7/名词----年/量词----，/标点----一直/形谓词作形容词----0/名词---
//    -纠纷/名词----，/标点----罗瑶光/人物名词----先生/名词----认为/动词----，/标点----一件/形谓词作形容词--
//    --作品/名词----，/标点----一个/量词----事/名词----物/名词----，/标点----如果/从属连词--
//    --有/动词----价值/名词----，/标点----就/副词----应该/情态词----像/形谓词作形容词----教材/名词--
//    --一样/形谓词----在/介词----真实/形谓词作形容词----的/结构助词----环境/名词----中/定名词----
//    不断/形谓词作副词----地/形谓词作形容词----实践/名词----测试/动词----和/并列连词----论证/名词---
//    -，/标点----能/情态词----经得起/形谓词作形容词----所有/名词----人/名词----长年累月/名词---
//    -地/名词副词性结构助词----不断/形谓词作副词----地/形谓词作副词----挑剔/动词----的/结构助词---
//    -东西/名词----，/标点----才是/副词----货真价实/形谓词作形容词----的/结构助词----，/标点---
//    -罗瑶光/人物名词----的/结构助词----个人/名词----著作权/名词----作品/名词----都是/形谓词作形容词-
//    ---互联网/名词----，/标点----大/形谓词作形容词----数据/名词----产业/名词----领域/名词----
//    基础/名词----作品/名词----，/标点----2018/NULL----年后/未知----，/标点----在/介词----60/NULL--
//    --余/实体名----互联网/名词----app/实体名----上/名词----发布/动词----德塔/名词---
//    -开源/形谓词作形容词----的/结构助词----作品/名词----，/标点----罗瑶光/人物名词----先生/名词--
//    --认为/动词----开源/形谓词作形容词----作品/名词----对/介词----同行/名词----呈现/动词----包容/动词--
//    --性/名词----。/标点----同时/连词----对/介词----垄断/动词----的/结构助词----产业/名词---
//    -有/动词----约束/名词----性/名词----。/标点----
//    --词汇->罗瑶光-词性->名词-平均距离->57-出现频率->4.0
//    --词汇->先生-词性->名词-平均距离->50-出现频率->3.0
//    --词汇->月-词性->名词-平均距离->6-出现频率->1.0
//    --词汇->所有-词性->名词-平均距离->39-出现频率->2.0
//    --词汇->个人-词性->名词-平均距离->47-出现频率->2.0
//    --词汇->著作权-词性->名词-平均距离->48-出现频率->2.0
//    --词汇->作品-词性->名词-平均距离->77-出现频率->6.0
//    --词汇->技术-词性->名词-平均距离->23-出现频率->1.0
//    --词汇->社团-词性->名词-平均距离->24-出现频率->1.0
//    --词汇->正面-词性->名词-平均距离->25-出现频率->1.0
//    --词汇->地-词性->名词-平均距离->49-出现频率->2.0
//    --词汇->7-词性->名词-平均距离->28-出现频率->1.0
//    --词汇->0-词性->名词-平均距离->32-出现频率->1.0
//    --词汇->纠纷-词性->名词-平均距离->33-出现频率->1.0
//    --词汇->事-词性->名词-平均距离->43-出现频率->1.0
//    --词汇->物-词性->名词-平均距离->44-出现频率->1.0
//    --词汇->价值-词性->名词-平均距离->48-出现频率->1.0
//    --词汇->教材-词性->名词-平均距离->53-出现频率->1.0
//    --词汇->环境-词性->名词-平均距离->58-出现频率->1.0
//    --词汇->中-词性->名词-平均距离->59-出现频率->1.0
//    --词汇->实践-词性->名词-平均距离->62-出现频率->1.0
//    --词汇->论证-词性->名词-平均距离->65-出现频率->1.0
//    --词汇->人-词性->名词-平均距离->70-出现频率->1.0
//    --词汇->长年累月-词性->名词-平均距离->71-出现频率->1.0
//    --词汇->东西-词性->名词-平均距离->77-出现频率->1.0
//    --词汇->互联网-词性->名词-平均距离->96-出现频率->2.0
//    --词汇->数据-词性->名词-平均距离->92-出现频率->1.0
//    --词汇->产业-词性->名词-平均距离->110-出现频率->2.0
//    --词汇->领域-词性->名词-平均距离->94-出现频率->1.0
//    --词汇->基础-词性->名词-平均距离->95-出现频率->1.0
//    --词汇->余-词性->名词-平均距离->103-出现频率->1.0
//    --词汇->app-词性->名词-平均距离->105-出现频率->1.0
//    --词汇->上-词性->名词-平均距离->106-出现频率->1.0
//    --词汇->德塔-词性->名词-平均距离->108-出现频率->1.0
//    --词汇->同行-词性->名词-平均距离->119-出现频率->1.0
//    --词汇->性-词性->名词-平均距离->126-出现频率->2.0
//    --词汇->约束-词性->名词-平均距离->130-出现频率->1.0
//    --词汇->开始-词性->动词-平均距离->7-出现频率->1.0
//    --词汇->到-词性->动词-平均距离->17-出现频率->1.0
//    --词汇->认为-词性->动词-平均距离->76-出现频率->2.0
//    --词汇->有-词性->动词-平均距离->88-出现频率->2.0
//    --词汇->测试-词性->动词-平均距离->63-出现频率->1.0
//    --词汇->挑剔-词性->动词-平均距离->75-出现频率->1.0
//    --词汇->发布-词性->动词-平均距离->107-出现频率->1.0
//    --词汇->呈现-词性->动词-平均距离->120-出现频率->1.0
//    --词汇->包容-词性->动词-平均距离->121-出现频率->1.0
//    --词汇->垄断-词性->动词-平均距离->126-出现频率->1.0
//    --词汇->开源-词性->形谓词作形容词-平均距离->80-出现频率->3.0
//    --词汇->群体-词性->null-平均距离->21-出现频率->1.0
//    --词汇->交锋-词性->形谓词作形容词-平均距离->27-出现频率->1.0
//    --词汇->一直-词性->形谓词作形容词-平均距离->31-出现频率->1.0
//    --词汇->一件-词性->形谓词作形容词-平均距离->39-出现频率->1.0
//    --词汇->像-词性->形谓词作形容词-平均距离->52-出现频率->1.0
//    --词汇->一样-词性->null-平均距离->54-出现频率->1.0
//    --词汇->真实-词性->形谓词作形容词-平均距离->56-出现频率->1.0
//    --词汇->不断-词性->形谓词作副词-平均距离->66-出现频率->2.0
//    --词汇->地-词性->形谓词作副词-平均距离->67-出现频率->2.0
//    --词汇->经得起-词性->形谓词作形容词-平均距离->68-出现频率->1.0
//    --词汇->货真价实-词性->形谓词作形容词-平均距离->80-出现频率->1.0
//    --词汇->都是-词性->形谓词作形容词-平均距离->88-出现频率->1.0
//    --词汇->大-词性->形谓词作形容词-平均距离->91-出现频率->1.0
//    --词汇->年后-词性->null-平均距离->99-出现频率->1.0
//    --词汇->全部-词性->null-平均距离->14-出现频率->1.0
//    --词汇->开源-词性->null-平均距离->15-出现频率->1.0
//    --词汇->群体-词性->null-平均距离->21-出现频率->1.0
//    --词汇->地-词性->形谓词作副词-平均距离->57-出现频率->3.0
//    --词汇->就-词性->null-平均距离->50-出现频率->1.0
//    --词汇->不断-词性->形谓词作副词-平均距离->66-出现频率->2.0
//    --词汇->才是-词性->null-平均距离->79-出现频率->1.0
//    --词汇->年后-词性->null-平均距离->99-出现频率->1.0
//    Disconnected from the target VM, address: '127.0.0.1:49981', transport: 'socket'
//
//    Process finished with exit code 0



