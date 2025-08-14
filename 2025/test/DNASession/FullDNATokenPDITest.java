package test.java.InterfaceTest.DNASession;

import A_I.MPE.MAQPVDCOISIV.full.FullDNATokenPDI;
import S_A.SVQ.stable.S_Common;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 *  （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
//注意: 该 文件对应的是罗瑶光先生 DNA 编码 与 计算的两本  国家软著作 思想的编码 实现. 
//公安部 与 知识产权委员会 已经备案, 可阅读 相关 著作权 原文  进行逻辑辨别.
//模拟数据新陈代谢, 先从分离main函数开始, 方便以后变成测试函数.
public class FullDNATokenPDITest {
    public static void main(String[] argv) {
        FullDNATokenPDI pDE_RNA_FullFormular = new FullDNATokenPDI();
        String a = "luoyaoguang";
        pDE_RNA_FullFormular.encodeDNA(a);

        @SuppressWarnings("unused")
        String initonKeys = "EIU/0.6/EDU/0.4/si/0.3/sq/0.7/EIU/0.5/EDU/0.5/si/0.632/sq/0.368";
        pDE_RNA_FullFormular.key[0] = 0.6;
        pDE_RNA_FullFormular.key[1] = 0.3;
        pDE_RNA_FullFormular.key[2] = 0.5;
        pDE_RNA_FullFormular.key[3] = 0.632;

        pDE_RNA_FullFormular.text = "控制吸收";
        pDE_RNA_FullFormular.pdw = pDE_RNA_FullFormular.initonSect(pDE_RNA_FullFormular.text);
        System.out.println("原文: " + pDE_RNA_FullFormular.text);
        //pDE_RNA_FullFormular.pdw= "字典保密：MSIOCUOCIPCUPCI";
        String[] lock = new String[12];
        lock[0] = "A";
        lock[3] = "O";
        lock[6] = "P";
        lock[9] = "M";
        lock[1] = "V";
        lock[4] = "E";
        lock[7] = "C";
        lock[10] = "S";
        lock[2] = "I";
        lock[5] = "D";
        lock[8] = "U";
        lock[11] = "Q";
        int i = (int) (Math.random() * 12) % 12;
        pDE_RNA_FullFormular.lock += lock[i];
        i = (int) (Math.random() * 12) % 12;
        pDE_RNA_FullFormular.lock += lock[i];
        i = (int) (Math.random() * 12) % 12;
        pDE_RNA_FullFormular.lock += lock[i];
        i = (int) (Math.random() * 12) % 12;
        pDE_RNA_FullFormular.lock += lock[i];

        for (i = 0; i < pDE_RNA_FullFormular.pdw.length(); i++) {
            pDE_RNA_FullFormular.code += pDE_RNA_FullFormular.lock
                + pDE_RNA_FullFormular.pdw.charAt(i);
        }
        System.out.println("肽语: " + pDE_RNA_FullFormular.pdw);
        System.out.println("肽锁: " + pDE_RNA_FullFormular.lock);
        System.out.println("散列肽语:" + pDE_RNA_FullFormular.code);
        pDE_RNA_FullFormular.bys = "0.6/0.3/0.5/0.632";
        System.out.println("静态密钥: " + pDE_RNA_FullFormular.bys);
        pDE_RNA_FullFormular.doKeyPress(pDE_RNA_FullFormular.code, pDE_RNA_FullFormular, false);
        System.out.println("静态肽展降元概率钥匙E: " + pDE_RNA_FullFormular.pdedeKey);
        System.out.println("静态肽展降元概率钥匙S: " + pDE_RNA_FullFormular.pdedsKey);
        System.out.println("静态肽展降元: " + pDE_RNA_FullFormular.pds);

        System.out.println("静态肽展增元概率钥匙E: " + pDE_RNA_FullFormular.pdeieKey);
        System.out.println("静态肽展增元概率钥匙S: " + pDE_RNA_FullFormular.pdeisKey);
        System.out.println("静态肽展增元: " + pDE_RNA_FullFormular.pde);

        pDE_RNA_FullFormular.time = "" + System.currentTimeMillis();
        pDE_RNA_FullFormular.cacheId = "ID" + Math.random()
            + S_Common.STRING_SYMBOL_PER + Math.random();
        System.out.println("时间:  " + pDE_RNA_FullFormular.time);
        System.out.println("账号随机缓存字符串:  " + pDE_RNA_FullFormular.cacheId);
        pDE_RNA_FullFormular.session_key = pDE_RNA_FullFormular.pde;
        System.out.println("Session: " + pDE_RNA_FullFormular.session_key);
        System.out.println("====================================================");
        System.out.println("开始前序验证：");
        System.out.println("开始Session解析： " + pDE_RNA_FullFormular.session_key);
        System.out.println("开始概率钥匙解析：" + pDE_RNA_FullFormular.pdedeKey
            + pDE_RNA_FullFormular.pdedsKey
            + pDE_RNA_FullFormular.pdeieKey + pDE_RNA_FullFormular.pdeisKey);

        FullDNATokenPDI pDE_RNA_FullFormular1 = new FullDNATokenPDI();
        pDE_RNA_FullFormular1.pdedeKey = pDE_RNA_FullFormular.pdedeKey.toString();
        pDE_RNA_FullFormular1.pdedsKey = pDE_RNA_FullFormular.pdedsKey.toString();
        pDE_RNA_FullFormular1.pdeieKey = pDE_RNA_FullFormular.pdeieKey.toString();
        pDE_RNA_FullFormular1.pdeisKey = pDE_RNA_FullFormular.pdeisKey.toString();

        pDE_RNA_FullFormular.doKeyUnPress(pDE_RNA_FullFormular.code, pDE_RNA_FullFormular1, true);
        System.out.println();
        System.out.println("得到原降元元基DNA序列：" + pDE_RNA_FullFormular.pds);
        System.out.println("得到新降元元基DNA序列：" + pDE_RNA_FullFormular1.pds);
        System.out.println("得到原元基DNA序列：" + pDE_RNA_FullFormular.pde);
        System.out.println("得到新元基DNA序列：" + pDE_RNA_FullFormular1.pde);
        System.out.println("验证正确？");
        System.out.println(pDE_RNA_FullFormular.pde.equals(pDE_RNA_FullFormular1.pde)
            ? "正确" : "失败");
        System.out.println("========================================================");
        System.out.println("开始后序验证：");
        FullDNATokenPDI pDE_RNA_FullFormular2 = new FullDNATokenPDI();
        pDE_RNA_FullFormular2.pdeieKey = pDE_RNA_FullFormular.pdedeKey.toString();
        pDE_RNA_FullFormular2.pdeisKey = pDE_RNA_FullFormular.pdedsKey.toString();
        pDE_RNA_FullFormular2.pdedeKey = pDE_RNA_FullFormular.pdeieKey.toString();
        pDE_RNA_FullFormular2.pdedsKey = pDE_RNA_FullFormular.pdeisKey.toString();
        System.out.println("准备计算元基DNA序列：" + pDE_RNA_FullFormular1.pde);
        pDE_RNA_FullFormular2.doSessionKeyUnPress(pDE_RNA_FullFormular1.pde
            , pDE_RNA_FullFormular2, true);
        System.out.println();
        System.out.println("得到原续降元元基DNA序列：" + pDE_RNA_FullFormular1.pds);
        System.out.println("得到后续降元元基DNA序列：" + pDE_RNA_FullFormular2.pds);
        System.out.println("验证正确？");
        System.out.println(pDE_RNA_FullFormular1.pds.equals(pDE_RNA_FullFormular2.pds)
            ? "正确" : "失败");

        System.out.println("====================================================");
        System.out.println("开始整序验证：");
        FullDNATokenPDI pDE_RNA_FullFormular3 = new FullDNATokenPDI();


        pDE_RNA_FullFormular3.pdeieKey = pDE_RNA_FullFormular.pdeieKey.toString();
        pDE_RNA_FullFormular3.pdeisKey = pDE_RNA_FullFormular.pdeisKey.toString();
        pDE_RNA_FullFormular3.pdedeKey = pDE_RNA_FullFormular.pdeieKey.toString();
        pDE_RNA_FullFormular3.pdedsKey = pDE_RNA_FullFormular.pdeisKey.toString();


        System.out.println("准备计算元基DNA序列：" + pDE_RNA_FullFormular1.pde);//pde加成
        pDE_RNA_FullFormular3.doFullSessionKeyUnPress(pDE_RNA_FullFormular1.pde
            , pDE_RNA_FullFormular3, true);
        System.out.println();
        System.out.println("得到原续降元元基DNA序列：" + pDE_RNA_FullFormular1.pds);
        System.out.println("得到后续降元元基DNA序列：" + pDE_RNA_FullFormular3.pds);
        System.out.println("验证正确？");
        System.out.println(pDE_RNA_FullFormular1.pds.equals(pDE_RNA_FullFormular3.pds)
            ? "正确" : "失败");
        System.out.println("准备整序计算元基DNA序列：" + pDE_RNA_FullFormular1.pde);
        System.out.println("准备整序计算元基DNA序列：" + pDE_RNA_FullFormular3.pde);
        System.out.println(pDE_RNA_FullFormular1.pde.equals(pDE_RNA_FullFormular3.pde)
            ? "正确" : "失败");
    }
}
