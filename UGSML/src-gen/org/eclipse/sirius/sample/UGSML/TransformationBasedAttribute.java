/**
 */
package org.eclipse.sirius.sample.UGSML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation Based Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.TransformationBasedAttribute#getTranslation <em>Translation</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.TransformationBasedAttribute#getRotation <em>Rotation</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.TransformationBasedAttribute#getScale3D <em>Scale3 D</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getTransformationBasedAttribute()
 * @model
 * @generated
 */
public interface TransformationBasedAttribute extends GameAttribute {
	/**
	 * Returns the value of the '<em><b>Translation</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.UGSML.VectorBasedAttribute#getTOwningTransformation <em>TOwning Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translation</em>' containment reference.
	 * @see #setTranslation(VectorBasedAttribute)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getTransformationBasedAttribute_Translation()
	 * @see org.eclipse.sirius.sample.UGSML.VectorBasedAttribute#getTOwningTransformation
	 * @model opposite="TOwningTransformation" containment="true" required="true"
	 * @generated
	 */
	VectorBasedAttribute getTranslation();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.TransformationBasedAttribute#getTranslation <em>Translation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translation</em>' containment reference.
	 * @see #getTranslation()
	 * @generated
	 */
	void setTranslation(VectorBasedAttribute value);

	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.UGSML.RotatorBasedAttribute#getROwningTransformation <em>ROwning Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation</em>' containment reference.
	 * @see #setRotation(RotatorBasedAttribute)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getTransformationBasedAttribute_Rotation()
	 * @see org.eclipse.sirius.sample.UGSML.RotatorBasedAttribute#getROwningTransformation
	 * @model opposite="ROwningTransformation" containment="true" required="true"
	 * @generated
	 */
	RotatorBasedAttribute getRotation();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.TransformationBasedAttribute#getRotation <em>Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation</em>' containment reference.
	 * @see #getRotation()
	 * @generated
	 */
	void setRotation(RotatorBasedAttribute value);

	/**
	 * Returns the value of the '<em><b>Scale3 D</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.UGSML.VectorBasedAttribute#getSOwningTransformation <em>SOwning Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale3 D</em>' containment reference.
	 * @see #setScale3D(VectorBasedAttribute)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getTransformationBasedAttribute_Scale3D()
	 * @see org.eclipse.sirius.sample.UGSML.VectorBasedAttribute#getSOwningTransformation
	 * @model opposite="SOwningTransformation" containment="true" required="true"
	 * @generated
	 */
	VectorBasedAttribute getScale3D();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.TransformationBasedAttribute#getScale3D <em>Scale3 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale3 D</em>' containment reference.
	 * @see #getScale3D()
	 * @generated
	 */
	void setScale3D(VectorBasedAttribute value);

} // TransformationBasedAttribute
