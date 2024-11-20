/**
 */
package TestProjectV1.impl;

import TestProjectV1.Admin;
import TestProjectV1.Department;
import TestProjectV1.Employee;
import TestProjectV1.Manager;
import TestProjectV1.PerformanceReview;
import TestProjectV1.Project;
import TestProjectV1.Salary;
import TestProjectV1.Schedule;
import TestProjectV1.TestProjectV1Factory;
import TestProjectV1.TestProjectV1Package;
import TestProjectV1.UMLStateMachineCoffeeVendingMachine;

import TestProjectV1.util.TestProjectV1Validator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.types.impl.TypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestProjectV1PackageImpl extends EPackageImpl implements TestProjectV1Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass managerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass employeeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass performanceReviewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass departmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass salaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adminEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlStateMachineCoffeeVendingMachineEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see TestProjectV1.TestProjectV1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TestProjectV1PackageImpl() {
		super(eNS_URI, TestProjectV1Factory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link TestProjectV1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TestProjectV1Package init() {
		if (isInited) return (TestProjectV1Package)EPackage.Registry.INSTANCE.getEPackage(TestProjectV1Package.eNS_URI);

		// Obtain or create and register package
		Object registeredTestProjectV1Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		TestProjectV1PackageImpl theTestProjectV1Package = registeredTestProjectV1Package instanceof TestProjectV1PackageImpl ? (TestProjectV1PackageImpl)registeredTestProjectV1Package : new TestProjectV1PackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(registeredPackage instanceof TypesPackageImpl ? registeredPackage : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theTestProjectV1Package.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theTestProjectV1Package.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theTestProjectV1Package,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return TestProjectV1Validator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theTestProjectV1Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TestProjectV1Package.eNS_URI, theTestProjectV1Package);
		return theTestProjectV1Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getManager() {
		return managerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManager_MangerID() {
		return (EAttribute)managerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManager_DeptCode() {
		return (EAttribute)managerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getManager__MarkAttendance() {
		return managerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getManager__UpdateEmployeeDetails() {
		return managerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getManager__ApproveLeave() {
		return managerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getManager__TimeSheetApproval() {
		return managerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEmployee() {
		return employeeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmployee_Name() {
		return (EAttribute)employeeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmployee_Email() {
		return (EAttribute)employeeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmployee_Dob() {
		return (EAttribute)employeeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmployee_EmpID() {
		return (EAttribute)employeeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmployee_Experience() {
		return (EAttribute)employeeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmployee_TotalHoursWorked() {
		return (EAttribute)employeeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmployee_Qualification() {
		return (EAttribute)employeeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmployee_JoinDate() {
		return (EAttribute)employeeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmployee_SalaryAmount() {
		return (EAttribute)employeeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmployee_ReportTo() {
		return (EAttribute)employeeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmployee__totalCompensation() {
		return (EAttribute)employeeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEmployee_Performancereview() {
		return (EReference)employeeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEmployee__SalaryPositive__DiagnosticChain_Map() {
		return employeeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEmployee__EmployeeHasQualification__DiagnosticChain_Map() {
		return employeeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEmployee__LogAttendance() {
		return employeeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEmployee__ViewDetails() {
		return employeeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEmployee__ClaculateSalary() {
		return employeeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEmployee__GetCurrentProject() {
		return employeeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEmployee__GetAge() {
		return employeeEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPerformanceReview() {
		return performanceReviewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerformanceReview_ReviewID() {
		return (EAttribute)performanceReviewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerformanceReview_ReviewDate() {
		return (EAttribute)performanceReviewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerformanceReview_Comments() {
		return (EAttribute)performanceReviewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPerformanceReview__ReviewCompletenessforLowRatings__DiagnosticChain_Map() {
		return performanceReviewEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPerformanceReview__ConductReview__Manager_Employee() {
		return performanceReviewEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPerformanceReview__AddFeedBack__Employee_String() {
		return performanceReviewEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPerformanceReview__ViewReview__Employee() {
		return performanceReviewEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProject() {
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_ProjectName() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_EndDate() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_StartDate() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_TeamMembers() {
		return (EReference)projectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_DeptCode() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProject__EndAfterStart__DiagnosticChain_Map() {
		return projectEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProject__AssignEmployee__DiagnosticChain_Map() {
		return projectEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProject___assignEmployee__Employee() {
		return projectEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProject__RemoveEmployee__Employee() {
		return projectEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchedule() {
		return scheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchedule_ProjectID() {
		return (EAttribute)scheduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchedule_AssignedEmployees() {
		return (EReference)scheduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchedule_WeeklyHours() {
		return (EAttribute)scheduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchedule_ShiftType() {
		return (EAttribute)scheduleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSchedule__CreateSchedule__DiagnosticChain_Map() {
		return scheduleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSchedule__CreateSchedule__Employee_Date_Date() {
		return scheduleEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSchedule__UpdateSchedule__Employee_Date_Date() {
		return scheduleEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSchedule__GetEmployeeSchedule__Employee() {
		return scheduleEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSchedule__GenerateWeeklySchedule() {
		return scheduleEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDepartment() {
		return departmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDepartment_DeptName() {
		return (EAttribute)departmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDepartment_DeptCode() {
		return (EAttribute)departmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSalary() {
		return salaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalary_AccountNum() {
		return (EAttribute)salaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalary_BankName() {
		return (EAttribute)salaryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalary_Taxes() {
		return (EAttribute)salaryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalary_EmpID() {
		return (EAttribute)salaryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalary_AdminID() {
		return (EAttribute)salaryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSalary__ViewSalary() {
		return salaryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdmin() {
		return adminEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdmin_AdminID() {
		return (EAttribute)adminEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdmin_AdminRole() {
		return (EAttribute)adminEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdmin_Salary() {
		return (EReference)adminEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAdmin__AproveSalary__Employee() {
		return adminEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAdmin__ModifySalaryDetails() {
		return adminEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAdmin__AssignManagerToDept__Manager() {
		return adminEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAdmin__TerminateManager__Manager() {
		return adminEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAdmin__AproveSalary__Manager() {
		return adminEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUMLStateMachineCoffeeVendingMachine() {
		return umlStateMachineCoffeeVendingMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestProjectV1Factory getTestProjectV1Factory() {
		return (TestProjectV1Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		managerEClass = createEClass(MANAGER);
		createEAttribute(managerEClass, MANAGER__MANGER_ID);
		createEAttribute(managerEClass, MANAGER__DEPT_CODE);
		createEOperation(managerEClass, MANAGER___MARK_ATTENDANCE);
		createEOperation(managerEClass, MANAGER___UPDATE_EMPLOYEE_DETAILS);
		createEOperation(managerEClass, MANAGER___APPROVE_LEAVE);
		createEOperation(managerEClass, MANAGER___TIME_SHEET_APPROVAL);

		employeeEClass = createEClass(EMPLOYEE);
		createEAttribute(employeeEClass, EMPLOYEE__NAME);
		createEAttribute(employeeEClass, EMPLOYEE__EMAIL);
		createEAttribute(employeeEClass, EMPLOYEE__DOB);
		createEAttribute(employeeEClass, EMPLOYEE__EMP_ID);
		createEAttribute(employeeEClass, EMPLOYEE__EXPERIENCE);
		createEAttribute(employeeEClass, EMPLOYEE__TOTAL_HOURS_WORKED);
		createEAttribute(employeeEClass, EMPLOYEE__QUALIFICATION);
		createEAttribute(employeeEClass, EMPLOYEE__JOIN_DATE);
		createEAttribute(employeeEClass, EMPLOYEE__SALARY_AMOUNT);
		createEAttribute(employeeEClass, EMPLOYEE__REPORT_TO);
		createEAttribute(employeeEClass, EMPLOYEE__TOTAL_COMPENSATION);
		createEReference(employeeEClass, EMPLOYEE__PERFORMANCEREVIEW);
		createEOperation(employeeEClass, EMPLOYEE___SALARY_POSITIVE__DIAGNOSTICCHAIN_MAP);
		createEOperation(employeeEClass, EMPLOYEE___EMPLOYEE_HAS_QUALIFICATION__DIAGNOSTICCHAIN_MAP);
		createEOperation(employeeEClass, EMPLOYEE___LOG_ATTENDANCE);
		createEOperation(employeeEClass, EMPLOYEE___VIEW_DETAILS);
		createEOperation(employeeEClass, EMPLOYEE___CLACULATE_SALARY);
		createEOperation(employeeEClass, EMPLOYEE___GET_CURRENT_PROJECT);
		createEOperation(employeeEClass, EMPLOYEE___GET_AGE);

		performanceReviewEClass = createEClass(PERFORMANCE_REVIEW);
		createEAttribute(performanceReviewEClass, PERFORMANCE_REVIEW__REVIEW_ID);
		createEAttribute(performanceReviewEClass, PERFORMANCE_REVIEW__REVIEW_DATE);
		createEAttribute(performanceReviewEClass, PERFORMANCE_REVIEW__COMMENTS);
		createEOperation(performanceReviewEClass, PERFORMANCE_REVIEW___REVIEW_COMPLETENESSFOR_LOW_RATINGS__DIAGNOSTICCHAIN_MAP);
		createEOperation(performanceReviewEClass, PERFORMANCE_REVIEW___CONDUCT_REVIEW__MANAGER_EMPLOYEE);
		createEOperation(performanceReviewEClass, PERFORMANCE_REVIEW___ADD_FEED_BACK__EMPLOYEE_STRING);
		createEOperation(performanceReviewEClass, PERFORMANCE_REVIEW___VIEW_REVIEW__EMPLOYEE);

		projectEClass = createEClass(PROJECT);
		createEAttribute(projectEClass, PROJECT__PROJECT_NAME);
		createEAttribute(projectEClass, PROJECT__END_DATE);
		createEAttribute(projectEClass, PROJECT__START_DATE);
		createEReference(projectEClass, PROJECT__TEAM_MEMBERS);
		createEAttribute(projectEClass, PROJECT__DEPT_CODE);
		createEOperation(projectEClass, PROJECT___END_AFTER_START__DIAGNOSTICCHAIN_MAP);
		createEOperation(projectEClass, PROJECT___ASSIGN_EMPLOYEE__DIAGNOSTICCHAIN_MAP);
		createEOperation(projectEClass, PROJECT___ASSIGN_EMPLOYEE__EMPLOYEE);
		createEOperation(projectEClass, PROJECT___REMOVE_EMPLOYEE__EMPLOYEE);

		scheduleEClass = createEClass(SCHEDULE);
		createEAttribute(scheduleEClass, SCHEDULE__PROJECT_ID);
		createEReference(scheduleEClass, SCHEDULE__ASSIGNED_EMPLOYEES);
		createEAttribute(scheduleEClass, SCHEDULE__WEEKLY_HOURS);
		createEAttribute(scheduleEClass, SCHEDULE__SHIFT_TYPE);
		createEOperation(scheduleEClass, SCHEDULE___CREATE_SCHEDULE__DIAGNOSTICCHAIN_MAP);
		createEOperation(scheduleEClass, SCHEDULE___CREATE_SCHEDULE__EMPLOYEE_DATE_DATE);
		createEOperation(scheduleEClass, SCHEDULE___UPDATE_SCHEDULE__EMPLOYEE_DATE_DATE);
		createEOperation(scheduleEClass, SCHEDULE___GET_EMPLOYEE_SCHEDULE__EMPLOYEE);
		createEOperation(scheduleEClass, SCHEDULE___GENERATE_WEEKLY_SCHEDULE);

		departmentEClass = createEClass(DEPARTMENT);
		createEAttribute(departmentEClass, DEPARTMENT__DEPT_NAME);
		createEAttribute(departmentEClass, DEPARTMENT__DEPT_CODE);

		salaryEClass = createEClass(SALARY);
		createEAttribute(salaryEClass, SALARY__ACCOUNT_NUM);
		createEAttribute(salaryEClass, SALARY__BANK_NAME);
		createEAttribute(salaryEClass, SALARY__TAXES);
		createEAttribute(salaryEClass, SALARY__EMP_ID);
		createEAttribute(salaryEClass, SALARY__ADMIN_ID);
		createEOperation(salaryEClass, SALARY___VIEW_SALARY);

		adminEClass = createEClass(ADMIN);
		createEAttribute(adminEClass, ADMIN__ADMIN_ID);
		createEAttribute(adminEClass, ADMIN__ADMIN_ROLE);
		createEReference(adminEClass, ADMIN__SALARY);
		createEOperation(adminEClass, ADMIN___APROVE_SALARY__EMPLOYEE);
		createEOperation(adminEClass, ADMIN___MODIFY_SALARY_DETAILS);
		createEOperation(adminEClass, ADMIN___ASSIGN_MANAGER_TO_DEPT__MANAGER);
		createEOperation(adminEClass, ADMIN___TERMINATE_MANAGER__MANAGER);
		createEOperation(adminEClass, ADMIN___APROVE_SALARY__MANAGER);

		umlStateMachineCoffeeVendingMachineEClass = createEClass(UML_STATE_MACHINE_COFFEE_VENDING_MACHINE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		managerEClass.getESuperTypes().add(this.getEmployee());
		adminEClass.getESuperTypes().add(this.getEmployee());

		// Initialize classes, features, and operations; add parameters
		initEClass(managerEClass, Manager.class, "Manager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getManager_MangerID(), theTypesPackage.getInteger(), "mangerID", null, 1, 1, Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getManager_DeptCode(), theTypesPackage.getInteger(), "deptCode", null, 1, 1, Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getManager__MarkAttendance(), null, "markAttendance", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getManager__UpdateEmployeeDetails(), null, "updateEmployeeDetails", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getManager__ApproveLeave(), null, "approveLeave", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getManager__TimeSheetApproval(), null, "timeSheetApproval", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(employeeEClass, Employee.class, "Employee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmployee_Name(), theTypesPackage.getString(), "name", null, 1, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmployee_Email(), theTypesPackage.getString(), "email", null, 1, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmployee_Dob(), ecorePackage.getEDate(), "dob", null, 1, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmployee_EmpID(), theTypesPackage.getString(), "empID", null, 1, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmployee_Experience(), theTypesPackage.getInteger(), "experience", null, 1, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmployee_TotalHoursWorked(), theTypesPackage.getInteger(), "totalHoursWorked", null, 1, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmployee_Qualification(), theTypesPackage.getString(), "qualification", null, 1, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmployee_JoinDate(), ecorePackage.getEDate(), "joinDate", null, 1, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmployee_SalaryAmount(), theTypesPackage.getInteger(), "salaryAmount", null, 1, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmployee_ReportTo(), theTypesPackage.getString(), "reportTo", null, 1, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmployee__totalCompensation(), theTypesPackage.getInteger(), "_totalCompensation", null, 1, 1, Employee.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getEmployee_Performancereview(), this.getPerformanceReview(), null, "performancereview", null, 0, -1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getEmployee__SalaryPositive__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "SalaryPositive", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEmployee__EmployeeHasQualification__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "EmployeeHasQualification", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getEmployee__LogAttendance(), null, "logAttendance", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getEmployee__ViewDetails(), null, "viewDetails", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getEmployee__ClaculateSalary(), null, "claculateSalary", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getEmployee__GetCurrentProject(), null, "getCurrentProject", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getEmployee__GetAge(), null, "getAge", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(performanceReviewEClass, PerformanceReview.class, "PerformanceReview", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerformanceReview_ReviewID(), theTypesPackage.getString(), "reviewID", null, 1, 1, PerformanceReview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPerformanceReview_ReviewDate(), ecorePackage.getEDate(), "reviewDate", null, 1, 1, PerformanceReview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPerformanceReview_Comments(), theTypesPackage.getString(), "comments", null, 1, 1, PerformanceReview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getPerformanceReview__ReviewCompletenessforLowRatings__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ReviewCompletenessforLowRatings", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPerformanceReview__ConductReview__Manager_Employee(), null, "conductReview", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getManager(), "Manager", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getEmployee(), "employee", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getPerformanceReview__AddFeedBack__Employee_String(), null, "addFeedBack", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getEmployee(), "employee", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "feedback", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getPerformanceReview__ViewReview__Employee(), null, "viewReview", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getEmployee(), "employee", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProject_ProjectName(), theTypesPackage.getString(), "projectName", null, 1, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProject_EndDate(), ecorePackage.getEDate(), "endDate", null, 1, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProject_StartDate(), ecorePackage.getEDate(), "startDate", null, 1, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProject_TeamMembers(), this.getEmployee(), null, "teamMembers", null, 1, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProject_DeptCode(), theTypesPackage.getString(), "deptCode", null, 1, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getProject__EndAfterStart__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "EndAfterStart", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getProject__AssignEmployee__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "assignEmployee", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getProject___assignEmployee__Employee(), null, "_assignEmployee", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getEmployee(), "Employee", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getProject__RemoveEmployee__Employee(), null, "removeEmployee", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getEmployee(), "Employee", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(scheduleEClass, Schedule.class, "Schedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchedule_ProjectID(), theTypesPackage.getString(), "projectID", null, 1, 1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSchedule_AssignedEmployees(), this.getEmployee(), null, "assignedEmployees", null, 1, 1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSchedule_WeeklyHours(), theTypesPackage.getInteger(), "weeklyHours", null, 1, 1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSchedule_ShiftType(), theTypesPackage.getString(), "shiftType", null, 1, 1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getSchedule__CreateSchedule__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "createSchedule", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSchedule__CreateSchedule__Employee_Date_Date(), null, "createSchedule", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getEmployee(), "Employee", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "startDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "endDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getSchedule__UpdateSchedule__Employee_Date_Date(), null, "updateSchedule", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getEmployee(), "Employee", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "startDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "endDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getSchedule__GetEmployeeSchedule__Employee(), null, "getEmployeeSchedule", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getEmployee(), "Employee", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSchedule__GenerateWeeklySchedule(), null, "generateWeeklySchedule", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(departmentEClass, Department.class, "Department", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDepartment_DeptName(), theTypesPackage.getString(), "deptName", null, 1, 1, Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDepartment_DeptCode(), theTypesPackage.getString(), "deptCode", null, 1, 1, Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(salaryEClass, Salary.class, "Salary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSalary_AccountNum(), theTypesPackage.getString(), "accountNum", null, 1, 1, Salary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSalary_BankName(), theTypesPackage.getString(), "bankName", null, 1, 1, Salary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSalary_Taxes(), theTypesPackage.getInteger(), "taxes", null, 1, 1, Salary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSalary_EmpID(), theTypesPackage.getString(), "empID", null, 1, 1, Salary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSalary_AdminID(), theTypesPackage.getString(), "adminID", null, 1, 1, Salary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getSalary__ViewSalary(), null, "viewSalary", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(adminEClass, Admin.class, "Admin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdmin_AdminID(), theTypesPackage.getString(), "adminID", null, 1, 1, Admin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAdmin_AdminRole(), theTypesPackage.getBoolean(), "adminRole", null, 1, 1, Admin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAdmin_Salary(), this.getSalary(), null, "salary", null, 0, 1, Admin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getAdmin__AproveSalary__Employee(), null, "aproveSalary", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getEmployee(), "employee", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getAdmin__ModifySalaryDetails(), null, "modifySalaryDetails", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getAdmin__AssignManagerToDept__Manager(), null, "assignManagerToDept", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getManager(), "Manager", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getAdmin__TerminateManager__Manager(), null, "terminateManager", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getManager(), "Manager", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getAdmin__AproveSalary__Manager(), null, "aproveSalary", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getManager(), "manager", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(umlStateMachineCoffeeVendingMachineEClass, UMLStateMachineCoffeeVendingMachine.class, "UMLStateMachineCoffeeVendingMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";
		addAnnotation
		  (getEmployee__totalCompensation(),
		   source,
		   new String[] {
			   "originalName", " totalCompensation"
		   });
		addAnnotation
		  (getEmployee_Performancereview(),
		   source,
		   new String[] {
			   "originalName", "performance review"
		   });
		addAnnotation
		  (performanceReviewEClass,
		   source,
		   new String[] {
			   "originalName", "Performance Review"
		   });
		addAnnotation
		  (getPerformanceReview__ReviewCompletenessforLowRatings__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "originalName", "Review Completeness for Low Ratings"
		   });
		addAnnotation
		  (getProject___assignEmployee__Employee(),
		   source,
		   new String[] {
			   "originalName", "/ assignEmployee"
		   });
		addAnnotation
		  (umlStateMachineCoffeeVendingMachineEClass,
		   source,
		   new String[] {
			   "originalName", "UML State Machine Coffee Vending Machine"
		   });
	}

} //TestProjectV1PackageImpl
