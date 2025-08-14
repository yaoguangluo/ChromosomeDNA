package test.java.InterfaceTest.computingPDE.pdi;

import A_I.MPE.MAQPVDCOISIV.pdi.RangePDI;
import org.junit.jupiter.api.Test;

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
class RangePDITest {

    @Test
    void main() {
    }

    @Test
    void PDS_P_USQ_ECP_I() {
    }

    @Test
    void double_IPE_AOPM_VECS_IDUQ_TXH_AC() {
    }

    @Test
    void testDouble_IPE_AOPM_VECS_IDUQ_TXH_AC() {
    }

    @Test
    void PDS_P_USQ_ECP_I_16() {
    }

    /*
     * 这是一个
     * ##### 5.6 PDW词汇在酸碱浓度下的PDE变化输出 --DNA十六元基编码真实应用
     * ######    --适用于PDE计算中 各类维度的十六肽元基编码数据进行变换前的 准备基础。
     * ######    --这个函数用于寻找不同酸碱浓度下可能存在的PDE变换，
     * ######    --适用于肽计算中 数据元基编码 后的 密码变换，词汇隐藏信息挖掘，长篇语言联想，深度文本分类。
     * 在导入了api之后进行系统集成，然后用下面的对应的函数中源码逻辑
     * 进行复制粘贴到工程中，直接运行，即可出结果，源码的逻辑按照输入准备计算的参数，然后执行，然后获取输出需要的结果，
     * 可以用断点来查看数据，也可以用println来显示输出，方便集成，对程序员友好。系统需要jdk1.8 以上的java环境，
     * 本人会把测试的输入输出都注释在这个文件里。及其傻瓜化的流程，方便商业化落地。
     * --罗瑶光
     * */
    @Test
    void doACAK() {
        //初始化
        String inputInitons = "EDVSDTUVSVSE";
        String stringAK; //碱变换 意思是 碱性元基改变 在某种浓度下变成酸 或者 碱衍生 物质，本函数不讨论。
        String stringAC; //酸变换 意思是 酸性元基改变 在某种浓度下变成碱 或者 酸衍生 物质，本函数不讨论。
        StringBuilder swapKeyAK = new StringBuilder();
        StringBuilder swapKeyAC = new StringBuilder();
        //int range = 100;
        //浓度 -0 趋近高浓度碱溶液， -100 趋近高浓度酸溶液，注意高浓度不是强碱强酸。别又钻我文字游戏空子。
        //浓度计算- 价值- 类似人类词汇的同义词 和 反义词 计算归纳。我以后注释会多打几个字。
        //强腐蚀环境变换
        swapKeyAK.delete(0, swapKeyAK.length());
        swapKeyAC.delete(0, swapKeyAC.length());
        stringAK = doAKACSwap(inputInitons, 99, swapKeyAK);
        stringAC = doAKACSwap(inputInitons, 1, swapKeyAC);
        System.out.println("输入的十六元基字符->" + inputInitons);
        System.out.println("浓度比值99:1");
        System.out.println("强酸浓度下PDE变换->" + stringAK);
        System.out.println("强酸浓度下改变概率->" + new String(swapKeyAK));
        System.out.println("强碱浓度下PDE变换->" + stringAC);
        System.out.println("强碱浓度下改变概率->" + new String(swapKeyAC));
        System.out.println();
        //弱腐蚀环境变换
        swapKeyAK.delete(0, swapKeyAK.length());
        swapKeyAC.delete(0, swapKeyAC.length());
        stringAK = doAKACSwap(inputInitons, 75, swapKeyAK);
        stringAC = doAKACSwap(inputInitons, 25, swapKeyAC);
        System.out.println("输入的十六元基字符->" + inputInitons);
        System.out.println("浓度比值75:25");
        System.out.println("强酸浓度下PDE变换->" + stringAK);
        System.out.println("强酸浓度下改变概率->" + new String(swapKeyAK));
        System.out.println("强碱浓度下PDE变换->" + stringAC);
        System.out.println("强碱浓度下改变概率->" + new String(swapKeyAC));
        System.out.println();
        //中性环境变换
        swapKeyAK.delete(0, swapKeyAK.length());
        swapKeyAC.delete(0, swapKeyAC.length());
        stringAK = doAKACSwap(inputInitons, 55, swapKeyAK);
        stringAC = doAKACSwap(inputInitons, 45, swapKeyAC);
        System.out.println("输入的十六元基字符->" + inputInitons);
        System.out.println("浓度比值55:45");
        System.out.println("强酸浓度下PDE变换->" + stringAK);
        System.out.println("强酸浓度下改变概率->" + swapKeyAK);
        System.out.println("强碱浓度下PDE变换->" + stringAC);
        System.out.println("强碱浓度下改变概率->" + new String(swapKeyAC));
        System.out.println();
        //输出
        //Connected to the target VM, address: '127.0.0.1:54924', transport: 'socket'
        //输入的十六元基字符->EDVSDTUVSVSE
        //浓度比值99:1
        //强酸浓度下PDE变换->EICEIPQCECEE
        //强酸浓度下改变概率->011111111110
        //强碱浓度下PDE变换->SDVSDAUVSVSS
        //强碱浓度下改变概率->100001000001
        //
        //输入的十六元基字符->EDVSDTUVSVSE
        //浓度比值75:25
        //强酸浓度下PDE变换->EICEDPQVSVES
        //强酸浓度下改变概率->011101100011
        //强碱浓度下PDE变换->SDVSIAUVSVSS
        //强碱浓度下改变概率->100011000001
        //
        //输入的十六元基字符->EDVSDTUVSVSE
        //浓度比值55:45
        //强酸浓度下PDE变换->SIVEIAQVEVSS
        //强酸浓度下改变概率->110111101001
        //强碱浓度下PDE变换->SICSIAUCSVSS
        //强碱浓度下改变概率->111011010001
        //
        //Disconnected from the target VM, address: '127.0.0.1:54924', transport: 'socket'
        //
        //Process finished with exit code 0
    }

