package org.example;

import java.time.LocalTime;

public class Main {

  public static void main(String[] args) {

    String lastName = "田中";
    String firstName = "朋広";

    if (lastName.length() >= 2 && firstName.length() >= 2) {
      System.out.println(lastName + " " + firstName);
    } else {
      System.out.println("条件に一致しませんでした。");
    }

    LocalTime ja = LocalTime.now();

    if (!(ja.getHour() < 23)) {
      System.out.println("ジャックもう時間がない。");
    } else if (ja.getHour() == 12) {
      System.out.println("ジャックあと１２時間だ!");
    } else {
      System.out.println("ジャック落ち着いてまだ時間はある。");
    }
  }
}
