package model;

/**
 * 该类用于返回解析xml文件的结果，并包含成功或者失败的信息
 */
public class ResultInfo {

    boolean isSuccess = false;

    String message;

    public boolean isSuccess(){
        return this.isSuccess;
    }

    public void setMessage(String message){
        this.message = message;
    }


}
