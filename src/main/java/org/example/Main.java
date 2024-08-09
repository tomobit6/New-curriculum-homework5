package org.example;

import java.time.LocalTime;

public class Main {

  public static void main(String[] args) {

    String Lastname = "田中";
    String Firstname = "朋広";

    if (Lastname.length() >= 2 && Firstname.length() >= 2) {
      System.out.println(Lastname + " " + Firstname);
    } else {
      System.out.println("条件に一致しませんでした。");
    }

    LocalTime JA = LocalTime.now();

    if (!(JA.getHour() < 23)) {
      System.out.println("ジャックもう時間がない！");
    } else if (JA.getHour() == 12) {
      System.out.println("ジャックあと１２時間だ");
    } else {
      System.out.println("ジャック落ち着いてまだ時間はある");
    }
  }
}
