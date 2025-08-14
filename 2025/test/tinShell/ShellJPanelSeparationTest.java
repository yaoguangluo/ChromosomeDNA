package test.java.InterfaceTest.tinShell;

import ME.VPC.M.app.App;
import ME.VPC.M.app.App_X;
import ME.VPC.V.config.ShellJPanel;
import M_V.MPI.xls.commonXLS.MakeContainerXLS;
import M_V.MVQ.button.DetaButton;
import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_OVQ_OSQ_VSQ;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkNode;
import O_V.OSM.shell.E_pl_XA_E;
import S_I.OSI.PEI.PCI.PSI.tinShell.TinMap;
import exception.thread.DetaThread;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.accessibility.AccessibleContext;
import javax.swing.ActionMap;
import javax.swing.ComponentInputMap;
import javax.swing.InputMap;
import javax.swing.InputVerifier;
import javax.swing.JCheckBox;
import javax.swing.JPopupMenu;
import javax.swing.JTextPane;
import javax.swing.KeyStroke;
import javax.swing.border.Border;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FocusTraversalPolicy;
import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.LayoutManager;
import java.awt.PopupMenu;
import java.awt.Rectangle;
import java.awt.dnd.DropTarget;
import java.awt.event.ComponentListener;
import java.awt.event.ContainerListener;
import java.awt.event.FocusListener;
import java.awt.event.HierarchyBoundsListener;
import java.awt.event.HierarchyListener;
import java.awt.event.InputMethodListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelListener;
import java.awt.image.BufferStrategy;
import java.beans.PropertyChangeSupport;
import java.beans.VetoableChangeSupport;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
class ShellJPanelSeparationTest {
    //    @Mock
//    App NE;
    @Mock
    LinkNode thisNodeInfo;
    //Field jlabel_box of type JCheckBox[] - was not mocked since Mockito doesn't mock arrays
    //Field tabNamesHook of type boolean[] - was not mocked since Mockito doesn't mock arrays
    @Mock
    JTextPane jTextPane;
    //Field stringBuilder of type StringBuilder - was not mocked since Mockito doesn't mock a
    // Final class when 'mock-maker-inline' option is not set
    @Mock
    JTextPane outputjTextPane;
    @Mock
    TinMap output;
    @Mock
    DetaButton jlabel_button_clear;
    @Mock
    DetaButton jlabel_button;
    @Mock
    DetaButton jlabel_init_button;
    @Mock
    DetaButton jlabel_debug_button;
    @Mock
    DetaButton jlabel_flush_button;
    @Mock
    App appInThisClass;
    @Mock
    JCheckBox jlabel_peizhi_di2515;
    @Mock
    Set<KeyStroke> managingFocusForwardTraversalKeys;
    @Mock
    Set<KeyStroke> managingFocusBackwardTraversalKeys;
    @Mock
    Object INPUT_VERIFIER_SOURCE_KEY;
    @Mock
    ComponentUI ui;
    @Mock
    EventListenerList listenerList;
    @Mock
    VetoableChangeSupport vetoableChangeSupport;
    @Mock
    Border border;
    @Mock
    InputVerifier inputVerifier;
    @Mock
    Component paintingChild;
    @Mock
    JPopupMenu popupMenu;
    @Mock
    AtomicBoolean revalidateRunnableScheduled;
    @Mock
    List<Rectangle> tempRectangles;
    @Mock
    InputMap focusInputMap;
    @Mock
    InputMap ancestorInputMap;
    @Mock
    ComponentInputMap windowInputMap;
    @Mock
    ActionMap actionMap;
    @Mock
    Component componentObtainingGraphicsFrom;
    @Mock
    Object componentObtainingGraphicsFromLock;
    @Mock
    Object aaHint;
    @Mock
    Object lcdRenderingHint;

    @Mock
    List<Component> component;
    @Mock
    LayoutManager layoutMgr;
    @Mock
    FocusTraversalPolicy focusTraversalPolicy;
    @Mock
    Set<Thread> printingThreads;
    @Mock
    ContainerListener containerListener;
    @Mock
    Color preserveBackgroundColor;

    @Mock
    Component modalComp;
    //Field modalAppContext of type AppContext - was not mocked since Mockito doesn't mock a Final class when 'mock-maker-inline' option is not set


