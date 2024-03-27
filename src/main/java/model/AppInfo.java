package model;

/**
 * 应用类，用来实例化引用
 */
public class AppInfo {
    //应用存放地址
    String address;
    //图标的ICO文件
    String icon;
    //应用名称
    String name;
    //TODO  ？？或许还用账密 || 或者用xml文件存放


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
