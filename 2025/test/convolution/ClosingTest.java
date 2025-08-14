package test.java.InterfaceTest.convolution;

import P.image.Closing;
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
/*
 * 这是一个 二维临近坐标的缩减计算算法 如图片像素计算 测试main函数demo的test版本，在导入了api之后进行系统集成，然后
 * 用下面的对应的函数中源码逻辑进行复制粘贴到工程中，直接运行，即可出结果，源码的逻辑按照输入准备计算的参数，
 * 然后执行，然后获取输出需要的结果，可以用断点来查看数据，也可以用println来显示输出，方便集成，对程序员友好。
 * 系统需要jdk1.8 以上的java环境，本人会把测试的输入输出都注释在这个文件里。及其傻瓜化的流程，方便商业化落地。
 * --罗瑶光
 * */
class ClosingTest {

    @Test
    void p() {
        //init
        int[][] input = new int[16][16];
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                input[i][j] = ((int) (Math.random() * 10000)) % 255;
            }
        }
        //exe Closing，商业价值用于数值特征在区间中的腐蚀缩减。 refer思想：ComputerVision 绿皮书
        //exe Opening，商业价值用于数值特征在区间中的蔓延扩展。 refer思想：ComputerVision 绿皮书
        //dia和ero序列化在Closing和Opening中同时做可以平均化离散精度。 refer思想：RenHart
        int[][] kernel = new int[3][3];
        kernel[0][1] = 1;
        kernel[1][0] = 1;
        kernel[1][2] = 1;
        kernel[2][1] = 1;
        int[][] output = Closing.P(input, kernel);
        //output
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                System.out.print("-" + output[i][j]);
            }
            System.out.println();
        }
    }
}