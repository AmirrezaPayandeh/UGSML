/**
 */
package org.eclipse.sirius.sample.UGSML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Maximum Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.MaximumValue#getMaximumAttribute <em>Maximum Attribute</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getMaximumValue()
 * @model
 * @generated
 */
public interface MaximumValue extends BaseValueRangedConstraint {
	/**
	 * Returns the value of the '<em><b>Maximum Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Attribute</em>' reference.
	 * @see #setMaximumAttribute(ValueBasedAttribute)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getMaximumValue_MaximumAttribute()
	 * @model required="true"
	 * @generated
	 */
	ValueBasedAttribute getMaximumAttribute();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.MaximumValue#getMaximumAttribute <em>Maximum Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Attribute</em>' reference.
	 * @see #getMaximumAttribute()
	 * @generated
	 */
	void setMaximumAttribute(ValueBasedAttribute value);

} // MaximumValue
