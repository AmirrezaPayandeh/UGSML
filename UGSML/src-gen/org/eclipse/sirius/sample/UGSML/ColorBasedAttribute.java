/**
 */
package org.eclipse.sirius.sample.UGSML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color Based Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.ColorBasedAttribute#getR <em>R</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.ColorBasedAttribute#getG <em>G</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.ColorBasedAttribute#getB <em>B</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.ColorBasedAttribute#getA <em>A</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getColorBasedAttribute()
 * @model
 * @generated
 */
public interface ColorBasedAttribute extends GameAttribute {
	/**
	 * Returns the value of the '<em><b>R</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Red channel. Can contain a value between 0 and 255.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>R</em>' attribute.
	 * @see #setR(int)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getColorBasedAttribute_R()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getR();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.ColorBasedAttribute#getR <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R</em>' attribute.
	 * @see #getR()
	 * @generated
	 */
	void setR(int value);

	/**
	 * Returns the value of the '<em><b>G</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Green channel. Can contain a value between 0 and 255.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>G</em>' attribute.
	 * @see #setG(int)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getColorBasedAttribute_G()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getG();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.ColorBasedAttribute#getG <em>G</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>G</em>' attribute.
	 * @see #getG()
	 * @generated
	 */
	void setG(int value);

	/**
	 * Returns the value of the '<em><b>B</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Blue channel. Can contain a value between 0 and 255.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>B</em>' attribute.
	 * @see #setB(int)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getColorBasedAttribute_B()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getB();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.ColorBasedAttribute#getB <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B</em>' attribute.
	 * @see #getB()
	 * @generated
	 */
	void setB(int value);

	/**
	 * Returns the value of the '<em><b>A</b></em>' attribute.
	 * The default value is <code>"255"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Alpha channel. Can contain a value between 0 and 255.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>A</em>' attribute.
	 * @see #setA(int)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getColorBasedAttribute_A()
	 * @model default="255" required="true"
	 * @generated
	 */
	int getA();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.ColorBasedAttribute#getA <em>A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>A</em>' attribute.
	 * @see #getA()
	 * @generated
	 */
	void setA(int value);

} // ColorBasedAttribute
