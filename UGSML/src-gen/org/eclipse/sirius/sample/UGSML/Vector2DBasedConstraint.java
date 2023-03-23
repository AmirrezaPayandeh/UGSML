/**
 */
package org.eclipse.sirius.sample.UGSML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vector2 DBased Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.Vector2DBasedConstraint#getConstrainedAttributeInstance <em>Constrained Attribute Instance</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.Vector2DBasedConstraint#getVector2DRangeBasedConstraint <em>Vector2 DRange Based Constraint</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getVector2DBasedConstraint()
 * @model
 * @generated
 */
public interface Vector2DBasedConstraint extends SingleValueConstraint {
	/**
	 * Returns the value of the '<em><b>Constrained Attribute Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrained Attribute Instance</em>' reference.
	 * @see #setConstrainedAttributeInstance(Vector2DBasedAttribute)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getVector2DBasedConstraint_ConstrainedAttributeInstance()
	 * @model required="true"
	 * @generated
	 */
	Vector2DBasedAttribute getConstrainedAttributeInstance();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.Vector2DBasedConstraint#getConstrainedAttributeInstance <em>Constrained Attribute Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constrained Attribute Instance</em>' reference.
	 * @see #getConstrainedAttributeInstance()
	 * @generated
	 */
	void setConstrainedAttributeInstance(Vector2DBasedAttribute value);

	/**
	 * Returns the value of the '<em><b>Vector2 DRange Based Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vector2 DRange Based Constraint</em>' containment reference.
	 * @see #setVector2DRangeBasedConstraint(Vector2DRangeBasedConstraint)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getVector2DBasedConstraint_Vector2DRangeBasedConstraint()
	 * @model containment="true"
	 * @generated
	 */
	Vector2DRangeBasedConstraint getVector2DRangeBasedConstraint();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.Vector2DBasedConstraint#getVector2DRangeBasedConstraint <em>Vector2 DRange Based Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vector2 DRange Based Constraint</em>' containment reference.
	 * @see #getVector2DRangeBasedConstraint()
	 * @generated
	 */
	void setVector2DRangeBasedConstraint(Vector2DRangeBasedConstraint value);

} // Vector2DBasedConstraint
