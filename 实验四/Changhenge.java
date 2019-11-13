package 实验四;
import java.util.*;
import java.util.regex.*;
public class Changhenge {
	
	String d = "汉皇重色思倾国御宇多年求不得杨家有女初长成养在"
			+ "深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百"
			+ "媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍"
			+ "儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖"
			+ "度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇"
			+ "春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆"
			+ "成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门"
			+ "户遂令天下父母心不重生男重生女骊宫高处入青云仙乐"
			+ "风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动"
			+ "地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行";
	StringBuffer s = new StringBuffer(d);
	String j ;
	int g;
	int last = s.length();

	public Changhenge(String j)
	{
		String c = j;
		for(int i = last - 7; i > 0; i-=7) 
		{
			if(i%14==0)
			{
				s.insert(i,'。');
				s.insert(i+1,'\n');
			}
			else s.insert(i,'，');
			}
		
		
		StringTokenizer a = new StringTokenizer(d,c);
		int number = a.countTokens();
		while(a.hasMoreTokens()) 
		{
			String k = a.nextToken();
      
		}
		if(c.equals("行"))
		{
			number = number;
		}
		else if(c.equals("汉")) 
		{
			number = number;
		}
		else 
		{
			number=number -1;
		}
		 g = number;
	}
		
		
	public String toString() 
	{
			return s + "。" + '\n' +"所查字出现过："+g+"次。";
	}
}
