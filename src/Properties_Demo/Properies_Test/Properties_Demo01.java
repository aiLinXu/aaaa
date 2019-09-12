package Properties_Demo.Properies_Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
描述:
我有一个文本文件score.txt，我知道数据是键值对形式的，但是不知道内容是什么。
请写一个程序判断是否有"lisi"这样的键存在，如果有就改变其实为"100"
score.txt文件内容如下：
zhangsan = 90
lisi = 80
wangwu = 85
*/
public class Properties_Demo01 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("score.txt");
        Properties properties = new Properties();
        properties.setProperty("zhangsan =","90");
        properties.setProperty("lisi = ","80");
        properties.setProperty("wangwu = ","85");
        Set<String> strings = properties.stringPropertyNames();
        for (String s : strings) {
            String s1 = s + properties.getProperty(s);
            fw.write(s1+"\r\n");
            fw.flush();
        }
        fw.close();

    }
}
