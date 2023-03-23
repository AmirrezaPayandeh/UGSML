/**
 */
package org.eclipse.sirius.sample.UGSML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Based Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.ModelBasedConstraint#getConstrainedAttributeInstance <em>Constrained Attribute Instance</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getModelBasedConstraint()
 * @model
 * @generated
 */
public interface ModelBasedConstraint extends SingleValueConstraint {
	/**
	 * Returns the value of the '<em><b>Constrained Attribute Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrained Attribute Instance</em>' reference.
	 * @see #setConstrainedAttributeInstance(ModelBasedAttribute)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getModelBasedConstraint_ConstrainedAttributeInstance()
	 * @model required="true"
	 * @generated
	 */
	ModelBasedAttribute getConstrainedAttributeInstance();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.ModelBasedConstraint#getConstrainedAttributeInstance <em>Constrained Attribute Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constrained Attribute Instance</em>' reference.
	 * @see #getConstrainedAttributeInstance()
	 * @generated
	 */
	void setConstrainedAttributeInstance(ModelBasedAttribute value);

} // ModelBasedConstraint