    @Mock
    Container parent;
    //Field appContext of type AppContext - was not mocked since Mockito doesn't mock a Final class when 'mock-maker-inline' option is not set
    @Mock
    Color foreground;
    @Mock
    Color background;
    @Mock
    Font font;
    @Mock
    Font peerFont;
    @Mock
    Cursor cursor;
    //Field locale of type Locale - was not mocked since Mockito doesn't mock a Final class when 'mock-maker-inline' option is not set
    @Mock
    GraphicsConfiguration graphicsConfig;
    @Mock
    BufferStrategy bufferStrategy;
    @Mock
    DropTarget dropTarget;
    @Mock
    Vector<PopupMenu> popups;
    //Field focusTraversalKeys of type Set[] - was not mocked since Mockito doesn't mock arrays
    @Mock
    Object LOCK;
    //Field acc of type AccessControlContext - was not mocked since Mockito doesn't mock a Final class when 'mock-maker-inline' option is not set
    @Mock
    Dimension minSize;
    @Mock
    Dimension prefSize;
    @Mock
    Dimension maxSize;
    //Field componentOrientation of type ComponentOrientation - was not mocked since Mockito doesn't mock a Final class when 'mock-maker-inline' option is not set
    @Mock
    ComponentListener componentListener;
    @Mock
    FocusListener focusListener;
    @Mock
    HierarchyListener hierarchyListener;
    @Mock
    HierarchyBoundsListener hierarchyBoundsListener;
    @Mock
    KeyListener keyListener;
    @Mock
    MouseListener mouseListener;
    @Mock
    MouseMotionListener mouseMotionListener;
    @Mock
    MouseWheelListener mouseWheelListener;
    @Mock
    InputMethodListener inputMethodListener;
    @Mock
    PropertyChangeSupport changeSupport;
    @Mock
    Object objectLock;
    //Field compoundShape of type Region - was not mocked since Mockito doesn't mock a Final class when 'mock-maker-inline' option is not set
    //Field mixingCutoutRegion of type Region - was not mocked since Mockito doesn't mock a Final class when 'mock-maker-inline' option is not set
    //Field eventCache of type EventQueueItem[] - was not mocked since Mockito doesn't mock arrays
    @Mock
    Map<Class<?>, Boolean> coalesceMap;

    @Mock
    AccessibleContext accessibleContext;
    @InjectMocks
    ShellJPanel shellJPanel;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetStringFromStringBuilder() {
        String result = shellJPanel.getStringFromStringBuilder();
        //mock trif Assertions.assertEquals("replaceMeWithExpectedResult", result);
    }

