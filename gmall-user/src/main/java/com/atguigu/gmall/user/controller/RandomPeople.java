package com.atguigu.gmall.user.controller;

import java.util.Random;

public class RandomPeople {
    public static void main(String[] args) {
        Random randomCol = new Random();
        Random randomRow = new Random();

        int lie = randomCol.nextInt(4) + 1;
        int hang = randomRow.nextInt(8) + 1;

        System.out.println("有请第" + lie + "列" + "第" + hang + "行的同学回答问题");
    }
}
