package com.driftingbottle.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/6/25.
 */

public class MessageBean0 implements Serializable{
    public  String answerType;
    public String CreatedDate;
    public String textData;
    public String imageData;
    public String voiceNumber;
    //0，纯文本 1，纯图片 2，纯声音 3，文本+图片
    public String dataType;
}
