/**
 */
package org.eclipse.sirius.sample.UGSML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vector Based Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.VectorBasedConstraint#getConstrainedAttributeInstance <em>Constrained Attribute Instance</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.VectorBasedConstraint#getVectorRangeBasedConstraint <em>Vector Range Based Constraint</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getVectorBasedConstraint()
 * @model
 * @generated
 */
public interface VectorBasedConstraint extends SingleValueConstraint {
	/**
	 * Returns the value of the '<em><b>Constrained Attribute Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrained Attribute Instance</em>' reference.
	 * @see #setConstrainedAttributeInstance(VectorBasedAttribute)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getVectorBasedConstraint_ConstrainedAttributeInstance()
	 * @model required="true"
	 * @generated
	 */
	VectorBasedAttribute getConstrainedAttributeInstance();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.VectorBasedConstraint#getConstrainedAttributeInstance <em>Constrained Attribute Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constrained Attribute Instance</em>' reference.
	 * @see #getConstrainedAttributeInstance()
	 * @generated
	 */
	void setConstrainedAttributeInstance(VectorBasedAttribute value);

	/**
	 * Returns the value of the '<em><b>Vector Range Based Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vector Range Based Constraint</em>' containment reference.
	 * @see #setVectorRangeBasedConstraint(VectorRangeBasedConstraint)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getVectorBasedConstraint_VectorRangeBasedConstraint()
	 * @model containment="true"
	 * @generated
	 */
	VectorRangeBasedConstraint getVectorRangeBasedConstraint();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.VectorBasedConstraint#getVectorRangeBasedConstraint <em>Vector Range Based Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vector Range Based Constraint</em>' containment reference.
	 * @see #getVectorRangeBasedConstraint()
	 * @generated
	 */
	void setVectorRangeBasedConstraint(VectorRangeBasedConstraint value);

} // VectorBasedConstraint
