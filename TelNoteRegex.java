package AddressBook;

import java.util.Scanner;

public class TelNoteRegex {
    Menu menu = new Menu();
    Operate operate = new Operate();

    //接收键盘输入的方法
    String regex() {
        return new Scanner(System.in).nextLine();
    }

    //验证联系人姓名
    String nameregex() throws Exception {
        System.out.print("输入姓名，1-6位字母 :");
        Operate ope = new Operate();
        char[] arr = new char[100];
        int sum = 0;
        String name = new Scanner(System.in).nextLine();
        //验证姓名是否为字母，以及字数
        if (name == null) {
            System.out.println("您的输入有误，请检查后重新输入！");
            System.out.println("系统将在2秒后返回上一层…");
            Thread.sleep(2000);
            ope.addlogic();
        } else {
            if (!name.matches("[a-zA-Z]+")) {
                System.out.println("用户名中含有字符或数字，请检查后重新输入！");
                System.out.println("系统将在2秒后返回上一层…");
                Thread.sleep(2000);
                ope.addlogic();
            } else {
                for (int i = 0; i < name.length(); i++) {
                    arr[i] = name.charAt(i);
                    sum++;
                    if (sum > 6) {
                        System.out.println("姓名字数超出限制，请检查后重新输入！");
                        System.out.println("系统将在2秒后返回上一层…");
                        Thread.sleep(2000);
                        ope.addlogic();
                    }
                }
            }
        }
        return name;
    }


    //验证联系人年龄
    String ageregex() throws Exception {
        String agetemp = null;
        while (true) {
            System.out.print("输入年龄，1-150 ：");
            String age = regex();
            if (age.matches("[0-9]+")) {
                if (Integer.parseInt(age) >= 1 && Integer.parseInt(age) <= 150) {
                    agetemp = age;
                        break;
                } else {
                    System.out.println("您输入的年龄不符合实际或含有字符，请检查后重新输入！");
                    System.out.println("系统将在2秒后返回上一层…");
                    Thread.sleep(2000);
                }
            } else {
                System.out.println("您输入的年龄不符合实际或含有字符，请检查后重新输入！");
                System.out.println("系统将在2秒后返回上一层…");
                Thread.sleep(2000);
            }
        }
        return agetemp;
    }


    //验证性别
    String sexregex() throws Exception {
        String sextemp = null;
        while (true) {
            System.out.print("输入性别(男or女) :");
            String sex = regex();
            if (sex.equals("男") || sex.equals("女")) {
                sextemp = sex;
                break;
            } else {
                System.out.println("您输入的性别不符合实际或含有字符，请检查后重新输入！");
                System.out.println("系统将在2秒后返回上一层…");
                Thread.sleep(2000);
            }
        }
        return sextemp;
    }

    //验证手机号
    String telnumregex() throws Exception {
        String telnumtemp = null;
        while (true) {
            System.out.print("输入11位手机号 :");
            String telnum = regex();
            if (!telnum.matches("[a-zA-Z]+")) {
                //if(telnum.matches("^(13[0-9]|14[0-9]|15[0-9]|16[0-9]|17[0-9]|18[0-9]|19[0-9])\\d{8}$")){
                if (telnum.matches("^((13[0-9])|(14[0,1,4-9])|(15[0-3,5-9])|(16[2,5,6,7])|(17[0-8])|(18[0-9])|(19[0-3,5-9]))\\d{8}$")) {
                    telnumtemp = telnum;
                    break;
                } else {
                    System.out.println("您输入的手机号不符合实际，请检查后重新输入！");
                    System.out.println("系统将在2秒后返回上一层…");
                    Thread.sleep(2000);
                }
            } else {
                System.out.println("您输入的手机号含有字符，请检查后重新输入！");
                System.out.println("系统将在2秒后返回上一层…");
                Thread.sleep(2000);
            }
        }
        return telnumtemp;
    }

}