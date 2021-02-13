package AddressBook;

class Menu {
    void mainMenu() throws Exception{
        Operate operate=new Operate();
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
        TelNoteRegex regex = new TelNoteRegex();
        regex.mainMenuregex();

    }


    void addMenu() throws Exception{
        Operate operate=new Operate();
        operate.clear();
        System.out.println("  添加联系人菜单    ");
        System.out.println("*****************");
        System.out.println("**  1、添加新记录  **");
        System.out.println("**  2、查看全记录  **");
        System.out.println("**  3、返回上一级  **");
        System.out.print("请输入正确的数字，最小是1，最大是3：");
        TelNoteRegex regex = new TelNoteRegex();
        regex.addMenuregex();

    }

    void searchMenu () throws Exception{
        Operate operate=new Operate();
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
        TelNoteRegex regex = new TelNoteRegex();
        regex.searchMenuregex();
    }
    void search1Menu() throws Exception{
        Operate operate=new Operate();
        operate.clear();
        System.out.println("**  1、修改联系人  **");
        System.out.println("**  2、删除联系人  **");
        System.out.println("**  3、返回上一级  **");
        System.out.print("请输入正确的数字，最小是1，最大是3：");
        TelNoteRegex regex = new TelNoteRegex();
        regex.search1Menuregex();
    }

    void modifyMenu() throws Exception{
        Operate operate=new Operate();
        operate.clear();
        System.out.println("   修改联系人菜单    ");
        System.out.println("******************");
        System.out.println("**  1、查看全记录   **");
        System.out.println("**  2、修改指定记录  **");
        System.out.println("**  3、删除全部记录  **");
        System.out.println("**  4、返回上一级    **");
        System.out.print("请输入正确的数字，最小是1，最大是4：");
        TelNoteRegex regex = new TelNoteRegex();
        regex.modifyMenuregex();

    }

    void subModifyMenu () throws Exception{
        Operate operate=new Operate();
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

    void deleteMenu() throws Exception{
        Operate operate=new Operate();
        operate.clear();
        System.out.println("     删除联系人菜单    ");
        System.out.println("**********************");
        System.out.println("**  1、查看全部联系人  **");
        System.out.println("**  2、删除指定联系人  **");
        System.out.println("**  3、删除全部联系人  **");
        System.out.println("**  4、返回上一级     **");
        System.out.print("请输入正确的数字，最小是1，最大是4    ：");
        TelNoteRegex regex = new TelNoteRegex();
        regex.deleteMenuregex();
    }

    void orderMenu() throws Exception{
        Operate operate=new Operate();
        operate.clear();
        System.out.println("      排序系统      ");
        System.out.println("*******************");
        System.out.println("**  1、按年龄排序  **");
        System.out.println("**  2、按姓名排序  **");
        System.out.println("**  3、按性别排序  **");
        System.out.println("**  4、查看全记录  **");
        System.out.println("**  5、返回上一级  **");
        System.out.print("请输入正确的数字，最小是1，最大是5：");
        TelNoteRegex regex = new TelNoteRegex();
        regex.orderMenuregex();
    }
}
