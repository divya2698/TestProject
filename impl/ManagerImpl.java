/**
 */
package TestProjectV1.impl;

import TestProjectV1.Manager;
import TestProjectV1.TestProjectV1Package;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TestProjectV1.impl.ManagerImpl#getMangerID <em>Manger ID</em>}</li>
 *   <li>{@link TestProjectV1.impl.ManagerImpl#getDeptCode <em>Dept Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ManagerImpl extends EmployeeImpl implements Manager {
	/**
	 * The default value of the '{@link #getMangerID() <em>Manger ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMangerID()
	 * @generated
	 * @ordered
	 */
	protected static final int MANGER_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMangerID() <em>Manger ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMangerID()
	 * @generated
	 * @ordered
	 */
	protected int mangerID = MANGER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeptCode() <em>Dept Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeptCode()
	 * @generated
	 * @ordered
	 */
	protected static final int DEPT_CODE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDeptCode() <em>Dept Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeptCode()
	 * @generated
	 * @ordered
	 */
	protected int deptCode = DEPT_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestProjectV1Package.Literals.MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMangerID() {
		return mangerID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMangerID(int newMangerID) {
		int oldMangerID = mangerID;
		mangerID = newMangerID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestProjectV1Package.MANAGER__MANGER_ID, oldMangerID, mangerID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDeptCode() {
		return deptCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeptCode(int newDeptCode) {
		int oldDeptCode = deptCode;
		deptCode = newDeptCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestProjectV1Package.MANAGER__DEPT_CODE, oldDeptCode, deptCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void markAttendance() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateEmployeeDetails() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void approveLeave() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void timeSheetApproval() {
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
			case TestProjectV1Package.MANAGER__MANGER_ID:
				return getMangerID();
			case TestProjectV1Package.MANAGER__DEPT_CODE:
				return getDeptCode();
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
			case TestProjectV1Package.MANAGER__MANGER_ID:
				setMangerID((Integer)newValue);
				return;
			case TestProjectV1Package.MANAGER__DEPT_CODE:
				setDeptCode((Integer)newValue);
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
			case TestProjectV1Package.MANAGER__MANGER_ID:
				setMangerID(MANGER_ID_EDEFAULT);
				return;
			case TestProjectV1Package.MANAGER__DEPT_CODE:
				setDeptCode(DEPT_CODE_EDEFAULT);
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
			case TestProjectV1Package.MANAGER__MANGER_ID:
				return mangerID != MANGER_ID_EDEFAULT;
			case TestProjectV1Package.MANAGER__DEPT_CODE:
				return deptCode != DEPT_CODE_EDEFAULT;
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
			case TestProjectV1Package.MANAGER___MARK_ATTENDANCE:
				markAttendance();
				return null;
			case TestProjectV1Package.MANAGER___UPDATE_EMPLOYEE_DETAILS:
				updateEmployeeDetails();
				return null;
			case TestProjectV1Package.MANAGER___APPROVE_LEAVE:
				approveLeave();
				return null;
			case TestProjectV1Package.MANAGER___TIME_SHEET_APPROVAL:
				timeSheetApproval();
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
		result.append(" (mangerID: ");
		result.append(mangerID);
		result.append(", deptCode: ");
		result.append(deptCode);
		result.append(')');
		return result.toString();
	}

} //ManagerImpl
