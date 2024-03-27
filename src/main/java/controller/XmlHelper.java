package controller;

import model.AppInfo;
import model.ResultInfo;

/**
 * 实现把应用的数据转储为xml文件，实现数据持久化
 */
public class XmlHelper {
    public ResultInfo appWriteToXml(AppInfo app){
        ResultInfo result= new ResultInfo();
        result.setMessage("");
        return  result;
    }

    public ResultInfo XmlReadToApp(AppInfo app){
        ResultInfo result= new ResultInfo();
        result.setMessage("");
        return  result;
    }
}
