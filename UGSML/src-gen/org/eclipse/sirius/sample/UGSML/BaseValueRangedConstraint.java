/**
 */
package org.eclipse.sirius.sample.UGSML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Value Ranged Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.BaseValueRangedConstraint#isRemapValue <em>Remap Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getBaseValueRangedConstraint()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface BaseValueRangedConstraint extends ValueConstraintRule {
	/**
	 * Returns the value of the '<em><b>Remap Value</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remap Value</em>' attribute.
	 * @see #setRemapValue(boolean)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getBaseValueRangedConstraint_RemapValue()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isRemapValue();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.BaseValueRangedConstraint#isRemapValue <em>Remap Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remap Value</em>' attribute.
	 * @see #isRemapValue()
	 * @generated
	 */
	void setRemapValue(boolean value);

} // BaseValueRangedConstraint
