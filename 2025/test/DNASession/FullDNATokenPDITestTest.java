package test.java.InterfaceTest.DNASession;

import org.junit.jupiter.api.Test;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 *  （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段 208号 阳光家园别墅小区 第十栋别墅
 * */
class FullDNATokenPDITestTest {
    /*
     * 这个函数用于寻找不同酸碱浓度下可能存在的PDE变换，寻找最短的元基编码字符串浓缩结果。
     * 适用于肽计算中 元基编码 后的 密码缩进，词汇提示，长篇语言总结，深度文本分析。
     * PDS-PDI 很多人不知道肽展公式PDE怎么广泛运用，我就多举几把测试DEMO例子先。
     **/
    ////#### 元基数字= 元基符号= 肽展公式元基数字变换= (肽概率展开数字逻辑集合)
    //    //#### 1位 ##### E= I= I=(I)
    //    //##### F= U= I++ OR Q--=(I, Q)
    //    //##### G= Q= Q=(Q)
    //    //#### 1~2位
    //    //##### 0= D= DD=(D, DD)
    //    //#### 2位
    //    //##### 1= C= DI=(DI)
    //    //##### 3= E= IU, DU=(IU, DU)
    //    //##### D= V= UQ=(UQ)
    //    //##### 9= S= QI=(QI)
    //    //#### 2~4位
    //    //##### 4= H= (IU, DU) OR DI=(IU, DU, DI) OR (IUDI, DUDI)
    //    //#### 4位
    //    //##### 2= P= (IU, DU) + DI=(IUDI, DUDI)
    //    //##### A= O= (IU, DU) + QI=(IUQI, DUQI)
    //    //##### 7= A= UQQI=(UQQI)
    //    //#### 4~6位
    //    //##### 5= HC-= ((IU, DU) OR DI) + DI=(IUDI, DUDI, DIDI) OR (IUDIDI, DUDIDI)
    //    //##### B= HE+= ((IU, DU) OR DI) + (IU, DU)=(IUIU, IUDU, DUIU, DUDU, DIIU, DIDU)
    //    //OR (IUDIIU, IUDIDU, DUDIIU, DUDIDU)
    //    //#### 6~8位
    //    //##### 8= M= ((IU, DU) OR DI) + DI + QI=(IUDIQI, DUDIQI, DIDIQI) OR (IUDIDIQI, DUDIDIQI)
    //    //##### 6= X= UQ + ((IU, DU) OR DI) + DI=(UQIUDI, UQDUDI, UQDIDI) OR (UQIUDIDI, UQDUDIDI)
    //    //##### C= T= UQ + ((IU, DU) OR DI) + (IU, DU)=(UQIUIU, UQIUDU, UQDUIU, UQDUDU
    //    //, UQDIIU, UQDIDU) OR (UQIUDIIU, UQIUDIDU, UQDUDIIU, UQDUDIDU)
    @Test
    void test() {
        String inputInitons = "EDVSDTUVSVSE";
        this.main(inputInitons);
        String inputInitons1 = "EDVSDTUVSVSEA";
        this.main(inputInitons1);
        String inputInitons2 = "EDVSDTUVSQVSQE";
        this.main(inputInitons2);
        String inputInitons3 = "EDVSDTUVSQVSQEA";
        this.main(inputInitons3);
        String inputInitons4 = "EDVSDTUVSQIVSQIE";
        this.main(inputInitons4);
        String inputInitons5 = "EDVSDTUVSQIVSQIEA";
        this.main(inputInitons5);
        String inputInitons6 = "EDVSDTUVSQIVSQIEAU";
        this.main(inputInitons6);
    }

