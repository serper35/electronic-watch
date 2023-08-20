package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long seconds = scanner.nextInt();
        long minutes = seconds / 60 % 60;
        long hours = seconds / 3600;
        seconds %= 60;
        if (hours < 23) {
            String timeInHHMMSS = String.format("%2d:%02d:%02d", hours, minutes, seconds);
            System.out.println(timeInHHMMSS);

        }
        else {
            hours = hours % 24;
            String timeInHHMMSS = String.format("%02d:%02d", minutes, seconds);
            System.out.println(hours + ":" + timeInHHMMSS);
        }
    }
}
