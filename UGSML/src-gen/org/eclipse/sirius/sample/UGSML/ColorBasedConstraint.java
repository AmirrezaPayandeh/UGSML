/**
 */
package org.eclipse.sirius.sample.UGSML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color Based Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.ColorBasedConstraint#getConstrainedAttributeInstance <em>Constrained Attribute Instance</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.ColorBasedConstraint#getColorCustomizationConstraint <em>Color Customization Constraint</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getColorBasedConstraint()
 * @model
 * @generated
 */
public interface ColorBasedConstraint extends SingleValueConstraint {
	/**
	 * Returns the value of the '<em><b>Constrained Attribute Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrained Attribute Instance</em>' reference.
	 * @see #setConstrainedAttributeInstance(ColorBasedAttribute)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getColorBasedConstraint_ConstrainedAttributeInstance()
	 * @model required="true"
	 * @generated
	 */
	ColorBasedAttribute getConstrainedAttributeInstance();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.ColorBasedConstraint#getConstrainedAttributeInstance <em>Constrained Attribute Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constrained Attribute Instance</em>' reference.
	 * @see #getConstrainedAttributeInstance()
	 * @generated
	 */
	void setConstrainedAttributeInstance(ColorBasedAttribute value);

	/**
	 * Returns the value of the '<em><b>Color Customization Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color Customization Constraint</em>' containment reference.
	 * @see #setColorCustomizationConstraint(ColorCustomizationConstraint)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getColorBasedConstraint_ColorCustomizationConstraint()
	 * @model containment="true"
	 * @generated
	 */
	ColorCustomizationConstraint getColorCustomizationConstraint();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.ColorBasedConstraint#getColorCustomizationConstraint <em>Color Customization Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color Customization Constraint</em>' containment reference.
	 * @see #getColorCustomizationConstraint()
	 * @generated
	 */
	void setColorCustomizationConstraint(ColorCustomizationConstraint value);

} // ColorBasedConstraint
