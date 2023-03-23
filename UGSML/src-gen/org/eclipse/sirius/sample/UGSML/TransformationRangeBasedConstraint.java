/**
 */
package org.eclipse.sirius.sample.UGSML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation Range Based Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.TransformationRangeBasedConstraint#getMaximumTransformationAttribute <em>Maximum Transformation Attribute</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.TransformationRangeBasedConstraint#getMinimumTransformationAttribute <em>Minimum Transformation Attribute</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getTransformationRangeBasedConstraint()
 * @model
 * @generated
 */
public interface TransformationRangeBasedConstraint extends TransformationConstraintRule, RangeBasedConstraint {
	/**
	 * Returns the value of the '<em><b>Maximum Transformation Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Transformation Attribute</em>' reference.
	 * @see #setMaximumTransformationAttribute(TransformationBasedAttribute)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getTransformationRangeBasedConstraint_MaximumTransformationAttribute()
	 * @model
	 * @generated
	 */
	TransformationBasedAttribute getMaximumTransformationAttribute();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.TransformationRangeBasedConstraint#getMaximumTransformationAttribute <em>Maximum Transformation Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Transformation Attribute</em>' reference.
	 * @see #getMaximumTransformationAttribute()
	 * @generated
	 */
	void setMaximumTransformationAttribute(TransformationBasedAttribute value);

	/**
	 * Returns the value of the '<em><b>Minimum Transformation Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Transformation Attribute</em>' reference.
	 * @see #setMinimumTransformationAttribute(TransformationBasedAttribute)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getTransformationRangeBasedConstraint_MinimumTransformationAttribute()
	 * @model
	 * @generated
	 */
	TransformationBasedAttribute getMinimumTransformationAttribute();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.TransformationRangeBasedConstraint#getMinimumTransformationAttribute <em>Minimum Transformation Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Transformation Attribute</em>' reference.
	 * @see #getMinimumTransformationAttribute()
	 * @generated
	 */
	void setMinimumTransformationAttribute(TransformationBasedAttribute value);

} // TransformationRangeBasedConstraint
