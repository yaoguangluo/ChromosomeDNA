package SEM.bloom;

import java.awt.image.BufferedImage;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import javax.sound.sampled.UnsupportedAudioFileException;

import ME.APM.VSQ.App;
import PEU.P.dna.Token;
import PEU.P.image.ConvexHull.Vertex;
import PEU.P.md5.Usr;
import PEU.P.md5.UsrToken;
import PEU.P.table.TableSorterZYNK;
import PEU.P.time.TimeCheck;
//著作权人+ 作者= 罗瑶光
public interface StaticFunctionMapU_AOPM_C {
	public static Map<String, String> annotationMap= new HashMap<>();
	 
	//Cache_M 入选jdk， 略
	//ObjectClassification
	public Map<String, Map<String, Object>>mapClassification(Map<String, Object> input, String[] keywords);
	public Map<String, Map<String, Object>>mapClassification2D(Map<String, Object> input, String[] keywords);
	public Map<String, String[]>stringClassification2D(String[] input, String[] keywords);
	public Map<String, List<String>>listClassification2D(List<String> input, String[] keywords);

	//ObjectCombination {
	public Map<String, Object> mapCombination(Map<String, Object> output, Map<String, Object> destination);
	public List<Object> listCombination(List<Object> output, List<Object> destination);
	public int[] intArrayCombination(int[] output, int[] destination);
	public double[] doubleArrayCombination(double[] output, double[] destination);
	public long[] longArrayCombination(long[] output, long[] destination);
	
	public float[] floatArrayCombination(float[] output, float[] destination);
	public String[] StringArrayCombination(String[] output, String[] destination);
	public char[] charArrayCombination(char[] output, char[] destination);
	public byte[] byteArrayCombination(byte[] output, byte[] destination);
	public Vector<Object> vectorCombination(Vector<Object> output, Vector<Object> destination);

	//DNAAuth {
	public boolean DNAAuthStatusCheckEmailAndPds(App app, String string, Map<String, String> data) throws Exception;
	public boolean DNAAuthStatusCheckEmailAndPde(App app, String string, Map<String, String> data) throws Exception;
	public boolean DNAAuthStatusCheckEmailAndPassword(App app, String string, Map<String, String> data) throws Exception;
	public boolean DNAAuthCheck(App app, String string, Map<String, String> data) throws Exception;

	//StringUtil {
	public String encode(String input) throws Exception;
	public String decode(String str) ;
	public String EncoderByMd5(String salt, String pwd, int enctimes) throws NoSuchAlgorithmException
	, UnsupportedEncodingException;
	public String EncoderByMd5(String salt, String pwd) throws NoSuchAlgorithmException
	, UnsupportedEncodingException;
	public String EncoderByDNA(String key, String uPassword, Token token);

	//TokenUtil {
	public Token getNewTokenFromUsrAndUsrToken(Usr usr, UsrToken usrToken)throws Exception;
	public String getSecondMD5Password(String uPassword) throws Exception;
	public String getFirstMD5Password(String key, String uPassword) throws Exception;
	public String getFirstDNAPassword(String key, String uPassword, Token token);
	public Token getNewTokenFromUsrAndUsrTokenByDNA(Usr usr, UsrToken usrToken)throws Exception;

	//image
	// CheckRange {
	public int[][] CheckRange_P(int[][] g) throws IOException;

	//Closing {
	public int[][] Closing_P(int[][]g,int[][]kenel);

	//Color_P {
	public String Color_P(int r,int g,int b);

	//ConvexHull {		
	public List<Vertex> convexHull(List<Vertex> vertices);
	public int compareSlope(int dy2, int dx2, int dy1, int dx1) ;
	public void PNGWrite(int[][] g, int pix, String output) throws IOException;
	public void CSVWrite(int[][] g, int pix, String outputcsv) throws IOException;

	//Dilation{
	public int[][] Dilation_P(int[][] g, int[][] kenel) ;

	//Emboss {
	public int[][] Emboss_P( int[][] g) throws IOException ;

	//Erosion{
	public int[][] Erosion_P(int[][] g, int[][] kenel);

	// GetMean {
	public double print_Mean(int[][] outDIR);
	public double print_Mean(double[][] outDIR);

