package com.java8.comparator;

import java.util.Date;

public class Employee {

  private int id;

  private double salary;

  private String name;

  private Date joiningDate;

  public Employee(int id, double salary, String name, Date joiningDate) {
    this.id = id;
    this.salary = salary;
    this.name = name;
    this.joiningDate = joiningDate;
  }

  /**
   * @return the id
   */
  public int getId() {
    return id;
  }

  /**
   * @param id
   *          the id to set
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * @return the salary
   */
  public double getSalary() {
    return salary;
  }

  /**
   * @param salary
   *          the salary to set
   */
  public void setSalary(double salary) {
    this.salary = salary;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name
   *          the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return the joiningDate
   */
  public Date getJoiningDate() {
    return joiningDate;
  }

  /**
   * @param joiningDate
   *          the joiningDate to set
   */
  public void setJoiningDate(Date joiningDate) {
    this.joiningDate = joiningDate;
  }

  public String toString() {
    return this.name + "(id=" + this.id + ")";
  }

}
