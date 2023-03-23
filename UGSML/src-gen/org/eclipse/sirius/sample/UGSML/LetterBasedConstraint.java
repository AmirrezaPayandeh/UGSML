/**
 */
package org.eclipse.sirius.sample.UGSML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Letter Based Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.LetterBasedConstraint#getConstrainedAttributeInstance <em>Constrained Attribute Instance</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.LetterBasedConstraint#getLetterLengthConstraint <em>Letter Length Constraint</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.LetterBasedConstraint#getLetterCustomizationConstraint <em>Letter Customization Constraint</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getLetterBasedConstraint()
 * @model
 * @generated
 */
public interface LetterBasedConstraint extends SingleValueConstraint {
	/**
	 * Returns the value of the '<em><b>Constrained Attribute Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrained Attribute Instance</em>' reference.
	 * @see #setConstrainedAttributeInstance(LetterBasedAttribute)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getLetterBasedConstraint_ConstrainedAttributeInstance()
	 * @model required="true"
	 * @generated
	 */
	LetterBasedAttribute getConstrainedAttributeInstance();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.LetterBasedConstraint#getConstrainedAttributeInstance <em>Constrained Attribute Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constrained Attribute Instance</em>' reference.
	 * @see #getConstrainedAttributeInstance()
	 * @generated
	 */
	void setConstrainedAttributeInstance(LetterBasedAttribute value);

	/**
	 * Returns the value of the '<em><b>Letter Length Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Letter Length Constraint</em>' containment reference.
	 * @see #setLetterLengthConstraint(LetterLengthConstraint)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getLetterBasedConstraint_LetterLengthConstraint()
	 * @model containment="true"
	 * @generated
	 */
	LetterLengthConstraint getLetterLengthConstraint();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.LetterBasedConstraint#getLetterLengthConstraint <em>Letter Length Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Letter Length Constraint</em>' containment reference.
	 * @see #getLetterLengthConstraint()
	 * @generated
	 */
	void setLetterLengthConstraint(LetterLengthConstraint value);

	/**
	 * Returns the value of the '<em><b>Letter Customization Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Letter Customization Constraint</em>' containment reference.
	 * @see #setLetterCustomizationConstraint(LetterCustomizationConstraint)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getLetterBasedConstraint_LetterCustomizationConstraint()
	 * @model containment="true"
	 * @generated
	 */
	LetterCustomizationConstraint getLetterCustomizationConstraint();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.LetterBasedConstraint#getLetterCustomizationConstraint <em>Letter Customization Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Letter Customization Constraint</em>' containment reference.
	 * @see #getLetterCustomizationConstraint()
	 * @generated
	 */
	void setLetterCustomizationConstraint(LetterCustomizationConstraint value);

} // LetterBasedConstraint
