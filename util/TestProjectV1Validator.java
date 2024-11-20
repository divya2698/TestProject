/**
 */
package TestProjectV1.util;

import TestProjectV1.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see TestProjectV1.TestProjectV1Package
 * @generated
 */
public class TestProjectV1Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TestProjectV1Validator INSTANCE = new TestProjectV1Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "TestProjectV1";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Salary Positive' of 'Employee'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EMPLOYEE__SALARY_POSITIVE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Employee Has Qualification' of 'Employee'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EMPLOYEE__EMPLOYEE_HAS_QUALIFICATION = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Review Completenessfor Low Ratings' of 'Performance Review'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERFORMANCE_REVIEW__REVIEW_COMPLETENESSFOR_LOW_RATINGS = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'End After Start' of 'Project'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROJECT__END_AFTER_START = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Assign Employee' of 'Project'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROJECT__ASSIGN_EMPLOYEE = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Create Schedule' of 'Schedule'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCHEDULE__CREATE_SCHEDULE = 6;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 6;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestProjectV1Validator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return TestProjectV1Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case TestProjectV1Package.MANAGER:
				return validateManager((Manager)value, diagnostics, context);
			case TestProjectV1Package.EMPLOYEE:
				return validateEmployee((Employee)value, diagnostics, context);
			case TestProjectV1Package.PERFORMANCE_REVIEW:
				return validatePerformanceReview((PerformanceReview)value, diagnostics, context);
			case TestProjectV1Package.PROJECT:
				return validateProject((Project)value, diagnostics, context);
			case TestProjectV1Package.SCHEDULE:
				return validateSchedule((Schedule)value, diagnostics, context);
			case TestProjectV1Package.DEPARTMENT:
				return validateDepartment((Department)value, diagnostics, context);
			case TestProjectV1Package.SALARY:
				return validateSalary((Salary)value, diagnostics, context);
			case TestProjectV1Package.ADMIN:
				return validateAdmin((Admin)value, diagnostics, context);
			case TestProjectV1Package.UML_STATE_MACHINE_COFFEE_VENDING_MACHINE:
				return validateUMLStateMachineCoffeeVendingMachine((UMLStateMachineCoffeeVendingMachine)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManager(Manager manager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(manager, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(manager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(manager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(manager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(manager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(manager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(manager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(manager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(manager, diagnostics, context);
		if (result || diagnostics != null) result &= validateEmployee_SalaryPositive(manager, diagnostics, context);
		if (result || diagnostics != null) result &= validateEmployee_EmployeeHasQualification(manager, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmployee(Employee employee, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(employee, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(employee, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(employee, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(employee, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(employee, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(employee, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(employee, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(employee, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(employee, diagnostics, context);
		if (result || diagnostics != null) result &= validateEmployee_SalaryPositive(employee, diagnostics, context);
		if (result || diagnostics != null) result &= validateEmployee_EmployeeHasQualification(employee, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SalaryPositive constraint of '<em>Employee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmployee_SalaryPositive(Employee employee, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return employee.SalaryPositive(diagnostics, context);
	}

	/**
	 * Validates the EmployeeHasQualification constraint of '<em>Employee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmployee_EmployeeHasQualification(Employee employee, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return employee.EmployeeHasQualification(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerformanceReview(PerformanceReview performanceReview, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(performanceReview, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(performanceReview, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(performanceReview, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(performanceReview, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(performanceReview, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(performanceReview, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(performanceReview, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(performanceReview, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(performanceReview, diagnostics, context);
		if (result || diagnostics != null) result &= validatePerformanceReview_ReviewCompletenessforLowRatings(performanceReview, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ReviewCompletenessforLowRatings constraint of '<em>Performance Review</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerformanceReview_ReviewCompletenessforLowRatings(PerformanceReview performanceReview, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return performanceReview.ReviewCompletenessforLowRatings(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProject(Project project, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(project, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(project, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(project, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(project, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(project, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(project, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(project, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(project, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(project, diagnostics, context);
		if (result || diagnostics != null) result &= validateProject_EndAfterStart(project, diagnostics, context);
		if (result || diagnostics != null) result &= validateProject_assignEmployee(project, diagnostics, context);
		return result;
	}

	/**
	 * Validates the EndAfterStart constraint of '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProject_EndAfterStart(Project project, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return project.EndAfterStart(diagnostics, context);
	}

	/**
	 * Validates the assignEmployee constraint of '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProject_assignEmployee(Project project, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return project.assignEmployee(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchedule(Schedule schedule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(schedule, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(schedule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(schedule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(schedule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(schedule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(schedule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(schedule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(schedule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(schedule, diagnostics, context);
		if (result || diagnostics != null) result &= validateSchedule_createSchedule(schedule, diagnostics, context);
		return result;
	}

	/**
	 * Validates the createSchedule constraint of '<em>Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchedule_createSchedule(Schedule schedule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return schedule.createSchedule(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartment(Department department, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(department, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSalary(Salary salary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(salary, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdmin(Admin admin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(admin, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(admin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(admin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(admin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(admin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(admin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(admin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(admin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(admin, diagnostics, context);
		if (result || diagnostics != null) result &= validateEmployee_SalaryPositive(admin, diagnostics, context);
		if (result || diagnostics != null) result &= validateEmployee_EmployeeHasQualification(admin, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUMLStateMachineCoffeeVendingMachine(UMLStateMachineCoffeeVendingMachine umlStateMachineCoffeeVendingMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(umlStateMachineCoffeeVendingMachine, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //TestProjectV1Validator