    void main(String inputInitons) {
        //String inputInitons = "AOAOPPPPPPMVMEEECSIIDUQDUQTXHFTXHFFFFFF";
        //String inputInitons = "EDVSDTUVSQVSQEA";
        //String inputInitons ="VMECSIDUQDUQTXH";
        String beforeLoopInitons = inputInitons;
        System.out.println("输入char->" + beforeLoopInitons);
        beforeLoopInitons = duplication1(inputInitons);
        //计算
        System.out.println("简单去重单char->" + beforeLoopInitons);
        beforeLoopInitons = duplication2(beforeLoopInitons, 2);
        //计算
        System.out.println("简单去重双char->" + beforeLoopInitons);
        beforeLoopInitons = duplication2(beforeLoopInitons, 3);
        //计算
        System.out.println("简单去重3char->" + beforeLoopInitons);
        beforeLoopInitons = duplication2(beforeLoopInitons, 4);
        //计算
        System.out.println("简单去重4char，可loop->" + beforeLoopInitons);

        //PDS丝化降元 A = VS， O = ES， P = EC，M = CS，
        beforeLoopInitons = beforeLoopInitons.replace("A", "VS");
        beforeLoopInitons = beforeLoopInitons.replace("O", "ES");
        beforeLoopInitons = beforeLoopInitons.replace("P", "EC");
        beforeLoopInitons = beforeLoopInitons.replace("M", "CS");
//
        beforeLoopInitons = beforeLoopInitons.replace("T", "VE");//page 168
        beforeLoopInitons = beforeLoopInitons.replace("X", "VC");
        beforeLoopInitons = beforeLoopInitons.replace("H", "H");//HC HE 等同于P这里忽略先。
        beforeLoopInitons = beforeLoopInitons.replace("F", "ECS");
        System.out.println("简单PDS AOPM-VPCS->" + beforeLoopInitons);
        //PDI浓缩增元 , 不考虑酸，
        beforeLoopInitons = beforeLoopInitons.replace("V", "UQ");
        beforeLoopInitons = beforeLoopInitons.replace("E", "DU");
        beforeLoopInitons = beforeLoopInitons.replace("C", "DI");
        beforeLoopInitons = beforeLoopInitons.replace("S", "QI");
        System.out.println("简单PDS VPCS-IDUQ->" + beforeLoopInitons);
        //PDI 很多人不知道肽展公式PDE怎么广泛运用，我就多举几把测试DEMO例子先。
        beforeLoopInitons = beforeLoopInitons.replace("UQ", "V");
        beforeLoopInitons = beforeLoopInitons.replace("QU", "V");
        beforeLoopInitons = beforeLoopInitons.replace("DU", "E");
        beforeLoopInitons = beforeLoopInitons.replace("UD", "E");
        beforeLoopInitons = beforeLoopInitons.replace("DI", "C");
        beforeLoopInitons = beforeLoopInitons.replace("ID", "C");
        beforeLoopInitons = beforeLoopInitons.replace("QI", "S");
        beforeLoopInitons = beforeLoopInitons.replace("IQ", "S");
        System.out.println("简单PDI IDUQ-VECS->" + beforeLoopInitons);
        //
        beforeLoopInitons = beforeLoopInitons.replace("VS", "A");
        beforeLoopInitons = beforeLoopInitons.replace("SV", "A");
        beforeLoopInitons = beforeLoopInitons.replace("ES", "O");
        beforeLoopInitons = beforeLoopInitons.replace("SE", "O");
        beforeLoopInitons = beforeLoopInitons.replace("EC", "P");
        beforeLoopInitons = beforeLoopInitons.replace("CE", "P");
        beforeLoopInitons = beforeLoopInitons.replace("CS", "M");
        beforeLoopInitons = beforeLoopInitons.replace("SC", "M");
        //
        beforeLoopInitons = beforeLoopInitons.replace("VE", "T");
        beforeLoopInitons = beforeLoopInitons.replace("EV", "T");
        beforeLoopInitons = beforeLoopInitons.replace("VC", "X");
        beforeLoopInitons = beforeLoopInitons.replace("CV", "X");
        beforeLoopInitons = beforeLoopInitons.replace("HE", "H");//H 活性价值
        beforeLoopInitons = beforeLoopInitons.replace("EH", "H");
        beforeLoopInitons = beforeLoopInitons.replace("HC", "H");
        beforeLoopInitons = beforeLoopInitons.replace("CH", "H");
        beforeLoopInitons = beforeLoopInitons.replace("ECS", "F");//F 活性价值
        beforeLoopInitons = beforeLoopInitons.replace("ESC", "F");
        beforeLoopInitons = beforeLoopInitons.replace("CES", "F");
        beforeLoopInitons = beforeLoopInitons.replace("CSE", "F");
        beforeLoopInitons = beforeLoopInitons.replace("SEC", "F");
        beforeLoopInitons = beforeLoopInitons.replace("SCE", "F");
        System.out.println("简单PDI VECS-AOPM->" + beforeLoopInitons);
        //输出
        //Connected to the target VM, address: '127.0.0.1:51839', transport: 'socket'
        //输入char->AOAOPPPPPPMVMEEECSIIDUQDUQTXHFTXHFFFFFF
        //简单去重单char->AOAOPMVMECSIDUQDUQTXHFTXHF
        //简单去重双char->AOPMVMECSIDUQDUQTXHFTXHF
        //简单去重3char->AOPMVMECSIDUQTXHFTXHF
        //简单去重4char，可loop->AOPMVMECSIDUQTXHF
        //简单PDS AOPM-VPCS->VSESECCSVCSECSIDUQVEVCECS
        //简单PDS VPCS-IDUQ->UQQIDUQIDUDIDIQIUQDIQIDUDIQIIDUQUQDUUQDIDUDIQI
        //简单PDI IDUQ-VECS->VQCVIECCSVCSECSCVVEVCECS
        //简单PDI VECS-AOPM->VQXIPCACOMXTXPS
        //Disconnected from the target VM, address: '127.0.0.1:51839', transport: 'socket'

        //*************
        // "AOAOPPPPPPMVMEEECSIIDUQDUQTXHFTXHFFFFFF" 的浓缩 PDW 结果 为VQXIPCACOMXTXPS
        //*************
        //

        //Process finished with exit code 0
        ///Library/Java/JavaVirtualMachines/jdk-11.jdk/Contents/Home/bin/java
        // -agentlib:jdwp=transport=dt_socket, address=127.0.0.1:51769, suspend=y, server=n
        // -ea -Djava.library.path=/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib
        // -Didea.test.cyclic.buffer.size=1048576
        // -javaagent:/Users/luoyaoguang430181198505250014/Library/Caches/JetBrains/IdeaIC2022.
        // 3/captureAgent/debugger-agent.jar -Dfile.encoding=UTF-8
        // -classpath /Users/luoyaoguang430181198505250014/.
        // m2/repository/org/junit/platform/junit-platform-launcher/1.8.1/junit-platform-launcher-1.8.1.jar:
        // /Users/luoyaoguang430181198505250014/.m2/repository/org/junit/platform/
        // junit-platform-engine/1.8.1/junit-platform-engine-1.8.1.jar:
        // /Users/luoyaoguang430181198505250014/.m2/repository/org/opentest4j/opentest4j/
        // 1.2.0/opentest4j-1.2.0.jar:/Users/luoyaoguang430181198505250014/
        // .m2/repository/org/junit/platform/junit-platform-commons/1.8.1/
        // junit-platform-commons-1.8.1.jar:/Users/luoyaoguang430181198505250014/
        // .m2/repository/org/apiguardian/apiguardian-api/1.1.2/apiguardian-api-1.1.2.jar:
        // /Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar:/Applications/Intelli
        // J IDEA CE.app/Contents/plugins/junit/lib/junit5-rt.jar:/Applications/IntelliJ I
        // DEA CE.app/Contents/plugins/junit/lib/junit-rt.jar:/Users/luoyaoguang43018119850
        // 5250014/Desktop/YLJHRJ/project/TinOS/out/test/TinOS:/Users/luoyaoguang43018119
        // 8505250014/Desktop/YLJHRJ/project/TinOS/out/production/TinOS:/Users/luoyaoguang43
        // 0181198505250014/Desktop/YLJHRJ/project/TinOS/lib/cw.jar:/Users/luoyaoguang430181
        // 198505250014/Desktop/YLJHRJ/project/TinOS/lib/bssm.jar:/Users/luoyaoguang43018119
        // 8505250014/Desktop/YLJHRJ/project/TinOS/lib/icam.jar:/Users/luoyaoguang43018119850
        // 5250014/Desktop/YLJHRJ/project/TinOS/lib/weka.jar:/Users/luoyaoguang43018119850525
        // 0014/Desktop/YLJHRJ/project/TinOS/lib/en_us.jar:/Users/luoyaoguang4301811985052500
        // 14/Desktop/YLJHRJ/project/TinOS/lib/jacob.jar:/Users/luoyaoguang43018119850525001
        // 4/Desktop/YLJHRJ/project/TinOS/lib/junit.jar:/Users/luoyaoguang430181198505250014
        // /Desktop/YLJHRJ/project/TinOS/lib/sound.jar:/Users/luoyaoguang430181198505250014
        // /Desktop/YLJHRJ/project/TinOS/lib/cmulex.jar:/Users/luoyaoguang430181198505250014/
        // Desktop/YLJHRJ/project/TinOS/lib/ffmpeg.jar:/Users/luoyaoguang430181198505250014/
        // Desktop/YLJHRJ/project/TinOS/lib/mbrola.jar:/Users/luoyaoguang430181198505250014/D
        // esktop/YLJHRJ/project/TinOS/lib/cworker.jar:/Users/luoyaoguang430181198505250014/D
        // esktop/YLJHRJ/project/TinOS/lib/freetts.jar:/Users/luoyaoguang430181198505250014/De
        // sktop/YLJHRJ/project/TinOS/lib/cmudict04.jar:/Users/luoyaoguang430181198505250014/D
        // esktop/YLJHRJ/project/TinOS/lib/flandmark.jar:/Users/luoyaoguang43018119850525001
        // 4/Desktop/YLJHRJ/project/TinOS/lib/libdc1394.jar:/Users/luoyaoguang430181198505250
        // 014/Desktop/YLJHRJ/project/TinOS/lib/poi-5.2.3.jar:/Users/luoyaoguang430181198505250
        // 014/Desktop/YLJHRJ/project/TinOS/lib/cmu_us_kal.jar:/Users/luoyaoguang4301811985052
        // 50014/Desktop/YLJHRJ/project/TinOS/lib/cmutimelex.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/customizer.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/flycapture.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/gson-2.2.4.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/videoinput.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/YLJHRJ3PT2.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/iText-2.1.5.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/javabuilder.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/libfreenect.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/mediaplayer.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/multiplayer.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/cmu_time_awb.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/javacv-1.5.8.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/jogl.obj.rc8.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/jython-2.7.2.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/librealsense.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/artoolkitplus.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/javacpp-1.5.8.jar:/Users/luoyaoguang430181
        // 198505250014/Desktop/YLJHRJ/project/TinOS/lib/json-20160810.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/mediaplayer_2.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/multiplayer_2.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/swtgraphics2d.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/jcommon-1.0.16.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/xmlbeans-5.1.1.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/ffmpeg-platform.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/freetts-jsapi10.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/poi-ooxml-5.2.3.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/commons-math-2.1.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/log4j-api-2.18.0.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/opencv-linux-x86.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/opentest4j-1.2.0.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/commons-io-2.11.0.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/commons-math3-3.0.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/jfreechart-1.0.13.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/jmock-cglib-1.2.0.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/log4j-core-2.18.0.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/ffmpeg-5.1.2-1.5.8.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/ffmpeg-windows-x86.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/flandmark-1.07-1.3.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/projec
        // t/TinOS/lib/flandmark-platform.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/libdc1394-platform.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/opencv-4.6.0-1.5.8.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/opencv-android-arm.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/opencv-android-x86.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/opencv-linux-armhf.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/opencv-windows-x86.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/flandmark-linux-x86.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/flycapture-platform.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/junit-jupiter-5.8.1.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/libdc1394-2.2.4-1.3.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/libdc1394-linux-x86.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/mockito-all-1.10.19.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/mockito-core-5.12.0.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/opencv-linux-x86_64.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/videoinput-platform.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/ffmpeg-macosx-x86_64.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/flycapture-linux-x86.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/libfreenect-platform.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/opencv-linux-ppc64le.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/opencv-macosx-x86_64.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/poi-ooxml-full-5.2.3.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHR
        // J/project/TinOS/lib/videoinput-0.200-1.3.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/apiguardian-api-1.1.2.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/commons-compress-1.21.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/ffmpeg-windows-x86_64.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/flandmark-android-arm.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/flandmark-android-x86.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/flandmark-linux-armhf.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/flandmark-windows-x86.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/javacv-platform-1.5.8.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/jfreechart-1.0.13-swt.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/libdc1394-linux-armhf.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/libdc1394-windows-x86.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/libfreenect-linux-x86.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/librealsense-platform.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/openblas-0.3.21-1.5.8.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/opencv-windows-x86_64.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/artoolkitplus-platform.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/flandmark-linux-x86_64.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/flycapture-linux-armhf.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/flycapture-windows-x86.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/javacpp-platform-1.5.8.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/libdc1394-linux-x86_64.jar:/Users/luoyaoguang43018
        // 1198505250014/Desktop/YLJHRJ/project/TinOS/lib/librealsense-1.9.6-1.3.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/librealsense-linux-x86.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/videoinput-windows-x86.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/artoolkitplus-2.3.1-1.3.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/artoolkitplus-linux-x86.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/flandmark-linux-ppc64le.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/flandmark-macosx-x86_64.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/flycapture-2.9.3.43-1.3.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/flycapture-linux-x86_64.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/junit-jupiter-api-5.8.1.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/libdc1394-linux-ppc64le.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/libdc1394-macosx-x86_64.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/libfreenect-linux-armhf.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/libfreenect-windows-x86.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/poi-ooxml-schemas-4.1.2.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/commons-collections4-4.4.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/flandmark-windows-x86_64.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/libdc1394-windows-x86_64.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/libfreenect-linux-x86_64.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/opentest4j-1.2.0-javadoc.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/opentest4j-1.2.0-sources.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/artoolkitplus-android-arm.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/artoolkitplus-android-x86.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/artoolkitplus-linux-armhf.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/artoolkitplus-windows-x86.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/ffmpeg-platform-3.2.1-1.3.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/ffmpeg-platform-5.0-1.5.7.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/flycapture-windows-x86_64.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/gluegen-2.4.0-rc-20230201.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/libfreenect-linux-ppc64le.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/libfreenect-macosx-x86_64.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/librealsense-linux-x86_64.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/videoinput-windows-x86_64.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/artoolkitplus-linux-x86_64.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/javacpp-1.5.8-macosx-arm64.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/jogl-all-2.4.0-rc-20230201.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/junit-jupiter-engine-5.8.1.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/junit-jupiter-params-5.8.1.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/libfreenect-windows-x86_64.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/artoolkitplus-linux-ppc64le.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/artoolkitplus-macosx-x86_64.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/ffmpeg-platform-5.1.2-1.5.8.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/flandmark-platform-1.07-1.3.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/junit-jupiter-5.8.1-javadoc.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/junit-jupiter-5.8.1-sources.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/junit-platform-engine-1.8.1.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/opencv-platform-4.6.0-1.5.8.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/artoolkitplus-windows-x86_64.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/gluegen-rt-2.4.0-rc-20230201.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/junit-platform-commons-1.8.1.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/libdc1394-platform-2.2.4-1.3.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/apiguardian-api-1.1.2-javadoc.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/apiguardian-api-1.1.2-sources.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/videoinput-platform-0.200-1.3.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/jfreechart-1.0.13-experimental.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/libfreenect-platform-0.5.3-1.3.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/openblas-platform-0.3.21-1.5.8.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/ffmpeg-3.2.1-1.3-windows-x86_64.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/jogl-all-main-2.4.0-rc-20230201.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/junit-jupiter-api-5.8.1-javadoc.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/junit-jupiter-api-5.8.1-sources.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/librealsense-platform-1.9.6-1.3.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/opencv-4.6.0-1.5.8-macosx-arm64.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/flycapture-platform-2.9.3.43-1.3.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/gluegen-rt-main-2.4.0-rc-20230201.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/junit-jupiter-engine-5.8.1-javadoc.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/junit-jupiter-engine-5.8.1-sources.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/junit-jupiter-params-5.8.1-javadoc.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/junit-jupiter-params-5.8.1-sources.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/openblas-0.3.21-1.5.8-macosx-arm64.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/junit-platform-engine-1.8.1-javadoc.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/junit-platform-engine-1.8.1-sources.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/junit-platform-commons-1.8.1-javadoc.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/junit-platform-commons-1.8.1-sources.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/flycapture-2.9.3.43-1.3-windows-x86_64.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/jogl-all-2.4.0-rc-20230201-natives-macosx-universal.jar:/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/lib/gluegen-rt-2.4.0-rc-20230201-natives-macosx-universal.jar com.intellij.rt.junit.JUnitStarter -ideVersion5 -junit5 test.java.InterfaceTest.DNASession.FullDNATokenPDITestTest, main

        //Disconnected from the target VM, address: '127.0.0.1:51769', transport: 'socket'
        //
        //Process finished with exit code 0

    }

