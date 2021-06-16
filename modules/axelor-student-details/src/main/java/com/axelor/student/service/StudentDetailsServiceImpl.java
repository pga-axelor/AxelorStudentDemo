package com.axelor.student.service;

import com.axelor.studentdetails.db.Details;

public class StudentDetailsServiceImpl implements StudentDetailsService {
  public String usn(Details d) {
    String usn = "1MJ17IS" + d.getUsn();
    return usn;
  }
}
