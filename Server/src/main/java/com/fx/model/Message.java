package com.fx.model;

/**
 * Description:
 * Created by Hanxinhu at 17:10 2018/6/6/006
 */
public class Message {
    /**
     *    唯一识别标注
     */
    private int id;
    /**
     *     信息的用户名
     */
    private String username;
    /**
     *     自动标注的任务
     */
    private int missionID;

    //已读未读
    private boolean isRead;
    // 类型
    /**
     * 消息的标题
     */
    private String title;
    /**
     * 内容
     */
    private String content;

    public Message() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }


    public int getMissionID() {
        return missionID;
    }

    public void setMissionID(int missionID) {
        this.missionID = missionID;
    }

}
