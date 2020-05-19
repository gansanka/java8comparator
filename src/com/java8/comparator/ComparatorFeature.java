package com.java8.comparator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorFeature {

  public static void main(String[] args) {
    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY");

    List<Employee> employeeList = new ArrayList<>();
    try {
      employeeList.add(new Employee(121, 1000.23, "Dan", sdf.parse("12/10/2014")));
      employeeList.add(new Employee(131, 980.23, "Arch", sdf.parse("10/9/2015")));
      employeeList.add(new Employee(141, 700.23, "Jane", sdf.parse("12/10/2009")));
      employeeList.add(new Employee(151, 1000.21, "Dan", sdf.parse("12/10/2013")));

      // Sort by id reversed
      Collections.sort(employeeList, Comparator.comparing(Employee::getId).reversed());
      System.out.println(employeeList);

      // Sort by name and id
      Collections.sort(employeeList, Comparator.comparing(Employee::getName).thenComparing(Employee::getId));
      System.out.println(employeeList);

      // Sort by date and name
      Collections.sort(employeeList, Comparator.comparing(Employee::getJoiningDate).thenComparing(Employee::getName));
      System.out.println(employeeList);

    }
    catch (ParseException e) {
      e.printStackTrace();
    }

  }

}
