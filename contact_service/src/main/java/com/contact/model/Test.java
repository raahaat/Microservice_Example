package com.contact.model;


import java.sql.Time;
import java.util.Date;

public class Test {
  private int i;
  private Date date;

  public Test(int i, Date date) {
    this.i = i;
    this.date = date;
  }

  public Test() {
  }

  public int getI() {
    return i;
  }

  public Test setI(int i) {
    this.i = i;
      return null;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }
}
