/**
 */
package org.eclipse.sirius.sample.UGSML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vector Based Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.VectorBasedAttribute#getX <em>X</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.VectorBasedAttribute#getY <em>Y</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.VectorBasedAttribute#getZ <em>Z</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.VectorBasedAttribute#getTOwningTransformation <em>TOwning Transformation</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.VectorBasedAttribute#getSOwningTransformation <em>SOwning Transformation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getVectorBasedAttribute()
 * @model
 * @generated
 */
public interface VectorBasedAttribute extends GameAttribute {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(float)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getVectorBasedAttribute_X()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	float getX();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.VectorBasedAttribute#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(float value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(float)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getVectorBasedAttribute_Y()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	float getY();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.VectorBasedAttribute#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(float value);

	/**
	 * Returns the value of the '<em><b>Z</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Z</em>' attribute.
	 * @see #setZ(float)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getVectorBasedAttribute_Z()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	float getZ();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.VectorBasedAttribute#getZ <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z</em>' attribute.
	 * @see #getZ()
	 * @generated
	 */
	void setZ(float value);

	/**
	 * Returns the value of the '<em><b>TOwning Transformation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.UGSML.TransformationBasedAttribute#getTranslation <em>Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TOwning Transformation</em>' container reference.
	 * @see #setTOwningTransformation(TransformationBasedAttribute)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getVectorBasedAttribute_TOwningTransformation()
	 * @see org.eclipse.sirius.sample.UGSML.TransformationBasedAttribute#getTranslation
	 * @model opposite="Translation" transient="false"
	 * @generated
	 */
	TransformationBasedAttribute getTOwningTransformation();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.VectorBasedAttribute#getTOwningTransformation <em>TOwning Transformation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TOwning Transformation</em>' container reference.
	 * @see #getTOwningTransformation()
	 * @generated
	 */
	void setTOwningTransformation(TransformationBasedAttribute value);

	/**
	 * Returns the value of the '<em><b>SOwning Transformation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.UGSML.TransformationBasedAttribute#getScale3D <em>Scale3 D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SOwning Transformation</em>' container reference.
	 * @see #setSOwningTransformation(TransformationBasedAttribute)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getVectorBasedAttribute_SOwningTransformation()
	 * @see org.eclipse.sirius.sample.UGSML.TransformationBasedAttribute#getScale3D
	 * @model opposite="Scale3D" transient="false"
	 * @generated
	 */
	TransformationBasedAttribute getSOwningTransformation();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.VectorBasedAttribute#getSOwningTransformation <em>SOwning Transformation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SOwning Transformation</em>' container reference.
	 * @see #getSOwningTransformation()
	 * @generated
	 */
	void setSOwningTransformation(TransformationBasedAttribute value);

} // VectorBasedAttribute
