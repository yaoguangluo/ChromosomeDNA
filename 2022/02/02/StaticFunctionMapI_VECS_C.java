package SEM.bloom;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ME.APM.VSQ.App;

//����Ȩ�� + ���� = ������
public interface StaticFunctionMapI_VECS_C {
	public static Map<String, String> annotationMap= new HashMap<>();
	//SkinPathDoubleDetectTripFix2D_E{
	public List<String> doTestWithImageAPP(App app) throws IOException; 
	public Double[] doFourJianPDErosion(int ��ʴŨ��,int ���ط�ֵ,int ���رȾ���, int ���ز��,
			int pcaScale, int upcaScale, int icaScale, int ecaScale, BufferedImage bufferedImage) throws IOException;
	public Double[] doFourSuanPDErosion(int ��ʴŨ��,int ���ط�ֵ,int ���رȾ���, int ���ز��,
			int pcaScale, int upcaScale, int icaScale, int ecaScale, BufferedImage bufferedImage) throws IOException;
	public Double[] doEightSuanPDErosion(int ��ʴŨ��,int ���ط�ֵ,int ���رȾ���, int ���ز��,
			int pcaScale, int upcaScale, int icaScale, int ecaScale, BufferedImage bufferedImage) throws IOException;
	public Double[] doEightJianPDErosion(int ��ʴŨ��,int ���ط�ֵ,int ���رȾ���, int ���ز��,
			int pcaScale, int upcaScale, int icaScale, int ecaScale, BufferedImage bufferedImage) throws IOException;
	public void doFirstPDErosionWithTop(double fourJian, double fourSuan, double eightJian, double eightSuan
			, int[][] scoreMatrix, int top, BufferedImage bufferedImage)throws IOException;
	public void doSecondPDErosionWithTop(double fourJian, double fourSuan
			, double eightJian, double eightSuan, int[][] scoreMatrix
			, int top, int times, BufferedImage bufferedImage)throws IOException;
	public void doThirdPDErosionWithTop(double fourJian, double fourSuan
			, double eightJian, double eightSuan, int[][] scoreMatrix
			, int top, int times, List<String> output, BufferedImage bufferedImage)throws IOException;
	public void initDeciphring(String string, int type) throws NumberFormatException, IOException;


	//SkinPathDetectTrip_E{
	public void doTestWithFilePath(String testImagePath) throws IOException;
	public List<String> doTestWithImage(Image testImagePath) throws IOException;
	public void doTestWithBufferedImage(BufferedImage testImagePath) throws IOException;

	//SkinPathDoubleDetectTripFix2D	
	public void staticMain(String[] string) throws IOException;

	//16���ƴ����ȸ�ʴ��չ����۲�
	public int[][] doPDERangePDI16(int[][] input, int ���scale);		
	//monitor.rp= new RangePDI().IPE_AOPM_VECS_IDUQ_TXH_AC(monitor.rp, monitor.facy);
}
