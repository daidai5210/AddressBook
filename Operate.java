package AddressBook;

import java.io.*;
import java.util.*;

import static java.lang.String.valueOf;

public class Operate {
    static ArrayList<Person> personarr = new ArrayList<>();
    Menu menu = new Menu();
    static String id;
    static int line=1;

    //添加联系人进程
    void addlogic() throws Exception {
        ReadFile();
        Person tempperson = new Person();
        TelNoteRegex regex = new TelNoteRegex();
        clear();
        personarr.clear();
        System.out.println("请输入您要添加的联系人信息...");
        //添加联系人姓名
        String name = regex.nameregex();
        tempperson.setName(name);
        //添加联系人年龄
        String age = regex.ageregex();
        tempperson.setAge(age);
        //添加联系人性别
        String sex = (regex.sexregex());
        tempperson.setSex(sex);
        //添加联系人手机号
        String telnum;
        tempperson.setTelNum(regex.telnumregex());
        //添加联系人地址
        System.out.print("输入地址 :");
        tempperson.setAddress(new Scanner(System.in).nextLine());
        tempperson.setId(line);
        personarr.add(tempperson);
        FileWriter Writeout = new FileWriter("Person.txt", true);
        Writeout.write(personarr.get(0).toString() + "\n");
        personarr.clear();
        Writeout.close();
        System.out.println("已将" + name.trim() + "添加到联系人列表！");
        System.out.println("系统将在2秒后返回上一层…");
        Thread.sleep(2000);
        menu.addMenu();
    }

    //查看所有联系人
    void showAll() throws Exception {
        personarr.clear();
        ReadFile();
        TelNoteRegex regex = new TelNoteRegex();
        clear();
        Iterator iter = personarr.iterator();
        while (iter.hasNext()) {
            String str=iter.next().toString();
                String[] strarr = str.split("-");
            System.out.println("序号  " + "#" + Integer.parseInt(strarr[0]) + "   姓名:" + strarr[1] + "   年龄:" + strarr[2] + "   性别:" + strarr[3] + "   手机号:" + strarr[4] + "   住址:" + strarr[5]);
        }
        System.out.print("返回主菜单请输入1，退出程序请输入2:");
        switch (regex.regex()) {
            case "1":
                menu.mainMenu();
                break;
            case "2": {
                System.out.print("正在退出程序，请稍等…");
                Thread.sleep(2000);
                break;
            }
            default: {
                System.out.println("您的输入有误，请检查后重新输入！");
                System.out.println("系统将在2秒内返回主菜单……");
                Thread.sleep(2000);
                clear();
                menu.mainMenu();
            }
        }
    }

    //按姓名查找联系人
    void searchByName() throws Exception {
        TelNoteRegex regex = new TelNoteRegex();
        System.out.print("请输入你要查询的联系人姓名：");
        String name = regex.regex();
        Person tempname = null;
        int i;
        boolean flog = false;
        for (i = 0; i < personarr.size(); i++) {
            tempname = personarr.get(i);
            if (tempname.getName().trim().equals(name)) {
                System.out.println("序号  " + "#" + tempname.getId() + "   姓名:" + tempname.getName() + "   年龄:" + tempname.getAge() + "   性别:" + tempname.getSex() + "   手机号:" + tempname.getTelNum() + "   住址:" + tempname.getAddress());
                flog = true;
                if (i == personarr.size() - 1) {
                    System.out.print("已为你找到以上联系人，编辑联系人请回复1，返回上一级请回复2 :");
                    search2Menuregex();
                }
            }
            if (i == personarr.size() - 1) {
                if (tempname.getName().equals(name) == false) {
                    if (flog == false) {
                        System.out.println("没有搜索到该联系人！\n系统将在2秒后返回到上一层...");
                        Thread.sleep(2000);
                        menu.searchMenu();
                        break;
                    } else if (flog == true) {
                        menu.search1Menu();
                        break;
                    }
                }
            }


        }
    }


