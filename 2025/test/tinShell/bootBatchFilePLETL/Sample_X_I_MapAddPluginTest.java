package test.java.InterfaceTest.tinShell.bootBatchFilePLETL;

import ME.VPC.M.app.App_X;
import M_V.MPI.xls.commonXLS.MakeContainerXLS;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkNode;
import OPE.PSQ.OEU.SOI.SMQ.neroCell.BootNeroCell;
import OSI.OPE.OEI.PVI.SOI.SMQ.load.File_X_Load;
import S_A.SVQ.stable.S_Annotation;
import S_A.pheromone.IMV_SIQ;
import S_I.OSI.PEI.PCI.PSI.tinShell.TinMap;
import exception.thread.DetaThread;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
class Sample_X_I_MapAddPluginTest {
    /*
     * 这是一个 tinshell 批处理测试XSLX文件 一键执行复杂条件的ETL节点流拆分搜索语句逻辑， 测试main函数demo的test版本，
     * 在导入了api之后进行系统集成，然后用下面的对应的函数中源码逻辑进行复制粘贴到工程中，直接运行，即可出结果，
     * 源码的逻辑按照输入准备计算的参数，然后执行，然后获取输出需要的结果，可以用断点来查看数据，也可以用println
     * 来显示输出，方便集成，对程序员友好。系统需要jdk1.8 以上的java环境，本人会把测试的输入输出都注释在这个文件里。
     * 及其傻瓜化的流程，方便商业化落地。
     * 关于早期git的错别字问题产生文字描述下，1 windows的中文输入法 词汇一旦确定回车后会和首个词汇互换，
     * 稍不留神就第一个词汇输入正确，第二次就因互换了导致记忆欺骗就输入错误了。2 这时候配合劣质传感器 拆机机
     * 不开发票的 设备 偷偷放电，手指触摸微微酥麻+眼睛边角靠近太阳穴刺痒麻，头顶，后颈，鼻两侧，背部，足弓内侧，
     * 小腿中段外侧配合刺痒麻，再配合光敏效应和大脑奇奇怪怪的意识比如反正罗瑶光是富兰克林的板凳重复更近编码矫正方式，
     * 这次有问题下次改，总是越来越好的思想，一旦上传，之后又莫名被临时的重要事件优先级一变化先放下手头任务，good luck，
     * 只要以后不再cover这个错误小领域的更新，就永久 错别字在网上了。因为罗瑶光东西太多，又是个人行为，不会去cover那
     * 些数不尽的身边人+同行的社会套路。抽经酥麻，好玩吗？当然如果给我钱请我吃饭，我倒是会留意下优先级。
     * --罗瑶光
     * */
    @Test
    void _E() throws InterruptedException {
        //初始化
        App_X NE = new App_X();
        //配置 模式为无弹窗
        NE.tempString = "去弹窗组件流测试";
        //启动
        NE.init(NE);
        DetaThread.sleepDeta(100);
        NE.start();
        //配置环境支持
        while (null == NE.app_S.studyVerbaMap) {
            Thread.sleep(500);
        }
        //读需要测试的表
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
            //模式1 需要界面配置好PLETL的命令然后保存，之后执行这个保存文件 去弹窗输出即可
            //物理形式加密文，非古拉丁语语义加密
            //模式2 类似ShellJPanelTest例子进行拆分TinMap的人类shell和花语言命令计算输出。
            //模式1计算
            //一键导入文件
            //--文件位置-package test.java.InterfaceTest.tinShell.bootBatchFilePLETL;
            //--tinshell OSGI插件密文-tinshellExample.etl --加密方式-普通物理加密方式。
            //--tinshell OSGI插件密钥-tinshellExample.etl.dna --加密方式-普通物理加密方式。
            //--package OSI.OPE.gui; --line page 151
            NE._I_U.gUISample.fileCurrentpath
                = "/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/batchPLETL/tinshellExample.etl";
            File file = new File(NE._I_U.gUISample.fileCurrentpath);
            if (!file.isFile()) {
                System.out.println(S_Annotation.ATTENSION_RECHOICE);
                return;
            }
            LinkNode needDeleteNode = NE._I_U.gUISample.first.first;
            while (needDeleteNode != null) {
                NE._I_U.gUISample.first.first = NE._I_U.gUISample.first.deletNode(NE._I_U.gUISample.first
                        .first, needDeleteNode.name, needDeleteNode.ID
                    , needDeleteNode.primaryKey);
                if (null == needDeleteNode.next) {
                    break;
                }
                needDeleteNode = needDeleteNode.next;
            }
            NE._I_U.gUISample.canvas.repaint();  //稍后hook 进行 异常修整 20230218
            NE._I_U.gUISample.first.first = File_X_Load._E(NE._I_U.gUISample.first.first
                , NE._I_U.gUISample.nodeView, file, NE._I_U.gUISample.first, NE);
            NE._I_U.gUISample.canvas.repaint();
            NE._I_U.gUISample.righttopScrollPane.validate();
            //替换 ETL 例子文件中的XLS String
            //问题-文件名是临时的，我导表后是新的，etl文件中又加了密，所以需要如下解密再replace掉。
            NE.tempString += "去弹窗组件流测试--" + XLSTableName;
            String string = NE._I_U.gUISample.first.first.thisFace.nodeConfiguration;
            string = string.replaceAll("临时XLS1753745165960"
                , XLSTableName);
            NE._I_U.gUISample.first.first.thisFace.nodeConfiguration = string;
            //一键执行文件
            BootNeroCell.bootCell(NE._I_U.gUISample.first.first
                , NE._I_U.gUISample.rightBotJTextPane
                , NE._I_U.gUISample.canvas, NE);
            NE._I_U.gUISample.rightBotJTextPane.setText(S_Annotation.NODE_EXEC_SUCCESS);
            NE._I_U.gUISample.rightBotJTextPane.validate();
            //输出, 高级用法注意循环哟，罗瑶光只举出简单例子。
            LinkNode linkNode = NE._I_U.gUISample.first.first.clone();
            while (null != linkNode) {
                //这函数是我在用eclipse在联想电脑上创作的，一把个人著作权很正常，因为实名发票的联想电脑GPRS乱飘，
                //后换上海组装地实名发票指纹苹果电脑serial-FVFJCDL0Q6LC-上海马吉路88号产地的货，
                //浏阳天虹苹果店买的金色笔记本。自从我2010年后就再没去过上海了。--罗瑶光
                //2010年后任何上海同事我都没有再见过面，我以后会浏阳出门时候会注意下各类橡胶头套装扮的社会人尾随卡点猫腻。
                System.out.println("执行->" + linkNode.thisFace.nodeConfiguration);
                TinMap tinMap = linkNode.thisFace._SQ__OVQ_OSQ_VSQ.outputOut;
                TinMap tinShell = (TinMap) tinMap.get("TinShellETL");
                ArrayList arrayList = (ArrayList) tinShell.get("obj");
                int times = 0;
                for (Object object : arrayList) {
                    IMV_SIQ _IMV_SIQ = (IMV_SIQ) object;
                    Object _object = _IMV_SIQ.get("rowValue");
                    IMV_SIQ _IMV_SIQ_ = (IMV_SIQ) _object;
                    if (times++ < 1) {
                        System.out.println("列数->" + _IMV_SIQ_.size());
                    }
                    Object _object_ = _IMV_SIQ_.get("中药名称");
                    IMV_SIQ __IMV_SIQ_ = (IMV_SIQ) _object_;
                    System.out.println(__IMV_SIQ_.get("culumnValue"));
                }
                linkNode = linkNode.next;
            }
            /*
            //输出-注意测试XLS文件是一个纯文字表格文件，不要有图片和特殊符号。
            //tinshel花语拆开封装入2个节点的 ETL存档执行，输出都正确如下
执行->首先获取一个表，名字是临时XLS1753753458245，如果有这个表，准备下一步选择;条件为:和:功效|DNN搜索|功效|菜谱|4;条件为:和:中药名称|包含|菜谱;条件为:和:风险规避|不包含|孕;条件为:和:性味|不包含|凉;条件为:和:性味|不包含|咸;
列数->16
虾菜谱
鲢鱼菜谱
鳝鱼菜谱
鲂鱼菜谱
马铃薯菜谱
山羊蹄菜谱
鳅鱼菜谱
食物咖喱菜谱
西红柿菜谱
鸡鸭鸽子鹌鹑蛋菜谱
执行->获取列名:中药名称:打分:功效;在输出的数据表中仅展示列名为中药名称，打分和功效列这三个即可;
操作:0|行至|30;操作:中药名称|颜色标记为|红色;
列数->3
<div style="background:black"><font color="red"><div style="background:black">
<font color="red"><div style="background:black"><font color="red">
<div style="background:black"><font color="red"><div style="background:black">
<font color="red"><div style="background:black"><font color="red">
<div style="background:black"><font color="red"><div style="background:black">
<font color="red"><div style="background:black"><font color="red">
<div style="background:black"><font color="red">虾菜谱</font></div></font></div>
</font></div></font></div></font></div></font></div></font></div></font></div>
</font></div></font></div>
<div style="background:black"><font color="red"><div style="background:black">
<font color="red"><div style="background:black"><font color="red">
<div style="background:black"><font color="red"><div style="background:black">
<font color="red"><div style="background:black"><font color="red">
<div style="background:black"><font color="red"><div style="background:black">
<font color="red"><div style="background:black"><font color="red">
<div style="background:black"><font color="red">鲢鱼菜谱</font></div></font></div>
</font></div></font></div></font></div></font></div></font></div></font></div>
</font></div></font></div>
<div style="background:black"><font color="red"><div style="background:black">
<font color="red"><div style="background:black"><font color="red">
<div style="background:black"><font color="red"><div style="background:black">
<font color="red"><div style="background:black"><font color="red">
<div style="background:black"><font color="red"><div style="background:black">
<font color="red"><div style="background:black"><font color="red">
<div style="background:black"><font color="red">鳝鱼菜谱</font></div></font></div>
</font></div></font></div></font></div></font></div></font></div></font></div>
</font></div></font></div>
<div style="background:black"><font color="red"><div style="background:black">
<font color="red"><div style="background:black"><font color="red">
<div style="background:black"><font color="red"><div style="background:black">
<font color="red"><div style="background:black"><font color="red">
<div style="background:black"><font color="red"><div style="background:black">
<font color="red"><div style="background:black"><font color="red">
<div style="background:black"><font color="red">鲂鱼菜谱</font></div></font></div>
</font></div></font></div></font></div></font></div></font></div></font></div>
</font></div></font></div>
<div style="background:black"><font color="red"><div style="background:black">
<font color="red"><div style="background:black"><font color="red">
<div style="background:black"><font color="red"><div style="background:black">
<font color="red"><div style="background:black"><font color="red">
<div style="background:black"><font color="red"><div style="background:black">
<font color="red"><div style="background:black"><font color="red">
<div style="background:black"><font color="red">马铃薯菜谱</font></div></font>
</div></font></div></font></div></font></div></font></div></font></div></font>
</div></font></div></font></div>
<div style="background:black"><font color="red"><div style="background:black">
<font color="red"><div style="background:black"><font color="red">
<div style="background:black"><font color="red"><div style="background:black">
<font color="red"><div style="background:black"><font color="red">
<div style="background:black"><font color="red"><div style="background:black">
<font color="red"><div style="background:black"><font color="red">
<div style="background:black"><font color="red">山羊蹄菜谱</font></div></font>
</div></font></div></font></div></font></div></font></div></font></div></font>
</div></font></div></font></div>
<div style="background:black"><font color="red"><div style="background:black">
<font color="red"><div style="background:black"><font color="red">
<div style="background:black"><font color="red"><div style="background:black">
<font color="red"><div style="background:black"><font color="red">
<div style="background:black"><font color="red"><div style="background:black">
<font color="red"><div style="background:black"><font color="red">
<div style="background:black"><font color="red">鳅鱼菜谱</font></div></font></div>
</font></div></font></div></font></div></font></div></font></div></font></div>
</font></div></font></div>
<div style="background:black"><font color="red"><div style="background:black">
<font color="red"><div style="background:black"><font color="red">
<div style="background:black"><font color="red"><div style="background:black">
<font color="red"><div style="background:black"><font color="red">
<div style="background:black"><font color="red"><div style="background:black">
<font color="red"><div style="background:black"><font color="red">
<div style="background:black"><font color="red">食物咖喱菜谱</font></div></font>
</div></font></div></font></div></font></div></font></div></font></div></font>
</div></font></div></font></div>
<div style="background:black"><font color="red"><div style="background:black">
<font color="red"><div style="background:black"><font color="red">
<div style="background:black"><font color="red"><div style="background:black">
<font color="red"><div style="background:black"><font color="red">
<div style="background:black"><font color="red"><div style="background:black">
<font color="red"><div style="background:black"><font color="red">
<div style="background:black"><font color="red">西红柿菜谱</font></div></font>
</div></font></div></font></div></font></div></font></div></font></div></font>
</div></font></div></font></div>
<div style="background:black"><font color="red"><div style="background:black">
<font color="red"><div style="background:black"><font color="red">
<div style="background:black"><font color="red"><div style="background:black">
<font color="red"><div style="background:black"><font color="red">
<div style="background:black"><font color="red"><div style="background:black">
<font color="red"><div style="background:black"><font color="red">
<div style="background:black"><font color="red">鸡鸭鸽子鹌鹑蛋菜谱</font></div>
</font></div></font></div></font></div></font></div></font></div></font></div>
</font></div></font></div></font></div>
             */
            //结束
            NE.stop();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
