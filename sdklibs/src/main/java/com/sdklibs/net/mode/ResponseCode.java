package com.sdklibs.net.mode;

/**
 * @Description: Response响应码（根据服务器提供文档进行定义）
 * @author: <a href="http://xiaoyaoyou1212.360doc.com">DAWI</a>
 * @date: 2016-12-30 18:11
 */
public class ResponseCode {
    //HTTP请求成功状态码
    public static final int HTTP_SUCCESS = 0;
    //AccessToken错误或已过期
    public static final int ACCESS_TOKEN_EXPIRED = 10001;
    //RefreshToken错误或已过期
    public static final int REFRESH_TOKEN_EXPIRED = 10002;
    //帐号在其它手机已登录
    public static final int OTHER_PHONE_LOGIN = 10003;
    //时间戳过期
    public static final int TIMESTAMP_ERROR = 10004;
    //缺少授权信息,没有AccessToken
    public static final int NO_ACCESS_TOKEN = 10005;
    //签名错误
    public static final int SIGN_ERROR = 10006;


/*    //手机号码格式错误
    public static final int SIGN_ERROR = 1;
    //用户已存在
    public static final int SIGN_ERROR = 2;
    //请求参数错误
    public static final int SIGN_ERROR = 3;
    //两次密码输入不一致
    public static final int SIGN_ERROR = 4;
    //用户注册失败
    public static final int SIGN_ERROR = 5;
    //用户不存在或者密码输入有误
    public static final int SIGN_ERROR = 6;
    //登录失败
    public static final int SIGN_ERROR = 7;
    //账号异常
    public static final int SIGN_ERROR = 8;
    //修改头像失败
    public static final int SIGN_ERROR = 9;
    //token已失效
    public static final int SIGN_ERROR = 10;
    //添加用户失败
    public static final int SIGN_ERROR = 11;
    //账号中未存在需要测量的用户
    public static final int SIGN_ERROR = 12;
    //测量结果添加失败
    public static final int SIGN_ERROR = 13;
    //删除用户失败
    public static final int SIGN_ERROR = 14;
    //没有查到历史记录
    public static final int SIGN_ERROR = 15;
    //超出设备范围
    public static final int SIGN_ERROR = 16;
    //请上传测量时间
    public static final int SIGN_ERROR = 17;*/
}
