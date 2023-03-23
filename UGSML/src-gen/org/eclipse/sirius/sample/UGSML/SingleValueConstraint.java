/**
 */
package org.eclipse.sirius.sample.UGSML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Value Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.SingleValueConstraint#getVariability <em>Variability</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getSingleValueConstraint()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SingleValueConstraint extends AttributeSystemConstraint {
	/**
	 * Returns the value of the '<em><b>Variability</b></em>' attribute.
	 * The default value is <code>"Variable"</code>.
	 * The literals are from the enumeration {@link org.eclipse.sirius.sample.UGSML.VariabilityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variability</em>' attribute.
	 * @see org.eclipse.sirius.sample.UGSML.VariabilityType
	 * @see #setVariability(VariabilityType)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getSingleValueConstraint_Variability()
	 * @model default="Variable" required="true"
	 * @generated
	 */
	VariabilityType getVariability();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.SingleValueConstraint#getVariability <em>Variability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variability</em>' attribute.
	 * @see org.eclipse.sirius.sample.UGSML.VariabilityType
	 * @see #getVariability()
	 * @generated
	 */
	void setVariability(VariabilityType value);

} // SingleValueConstraint
