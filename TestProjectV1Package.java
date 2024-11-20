/**
 */
package TestProjectV1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * context Employee inv TotalHoursNonNegative: self.totalHoursWorked >= 0
 * 
 * <!-- end-model-doc -->
 * @see TestProjectV1.TestProjectV1Factory
 * @model kind="package"
 * @generated
 */
public interface TestProjectV1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TestProjectV1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///TestProjectV1.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "TestProjectV1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestProjectV1Package eINSTANCE = TestProjectV1.impl.TestProjectV1PackageImpl.init();

	/**
	 * The meta object id for the '{@link TestProjectV1.impl.EmployeeImpl <em>Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestProjectV1.impl.EmployeeImpl
	 * @see TestProjectV1.impl.TestProjectV1PackageImpl#getEmployee()
	 * @generated
	 */
	int EMPLOYEE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__EMAIL = 1;

	/**
	 * The feature id for the '<em><b>Dob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__DOB = 2;

	/**
	 * The feature id for the '<em><b>Emp ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__EMP_ID = 3;

	/**
	 * The feature id for the '<em><b>Experience</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__EXPERIENCE = 4;

	/**
	 * The feature id for the '<em><b>Total Hours Worked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__TOTAL_HOURS_WORKED = 5;

	/**
	 * The feature id for the '<em><b>Qualification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__QUALIFICATION = 6;

	/**
	 * The feature id for the '<em><b>Join Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__JOIN_DATE = 7;

	/**
	 * The feature id for the '<em><b>Salary Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__SALARY_AMOUNT = 8;

	/**
	 * The feature id for the '<em><b>Report To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__REPORT_TO = 9;

	/**
	 * The feature id for the '<em><b>total Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__TOTAL_COMPENSATION = 10;

	/**
	 * The feature id for the '<em><b>Performancereview</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__PERFORMANCEREVIEW = 11;

	/**
	 * The number of structural features of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_FEATURE_COUNT = 12;

	/**
	 * The operation id for the '<em>Salary Positive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE___SALARY_POSITIVE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Employee Has Qualification</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE___EMPLOYEE_HAS_QUALIFICATION__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Log Attendance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE___LOG_ATTENDANCE = 2;

	/**
	 * The operation id for the '<em>View Details</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE___VIEW_DETAILS = 3;

	/**
	 * The operation id for the '<em>Claculate Salary</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE___CLACULATE_SALARY = 4;

	/**
	 * The operation id for the '<em>Get Current Project</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE___GET_CURRENT_PROJECT = 5;

	/**
	 * The operation id for the '<em>Get Age</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE___GET_AGE = 6;

	/**
	 * The number of operations of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_OPERATION_COUNT = 7;

	/**
	 * The meta object id for the '{@link TestProjectV1.impl.ManagerImpl <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestProjectV1.impl.ManagerImpl
	 * @see TestProjectV1.impl.TestProjectV1PackageImpl#getManager()
	 * @generated
	 */
	int MANAGER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__NAME = EMPLOYEE__NAME;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__EMAIL = EMPLOYEE__EMAIL;

	/**
	 * The feature id for the '<em><b>Dob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__DOB = EMPLOYEE__DOB;

	/**
	 * The feature id for the '<em><b>Emp ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__EMP_ID = EMPLOYEE__EMP_ID;

	/**
	 * The feature id for the '<em><b>Experience</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__EXPERIENCE = EMPLOYEE__EXPERIENCE;

	/**
	 * The feature id for the '<em><b>Total Hours Worked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__TOTAL_HOURS_WORKED = EMPLOYEE__TOTAL_HOURS_WORKED;

	/**
	 * The feature id for the '<em><b>Qualification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__QUALIFICATION = EMPLOYEE__QUALIFICATION;

	/**
	 * The feature id for the '<em><b>Join Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__JOIN_DATE = EMPLOYEE__JOIN_DATE;

	/**
	 * The feature id for the '<em><b>Salary Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__SALARY_AMOUNT = EMPLOYEE__SALARY_AMOUNT;

	/**
	 * The feature id for the '<em><b>Report To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__REPORT_TO = EMPLOYEE__REPORT_TO;

	/**
	 * The feature id for the '<em><b>total Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__TOTAL_COMPENSATION = EMPLOYEE__TOTAL_COMPENSATION;

	/**
	 * The feature id for the '<em><b>Performancereview</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__PERFORMANCEREVIEW = EMPLOYEE__PERFORMANCEREVIEW;

	/**
	 * The feature id for the '<em><b>Manger ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__MANGER_ID = EMPLOYEE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dept Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__DEPT_CODE = EMPLOYEE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_FEATURE_COUNT = EMPLOYEE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Salary Positive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER___SALARY_POSITIVE__DIAGNOSTICCHAIN_MAP = EMPLOYEE___SALARY_POSITIVE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Employee Has Qualification</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER___EMPLOYEE_HAS_QUALIFICATION__DIAGNOSTICCHAIN_MAP = EMPLOYEE___EMPLOYEE_HAS_QUALIFICATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Log Attendance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER___LOG_ATTENDANCE = EMPLOYEE___LOG_ATTENDANCE;

	/**
	 * The operation id for the '<em>View Details</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER___VIEW_DETAILS = EMPLOYEE___VIEW_DETAILS;

	/**
	 * The operation id for the '<em>Claculate Salary</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER___CLACULATE_SALARY = EMPLOYEE___CLACULATE_SALARY;

	/**
	 * The operation id for the '<em>Get Current Project</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER___GET_CURRENT_PROJECT = EMPLOYEE___GET_CURRENT_PROJECT;

	/**
	 * The operation id for the '<em>Get Age</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER___GET_AGE = EMPLOYEE___GET_AGE;

	/**
	 * The operation id for the '<em>Mark Attendance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER___MARK_ATTENDANCE = EMPLOYEE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Update Employee Details</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER___UPDATE_EMPLOYEE_DETAILS = EMPLOYEE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Approve Leave</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER___APPROVE_LEAVE = EMPLOYEE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Time Sheet Approval</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER___TIME_SHEET_APPROVAL = EMPLOYEE_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_OPERATION_COUNT = EMPLOYEE_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link TestProjectV1.impl.PerformanceReviewImpl <em>Performance Review</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestProjectV1.impl.PerformanceReviewImpl
	 * @see TestProjectV1.impl.TestProjectV1PackageImpl#getPerformanceReview()
	 * @generated
	 */
	int PERFORMANCE_REVIEW = 2;

	/**
	 * The feature id for the '<em><b>Review ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_REVIEW__REVIEW_ID = 0;

	/**
	 * The feature id for the '<em><b>Review Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_REVIEW__REVIEW_DATE = 1;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_REVIEW__COMMENTS = 2;

	/**
	 * The number of structural features of the '<em>Performance Review</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_REVIEW_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Review Completenessfor Low Ratings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_REVIEW___REVIEW_COMPLETENESSFOR_LOW_RATINGS__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Conduct Review</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_REVIEW___CONDUCT_REVIEW__MANAGER_EMPLOYEE = 1;

	/**
	 * The operation id for the '<em>Add Feed Back</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_REVIEW___ADD_FEED_BACK__EMPLOYEE_STRING = 2;

	/**
	 * The operation id for the '<em>View Review</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_REVIEW___VIEW_REVIEW__EMPLOYEE = 3;

	/**
	 * The number of operations of the '<em>Performance Review</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_REVIEW_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link TestProjectV1.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestProjectV1.impl.ProjectImpl
	 * @see TestProjectV1.impl.TestProjectV1PackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 3;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PROJECT_NAME = 0;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__END_DATE = 1;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__START_DATE = 2;

	/**
	 * The feature id for the '<em><b>Team Members</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__TEAM_MEMBERS = 3;

	/**
	 * The feature id for the '<em><b>Dept Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DEPT_CODE = 4;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>End After Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT___END_AFTER_START__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Assign Employee</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT___ASSIGN_EMPLOYEE__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>assign Employee</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT___ASSIGN_EMPLOYEE__EMPLOYEE = 2;

	/**
	 * The operation id for the '<em>Remove Employee</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT___REMOVE_EMPLOYEE__EMPLOYEE = 3;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link TestProjectV1.impl.ScheduleImpl <em>Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestProjectV1.impl.ScheduleImpl
	 * @see TestProjectV1.impl.TestProjectV1PackageImpl#getSchedule()
	 * @generated
	 */
	int SCHEDULE = 4;

	/**
	 * The feature id for the '<em><b>Project ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__PROJECT_ID = 0;

	/**
	 * The feature id for the '<em><b>Assigned Employees</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__ASSIGNED_EMPLOYEES = 1;

	/**
	 * The feature id for the '<em><b>Weekly Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__WEEKLY_HOURS = 2;

	/**
	 * The feature id for the '<em><b>Shift Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__SHIFT_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Create Schedule</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE___CREATE_SCHEDULE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Create Schedule</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE___CREATE_SCHEDULE__EMPLOYEE_DATE_DATE = 1;

	/**
	 * The operation id for the '<em>Update Schedule</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE___UPDATE_SCHEDULE__EMPLOYEE_DATE_DATE = 2;

	/**
	 * The operation id for the '<em>Get Employee Schedule</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE___GET_EMPLOYEE_SCHEDULE__EMPLOYEE = 3;

	/**
	 * The operation id for the '<em>Generate Weekly Schedule</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE___GENERATE_WEEKLY_SCHEDULE = 4;

	/**
	 * The number of operations of the '<em>Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link TestProjectV1.impl.DepartmentImpl <em>Department</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestProjectV1.impl.DepartmentImpl
	 * @see TestProjectV1.impl.TestProjectV1PackageImpl#getDepartment()
	 * @generated
	 */
	int DEPARTMENT = 5;

	/**
	 * The feature id for the '<em><b>Dept Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__DEPT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Dept Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__DEPT_CODE = 1;

	/**
	 * The number of structural features of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestProjectV1.impl.SalaryImpl <em>Salary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestProjectV1.impl.SalaryImpl
	 * @see TestProjectV1.impl.TestProjectV1PackageImpl#getSalary()
	 * @generated
	 */
	int SALARY = 6;

	/**
	 * The feature id for the '<em><b>Account Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALARY__ACCOUNT_NUM = 0;

	/**
	 * The feature id for the '<em><b>Bank Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALARY__BANK_NAME = 1;

	/**
	 * The feature id for the '<em><b>Taxes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALARY__TAXES = 2;

	/**
	 * The feature id for the '<em><b>Emp ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALARY__EMP_ID = 3;

	/**
	 * The feature id for the '<em><b>Admin ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALARY__ADMIN_ID = 4;

	/**
	 * The number of structural features of the '<em>Salary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALARY_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>View Salary</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALARY___VIEW_SALARY = 0;

	/**
	 * The number of operations of the '<em>Salary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALARY_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link TestProjectV1.impl.AdminImpl <em>Admin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestProjectV1.impl.AdminImpl
	 * @see TestProjectV1.impl.TestProjectV1PackageImpl#getAdmin()
	 * @generated
	 */
	int ADMIN = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__NAME = EMPLOYEE__NAME;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__EMAIL = EMPLOYEE__EMAIL;

	/**
	 * The feature id for the '<em><b>Dob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__DOB = EMPLOYEE__DOB;

	/**
	 * The feature id for the '<em><b>Emp ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__EMP_ID = EMPLOYEE__EMP_ID;

	/**
	 * The feature id for the '<em><b>Experience</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__EXPERIENCE = EMPLOYEE__EXPERIENCE;

	/**
	 * The feature id for the '<em><b>Total Hours Worked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__TOTAL_HOURS_WORKED = EMPLOYEE__TOTAL_HOURS_WORKED;

	/**
	 * The feature id for the '<em><b>Qualification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__QUALIFICATION = EMPLOYEE__QUALIFICATION;

	/**
	 * The feature id for the '<em><b>Join Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__JOIN_DATE = EMPLOYEE__JOIN_DATE;

	/**
	 * The feature id for the '<em><b>Salary Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__SALARY_AMOUNT = EMPLOYEE__SALARY_AMOUNT;

	/**
	 * The feature id for the '<em><b>Report To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__REPORT_TO = EMPLOYEE__REPORT_TO;

	/**
	 * The feature id for the '<em><b>total Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__TOTAL_COMPENSATION = EMPLOYEE__TOTAL_COMPENSATION;

	/**
	 * The feature id for the '<em><b>Performancereview</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__PERFORMANCEREVIEW = EMPLOYEE__PERFORMANCEREVIEW;

	/**
	 * The feature id for the '<em><b>Admin ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__ADMIN_ID = EMPLOYEE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Admin Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__ADMIN_ROLE = EMPLOYEE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Salary</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__SALARY = EMPLOYEE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_FEATURE_COUNT = EMPLOYEE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Salary Positive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___SALARY_POSITIVE__DIAGNOSTICCHAIN_MAP = EMPLOYEE___SALARY_POSITIVE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Employee Has Qualification</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___EMPLOYEE_HAS_QUALIFICATION__DIAGNOSTICCHAIN_MAP = EMPLOYEE___EMPLOYEE_HAS_QUALIFICATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Log Attendance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___LOG_ATTENDANCE = EMPLOYEE___LOG_ATTENDANCE;

	/**
	 * The operation id for the '<em>View Details</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___VIEW_DETAILS = EMPLOYEE___VIEW_DETAILS;

	/**
	 * The operation id for the '<em>Claculate Salary</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___CLACULATE_SALARY = EMPLOYEE___CLACULATE_SALARY;

	/**
	 * The operation id for the '<em>Get Current Project</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___GET_CURRENT_PROJECT = EMPLOYEE___GET_CURRENT_PROJECT;

	/**
	 * The operation id for the '<em>Get Age</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___GET_AGE = EMPLOYEE___GET_AGE;

	/**
	 * The operation id for the '<em>Aprove Salary</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___APROVE_SALARY__EMPLOYEE = EMPLOYEE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Modify Salary Details</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___MODIFY_SALARY_DETAILS = EMPLOYEE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Assign Manager To Dept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___ASSIGN_MANAGER_TO_DEPT__MANAGER = EMPLOYEE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Terminate Manager</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___TERMINATE_MANAGER__MANAGER = EMPLOYEE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Aprove Salary</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___APROVE_SALARY__MANAGER = EMPLOYEE_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_OPERATION_COUNT = EMPLOYEE_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link TestProjectV1.impl.UMLStateMachineCoffeeVendingMachineImpl <em>UML State Machine Coffee Vending Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestProjectV1.impl.UMLStateMachineCoffeeVendingMachineImpl
	 * @see TestProjectV1.impl.TestProjectV1PackageImpl#getUMLStateMachineCoffeeVendingMachine()
	 * @generated
	 */
	int UML_STATE_MACHINE_COFFEE_VENDING_MACHINE = 8;

	/**
	 * The number of structural features of the '<em>UML State Machine Coffee Vending Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STATE_MACHINE_COFFEE_VENDING_MACHINE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>UML State Machine Coffee Vending Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STATE_MACHINE_COFFEE_VENDING_MACHINE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link TestProjectV1.Manager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see TestProjectV1.Manager
	 * @generated
	 */
	EClass getManager();

	/**
	 * Returns the meta object for the attribute '{@link TestProjectV1.Manager#getMangerID <em>Manger ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manger ID</em>'.
	 * @see TestProjectV1.Manager#getMangerID()
	 * @see #getManager()
	 * @generated
	 */
	EAttribute getManager_MangerID();

	/**
	 * Returns the meta object for the attribute '{@link TestProjectV1.Manager#getDeptCode <em>Dept Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dept Code</em>'.
	 * @see TestProjectV1.Manager#getDeptCode()
	 * @see #getManager()
	 * @generated
	 */
	EAttribute getManager_DeptCode();

	/**
	 * Returns the meta object for the '{@link TestProjectV1.Manager#markAttendance() <em>Mark Attendance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Mark Attendance</em>' operation.
	 * @see TestProjectV1.Manager#markAttendance()
	 * @generated
	 */
	EOperation getManager__MarkAttendance();

	/**
	 * Returns the meta object for the '{@link TestProjectV1.Manager#updateEmployeeDetails() <em>Update Employee Details</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Employee Details</em>' operation.
	 * @see TestProjectV1.Manager#updateEmployeeDetails()
	 * @generated
	 */
	EOperation getManager__UpdateEmployeeDetails();

	/**
	 * Returns the meta object for the '{@link TestProjectV1.Manager#approveLeave() <em>Approve Leave</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Approve Leave</em>' operation.
	 * @see TestProjectV1.Manager#approveLeave()
	 * @generated
	 */
	EOperation getManager__ApproveLeave();

	/**
	 * Returns the meta object for the '{@link TestProjectV1.Manager#timeSheetApproval() <em>Time Sheet Approval</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Time Sheet Approval</em>' operation.
	 * @see TestProjectV1.Manager#timeSheetApproval()
	 * @generated
	 */
	EOperation getManager__TimeSheetApproval();

	/**
	 * Returns the meta object for class '{@link TestProjectV1.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee</em>'.
	 * @see TestProjectV1.Employee
	 * @generated
	 */
	EClass getEmployee();

	/**
	 * Returns the meta object for the attribute '{@link TestProjectV1.Employee#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TestProjectV1.Employee#getName()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Name();

	/**
	 * Returns the meta object for the attribute '{@link TestProjectV1.Employee#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see TestProjectV1.Employee#getEmail()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Email();

	/**
	 * Returns the meta object for the attribute '{@link TestProjectV1.Employee#getDob <em>Dob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dob</em>'.
	 * @see TestProjectV1.Employee#getDob()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Dob();

	/**
	 * Returns the meta object for the attribute '{@link TestProjectV1.Employee#getEmpID <em>Emp ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emp ID</em>'.
	 * @see TestProjectV1.Employee#getEmpID()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_EmpID();

	/**
	 * Returns the meta object for the attribute '{@link TestProjectV1.Employee#getExperience <em>Experience</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Experience</em>'.
	 * @see TestProjectV1.Employee#getExperience()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Experience();

	/**
	 * Returns the meta object for the attribute '{@link TestProjectV1.Employee#getTotalHoursWorked <em>Total Hours Worked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Hours Worked</em>'.
	 * @see TestProjectV1.Employee#getTotalHoursWorked()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_TotalHoursWorked();

	/**
	 * Returns the meta object for the attribute '{@link TestProjectV1.Employee#getQualification <em>Qualification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualification</em>'.
	 * @see TestProjectV1.Employee#getQualification()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Qualification();

	/**
	 * Returns the meta object for the attribute '{@link TestProjectV1.Employee#getJoinDate <em>Join Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Join Date</em>'.
	 * @see TestProjectV1.Employee#getJoinDate()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_JoinDate();

	/**
	 * Returns the meta object for the attribute '{@link TestProjectV1.Employee#getSalaryAmount <em>Salary Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salary Amount</em>'.
	 * @see TestProjectV1.Employee#getSalaryAmount()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_SalaryAmount();

	/**
	 * Returns the meta object for the attribute '{@link TestProjectV1.Employee#getReportTo <em>Report To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Report To</em>'.
	 * @see TestProjectV1.Employee#getReportTo()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_ReportTo();

	/**
	 * Returns the meta object for the attribute '{@link TestProjectV1.Employee#get_totalCompensation <em>total Compensation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>total Compensation</em>'.
	 * @see TestProjectV1.Employee#get_totalCompensation()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee__totalCompensation();

	/**
	 * Returns the meta object for the reference list '{@link TestProjectV1.Employee#getPerformancereview <em>Performancereview</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Performancereview</em>'.
	 * @see TestProjectV1.Employee#getPerformancereview()
	 * @see #getEmployee()
	 * @generated
	 */
	EReference getEmployee_Performancereview();

	/**
	 * Returns the meta object for the '{@link TestProjectV1.Employee#SalaryPositive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Salary Positive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Salary Positive</em>' operation.
	 * @see TestProjectV1.Employee#SalaryPositive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEmployee__SalaryPositive__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link TestProjectV1.Employee#EmployeeHasQualification(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Employee Has Qualification</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Employee Has Qualification</em>' operation.
	 * @see TestProjectV1.Employee#EmployeeHasQualification(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEmployee__EmployeeHasQualification__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link TestProjectV1.Employee#logAttendance() <em>Log Attendance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Log Attendance</em>' operation.
	 * @see TestProjectV1.Employee#logAttendance()
	 * @generated
	 */
	EOperation getEmployee__LogAttendance();

	/**
	 * Returns the meta object for the '{@link TestProjectV1.Employee#viewDetails() <em>View Details</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View Details</em>' operation.
	 * @see TestProjectV1.Employee#viewDetails()
	 * @generated
	 */
	EOperation getEmployee__ViewDetails();

	/**
	 * Returns the meta object for the '{@link TestProjectV1.Employee#claculateSalary() <em>Claculate Salary</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Claculate Salary</em>' operation.
	 * @see TestProjectV1.Employee#claculateSalary()
	 * @generated
	 */
	EOperation getEmployee__ClaculateSalary();

	/**
	 * Returns the meta object for the '{@link TestProjectV1.Employee#getCurrentProject() <em>Get Current Project</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Current Project</em>' operation.
	 * @see TestProjectV1.Employee#getCurrentProject()
	 * @generated
	 */
	EOperation getEmployee__GetCurrentProject();

	/**
	 * Returns the meta object for the '{@link TestProjectV1.Employee#getAge() <em>Get Age</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Age</em>' operation.
	 * @see TestProjectV1.Employee#getAge()
	 * @generated
	 */
	EOperation getEmployee__GetAge();

	/**
	 * Returns the meta object for class '{@link TestProjectV1.PerformanceReview <em>Performance Review</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Performance Review</em>'.
	 * @see TestProjectV1.PerformanceReview
	 * @generated
	 */
	EClass getPerformanceReview();

	/**
	 * Returns the meta object for the attribute '{@link TestProjectV1.PerformanceReview#getReviewID <em>Review ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Review ID</em>'.
	 * @see TestProjectV1.PerformanceReview#getReviewID()
	 * @see #getPerformanceReview()
	 * @generated
	 */
	EAttribute getPerformanceReview_ReviewID();

	/**
	 * Returns the meta object for the attribute '{@link TestProjectV1.PerformanceReview#getReviewDate <em>Review Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Review Date</em>'.
	 * @see TestProjectV1.PerformanceReview#getReviewDate()
	 * @see #getPerformanceReview()
	 * @generated
	 */
	EAttribute getPerformanceReview_ReviewDate();

	/**
	 * Returns the meta object for the attribute '{@link TestProjectV1.PerformanceReview#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see TestProjectV1.PerformanceReview#getComments()
	 * @see #getPerformanceReview()
	 * @generated
	 */
	EAttribute getPerformanceReview_Comments();

	/**
	 * Returns the meta object for the '{@link TestProjectV1.PerformanceReview#ReviewCompletenessforLowRatings(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Review Completenessfor Low Ratings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Review Completenessfor Low Ratings</em>' operation.
	 * @see TestProjectV1.PerformanceReview#ReviewCompletenessforLowRatings(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPerformanceReview__ReviewCompletenessforLowRatings__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link TestProjectV1.PerformanceReview#conductReview(TestProjectV1.Manager, TestProjectV1.Employee) <em>Conduct Review</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conduct Review</em>' operation.
	 * @see TestProjectV1.PerformanceReview#conductReview(TestProjectV1.Manager, TestProjectV1.Employee)
	 * @generated
	 */
	EOperation getPerformanceReview__ConductReview__Manager_Employee();

	/**
	 * Returns the meta object for the '{@link TestProjectV1.PerformanceReview#addFeedBack(TestProjectV1.Employee, java.lang.String) <em>Add Feed Back</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Feed Back</em>' operation.
	 * @see TestProjectV1.PerformanceReview#addFeedBack(TestProjectV1.Employee, java.lang.String)
	 * @generated
	 */
	EOperation getPerformanceReview__AddFeedBack__Employee_String();

	/**
	 * Returns the meta object for the '{@link TestProjectV1.PerformanceReview#viewReview(TestProjectV1.Employee) <em>View Review</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View Review</em>' operation.
	 * @see TestProjectV1.PerformanceReview#viewReview(TestProjectV1.Employee)
	 * @generated
	 */
	EOperation getPerformanceReview__ViewReview__Employee();

	/**
	 * Returns the meta object for class '{@link TestProjectV1.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see TestProjectV1.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link TestProjectV1.Project#getProjectName <em>Project Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Name</em>'.
	 * @see TestProjectV1.Project#getProjectName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_ProjectName();

	/**
	 * Returns the meta object for the attribute '{@link TestProjectV1.Project#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see TestProjectV1.Project#getEndDate()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link TestProjectV1.Project#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see TestProjectV1.Project#getStartDate()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_StartDate();

	/**
	 * Returns the meta object for the reference '{@link TestProjectV1.Project#getTeamMembers <em>Team Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Team Members</em>'.
	 * @see TestProjectV1.Project#getTeamMembers()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_TeamMembers();

	/**
	 * Returns the meta object for the attribute '{@link TestProjectV1.Project#getDeptCode <em>Dept Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dept Code</em>'.
	 * @see TestProjectV1.Project#getDeptCode()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_DeptCode();

	/**
	 * Returns the meta object for the '{@link TestProjectV1.Project#EndAfterStart(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>End After Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>End After Start</em>' operation.
	 * @see TestProjectV1.Project#EndAfterStart(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getProject__EndAfterStart__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link TestProjectV1.Project#assignEmployee(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Assign Employee</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Assign Employee</em>' operation.
	 * @see TestProjectV1.Project#assignEmployee(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getProject__AssignEmployee__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link TestProjectV1.Project#_assignEmployee(TestProjectV1.Employee) <em>assign Employee</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>assign Employee</em>' operation.
	 * @see TestProjectV1.Project#_assignEmployee(TestProjectV1.Employee)
	 * @generated
	 */
	EOperation getProject___assignEmployee__Employee();

	/**
	 * Returns the meta object for the '{@link TestProjectV1.Project#removeEmployee(TestProjectV1.Employee) <em>Remove Employee</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Employee</em>' operation.
	 * @see TestProjectV1.Project#removeEmployee(TestProjectV1.Employee)
	 * @generated
	 */
	EOperation getProject__RemoveEmployee__Employee();

	/**
	 * Returns the meta object for class '{@link TestProjectV1.Schedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule</em>'.
	 * @see TestProjectV1.Schedule
	 * @generated
	 */
	EClass getSchedule();

	/**
	 * Returns the meta object for the attribute '{@link TestProjectV1.Schedule#getProjectID <em>Project ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project ID</em>'.
	 * @see TestProjectV1.Schedule#getProjectID()
	 * @see #getSchedule()
	 * @generated
	 */
	EAttribute getSchedule_ProjectID();

	/**
	 * Returns the meta object for the reference '{@link TestProjectV1.Schedule#getAssignedEmployees <em>Assigned Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assigned Employees</em>'.
	 * @see TestProjectV1.Schedule#getAssignedEmployees()
	 * @see #getSchedule()
	 * @generated
	 */
	EReference getSchedule_AssignedEmployees();

	/**
	 * Returns the meta object for the attribute '{@link TestProjectV1.Schedule#getWeeklyHours <em>Weekly Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weekly Hours</em>'.
	 * @see TestProjectV1.Schedule#getWeeklyHours()
	 * @see #getSchedule()
	 * @generated
	 */
	EAttribute getSchedule_WeeklyHours();

	/**
	 * Returns the meta object for the attribute '{@link TestProjectV1.Schedule#getShiftType <em>Shift Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shift Type</em>'.
	 * @see TestProjectV1.Schedule#getShiftType()
	 * @see #getSchedule()
	 * @generated
	 */
	EAttribute getSchedule_ShiftType();

	/**
	 * Returns the meta object for the '{@link TestProjectV1.Schedule#createSchedule(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Create Schedule</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Schedule</em>' operation.
	 * @see TestProjectV1.Schedule#createSchedule(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSchedule__CreateSchedule__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link TestProjectV1.Schedule#createSchedule(TestProjectV1.Employee, java.util.Date, java.util.Date) <em>Create Schedule</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Schedule</em>' operation.
	 * @see TestProjectV1.Schedule#createSchedule(TestProjectV1.Employee, java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getSchedule__CreateSchedule__Employee_Date_Date();

	/**
	 * Returns the meta object for the '{@link TestProjectV1.Schedule#updateSchedule(TestProjectV1.Employee, java.util.Date, java.util.Date) <em>Update Schedule</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Schedule</em>' operation.
	 * @see TestProjectV1.Schedule#updateSchedule(TestProjectV1.Employee, java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getSchedule__UpdateSchedule__Employee_Date_Date();

	/**
	 * Returns the meta object for the '{@link TestProjectV1.Schedule#getEmployeeSchedule(TestProjectV1.Employee) <em>Get Employee Schedule</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Employee Schedule</em>' operation.
	 * @see TestProjectV1.Schedule#getEmployeeSchedule(TestProjectV1.Employee)
	 * @generated
	 */
	EOperation getSchedule__GetEmployeeSchedule__Employee();

	/**
	 * Returns the meta object for the '{@link TestProjectV1.Schedule#generateWeeklySchedule() <em>Generate Weekly Schedule</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Weekly Schedule</em>' operation.
	 * @see TestProjectV1.Schedule#generateWeeklySchedule()
	 * @generated
	 */
	EOperation getSchedule__GenerateWeeklySchedule();

	/**
	 * Returns the meta object for class '{@link TestProjectV1.Department <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Department</em>'.
	 * @see TestProjectV1.Department
	 * @generated
	 */
	EClass getDepartment();

	/**
	 * Returns the meta object for the attribute '{@link TestProjectV1.Department#getDeptName <em>Dept Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dept Name</em>'.
	 * @see TestProjectV1.Department#getDeptName()
	 * @see #getDepartment()
	 * @generated
	 */
	EAttribute getDepartment_DeptName();

	/**
	 * Returns the meta object for the attribute '{@link TestProjectV1.Department#getDeptCode <em>Dept Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dept Code</em>'.
	 * @see TestProjectV1.Department#getDeptCode()
	 * @see #getDepartment()
	 * @generated
	 */
	EAttribute getDepartment_DeptCode();

	/**
	 * Returns the meta object for class '{@link TestProjectV1.Salary <em>Salary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Salary</em>'.
	 * @see TestProjectV1.Salary
	 * @generated
	 */
	EClass getSalary();

	/**
	 * Returns the meta object for the attribute '{@link TestProjectV1.Salary#getAccountNum <em>Account Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account Num</em>'.
	 * @see TestProjectV1.Salary#getAccountNum()
	 * @see #getSalary()
	 * @generated
	 */
	EAttribute getSalary_AccountNum();

	/**
	 * Returns the meta object for the attribute '{@link TestProjectV1.Salary#getBankName <em>Bank Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bank Name</em>'.
	 * @see TestProjectV1.Salary#getBankName()
	 * @see #getSalary()
	 * @generated
	 */
	EAttribute getSalary_BankName();

	/**
	 * Returns the meta object for the attribute '{@link TestProjectV1.Salary#getTaxes <em>Taxes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Taxes</em>'.
	 * @see TestProjectV1.Salary#getTaxes()
	 * @see #getSalary()
	 * @generated
	 */
	EAttribute getSalary_Taxes();

	/**
	 * Returns the meta object for the attribute '{@link TestProjectV1.Salary#getEmpID <em>Emp ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emp ID</em>'.
	 * @see TestProjectV1.Salary#getEmpID()
	 * @see #getSalary()
	 * @generated
	 */
	EAttribute getSalary_EmpID();

	/**
	 * Returns the meta object for the attribute '{@link TestProjectV1.Salary#getAdminID <em>Admin ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Admin ID</em>'.
	 * @see TestProjectV1.Salary#getAdminID()
	 * @see #getSalary()
	 * @generated
	 */
	EAttribute getSalary_AdminID();

	/**
	 * Returns the meta object for the '{@link TestProjectV1.Salary#viewSalary() <em>View Salary</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View Salary</em>' operation.
	 * @see TestProjectV1.Salary#viewSalary()
	 * @generated
	 */
	EOperation getSalary__ViewSalary();

	/**
	 * Returns the meta object for class '{@link TestProjectV1.Admin <em>Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Admin</em>'.
	 * @see TestProjectV1.Admin
	 * @generated
	 */
	EClass getAdmin();

	/**
	 * Returns the meta object for the attribute '{@link TestProjectV1.Admin#getAdminID <em>Admin ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Admin ID</em>'.
	 * @see TestProjectV1.Admin#getAdminID()
	 * @see #getAdmin()
	 * @generated
	 */
	EAttribute getAdmin_AdminID();

	/**
	 * Returns the meta object for the attribute '{@link TestProjectV1.Admin#isAdminRole <em>Admin Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Admin Role</em>'.
	 * @see TestProjectV1.Admin#isAdminRole()
	 * @see #getAdmin()
	 * @generated
	 */
	EAttribute getAdmin_AdminRole();

	/**
	 * Returns the meta object for the reference '{@link TestProjectV1.Admin#getSalary <em>Salary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Salary</em>'.
	 * @see TestProjectV1.Admin#getSalary()
	 * @see #getAdmin()
	 * @generated
	 */
	EReference getAdmin_Salary();

	/**
	 * Returns the meta object for the '{@link TestProjectV1.Admin#aproveSalary(TestProjectV1.Employee) <em>Aprove Salary</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Aprove Salary</em>' operation.
	 * @see TestProjectV1.Admin#aproveSalary(TestProjectV1.Employee)
	 * @generated
	 */
	EOperation getAdmin__AproveSalary__Employee();

	/**
	 * Returns the meta object for the '{@link TestProjectV1.Admin#modifySalaryDetails() <em>Modify Salary Details</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Modify Salary Details</em>' operation.
	 * @see TestProjectV1.Admin#modifySalaryDetails()
	 * @generated
	 */
	EOperation getAdmin__ModifySalaryDetails();

	/**
	 * Returns the meta object for the '{@link TestProjectV1.Admin#assignManagerToDept(TestProjectV1.Manager) <em>Assign Manager To Dept</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Assign Manager To Dept</em>' operation.
	 * @see TestProjectV1.Admin#assignManagerToDept(TestProjectV1.Manager)
	 * @generated
	 */
	EOperation getAdmin__AssignManagerToDept__Manager();

	/**
	 * Returns the meta object for the '{@link TestProjectV1.Admin#terminateManager(TestProjectV1.Manager) <em>Terminate Manager</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Terminate Manager</em>' operation.
	 * @see TestProjectV1.Admin#terminateManager(TestProjectV1.Manager)
	 * @generated
	 */
	EOperation getAdmin__TerminateManager__Manager();

	/**
	 * Returns the meta object for the '{@link TestProjectV1.Admin#aproveSalary(TestProjectV1.Manager) <em>Aprove Salary</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Aprove Salary</em>' operation.
	 * @see TestProjectV1.Admin#aproveSalary(TestProjectV1.Manager)
	 * @generated
	 */
	EOperation getAdmin__AproveSalary__Manager();

	/**
	 * Returns the meta object for class '{@link TestProjectV1.UMLStateMachineCoffeeVendingMachine <em>UML State Machine Coffee Vending Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML State Machine Coffee Vending Machine</em>'.
	 * @see TestProjectV1.UMLStateMachineCoffeeVendingMachine
	 * @generated
	 */
	EClass getUMLStateMachineCoffeeVendingMachine();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestProjectV1Factory getTestProjectV1Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link TestProjectV1.impl.ManagerImpl <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestProjectV1.impl.ManagerImpl
		 * @see TestProjectV1.impl.TestProjectV1PackageImpl#getManager()
		 * @generated
		 */
		EClass MANAGER = eINSTANCE.getManager();

		/**
		 * The meta object literal for the '<em><b>Manger ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGER__MANGER_ID = eINSTANCE.getManager_MangerID();

		/**
		 * The meta object literal for the '<em><b>Dept Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGER__DEPT_CODE = eINSTANCE.getManager_DeptCode();

		/**
		 * The meta object literal for the '<em><b>Mark Attendance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MANAGER___MARK_ATTENDANCE = eINSTANCE.getManager__MarkAttendance();

		/**
		 * The meta object literal for the '<em><b>Update Employee Details</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MANAGER___UPDATE_EMPLOYEE_DETAILS = eINSTANCE.getManager__UpdateEmployeeDetails();

		/**
		 * The meta object literal for the '<em><b>Approve Leave</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MANAGER___APPROVE_LEAVE = eINSTANCE.getManager__ApproveLeave();

		/**
		 * The meta object literal for the '<em><b>Time Sheet Approval</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MANAGER___TIME_SHEET_APPROVAL = eINSTANCE.getManager__TimeSheetApproval();

		/**
		 * The meta object literal for the '{@link TestProjectV1.impl.EmployeeImpl <em>Employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestProjectV1.impl.EmployeeImpl
		 * @see TestProjectV1.impl.TestProjectV1PackageImpl#getEmployee()
		 * @generated
		 */
		EClass EMPLOYEE = eINSTANCE.getEmployee();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__NAME = eINSTANCE.getEmployee_Name();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__EMAIL = eINSTANCE.getEmployee_Email();

		/**
		 * The meta object literal for the '<em><b>Dob</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__DOB = eINSTANCE.getEmployee_Dob();

		/**
		 * The meta object literal for the '<em><b>Emp ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__EMP_ID = eINSTANCE.getEmployee_EmpID();

		/**
		 * The meta object literal for the '<em><b>Experience</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__EXPERIENCE = eINSTANCE.getEmployee_Experience();

		/**
		 * The meta object literal for the '<em><b>Total Hours Worked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__TOTAL_HOURS_WORKED = eINSTANCE.getEmployee_TotalHoursWorked();

		/**
		 * The meta object literal for the '<em><b>Qualification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__QUALIFICATION = eINSTANCE.getEmployee_Qualification();

		/**
		 * The meta object literal for the '<em><b>Join Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__JOIN_DATE = eINSTANCE.getEmployee_JoinDate();

		/**
		 * The meta object literal for the '<em><b>Salary Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__SALARY_AMOUNT = eINSTANCE.getEmployee_SalaryAmount();

		/**
		 * The meta object literal for the '<em><b>Report To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__REPORT_TO = eINSTANCE.getEmployee_ReportTo();

		/**
		 * The meta object literal for the '<em><b>total Compensation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__TOTAL_COMPENSATION = eINSTANCE.getEmployee__totalCompensation();

		/**
		 * The meta object literal for the '<em><b>Performancereview</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE__PERFORMANCEREVIEW = eINSTANCE.getEmployee_Performancereview();

		/**
		 * The meta object literal for the '<em><b>Salary Positive</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPLOYEE___SALARY_POSITIVE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getEmployee__SalaryPositive__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Employee Has Qualification</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPLOYEE___EMPLOYEE_HAS_QUALIFICATION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getEmployee__EmployeeHasQualification__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Log Attendance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPLOYEE___LOG_ATTENDANCE = eINSTANCE.getEmployee__LogAttendance();

		/**
		 * The meta object literal for the '<em><b>View Details</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPLOYEE___VIEW_DETAILS = eINSTANCE.getEmployee__ViewDetails();

		/**
		 * The meta object literal for the '<em><b>Claculate Salary</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPLOYEE___CLACULATE_SALARY = eINSTANCE.getEmployee__ClaculateSalary();

		/**
		 * The meta object literal for the '<em><b>Get Current Project</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPLOYEE___GET_CURRENT_PROJECT = eINSTANCE.getEmployee__GetCurrentProject();

		/**
		 * The meta object literal for the '<em><b>Get Age</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPLOYEE___GET_AGE = eINSTANCE.getEmployee__GetAge();

		/**
		 * The meta object literal for the '{@link TestProjectV1.impl.PerformanceReviewImpl <em>Performance Review</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestProjectV1.impl.PerformanceReviewImpl
		 * @see TestProjectV1.impl.TestProjectV1PackageImpl#getPerformanceReview()
		 * @generated
		 */
		EClass PERFORMANCE_REVIEW = eINSTANCE.getPerformanceReview();

		/**
		 * The meta object literal for the '<em><b>Review ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORMANCE_REVIEW__REVIEW_ID = eINSTANCE.getPerformanceReview_ReviewID();

		/**
		 * The meta object literal for the '<em><b>Review Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORMANCE_REVIEW__REVIEW_DATE = eINSTANCE.getPerformanceReview_ReviewDate();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORMANCE_REVIEW__COMMENTS = eINSTANCE.getPerformanceReview_Comments();

		/**
		 * The meta object literal for the '<em><b>Review Completenessfor Low Ratings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERFORMANCE_REVIEW___REVIEW_COMPLETENESSFOR_LOW_RATINGS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPerformanceReview__ReviewCompletenessforLowRatings__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Conduct Review</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERFORMANCE_REVIEW___CONDUCT_REVIEW__MANAGER_EMPLOYEE = eINSTANCE.getPerformanceReview__ConductReview__Manager_Employee();

		/**
		 * The meta object literal for the '<em><b>Add Feed Back</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERFORMANCE_REVIEW___ADD_FEED_BACK__EMPLOYEE_STRING = eINSTANCE.getPerformanceReview__AddFeedBack__Employee_String();

		/**
		 * The meta object literal for the '<em><b>View Review</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERFORMANCE_REVIEW___VIEW_REVIEW__EMPLOYEE = eINSTANCE.getPerformanceReview__ViewReview__Employee();

		/**
		 * The meta object literal for the '{@link TestProjectV1.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestProjectV1.impl.ProjectImpl
		 * @see TestProjectV1.impl.TestProjectV1PackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Project Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__PROJECT_NAME = eINSTANCE.getProject_ProjectName();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__END_DATE = eINSTANCE.getProject_EndDate();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__START_DATE = eINSTANCE.getProject_StartDate();

		/**
		 * The meta object literal for the '<em><b>Team Members</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__TEAM_MEMBERS = eINSTANCE.getProject_TeamMembers();

		/**
		 * The meta object literal for the '<em><b>Dept Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__DEPT_CODE = eINSTANCE.getProject_DeptCode();

		/**
		 * The meta object literal for the '<em><b>End After Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROJECT___END_AFTER_START__DIAGNOSTICCHAIN_MAP = eINSTANCE.getProject__EndAfterStart__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Assign Employee</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROJECT___ASSIGN_EMPLOYEE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getProject__AssignEmployee__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>assign Employee</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROJECT___ASSIGN_EMPLOYEE__EMPLOYEE = eINSTANCE.getProject___assignEmployee__Employee();

		/**
		 * The meta object literal for the '<em><b>Remove Employee</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROJECT___REMOVE_EMPLOYEE__EMPLOYEE = eINSTANCE.getProject__RemoveEmployee__Employee();

		/**
		 * The meta object literal for the '{@link TestProjectV1.impl.ScheduleImpl <em>Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestProjectV1.impl.ScheduleImpl
		 * @see TestProjectV1.impl.TestProjectV1PackageImpl#getSchedule()
		 * @generated
		 */
		EClass SCHEDULE = eINSTANCE.getSchedule();

		/**
		 * The meta object literal for the '<em><b>Project ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE__PROJECT_ID = eINSTANCE.getSchedule_ProjectID();

		/**
		 * The meta object literal for the '<em><b>Assigned Employees</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULE__ASSIGNED_EMPLOYEES = eINSTANCE.getSchedule_AssignedEmployees();

		/**
		 * The meta object literal for the '<em><b>Weekly Hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE__WEEKLY_HOURS = eINSTANCE.getSchedule_WeeklyHours();

		/**
		 * The meta object literal for the '<em><b>Shift Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE__SHIFT_TYPE = eINSTANCE.getSchedule_ShiftType();

		/**
		 * The meta object literal for the '<em><b>Create Schedule</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCHEDULE___CREATE_SCHEDULE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSchedule__CreateSchedule__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Create Schedule</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCHEDULE___CREATE_SCHEDULE__EMPLOYEE_DATE_DATE = eINSTANCE.getSchedule__CreateSchedule__Employee_Date_Date();

		/**
		 * The meta object literal for the '<em><b>Update Schedule</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCHEDULE___UPDATE_SCHEDULE__EMPLOYEE_DATE_DATE = eINSTANCE.getSchedule__UpdateSchedule__Employee_Date_Date();

		/**
		 * The meta object literal for the '<em><b>Get Employee Schedule</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCHEDULE___GET_EMPLOYEE_SCHEDULE__EMPLOYEE = eINSTANCE.getSchedule__GetEmployeeSchedule__Employee();

		/**
		 * The meta object literal for the '<em><b>Generate Weekly Schedule</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCHEDULE___GENERATE_WEEKLY_SCHEDULE = eINSTANCE.getSchedule__GenerateWeeklySchedule();

		/**
		 * The meta object literal for the '{@link TestProjectV1.impl.DepartmentImpl <em>Department</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestProjectV1.impl.DepartmentImpl
		 * @see TestProjectV1.impl.TestProjectV1PackageImpl#getDepartment()
		 * @generated
		 */
		EClass DEPARTMENT = eINSTANCE.getDepartment();

		/**
		 * The meta object literal for the '<em><b>Dept Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTMENT__DEPT_NAME = eINSTANCE.getDepartment_DeptName();

		/**
		 * The meta object literal for the '<em><b>Dept Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTMENT__DEPT_CODE = eINSTANCE.getDepartment_DeptCode();

		/**
		 * The meta object literal for the '{@link TestProjectV1.impl.SalaryImpl <em>Salary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestProjectV1.impl.SalaryImpl
		 * @see TestProjectV1.impl.TestProjectV1PackageImpl#getSalary()
		 * @generated
		 */
		EClass SALARY = eINSTANCE.getSalary();

		/**
		 * The meta object literal for the '<em><b>Account Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALARY__ACCOUNT_NUM = eINSTANCE.getSalary_AccountNum();

		/**
		 * The meta object literal for the '<em><b>Bank Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALARY__BANK_NAME = eINSTANCE.getSalary_BankName();

		/**
		 * The meta object literal for the '<em><b>Taxes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALARY__TAXES = eINSTANCE.getSalary_Taxes();

		/**
		 * The meta object literal for the '<em><b>Emp ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALARY__EMP_ID = eINSTANCE.getSalary_EmpID();

		/**
		 * The meta object literal for the '<em><b>Admin ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALARY__ADMIN_ID = eINSTANCE.getSalary_AdminID();

		/**
		 * The meta object literal for the '<em><b>View Salary</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SALARY___VIEW_SALARY = eINSTANCE.getSalary__ViewSalary();

		/**
		 * The meta object literal for the '{@link TestProjectV1.impl.AdminImpl <em>Admin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestProjectV1.impl.AdminImpl
		 * @see TestProjectV1.impl.TestProjectV1PackageImpl#getAdmin()
		 * @generated
		 */
		EClass ADMIN = eINSTANCE.getAdmin();

		/**
		 * The meta object literal for the '<em><b>Admin ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMIN__ADMIN_ID = eINSTANCE.getAdmin_AdminID();

		/**
		 * The meta object literal for the '<em><b>Admin Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMIN__ADMIN_ROLE = eINSTANCE.getAdmin_AdminRole();

		/**
		 * The meta object literal for the '<em><b>Salary</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMIN__SALARY = eINSTANCE.getAdmin_Salary();

		/**
		 * The meta object literal for the '<em><b>Aprove Salary</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN___APROVE_SALARY__EMPLOYEE = eINSTANCE.getAdmin__AproveSalary__Employee();

		/**
		 * The meta object literal for the '<em><b>Modify Salary Details</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN___MODIFY_SALARY_DETAILS = eINSTANCE.getAdmin__ModifySalaryDetails();

		/**
		 * The meta object literal for the '<em><b>Assign Manager To Dept</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN___ASSIGN_MANAGER_TO_DEPT__MANAGER = eINSTANCE.getAdmin__AssignManagerToDept__Manager();

		/**
		 * The meta object literal for the '<em><b>Terminate Manager</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN___TERMINATE_MANAGER__MANAGER = eINSTANCE.getAdmin__TerminateManager__Manager();

		/**
		 * The meta object literal for the '<em><b>Aprove Salary</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN___APROVE_SALARY__MANAGER = eINSTANCE.getAdmin__AproveSalary__Manager();

		/**
		 * The meta object literal for the '{@link TestProjectV1.impl.UMLStateMachineCoffeeVendingMachineImpl <em>UML State Machine Coffee Vending Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestProjectV1.impl.UMLStateMachineCoffeeVendingMachineImpl
		 * @see TestProjectV1.impl.TestProjectV1PackageImpl#getUMLStateMachineCoffeeVendingMachine()
		 * @generated
		 */
		EClass UML_STATE_MACHINE_COFFEE_VENDING_MACHINE = eINSTANCE.getUMLStateMachineCoffeeVendingMachine();

	}

} //TestProjectV1Package
