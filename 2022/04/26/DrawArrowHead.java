//E_IDUQ/OSI/OPE/OSQ/MVQ/OVU/PQE/theme/neroCell/DrawArrowHead.java
package OSI.OPE.OSQ.MVQ.OVU.PQE.theme.neroCell;
public class DrawArrowHead{
	public static int[][] coords;
	//将bitmap的矩阵有效坐标值 swap成 坐标队列array。
	//DNA元基催化与肽计算 著作权文件有申明该算法加速思想。
	//罗瑶光
	public static int[][] coordSwap(int[][] inputs) {
		int x= inputs.length;
		int y= inputs[0].length;
		int count= 0;
		coords= new int[2][x* y];
		for(int i= 0; i< x; i++) {
			for(int j= 0; j< y; j++) {
				if(1== inputs[i][j]) {
					coords[0][count]  = j;
					coords[1][count++]= i;
				}
			}
		}
		coords[0][count]  = -1;
		return coords;
	}
	
	public static final int[][] neroShape = {
			{0,0,1,0,0,0,0,0,0,0},
			{0,0,1,1,1,1,0,0,0,0},
			{0,0,1,1,1,1,1,1,1,0},
			{1,1,1,1,1,1,1,1,1,1},
			{0,0,1,1,1,1,1,1,1,0},
			{0,0,1,1,1,1,0,0,0,0},
			{0,0,1,0,0,0,0,0,0,0},
		};
	
}
