/**
 */
package org.eclipse.sirius.sample.UGSML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Letter Customization Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.LetterCustomizationConstraint#getFilterStrings <em>Filter Strings</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getLetterCustomizationConstraint()
 * @model
 * @generated
 */
public interface LetterCustomizationConstraint extends LetterConstraintRule, CustomizationType {
	/**
	 * Returns the value of the '<em><b>Filter Strings</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Strings</em>' reference.
	 * @see #setFilterStrings(StringBasedAttribute)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getLetterCustomizationConstraint_FilterStrings()
	 * @model required="true"
	 * @generated
	 */
	StringBasedAttribute getFilterStrings();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.LetterCustomizationConstraint#getFilterStrings <em>Filter Strings</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Strings</em>' reference.
	 * @see #getFilterStrings()
	 * @generated
	 */
	void setFilterStrings(StringBasedAttribute value);

} // LetterCustomizationConstraint
