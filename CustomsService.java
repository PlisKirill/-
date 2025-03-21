package ru.netology.service;

public class CustomsService {

    public static final int BET_DUTY_WEIAGHT = 100;

    public static int calculateCustoms(int prise, int weight) {
        return prise / 100 + weight * BET_DUTY_WEIAGHT;
    }
}
