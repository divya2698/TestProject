/**
 */
package TestProjectV1;

import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestProjectV1.Employee#getName <em>Name</em>}</li>
 *   <li>{@link TestProjectV1.Employee#getEmail <em>Email</em>}</li>
 *   <li>{@link TestProjectV1.Employee#getDob <em>Dob</em>}</li>
 *   <li>{@link TestProjectV1.Employee#getEmpID <em>Emp ID</em>}</li>
 *   <li>{@link TestProjectV1.Employee#getExperience <em>Experience</em>}</li>
 *   <li>{@link TestProjectV1.Employee#getTotalHoursWorked <em>Total Hours Worked</em>}</li>
 *   <li>{@link TestProjectV1.Employee#getQualification <em>Qualification</em>}</li>
 *   <li>{@link TestProjectV1.Employee#getJoinDate <em>Join Date</em>}</li>
 *   <li>{@link TestProjectV1.Employee#getSalaryAmount <em>Salary Amount</em>}</li>
 *   <li>{@link TestProjectV1.Employee#getReportTo <em>Report To</em>}</li>
 *   <li>{@link TestProjectV1.Employee#get_totalCompensation <em>total Compensation</em>}</li>
 *   <li>{@link TestProjectV1.Employee#getPerformancereview <em>Performancereview</em>}</li>
 * </ul>
 *
 * @see TestProjectV1.TestProjectV1Package#getEmployee()
 * @model
 * @generated
 */
public interface Employee extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see TestProjectV1.TestProjectV1Package#getEmployee_Name()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();
    public static final String name = "";
    public static final String email = "";
    public static final int experience = 0;
    public static final int salaryAmount = 0;

	/**
	 * Sets the value of the '{@link TestProjectV1.Employee#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see TestProjectV1.TestProjectV1Package#getEmployee_Email()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link TestProjectV1.Employee#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Dob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dob</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dob</em>' attribute.
	 * @see #setDob(Date)
	 * @see TestProjectV1.TestProjectV1Package#getEmployee_Dob()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getDob();

	/**
	 * Sets the value of the '{@link TestProjectV1.Employee#getDob <em>Dob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dob</em>' attribute.
	 * @see #getDob()
	 * @generated
	 */
	void setDob(Date value);

	/**
	 * Returns the value of the '<em><b>Emp ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emp ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emp ID</em>' attribute.
	 * @see #setEmpID(String)
	 * @see TestProjectV1.TestProjectV1Package#getEmployee_EmpID()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getEmpID();

	/**
	 * Sets the value of the '{@link TestProjectV1.Employee#getEmpID <em>Emp ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emp ID</em>' attribute.
	 * @see #getEmpID()
	 * @generated
	 */
	void setEmpID(String value);

	/**
	 * Returns the value of the '<em><b>Experience</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Experience</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Experience</em>' attribute.
	 * @see #setExperience(int)
	 * @see TestProjectV1.TestProjectV1Package#getEmployee_Experience()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getExperience();

	/**
	 * Sets the value of the '{@link TestProjectV1.Employee#getExperience <em>Experience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Experience</em>' attribute.
	 * @see #getExperience()
	 * @generated
	 */
	void setExperience(int value);

	/**
	 * Returns the value of the '<em><b>Total Hours Worked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Hours Worked</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Hours Worked</em>' attribute.
	 * @see #setTotalHoursWorked(int)
	 * @see TestProjectV1.TestProjectV1Package#getEmployee_TotalHoursWorked()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getTotalHoursWorked();

	/**
	 * Sets the value of the '{@link TestProjectV1.Employee#getTotalHoursWorked <em>Total Hours Worked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Hours Worked</em>' attribute.
	 * @see #getTotalHoursWorked()
	 * @generated
	 */
	void setTotalHoursWorked(int value);

	/**
	 * Returns the value of the '<em><b>Qualification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualification</em>' attribute.
	 * @see #setQualification(String)
	 * @see TestProjectV1.TestProjectV1Package#getEmployee_Qualification()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getQualification();

	/**
	 * Sets the value of the '{@link TestProjectV1.Employee#getQualification <em>Qualification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualification</em>' attribute.
	 * @see #getQualification()
	 * @generated
	 */
	void setQualification(String value);

	/**
	 * Returns the value of the '<em><b>Join Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Date</em>' attribute.
	 * @see #setJoinDate(Date)
	 * @see TestProjectV1.TestProjectV1Package#getEmployee_JoinDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getJoinDate();

	/**
	 * Sets the value of the '{@link TestProjectV1.Employee#getJoinDate <em>Join Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join Date</em>' attribute.
	 * @see #getJoinDate()
	 * @generated
	 */
	void setJoinDate(Date value);

	/**
	 * Returns the value of the '<em><b>Salary Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Salary Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salary Amount</em>' attribute.
	 * @see #setSalaryAmount(int)
	 * @see TestProjectV1.TestProjectV1Package#getEmployee_SalaryAmount()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getSalaryAmount();

	/**
	 * Sets the value of the '{@link TestProjectV1.Employee#getSalaryAmount <em>Salary Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salary Amount</em>' attribute.
	 * @see #getSalaryAmount()
	 * @generated
	 */
	void setSalaryAmount(int value);

	/**
	 * Returns the value of the '<em><b>Report To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Report To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Report To</em>' attribute.
	 * @see #setReportTo(String)
	 * @see TestProjectV1.TestProjectV1Package#getEmployee_ReportTo()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getReportTo();

	/**
	 * Sets the value of the '{@link TestProjectV1.Employee#getReportTo <em>Report To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Report To</em>' attribute.
	 * @see #getReportTo()
	 * @generated
	 */
	void setReportTo(String value);

	/**
	 * Returns the value of the '<em><b>total Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>total Compensation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>total Compensation</em>' attribute.
	 * @see #set_totalCompensation(int)
	 * @see TestProjectV1.TestProjectV1Package#getEmployee__totalCompensation()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName=' totalCompensation'"
	 * @generated
	 */
	int get_totalCompensation();

	/**
	 * Sets the value of the '{@link TestProjectV1.Employee#get_totalCompensation <em>total Compensation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>total Compensation</em>' attribute.
	 * @see #get_totalCompensation()
	 * @generated
	 */
	void set_totalCompensation(int value);

	/**
	 * Returns the value of the '<em><b>Performancereview</b></em>' reference list.
	 * The list contents are of type {@link TestProjectV1.PerformanceReview}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performancereview</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performancereview</em>' reference list.
	 * @see TestProjectV1.TestProjectV1Package#getEmployee_Performancereview()
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='performance review'"
	 * @generated
	 */
	EList<PerformanceReview> getPerformancereview();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * context Employee inv SalaryPositive: self.salaryAmount > 0
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean SalaryPositive(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * context Employee inv EmployeeHasQualification: self.qualification.size() > 0
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean EmployeeHasQualification(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void logAttendance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void viewDetails();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void claculateSalary();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getCurrentProject();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getAge();

	void updateEmployeeDetails();

} // Employee
