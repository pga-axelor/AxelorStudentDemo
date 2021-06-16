package com.axelor.student.web;

import com.axelor.rpc.*;
import com.axelor.student.service.StudentDetailsService;
import com.axelor.studentdetails.db.Details;
import com.google.inject.Inject;

public class StudentController {
  @Inject private StudentDetailsService service;

  public void detailMethod(ActionRequest request, ActionResponse response) {
    Details s = request.getContext().asType(Details.class);
    String usn = service.usn(s);
    response.setAttr("usn", "value", usn);
  }
}
