/**
 */
package org.eclipse.sirius.sample.UGSML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Minimum Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.MinimumValue#getMinimumAttribute <em>Minimum Attribute</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getMinimumValue()
 * @model
 * @generated
 */
public interface MinimumValue extends BaseValueRangedConstraint {
	/**
	 * Returns the value of the '<em><b>Minimum Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Attribute</em>' reference.
	 * @see #setMinimumAttribute(ValueBasedAttribute)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getMinimumValue_MinimumAttribute()
	 * @model required="true"
	 * @generated
	 */
	ValueBasedAttribute getMinimumAttribute();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.MinimumValue#getMinimumAttribute <em>Minimum Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Attribute</em>' reference.
	 * @see #getMinimumAttribute()
	 * @generated
	 */
	void setMinimumAttribute(ValueBasedAttribute value);

} // MinimumValue