    private String duplication1(String inputInitons) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = inputInitons.toCharArray();
        Here:
        for (int i = 0; i < chars.length; i++) {
            stringBuilder.append(chars[i]);
            for (int j = i; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    i = j;
                } else {
                    continue Here;
                }
            }
        }
        return stringBuilder.toString();
    }

    private String duplication2(String inputInitons, int compare) {
        StringBuilder stringBuilder = new StringBuilder();
        //
        StringBuilder stringBuilderOrdinary = new StringBuilder();
        StringBuilder stringBuilderCompare = new StringBuilder();
        //
        char[] chars = inputInitons.toCharArray();
        boolean hasTail = true;
        int i = 0;
        Here:
        for (i = 0; i < chars.length; i++) {
            //录入开始
            stringBuilderOrdinary.delete(0, stringBuilderOrdinary.length());
            stringBuilderCompare.delete(0, stringBuilderCompare.length());
            for (int j = i; j < i + compare && j < chars.length; j++) {
                stringBuilderOrdinary.append(chars[j]);
            }
            int l = 0;//过滤观测。
            int find = 0;
            //等差比较
            for (int j = i + compare; j < chars.length; j += compare) {
                for (int k = j; k < j + compare && k < chars.length; k++) {
                    stringBuilderCompare.append(chars[k]);
                }
                if (stringBuilderOrdinary.toString().equals(stringBuilderCompare.toString())) {
                    if (l++ < 1) {//过滤重复加。
                        stringBuilder.append(stringBuilderCompare);
                        find = 1;
                    }
                    j += compare;
                    i += compare + (compare - 1);
                    if (j > chars.length - compare) {//观测 尾差 数
                        hasTail = false;
                    }
                } else {
                    if (l < 1) {
                        stringBuilder.append(chars[i]);
                        find = 1;
                    }
                    continue Here;
                }
            }
            if (0 == find) {//条件与非条件综合补充尾差
                stringBuilder.append(chars[i]);
            }
        }
//        if (hasTail) {//条件补充尾差
//            for (int o = 0; o < compare; o++) {
//                stringBuilder.append(chars[chars.length - (compare - o)]);
//            }
//        }
//        else {
//            if (i <= chars.length) {//非条件补充尾差
//                for (int p = i-compare+(compare); p < chars.length; p++) {
//                    stringBuilder.append(chars[p]);
//                }
//            }
//        }
        return stringBuilder.toString();
    }
}