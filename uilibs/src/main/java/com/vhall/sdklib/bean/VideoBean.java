package com.vhall.sdklib.bean;

/**
 * 直播列表基类
 */
public class VideoBean extends iEnity {

    private String id;
    private String time;
    private String headImg;
    private String name;
    private String title; /*职称*/
    private String seat;/*总裁办公室*/
    private String reviewN;/*评论数量*/
    private String watchN;/*观看数*/
    private String videoType; /*视频状态*/
    private String videoTime; /*视频时长*/


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getReviewN() {
        return reviewN;
    }

    public void setReviewN(String reviewN) {
        this.reviewN = reviewN;
    }

    public String getWatchN() {
        return watchN;
    }

    public void setWatchN(String watchN) {
        this.watchN = watchN;
    }

    public String getVideoType() {
        return videoType;
    }

    public void setVideoType(String videoType) {
        this.videoType = videoType;
    }

    public String getVideoTime() {
        return videoTime;
    }

    public void setVideoTime(String videoTime) {
        this.videoTime = videoTime;
    }
}
