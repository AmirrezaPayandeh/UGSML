/**
 */
package org.eclipse.sirius.sample.UGSML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotator Range Based Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.RotatorRangeBasedConstraint#getMaximumRotatorAttribute <em>Maximum Rotator Attribute</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.RotatorRangeBasedConstraint#getMinimumRotatorAttribute <em>Minimum Rotator Attribute</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getRotatorRangeBasedConstraint()
 * @model
 * @generated
 */
public interface RotatorRangeBasedConstraint extends RotatorConstraintRule, RangeBasedConstraint {
	/**
	 * Returns the value of the '<em><b>Maximum Rotator Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Rotator Attribute</em>' reference.
	 * @see #setMaximumRotatorAttribute(RotatorBasedAttribute)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getRotatorRangeBasedConstraint_MaximumRotatorAttribute()
	 * @model
	 * @generated
	 */
	RotatorBasedAttribute getMaximumRotatorAttribute();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.RotatorRangeBasedConstraint#getMaximumRotatorAttribute <em>Maximum Rotator Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Rotator Attribute</em>' reference.
	 * @see #getMaximumRotatorAttribute()
	 * @generated
	 */
	void setMaximumRotatorAttribute(RotatorBasedAttribute value);

	/**
	 * Returns the value of the '<em><b>Minimum Rotator Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Rotator Attribute</em>' reference.
	 * @see #setMinimumRotatorAttribute(RotatorBasedAttribute)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getRotatorRangeBasedConstraint_MinimumRotatorAttribute()
	 * @model
	 * @generated
	 */
	RotatorBasedAttribute getMinimumRotatorAttribute();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.RotatorRangeBasedConstraint#getMinimumRotatorAttribute <em>Minimum Rotator Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Rotator Attribute</em>' reference.
	 * @see #getMinimumRotatorAttribute()
	 * @generated
	 */
	void setMinimumRotatorAttribute(RotatorBasedAttribute value);

} // RotatorRangeBasedConstraint
