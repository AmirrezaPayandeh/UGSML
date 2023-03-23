/**
 */
package org.eclipse.sirius.sample.UGSML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vector Range Based Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.VectorRangeBasedConstraint#getMaximumVectorAttribute <em>Maximum Vector Attribute</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.VectorRangeBasedConstraint#getMinimumVectorAttribute <em>Minimum Vector Attribute</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getVectorRangeBasedConstraint()
 * @model
 * @generated
 */
public interface VectorRangeBasedConstraint extends VectorConstraintRule, RangeBasedConstraint {
	/**
	 * Returns the value of the '<em><b>Maximum Vector Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Vector Attribute</em>' reference.
	 * @see #setMaximumVectorAttribute(VectorBasedAttribute)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getVectorRangeBasedConstraint_MaximumVectorAttribute()
	 * @model
	 * @generated
	 */
	VectorBasedAttribute getMaximumVectorAttribute();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.VectorRangeBasedConstraint#getMaximumVectorAttribute <em>Maximum Vector Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Vector Attribute</em>' reference.
	 * @see #getMaximumVectorAttribute()
	 * @generated
	 */
	void setMaximumVectorAttribute(VectorBasedAttribute value);

	/**
	 * Returns the value of the '<em><b>Minimum Vector Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Vector Attribute</em>' reference.
	 * @see #setMinimumVectorAttribute(VectorBasedAttribute)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getVectorRangeBasedConstraint_MinimumVectorAttribute()
	 * @model
	 * @generated
	 */
	VectorBasedAttribute getMinimumVectorAttribute();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.VectorRangeBasedConstraint#getMinimumVectorAttribute <em>Minimum Vector Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Vector Attribute</em>' reference.
	 * @see #getMinimumVectorAttribute()
	 * @generated
	 */
	void setMinimumVectorAttribute(VectorBasedAttribute value);

} // VectorRangeBasedConstraint
