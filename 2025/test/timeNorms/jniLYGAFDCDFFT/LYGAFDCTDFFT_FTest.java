package test.java.InterfaceTest.timeNorms.jniLYGAFDCDFFT;

import jniLYGAFDCDFFT.LYGAFDCTDFFT_F;
import org.junit.jupiter.api.Test;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
class LYGAFDCTDFFT_FTest {
    /*
     * 这是一个 时微分 时叠积 函数 在 主流滤波中 的 观测和优化 内积噪 方式 真实应用方式， 测试main函数demo的
     * test版本，在导入了api之后进行系统集成，然后
     * 用下面的对应的函数中源码逻辑进行复制粘贴到工程中，直接运行，即可出结果，源码的逻辑按照输入准备计算的参数，
     * 然后执行，然后获取输出需要的结果，可以用断点来查看数据，也可以用println来显示输出，方便集成，对程序员友好。
     * 系统需要jdk1.8 以上的java环境，本人会把测试的输入输出都注释在这个文件里。及其傻瓜化的流程，方便商业化落地。
     * --罗瑶光
     * */
    @Test
    void all() {
        System.out.println("罗瑶光时微分 时叠积 函数 在 主流滤波中 的 观测和优化 内积噪 方式 真实应用方式");
        //罗瑶光个人著作权文件 时量子解析公式 |tero(x)>+|tcol(x)> = (deta[t0-t1]/deta1(t0-t1)) * (m/p) = 1;
        //时量子解析公式 跟进解析推导 <76页纸 时流噪公式 N = e ** (i * Pi) +- 2cosAcosB；
        //时量子解析公式 跟进解析推导 <10页纸 时能公式 E = f[d] * f[d] * i * di * deta;
        //时量子解析公式 跟进解析推导 <3页纸 虚数公式 di= 1/（2 * 根号i）* sin(A - B);
        //其他这里略, 解析推导公式 永不展示，吸取我当年开源德塔分词的教训。单挑70万社会工程人。
        //公式测试
        //初始化 函数，非jni的普通java class
        LYGAFDCTDFFT_F lYGAFDCTDFFT_F = new LYGAFDCTDFFT_F();
        //初始化2维数组 input 为输入数组， out为之前保留的数据。rangeleft 为起始位置，滤数组中的巨大低频噪。
        float[] input = new float[32];
        LYGAFDCTDFFT_F.cp[] out = new LYGAFDCTDFFT_F.cp[32];
        for (int i = 0; i < 32; i++) {
            input[i] = (float) (Math.random() * 10000);
        }
        //虚构空间变换 时量子解析公式在 傅立叶计算中的 内积噪表达 (2 * out[j].ca * out[j].cb - 1) 观测
        //降维状态观测
        float[] fit = lYGAFDCTDFFT_F.jniLYGFIT(input, out, 4);
        //虚构时能 傅立叶计算中的 内积噪能 (2 * out[j].ca * out[j].cb - 1) 观测
        //降维状态观测 能量空间分解过程中 产生的 噪能观测。
        float[] ffn = lYGAFDCTDFFT_F.jniLYGFLTn(input, out, 4);
        //虚度时能 傅立叶计算中的 内积噪能 (2 * out[j].ca * out[j].cb - 1) 进行 l(f(n)) 变换为 l.f.n 加速观测
        //降维状态观测 极速观测
        float[] flt = lYGAFDCTDFFT_F.jniLYGFLT(input, out, 4);
        //薛定谔虚度漂移 傅立叶计算中的 内积噪能向量叠积 (2 * out[j].ca * out[j].cb - 1)
        //降维状态观测
        float[] fxet = lYGAFDCTDFFT_F.jniLYGFxET(input, out, 4);
        //时函数 傅立叶计算中的 内积噪能总能 (2 * out[j].ca * out[j].cb - 1) 进行 进行 l(f(n)) 变换为 l.f.n 后 复变空间分解，可修正 ffl 复变乘积参数。
        //增维观测 偏微分细化跟进计算
        float[] fflA = new float[input.length];
        float[] fflBI = new float[input.length];
        float[] ffl = lYGAFDCTDFFT_F.jniLYGFET(input, fflA, fflBI, out, 4);//trif later
        //输出
        System.out.println("--input");
        for (int i = 0; i < 32; i++) {
            System.out.print("--" + input[i]);
        }
        System.out.println("--");
        System.out.println("--虚构空间变换");
        for (int i = 0; i < 32; i++) {
            System.out.print("--" + fit[i]);
        }
        System.out.println("--");
        System.out.println("--虚构时能");
        for (int i = 0; i < 32; i++) {
            System.out.print("--" + ffn[i]);
        }
        System.out.println("--");
        System.out.println("--虚度时能");
        for (int i = 0; i < 32; i++) {
            System.out.print("--" + flt[i]);
        }
        System.out.println("--");
        System.out.println("--薛定谔虚度漂移");
        for (int i = 0; i < 32; i++) {
            System.out.print("--" + fxet[i]);
        }
        System.out.println("--");
        System.out.println("--时函数");
        for (int i = 0; i < 32; i++) {
            System.out.print("--" + ffl[i]);
        }
        System.out.println("--");
        System.out.println("--时函数 虚度分解A");
        for (int i = 0; i < 32; i++) {
            System.out.print("--" + fflA[i]);
        }
        System.out.println("--");
        System.out.println("--时函数 虚度分解BI");
        for (int i = 0; i < 32; i++) {
            System.out.print("--" + fflBI[i]);
        }
    }

    @Test
    void jniLYGAFDCTDFT() {
    }

    @Test
    void jniLYGAFDCTDFFT() {
    }

    @Test
    void jniLYGAFLDFT() {
    }

    @Test
    void jniLYGAFLOGDFT() {
    }

    @Test
    void logdftK() {
    }

    @Test
    void log3dftK() {
    }

    @Test
    void log3fftK() {
    }

    @Test
    void log2fftK() {
    }

    @Test
    void log3fft() {
    }

    @Test
    void log3ffdit() {
    }

    @Test
    void log3ffdot() {
    }

    @Test
    void jniLYGFFT() {
    }

    @Test
    void jniLYGFIT() {
    }

    @Test
    void jniLYGFLT() {
    }

    @Test
    void jniLYGFLLT() {
    }

    @Test
    void jniLYGFET() {
    }

    @Test
    void testJniLYGFET() {
    }

    @Test
    void jniLYGFILT() {
    }

    @Test
    void jniLYGFLTn() {
    }

    @Test
    void jniLYGFLTln() {
    }

    @Test
    void jniLYGFxET() {
    }

    @Test
    void initk() {
    }

    @Test
    void log3etime() {
    }

    @Test
    void jniLYGPDN() {
    }
}