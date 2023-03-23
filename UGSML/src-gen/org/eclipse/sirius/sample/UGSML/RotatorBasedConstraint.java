/**
 */
package org.eclipse.sirius.sample.UGSML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotator Based Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.RotatorBasedConstraint#getConstrainedAttributeInstance <em>Constrained Attribute Instance</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.RotatorBasedConstraint#getRotatorRangeBasedConstraint <em>Rotator Range Based Constraint</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getRotatorBasedConstraint()
 * @model
 * @generated
 */
public interface RotatorBasedConstraint extends SingleValueConstraint {
	/**
	 * Returns the value of the '<em><b>Constrained Attribute Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrained Attribute Instance</em>' reference.
	 * @see #setConstrainedAttributeInstance(RotatorBasedAttribute)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getRotatorBasedConstraint_ConstrainedAttributeInstance()
	 * @model required="true"
	 * @generated
	 */
	RotatorBasedAttribute getConstrainedAttributeInstance();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.RotatorBasedConstraint#getConstrainedAttributeInstance <em>Constrained Attribute Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constrained Attribute Instance</em>' reference.
	 * @see #getConstrainedAttributeInstance()
	 * @generated
	 */
	void setConstrainedAttributeInstance(RotatorBasedAttribute value);

	/**
	 * Returns the value of the '<em><b>Rotator Range Based Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotator Range Based Constraint</em>' containment reference.
	 * @see #setRotatorRangeBasedConstraint(RotatorRangeBasedConstraint)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getRotatorBasedConstraint_RotatorRangeBasedConstraint()
	 * @model containment="true"
	 * @generated
	 */
	RotatorRangeBasedConstraint getRotatorRangeBasedConstraint();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.RotatorBasedConstraint#getRotatorRangeBasedConstraint <em>Rotator Range Based Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotator Range Based Constraint</em>' containment reference.
	 * @see #getRotatorRangeBasedConstraint()
	 * @generated
	 */
	void setRotatorRangeBasedConstraint(RotatorRangeBasedConstraint value);

} // RotatorBasedConstraint
