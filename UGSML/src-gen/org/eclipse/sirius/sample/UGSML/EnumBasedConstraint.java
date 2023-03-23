/**
 */
package org.eclipse.sirius.sample.UGSML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Based Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.EnumBasedConstraint#getConstrainedAttributeInstance <em>Constrained Attribute Instance</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getEnumBasedConstraint()
 * @model
 * @generated
 */
public interface EnumBasedConstraint extends SingleValueConstraint {
	/**
	 * Returns the value of the '<em><b>Constrained Attribute Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrained Attribute Instance</em>' reference.
	 * @see #setConstrainedAttributeInstance(EnumBasedAttribute)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getEnumBasedConstraint_ConstrainedAttributeInstance()
	 * @model required="true"
	 * @generated
	 */
	EnumBasedAttribute getConstrainedAttributeInstance();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.EnumBasedConstraint#getConstrainedAttributeInstance <em>Constrained Attribute Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constrained Attribute Instance</em>' reference.
	 * @see #getConstrainedAttributeInstance()
	 * @generated
	 */
	void setConstrainedAttributeInstance(EnumBasedAttribute value);

} // EnumBasedConstraint
