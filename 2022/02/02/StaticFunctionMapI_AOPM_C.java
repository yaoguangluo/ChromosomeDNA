package SEM.bloom;

import java.awt.HeadlessException;

import java.util.HashMap;
import java.util.Map;

import IMO.EVU.bi_P.BigWord;
import IMO.EVU.bi_P.Classify;
import IMO.EVU.bi_P.CoAuthor;
import IMO.EVU.bi_P.CoAuthorForWord;
import IMO.EVU.bi_P.CoDNAAuthorForWord;
import IMO.EVU.bi_P.Histogram;
import IMO.EVU.bi_P.LineMed;
import IMS.EUQ.SP.LYGFileIO;
import IMS.EUQ.SP.Recoder;
import IMS.EUQ.recoder.Jpv;
import IMS.EUQ.recoder.VoicejPanel;
import ME.APM.VSQ.App;
import OCI.ME.analysis.C.A;
import OEI.ME.analysis.E.CogsBinaryForest_AE;
//著作权人+ 作者= 罗瑶光
public interface StaticFunctionMapI_AOPM_C {
	public static Map<String, String> annotationMap= new HashMap<>();
	//重名稍后
	public BigWord getBigWord() ;
	public Classify getClassify() ;
	public CoAuthor getCoAuthor(Map<String, Object> dic_li, CogsBinaryForest_AE _A
			, Map<String, String> pos);
	public CoAuthorForWord getCoAuthorForWord(App app, CogsBinaryForest_AE _A
			, Map<String, String> pos) throws HeadlessException, InterruptedException ;
	public CoDNAAuthorForWord getCoDNAAuthorForWord(App app, A _A, Map<String, String> pos) throws HeadlessException
	, InterruptedException ;
	public Histogram getHistogram() ;
	public LineMed getLineMed() ;
	public Jpv getJpv() ;
	public Recoder getRecoder();
	public VoicejPanel getVoicejPanel();
	public LYGFileIO getLYGFileIO();
	//声音略 私人不更进研究
}