	////Group_O { 稍后把 非个人著作权的几十行踢出去。
	//public double[][] GO(int[][] kener,int[][] refG,int[] size);

	//Guassian {
	public int[][] Guassian_P_2D(int[][] g,int d,int e,double sig) throws IOException;
	public int[][] Guassian_P_1D(int[][] g,int frection,int kernel,double sig) throws IOException;
	public BufferedImage Guassian_P(BufferedImage lygimage, double d, double e,double k)throws IOException ;

	// HitAndMiss{
	public int[][] HitAndMiss_P(int[][] g, int pix, int[][] kenel) throws IOException;

	//HoughTransform {
	public void HoughTransformLoop(int[][] g, int pix,int scale);
	public void IV_HTMatrix(int[][] g) ;

	//Laplacian {
	public int[][] Laplacian_P( int[][] g) throws IOException;

	//Mask {
	public int[][] Mask_P(int[][] mag,int[][]dir) throws IOException;

	//Median {
	public int[][] Median_P(int[][] g,int d,int e) throws IOException;
	public BufferedImage Median_P(BufferedImage lygimage, int d, int e) throws IOException;

	//Opening {
	public int[][] Opening_P(int[][]g,int[][]kenel);
	//PrintMoments{
	public void PrintCurrent(int[][]g,int pix) ;

	//ReadWritePng {	
	public void writePNG(String args,  int[][] outmag) throws IOException;
	public void writePNG(String args,  int[][][] outmag) throws IOException;
	public int[][] GRNpngRead(String args) throws IOException;
	public int[][] GRNpngRead(BufferedImage image) throws IOException;
	public int[][] REDpngRead(String args) throws IOException;
	public int[][] REDpngRead(BufferedImage image) throws IOException;
	public int[][] BLUpngRead(String args) throws IOException;	
	public int[][] BLUpngRead(BufferedImage image) throws IOException;
	public int[] sizeHW(String args) throws IOException;
	public BufferedImage createBufferImage(int[][] r, int[][] g, int[][] b);

	//RedRaf{
	public int[][] smallToNormal(int r[][],int s, int b) ;	

	//Reflection {//renhat教授的稍后剔出去
	public int[][] PadImage (int[][] _image, int height, int width);

	//RegionGet {
	public void RegionGet(int[][] g) throws IOException;
	public void buildGraph(int[][] g,String output) throws IOException;

	//Sobel {
	public int[][] Sobel_P( int[][] g,int choice) throws IOException;
	public int[][] Sobel_P_WithMask(int[][]  g, int choice, int mask) throws IOException;

	//Strech {
	public int[][] Strech_P(int[][] g,double d,double e) throws IOException;
	public BufferedImage Strech_P(BufferedImage lygimage, double d, double e) throws IOException;

	//Threshold {
	public int[][] Threshold_P(int[][] g, int Td);
	public int[][] Threshold_P_Section(int[][] g, int Ts, int Td);

	////VtoV{ 移除著作权的 和 u vecs 已经出现的稍后剔除出去。先注释掉
	//public JSONObject XmlToJsonObject(String response);
	//public Map<String, Object> JsonObjectToMap(JSONObject response);
	//public String MapToJsonString(Map<String, Object> response);
	//public String ListToJsonString(List<Object> response);
	//public String ObjectToJsonString(Object response);
	//public Map<String, Object> XmlToMap(String response);
	//public String MapToXml(Map<String, Object> response);
	//public List<Object> JsonArrayToList(JSONArray jobj);

	//CnnMeasure{
	public double[][] getCnnMeansure(double inputs[][]);

	//StringUtil { 见我git的 备份描述refer 和 著作申请版本备份refer 都有详细说明
	//md5 官方 注释下，以后用 dna MD5的作为纪念。 奇怪 还让我eclipse卡死一下刚。
	//public String encode(String input) throws Exception ;
	//public String decode(String str) throws UnsupportedEncodingException;
	//public String EncoderByMd5(String salt, String pwd, int enctimes) throws NoSuchAlgorithmException
	//, UnsupportedEncodingException ;
	//public String EncoderByMd5(String salt, String pwd) throws NoSuchAlgorithmException
	//, UnsupportedEncodingException ;

