package AddressBook;

import java.io.*;
import java.util.Collections;
import java.util.Comparator;

class Person implements Serializable{
    private int id; //用户ID 属性
    private String name; //用户姓名属性
    private String age; //用户年龄属性
    private String sex; //用户性别属性
    private String telNum; //用户电话号码属性
    private String address; //用户地址属性

    public Person() {
    }   //无参构造

    public Person(String name, String age, String sex, String telNum, String address) {
    }//有参数构造方法

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        //id 输出长度控制
        return "序号  " + "#" + id + "   姓名:" + name + "   年龄:" + age + "   性别:" + sex + "   手机号:" + telNum + "   住址:" + address;
    }

    //按年龄排序

}
