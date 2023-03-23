/**
 */
package org.eclipse.sirius.sample.UGSML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Margin Of Error Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.MarginOfErrorConstraint#getMOEAttribute <em>MOE Attribute</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getMarginOfErrorConstraint()
 * @model
 * @generated
 */
public interface MarginOfErrorConstraint extends ValueConstraintRule {
	/**
	 * Returns the value of the '<em><b>MOE Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MOE Attribute</em>' reference.
	 * @see #setMOEAttribute(ValueBasedAttribute)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getMarginOfErrorConstraint_MOEAttribute()
	 * @model required="true"
	 * @generated
	 */
	ValueBasedAttribute getMOEAttribute();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.MarginOfErrorConstraint#getMOEAttribute <em>MOE Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MOE Attribute</em>' reference.
	 * @see #getMOEAttribute()
	 * @generated
	 */
	void setMOEAttribute(ValueBasedAttribute value);

} // MarginOfErrorConstraint
