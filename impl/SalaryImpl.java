/**
 */
package TestProjectV1.impl;

import TestProjectV1.Salary;
import TestProjectV1.TestProjectV1Package;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Salary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TestProjectV1.impl.SalaryImpl#getAccountNum <em>Account Num</em>}</li>
 *   <li>{@link TestProjectV1.impl.SalaryImpl#getBankName <em>Bank Name</em>}</li>
 *   <li>{@link TestProjectV1.impl.SalaryImpl#getTaxes <em>Taxes</em>}</li>
 *   <li>{@link TestProjectV1.impl.SalaryImpl#getEmpID <em>Emp ID</em>}</li>
 *   <li>{@link TestProjectV1.impl.SalaryImpl#getAdminID <em>Admin ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SalaryImpl extends MinimalEObjectImpl.Container implements Salary {
	/**
	 * The default value of the '{@link #getAccountNum() <em>Account Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountNum()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOUNT_NUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccountNum() <em>Account Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountNum()
	 * @generated
	 * @ordered
	 */
	protected String accountNum = ACCOUNT_NUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getBankName() <em>Bank Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBankName()
	 * @generated
	 * @ordered
	 */
	protected static final String BANK_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBankName() <em>Bank Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBankName()
	 * @generated
	 * @ordered
	 */
	protected String bankName = BANK_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaxes() <em>Taxes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxes()
	 * @generated
	 * @ordered
	 */
	protected static final int TAXES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTaxes() <em>Taxes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxes()
	 * @generated
	 * @ordered
	 */
	protected int taxes = TAXES_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmpID() <em>Emp ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmpID()
	 * @generated
	 * @ordered
	 */
	protected static final String EMP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmpID() <em>Emp ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmpID()
	 * @generated
	 * @ordered
	 */
	protected String empID = EMP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdminID() <em>Admin ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdminID()
	 * @generated
	 * @ordered
	 */
	protected static final String ADMIN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdminID() <em>Admin ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdminID()
	 * @generated
	 * @ordered
	 */
	protected String adminID = ADMIN_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SalaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestProjectV1Package.Literals.SALARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccountNum() {
		return accountNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccountNum(String newAccountNum) {
		String oldAccountNum = accountNum;
		accountNum = newAccountNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestProjectV1Package.SALARY__ACCOUNT_NUM, oldAccountNum, accountNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBankName() {
		return bankName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBankName(String newBankName) {
		String oldBankName = bankName;
		bankName = newBankName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestProjectV1Package.SALARY__BANK_NAME, oldBankName, bankName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTaxes() {
		return taxes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxes(int newTaxes) {
		int oldTaxes = taxes;
		taxes = newTaxes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestProjectV1Package.SALARY__TAXES, oldTaxes, taxes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmpID() {
		return empID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmpID(String newEmpID) {
		String oldEmpID = empID;
		empID = newEmpID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestProjectV1Package.SALARY__EMP_ID, oldEmpID, empID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdminID() {
		return adminID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdminID(String newAdminID) {
		String oldAdminID = adminID;
		adminID = newAdminID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestProjectV1Package.SALARY__ADMIN_ID, oldAdminID, adminID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void viewSalary() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestProjectV1Package.SALARY__ACCOUNT_NUM:
				return getAccountNum();
			case TestProjectV1Package.SALARY__BANK_NAME:
				return getBankName();
			case TestProjectV1Package.SALARY__TAXES:
				return getTaxes();
			case TestProjectV1Package.SALARY__EMP_ID:
				return getEmpID();
			case TestProjectV1Package.SALARY__ADMIN_ID:
				return getAdminID();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TestProjectV1Package.SALARY__ACCOUNT_NUM:
				setAccountNum((String)newValue);
				return;
			case TestProjectV1Package.SALARY__BANK_NAME:
				setBankName((String)newValue);
				return;
			case TestProjectV1Package.SALARY__TAXES:
				setTaxes((Integer)newValue);
				return;
			case TestProjectV1Package.SALARY__EMP_ID:
				setEmpID((String)newValue);
				return;
			case TestProjectV1Package.SALARY__ADMIN_ID:
				setAdminID((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TestProjectV1Package.SALARY__ACCOUNT_NUM:
				setAccountNum(ACCOUNT_NUM_EDEFAULT);
				return;
			case TestProjectV1Package.SALARY__BANK_NAME:
				setBankName(BANK_NAME_EDEFAULT);
				return;
			case TestProjectV1Package.SALARY__TAXES:
				setTaxes(TAXES_EDEFAULT);
				return;
			case TestProjectV1Package.SALARY__EMP_ID:
				setEmpID(EMP_ID_EDEFAULT);
				return;
			case TestProjectV1Package.SALARY__ADMIN_ID:
				setAdminID(ADMIN_ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TestProjectV1Package.SALARY__ACCOUNT_NUM:
				return ACCOUNT_NUM_EDEFAULT == null ? accountNum != null : !ACCOUNT_NUM_EDEFAULT.equals(accountNum);
			case TestProjectV1Package.SALARY__BANK_NAME:
				return BANK_NAME_EDEFAULT == null ? bankName != null : !BANK_NAME_EDEFAULT.equals(bankName);
			case TestProjectV1Package.SALARY__TAXES:
				return taxes != TAXES_EDEFAULT;
			case TestProjectV1Package.SALARY__EMP_ID:
				return EMP_ID_EDEFAULT == null ? empID != null : !EMP_ID_EDEFAULT.equals(empID);
			case TestProjectV1Package.SALARY__ADMIN_ID:
				return ADMIN_ID_EDEFAULT == null ? adminID != null : !ADMIN_ID_EDEFAULT.equals(adminID);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TestProjectV1Package.SALARY___VIEW_SALARY:
				viewSalary();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (accountNum: ");
		result.append(accountNum);
		result.append(", bankName: ");
		result.append(bankName);
		result.append(", taxes: ");
		result.append(taxes);
		result.append(", empID: ");
		result.append(empID);
		result.append(", adminID: ");
		result.append(adminID);
		result.append(')');
		return result.toString();
	}

} //SalaryImpl
