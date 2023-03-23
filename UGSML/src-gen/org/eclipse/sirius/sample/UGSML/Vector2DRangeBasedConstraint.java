/**
 */
package org.eclipse.sirius.sample.UGSML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vector2 DRange Based Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.Vector2DRangeBasedConstraint#getMinimumVector2DAttribute <em>Minimum Vector2 DAttribute</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.Vector2DRangeBasedConstraint#getMaximumVector2DAttribute <em>Maximum Vector2 DAttribute</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getVector2DRangeBasedConstraint()
 * @model
 * @generated
 */
public interface Vector2DRangeBasedConstraint extends Vector2DConstraintRule, RangeBasedConstraint {
	/**
	 * Returns the value of the '<em><b>Minimum Vector2 DAttribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Vector2 DAttribute</em>' reference.
	 * @see #setMinimumVector2DAttribute(Vector2DBasedAttribute)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getVector2DRangeBasedConstraint_MinimumVector2DAttribute()
	 * @model
	 * @generated
	 */
	Vector2DBasedAttribute getMinimumVector2DAttribute();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.Vector2DRangeBasedConstraint#getMinimumVector2DAttribute <em>Minimum Vector2 DAttribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Vector2 DAttribute</em>' reference.
	 * @see #getMinimumVector2DAttribute()
	 * @generated
	 */
	void setMinimumVector2DAttribute(Vector2DBasedAttribute value);

	/**
	 * Returns the value of the '<em><b>Maximum Vector2 DAttribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Vector2 DAttribute</em>' reference.
	 * @see #setMaximumVector2DAttribute(Vector2DBasedAttribute)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getVector2DRangeBasedConstraint_MaximumVector2DAttribute()
	 * @model
	 * @generated
	 */
	Vector2DBasedAttribute getMaximumVector2DAttribute();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.Vector2DRangeBasedConstraint#getMaximumVector2DAttribute <em>Maximum Vector2 DAttribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Vector2 DAttribute</em>' reference.
	 * @see #getMaximumVector2DAttribute()
	 * @generated
	 */
	void setMaximumVector2DAttribute(Vector2DBasedAttribute value);

} // Vector2DRangeBasedConstraint
