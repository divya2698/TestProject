/**
 */
package TestProjectV1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestProjectV1.Manager#getMangerID <em>Manger ID</em>}</li>
 *   <li>{@link TestProjectV1.Manager#getDeptCode <em>Dept Code</em>}</li>
 * </ul>
 *
 * @see TestProjectV1.TestProjectV1Package#getManager()
 * @model
 * @generated
 */
public interface Manager extends Employee {
	/**
	 * Returns the value of the '<em><b>Manger ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manger ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manger ID</em>' attribute.
	 * @see #setMangerID(int)
	 * @see TestProjectV1.TestProjectV1Package#getManager_MangerID()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getMangerID();

	/**
	 * Sets the value of the '{@link TestProjectV1.Manager#getMangerID <em>Manger ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manger ID</em>' attribute.
	 * @see #getMangerID()
	 * @generated
	 */
	void setMangerID(int value);

	/**
	 * Returns the value of the '<em><b>Dept Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dept Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dept Code</em>' attribute.
	 * @see #setDeptCode(int)
	 * @see TestProjectV1.TestProjectV1Package#getManager_DeptCode()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getDeptCode();

	/**
	 * Sets the value of the '{@link TestProjectV1.Manager#getDeptCode <em>Dept Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dept Code</em>' attribute.
	 * @see #getDeptCode()
	 * @generated
	 */
	void setDeptCode(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void markAttendance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * context Manager::updateEmployeeDetails(e: Employee)
	 * pre SameDepartment: e.department = self.department
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void updateEmployeeDetails();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void approveLeave();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void timeSheetApproval();

} // Manager
