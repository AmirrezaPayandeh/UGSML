/**
 */
package org.eclipse.sirius.sample.UGSML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Letter Length Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.LetterLengthConstraint#getMaximumLengthAttribute <em>Maximum Length Attribute</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.LetterLengthConstraint#getMinimumLengthAttribute <em>Minimum Length Attribute</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getLetterLengthConstraint()
 * @model
 * @generated
 */
public interface LetterLengthConstraint extends LetterConstraintRule {
	/**
	 * Returns the value of the '<em><b>Maximum Length Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Length Attribute</em>' reference.
	 * @see #setMaximumLengthAttribute(ValueBasedAttribute)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getLetterLengthConstraint_MaximumLengthAttribute()
	 * @model
	 * @generated
	 */
	ValueBasedAttribute getMaximumLengthAttribute();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.LetterLengthConstraint#getMaximumLengthAttribute <em>Maximum Length Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Length Attribute</em>' reference.
	 * @see #getMaximumLengthAttribute()
	 * @generated
	 */
	void setMaximumLengthAttribute(ValueBasedAttribute value);

	/**
	 * Returns the value of the '<em><b>Minimum Length Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Length Attribute</em>' reference.
	 * @see #setMinimumLengthAttribute(ValueBasedAttribute)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getLetterLengthConstraint_MinimumLengthAttribute()
	 * @model
	 * @generated
	 */
	ValueBasedAttribute getMinimumLengthAttribute();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.LetterLengthConstraint#getMinimumLengthAttribute <em>Minimum Length Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Length Attribute</em>' reference.
	 * @see #getMinimumLengthAttribute()
	 * @generated
	 */
	void setMinimumLengthAttribute(ValueBasedAttribute value);

} // LetterLengthConstraint
