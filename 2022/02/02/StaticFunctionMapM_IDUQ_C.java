package SEM.bloom;

import java.util.HashMap;
import java.util.Map;

import OSI.SSI.ASU.OSU.PSU.MSU.ouler.Q_OulerRing;
import OSI.SSI.ASU.OSU.PSU.MSU.ouler.Q_OulerRing16;
import OSI.SSI.ASU.OSU.PSU.MSU.pde.DecadeToPDS;
import OSI.SSI.ASU.OSU.PSU.MSU.pde.DecadeToPDS16;
import OSI.SSI.ASU.OSU.PSU.MSU.pds.PDE_PDS_DL;
import OSI.SSI.ASU.OSU.PSU.MSU.pds.PDE_PDS_DL16;

//著作权人+ 作者= 罗瑶光
public interface StaticFunctionMapM_IDUQ_C {
	public static Map<String, String> annotationMap= new HashMap<>();
	
	public Q_OulerRing getQ_OulerRing();
	public Q_OulerRing16 getQ_OulerRing16();
	public DecadeToPDS getDecadeToPDS();
	public DecadeToPDS16 getDecadeToPDS16();
	public PDE_PDS_DL getPDE_PDS_DL();
	public PDE_PDS_DL16 getPDE_PDS_DL16();
	
}
