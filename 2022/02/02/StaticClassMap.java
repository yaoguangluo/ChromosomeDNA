package SEM.bloom;
import java.io.IOException;
import java.util.HashMap;
//import java.util.ArrayList;
//import java.util.List;
import java.util.Map;

import SEM.register.StaticRegisterA_IDUQ_C;
import SEM.register.StaticRegisterA_VECS_C;
import SEM.register.StaticRegisterC_AOPM_C;
import SEM.register.StaticRegisterC_IDUQ_C;
import SEM.register.StaticRegisterD_AOPM_C;
import SEM.register.StaticRegisterD_VECS_C;
import SEM.register.StaticRegisterE_AOPM_C;
import SEM.register.StaticRegisterE_IDUQ_C;
import SEM.register.StaticRegisterI_AOPM_C;
import SEM.register.StaticRegisterI_VECS_C;
import SEM.register.StaticRegisterM_IDUQ_C;
import SEM.register.StaticRegisterM_VECS_C;
import SEM.register.StaticRegisterO_IDUQ_C;
import SEM.register.StaticRegisterO_VECS_C;
import SEM.register.StaticRegisterP_IDUQ_C;
import SEM.register.StaticRegisterP_VECS_C;
import SEM.register.StaticRegisterQ_AOPM_C;
import SEM.register.StaticRegisterQ_VECS_C;
import SEM.register.StaticRegisterS_AOPM_C;
import SEM.register.StaticRegisterS_IDUQ_C;
import SEM.register.StaticRegisterU_AOPM_C;
import SEM.register.StaticRegisterU_VECS_C;
import SEM.register.StaticRegisterV_AOPM_C;
import SEM.register.StaticRegisterV_IDUQ_C;
//���������ļ���
//������
//���̣�1�ȹ��̹��ɣ�Ȼ��2���࣬���3ͳ��ִ�нӿڵ����java�ļ���4����map������
public class StaticClassMap{
	public static Map<String, Object>  staticClassMap= new HashMap<>();
	public StaticClassMap(String string) throws IOException {
		if("A_VECS".equals(string)) {
			//..���������ļ�����������ע�ắ����
			//�ִ� ������ ��з����������������ı��������Ӿ�����
			//�ִ�
			StaticFunctionMapA_VECS_E staticFunctionMapA_VECS_E =new StaticFunctionMapA_VECS_E();
			staticClassMap.put("A_VECS", staticFunctionMapA_VECS_E);//CE�ӿ��Ȼ�
			StaticRegisterA_VECS_C.load(staticFunctionMapA_VECS_E);//static ���

		}
		if("A_IDUQ".equals(string)) {
			//..��չ��ʽ�� dna���ܣ�vpcs�������� 
			StaticFunctionMapA_IDUQ_E staticFunctionMapA_IDUQ_E =new StaticFunctionMapA_IDUQ_E();
			staticClassMap.put("A_IDUQ", staticFunctionMapA_IDUQ_E);//CE�ӿ��Ȼ�
			StaticRegisterA_IDUQ_C.load(staticFunctionMapA_IDUQ_E);//static ���
		}

		if("O_VECS".equals(string)) {
			//..tinshell�� ���ķ��������ݿ����ԣ���ɢ���ұ任��
			StaticFunctionMapO_VECS_E staticFunctionMapO_VECS_E =new StaticFunctionMapO_VECS_E();
			staticClassMap.put("O_VECS", staticFunctionMapO_VECS_E);//CE�ӿ��Ȼ�
			StaticRegisterO_VECS_C.load(staticFunctionMapO_VECS_E);//static ���
		}
		if("O_IDUQ".equals(string)) {
			//..etl �ĵ���ִ�У� ���档
			StaticFunctionMapO_IDUQ_E staticFunctionMapO_IDUQ_E =new StaticFunctionMapO_IDUQ_E();
			staticClassMap.put("O_IDUQ",  staticFunctionMapO_IDUQ_E);//CE�ӿ��Ȼ�
			StaticRegisterO_IDUQ_C.load(staticFunctionMapO_IDUQ_E);//static ���
		}

		if("P_VECS".equals(string)) {
			//..����Ԥ����������
			StaticFunctionMapP_VECS_E staticFunctionMapP_VECS_E =new StaticFunctionMapP_VECS_E();
			staticClassMap.put("P_VECS",  staticFunctionMapP_VECS_E);//CE�ӿ��Ȼ�
			StaticRegisterP_VECS_C.load(staticFunctionMapP_VECS_E);//static ���
		}
		if("P_IDUQ".equals(string)) {
			//..dna�Ŵ��ӽ����
			StaticFunctionMapP_IDUQ_E staticFunctionMapP_IDUQ_E =new StaticFunctionMapP_IDUQ_E();
			staticClassMap.put("P_IDUQ",  staticFunctionMapP_IDUQ_E);//CE�ӿ��Ȼ�
			StaticRegisterP_IDUQ_C.load(staticFunctionMapP_IDUQ_E);//static ���
		}

		if("M_VECS".equals(string)) {
			//..���ݿ� ��ɾ�Ĳ顣����ؼ�����ӡ�������ά�ʻ����
			StaticFunctionMapM_VECS_E staticFunctionMapM_VECS_E =new StaticFunctionMapM_VECS_E();
			staticClassMap.put("M_VECS",  staticFunctionMapM_VECS_E);//CE�ӿ��Ȼ�
			StaticRegisterM_VECS_C.load(staticFunctionMapM_VECS_E);//static ���
		}
		if("M_IDUQ".equals(string)) {
			//..ŷ�� Ԫ�����ƻ�·�� Ԫ�����Ʊ任��
			StaticFunctionMapM_IDUQ_E staticFunctionMapM_IDUQ_E =new StaticFunctionMapM_IDUQ_E();
			staticClassMap.put("M_IDUQ",  staticFunctionMapM_IDUQ_E);//CE�ӿ��Ȼ�
			StaticRegisterM_IDUQ_C.load(staticFunctionMapM_IDUQ_E);//static ���
		}

		if("V_AOPM".equals(string)) {
			//..dna ����Կ�׷ǶԳƱ任���ܣ� ���棬��ά�Ӿ���
			StaticFunctionMapV_AOPM_E staticFunctionMapV_AOPM_E =new StaticFunctionMapV_AOPM_E();
			staticClassMap.put("V_AOPM",  staticFunctionMapV_AOPM_E);//CE�ӿ��Ȼ�
			StaticRegisterV_AOPM_C.load(staticFunctionMapV_AOPM_E);//static ���
		}
		if("V_IDUQ".equals(string)) {
			//..etl������������棬etl��ȡ�ĵ���
			StaticFunctionMapV_IDUQ_E staticFunctionMapV_IDUQ_E =new StaticFunctionMapV_IDUQ_E();
			staticClassMap.put("V_IDUQ",  staticFunctionMapV_IDUQ_E);//CE�ӿ��Ȼ�
			StaticRegisterV_IDUQ_C.load(staticFunctionMapV_IDUQ_E);//static ���
		}

		if("E_AOPM".equals(string)) {
			//..�����ִʺ��������
			StaticFunctionMapE_AOPM_E staticFunctionMapE_AOPM_E =new StaticFunctionMapE_AOPM_E();
			staticClassMap.put("E_AOPM",  staticFunctionMapE_AOPM_E);//CE�ӿ��Ȼ�
			StaticRegisterE_AOPM_C.load(staticFunctionMapE_AOPM_E);//static ���
		}
		if("E_IDUQ".equals(string)) {
			//..etl �������������� osgi ���ע�����
			StaticFunctionMapE_IDUQ_E staticFunctionMapE_IDUQ_E= new StaticFunctionMapE_IDUQ_E();
			staticClassMap.put("E_IDUQ", staticFunctionMapE_IDUQ_E);//CE�ӿ��Ȼ�
			StaticRegisterE_IDUQ_C.load(staticFunctionMapE_IDUQ_E);//static ���
		}

		if("C_AOPM".equals(string)) {
			//..vpcs���������ģ� ��Ȼ���Դ������
			StaticFunctionMapC_AOPM_E staticFunctionMapC_AOPM_E= new StaticFunctionMapC_AOPM_E();
			staticClassMap.put("C_AOPM", staticFunctionMapC_AOPM_E);//CE�ӿ��Ȼ�
			StaticRegisterC_AOPM_C.load(staticFunctionMapC_AOPM_E);//static ���
		}
		if("C_IDUQ".equals(string)) {
			//..��Ȼ���� ��������
			StaticFunctionMapC_IDUQ_E staticFunctionMapC_IDUQ_E= new StaticFunctionMapC_IDUQ_E();
			staticClassMap.put("C_IDUQ", staticFunctionMapC_IDUQ_E);//CE�ӿ��Ȼ�
			StaticRegisterC_IDUQ_C.load(staticFunctionMapC_IDUQ_E);//static ���
		}

		if("S_AOPM".equals(string)) {
			//..���ݼ�¼����
			StaticFunctionMapS_AOPM_E staticFunctionMapS_AOPM_E=new StaticFunctionMapS_AOPM_E();
			staticClassMap.put("S_AOPM", staticFunctionMapS_AOPM_E);//CE�ӿ��Ȼ�
			StaticRegisterS_AOPM_C.load(staticFunctionMapS_AOPM_E);//static ���
		}
		if("S_IDUQ".equals(string)) {
			//..���ԣ����������ݲ�������
			StaticFunctionMapS_IDUQ_E staticFunctionMapS_IDUQ_E=new StaticFunctionMapS_IDUQ_E();
			staticClassMap.put("S_IDUQ", staticFunctionMapS_IDUQ_E);//CE�ӿ��Ȼ�
			StaticRegisterS_IDUQ_C.load(staticFunctionMapS_IDUQ_E);//static ���
		}

		if("I_AOPM".equals(string)) {
			//..������¼����ά���ݷ����Ǽ�
			StaticFunctionMapI_AOPM_E staticFunctionMapI_AOPM_E= new StaticFunctionMapI_AOPM_E();
			staticClassMap.put("I_AOPM", staticFunctionMapI_AOPM_E);//CE�ӿ��Ȼ�
			StaticRegisterI_AOPM_C.load(staticFunctionMapI_AOPM_E);//static ���
		}
		if("I_VECS".equals(string)) {
			//..�ĸ�ʴ�� �Ǿ���Ӿ���ͼƬ����
			StaticFunctionMapI_VECS_E staticFunctionMapI_VECS_E=new StaticFunctionMapI_VECS_E();
			staticClassMap.put("I_VECS", staticFunctionMapI_VECS_E);//CE�ӿ��Ȼ�
			StaticRegisterI_VECS_C.load(staticFunctionMapI_VECS_E);//static ���
		}

		if("D_AOPM".equals(string)) {
			//..�����쳣����
			StaticFunctionMapD_AOPM_E staticFunctionMapD_AOPM_E= new StaticFunctionMapD_AOPM_E();
			staticClassMap.put("D_AOPM",staticFunctionMapD_AOPM_E);//CE�ӿ��Ȼ�
			StaticRegisterD_AOPM_C.load(staticFunctionMapD_AOPM_E);//static ���
		}
		if("D_VECS".equals(string)) {
			//..�����쳣�������Ժ�ѹ����� ɾ���� �Ƶ���������
			StaticFunctionMapD_VECS_E staticFunctionMapD_VECS_E= new StaticFunctionMapD_VECS_E();
			staticClassMap.put("D_VECS", staticFunctionMapD_VECS_E);//CE�ӿ��Ȼ�
			StaticRegisterD_VECS_C.load(staticFunctionMapD_VECS_E);//static ���
		}

		if("U_AOPM".equals(string)) {
			//..����任����
			StaticFunctionMapU_AOPM_E staticFunctionMapU_AOPM_E= new StaticFunctionMapU_AOPM_E();
			staticClassMap.put("U_AOPM",staticFunctionMapU_AOPM_E);//CE�ӿ��Ȼ�
			StaticRegisterU_AOPM_C.load(staticFunctionMapU_AOPM_E);//static ���
		}
		if("U_VECS".equals(string)) {
			//..���ݱ任����
			StaticFunctionMapU_VECS_E staticFunctionMapU_VECS_E= new StaticFunctionMapU_VECS_E();
			staticClassMap.put("U_VECS", staticFunctionMapU_VECS_E);//CE�ӿ��Ȼ�
			StaticRegisterU_VECS_C.load(staticFunctionMapU_VECS_E);//static ���
			//����..����ע�ᡣ��
			//����
		}

		if("Q_AOPM".equals(string)) {
			//..��Ԫdna�ӽ�������
			StaticFunctionMapQ_AOPM_E staticFunctionMapQ_AOPM_E= new StaticFunctionMapQ_AOPM_E();
			staticClassMap.put("Q_AOPM",staticFunctionMapQ_AOPM_E);//CE�ӿ��Ȼ�
			StaticRegisterQ_AOPM_C.load(staticFunctionMapQ_AOPM_E);//static ���
		}
		if("Q_VECS".equals(string)) {
			//..dna������ ���ݿ�orm�� ��������
			StaticFunctionMapQ_VECS_E staticFunctionMapQ_VECS_E= new StaticFunctionMapQ_VECS_E();
			staticClassMap.put("Q_VECS",staticFunctionMapQ_VECS_E);//CE�ӿ��Ȼ�
			StaticRegisterQ_VECS_C.load(staticFunctionMapQ_VECS_E);//static ���
		}
		// TODO Auto-generated constructor stub
	}
}