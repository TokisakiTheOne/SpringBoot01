package com.yyh.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 自定义 返回信息类
 *
 * @author YanYuHang
 * @create 2019-12-26-10:19
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultMessage {
    //响应码
    private int code;
    //响应信息
    private String msg;
    //响应数据
    private Object data;


}
