package test.java.InterfaceTest.coordinatesTracement;

import P_V.PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
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
class DemoCoordsAllTest {

    @Test
    void testBoot() {
        List<AMV_MVS_VSQ_2D> inputs = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            AMV_MVS_VSQ_2D position = new AMV_MVS_VSQ_2D();
            double x = Math.random() * 100;
            double y = Math.random() * 100;
            position.I_X((int) x);
            position.I_Y((int) y);
            inputs.add(position);
        }
        System.out.println("//处理Distance_X_findPascalMeanDistanceByEachPositions2D");
        DemoCoordsTest._E(inputs);
        System.out.println("//处理 side end SideEnd_X_getSideEnd2D");
        DemoCoords1Test._E_(inputs);
        System.out.println("//处理fissile Fissile_X_fissilePosition2D");
        DemoCoords2Test._E(inputs);
        System.out.println("//处理处理商旅森林 isolation Forest_X_getTSPForestIsolationGroups2D");
        DemoCoords3Test._E(inputs);
        System.out.println("//处理商旅簇 isolation Isolation_X_getTSPIsolationGroups2D");
        DemoCoords4Test._E(inputs);
        System.out.println("//处理fusion 先 fissile 采样 Fissile_X_fissilePosition2D");
        DemoCoords5Test._E(inputs);
        System.out.println("//处理fusion 先 fissile 采样 然后fusion 1 观测heart Euclid_X_findHeartPosition2D");
        DemoCoords6Test._E(inputs);
        System.out.println("//处理fusion 先 fissile 采样 然后fusion 1 观测heart 再 Fusion_X_fusionPosition2DwithHeart");
        DemoCoords7Test._E(inputs);
        System.out.println("//处理Classification Classification_X_addNewPositionWithoutHeart");
        DemoCoords8Test._E(inputs);
    }
}