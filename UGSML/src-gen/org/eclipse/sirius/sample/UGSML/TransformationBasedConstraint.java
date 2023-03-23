/**
 */
package org.eclipse.sirius.sample.UGSML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation Based Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.TransformationBasedConstraint#getConstrainedAttributeInstance <em>Constrained Attribute Instance</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.TransformationBasedConstraint#getTransformationRangeBasedConstraint <em>Transformation Range Based Constraint</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getTransformationBasedConstraint()
 * @model
 * @generated
 */
public interface TransformationBasedConstraint extends SingleValueConstraint {
	/**
	 * Returns the value of the '<em><b>Constrained Attribute Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrained Attribute Instance</em>' reference.
	 * @see #setConstrainedAttributeInstance(TransformationBasedAttribute)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getTransformationBasedConstraint_ConstrainedAttributeInstance()
	 * @model required="true"
	 * @generated
	 */
	TransformationBasedAttribute getConstrainedAttributeInstance();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.TransformationBasedConstraint#getConstrainedAttributeInstance <em>Constrained Attribute Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constrained Attribute Instance</em>' reference.
	 * @see #getConstrainedAttributeInstance()
	 * @generated
	 */
	void setConstrainedAttributeInstance(TransformationBasedAttribute value);

	/**
	 * Returns the value of the '<em><b>Transformation Range Based Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation Range Based Constraint</em>' containment reference.
	 * @see #setTransformationRangeBasedConstraint(TransformationRangeBasedConstraint)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getTransformationBasedConstraint_TransformationRangeBasedConstraint()
	 * @model containment="true"
	 * @generated
	 */
	TransformationRangeBasedConstraint getTransformationRangeBasedConstraint();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.TransformationBasedConstraint#getTransformationRangeBasedConstraint <em>Transformation Range Based Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation Range Based Constraint</em>' containment reference.
	 * @see #getTransformationRangeBasedConstraint()
	 * @generated
	 */
	void setTransformationRangeBasedConstraint(TransformationRangeBasedConstraint value);

} // TransformationBasedConstraint
