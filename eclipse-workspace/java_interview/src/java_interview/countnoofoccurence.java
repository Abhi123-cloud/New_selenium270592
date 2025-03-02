package java_interview;

import java.util.HashMap;

public class countnoofoccurence 
{
public static <Chractors> void main(String[] args) 

{  String str = "AbhilashAbhilashAbhilashAbhilash";
int count = 1;
HashMap<Character, Integer> map = new HashMap<>();

char[] ch = str.toCharArray();
for (int i = 0; i < ch.length; i++) {
    if (!map.containsKey(ch[i])) {
        map.put(ch[i], count);
    }
    else
    {
    	map.put(ch[i],map.get(ch[i])+1);
    }
}

for(Character key:map.keySet())
{
	if(map.get(key)>1)
	{
		System.out.println(key+" :"+map.get(key));
	}
}


}
}