    //按年龄查找联系人
    void searchByAge() throws Exception {
        TelNoteRegex regex = new TelNoteRegex();
        System.out.print("请输入你要查询的联系人年龄：");
        String age = regex.regex();
        Person tempname = null;
        int i;
        boolean flog = false;
        for (i = 0; i < personarr.size(); i++) {
            tempname = personarr.get(i);
            if (tempname.getAge().trim().equals(age)) {
                System.out.println("序号  " + "#" + tempname.getId() + "   姓名:" + tempname.getName() + "   年龄:" + tempname.getAge() + "   性别:" + tempname.getSex() + "   手机号:" + tempname.getTelNum() + "   住址:" + tempname.getAddress());
                flog = true;
                if (i == personarr.size() - 1) {
                    System.out.print("已为你找到以上联系人，编辑联系人请回复1，返回上一级请回复2 :");
                    search2Menuregex();

                }
            }
            if (i == personarr.size() - 1) {
                if (tempname.getAge().equals(age) == false) {
                    if (flog == false) {
                        System.out.println("没有搜索到该联系人！\n系统将在2秒后返回到上一层...");
                        Thread.sleep(2000);
                        menu.searchMenu();
                        break;
                    } else if (flog == true) {
                        menu.search1Menu();
                        break;
                    }
                }
            }


        }
    }

    //按性别查找联系人
    void searchBySex() throws Exception {
        TelNoteRegex regex = new TelNoteRegex();
        System.out.print("请输入你要查询的联系人性别：");
        String sex = regex.regex();
        Person tempname = null;
        int i;
        boolean flog = false;
        for (i = 0; i < personarr.size(); i++) {
            tempname = personarr.get(i);
            if (tempname.getSex().equals(sex)) {
                System.out.println("序号  " + "#" + tempname.getId() + "   姓名:" + tempname.getName() + "   年龄:" + tempname.getAge() + "   性别:" + tempname.getSex() + "   手机号:" + tempname.getTelNum() + "   住址:" + tempname.getAddress());
                flog = true;
                if (i == personarr.size() - 1) {
                    System.out.print("已为你找到以上联系人，编辑联系人请回复1，返回上一级请回复2 :");
                    search2Menuregex();

                }
            }
            if (i == personarr.size() - 1) {
                if (tempname.getSex().equals(sex) == false) {
                    if (flog == false) {
                        System.out.println("没有搜索到该联系人！\n系统将在2秒后返回到上一层...");
                        Thread.sleep(2000);
                        menu.searchMenu();
                        break;
                    } else if (flog == true) {
                        menu.search1Menu();
                        break;
                    }
                }
            }


        }
    }


    //按住址查找联系人
    void searchByAddress() throws Exception {
        TelNoteRegex regex = new TelNoteRegex();
        System.out.print("请输入你要查询的联系人住址：");
        String address = regex.regex();
        Person tempname = null;
        int i;
        boolean flog = false;
        for (i = 0; i < personarr.size(); i++) {
            tempname = personarr.get(i);
            if (tempname.getAddress().equals(address)) {
                System.out.println("序号  " + "#" + tempname.getId() + "   姓名:" + tempname.getName() + "   年龄:" + tempname.getAge() + "   性别:" + tempname.getSex() + "   手机号:" + tempname.getTelNum() + "   住址:" + tempname.getAddress());
                flog = true;
                if (i == personarr.size() - 1) {
                    System.out.print("已为你找到以上联系人，编辑联系人请回复1，返回上一级请回复2 :");
                    search2Menuregex();

                }
            }
            if (i == personarr.size() - 1) {
                if (tempname.getSex().equals(address) == false) {
                    if (flog == false) {
                        System.out.println("没有搜索到该联系人！\n系统将在2秒后返回到上一层...");
                        Thread.sleep(2000);
                        menu.searchMenu();
                        break;
                    } else if (flog == true) {
                        menu.search1Menu();
                        break;
                    }
                }
            }


        }
    }

