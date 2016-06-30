/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.vayneLove.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.vayneLove.domain.Students;
import com.vayneLove.service.StudentOperation;
import com.vayneLove.struts.form.StudentsForm;

/** 
 * MyEclipse Struts
 * Creation date: 06-30-2016
 * 
 * XDoclet definition:
 * @struts.action path="/addStudent" name="studentsForm" scope="request"
 */
public class AddStudentAction extends Action {
	/*
	 * Generated Methods
	 */

	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		StudentsForm studentsForm = (StudentsForm) form;// TODO Auto-generated method stub
		
		Students student = new Students();
		
		student.setStuid(studentsForm.getStuid());
		student.setStuname(studentsForm.getStuname());
		student.setScore(studentsForm.getScore());
		
		StudentOperation operation = new StudentOperation();
		operation.addStudent(student);
		
		return mapping.findForward("addstuOK");
	}
}