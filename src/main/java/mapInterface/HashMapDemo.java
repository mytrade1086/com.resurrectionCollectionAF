package mapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
	
		HashMap<String,String> hm=new HashMap<String,String>(); //default size 16
		
		System.out.println(hm.put("name","sumit"));  //null since there is no key "name"
		System.out.println(hm.put("name","sumit"));  //sumit since "name" keys old value was "sumit"	
		System.out.println(hm.put("name","sagar")); //"sumit" as its old key value
		
		System.out.println(hm.containsKey("name")); //true
		System.out.println(hm.containsKey("xxx")); //false
		System.out.println(hm.containsValue("sumit")); //false
        System.out.println(hm.containsValue("sagar")); //true
		System.out.println(hm.containsKey("xxx")); //false
		hm.put("job","QA");
		System.out.println(hm); //{city=bhandara, name=sumit, job=QA}
		System.out.println(hm.get("job"));//QA		
		System.out.println(hm.size());//3
		
		System.out.println(hm.get("Job")); //null
		System.out.println(hm.get(0));//null
		System.out.println(hm.entrySet());  //[city=bhandara, name=sumit, job=QA]  See square bracket
		System.out.println(hm.keySet()); //[name, job]
		System.out.println(hm.values()); //[sagar, QA]
	
		//#1 Iterating
		for(Entry<String, String> es :hm.entrySet()){		
		System.out.println(es.getKey()+"  "+es.getValue());
		//name  sagar
		//job  QA
		}
		
		//#2 Lambda
		hm.forEach((k,v)->System.out.println(k+"====="+v));
//		name=====sagar
//		job=====QA
//				
				
		
	}

}