    //按手机号查找联系人
    void searchByTelNum() throws Exception {
        TelNoteRegex regex = new TelNoteRegex();
        System.out.print("请输入你要查询的联系人手机号：");
        String telnum = regex.regex();
        Person tempname = null;
        int i;
        boolean flog = false;
        for (i = 0; i < personarr.size(); i++) {
            tempname = personarr.get(i);
            if (tempname.getTelNum().equals(telnum)) {
                System.out.println("序号  " + "#" + tempname.getId() + "   姓名:" + tempname.getName() + "   年龄:" + tempname.getAge() + "   性别:" + tempname.getSex() + "   手机号:" + tempname.getTelNum() + "   住址:" + tempname.getAddress());
                flog = true;
                if (i == personarr.size() - 1) {
                    System.out.print("已为你找到以上联系人，编辑联系人请回复1，返回上一级请回复2 :");
                    search2Menuregex();

                }
            }
            if (i == personarr.size() - 1) {
                if (tempname.getSex().equals(telnum) == false) {
                    if (flog == false) {
                        System.out.println("没有搜索到该联系人！\n系统将在2秒后返回到上一层...");
                        Thread.sleep(2000);
                        menu.searchMenu();
                        break;
                    } else if (flog == true) {
                        menu.search1Menu();
                        break;
                    }
                }
            }


        }
    }


    //修改指定记录
    void modify() throws Exception {
        clear();
        System.out.print("请输入您将要修改的联系人的ID：");
        TelNoteRegex regex = new TelNoteRegex();
        this.id = regex.regex();
        Person tempname = null;
        int i = 0;
        boolean flog = false;
        for (i = 0; i < personarr.size(); i++) {
            tempname = personarr.get(i);
            if (valueOf(tempname.getId()).equals(this.id)) {
                flog = true;
                modifyofid();
                break;
            }
            if (i == personarr.size() - 1) {
                if (valueOf(tempname.getId()).equals(this.id) == false && flog == false) {
                    System.out.println("列表中无该联系人！\n系统将在2秒后返回到上一层...");
                    Thread.sleep(2000);
                    menu.modifyMenu();
                    break;
                }
            }
        }
        if (i == 0) {
            System.out.println("列表中无该联系人！\n系统将在2秒后返回到上一层...");
            Thread.sleep(2000);
            menu.modifyMenu();
        }
    }

    //修改联系人的属性
    void modifyofid() throws Exception {
        TelNoteRegex regex = new TelNoteRegex();
        menu.subModifyMenu();
        String temp = modifyofidregex(regex.regex());
        Person tempname = null;
        int i;
        boolean flog = false;
        for (i = 0; i < personarr.size(); i++) {
            tempname = personarr.get(i);
            if (valueOf(tempname.getId()).equals(this.id)) {
                clear();
                System.out.println("修改前：" + "#" + tempname.getId() + "   姓名:" + tempname.getName() + "   年龄:" + tempname.getAge() + "   性别:" + tempname.getSex() + "   手机号:" + tempname.getTelNum() + "   住址:" + tempname.getAddress());
                flog = true;
                System.out.print("请输入修改后的" + temp + ":");
                switch (temp) {
                    case "姓名":
                        personarr.get(i).setName(regex.regex());
                        break;
                    case "年龄":
                        personarr.get(i).setAge(regex.regex());
                        break;
                    case "性别":
                        personarr.get(i).setSex(regex.regex());
                        break;
                    case "地址":
                        personarr.get(i).setAddress(regex.regex());
                        break;
                    case "号码":
                        personarr.get(i).setTelNum(regex.regex());
                        break;
                    case "6":
                        menu.modifyMenu();
                    case "no":
                        System.out.println("您的输入有误，系统将在两秒内返回上一级...");
                        Thread.sleep(2000);
                        menu.modifyMenu();
                        break;
                }
                System.out.println("修改后：" + "#" + tempname.getId() + "   姓名:" + tempname.getName() + "   年龄:" + tempname.getAge() + "   性别:" + tempname.getSex() + "   手机号:" + tempname.getTelNum() + "   住址:" + tempname.getAddress());
                System.out.println("修改成功！\n");
                break;
            }
        }
        System.out.print("返回上一层请输入1，返回主菜单请输入2，退出程序请输入3 :");
        switch (regex.regex()) {
            case "1":
                menu.modifyMenu();
                break;
            case "2":
                menu.mainMenu();
                break;
            case "3":
                break;
            default: {
                System.out.println("您的输入有误，请检查后重新输入！");
                System.out.print("系统将在2秒内返回上一层……");
                Thread.sleep(2000);
                clear();
                menu.modifyMenu();
            }
        }

    }


