/**
 */
package TestProjectV1.impl;

import TestProjectV1.Department;
import TestProjectV1.TestProjectV1Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TestProjectV1.impl.DepartmentImpl#getDeptName <em>Dept Name</em>}</li>
 *   <li>{@link TestProjectV1.impl.DepartmentImpl#getDeptCode <em>Dept Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DepartmentImpl extends MinimalEObjectImpl.Container implements Department {
	/**
	 * The default value of the '{@link #getDeptName() <em>Dept Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeptName()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeptName() <em>Dept Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeptName()
	 * @generated
	 * @ordered
	 */
	protected String deptName = DEPT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeptCode() <em>Dept Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeptCode()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPT_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeptCode() <em>Dept Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeptCode()
	 * @generated
	 * @ordered
	 */
	protected String deptCode = DEPT_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepartmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestProjectV1Package.Literals.DEPARTMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeptName() {
		return deptName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeptName(String newDeptName) {
		String oldDeptName = deptName;
		deptName = newDeptName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestProjectV1Package.DEPARTMENT__DEPT_NAME, oldDeptName, deptName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeptCode() {
		return deptCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeptCode(String newDeptCode) {
		String oldDeptCode = deptCode;
		deptCode = newDeptCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestProjectV1Package.DEPARTMENT__DEPT_CODE, oldDeptCode, deptCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestProjectV1Package.DEPARTMENT__DEPT_NAME:
				return getDeptName();
			case TestProjectV1Package.DEPARTMENT__DEPT_CODE:
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
			case TestProjectV1Package.DEPARTMENT__DEPT_NAME:
				setDeptName((String)newValue);
				return;
			case TestProjectV1Package.DEPARTMENT__DEPT_CODE:
				setDeptCode((String)newValue);
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
			case TestProjectV1Package.DEPARTMENT__DEPT_NAME:
				setDeptName(DEPT_NAME_EDEFAULT);
				return;
			case TestProjectV1Package.DEPARTMENT__DEPT_CODE:
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
			case TestProjectV1Package.DEPARTMENT__DEPT_NAME:
				return DEPT_NAME_EDEFAULT == null ? deptName != null : !DEPT_NAME_EDEFAULT.equals(deptName);
			case TestProjectV1Package.DEPARTMENT__DEPT_CODE:
				return DEPT_CODE_EDEFAULT == null ? deptCode != null : !DEPT_CODE_EDEFAULT.equals(deptCode);
		}
		return super.eIsSet(featureID);
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
		result.append(" (deptName: ");
		result.append(deptName);
		result.append(", deptCode: ");
		result.append(deptCode);
		result.append(')');
		return result.toString();
	}

} //DepartmentImpl
