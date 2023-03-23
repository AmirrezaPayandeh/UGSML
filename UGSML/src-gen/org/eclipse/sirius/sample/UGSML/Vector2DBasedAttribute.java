/**
 */
package org.eclipse.sirius.sample.UGSML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vector2 DBased Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.Vector2DBasedAttribute#getX <em>X</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.Vector2DBasedAttribute#getY <em>Y</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getVector2DBasedAttribute()
 * @model
 * @generated
 */
public interface Vector2DBasedAttribute extends GameAttribute {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(float)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getVector2DBasedAttribute_X()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	float getX();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.Vector2DBasedAttribute#getX <em>X</em>}' attribute.
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
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getVector2DBasedAttribute_Y()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	float getY();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.Vector2DBasedAttribute#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(float value);

} // Vector2DBasedAttribute
