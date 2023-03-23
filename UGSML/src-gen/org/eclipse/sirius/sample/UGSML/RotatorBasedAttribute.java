/**
 */
package org.eclipse.sirius.sample.UGSML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotator Based Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.RotatorBasedAttribute#getRoll <em>Roll</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.RotatorBasedAttribute#getPitch <em>Pitch</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.RotatorBasedAttribute#getYaw <em>Yaw</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.RotatorBasedAttribute#getROwningTransformation <em>ROwning Transformation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getRotatorBasedAttribute()
 * @model
 * @generated
 */
public interface RotatorBasedAttribute extends GameAttribute {
	/**
	 * Returns the value of the '<em><b>Roll</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roll</em>' attribute.
	 * @see #setRoll(float)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getRotatorBasedAttribute_Roll()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	float getRoll();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.RotatorBasedAttribute#getRoll <em>Roll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roll</em>' attribute.
	 * @see #getRoll()
	 * @generated
	 */
	void setRoll(float value);

	/**
	 * Returns the value of the '<em><b>Pitch</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pitch</em>' attribute.
	 * @see #setPitch(float)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getRotatorBasedAttribute_Pitch()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	float getPitch();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.RotatorBasedAttribute#getPitch <em>Pitch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pitch</em>' attribute.
	 * @see #getPitch()
	 * @generated
	 */
	void setPitch(float value);

	/**
	 * Returns the value of the '<em><b>Yaw</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yaw</em>' attribute.
	 * @see #setYaw(float)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getRotatorBasedAttribute_Yaw()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	float getYaw();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.RotatorBasedAttribute#getYaw <em>Yaw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yaw</em>' attribute.
	 * @see #getYaw()
	 * @generated
	 */
	void setYaw(float value);

	/**
	 * Returns the value of the '<em><b>ROwning Transformation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.UGSML.TransformationBasedAttribute#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ROwning Transformation</em>' container reference.
	 * @see #setROwningTransformation(TransformationBasedAttribute)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getRotatorBasedAttribute_ROwningTransformation()
	 * @see org.eclipse.sirius.sample.UGSML.TransformationBasedAttribute#getRotation
	 * @model opposite="Rotation" transient="false"
	 * @generated
	 */
	TransformationBasedAttribute getROwningTransformation();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.RotatorBasedAttribute#getROwningTransformation <em>ROwning Transformation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ROwning Transformation</em>' container reference.
	 * @see #getROwningTransformation()
	 * @generated
	 */
	void setROwningTransformation(TransformationBasedAttribute value);

} // RotatorBasedAttribute