    //删除全部记录
    void deleteAll() throws Exception {
        personarr.removeAll(personarr);
        System.out.println("删除成功！\n系统将在2秒后返回到上一层...");
        Thread.sleep(2000);
        menu.deleteMenu();
    }

    //删除指定联系人
    void delete() throws Exception {
        clear();
        System.out.print("请输入您将要删除的联系人的ID：");
        TelNoteRegex regex = new TelNoteRegex();
        this.id = regex.regex();
        Person tempname = null;
        int i = 0;
        boolean flog = false;
        for (i = 0; i < personarr.size(); i++) {
            tempname = personarr.get(i);
            if (valueOf(tempname.getId()).equals(this.id)) {
                flog = true;
                personarr.remove(personarr.get(i));
                System.out.println("删除成功！\n系统将在2秒后返回到上一层...");
                Thread.sleep(2000);
                menu.deleteMenu();
                break;
            }
            if (i == personarr.size() - 1) {
                if (valueOf(tempname.getId()).equals(this.id) == false && flog == false) {
                    System.out.println("列表中无该联系人！\n系统将在2秒后返回到上一层...");
                    Thread.sleep(2000);
                    menu.deleteMenu();
                    break;
                }
            }
        }
        if (i == 0) {
            System.out.println("列表中无该联系人！\n系统将在2秒后返回到上一层...");
            Thread.sleep(2000);
            menu.deleteMenu();
        }
    }


    //按照年龄排序
    class AgeComparator implements Comparator<Person> {
        public int compare(Person p1, Person p2) {
            return p1.getAge().compareTo(p2.getAge());
        }
    }

    public void orderAge() throws Exception {
        Collections.sort(personarr, new AgeComparator());
        clear();
        System.out.println("排序成功！");
        System.out.println("系统将在2秒后返回到上一层...");
        Thread.sleep(2000);
        menu.orderMenu();
    }


    //按照姓名排序
    class NameComparator implements Comparator<Person> {
        public int compare(Person p1, Person p2) {
            return p1.getName().compareTo(p2.getName());
        }
    }

    public void orderName() throws Exception {
        Collections.sort(personarr, new NameComparator());
        clear();
        System.out.println("排序成功！");
        System.out.println("系统将在2秒后返回到上一层...");
        Thread.sleep(2000);
        menu.orderMenu();
    }


    //按照性别排序
    class SexComparator implements Comparator<Person> {
        public int compare(Person p1, Person p2) {
            return p1.getSex().compareTo(p2.getSex());
        }
    }

    public void orderSex() throws Exception {
        Collections.sort(personarr, new SexComparator());
        clear();
        System.out.println("排序成功！");
        System.out.println("系统将在2秒后返回到上一层...");
        Thread.sleep(2000);
        menu.orderMenu();
    }

    void search2Menuregex() throws Exception {
        TelNoteRegex regex = new TelNoteRegex();
        switch (regex.regex()) {
            case "1":
                menu.subModifyMenu();
                break;
            case "2":
                menu.searchMenu();
                break;
            default: {
                System.out.println("您的输入有误，请检查后重新输入！");
                System.out.println("系统将在2秒内返回主菜单……");
                Thread.sleep(2000);
                clear();
                menu.mainMenu();
            }
        }
    }


    String modifyofidregex(String temp1) {
        String temp2 = "temp";
        if (temp1.equals("1"))
            temp2 = "姓名";
        else if (temp1.equals("2"))
            temp2 = "年龄";
        else if (temp1.equals("3"))
            temp2 = "性别";
        else if (temp1.equals("4"))
            temp2 = "地址";
        else if (temp1.equals("5"))
            temp2 = "号码";
        else if (temp1.equals("6"))
            temp2 = "6";
        else {
            temp2 = "no";
        }
        return temp2;
    }


    //清屏效果
    void clear() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    //加载联系人文件
    void ReadFile()throws Exception{
            FileReader read = new FileReader("Person.txt");
            BufferedReader br = new BufferedReader(read);
            String str;
            while((str=br.readLine())!=null){
                line++;
                String[] strarr = str.split("-");
                personarr.add(new Person(Integer.parseInt(strarr[0]),strarr[1],strarr[2],strarr[3],strarr[4],strarr[5]));
            }
            br.close();
            read.close();
    }
}

