/**
 */
package org.eclipse.sirius.sample.UGSML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weight Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.WeightConstraint#getTotalWeight <em>Total Weight</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getWeightConstraint()
 * @model
 * @generated
 */
public interface WeightConstraint extends StackWeightConstraint {
	/**
	 * Returns the value of the '<em><b>Total Weight</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Weight</em>' attribute.
	 * @see #setTotalWeight(int)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getWeightConstraint_TotalWeight()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getTotalWeight();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.WeightConstraint#getTotalWeight <em>Total Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Weight</em>' attribute.
	 * @see #getTotalWeight()
	 * @generated
	 */
	void setTotalWeight(int value);

} // WeightConstraint
