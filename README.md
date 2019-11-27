# 计181 2018310730 张博元
java的字符串的处理和应用，以及抛出异常。
一、实验目的
  掌握字符串String及其方法的使用，提供用户查询《长恨歌》中的字符的功能，同时返回给用户所查询的字符出现的次数。
  掌握异常处理结构，抛出用户输入的空字符引用异常。
  
  
二、实验要求
内容：利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能函数，并运行。达到如下功能：

1.每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”
2.允许提供输入参数，统计古诗中某个字或词出现的次数
3.考虑操作中可能出现的异常，在程序中设计异常处理程序

输入：汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行
输出：
汉皇重色思倾国，御宇多年求不得。
杨家有女初长成，养在深闺人未识。
天生丽质难自弃，一朝选在君王侧。
回眸一笑百媚生，六宫粉黛无颜色。
春寒赐浴华清池，温泉水滑洗凝脂。
侍儿扶起娇无力，始是新承恩泽时。
云鬓花颜金步摇，芙蓉帐暖度春宵。
春宵苦短日高起，从此君王不早朝。
 并且加上用户所查询的字符出现的次数，已经如果出现了异常，对于异常地处理和抛出。
 
 
三、实验过程
创建一个Canghenge类，用来处理《长恨歌》的文字，将其中的诗句隔七个加一个符号，奇数加逗号，偶数加句号。然后再接收用户输入的一个字符，判断这个字符在长恨歌中出现的次数，将用户输出的字数输出。
创建一个NewExpection类，用于抛出异常，用于检测用户的输入字符，若为空字符，就将异常抛出。
创建Test类，调用Changhenge类和NewExpection类，赋予用户一个查询的端口，同时设置抛出异常程序。


四、流程图
![text](https://github.com/RainsWeep/Java-String/blob/master/%E6%9C%AA%E5%91%BD%E5%90%8D%E6%96%87%E4%BB%B6(13).jpg)

五、核心代码和注释
	int last = s.length();
  //定义last为长恨歌字符串长度
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
   //隔七个加一个符号，奇数加逗号，偶数加句号
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
  //查询用户键入的字符在字符串中出现的次数
  public class NewException extends Exception{
	public NewException(){
 	}
	public NewException(String str){ 
            super(str);
 	}
  }
  //新建一个类用于自定义异常
  try {
		changhenge = new Changhenge(write);
		if(write == "") 
		{
			throw new NewException("不能输入空字符");
		}
		else 
			System.out.print(changhenge);
		}
		catch (NewException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			System.out.print("程序运行结束");
		}
  //catch捕获异常，throw抛出异常


六、运行截图
用户键入“不”的结果：i[image.text](https://github.com/RainsWeep/Java-String/blob/master/1573627121(1).png)
用户键入“”，即键入空字符的结果：https://github.com/RainsWeep/Java-String/blob/master/1573627154(1).png


七、编程感想
本次编程的过程中我了解了String和StringBuffer的各种用法和其中的方法，学会了如何处理字符串，并且学习了如何查询和输出字符串中包含的字符。
也学习了如何处理异常，将系统内置方法无法处理的异常进行自定义，起到抛出异常的作用。
虽然遇到很多问题，但是在不断的努力后，我成功的编写出了这次试验，我还会继续完善我的Java知识储备，达到学以致用。
