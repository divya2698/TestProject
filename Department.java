/**
 */
package TestProjectV1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestProjectV1.Department#getDeptName <em>Dept Name</em>}</li>
 *   <li>{@link TestProjectV1.Department#getDeptCode <em>Dept Code</em>}</li>
 * </ul>
 *
 * @see TestProjectV1.TestProjectV1Package#getDepartment()
 * @model
 * @generated
 */
public interface Department extends EObject {
	/**
	 * Returns the value of the '<em><b>Dept Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dept Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dept Name</em>' attribute.
	 * @see #setDeptName(String)
	 * @see TestProjectV1.TestProjectV1Package#getDepartment_DeptName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDeptName();

	/**
	 * Sets the value of the '{@link TestProjectV1.Department#getDeptName <em>Dept Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dept Name</em>' attribute.
	 * @see #getDeptName()
	 * @generated
	 */
	void setDeptName(String value);

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
	 * @see TestProjectV1.TestProjectV1Package#getDepartment_DeptCode()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDeptCode();

	/**
	 * Sets the value of the '{@link TestProjectV1.Department#getDeptCode <em>Dept Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dept Code</em>' attribute.
	 * @see #getDeptCode()
	 * @generated
	 */
	void setDeptCode(String value);

} // Department
