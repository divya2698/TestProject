/**
 */
package TestProjectV1.impl;

import TestProjectV1.Employee;
import TestProjectV1.Project;
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
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TestProjectV1.impl.ProjectImpl#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link TestProjectV1.impl.ProjectImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link TestProjectV1.impl.ProjectImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link TestProjectV1.impl.ProjectImpl#getTeamMembers <em>Team Members</em>}</li>
 *   <li>{@link TestProjectV1.impl.ProjectImpl#getDeptCode <em>Dept Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectImpl extends MinimalEObjectImpl.Container implements Project {
	/**
	 * The default value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected String projectName = PROJECT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date endDate = END_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate = START_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTeamMembers() <em>Team Members</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeamMembers()
	 * @generated
	 * @ordered
	 */
	protected Employee teamMembers;

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
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestProjectV1Package.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProjectName() {
		return projectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectName(String newProjectName) {
		String oldProjectName = projectName;
		projectName = newProjectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestProjectV1Package.PROJECT__PROJECT_NAME, oldProjectName, projectName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndDate(Date newEndDate) {
		Date oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestProjectV1Package.PROJECT__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartDate(Date newStartDate) {
		Date oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestProjectV1Package.PROJECT__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Employee getTeamMembers() {
		if (teamMembers != null && teamMembers.eIsProxy()) {
			InternalEObject oldTeamMembers = (InternalEObject)teamMembers;
			teamMembers = (Employee)eResolveProxy(oldTeamMembers);
			if (teamMembers != oldTeamMembers) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestProjectV1Package.PROJECT__TEAM_MEMBERS, oldTeamMembers, teamMembers));
			}
		}
		return teamMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee basicGetTeamMembers() {
		return teamMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTeamMembers(Employee newTeamMembers) {
		Employee oldTeamMembers = teamMembers;
		teamMembers = newTeamMembers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestProjectV1Package.PROJECT__TEAM_MEMBERS, oldTeamMembers, teamMembers));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestProjectV1Package.PROJECT__DEPT_CODE, oldDeptCode, deptCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean EndAfterStart(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 TestProjectV1Validator.PROJECT__END_AFTER_START,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "EndAfterStart", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean assignEmployee(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 TestProjectV1Validator.PROJECT__ASSIGN_EMPLOYEE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "assignEmployee", EObjectValidator.getObjectLabel(this, context) }),
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
	public void _assignEmployee(Employee Employee) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeEmployee(Employee Employee) {
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
			case TestProjectV1Package.PROJECT__PROJECT_NAME:
				return getProjectName();
			case TestProjectV1Package.PROJECT__END_DATE:
				return getEndDate();
			case TestProjectV1Package.PROJECT__START_DATE:
				return getStartDate();
			case TestProjectV1Package.PROJECT__TEAM_MEMBERS:
				if (resolve) return getTeamMembers();
				return basicGetTeamMembers();
			case TestProjectV1Package.PROJECT__DEPT_CODE:
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
			case TestProjectV1Package.PROJECT__PROJECT_NAME:
				setProjectName((String)newValue);
				return;
			case TestProjectV1Package.PROJECT__END_DATE:
				setEndDate((Date)newValue);
				return;
			case TestProjectV1Package.PROJECT__START_DATE:
				setStartDate((Date)newValue);
				return;
			case TestProjectV1Package.PROJECT__TEAM_MEMBERS:
				setTeamMembers((Employee)newValue);
				return;
			case TestProjectV1Package.PROJECT__DEPT_CODE:
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
			case TestProjectV1Package.PROJECT__PROJECT_NAME:
				setProjectName(PROJECT_NAME_EDEFAULT);
				return;
			case TestProjectV1Package.PROJECT__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case TestProjectV1Package.PROJECT__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case TestProjectV1Package.PROJECT__TEAM_MEMBERS:
				setTeamMembers((Employee)null);
				return;
			case TestProjectV1Package.PROJECT__DEPT_CODE:
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
			case TestProjectV1Package.PROJECT__PROJECT_NAME:
				return PROJECT_NAME_EDEFAULT == null ? projectName != null : !PROJECT_NAME_EDEFAULT.equals(projectName);
			case TestProjectV1Package.PROJECT__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case TestProjectV1Package.PROJECT__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case TestProjectV1Package.PROJECT__TEAM_MEMBERS:
				return teamMembers != null;
			case TestProjectV1Package.PROJECT__DEPT_CODE:
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TestProjectV1Package.PROJECT___END_AFTER_START__DIAGNOSTICCHAIN_MAP:
				return EndAfterStart((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case TestProjectV1Package.PROJECT___ASSIGN_EMPLOYEE__DIAGNOSTICCHAIN_MAP:
				return assignEmployee((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case TestProjectV1Package.PROJECT___ASSIGN_EMPLOYEE__EMPLOYEE:
				_assignEmployee((Employee)arguments.get(0));
				return null;
			case TestProjectV1Package.PROJECT___REMOVE_EMPLOYEE__EMPLOYEE:
				removeEmployee((Employee)arguments.get(0));
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
		result.append(" (projectName: ");
		result.append(projectName);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", deptCode: ");
		result.append(deptCode);
		result.append(')');
		return result.toString();
	}

} //ProjectImpl
