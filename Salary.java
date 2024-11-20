/**
 */
package TestProjectV1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Salary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestProjectV1.Salary#getAccountNum <em>Account Num</em>}</li>
 *   <li>{@link TestProjectV1.Salary#getBankName <em>Bank Name</em>}</li>
 *   <li>{@link TestProjectV1.Salary#getTaxes <em>Taxes</em>}</li>
 *   <li>{@link TestProjectV1.Salary#getEmpID <em>Emp ID</em>}</li>
 *   <li>{@link TestProjectV1.Salary#getAdminID <em>Admin ID</em>}</li>
 * </ul>
 *
 * @see TestProjectV1.TestProjectV1Package#getSalary()
 * @model
 * @generated
 */
public interface Salary extends EObject {
	/**
	 * Returns the value of the '<em><b>Account Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account Num</em>' attribute.
	 * @see #setAccountNum(String)
	 * @see TestProjectV1.TestProjectV1Package#getSalary_AccountNum()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getAccountNum();

	/**
	 * Sets the value of the '{@link TestProjectV1.Salary#getAccountNum <em>Account Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account Num</em>' attribute.
	 * @see #getAccountNum()
	 * @generated
	 */
	void setAccountNum(String value);

	/**
	 * Returns the value of the '<em><b>Bank Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bank Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bank Name</em>' attribute.
	 * @see #setBankName(String)
	 * @see TestProjectV1.TestProjectV1Package#getSalary_BankName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getBankName();

	/**
	 * Sets the value of the '{@link TestProjectV1.Salary#getBankName <em>Bank Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bank Name</em>' attribute.
	 * @see #getBankName()
	 * @generated
	 */
	void setBankName(String value);

	/**
	 * Returns the value of the '<em><b>Taxes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taxes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taxes</em>' attribute.
	 * @see #setTaxes(int)
	 * @see TestProjectV1.TestProjectV1Package#getSalary_Taxes()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getTaxes();

	/**
	 * Sets the value of the '{@link TestProjectV1.Salary#getTaxes <em>Taxes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taxes</em>' attribute.
	 * @see #getTaxes()
	 * @generated
	 */
	void setTaxes(int value);

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
	 * @see TestProjectV1.TestProjectV1Package#getSalary_EmpID()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getEmpID();

	/**
	 * Sets the value of the '{@link TestProjectV1.Salary#getEmpID <em>Emp ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emp ID</em>' attribute.
	 * @see #getEmpID()
	 * @generated
	 */
	void setEmpID(String value);

	/**
	 * Returns the value of the '<em><b>Admin ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Admin ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admin ID</em>' attribute.
	 * @see #setAdminID(String)
	 * @see TestProjectV1.TestProjectV1Package#getSalary_AdminID()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getAdminID();

	/**
	 * Sets the value of the '{@link TestProjectV1.Salary#getAdminID <em>Admin ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admin ID</em>' attribute.
	 * @see #getAdminID()
	 * @generated
	 */
	void setAdminID(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void viewSalary();

} // Salary
