/**
 */
package org.eclipse.sirius.sample.UGSML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stack Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.StackConstraint#getStackAmount <em>Stack Amount</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getStackConstraint()
 * @model
 * @generated
 */
public interface StackConstraint extends StackWeightConstraint {
	/**
	 * Returns the value of the '<em><b>Stack Amount</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stack Amount</em>' attribute.
	 * @see #setStackAmount(int)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getStackConstraint_StackAmount()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getStackAmount();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.StackConstraint#getStackAmount <em>Stack Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stack Amount</em>' attribute.
	 * @see #getStackAmount()
	 * @generated
	 */
	void setStackAmount(int value);

} // StackConstraint
