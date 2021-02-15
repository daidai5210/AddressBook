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
    String nameregex() throws Exception{
        System.out.print("输入姓名，1-6位字母 :");
        Operate ope = new Operate();
        char[] arr=new char[100];
        int sum=0;
        String name = new Scanner(System.in).nextLine();
        //验证姓名是否为字母，以及字数
        if (name==null){
            System.out.println("您的输入有误，请检查后重新输入！");
            System.out.println("系统将在2秒后返回上一层…");
            Thread.sleep(2000);
            ope.addlogic();
        }
        else{
            if (!name.matches("[a-zA-Z]+")){
                System.out.println("用户名中含有字符或数字，请检查后重新输入！");
                System.out.println("系统将在2秒后返回上一层…");
                Thread.sleep(2000);
                ope.addlogic();
            }
            else{
                for (int i=0;i<name.length();i++){
                    arr[i]=name.charAt(i);
                    sum++;
                    if (sum>6){
                        System.out.println("姓名字数超出限制，请检查后重新输入！");
                        System.out.println("系统将在2秒后返回上一层…");
                        Thread.sleep(2000);
                        ope.addlogic();
                    }
                }
            }
        }
        //将姓名格式化
        switch(sum){
            case 1:
                name=name+"     ";
                break;
            case 2:
                name=name+"    ";
                break;
            case 3:
                name=name+"   ";
                break;
            case 4:
                name=name+"  ";
                break;
            case 5:
                name=name+" ";
                break;
            case 6:
                name=name;
                break;
        }
        return name;
    }


    //验证联系人年龄
    String ageregex() throws Exception {
        String agetemp=null;
       while(true){
           System.out.print("输入年龄，1-150 ：");
           String age=regex();
           if(age.matches("[0-9]+")){
               if (Integer.parseInt(age) >= 1 && Integer.parseInt(age) <= 150) {
                   if(Integer.parseInt(age)>=1&&Integer.parseInt(age)<=9){
                       agetemp=age+"  ";
                       break;
                   }
                   else if(Integer.parseInt(age)>=10&&Integer.parseInt(age)<=99){
                       agetemp=age+" ";
                       break;
                   }
                   else if(Integer.parseInt(age)>=100&&Integer.parseInt(age)<=150){
                       agetemp=age;
                       break;
                   }
               } else {
                   System.out.println("您输入的年龄不符合实际或含有字符，请检查后重新输入！");
                   System.out.println("系统将在2秒后返回上一层…");
                   Thread.sleep(2000);
               }
           }
           else {
               System.out.println("您输入的年龄不符合实际或含有字符，请检查后重新输入！");
               System.out.println("系统将在2秒后返回上一层…");
               Thread.sleep(2000);
           }
       }
        return agetemp;
    }


    //验证性别
   String sexregex() throws Exception{
       String sextemp=null;
       while(true){
           System.out.print("输入性别(男or女) :");
           String sex=regex();
           if (sex.equals("男")||sex.equals("女")){
               sextemp=sex;
               break;
           }else{
               System.out.println("您输入的性别不符合实际或含有字符，请检查后重新输入！");
               System.out.println("系统将在2秒后返回上一层…");
               Thread.sleep(2000);
           }
       }
       return sextemp;
    }

    //验证手机号
    String telnumregex() throws Exception{
        String telnumtemp=null;
    while(true){
        System.out.print("输入11位手机号 :");
        String telnum=regex();
        if (!telnum.matches("[a-zA-Z]+")){
            //if(telnum.matches("^(13[0-9]|14[0-9]|15[0-9]|16[0-9]|17[0-9]|18[0-9]|19[0-9])\\d{8}$")){
            if(telnum.matches("^((13[0-9])|(14[0,1,4-9])|(15[0-3,5-9])|(16[2,5,6,7])|(17[0-8])|(18[0-9])|(19[0-3,5-9]))\\d{8}$")){
                telnumtemp=telnum;
                break;
            }
            else{
                System.out.println("您输入的手机号不符合实际，请检查后重新输入！");
                System.out.println("系统将在2秒后返回上一层…");
                Thread.sleep(2000);
            }
        }
        else{
            System.out.println("您输入的手机号含有字符，请检查后重新输入！");
            System.out.println("系统将在2秒后返回上一层…");
            Thread.sleep(2000);
        }
    }
        return telnumtemp;
    }

    //主菜单验证
    void mainMenuregex() throws Exception {
        switch (regex()) {
            case "1":
                menu.addMenu();
                break;
            case "2":
                menu.searchMenu();
                break;
            case "3":
                menu.modifyMenu();
                break;
            case "4":
                menu.deleteMenu();
                break;
            case "5":
                menu.orderMenu();
                break;
            case "6":
                System.out.print("正在退出程序，请稍等…");
                Thread.sleep(2000);
                break;
            default: {
                System.out.println("您的输入有误，请检查后重新输入！");
                System.out.println("系统将在2秒后返回上一层……");
                Thread.sleep(2000);
                operate.clear();
                menu.mainMenu();

            }
        }
    }

    //addMune菜单验证
    void addMenuregex() throws Exception {
        switch (regex()) {
            case "1":
                operate.addlogic();
                break;
            case "2":
                operate.showAll();
                break;
            case "3":
                menu.mainMenu();
                break;
            default: {
                System.out.println("您的输入有误，请检查后重新输入！");
                System.out.print("系统将在2秒内返回上一层……");
                Thread.sleep(2000);
                operate.clear();
                menu.addMenu();
            }
        }
    }

    //查看所有联系人菜单验证
    void showallregex() throws Exception {
        switch (regex()) {
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
                operate.clear();
                menu.mainMenu();
            }
        }
    }

    //查找联系人菜单验证
    void searchMenuregex() throws Exception {
        switch (regex()) {
            case "1":
                operate.searchByName();
                break;
            case "2":
                operate.searchByAge();
                break;
            case "3":
                operate.searchBySex();
                break;
            case "4":
                operate.searchByTelNum();
                break;
            case "5":
                operate.searchByAddress();
                break;
            case "6":
                operate.showAll();
                break;
            case "7":
                menu.mainMenu();
                break;
            default: {
                System.out.println("您的输入有误，请检查后重新输入！");
                System.out.println("系统将在2秒内返回上一层……");
                Thread.sleep(2000);
                operate.clear();
                menu.mainMenu();
            }
        }
    }


    void search2Menuregex() throws Exception {
        switch (regex()) {
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
                operate.clear();
                menu.mainMenu();
            }
        }
    }

    void search1Menuregex() throws Exception {
        switch (regex()) {
            case "1":
                menu.subModifyMenu();
                break;
            case "2":
//                menu.searchMenu();
                break;
            case "3":
                menu.searchMenu();
                break;
            default: {
                System.out.println("您的输入有误，请检查后重新输入！");
                System.out.println("系统将在2秒内返回上一层……");
                Thread.sleep(2000);
                operate.clear();
                menu.searchMenu();
            }
        }
    }


    void modifyMenuregex() throws Exception {
        switch (regex()) {
            case "1":
                operate.showAll();
                break;
            case "2":
                operate.modify();
                break;
            case "3":
                operate.deleteAll();
                break;
            case "4":
                menu.mainMenu();
                break;
            default: {
                System.out.println("您的输入有误，请检查后重新输入！");
                System.out.print("系统将在2秒内返回上一层……");
                Thread.sleep(2000);
                operate.clear();
                menu.mainMenu();
            }
        }
    }


    void modify1Menuregex() throws Exception{
        switch (regex()) {
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
                operate.clear();
                menu.modifyMenu();
            }
        }
    }

    String modifyofidregex(String temp1){
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
        else{
            temp2="no";
        }
        return temp2;
    }

    //删除记录菜单验证
    void deleteMenuregex() throws Exception{
        switch (regex()) {
            case "1":
                operate.showAll();
                break;
            case "2":
                operate.delete();
                break;
            case "3":
                operate.deleteAll();
                break;
            case "4":
                menu.mainMenu();
                break;
            default: {
                System.out.println("您的输入有误，请检查后重新输入！");
                System.out.print("系统将在2秒内返回上一层……");
                Thread.sleep(2000);
                operate.clear();
                menu.modifyMenu();
            }
        }
    }

    //排序系统
    void orderMenuregex() throws Exception{
        switch (regex()) {
            case "1":
                operate.orderAge();
                break;
            case "2":
                operate.orderName();
                break;
            case "3":
                operate.orderSex();
                break;
            case "4":
                operate.showAll();
                break;
            default: {
                System.out.println("您的输入有误，请检查后重新输入！");
                System.out.print("系统将在2秒内返回上一层……");
                Thread.sleep(2000);
                operate.clear();
                menu.modifyMenu();
            }
        }
    }

}