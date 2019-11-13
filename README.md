# 计181 2018310730 张博元
java的字符串的处理和应用，已经抛出异常。
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
(https://github.com/RainsWeep/你的repository仓库名/raw/分支名master/刚你新建的图片文件夹名称/***.png或者***.jpg)
