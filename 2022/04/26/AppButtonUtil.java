//YLJ_HRJ/ME/APM/VSQ/AppButtonUtil.java
package ME.APM.VSQ;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.swing.JTable;
import javax.swing.JTextPane;
import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import ESU.string.String_ESU;
import MSU.AMS.VQS.SQV.SI.OSU.SMV.http.RestCall;
import MVQ.button.DetaButton;
import SVQ.stable.StablePOS;
//把通用节点的 按钮操作提取出来 统一化管理去重。
//罗瑶光
//20211022 
public class AppButtonUtil{
	//	StringBuilder page= new StringBuilder().append("");
	//	AppPageUtil.pageSIMILAR(page, etc, cte, key, pos, sets, currentPage);

	//	StringBuilder page = new StringBuilder().append("");
	//	AppPageUtil.page翻页(page, map, key, pos, sets, currentPage);
	//中药DNN
	public static void pageDNN(StringBuilder page, List<String> sets, int currentPage
			, App u, JTable table, int row, Map<String, String> pos, String key, DetaButton buttonSum
			, DetaButton buttonCrt, JTextPane data, JTextPane statistic, String 中西药){
		List<String> setsForGet = sets.subList(currentPage * 2000, (currentPage + 1)*2000<sets.size()
				? (currentPage + 1)*2000 : sets.size());
		Iterator<String> iterator = setsForGet.iterator();
		String setOfi= "";
		int times= 0;
		while(times++<1000&& iterator.hasNext()) {
			setOfi += iterator.next();
		}
		String response = "";
		String keyCache= setOfi.length()> 30? setOfi.substring(0, 30): setOfi.substring(0, setOfi.length()- 1);
		if(!u.CacheString.containsKey(keyCache)) {
			try {
				String string= String_ESU.charsetSwap(setOfi, "GBK", "GBK");
				String encode= String_ESU.stringToURIencode(string, "UTF8");
				response= RestCall.backEndRequest(encode);
				String[] strings= response.split("\"");
				response= strings.length> 3? strings[3]: "";
				response= String_ESU.uRIencodeToURIdecode(response, "UTF8");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			if(u.CacheStringPiple.size()< 301) {//buman
				u.CacheString.put(keyCache, response);
				u.CacheStringPiple.add(0, keyCache);
			}else {//man
				u.CacheString.put(keyCache, response);
				u.CacheStringPiple.add(0, keyCache);
				u.CacheString.remove(u.CacheStringPiple.get(300));
				u.CacheStringPiple.remove(300);
			}
		}else {
			response=u.CacheString.get(keyCache);
		}
		//dnn森林
		try {
			String[] dnn= response.replace("\r\n", "<br/>").split("<br/>");
			if(中西药.contains("中药")) {
				u.coAuthorForWord.bootDetaDnnFlowerForest(u, table.getValueAt(row, 2).toString(), dnn, true);
			}else if(中西药.contains("西药")) {
				u.coAuthorForWord.bootDetaBingMingDnnFlowerForest(u, table.getValueAt(row, 2).toString(), dnn, true);
			}else {
			}
			//(this.u.table.getValueAt(row, 2).toString(), false);
		}catch(Exception e1) {
			u.validate();
		}
		
		
		//dnn rank
		Map<String, Double> DNNrank= new HashMap<>(); 
		try {
			statistic.setSize(500, 800);
			//Map<Integer, WordFrequency> fwa = _A.sortWordFrequencyMapToSortMap(map);
			statistic.setContentType("text/html");
			StringBuilder stringBuilder = new StringBuilder();
			String[] fwa= response.replace("\r\n", "<br/>").split("<br/>");
			Here:
				for (int i = fwa.length-1; i > 0; i--) {
					if (fwa[i]!= null) {
						String[] strings= fwa[i].split(":");
						//DNNrank.put(strings[0], Double.valueOf(strings[1]));// 不需要怎么复杂
						DNNrank.put(strings[0], 0.0+ i);
						if(pos.get(strings[0]) == null) {
							stringBuilder.append("<div style=\"background:black\"><font color=\"white\">" 
						+fwa[i] + "</font></div>");
							continue Here;
						}
						if(pos.get(strings[0]).contains("名")) {
							stringBuilder.append( "<div style=\"background:#FF44FF\"><font color=\"white\">"
						+ fwa[i] +"</font></div>");
							continue Here;
						}
						if(pos.get(strings[0]).contains("动")) {
							stringBuilder.append("<div style=\"background:#8CEA00\"><font color=\"black\" size=\"5\">" 
						+ fwa[i] +"</font></div>");
							continue Here;
						}
						if(pos.get(strings[0]).contains("形")) {
							stringBuilder.append("<div style=\"background:#FF9224\"><font color=\"black\" size=\"5\">" 
						+ fwa[i] +"</font></div>");
						}
					}
				}	
			statistic.setText(stringBuilder.toString());
			statistic.setSelectionStart(0);
			statistic.setSelectionEnd(0);
			statistic.validate();
		}catch(Exception e1){	
			statistic.validate();
		}          
		
		//DNN
		Map<String, WordFrequency> map = new ConcurrentHashMap<>();
		iterator = setsForGet.iterator();
		Here:
			while(iterator.hasNext()) {
				setOfi = iterator.next();
				if(pos.get(setOfi) == null) {
					page.append("<span style=\"background:#F1F1F1\"><font color=\"black\" size=\"5\">" 
				+ setOfi + "</font></span>");
					continue Here;
				}
				if((pos.get(setOfi).contains("名")||pos.get(setOfi).contains("动")||pos.get(setOfi).contains("形"))) {
					if (map.containsKey(setOfi)) {
						WordFrequency wordFrequency = map.get(setOfi);
						wordFrequency.I_Frequency(wordFrequency.getFrequency() + StablePOS.INT_ONE);
						map.put(setOfi, wordFrequency);
					} else {
						WordFrequency wordFrequency = new WordFrequency();
						wordFrequency.I_Frequency(StablePOS.INT_ONE);
						wordFrequency.I_Word(setOfi);
						map.put(setOfi, wordFrequency);
					}
				}
				if (!setOfi.equals("")) {
					if(response.contains(setOfi)&& setOfi.length()> 1) {
						double rank= DNNrank.containsKey(setOfi)?DNNrank.get(setOfi):0;
						double peak= DNNrank.size()* (u.lookrot/20.1);
						if(pos.get(setOfi).contains("名")) {
							if(setOfi.length()> 2|| rank> peak) {
								page.append("<span style=\"background:"+new PEU.P.image.Color_P().P(255, 90, 255)
									+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
								continue Here;
							}
							page.append("<span style=\"background:"+new PEU.P.image.Color_P().P(255, 210, 255)
									+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
							continue Here;
						}
						if(pos.get(setOfi).contains("动")) {
							if(setOfi.length()> 2|| rank> peak) {
								page.append("<span style=\"background:"+new PEU.P.image.Color_P().P(90, 255, 90)
									+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
								continue Here;
							}
							page.append("<span style=\"background:"+new PEU.P.image.Color_P().P(210, 255, 210)
									+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
							continue Here;
						}
						if(pos.get(setOfi).contains("形")) {
							if(setOfi.length()> 2|| rank> peak) {
								page.append("<span style=\"background:"+new PEU.P.image.Color_P().P(255, 255, 90)
									+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
								continue Here;
							}
							page.append("<span style=\"background:"+new PEU.P.image.Color_P().P(255, 255, 210)
									+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
							continue Here;
						}
					} 
					if(key.contains(setOfi)&&(pos.get(setOfi).contains("名")||pos.get(setOfi).contains("动")
							||pos.get(setOfi).contains("形"))) {
						page.append("<span style=\"background:red\"><font color=\"white\">"+setOfi+"</font></span>");
						continue Here;
					}
					if(pos.get(setOfi).contains("名")) {
						page.append("<span style=\"background:"+new PEU.P.image.Color_P().P(255, 245, 255)
								+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
						continue Here;
					}
					if(pos.get(setOfi).contains("动")) {
						page.append("<span style=\"background:"+new PEU.P.image.Color_P().P(245, 255, 245)
								+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
						continue Here;
					}
					if(pos.get(setOfi).contains("形")) {
						page.append("<span style=\"background:"+new PEU.P.image.Color_P().P(255, 255, 245)
								+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
						continue Here;
					}
					if(pos.get(setOfi).contains("副")) {
						page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">"
					+setOfi+"</font></span>");
						continue Here;
					} 
					page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">"+setOfi
							+"</font></span>");			 
				}
			}	
		buttonSum.setText("共有 " + (sets == null ? 0 : (1 + sets.size() / 2001)) + " 页");
		buttonCrt.setText("当前页面：" + (sets == null? 0 : 1));
		data.setText(page.toString());
		data.setSelectionStart(0);
		data.setSelectionEnd(0);
		data.validate();			
	}

	//同义描述，
	public static void page同义描述(StringBuilder page, Map<String, String> cte, Map<String, String> etc
			, String key, Map<String, String> pos, List<String> sets, int currentPage){
		List<String> setsForGet= sets.subList(currentPage * 2000, (currentPage + 1)*2000<sets.size()
				? (currentPage + 1)*2000 : sets.size());
		Iterator<String> iterator= setsForGet.iterator();
		Here:
			while(iterator.hasNext()) {
				String setOfi = iterator.next();
				if(pos.get(setOfi) == null) {
					page.append("<span style=\"background:#F1F1F1\"><font color=\"black\" size=\"5\">" 
				+ setOfi +(cte.containsKey(setOfi)?(etc.containsKey(cte.get(setOfi))?":("
					+etc.get(cte.get(setOfi))+")":""):"") + "</font></span>");
					continue Here;
				}
				if (!setOfi.equals("")) {
					if(key.contains(setOfi)&&(pos.get(setOfi).contains("名")||pos.get(setOfi).contains("动")
							||pos.get(setOfi).contains("形"))) {
						page.append("<span style=\"background:red\"><font color=\"white\">" + setOfi 
								+(cte.containsKey(setOfi)?(etc.containsKey(cte.get(setOfi))?":("
						+etc.get(cte.get(setOfi))+")":""):"") + "</font></span>");
	    				continue Here;
	    			}
					if(pos.get(setOfi).contains("名")) {
						page.append("<span style=\"background:"+new PEU.P.image.Color_P().P(255, 245, 255)
								+"\"><font color=\"black\" size=\"5\">"  + setOfi +(cte.containsKey(setOfi)
										?(etc.containsKey(cte.get(setOfi))?":("+etc.get(cte.get(setOfi))+")":""):"") +  "</font></span>");
						continue Here;
					}
					if(pos.get(setOfi).contains("动")) {
						page.append("<span style=\"background:"+new PEU.P.image.Color_P().P(245, 255, 245)
								+"\"><font color=\"black\" size=\"5\">" + setOfi +(cte.containsKey(setOfi)
										?(etc.containsKey(cte.get(setOfi))?":("+etc.get(cte.get(setOfi))+")":""):"") + "</font></span>");
						continue Here;
					}
					if(pos.get(setOfi).contains("形")) {
						page.append("<span style=\"background:"+new PEU.P.image.Color_P().P(255, 255, 245)
								+"\"><font color=\"black\" size=\"5\">" + setOfi +(cte.containsKey(setOfi)
										?(etc.containsKey(cte.get(setOfi))?":("+etc.get(cte.get(setOfi))+")":""):"") + "</font></span>");
						continue Here;
					}
					if(pos.get(setOfi).contains("副")) {
						page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">" 
					+ setOfi +(cte.containsKey(setOfi)?(etc.containsKey(cte.get(setOfi))?":("
						+etc.get(cte.get(setOfi))+")":""):"") +  "</font></span>");
						continue Here;
					} 
					page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">" 
					+ setOfi +(cte.containsKey(setOfi)?(etc.containsKey(cte.get(setOfi))?":("
					+etc.get(cte.get(setOfi))+")":""):"") +  "</font></span>");			 
				}
			}	
	}

	public static void page英文注释(StringBuilder page, Map<String, String> cte, String key
			, Map<String, String> pos, List<String> sets, int currentPage){
		List<String> setsForGet = sets.subList(currentPage * 2000, (currentPage + 1)*2000<sets.size()
				? (currentPage + 1)*2000 : sets.size());
		Iterator<String> iterator = setsForGet.iterator();
		Here:
			while(iterator.hasNext()) {
				String setOfi = iterator.next();
				if(pos.get(setOfi) == null) {
					page.append("<span style=\"background:#F1F1F1\"><font color=\"black\" size=\"5\">" 
							+ setOfi +(cte.containsKey(setOfi)?":("+cte.get(setOfi)+")":"") + "</font></span>");
					continue Here;
				}
				if (!setOfi.equals("")) {
					if(key.contains(setOfi)&&(pos.get(setOfi).contains("名")||pos.get(setOfi).contains("动")
							||pos.get(setOfi).contains("形"))) {
						page.append("<span style=\"background:red\"><font color=\"white\">" + setOfi 
								+(cte.containsKey(setOfi)?":("+cte.get(setOfi)+")":"") + "</font></span>");
						continue Here;
					}
					if(pos.get(setOfi).contains("名")) {
						page.append("<span style=\"background:"+new PEU.P.image.Color_P().P(255, 245, 255)
								+"\"><font color=\"black\" size=\"5\">" + setOfi +(cte.containsKey(setOfi)
										?":("+cte.get(setOfi)+")":"") + "</font></span>");
						continue Here;
					}
					if(pos.get(setOfi).contains("动")) {
						page.append("<span style=\"background:"+new PEU.P.image.Color_P().P(245, 255, 245)
								+"\"><font color=\"black\" size=\"5\">" + setOfi +(cte.containsKey(setOfi)
										?":("+cte.get(setOfi)+")":"") + "</font></span>");
						continue Here;
					}
					if(pos.get(setOfi).contains("形")) {
						page.append("<span style=\"background:"+new PEU.P.image.Color_P().P(255, 255, 245)
								+"\"><font color=\"black\" size=\"5\">" + setOfi +(cte.containsKey(setOfi)
										?":("+cte.get(setOfi)+")":"") + "</font></span>");
						continue Here;
					}
					if(pos.get(setOfi).contains("副")) {
						page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">" 
								+ setOfi +(cte.containsKey(setOfi)?":("+cte.get(setOfi)+")":"") + "</font></span>");
						continue Here;
					} 
					page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">" + setOfi
							+(cte.containsKey(setOfi)?":("+cte.get(setOfi)+")":"") + "</font></span>");			 
				}
			}	
	}

	public static void page中文还原(StringBuilder page, String key, Map<String, String> pos, List<String> sets, int currentPage){
		List<String> setsForGet = sets.subList(currentPage * 2000, (currentPage + 1)*2000<sets.size()
				? (currentPage + 1)*2000 : sets.size());
		Iterator<String> iterator = setsForGet.iterator();
		Here:
			while(iterator.hasNext()) {
				String setOfi = iterator.next();
				if(pos.get(setOfi) == null) {
					page.append("<span style=\"background:#F1F1F1\"><font color=\"black\" size=\"5\">" 
				+ setOfi + "</font></span>");
					continue Here;
				}
				if (!setOfi.equals("")) {
					if(key.contains(setOfi)&&(pos.get(setOfi).contains("名")||pos.get(setOfi).contains("动")
							||pos.get(setOfi).contains("形"))) {
						page.append("<span style=\"background:red\"><font color=\"white\">"+setOfi +"</font></span>");
	    				continue Here;
	    			}
					if(pos.get(setOfi).contains("名")) {
						page.append("<span style=\"background:"+new PEU.P.image.Color_P().P(255, 245, 255)
								+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
						continue Here;
					}
					if(pos.get(setOfi).contains("动")) {
						page.append("<span style=\"background:"+new PEU.P.image.Color_P().P(245, 255, 245)
								+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
						continue Here;
					}
					if(pos.get(setOfi).contains("形")) {
						page.append("<span style=\"background:"+new PEU.P.image.Color_P().P(255, 255, 245)
								+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
						continue Here;
					}
					if(pos.get(setOfi).contains("副")) {
						page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">"
					+setOfi+"</font></span>");
						continue Here;
					} 
					page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">"+setOfi
							+"</font></span>");			 
				}
			}	
	}

	public static void page翻页(StringBuilder page, Map<String, WordFrequency> map, String key, Map<String, String> pos
			, List<String> sets, int currentPage){
		List<String> setsForGet = sets.subList(currentPage*2000, (currentPage + 1)*2000<sets.size()? (currentPage + 1)*2000 : sets.size());
		Iterator<String> iterator = setsForGet.iterator();
		Here:
			while(iterator.hasNext()) {
				String setOfi = iterator.next();
				if(pos.get(setOfi) == null) {
					page.append("<span style=\"background:#F1F1F1\"><font color=\"black\" size=\"5\">" + setOfi + "</font></span>");
					continue Here;
				}
				if(pos.get(setOfi).contains("名")||pos.get(setOfi).contains("动")||pos.get(setOfi).contains("形")) {
					if (map.containsKey(setOfi)) {
						WordFrequency wordFrequency = map.get(setOfi);
						wordFrequency.I_Frequency(wordFrequency.getFrequency() + StablePOS.INT_ONE);
						map.put(setOfi, wordFrequency);
					} else {
						WordFrequency wordFrequency = new WordFrequency();
						wordFrequency.I_Frequency(StablePOS.INT_ONE);
						wordFrequency.I_Word(setOfi);
						map.put(setOfi, wordFrequency);
					}
				}
				if (!setOfi.equals("")) {
					if(key.contains(setOfi)&&(pos.get(setOfi).contains("名")||pos.get(setOfi).contains("动")
							||pos.get(setOfi).contains("形"))) {
						page.append("<span style=\"background:red\"><font color=\"white\">"+setOfi+"</font></span>");
						continue Here;
					}
					if(pos.get(setOfi).contains("名")) {
						page.append("<span style=\"background:"+new PEU.P.image.Color_P().P(255, 245, 255)
								+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
						continue Here;
					}
					if(pos.get(setOfi).contains("动")) {
						page.append("<span style=\"background:"+new PEU.P.image.Color_P().P(245, 255, 245)
								+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
						continue Here;
					}
					if(pos.get(setOfi).contains("形")) {
						page.append("<span style=\"background:"+new PEU.P.image.Color_P().P(255, 255, 245)
								+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
						continue Here;
					}
					if(pos.get(setOfi).contains("副")) {
						page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
						continue Here;
					} 
					page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");			 
				}
			}
	}
}

