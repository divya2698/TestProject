/**
 */
package TestProjectV1;

import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestProjectV1.Schedule#getProjectID <em>Project ID</em>}</li>
 *   <li>{@link TestProjectV1.Schedule#getAssignedEmployees <em>Assigned Employees</em>}</li>
 *   <li>{@link TestProjectV1.Schedule#getWeeklyHours <em>Weekly Hours</em>}</li>
 *   <li>{@link TestProjectV1.Schedule#getShiftType <em>Shift Type</em>}</li>
 * </ul>
 *
 * @see TestProjectV1.TestProjectV1Package#getSchedule()
 * @model
 * @generated
 */
public interface Schedule extends EObject {
	/**
	 * Returns the value of the '<em><b>Project ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project ID</em>' attribute.
	 * @see #setProjectID(String)
	 * @see TestProjectV1.TestProjectV1Package#getSchedule_ProjectID()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getProjectID();

	/**
	 * Sets the value of the '{@link TestProjectV1.Schedule#getProjectID <em>Project ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project ID</em>' attribute.
	 * @see #getProjectID()
	 * @generated
	 */
	void setProjectID(String value);

	/**
	 * Returns the value of the '<em><b>Assigned Employees</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned Employees</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Employees</em>' reference.
	 * @see #setAssignedEmployees(Employee)
	 * @see TestProjectV1.TestProjectV1Package#getSchedule_AssignedEmployees()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Employee getAssignedEmployees();

	/**
	 * Sets the value of the '{@link TestProjectV1.Schedule#getAssignedEmployees <em>Assigned Employees</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned Employees</em>' reference.
	 * @see #getAssignedEmployees()
	 * @generated
	 */
	void setAssignedEmployees(Employee value);

	/**
	 * Returns the value of the '<em><b>Weekly Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weekly Hours</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weekly Hours</em>' attribute.
	 * @see #setWeeklyHours(int)
	 * @see TestProjectV1.TestProjectV1Package#getSchedule_WeeklyHours()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getWeeklyHours();

	/**
	 * Sets the value of the '{@link TestProjectV1.Schedule#getWeeklyHours <em>Weekly Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weekly Hours</em>' attribute.
	 * @see #getWeeklyHours()
	 * @generated
	 */
	void setWeeklyHours(int value);

	/**
	 * Returns the value of the '<em><b>Shift Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shift Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shift Type</em>' attribute.
	 * @see #setShiftType(String)
	 * @see TestProjectV1.TestProjectV1Package#getSchedule_ShiftType()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getShiftType();

	/**
	 * Sets the value of the '{@link TestProjectV1.Schedule#getShiftType <em>Shift Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shift Type</em>' attribute.
	 * @see #getShiftType()
	 * @generated
	 */
	void setShiftType(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * context Schedule::createSchedule(e: Employee, startDate: EDate, endDate: EDate)
	 * pre WeeklyHoursLimit: e.weeklyHours <= 40
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean createSchedule(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model EmployeeRequired="true" EmployeeOrdered="false" startDateRequired="true" startDateOrdered="false" endDateRequired="true" endDateOrdered="false"
	 * @generated
	 */
	void createSchedule(Employee Employee, Date startDate, Date endDate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model EmployeeRequired="true" EmployeeOrdered="false" startDateRequired="true" startDateOrdered="false" endDateRequired="true" endDateOrdered="false"
	 * @generated
	 */
	void updateSchedule(Employee Employee, Date startDate, Date endDate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model EmployeeRequired="true" EmployeeOrdered="false"
	 * @generated
	 */
	void getEmployeeSchedule(Employee Employee);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void generateWeeklySchedule();

} // Schedule