    String doAKACSwap(String input, int range, StringBuilder swapKey) {
        String output = input.toString();
        char[] OIQ = new char[output.length()];
        for (int k = 0; k < input.length(); k++) {
            double tempRandom = Math.random() * 100;
            OIQ[k] = doACAK(input, k, tempRandom, range, swapKey);
        }
        return new String(OIQ);
    }

    //新增 T = V + HE; --page204
    //T = V + HE, 酸= C + E= P,  碱= V + S= A
    //新增 X = V + HC; --page204
    //X = V + HC, 酸= C + C= C,  碱= V + V= V

    //A= V + S, 酸= C + E= P,  碱= V + S= A
    //O= E + S, 酸= E + E= E,  碱= V + S= A
    //P= E + C, 酸= E + C= P,  碱= S + V= A
    //M= C + S, 酸= C + E= P,  碱= V + S= A
    //F= E+  C + S, 酸= H,  碱= V //这里F有问题，我是最简化，别被我误导。面对其他工程，可酌情修改。
    public static char doACAK(String IDUQ, int k, double tempRandom
        , int VECS, StringBuilder swapKey) {
        if (IDUQ.charAt(k) == 'T') {//新增 --page204
            if (tempRandom < VECS) {
                swapKey.append(1);
                return 'P';
            } else {
                swapKey.append(1);
                return 'A';
            }
        } else if (IDUQ.charAt(k) == 'X') {//新增 --page204
            if (tempRandom < VECS) {
                swapKey.append(1);
                return 'C';
            } else {
                swapKey.append(1);
                return 'V';
            }
        } else if (IDUQ.charAt(k) == 'U') {//g
            if (tempRandom < VECS) {
                swapKey.append(1);
                return 'Q';
            } else {
                swapKey.append(0);
                return 'U';
            }
        } else if (IDUQ.charAt(k) == 'Q') {//s
            if (tempRandom < VECS) {
                swapKey.append(0);
                return 'Q';
            } else {
                swapKey.append(1);
                return 'U';
            }
        } else if (IDUQ.charAt(k) == 'I') {//s
            if (tempRandom < VECS) {
                swapKey.append(0);
                return 'I';
            } else {
                swapKey.append(1);
                return 'D';
            }
        } else if (IDUQ.charAt(k) == 'D') {//g
            if (tempRandom < VECS) {
                swapKey.append(1);
                return 'I';
            } else {
                swapKey.append(0);
                return 'D';
            }
        } else if (IDUQ.charAt(k) == 'V') {//U   //DIUQ
            if (tempRandom < VECS) {//SEVC 相对应
                swapKey.append(1);
                return 'C';
            } else {
                swapKey.append(0);
                return 'V';
            }
        } else if (IDUQ.charAt(k) == 'E') {//I
            if (tempRandom < VECS) {
                swapKey.append(0);
                return 'E';
            } else {
                swapKey.append(1);
                return 'S';
            }
        } else if (IDUQ.charAt(k) == 'C') {//Q
            if (tempRandom < VECS) {
                swapKey.append(0);
                return 'C';
            } else {
                swapKey.append(1);
                return 'V';
            }
        } else if (IDUQ.charAt(k) == 'S') {//D
            if (tempRandom < VECS) {
                swapKey.append(1);
                return 'E';
            } else {
                swapKey.append(0);
                return 'S';
            }
        } else if (IDUQ.charAt(k) == 'A') {
            if (tempRandom < VECS) {
                swapKey.append(1);
                return 'P';
            } else {
                swapKey.append(0);
                return 'A';
            }
        } else if (IDUQ.charAt(k) == 'O') {
            if (tempRandom < VECS) {
                swapKey.append(1);
                return 'E';
            } else {
                swapKey.append(1);
                return 'A';
            }
        } else if (IDUQ.charAt(k) == 'P') {
            if (tempRandom < VECS) {
                swapKey.append(0);
                return 'P';
            } else {
                swapKey.append(1);
                return 'A';
            }
        } else if (IDUQ.charAt(k) == 'M') {
            if (tempRandom < VECS) {
                swapKey.append(1);
                return 'P';
            } else {
                swapKey.append(1);
                return 'A';
            }
        } else if (IDUQ.charAt(k) == 'F') {
            if (tempRandom < VECS) {
                swapKey.append(1);
                return 'H';
            } else {
                swapKey.append(1);
                return 'V';
            }
        } else {
            swapKey.append(0);
            return IDUQ.charAt(k);
        }
    }

