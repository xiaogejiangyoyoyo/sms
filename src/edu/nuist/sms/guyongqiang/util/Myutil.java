package edu.nuist.sms.guyongqiang.util;

import java.util.HashMap;
import java.util.Map;

public class Myutil {
	
	public static Map<String,String> interestMap = new HashMap<>();
	public static Map<String,String> placeMap = new HashMap<>();
	
	static{
		
		/*<input type="checkbox" name="interest" value="sing">唱歌
          <input type="checkbox" name="interest" value="dance">跳舞
          <input type="checkbox" name="interest" value="food">美食
          <input type="checkbox" name="interest" value="study">学习
          <br>
          <input type="checkbox" name="interest" value="film">电影
          <input type="checkbox" name="interest" value="sport">运动
          <input type="checkbox" name="interest" value="game">游戏
           <input type="checkbox" name="interest" value="reading">阅读
    */
		interestMap.put("sing","唱歌");
		interestMap.put("dance","跳舞");
		interestMap.put("food","美食");
		interestMap.put("study","学习");
		interestMap.put("film","电影");
		interestMap.put("sport","运动");
		interestMap.put("game","游戏");
		interestMap.put("reading","阅读");
		
		/*<option value="0">=请选择=</option>
          <option value="1">南京</option>
          <option value="2">镇江</option>
          <option value="3">常州</option>
          <option value="4">无锡</option>
          <option value="5">苏州</option>
          <option value="6">扬州</option>
          <option value="7">泰州</option>
          <option value="8">南通</option>
          <option value="9">淮安</option>
          <option value="10">宿迁</option>
          <option value="11">盐城</option>
          <option value="12">徐州</option>
          <option value="13">连云港</option>
		*/
		
		 placeMap.put("0","无");
		 placeMap.put("1","南京");
		 placeMap.put("2","镇江");
		 placeMap.put("3","常州");
		 placeMap.put("4","无锡");
		 placeMap.put("5","苏州");
		 placeMap.put("6","扬州");
		 placeMap.put("7","泰州");
		 placeMap.put("8","南通");
		 placeMap.put("9","淮安");
		 placeMap.put("10","宿迁");
		 placeMap.put("11","盐城");
		 placeMap.put("12","徐州");
		 placeMap.put("13","连云港");
		
		
		
	}
	
	public static String stringArrayToString(String[] array){
		String str ="";
		for(int i=0;i<array.length;i++){
		
		str += array[i];
		if(i<array.length-1){
			str += ",";
			
		
		}
		}
		return str;
	}

	
	
	
	
	
	
	
	
	
	
	
}
