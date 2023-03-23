/**
 */
package org.eclipse.sirius.sample.UGSML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Based Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.BooleanBasedAttribute#isDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getBooleanBasedAttribute()
 * @model
 * @generated
 */
public interface BooleanBasedAttribute extends GameAttribute {
	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(boolean)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getBooleanBasedAttribute_DefaultValue()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isDefaultValue();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.BooleanBasedAttribute#isDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #isDefaultValue()
	 * @generated
	 */
	void setDefaultValue(boolean value);

} // BooleanBasedAttribute
