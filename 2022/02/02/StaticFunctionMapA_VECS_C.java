package SEM.bloom;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import AEU.OCI.AVC.SUQ.estimation.C.EmotionSample;
import OEI.ME.analysis.E.CogsBinaryForest_AE;
//������������ ע����
//������
public interface StaticFunctionMapA_VECS_C {
	public static Map<String, String> annotationMap= new HashMap<>();
	//�ִ�
	public static List<String> parserMixedString(String inputString) throws IOException {
		CogsBinaryForest_AE _A = new CogsBinaryForest_AE();
		_A.IV_Mixed();
		List<String> sets = new ArrayList<>();
		sets= _A.parserMixedString(inputString);
		//������
		return sets;
	}

	public List<String> parserMixedStringToList(String inputString) throws IOException;		
	
	//�ı�����
	public List<String> posReader(String inputString) throws IOException;	
	
	//�ı�����
	public List<String> dnnReader(String inputString) throws IOException;	
	
	//������ 
	public List<String> mindReader(String inputString) throws IOException;	

	//��з�����
	public List<String> emotionReader(String inputString) throws IOException;	

	//�������� 
	public List<String> educationReader(String inputString) throws IOException;	

	//��������
	public Map<String, EmotionSample> environmentReader(String inputString) throws IOException;
	
	//�������
	public Map<String, Object> lenovoReader(String inputString) throws IOException;
	
	//��Ƶ����
	public List<String> frequencyReader(String inputString) throws IOException;
	
	//�Ӿ�����

	//

	//

	//
}