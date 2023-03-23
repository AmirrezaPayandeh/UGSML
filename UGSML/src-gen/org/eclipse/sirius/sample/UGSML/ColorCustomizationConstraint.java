/**
 */
package org.eclipse.sirius.sample.UGSML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color Customization Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.ColorCustomizationConstraint#getFilterColors <em>Filter Colors</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getColorCustomizationConstraint()
 * @model
 * @generated
 */
public interface ColorCustomizationConstraint extends ColorConstraintRule, CustomizationType {
	/**
	 * Returns the value of the '<em><b>Filter Colors</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Colors</em>' reference.
	 * @see #setFilterColors(ColorBasedAttribute)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getColorCustomizationConstraint_FilterColors()
	 * @model required="true"
	 * @generated
	 */
	ColorBasedAttribute getFilterColors();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.ColorCustomizationConstraint#getFilterColors <em>Filter Colors</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Colors</em>' reference.
	 * @see #getFilterColors()
	 * @generated
	 */
	void setFilterColors(ColorBasedAttribute value);

} // ColorCustomizationConstraint
