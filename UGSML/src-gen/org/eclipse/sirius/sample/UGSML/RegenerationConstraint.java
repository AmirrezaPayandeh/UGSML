/**
 */
package org.eclipse.sirius.sample.UGSML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regeneration Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.RegenerationConstraint#getRegenerationAttribute <em>Regeneration Attribute</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getRegenerationConstraint()
 * @model
 * @generated
 */
public interface RegenerationConstraint extends ValueConstraintRule {
	/**
	 * Returns the value of the '<em><b>Regeneration Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regeneration Attribute</em>' reference.
	 * @see #setRegenerationAttribute(ValueBasedAttribute)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getRegenerationConstraint_RegenerationAttribute()
	 * @model required="true"
	 * @generated
	 */
	ValueBasedAttribute getRegenerationAttribute();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.RegenerationConstraint#getRegenerationAttribute <em>Regeneration Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regeneration Attribute</em>' reference.
	 * @see #getRegenerationAttribute()
	 * @generated
	 */
	void setRegenerationAttribute(ValueBasedAttribute value);

} // RegenerationConstraint
