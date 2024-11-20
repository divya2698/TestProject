/**
 */
package TestProjectV1.impl;

import TestProjectV1.Admin;
import TestProjectV1.Employee;
import TestProjectV1.Manager;
import TestProjectV1.Salary;
import TestProjectV1.TestProjectV1Package;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Admin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TestProjectV1.impl.AdminImpl#getAdminID <em>Admin ID</em>}</li>
 *   <li>{@link TestProjectV1.impl.AdminImpl#isAdminRole <em>Admin Role</em>}</li>
 *   <li>{@link TestProjectV1.impl.AdminImpl#getSalary <em>Salary</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdminImpl extends EmployeeImpl implements Admin {
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
	 * The default value of the '{@link #isAdminRole() <em>Admin Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAdminRole()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ADMIN_ROLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAdminRole() <em>Admin Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAdminRole()
	 * @generated
	 * @ordered
	 */
	protected boolean adminRole = ADMIN_ROLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSalary() <em>Salary</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalary()
	 * @generated
	 * @ordered
	 */
	protected Salary salary;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdminImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestProjectV1Package.Literals.ADMIN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestProjectV1Package.ADMIN__ADMIN_ID, oldAdminID, adminID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAdminRole() {
		return adminRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdminRole(boolean newAdminRole) {
		boolean oldAdminRole = adminRole;
		adminRole = newAdminRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestProjectV1Package.ADMIN__ADMIN_ROLE, oldAdminRole, adminRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Salary getSalary() {
		if (salary != null && salary.eIsProxy()) {
			InternalEObject oldSalary = (InternalEObject)salary;
			salary = (Salary)eResolveProxy(oldSalary);
			if (salary != oldSalary) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestProjectV1Package.ADMIN__SALARY, oldSalary, salary));
			}
		}
		return salary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Salary basicGetSalary() {
		return salary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalary(Salary newSalary) {
		Salary oldSalary = salary;
		salary = newSalary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestProjectV1Package.ADMIN__SALARY, oldSalary, salary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void aproveSalary(Employee employee) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void modifySalaryDetails() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void assignManagerToDept(Manager Manager) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void terminateManager(Manager Manager) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void aproveSalary(Manager manager) {
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
			case TestProjectV1Package.ADMIN__ADMIN_ID:
				return getAdminID();
			case TestProjectV1Package.ADMIN__ADMIN_ROLE:
				return isAdminRole();
			case TestProjectV1Package.ADMIN__SALARY:
				if (resolve) return getSalary();
				return basicGetSalary();
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
			case TestProjectV1Package.ADMIN__ADMIN_ID:
				setAdminID((String)newValue);
				return;
			case TestProjectV1Package.ADMIN__ADMIN_ROLE:
				setAdminRole((Boolean)newValue);
				return;
			case TestProjectV1Package.ADMIN__SALARY:
				setSalary((Salary)newValue);
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
			case TestProjectV1Package.ADMIN__ADMIN_ID:
				setAdminID(ADMIN_ID_EDEFAULT);
				return;
			case TestProjectV1Package.ADMIN__ADMIN_ROLE:
				setAdminRole(ADMIN_ROLE_EDEFAULT);
				return;
			case TestProjectV1Package.ADMIN__SALARY:
				setSalary((Salary)null);
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
			case TestProjectV1Package.ADMIN__ADMIN_ID:
				return ADMIN_ID_EDEFAULT == null ? adminID != null : !ADMIN_ID_EDEFAULT.equals(adminID);
			case TestProjectV1Package.ADMIN__ADMIN_ROLE:
				return adminRole != ADMIN_ROLE_EDEFAULT;
			case TestProjectV1Package.ADMIN__SALARY:
				return salary != null;
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
			case TestProjectV1Package.ADMIN___APROVE_SALARY__EMPLOYEE:
				aproveSalary((Employee)arguments.get(0));
				return null;
			case TestProjectV1Package.ADMIN___MODIFY_SALARY_DETAILS:
				modifySalaryDetails();
				return null;
			case TestProjectV1Package.ADMIN___ASSIGN_MANAGER_TO_DEPT__MANAGER:
				assignManagerToDept((Manager)arguments.get(0));
				return null;
			case TestProjectV1Package.ADMIN___TERMINATE_MANAGER__MANAGER:
				terminateManager((Manager)arguments.get(0));
				return null;
			case TestProjectV1Package.ADMIN___APROVE_SALARY__MANAGER:
				aproveSalary((Manager)arguments.get(0));
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
		result.append(" (adminID: ");
		result.append(adminID);
		result.append(", adminRole: ");
		result.append(adminRole);
		result.append(')');
		return result.toString();
	}

} //AdminImpl
