package Writer_Demo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*需求说明：从控制台接收3名学员的信息，每条信息存储到一个Student对象中，
将多个Student对象存储到一个集合中。
输入完毕后，将所有学员信息存储到文件Student.txt中。每名学员信息存储一行，多个属性值中间用逗号隔开。
String name;
String sex;
int age;
int id;
*/
public class Demo01 {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> students = new ArrayList<>();
        FileWriter fw = new FileWriter("D:\\HardWork\\MyWorkSpace01\\javaSE_68_day10\\src\\Writer_Demo\\Student.txt");
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <=3 ; i++) {
            System.out.println("请输入第"+i+"名学生姓名：");
            String s = sc.nextLine();
            System.out.println("请输入第"+i+"名学生性别：");
            String s1 = sc.nextLine();
            System.out.println("请输入第"+i+"名学生年龄：");
            String s2 = sc.nextLine();
            System.out.println("请输入第"+i+"名学生学号：");
            String s3 = sc.nextLine();
            Student student = new Student(s, s1, s2, s3);
            students.add(student);
        }
        for (Student student : students) {
            String s = student.getName()+"\t" + student.getSex()+"\t" + student.getAge()+"\t" + student.getId();
            fw.write(s+"\r\n");

        }
        fw.flush();
        fw.close();

    }
}
