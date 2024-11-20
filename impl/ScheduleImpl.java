/**
 */
package TestProjectV1.impl;

import TestProjectV1.Employee;
import TestProjectV1.Schedule;
import TestProjectV1.TestProjectV1Package;

import TestProjectV1.util.TestProjectV1Validator;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TestProjectV1.impl.ScheduleImpl#getProjectID <em>Project ID</em>}</li>
 *   <li>{@link TestProjectV1.impl.ScheduleImpl#getAssignedEmployees <em>Assigned Employees</em>}</li>
 *   <li>{@link TestProjectV1.impl.ScheduleImpl#getWeeklyHours <em>Weekly Hours</em>}</li>
 *   <li>{@link TestProjectV1.impl.ScheduleImpl#getShiftType <em>Shift Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScheduleImpl extends MinimalEObjectImpl.Container implements Schedule {
	/**
	 * The default value of the '{@link #getProjectID() <em>Project ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectID()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectID() <em>Project ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectID()
	 * @generated
	 * @ordered
	 */
	protected String projectID = PROJECT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssignedEmployees() <em>Assigned Employees</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedEmployees()
	 * @generated
	 * @ordered
	 */
	protected Employee assignedEmployees;

	/**
	 * The default value of the '{@link #getWeeklyHours() <em>Weekly Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeeklyHours()
	 * @generated
	 * @ordered
	 */
	protected static final int WEEKLY_HOURS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWeeklyHours() <em>Weekly Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeeklyHours()
	 * @generated
	 * @ordered
	 */
	protected int weeklyHours = WEEKLY_HOURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getShiftType() <em>Shift Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShiftType()
	 * @generated
	 * @ordered
	 */
	protected static final String SHIFT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShiftType() <em>Shift Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShiftType()
	 * @generated
	 * @ordered
	 */
	protected String shiftType = SHIFT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestProjectV1Package.Literals.SCHEDULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProjectID() {
		return projectID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectID(String newProjectID) {
		String oldProjectID = projectID;
		projectID = newProjectID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestProjectV1Package.SCHEDULE__PROJECT_ID, oldProjectID, projectID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Employee getAssignedEmployees() {
		if (assignedEmployees != null && assignedEmployees.eIsProxy()) {
			InternalEObject oldAssignedEmployees = (InternalEObject)assignedEmployees;
			assignedEmployees = (Employee)eResolveProxy(oldAssignedEmployees);
			if (assignedEmployees != oldAssignedEmployees) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestProjectV1Package.SCHEDULE__ASSIGNED_EMPLOYEES, oldAssignedEmployees, assignedEmployees));
			}
		}
		return assignedEmployees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee basicGetAssignedEmployees() {
		return assignedEmployees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssignedEmployees(Employee newAssignedEmployees) {
		Employee oldAssignedEmployees = assignedEmployees;
		assignedEmployees = newAssignedEmployees;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestProjectV1Package.SCHEDULE__ASSIGNED_EMPLOYEES, oldAssignedEmployees, assignedEmployees));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWeeklyHours() {
		return weeklyHours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeeklyHours(int newWeeklyHours) {
		int oldWeeklyHours = weeklyHours;
		weeklyHours = newWeeklyHours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestProjectV1Package.SCHEDULE__WEEKLY_HOURS, oldWeeklyHours, weeklyHours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShiftType() {
		return shiftType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShiftType(String newShiftType) {
		String oldShiftType = shiftType;
		shiftType = newShiftType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestProjectV1Package.SCHEDULE__SHIFT_TYPE, oldShiftType, shiftType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean createSchedule(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TestProjectV1Validator.DIAGNOSTIC_SOURCE,
						 TestProjectV1Validator.SCHEDULE__CREATE_SCHEDULE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "createSchedule", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createSchedule(Employee Employee, Date startDate, Date endDate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateSchedule(Employee Employee, Date startDate, Date endDate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getEmployeeSchedule(Employee Employee) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void generateWeeklySchedule() {
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
			case TestProjectV1Package.SCHEDULE__PROJECT_ID:
				return getProjectID();
			case TestProjectV1Package.SCHEDULE__ASSIGNED_EMPLOYEES:
				if (resolve) return getAssignedEmployees();
				return basicGetAssignedEmployees();
			case TestProjectV1Package.SCHEDULE__WEEKLY_HOURS:
				return getWeeklyHours();
			case TestProjectV1Package.SCHEDULE__SHIFT_TYPE:
				return getShiftType();
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
			case TestProjectV1Package.SCHEDULE__PROJECT_ID:
				setProjectID((String)newValue);
				return;
			case TestProjectV1Package.SCHEDULE__ASSIGNED_EMPLOYEES:
				setAssignedEmployees((Employee)newValue);
				return;
			case TestProjectV1Package.SCHEDULE__WEEKLY_HOURS:
				setWeeklyHours((Integer)newValue);
				return;
			case TestProjectV1Package.SCHEDULE__SHIFT_TYPE:
				setShiftType((String)newValue);
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
			case TestProjectV1Package.SCHEDULE__PROJECT_ID:
				setProjectID(PROJECT_ID_EDEFAULT);
				return;
			case TestProjectV1Package.SCHEDULE__ASSIGNED_EMPLOYEES:
				setAssignedEmployees((Employee)null);
				return;
			case TestProjectV1Package.SCHEDULE__WEEKLY_HOURS:
				setWeeklyHours(WEEKLY_HOURS_EDEFAULT);
				return;
			case TestProjectV1Package.SCHEDULE__SHIFT_TYPE:
				setShiftType(SHIFT_TYPE_EDEFAULT);
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
			case TestProjectV1Package.SCHEDULE__PROJECT_ID:
				return PROJECT_ID_EDEFAULT == null ? projectID != null : !PROJECT_ID_EDEFAULT.equals(projectID);
			case TestProjectV1Package.SCHEDULE__ASSIGNED_EMPLOYEES:
				return assignedEmployees != null;
			case TestProjectV1Package.SCHEDULE__WEEKLY_HOURS:
				return weeklyHours != WEEKLY_HOURS_EDEFAULT;
			case TestProjectV1Package.SCHEDULE__SHIFT_TYPE:
				return SHIFT_TYPE_EDEFAULT == null ? shiftType != null : !SHIFT_TYPE_EDEFAULT.equals(shiftType);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TestProjectV1Package.SCHEDULE___CREATE_SCHEDULE__DIAGNOSTICCHAIN_MAP:
				return createSchedule((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case TestProjectV1Package.SCHEDULE___CREATE_SCHEDULE__EMPLOYEE_DATE_DATE:
				createSchedule((Employee)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2));
				return null;
			case TestProjectV1Package.SCHEDULE___UPDATE_SCHEDULE__EMPLOYEE_DATE_DATE:
				updateSchedule((Employee)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2));
				return null;
			case TestProjectV1Package.SCHEDULE___GET_EMPLOYEE_SCHEDULE__EMPLOYEE:
				getEmployeeSchedule((Employee)arguments.get(0));
				return null;
			case TestProjectV1Package.SCHEDULE___GENERATE_WEEKLY_SCHEDULE:
				generateWeeklySchedule();
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
		result.append(" (projectID: ");
		result.append(projectID);
		result.append(", weeklyHours: ");
		result.append(weeklyHours);
		result.append(", shiftType: ");
		result.append(shiftType);
		result.append(')');
		return result.toString();
	}

} //ScheduleImpl
