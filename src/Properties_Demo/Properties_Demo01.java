package Properties_Demo;

import java.security.Key;
import java.util.Properties;
import java.util.Set;

/*
属性集  Properties
* 1.Properties类     Properties 继承于 Hashtable  它使用键值结构存储数据，每个键及其对应值都是一个字符串
* 2.构造方法：       public Properties() :创建一个空的属性列表。
* 3.常用方法：
*           1.setProperty(String key, String value)`： 保存一对属性。
*           2.getProperty(String key) ：使用此属性列表中指定的键搜索属性值。
*           3.Set<String> stringPropertyNames()  ：所有键的名称的集合。
*
*/
public class Properties_Demo01 {
    public static void main(String[] args) {
        Properties ps = new Properties();
        //存储一对键值对
        ps.setProperty("1", "张三");
        ps.setProperty("2", "张三");
        System.out.println(ps);

        //通过键获得值
        System.out.println(ps.getProperty("1"));

        //键值对集合
        Set<String> strings = ps.stringPropertyNames();
        //遍历键值对，通过键获得值
        for (String s : strings) {
            System.out.println(s + ps.getProperty(s));
        }
    }
}