    @Test
    void IOE() {
    }

    @Test
    void IPE_AOPM_VECS_IDUQ_TXH() {
    }

    @Test
    void IPE_AOPM_VECS_IDUQ_TXH_AC() {
    }

    @Test
    void IPE() {
    }

    @Test
    void QPE() {
    }

    @Test
    void injectPDI() {
    }

    @Test
    void PDSEncode() {
    }

    @Test
    void PDS_OEC_IID() {
    }

    @Test
    void PDS_P_USQ_ECP() {
    }

    @Test
    void PDS_P_USQ_ECP_I_17() {
    }

    @Test
    void PDS_P_USQ_ECP_I_17_S_() {
    }

    @Test
    void ESU_M_SVQ_PDS_OEU() {
    }

    @Test
    void ESU_ECS_SVQ_PDS_OEU() {
    }

    @Test
    void ESU_P_SVQ_PDS_OEU() {
    }

    @Test
    void ESU_P_SEQ_PDS_OEU() {
    }

    @Test
    void EUP_QD_PQI() {
    }

    @Test
    void EUP_QD_PQU() {
    }

    @Test
    void ESU_M_SVQ_PDS_OEU_M() {
    }

    @Test
    void ESU_M_SVQ_PDS_OEU_P() {
    }

    @Test
    void ESU_M_SVQ_PDS_OEU_O() {
    }

    @Test
    void ESU_M_SVQ_PDS_OEU_A() {
    }

    @Test
    void ESU_M_SVQ_PDS_OEU_OA() {
    }
}