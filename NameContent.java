package com.example.android.androidquiz;

/**
 * Created by Eliza on 07.12.2017.
 */

public class NameContent {

    private static String name;
    private static String picturePath;
    private static String score;


    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        NameContent.name = name;
    }

    public static String getPicturePath() {
        return picturePath;
    }

    public static void setPicturePath(String picturePath) {
        NameContent.picturePath = picturePath;
    }

    public static String getScore() {
        return score;
    }

    public static void setScore(String score) {
        NameContent.score = score;
    }
}