	//WAVtoLYG{ 以前设计视频的加密很少用。
	public void WAVtoLYG(String WAVf, String LYGf) throws IOException, UnsupportedAudioFileException;
	//LYGFileIO
	//public LYGFileIO initWithFFT(double fft[], MakeContainerZNSZ makeContainerZNSZ);
	//public void lygRead(String filepath) throws IOException ;
	//public void lygWrite(String string) throws IOException ;
	//public void IQ_header(RandomAccessFile raf) throws IOException ;
	//public void IV_ByAudioBytes(AudioFormat af) ;

	//DETA_ANN_HMM {
	public String[][] summing_P(String[][] inputNLP) throws IOException, InstantiationException
	, IllegalAccessException;
	//DETA_DNN {
	public String[][] summing_P(String[][] ann, String[][] rnn) throws IOException, InstantiationException
	, IllegalAccessException ;

	//sort he search 没有实用价值  见 top5Dsort，略，稍后我会把 养疗经的表格search 组件提取出来变成函数。
	//声音滤波发音 略，不想设计统一接口，因为涉及武器安防领域，本人去年承诺过，不再个人研发，

	//tablesort 
	public TableSorterZYNK initATableSorterZYNK(); 
	public TimeCheck initATimeCheck();

	//wave 
	//Common{
	public double[] zhiShu(double[] input, double scale,double shehold);

	//Copy{
	public double[][] copy2d(double[][] input,double scale);
	public double[]copy1d(double[] input,double scale);
	public double[]copy1dx2(double[] input,double scale);

	//DFT
	public void initADFT();

	//FFT
	public void initAFFT();

	//Guassian{
	public double[] guassian1d(double[] input, double scale);

	//Laplasian{
	public double[] laplasian1d(double[] input, double scale);

	//MaxAndMin{
	public double max_v(double[] input) ;
	public double max_i(double[] input) ;
	public double min_v(double[] input,double rank);
	public double min_i(double[] input, double rank) ;

	//Median{
	public double[] median1d(double[] input, double scale ) ;

	//PeakStatistic{
	public double[][] fengTong1D(double[] input);
	public double[][] fengPaixX(double[][] input) ;
	public double[][] fengPaiyY(double[][] input);
	public double[][] fengPaiXx(double[][] input);
	public double[][] fengPaiYy(double[][] input);

	//Proportion{
	public double[] newX(double[] input, double width) ;
	public double[] newY(double[] input, double hight) ;
	public double[] newXY(double[] input, double width, double hight ) ;
	public double[] newXYBest(double[] input, double width, double hight ) ;
	public double[] newYwithoutBound(double[] input, double hight);
	public double[] newXYYwithoutBound(double[] input, double width, double hight );

	//Quantification{
	public double[] liangHuaDengChaAdd(double[] input, double scale) ;
	public double[] liangHuaXiHua(double[] input,double scale) ;

	public double[] liangHuaDengChaMines(double[] input, int scale);
	public double[] liangHuaEqualDelete(double[] input) ;
	public double[] liangHuaXiHuaHalfSide(double[] input) ;
	//Shehold{
	public double[] shehold1D(double[] input, double scale) ;
	//Tailor{
	public double[] caiJian1D(double[] input, double left,double right) ;

	//UnZip {
	public void unZipWithPath(String zipFullPath, String zipCategory);

	//BootBackup {  
	public void bootBackupByUsingGzip(String zipPath);
	//sourceFilePath is a root category of 待压缩的文件目录
	//zipFilePath is a zip category of 压缩的文件目录到
	//fileName is a zip file name
	public boolean fileToZip(String sourceFilePath, String zipFilePath, String fileName);

	//GzipUtil {
	// 压缩
	public byte[] compress(byte[] data) throws IOException;
	public byte[] compress(String str, String stringTypes) throws IOException;
	public byte[] uncompress(byte[] data) throws IOException;

	//Filter{
	public int[][] P_Heart(int[][] zuoBiao, int distance, int scale);
	public int[][] P_Model(int[][] zuoBiao, int[][] yanjing);//粗糙版本以后优化。
}