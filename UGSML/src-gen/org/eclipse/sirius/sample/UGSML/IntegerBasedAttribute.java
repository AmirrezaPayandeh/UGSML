/**
 */
package org.eclipse.sirius.sample.UGSML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Based Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.IntegerBasedAttribute#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getIntegerBasedAttribute()
 * @model
 * @generated
 */
public interface IntegerBasedAttribute extends ValueBasedAttribute {
	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(int)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getIntegerBasedAttribute_DefaultValue()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getDefaultValue();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.IntegerBasedAttribute#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(int value);

} // IntegerBasedAttribute