    /*
     * --PLSearch tinshell 文档一键批处理多分层命令语言流实例
     * 这是一个 tinshell 批处理拆分非clone结果测试，区别于OSGI的节点流拆分可clone分层结果， 执行复杂条件搜索逻辑，
     * 区别于Sample_X_I_MapAddPluginTest PLETL函数的计算模式。 测试main函数demo的test版本，在导入了api之后进行系统集成，然后
     * 用下面的对应的函数中源码逻辑进行复制粘贴到工程中，直接运行，即可出结果，源码的逻辑按照输入准备计算的参数，
     * 然后执行，然后获取输出需要的结果，可以用断点来查看数据，也可以用println来显示输出，方便集成，对程序员友好。
     * 系统需要jdk1.8 以上的java环境，本人会把测试的输入输出都注释在这个文件里。及其傻瓜化的流程，方便商业化落地。
     * --罗瑶光
     * */
    @Test
    void testTinshell() throws InterruptedException {
        //test without mock api
        System.out.println("test without mock api -- tinshell 批处理测试 执行复杂条件搜索逻辑" +
            "--我本地苹果mac上已经调通可运行。" +
            "方便我之后的各类型测试");
        //启动测试开始
        //配置系统支持
        App_X NE = new App_X();
        //临时设置用，之后结构优化后进行去除。
        NE.tempString = "去弹窗组件流测试";
        //配置组件支持
        NE.init(NE);
        DetaThread.sleepDeta(100);
        NE.start();
        //配置环境支持
        while (null == NE.app_S.studyVerbaMap) {
            Thread.sleep(500);
        }
        //配置读XLS的表头配置
        NE.app_S.appConfig.SectionJPanel.xlsWithSpec.setSelected(true);
        //开始模拟读xls的函数逻辑测试
        try {
            if (null == NE.app_S._A) {
                return;
            }//later normalization
            MakeContainerXLS makeContainerXLS = new MakeContainerXLS(NE.app_S._A, NE.app_S
                , NE.app_S.jTabbedpane, NE.app_S.tabNames, NE.app_S.fMHMMListOneTime_E_X_S.posCnToCn
                , NE.app_S.fMHMMListOneTime_E_X_S.posEnToEn, NE.app_S.fMHMMListOneTime_E_X_S.enToCn
                , NE.app_S.fMHMMListOneTime_E_X_S.fullCnToEn, "xls"
                , NE.app_S.emotionSample, NE.app_S.ratioMap_E, NE.app_S.sensingTest, NE
            );
            //临时设置用，之后结构优化后进行去除。
            //确定测试文件名为药食同源的表文件，tinshell函数执行这个表的操作计算。
            NE._I_U.tempString
                = "/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/" +
                "project/TinOS/DetaResources/books/xlsx/zybgPage.xlsx";
            makeContainerXLS.start();
            while (null == makeContainerXLS.jpanelSecond) {
                Thread.sleep(100);
            }
            while (null == makeContainerXLS.jpanelSecond.pageName) {
                Thread.sleep(100);
            }
            NE.app_S.makeContainerXLSList.add(makeContainerXLS);
            if (makeContainerXLS.tabNames.size() < 1) {
                System.out.println("error read table");
                NE.stop();
                return;
            }
            String XLSTableName = makeContainerXLS.jpanelSecond.pageName;
            String XLSTableNamePath = makeContainerXLS.jpanelSecond.xlsFilePath;
            System.out.println("path table:" + XLSTableName);
            System.out.println("name table:" + XLSTableNamePath);
            //init test
            //准备测试命令，sonar覆盖率30%，提高覆盖率方式，我的DNA元基催化与肽计算中所有的命令都按下面方式模拟一遍就可以100%。
            //我做的是模拟loader runner 批处理，不是sonar体系逻辑。我写测试是满足我罗瑶光的欲望，我的欲望不会告诉大家。大家要sonar，
            // 去100%填满mock所有单元函数即可。
            String tinshell = ("首先获取一个表，名字是" + XLSTableName + "，如果有这个表，准备下一步选择;\r\n" +
                "条件为:和:功效|DNN搜索|功效|菜谱|4;\r\n" +
                "条件为:和:中药名称|包含|菜谱;\r\n" +
                "条件为:和:风险规避|不包含|孕;\r\n" +
                "条件为:和:性味|不包含|凉;\r\n" +
                "条件为:和:性味|不包含|咸;\r\n" +
                "获取列名:中药名称:打分:功效;\r\n");
            TinMap tinMap = execTest(tinshell, NE, null);
            //输出
//line-->:XLS1753903322644
//line-->:获取列名
//line-->:success
//line-->:0
//line-->:进行选择
//line-->:[ID, 打分, 中药名称, 笔记原文, 功效, 风险规避, 用法, 性味, 脉络, 中医馆药理, 经解, 崇源, 愚按, 搭配, 序号]
//line-->:XLS1753903322644
//line-->:true
//line-->:获取列名
//line-->:0
//line-->:[{rowValue={功效={culumnValue=功专托痘疮。下乳汁。吐风痰。中风证以虾半斤。入葱姜酱料水煮。先吃虾。次吃汁。
//以鹅翎探引吐出痰涎即愈。能壮阳道。动风发呛。...., culumnName=功效}, 中药名称={culumnValue=虾菜谱, culumnName=中药名称},
//打分={culumnValue=0, culumnName=打分}}}, {rowValue={功效={culumnValue=功专温中益气。多食热中发渴。发疮疥。一名。鱼。
//...., culumnName=功效}, 中药名称={culumnValue=鲢鱼菜谱, culumnName=中药名称}, 打分={culumnValue=0, culumnName=
//打分}}}, {rowValue={功效={culumnValue=功专补五脏。除风湿。尾血疗口眼。斜。少和麝。左涂右。右。涂左。正则洗去。滴耳治耳痛。
//滴鼻治鼻衄。点目治痘后生翳。头治百虫入耳。...., culumnName=功效}, 中药名称={culumnValue=鳝鱼菜谱, culumnName=中药名称},
//打分={culumnValue=0, culumnName=打分}}}, {rowValue={功效={culumnValue=功专调胃气。...., culumnName=功效}, 中药
//名称={culumnValue=鲂鱼菜谱, culumnName=中药名称}, 打分={culumnValue=0, culumnName=打分}}}, {rowValue={功效={c
//ulumnValue=马铃薯生长肌肉, 健骨, 抗癌。., culumnName=功效}, 中药名称={culumnValue=马铃薯菜谱, culumnName=中药名称},
//打分={culumnValue=0, culumnName=打分}}}, {rowValue={功效={culumnValue=山羊蹄子增强免疫, 健骨, 补元气。., culumnName
//=功效}, 中药名称={culumnValue=山羊蹄菜谱, culumnName=中药名称}, 打分={culumnValue=0, culumnName=打分}}}, {rowValue
//={功效={culumnValue=功专暖中益气。醒酒解渴。同米粉煮羹食。调中收痔。煮食疗阳事不起。俗名泥鳅。...., culumnName=功效},
//中药名称={culumnValue=鳅鱼菜谱, culumnName=中药名称}, 打分={culumnValue=0, culumnName=打分}}}, {rowValue={功效
//={culumnValue=咖喱去腥开胃生津防腐杀虫提神充饥抗癌。., culumnName=功效}, 中药名称={culumnValue=食物咖喱菜谱, culumn
//Name=中药名称}, 打分={culumnValue=0, culumnName=打分}}}, {rowValue={功效={culumnValue=常用于润肺护肤抗癌。.,
//culumnName=功效}, 中药名称={culumnValue=西红柿菜谱, culumnName=中药名称}, 打分={culumnValue=0, culumnName=打分}}},
//{rowValue={功效={culumnValue=蛋有消炎解毒, 壮阳, 补元气, 提神, 预防感冒。., culumnName=功效}, 中药名称={culumnValue
//=鸡鸭鸽子鹌鹑蛋菜谱, culumnName=中药名称}, 打分={culumnValue=0, culumnName=打分}}}]
//line-->:10
//line-->:success
//line-->:0
//line-->:10
//Action-->:selectRowsByAttributesOfGetCulumns
//Action-->:P_ListNeedStart
//Action-->:P_TableName
//Action-->:selectRowsByAttributesOfCondition

//拆分----
            String tinshell2 = ("在输出的数据表中仅展示列名为中药名称，打分和功效列这三个即可;\r\n" +
                "操作:0|行至|30;\r\n" +
                "操作:中药名称|颜色标记为|红色;");
            execTest(tinshell2, NE, tinMap);
            //输出
//line-->:XLS1753903322644
//line-->:操作
//line-->:success
//line-->:0
//line-->:进行选择
//line-->:[ID, 打分, 中药名称, 笔记原文, 功效, 风险规避, 用法, 性味, 脉络, 中医馆药理, 经解, 崇源, 愚按, 搭配, 序号]
//line-->:XLS1753903322644
//line-->:true
//line-->:操作
//line-->:0
//line-->:[{rowValue={功效={culumnValue=功专托痘疮。下乳汁。吐风痰。中风证以虾半斤。入葱姜酱料水煮。先吃虾。次吃汁。以鹅翎探引吐出痰涎即愈。
//能壮阳道。动风发呛。...., culumnName=功效}, 中药名称={culumnValue=<div style="background:black"><font color="red"><div style="
//background:black"><font color="red"><div style="background:black"><font color="red"><div style="background:black"><font
//color="red"><div style="background:black"><font color="red"><div style="background:black"><font color="red"><div style
//="background:black"><font color="red"><div style="background:black"><font color="red"><div style="background:black"><font
//color="red"><div style="background:black"><font color="red">虾菜谱</font></div></font></div></font></div></font></div><
///font></div></font></div></font></div></font></div></font></div></font></div>, culumnName=中药名称}, 打分={culumnValue=0,
//culumnName=打分}}}, {rowValue={功效={culumnValue=功专温中益气。多食热中发渴。发疮疥。一名。鱼。...., culumnName=功效}, 中药名称={cu
//lumnValue=<div style="background:black"><font color="red"><div style="background:black"><font color="red"><div style="
//background:black"><font color="red"><div style="background:black"><font color="red"><div style="background:black"><font
//color="red"><div style="background:black"><font color="red"><div style="background:black"><font color="red"><div style=
//"background:black"><font color="red"><div style="background:black"><font color="red"><div style="background:black"><font
//color="red">鲢鱼菜谱</font></div></font></div></font></div></font></div></font></div></font></div></font></div></font></d
//iv></font></div></font></div>, culumnName=中药名称}, 打分={culumnValue=0, culumnName=打分}}}, {rowValue={功效={culumnValue=
//功专补五脏。除风湿。尾血疗口眼。斜。少和麝。左涂右。右。涂左。正则洗去。滴耳治耳痛。滴鼻治鼻衄。点目治痘后生翳。头治百虫入耳。...., culumnName=
//功效}, 中药名称={culumnValue=<div style="background:black"><font color="red"><div style="background:black"><font color="re
//d"><div style="background:black"><font color="red"><div style="background:black"><font color="red"><div style="background
//:black"><font color="red"><div style="background:black"><font color="red"><div style="background:black"><font color="red"
//><div style="background:black"><font color="red"><div style="background:black"><font color="red"><div style="background:
//black"><font color="red">鳝鱼菜谱</font></div></font></div></font></div></font></div></font></div></font></div></font></di
//v></font></div></font></div></font></div>, culumnName=中药名称}, 打分={culumnValue=0, culumnName=打分}}}, {rowValue={功效={cu
//lumnValue=功专调胃气。...., culumnName=功效}, 中药名称={culumnValue=<div style="background:black"><font color="red"><div sty
//le="background:black"><font color="red"><div style="background:black"><font color="red"><div style="background:black"><fo
//nt color="red"><div style="background:black"><font color="red"><div style="background:black"><font color="red"><div styl
//e="background:black"><font color="red"><div style="background:black"><font color="red"><div style="background:black"><fon
//t color="red"><div style="background:black"><font color="red">鲂鱼菜谱</font></div></font></div></font></div></font></div>
//</font></div></font></div></font></div></font></div></font></div></font></div>, culumnName=中药名称}, 打分={culumnValue=0,
//culumnName=打分}}}, {rowValue={功效={culumnValue=马铃薯生长肌肉, 健骨, 抗癌。., culumnName=功效}, 中药名称={culumnValue=<div style
//="background:black"><font color="red"><div style="background:black"><font color="red"><div style="background:black"><font
//color="red"><div style="background:black"><font color="red"><div style="background:black"><font color="red"><div style=
//"background:black"><font color="red"><div style="background:black"><font color="red"><div style="background:black"><font
//color="red"><div style="background:black"><font color="red"><div style="background:black"><font color="red">马铃薯菜谱</fon
//t></div></font></div></font></div></font></div></font></div></font></div></font></div></font></div></font></div></font>
//</div>, culumnName=中药名称}, 打分={culumnValue=0, culumnName=打分}}}, {rowValue={功效={culumnValue=山羊蹄子增强免疫, 健骨, 补元气
//。., culumnName=功效}, 中药名称={culumnValue=<div style="background:black"><font color="red"><div style="background:black">
//<font color="red"><div style="background:black"><font color="red"><div style="background:black"><font color="red"><div
//style="background:black"><font color="red"><div style="background:black"><font color="red"><div style="background:black"
//><font color="red"><div style="background:black"><font color="red"><div style="background:black"><font color="red"><div
//style="background:black"><font color="red">山羊蹄菜谱</font></div></font></div></font></div></font></div></font></div></
//font></div></font></div></font></div></font></div></font></div>, culumnName=中药名称}, 打分={culumnValue=0, culumnName=打分}
//}}, {rowValue={功效={culumnValue=功专暖中益气。醒酒解渴。同米粉煮羹食。调中收痔。煮食疗阳事不起。俗名泥鳅。...., culumnName=功效}, 中药名称
//={culumnValue=<div style="background:black"><font color="red"><div style="background:black"><font color="red"><div style
//="background:black"><font color="red"><div style="background:black"><font color="red"><div style="background:black"><fo
//nt color="red"><div style="background:black"><font color="red"><div style="background:black"><font color="red"><div styl
//e="background:black"><font color="red"><div style="background:black"><font color="red"><div style="background:black"><f
//ont color="red">鳅鱼菜谱</font></div></font></div></font></div></font></div></font></div></font></div></font></div></font><
///div></font></div></font></div>, culumnName=中药名称}, 打分={culumnValue=0, culumnName=打分}}}, {rowValue={功效={culumnValu
//e=咖喱去腥开胃生津防腐杀虫提神充饥抗癌。., culumnName=功效}, 中药名称={culumnValue=<div style="background:black"><font color="red">
//<div style="background:black"><font color="red"><div style="background:black"><font color="red"><div style="background:bl
//ack"><font color="red"><div style="background:black"><font color="red"><div style="background:black"><font color="red">
//<div style="background:black"><font color="red"><div style="background:black"><font color="red"><div style="background:b
//lack"><font color="red"><div style="background:black"><font color="red">食物咖喱菜谱</font></div></font></div></font></div>
//</font></div></font></div></font></div></font></div></font></div></font></div></font></div>, culumnName=中药名称}, 打分={cu
//lumnValue=0, culumnName=打分}}}, {rowValue={功效={culumnValue=常用于润肺护肤抗癌。., culumnName=功效}, 中药名称={culumnValue=<div
//style="background:black"><font color="red"><div style="background:black"><font color="red"><div style="background:black">
//<font color="red"><div style="background:black"><font color="red"><div style="background:black"><font color="red"><div
//style="background:black"><font color="red"><div style="background:black"><font color="red"><div style="background:black">
//<font color="red"><div style="background:black"><font color="red"><div style="background:black"><font color="red">西红柿菜谱
//</font></div></font></div></font></div></font></div></font></div></font></div></font></div></font></div></font></div></font>
//</div>, culumnName=中药名称}, 打分={culumnValue=0, culumnName=打分}}}, {rowValue={功效={culumnValue=蛋有消炎解毒, 壮阳, 补元气, 提神
//, 预防感冒。., culumnName=功效}, 中药名称={culumnValue=<div style="background:black"><font color="red"><div style="backgrou
//nd:black"><font color="red"><div style="background:black"><font color="red"><div style="background:black"><font color="re
//d"><div style="background:black"><font color="red"><div style="background:black"><font color="red"><div style="backgroun
//d:black"><font color="red"><div style="background:black"><font color="red"><div style="background:black"><font color="re
//d"><div style="background:black"><font color="red">鸡鸭鸽子鹌鹑蛋菜谱</font></div></font></div></font></div></font></div></fo
//nt></div></font></div></font></div></font></div></font></div></font></div>, culumnName=中药名称}, 打分={culumnValue=0, culum
//nName=打分}}}]
//line-->:10
//line-->:success
//line-->:0
//line-->:10
//Action-->:selectRowsByAttributesOfGetCulumns
//Action-->:P_ListNeedStart
//Action-->:selectRowsByAttributesOfAggregation
//Action-->:P_TableName
//Action-->:selectRowsByAttributesOfCondition
//Action-->:addFindColumnsInMemoryClass
//Disconnected from the target VM, address: '127.0.0.1:52739', transport: 'socket'
//
//Process finished with exit code 0


            //关闭
            NE.stop();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }

    private TinMap execTest(String tinshell, App NE, TinMap tinMap) {
        String plSearch = tinshell;//可以是其他的语言。initon talk， plorm， deta db etc。。
        //osgi view init
        OSU_OVQ_OSQ_VSQ _SQ__OVQ_OSQ_VSQ = new OSU_OVQ_OSQ_VSQ();
        //命令需要的表格生成
        //later//Object object = _SQ__OVQ_OSQ_VSQ.outputOut.get(S_ShellETL.SHELL_ETL_TIN_SHELL_ETL);
        Object object = new TinMap();
        //do test
        if (null==tinMap) {
            tinMap = (TinMap) object;
        }
        output = E_pl_XA_E.E_pl_XA(plSearch.replace("\r\n", ""), false
            , tinMap, NE);//later
        //print answer
        //打印执行后的输出表格
        if (null == output) {
            return null;
        }
        Iterator<String> iterator = output.keySet().iterator();
        //输出
        while (iterator.hasNext()) {
            String string = iterator.next();
            NE.app_S.appConfig.SectionJPanel.jTextPane.setText(output.get(string).toString());
            System.out.println("line-->:" + output.get(string).toString());
            //stringBuilder.append("/r/n" + output.get(string).toString());
        }
        //DNA序列记忆标注
        if (null != NE.app_S.helpVerbaMap.didJustNow) {
            Iterator<String> iterators = NE.app_S.helpVerbaMap.didJustNow.keySet().iterator();
            while (iterators.hasNext()) {
                System.out.println("Action-->:" + iterators.next());
            }
        }
        return output;
    }

}

//Generated with love by TestMe :) Please report issues and submit feature
// requests at: http://weirddev.com/forum#!/testme