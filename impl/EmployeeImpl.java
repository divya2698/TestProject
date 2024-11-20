/**
 */
package TestProjectV1.impl;

import TestProjectV1.Employee;
import TestProjectV1.PerformanceReview;
import TestProjectV1.TestProjectV1Package;

import TestProjectV1.util.TestProjectV1Validator;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TestProjectV1.impl.EmployeeImpl#getName <em>Name</em>}</li>
 *   <li>{@link TestProjectV1.impl.EmployeeImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link TestProjectV1.impl.EmployeeImpl#getDob <em>Dob</em>}</li>
 *   <li>{@link TestProjectV1.impl.EmployeeImpl#getEmpID <em>Emp ID</em>}</li>
 *   <li>{@link TestProjectV1.impl.EmployeeImpl#getExperience <em>Experience</em>}</li>
 *   <li>{@link TestProjectV1.impl.EmployeeImpl#getTotalHoursWorked <em>Total Hours Worked</em>}</li>
 *   <li>{@link TestProjectV1.impl.EmployeeImpl#getQualification <em>Qualification</em>}</li>
 *   <li>{@link TestProjectV1.impl.EmployeeImpl#getJoinDate <em>Join Date</em>}</li>
 *   <li>{@link TestProjectV1.impl.EmployeeImpl#getSalaryAmount <em>Salary Amount</em>}</li>
 *   <li>{@link TestProjectV1.impl.EmployeeImpl#getReportTo <em>Report To</em>}</li>
 *   <li>{@link TestProjectV1.impl.EmployeeImpl#get_totalCompensation <em>total Compensation</em>}</li>
 *   <li>{@link TestProjectV1.impl.EmployeeImpl#getPerformancereview <em>Performancereview</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmployeeImpl extends MinimalEObjectImpl.Container implements Employee {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDob() <em>Dob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDob()
	 * @generated
	 * @ordered
	 */
	protected static final Date DOB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDob() <em>Dob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDob()
	 * @generated
	 * @ordered
	 */
	protected Date dob = DOB_EDEFAULT;

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
	 * The default value of the '{@link #getExperience() <em>Experience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperience()
	 * @generated
	 * @ordered
	 */
	protected static final int EXPERIENCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExperience() <em>Experience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperience()
	 * @generated
	 * @ordered
	 */
	protected int experience = EXPERIENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalHoursWorked() <em>Total Hours Worked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalHoursWorked()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_HOURS_WORKED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotalHoursWorked() <em>Total Hours Worked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalHoursWorked()
	 * @generated
	 * @ordered
	 */
	protected int totalHoursWorked = TOTAL_HOURS_WORKED_EDEFAULT;

	/**
	 * The default value of the '{@link #getQualification() <em>Qualification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualification()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualification() <em>Qualification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualification()
	 * @generated
	 * @ordered
	 */
	protected String qualification = QUALIFICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getJoinDate() <em>Join Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date JOIN_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJoinDate() <em>Join Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinDate()
	 * @generated
	 * @ordered
	 */
	protected Date joinDate = JOIN_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSalaryAmount() <em>Salary Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalaryAmount()
	 * @generated
	 * @ordered
	 */
	protected static final int SALARY_AMOUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSalaryAmount() <em>Salary Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalaryAmount()
	 * @generated
	 * @ordered
	 */
	protected int salaryAmount = SALARY_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getReportTo() <em>Report To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportTo()
	 * @generated
	 * @ordered
	 */
	protected static final String REPORT_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReportTo() <em>Report To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportTo()
	 * @generated
	 * @ordered
	 */
	protected String reportTo = REPORT_TO_EDEFAULT;

	/**
	 * The default value of the '{@link #get_totalCompensation() <em>total Compensation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_totalCompensation()
	 * @generated
	 * @ordered
	 */
	protected static final int _TOTAL_COMPENSATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPerformancereview() <em>Performancereview</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformancereview()
	 * @generated
	 * @ordered
	 */
	protected EList<PerformanceReview> performancereview;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmployeeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestProjectV1Package.Literals.EMPLOYEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestProjectV1Package.EMPLOYEE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestProjectV1Package.EMPLOYEE__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDob() {
		return dob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDob(Date newDob) {
		Date oldDob = dob;
		dob = newDob;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestProjectV1Package.EMPLOYEE__DOB, oldDob, dob));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestProjectV1Package.EMPLOYEE__EMP_ID, oldEmpID, empID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getExperience() {
		return experience;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExperience(int newExperience) {
		int oldExperience = experience;
		experience = newExperience;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestProjectV1Package.EMPLOYEE__EXPERIENCE, oldExperience, experience));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTotalHoursWorked() {
		return totalHoursWorked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalHoursWorked(int newTotalHoursWorked) {
		int oldTotalHoursWorked = totalHoursWorked;
		totalHoursWorked = newTotalHoursWorked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestProjectV1Package.EMPLOYEE__TOTAL_HOURS_WORKED, oldTotalHoursWorked, totalHoursWorked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQualification() {
		return qualification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQualification(String newQualification) {
		String oldQualification = qualification;
		qualification = newQualification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestProjectV1Package.EMPLOYEE__QUALIFICATION, oldQualification, qualification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getJoinDate() {
		return joinDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJoinDate(Date newJoinDate) {
		Date oldJoinDate = joinDate;
		joinDate = newJoinDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestProjectV1Package.EMPLOYEE__JOIN_DATE, oldJoinDate, joinDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSalaryAmount() {
		return salaryAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalaryAmount(int newSalaryAmount) {
		int oldSalaryAmount = salaryAmount;
		salaryAmount = newSalaryAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestProjectV1Package.EMPLOYEE__SALARY_AMOUNT, oldSalaryAmount, salaryAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReportTo() {
		return reportTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReportTo(String newReportTo) {
		String oldReportTo = reportTo;
		reportTo = newReportTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestProjectV1Package.EMPLOYEE__REPORT_TO, oldReportTo, reportTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int get_totalCompensation() {
		// TODO: implement this method to return the 'total Compensation' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void set_totalCompensation(int new_totalCompensation) {
		// TODO: implement this method to set the 'total Compensation' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PerformanceReview> getPerformancereview() {
		if (performancereview == null) {
			performancereview = new EObjectResolvingEList<PerformanceReview>(PerformanceReview.class, this, TestProjectV1Package.EMPLOYEE__PERFORMANCEREVIEW);
		}
		return performancereview;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean SalaryPositive(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 TestProjectV1Validator.EMPLOYEE__SALARY_POSITIVE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SalaryPositive", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean EmployeeHasQualification(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 TestProjectV1Validator.EMPLOYEE__EMPLOYEE_HAS_QUALIFICATION,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "EmployeeHasQualification", EObjectValidator.getObjectLabel(this, context) }),
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
	public void logAttendance() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void viewDetails() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void claculateSalary() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getCurrentProject() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getAge() {
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
			case TestProjectV1Package.EMPLOYEE__NAME:
				return getName();
			case TestProjectV1Package.EMPLOYEE__EMAIL:
				return getEmail();
			case TestProjectV1Package.EMPLOYEE__DOB:
				return getDob();
			case TestProjectV1Package.EMPLOYEE__EMP_ID:
				return getEmpID();
			case TestProjectV1Package.EMPLOYEE__EXPERIENCE:
				return getExperience();
			case TestProjectV1Package.EMPLOYEE__TOTAL_HOURS_WORKED:
				return getTotalHoursWorked();
			case TestProjectV1Package.EMPLOYEE__QUALIFICATION:
				return getQualification();
			case TestProjectV1Package.EMPLOYEE__JOIN_DATE:
				return getJoinDate();
			case TestProjectV1Package.EMPLOYEE__SALARY_AMOUNT:
				return getSalaryAmount();
			case TestProjectV1Package.EMPLOYEE__REPORT_TO:
				return getReportTo();
			case TestProjectV1Package.EMPLOYEE__TOTAL_COMPENSATION:
				return get_totalCompensation();
			case TestProjectV1Package.EMPLOYEE__PERFORMANCEREVIEW:
				return getPerformancereview();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TestProjectV1Package.EMPLOYEE__NAME:
				setName((String)newValue);
				return;
			case TestProjectV1Package.EMPLOYEE__EMAIL:
				setEmail((String)newValue);
				return;
			case TestProjectV1Package.EMPLOYEE__DOB:
				setDob((Date)newValue);
				return;
			case TestProjectV1Package.EMPLOYEE__EMP_ID:
				setEmpID((String)newValue);
				return;
			case TestProjectV1Package.EMPLOYEE__EXPERIENCE:
				setExperience((Integer)newValue);
				return;
			case TestProjectV1Package.EMPLOYEE__TOTAL_HOURS_WORKED:
				setTotalHoursWorked((Integer)newValue);
				return;
			case TestProjectV1Package.EMPLOYEE__QUALIFICATION:
				setQualification((String)newValue);
				return;
			case TestProjectV1Package.EMPLOYEE__JOIN_DATE:
				setJoinDate((Date)newValue);
				return;
			case TestProjectV1Package.EMPLOYEE__SALARY_AMOUNT:
				setSalaryAmount((Integer)newValue);
				return;
			case TestProjectV1Package.EMPLOYEE__REPORT_TO:
				setReportTo((String)newValue);
				return;
			case TestProjectV1Package.EMPLOYEE__TOTAL_COMPENSATION:
				set_totalCompensation((Integer)newValue);
				return;
			case TestProjectV1Package.EMPLOYEE__PERFORMANCEREVIEW:
				getPerformancereview().clear();
				getPerformancereview().addAll((Collection<? extends PerformanceReview>)newValue);
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
			case TestProjectV1Package.EMPLOYEE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TestProjectV1Package.EMPLOYEE__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case TestProjectV1Package.EMPLOYEE__DOB:
				setDob(DOB_EDEFAULT);
				return;
			case TestProjectV1Package.EMPLOYEE__EMP_ID:
				setEmpID(EMP_ID_EDEFAULT);
				return;
			case TestProjectV1Package.EMPLOYEE__EXPERIENCE:
				setExperience(EXPERIENCE_EDEFAULT);
				return;
			case TestProjectV1Package.EMPLOYEE__TOTAL_HOURS_WORKED:
				setTotalHoursWorked(TOTAL_HOURS_WORKED_EDEFAULT);
				return;
			case TestProjectV1Package.EMPLOYEE__QUALIFICATION:
				setQualification(QUALIFICATION_EDEFAULT);
				return;
			case TestProjectV1Package.EMPLOYEE__JOIN_DATE:
				setJoinDate(JOIN_DATE_EDEFAULT);
				return;
			case TestProjectV1Package.EMPLOYEE__SALARY_AMOUNT:
				setSalaryAmount(SALARY_AMOUNT_EDEFAULT);
				return;
			case TestProjectV1Package.EMPLOYEE__REPORT_TO:
				setReportTo(REPORT_TO_EDEFAULT);
				return;
			case TestProjectV1Package.EMPLOYEE__TOTAL_COMPENSATION:
				set_totalCompensation(_TOTAL_COMPENSATION_EDEFAULT);
				return;
			case TestProjectV1Package.EMPLOYEE__PERFORMANCEREVIEW:
				getPerformancereview().clear();
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
			case TestProjectV1Package.EMPLOYEE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TestProjectV1Package.EMPLOYEE__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case TestProjectV1Package.EMPLOYEE__DOB:
				return DOB_EDEFAULT == null ? dob != null : !DOB_EDEFAULT.equals(dob);
			case TestProjectV1Package.EMPLOYEE__EMP_ID:
				return EMP_ID_EDEFAULT == null ? empID != null : !EMP_ID_EDEFAULT.equals(empID);
			case TestProjectV1Package.EMPLOYEE__EXPERIENCE:
				return experience != EXPERIENCE_EDEFAULT;
			case TestProjectV1Package.EMPLOYEE__TOTAL_HOURS_WORKED:
				return totalHoursWorked != TOTAL_HOURS_WORKED_EDEFAULT;
			case TestProjectV1Package.EMPLOYEE__QUALIFICATION:
				return QUALIFICATION_EDEFAULT == null ? qualification != null : !QUALIFICATION_EDEFAULT.equals(qualification);
			case TestProjectV1Package.EMPLOYEE__JOIN_DATE:
				return JOIN_DATE_EDEFAULT == null ? joinDate != null : !JOIN_DATE_EDEFAULT.equals(joinDate);
			case TestProjectV1Package.EMPLOYEE__SALARY_AMOUNT:
				return salaryAmount != SALARY_AMOUNT_EDEFAULT;
			case TestProjectV1Package.EMPLOYEE__REPORT_TO:
				return REPORT_TO_EDEFAULT == null ? reportTo != null : !REPORT_TO_EDEFAULT.equals(reportTo);
			case TestProjectV1Package.EMPLOYEE__TOTAL_COMPENSATION:
				return get_totalCompensation() != _TOTAL_COMPENSATION_EDEFAULT;
			case TestProjectV1Package.EMPLOYEE__PERFORMANCEREVIEW:
				return performancereview != null && !performancereview.isEmpty();
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
			case TestProjectV1Package.EMPLOYEE___SALARY_POSITIVE__DIAGNOSTICCHAIN_MAP:
				return SalaryPositive((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case TestProjectV1Package.EMPLOYEE___EMPLOYEE_HAS_QUALIFICATION__DIAGNOSTICCHAIN_MAP:
				return EmployeeHasQualification((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case TestProjectV1Package.EMPLOYEE___LOG_ATTENDANCE:
				logAttendance();
				return null;
			case TestProjectV1Package.EMPLOYEE___VIEW_DETAILS:
				viewDetails();
				return null;
			case TestProjectV1Package.EMPLOYEE___CLACULATE_SALARY:
				claculateSalary();
				return null;
			case TestProjectV1Package.EMPLOYEE___GET_CURRENT_PROJECT:
				getCurrentProject();
				return null;
			case TestProjectV1Package.EMPLOYEE___GET_AGE:
				getAge();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", email: ");
		result.append(email);
		result.append(", dob: ");
		result.append(dob);
		result.append(", empID: ");
		result.append(empID);
		result.append(", experience: ");
		result.append(experience);
		result.append(", totalHoursWorked: ");
		result.append(totalHoursWorked);
		result.append(", qualification: ");
		result.append(qualification);
		result.append(", joinDate: ");
		result.append(joinDate);
		result.append(", salaryAmount: ");
		result.append(salaryAmount);
		result.append(", reportTo: ");
		result.append(reportTo);
		result.append(')');
		return result.toString();
	}

	@Override
	public void updateEmployeeDetails() {
		// TODO Auto-generated method stub
		
	}

} //EmployeeImpl
