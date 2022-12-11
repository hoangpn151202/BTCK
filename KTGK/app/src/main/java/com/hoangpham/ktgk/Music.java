package com.hoangpham.ktgk;

public class Music {
    private int Thumb;
    private String Name;
    private String Singer;
    private String Duration;

    public Music(int thumb, String name, String singer, String duration) {
        Thumb = thumb;
        Name = name;
        Singer = singer;
        Duration = duration;
    }

    public int getThumb() {
        return Thumb;
    }

    public void setThumb(int thumb) {
        Thumb = thumb;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSinger() {
        return Singer;
    }

    public void setSinger(String singer) {
        Singer = singer;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String duration) {
        Duration = duration;
    }
}
