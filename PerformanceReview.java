/**
 */
package TestProjectV1;

import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Performance Review</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestProjectV1.PerformanceReview#getReviewID <em>Review ID</em>}</li>
 *   <li>{@link TestProjectV1.PerformanceReview#getReviewDate <em>Review Date</em>}</li>
 *   <li>{@link TestProjectV1.PerformanceReview#getComments <em>Comments</em>}</li>
 * </ul>
 *
 * @see TestProjectV1.TestProjectV1Package#getPerformanceReview()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Performance Review'"
 * @generated
 */
public interface PerformanceReview extends EObject {
	/**
	 * Returns the value of the '<em><b>Review ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Review ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Review ID</em>' attribute.
	 * @see #setReviewID(String)
	 * @see TestProjectV1.TestProjectV1Package#getPerformanceReview_ReviewID()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getReviewID();

	/**
	 * Sets the value of the '{@link TestProjectV1.PerformanceReview#getReviewID <em>Review ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Review ID</em>' attribute.
	 * @see #getReviewID()
	 * @generated
	 */
	void setReviewID(String value);

	/**
	 * Returns the value of the '<em><b>Review Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Review Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Review Date</em>' attribute.
	 * @see #setReviewDate(Date)
	 * @see TestProjectV1.TestProjectV1Package#getPerformanceReview_ReviewDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getReviewDate();

	/**
	 * Sets the value of the '{@link TestProjectV1.PerformanceReview#getReviewDate <em>Review Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Review Date</em>' attribute.
	 * @see #getReviewDate()
	 * @generated
	 */
	void setReviewDate(Date value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @see TestProjectV1.TestProjectV1Package#getPerformanceReview_Comments()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link TestProjectV1.PerformanceReview#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * context PerformanceReview inv ReviewCommentsMandatoryForLowRating: self.rating <= 2 implies self.comments.size() > 0
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Review Completeness for Low Ratings'"
	 * @generated
	 */
	boolean ReviewCompletenessforLowRatings(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * context PerformanceReview inv RatingWithinRange: self.rating >= 1 and self.rating <= 5
	 * 
	 * <!-- end-model-doc -->
	 * @model ManagerRequired="true" ManagerOrdered="false" employeeRequired="true" employeeOrdered="false"
	 * @generated
	 */
	void conductReview(Manager Manager, Employee employee);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model employeeRequired="true" employeeOrdered="false" feedbackDataType="org.eclipse.uml2.types.String" feedbackRequired="true" feedbackOrdered="false"
	 * @generated
	 */
	void addFeedBack(Employee employee, String feedback);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model employeeRequired="true" employeeOrdered="false"
	 * @generated
	 */
	void viewReview(Employee employee);

} // PerformanceReview
