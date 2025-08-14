package test.java.InterfaceTest.coordinatesTracement;

import ASQ.classification.fissile.Fissile_X_fissilePosition2D;
import ASQ.euclid.Euclid_X_findHeartPosition2D;
import ASQ.find.mean.Distance_X_findPascalMeanDistanceByEachPositions2D;
import P_V.PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import org.junit.jupiter.api.Test;

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
/*
 * 这是一个 处理fusion 先 fissile 采样 然后fusion 1 观测heart Euclid_X_findHeartPosition2D 测试main函数demo的test版本，在导入了api之后进行系统集成，然后
 * 用下面的对应的函数中源码逻辑进行复制粘贴到工程中，直接运行，即可出结果，源码的逻辑按照输入准备计算的参数，
 * 然后执行，然后获取输出需要的结果，可以用断点来查看数据，也可以用println来显示输出，方便集成，对程序员友好。
 * 系统需要jdk1.8 以上的java环境，本人会把测试的输入输出都注释在这个文件里。及其傻瓜化的流程，方便商业化落地。
 * --罗瑶光
 * */
@SuppressWarnings("unused")
public class DemoCoords6Test {
    @Test
    public static void main(String[] argv) {
        //初始10个坐标
        List<AMV_MVS_VSQ_2D> input = new ArrayList<>();
        AMV_MVS_VSQ_2D position2D = new AMV_MVS_VSQ_2D();
        position2D.I_X(0);
        position2D.I_Y(0);
        input.add(position2D);

        AMV_MVS_VSQ_2D position2D1 = new AMV_MVS_VSQ_2D();
        position2D1.I_X(12);
        position2D1.I_Y(12);
        input.add(position2D1);

        AMV_MVS_VSQ_2D position2D2 = new AMV_MVS_VSQ_2D();
        position2D2.I_X(0);
        position2D2.I_Y(12);
        input.add(position2D2);

        AMV_MVS_VSQ_2D position2D3 = new AMV_MVS_VSQ_2D();
        position2D3.I_X(12);
        position2D3.I_Y(0);
        input.add(position2D3);

        AMV_MVS_VSQ_2D position2D4 = new AMV_MVS_VSQ_2D();
        position2D4.I_X(5);
        position2D4.I_Y(5);
        input.add(position2D4);

//
        //处理fusion 先 fissile 采样
        Map<Double, List<AMV_MVS_VSQ_2D>> output = Fissile_X_fissilePosition2D._E(input, 13);
        Iterator<Double> iterator = output.keySet().iterator();
        while (iterator.hasNext()) {
            double temp = iterator.next();
            System.out.println();
            System.out.println(temp);
            Iterator<AMV_MVS_VSQ_2D> iterator1 = output.get(temp).iterator();
            while (iterator1.hasNext()) {
                AMV_MVS_VSQ_2D temp1 = iterator1.next();
                System.out.println(temp1.getX() + ":" + temp1.getY());
            }
        }
//		//然后fusion 1 观测heart
        Map<Double, AMV_MVS_VSQ_2D> groupsHeart = new HashMap<>();
        Iterator<Double> iterator2 = output.keySet().iterator();
        while (iterator2.hasNext()) {
            double temp = iterator2.next();
            AMV_MVS_VSQ_2D heartTemp = Euclid_X_findHeartPosition2D._E(output.get(temp));
            System.out.println("hearts->" + heartTemp.getX() + ":" + heartTemp.getY());
            groupsHeart.put(temp, heartTemp);
        }
//		//2观测结果 用10 和11分别带入可测试。
//		Map<Double, List<AMV_MVS_VSQ_2D>> fusion= Fusion.fusionAMV_MVS_VSQ_2DwithHeart(output, groupsHeart, 11);
//		Iterator<Double> iterator3= fusion.keySet().iterator();
//		while(iterator3.hasNext()) {
//			double temp= iterator3.next();
//			System.out.println();
//			System.out.println(temp);
//			Iterator<AMV_MVS_VSQ_2D> iterator1= output.get(temp).iterator();
//			while(iterator1.hasNext()) {
//				AMV_MVS_VSQ_2D temp1= iterator1.next();
//				System.out.println(temp1.getX()+ ":"+ temp1.getY());
//			}	
//		}
        //
//		AMV_MVS_VSQ_2D position2D5= new AMV_MVS_VSQ_2D();
//		position2D5.I_X(15);
//		position2D5.I_Y(25);
//	
//		Map<Double, List<AMV_MVS_VSQ_2D>>inputMap= new HashMap<>();
//		inputMap.put(0.0, input);
//		Map<Double, List<AMV_MVS_VSQ_2D>>output= PositionClasification.addNewPositionWithoutHeart(inputMap, position2D5, 29);//采样距离28.4
//		
//		Iterator<Double> iterator= output.keySet().iterator();
//		while(iterator.hasNext()) {
//			double temp= iterator.next();
//			System.out.println();
//			System.out.println(temp);
//			Iterator<AMV_MVS_VSQ_2D> iterator1= output.get(temp).iterator();
//			while(iterator1.hasNext()) {
//				AMV_MVS_VSQ_2D temp1= iterator1.next();
//				System.out.println(temp1.getX()+ ":"+ temp1.getY());
//			}	
//		}

        //
        AMV_MVS_VSQ_2D position2D5 = new AMV_MVS_VSQ_2D();
        position2D5.I_X(15);
        position2D5.I_Y(25);
        input.add(position2D5);
        //double v= FindPCAMeanDistance.findMeanDistanceFromPositions2D(input, 5, 4);
        //System.out.println(v);
        double[] v = Distance_X_findPascalMeanDistanceByEachPositions2D._E(input, 3, 4);
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }

