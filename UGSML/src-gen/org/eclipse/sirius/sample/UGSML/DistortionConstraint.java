/**
 */
package org.eclipse.sirius.sample.UGSML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distortion Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.DistortionConstraint#getDistortionAttribute <em>Distortion Attribute</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.DistortionConstraint#getDistortionMode <em>Distortion Mode</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getDistortionConstraint()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface DistortionConstraint extends ValueConstraintRule {
	/**
	 * Returns the value of the '<em><b>Distortion Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distortion Attribute</em>' reference.
	 * @see #setDistortionAttribute(ValueBasedAttribute)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getDistortionConstraint_DistortionAttribute()
	 * @model required="true"
	 * @generated
	 */
	ValueBasedAttribute getDistortionAttribute();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.DistortionConstraint#getDistortionAttribute <em>Distortion Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distortion Attribute</em>' reference.
	 * @see #getDistortionAttribute()
	 * @generated
	 */
	void setDistortionAttribute(ValueBasedAttribute value);

	/**
	 * Returns the value of the '<em><b>Distortion Mode</b></em>' attribute.
	 * The default value is <code>"Multiplication"</code>.
	 * The literals are from the enumeration {@link org.eclipse.sirius.sample.UGSML.ArithmeticOperations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distortion Mode</em>' attribute.
	 * @see org.eclipse.sirius.sample.UGSML.ArithmeticOperations
	 * @see #setDistortionMode(ArithmeticOperations)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getDistortionConstraint_DistortionMode()
	 * @model default="Multiplication" required="true"
	 * @generated
	 */
	ArithmeticOperations getDistortionMode();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.DistortionConstraint#getDistortionMode <em>Distortion Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distortion Mode</em>' attribute.
	 * @see org.eclipse.sirius.sample.UGSML.ArithmeticOperations
	 * @see #getDistortionMode()
	 * @generated
	 */
	void setDistortionMode(ArithmeticOperations value);

} // DistortionConstraint
