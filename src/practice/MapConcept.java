package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapConcept {

	public static void main(String[] args) {
		String source = " Java is a most robust language and used by many Java programmers language";
		String words[] = source.split(" ");
		Map<String,Integer> wordcount = new HashMap<String,Integer>();
		for( String word : words)
		{
			if(wordcount.containsKey(word))
			{
				wordcount.put(word, wordcount.get(word)+1);
			}
			else
			{
				wordcount.put(word, 1);
			}
		}
		
		Set<String> ws = wordcount.keySet();
		
		for(String sw: ws)
		{
			if(wordcount.get(sw)>1)
			{
				System.out.println(sw+" count is: "+wordcount.get(sw));
			}
				
		}
		

	}

}
