/**
 */
package org.eclipse.sirius.sample.UGSML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Value Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.BaseValueConstraint#getDefaultBaseValue <em>Default Base Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getBaseValueConstraint()
 * @model
 * @generated
 */
public interface BaseValueConstraint extends BaseOrRangeConstraint {
	/**
	 * Returns the value of the '<em><b>Default Base Value</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Base Value</em>' attribute.
	 * @see #setDefaultBaseValue(float)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getBaseValueConstraint_DefaultBaseValue()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	float getDefaultBaseValue();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.BaseValueConstraint#getDefaultBaseValue <em>Default Base Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Base Value</em>' attribute.
	 * @see #getDefaultBaseValue()
	 * @generated
	 */
	void setDefaultBaseValue(float value);

} // BaseValueConstraint
