package AddressBook;
class Menu {
    //主菜单
    void mainMenu() throws Exception {
        TelNoteRegex regex = new TelNoteRegex();
        Operate operate = new Operate();
        operate.clear();
        System.out.println("      主菜单    ");
        System.out.println("*****************");
        System.out.println("**  1、添加记录  **");
        System.out.println("**  2、查找记录  **");
        System.out.println("**  3、修改记录  **");
        System.out.println("**  4、删除记录  **");
        System.out.println("**  5、排序系统  **");
        System.out.println("**  6、退出程序  **");
        System.out.println("*******************");
        System.out.print("请输入正确的数字，最小是1，最大是6：");
        switch (regex.regex()) {
            case "1":
                addMenu();
                break;
            case "2":
                searchMenu();
                break;
            case "3":
                modifyMenu();
                break;
            case "4":
                deleteMenu();
                break;
            case "5":
                orderMenu();
                break;
            case "6":
                System.out.println("正在退出程序，请稍等…");
                Thread.sleep(2000);
                break;
            default: {
                System.out.println("您的输入有误，请检查后重新输入！");
                System.out.println("系统将在2秒后返回上一层……");
                Thread.sleep(2000);
                operate.clear();
                mainMenu();

            }
        }
    }


    //添加联系人菜单
    void addMenu() throws Exception {
        TelNoteRegex regex = new TelNoteRegex();
        Operate operate = new Operate();
        operate.clear();
        System.out.println("  添加联系人菜单    ");
        System.out.println("*****************");
        System.out.println("**  1、添加新记录  **");
        System.out.println("**  2、查看全记录  **");
        System.out.println("**  3、返回上一级  **");
        System.out.print("请输入正确的数字，最小是1，最大是3：");
        switch (regex.regex()) {
            case "1":
                operate.addlogic();
                break;
            case "2":
                operate.showAll();
                break;
            case "3":
                mainMenu();
                break;
            default: {
                System.out.println("您的输入有误，请检查后重新输入！");
                System.out.print("系统将在2秒内返回上一层……");
                Thread.sleep(2000);
                operate.clear();
                addMenu();
            }
        }
    }

    //查找联系人菜单
    void searchMenu() throws Exception {
        TelNoteRegex regex = new TelNoteRegex();
        Operate operate = new Operate();
        operate.clear();
        System.out.println("   查找联系人菜单    ");
        System.out.println("******************");
        System.out.println("**  1、按姓名查找  **");
        System.out.println("**  2、按年龄查找  **");
        System.out.println("**  3、按性别查找  **");
        System.out.println("**  4、按号码查找  **");
        System.out.println("**  5、按地址查找  **");
        System.out.println("**  6、查看全记录  **");
        System.out.println("**  7、返回上一级  **");
        System.out.print("请输入正确的数字，最小是1，最大是7：");
        //查找联系人菜单验证
        switch (regex.regex()) {
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
                mainMenu();
                break;
            default: {
                System.out.println("您的输入有误，请检查后重新输入！");
                System.out.println("系统将在2秒内返回上一层……");
                Thread.sleep(2000);
                operate.clear();
                mainMenu();
            }
        }

    }

    void search1Menu() throws Exception {
        TelNoteRegex regex = new TelNoteRegex();
        Operate operate = new Operate();
        System.out.println("**  1、修改联系人  **");
        System.out.println("**  2、删除联系人  **");
        System.out.println("**  3、返回上一级  **");
        System.out.print("请输入正确的数字，最小是1，最大是3：");
        switch (regex.regex()) {
            case "1":
                subModifyMenu();
                break;
            case "2":
//                menu.searchMenu();
                break;
            case "3":
                searchMenu();
                break;
            default: {
                System.out.println("您的输入有误，请检查后重新输入！");
                System.out.println("系统将在2秒内返回上一层……");
                Thread.sleep(2000);
                operate.clear();
                searchMenu();
            }
        }
    }


    void modifyMenu() throws Exception {
        TelNoteRegex regex = new TelNoteRegex();
        Operate operate = new Operate();
        operate.clear();
        System.out.println("   修改联系人菜单    ");
        System.out.println("******************");
        System.out.println("**  1、查看全记录   **");
        System.out.println("**  2、修改指定记录  **");
        System.out.println("**  3、删除全部记录  **");
        System.out.println("**  4、返回上一级    **");
        System.out.print("请输入正确的数字，最小是1，最大是4：");
        switch (regex.regex()) {
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
                mainMenu();
                break;
            default: {
                System.out.println("您的输入有误，请检查后重新输入！");
                System.out.print("系统将在2秒内返回上一层……");
                Thread.sleep(2000);
                operate.clear();
                mainMenu();
            }
        }
    }


    void subModifyMenu() throws Exception {
        TelNoteRegex regex = new TelNoteRegex();
        Operate operate = new Operate();
        operate.clear();
        System.out.println("   修改联系人菜单    ");
        System.out.println("******************");
        System.out.println("**  1、修改姓名  **");
        System.out.println("**  2、修改年龄  **");
        System.out.println("**  3、修改性别  **");
        System.out.println("**  4、修改地址  **");
        System.out.println("**  5、修改号码  **");
        System.out.println("**  6、返回上一级 **");
        System.out.print("请输入正确的数字，最小是1，最大是6    ：");

    }

    void deleteMenu() throws Exception {
        TelNoteRegex regex = new TelNoteRegex();
        Operate operate = new Operate();
        operate.clear();
        System.out.println("     删除联系人菜单    ");
        System.out.println("**********************");
        System.out.println("**  1、查看全部联系人  **");
        System.out.println("**  2、删除指定联系人  **");
        System.out.println("**  3、删除全部联系人  **");
        System.out.println("**  4、返回上一级     **");
        System.out.print("请输入正确的数字，最小是1，最大是4    ：");
        switch (regex.regex()) {
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
                mainMenu();
                break;
            default: {
                System.out.println("您的输入有误，请检查后重新输入！");
                System.out.print("系统将在2秒内返回上一层……");
                Thread.sleep(2000);
                operate.clear();
                modifyMenu();
            }
        }
    }

    void orderMenu() throws Exception {
        TelNoteRegex regex = new TelNoteRegex();
        Operate operate = new Operate();
        operate.clear();
        System.out.println("      排序系统      ");
        System.out.println("*******************");
        System.out.println("**  1、按年龄排序  **");
        System.out.println("**  2、按姓名排序  **");
        System.out.println("**  3、按性别排序  **");
        System.out.println("**  4、查看全记录  **");
        System.out.println("**  5、返回上一级  **");
        System.out.print("请输入正确的数字，最小是1，最大是5：");
        switch (regex.regex()) {
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
                modifyMenu();
            }
        }
    }


    }
