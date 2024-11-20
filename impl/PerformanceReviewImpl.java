/**
 */
package TestProjectV1.impl;

import TestProjectV1.Employee;
import TestProjectV1.Manager;
import TestProjectV1.PerformanceReview;
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

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Performance Review</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TestProjectV1.impl.PerformanceReviewImpl#getReviewID <em>Review ID</em>}</li>
 *   <li>{@link TestProjectV1.impl.PerformanceReviewImpl#getReviewDate <em>Review Date</em>}</li>
 *   <li>{@link TestProjectV1.impl.PerformanceReviewImpl#getComments <em>Comments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerformanceReviewImpl extends MinimalEObjectImpl.Container implements PerformanceReview {
	/**
	 * The default value of the '{@link #getReviewID() <em>Review ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewID()
	 * @generated
	 * @ordered
	 */
	protected static final String REVIEW_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReviewID() <em>Review ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewID()
	 * @generated
	 * @ordered
	 */
	protected String reviewID = REVIEW_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getReviewDate() <em>Review Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date REVIEW_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReviewDate() <em>Review Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewDate()
	 * @generated
	 * @ordered
	 */
	protected Date reviewDate = REVIEW_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected String comments = COMMENTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerformanceReviewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestProjectV1Package.Literals.PERFORMANCE_REVIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReviewID() {
		return reviewID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReviewID(String newReviewID) {
		String oldReviewID = reviewID;
		reviewID = newReviewID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestProjectV1Package.PERFORMANCE_REVIEW__REVIEW_ID, oldReviewID, reviewID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getReviewDate() {
		return reviewDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReviewDate(Date newReviewDate) {
		Date oldReviewDate = reviewDate;
		reviewDate = newReviewDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestProjectV1Package.PERFORMANCE_REVIEW__REVIEW_DATE, oldReviewDate, reviewDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		String oldComments = comments;
		comments = newComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestProjectV1Package.PERFORMANCE_REVIEW__COMMENTS, oldComments, comments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ReviewCompletenessforLowRatings(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 TestProjectV1Validator.PERFORMANCE_REVIEW__REVIEW_COMPLETENESSFOR_LOW_RATINGS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReviewCompletenessforLowRatings", EObjectValidator.getObjectLabel(this, context) }),
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
	public void conductReview(Manager Manager, Employee employee) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addFeedBack(Employee employee, String feedback) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void viewReview(Employee employee) {
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
			case TestProjectV1Package.PERFORMANCE_REVIEW__REVIEW_ID:
				return getReviewID();
			case TestProjectV1Package.PERFORMANCE_REVIEW__REVIEW_DATE:
				return getReviewDate();
			case TestProjectV1Package.PERFORMANCE_REVIEW__COMMENTS:
				return getComments();
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
			case TestProjectV1Package.PERFORMANCE_REVIEW__REVIEW_ID:
				setReviewID((String)newValue);
				return;
			case TestProjectV1Package.PERFORMANCE_REVIEW__REVIEW_DATE:
				setReviewDate((Date)newValue);
				return;
			case TestProjectV1Package.PERFORMANCE_REVIEW__COMMENTS:
				setComments((String)newValue);
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
			case TestProjectV1Package.PERFORMANCE_REVIEW__REVIEW_ID:
				setReviewID(REVIEW_ID_EDEFAULT);
				return;
			case TestProjectV1Package.PERFORMANCE_REVIEW__REVIEW_DATE:
				setReviewDate(REVIEW_DATE_EDEFAULT);
				return;
			case TestProjectV1Package.PERFORMANCE_REVIEW__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
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
			case TestProjectV1Package.PERFORMANCE_REVIEW__REVIEW_ID:
				return REVIEW_ID_EDEFAULT == null ? reviewID != null : !REVIEW_ID_EDEFAULT.equals(reviewID);
			case TestProjectV1Package.PERFORMANCE_REVIEW__REVIEW_DATE:
				return REVIEW_DATE_EDEFAULT == null ? reviewDate != null : !REVIEW_DATE_EDEFAULT.equals(reviewDate);
			case TestProjectV1Package.PERFORMANCE_REVIEW__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
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
			case TestProjectV1Package.PERFORMANCE_REVIEW___REVIEW_COMPLETENESSFOR_LOW_RATINGS__DIAGNOSTICCHAIN_MAP:
				return ReviewCompletenessforLowRatings((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case TestProjectV1Package.PERFORMANCE_REVIEW___CONDUCT_REVIEW__MANAGER_EMPLOYEE:
				conductReview((Manager)arguments.get(0), (Employee)arguments.get(1));
				return null;
			case TestProjectV1Package.PERFORMANCE_REVIEW___ADD_FEED_BACK__EMPLOYEE_STRING:
				addFeedBack((Employee)arguments.get(0), (String)arguments.get(1));
				return null;
			case TestProjectV1Package.PERFORMANCE_REVIEW___VIEW_REVIEW__EMPLOYEE:
				viewReview((Employee)arguments.get(0));
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
		result.append(" (reviewID: ");
		result.append(reviewID);
		result.append(", reviewDate: ");
		result.append(reviewDate);
		result.append(", comments: ");
		result.append(comments);
		result.append(')');
		return result.toString();
	}

} //PerformanceReviewImpl