    public static void _E(List<AMV_MVS_VSQ_2D> inputs) {
        //处理fusion 先 fissile 采样
        Map<Double, List<AMV_MVS_VSQ_2D>> output = Fissile_X_fissilePosition2D._E(inputs, 13);
        Iterator<Double> iterator = output.keySet().iterator();
        while (iterator.hasNext()) {
            double temp = iterator.next();
            System.out.println();
            System.out.println(temp);
            Iterator<AMV_MVS_VSQ_2D> iterator1 = output.get(temp).iterator();
            while (iterator1.hasNext()) {
                AMV_MVS_VSQ_2D temp1 = iterator1.next();
                System.out.println(temp1.getX() + ":" + temp1.getY());
            }
        }
//		//然后fusion 1 观测heart
        Map<Double, AMV_MVS_VSQ_2D> groupsHeart = new HashMap<>();
        Iterator<Double> iterator2 = output.keySet().iterator();
        while (iterator2.hasNext()) {
            double temp = iterator2.next();
            AMV_MVS_VSQ_2D heartTemp = Euclid_X_findHeartPosition2D._E(output.get(temp));
            System.out.println("hearts->" + heartTemp.getX() + ":" + heartTemp.getY());
            groupsHeart.put(temp, heartTemp);
        }
//		//2观测结果 用10 和11分别带入可测试。
//		Map<Double, List<AMV_MVS_VSQ_2D>> fusion= Fusion.fusionAMV_MVS_VSQ_2DwithHeart(output, groupsHeart, 11);
//		Iterator<Double> iterator3= fusion.keySet().iterator();
//		while(iterator3.hasNext()) {
//			double temp= iterator3.next();
//			System.out.println();
//			System.out.println(temp);
//			Iterator<AMV_MVS_VSQ_2D> iterator1= output.get(temp).iterator();
//			while(iterator1.hasNext()) {
//				AMV_MVS_VSQ_2D temp1= iterator1.next();
//				System.out.println(temp1.getX()+ ":"+ temp1.getY());
//			}
//		}
        //
//		AMV_MVS_VSQ_2D position2D5= new AMV_MVS_VSQ_2D();
//		position2D5.I_X(15);
//		position2D5.I_Y(25);
//
//		Map<Double, List<AMV_MVS_VSQ_2D>>inputMap= new HashMap<>();
//		inputMap.put(0.0, input);
//		Map<Double, List<AMV_MVS_VSQ_2D>>output= PositionClasification.addNewPositionWithoutHeart(inputMap, position2D5, 29);//采样距离28.4
//
//		Iterator<Double> iterator= output.keySet().iterator();
//		while(iterator.hasNext()) {
//			double temp= iterator.next();
//			System.out.println();
//			System.out.println(temp);
//			Iterator<AMV_MVS_VSQ_2D> iterator1= output.get(temp).iterator();
//			while(iterator1.hasNext()) {
//				AMV_MVS_VSQ_2D temp1= iterator1.next();
//				System.out.println(temp1.getX()+ ":"+ temp1.getY());
//			}
//		}

        //
//        AMV_MVS_VSQ_2D position2D5 = new AMV_MVS_VSQ_2D();
//        position2D5.I_X(15);
//        position2D5.I_Y(25);
//        inputs.add(position2D5);
        //double v= FindPCAMeanDistance.findMeanDistanceFromPositions2D(input, 5, 4);
        //System.out.println(v);
        double[] v = Distance_X_findPascalMeanDistanceByEachPositions2D._E(inputs, 3, 4);
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }
}