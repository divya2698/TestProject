/**
 */
package TestProjectV1.impl;

import TestProjectV1.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestProjectV1FactoryImpl extends EFactoryImpl implements TestProjectV1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TestProjectV1Factory init() {
		try {
			TestProjectV1Factory theTestProjectV1Factory = (TestProjectV1Factory)EPackage.Registry.INSTANCE.getEFactory(TestProjectV1Package.eNS_URI);
			if (theTestProjectV1Factory != null) {
				return theTestProjectV1Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TestProjectV1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestProjectV1FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TestProjectV1Package.MANAGER: return createManager();
			case TestProjectV1Package.EMPLOYEE: return createEmployee();
			case TestProjectV1Package.PERFORMANCE_REVIEW: return createPerformanceReview();
			case TestProjectV1Package.PROJECT: return createProject();
			case TestProjectV1Package.SCHEDULE: return createSchedule();
			case TestProjectV1Package.DEPARTMENT: return createDepartment();
			case TestProjectV1Package.SALARY: return createSalary();
			case TestProjectV1Package.ADMIN: return createAdmin();
			case TestProjectV1Package.UML_STATE_MACHINE_COFFEE_VENDING_MACHINE: return createUMLStateMachineCoffeeVendingMachine();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Manager createManager() {
		ManagerImpl manager = new ManagerImpl();
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Employee createEmployee() {
		EmployeeImpl employee = new EmployeeImpl();
		return employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
//	@Override
//	public void createEmployee() {
//		EmployeeImpl employee = new EmployeeImpl();
//		return employee;
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PerformanceReview createPerformanceReview() {
		PerformanceReviewImpl performanceReview = new PerformanceReviewImpl();
		return performanceReview;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schedule createSchedule() {
		ScheduleImpl schedule = new ScheduleImpl();
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Department createDepartment() {
		DepartmentImpl department = new DepartmentImpl();
		return department;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Salary createSalary() {
		SalaryImpl salary = new SalaryImpl();
		return salary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Admin createAdmin() {
		AdminImpl admin = new AdminImpl();
		return admin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
//	@Override
//	public Admin createAdmin() {
//		AdminImpl admin = new AdminImpl();
//		return admin;
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UMLStateMachineCoffeeVendingMachine createUMLStateMachineCoffeeVendingMachine() {
		UMLStateMachineCoffeeVendingMachineImpl umlStateMachineCoffeeVendingMachine = new UMLStateMachineCoffeeVendingMachineImpl();
		return umlStateMachineCoffeeVendingMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestProjectV1Package getTestProjectV1Package() {
		return (TestProjectV1Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TestProjectV1Package getPackage() {
		return TestProjectV1Package.eINSTANCE;
	}

} //TestProjectV1FactoryImpl
