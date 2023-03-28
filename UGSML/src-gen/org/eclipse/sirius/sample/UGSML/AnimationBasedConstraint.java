/**
 */
package org.eclipse.sirius.sample.UGSML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Animation Based Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.AnimationBasedConstraint#getConstrainedAttributeInstance <em>Constrained Attribute Instance</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getAnimationBasedConstraint()
 * @model
 * @generated
 */
public interface AnimationBasedConstraint extends SingleValueConstraint {
	/**
	 * Returns the value of the '<em><b>Constrained Attribute Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrained Attribute Instance</em>' reference.
	 * @see #setConstrainedAttributeInstance(AnimationBasedAttribute)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getAnimationBasedConstraint_ConstrainedAttributeInstance()
	 * @model required="true"
	 * @generated
	 */
	AnimationBasedAttribute getConstrainedAttributeInstance();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.AnimationBasedConstraint#getConstrainedAttributeInstance <em>Constrained Attribute Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constrained Attribute Instance</em>' reference.
	 * @see #getConstrainedAttributeInstance()
	 * @generated
	 */
	void setConstrainedAttributeInstance(AnimationBasedAttribute value);

} // AnimationBasedConstraint
