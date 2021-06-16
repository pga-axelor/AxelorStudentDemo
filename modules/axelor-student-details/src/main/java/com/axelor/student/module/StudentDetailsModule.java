package com.axelor.student.module;

import com.axelor.app.AxelorModule;
import com.axelor.student.service.StudentDetailsService;
import com.axelor.student.service.StudentDetailsServiceImpl;

public class StudentDetailsModule extends AxelorModule {
  @Override
  protected void configure() {
    bind(StudentDetailsService.class).to(StudentDetailsServiceImpl.class);
  }
}
