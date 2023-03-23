/**
 */
package org.eclipse.sirius.sample.UGSML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Based Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.RangeBasedConstraint#getLimit <em>Limit</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getRangeBasedConstraint()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface RangeBasedConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Limit</b></em>' attribute.
	 * The default value is <code>"NoLimit"</code>.
	 * The literals are from the enumeration {@link org.eclipse.sirius.sample.UGSML.AdditionLimit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit</em>' attribute.
	 * @see org.eclipse.sirius.sample.UGSML.AdditionLimit
	 * @see #setLimit(AdditionLimit)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getRangeBasedConstraint_Limit()
	 * @model default="NoLimit" required="true"
	 * @generated
	 */
	AdditionLimit getLimit();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.RangeBasedConstraint#getLimit <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limit</em>' attribute.
	 * @see org.eclipse.sirius.sample.UGSML.AdditionLimit
	 * @see #getLimit()
	 * @generated
	 */
	void setLimit(AdditionLimit value);

} // RangeBasedConstraint
