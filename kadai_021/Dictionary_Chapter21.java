package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
		
		//英単語の辞書
		HashMap<String,String> fruit = new HashMap<String,String>();
		
		public Dictionary_Chapter21 () {
			
			fruit.put("apple", "りんご");
			fruit.put("peach", "桃");
			fruit.put("banana", "バナナ");
			fruit.put("lemon", "レモン");
			fruit.put("pear","梨");
			fruit.put("kiwi", "キウィ");
			fruit.put("strawberry", "いちご");
			fruit.put("grape", "ぶどう");
			fruit.put("muscat","マスカット");
			fruit.put("cherry", "さくらんぼ");
			
		}
		
		
	
	
	
	public void checkWords(String[]fruitWord) {
		for(String words : fruitWord) {
			if(fruit.containsKey(words)) {
				System.out.println(words+ "の意味は"+ fruit.get(words));
			}else {
				System.out.println(words+"は辞書に存在しません");
				}
		
		
	}
	
		
	}
 }

