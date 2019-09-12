package Properties_Demo.Properies_Test;
/*
描述:
我有一个文本文件score.txt，我知道数据是键值对形式的，但是不知道内容是什么。
请写一个程序判断是否有"lisi"这样的键存在，如果有就改变其实为"100"
score.txt文件内容如下：
zhangsan = 90
lisi = 80
wangwu = 85
*/
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Properties_Demo02 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("score.txt");
        Properties properties = new Properties(); //创建属性集合
        properties.load(fr); //读取文本信息存储到集合中
        Set<String> strings = properties.stringPropertyNames(); //获得所有键的名称的集合。
        //遍历集合进行判断
        for (String s : strings) {
            if(s.contains("lisi")){
                properties.setProperty("lisi","100");
            }
        }
        for (String s : strings) {
            System.out.println(s+"\t"+properties.getProperty(s));
        }
    }
}
