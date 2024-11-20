/**
 */
package TestProjectV1;

import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestProjectV1.Project#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link TestProjectV1.Project#getEndDate <em>End Date</em>}</li>
 *   <li>{@link TestProjectV1.Project#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link TestProjectV1.Project#getTeamMembers <em>Team Members</em>}</li>
 *   <li>{@link TestProjectV1.Project#getDeptCode <em>Dept Code</em>}</li>
 * </ul>
 *
 * @see TestProjectV1.TestProjectV1Package#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
	/**
	 * Returns the value of the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Name</em>' attribute.
	 * @see #setProjectName(String)
	 * @see TestProjectV1.TestProjectV1Package#getProject_ProjectName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getProjectName();

	/**
	 * Sets the value of the '{@link TestProjectV1.Project#getProjectName <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Name</em>' attribute.
	 * @see #getProjectName()
	 * @generated
	 */
	void setProjectName(String value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @see TestProjectV1.TestProjectV1Package#getProject_EndDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link TestProjectV1.Project#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see TestProjectV1.TestProjectV1Package#getProject_StartDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link TestProjectV1.Project#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Team Members</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Team Members</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team Members</em>' reference.
	 * @see #setTeamMembers(Employee)
	 * @see TestProjectV1.TestProjectV1Package#getProject_TeamMembers()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Employee getTeamMembers();

	/**
	 * Sets the value of the '{@link TestProjectV1.Project#getTeamMembers <em>Team Members</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team Members</em>' reference.
	 * @see #getTeamMembers()
	 * @generated
	 */
	void setTeamMembers(Employee value);

	/**
	 * Returns the value of the '<em><b>Dept Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dept Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dept Code</em>' attribute.
	 * @see #setDeptCode(String)
	 * @see TestProjectV1.TestProjectV1Package#getProject_DeptCode()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDeptCode();

	/**
	 * Sets the value of the '{@link TestProjectV1.Project#getDeptCode <em>Dept Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dept Code</em>' attribute.
	 * @see #getDeptCode()
	 * @generated
	 */
	void setDeptCode(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * context Project inv EndAfterStart: self.endDate > self.startDate
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean EndAfterStart(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * context Project::assignEmployee(e: Employee)
	 * pre NotAlreadyAssigned: not self.teamMembers->includes(e)
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean assignEmployee(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model EmployeeRequired="true" EmployeeOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='/ assignEmployee'"
	 * @generated
	 */
	void _assignEmployee(Employee Employee);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model EmployeeRequired="true" EmployeeOrdered="false"
	 * @generated
	 */
	void removeEmployee(Employee Employee);

} // Project
