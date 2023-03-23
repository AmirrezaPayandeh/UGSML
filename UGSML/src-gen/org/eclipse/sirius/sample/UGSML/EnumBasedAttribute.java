/**
 */
package org.eclipse.sirius.sample.UGSML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Based Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.EnumBasedAttribute#getEnumType <em>Enum Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getEnumBasedAttribute()
 * @model
 * @generated
 */
public interface EnumBasedAttribute extends GameAttribute {
	/**
	 * Returns the value of the '<em><b>Enum Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Type</em>' reference.
	 * @see #setEnumType(EnumerationBasedStructure)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getEnumBasedAttribute_EnumType()
	 * @model required="true"
	 * @generated
	 */
	EnumerationBasedStructure getEnumType();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.EnumBasedAttribute#getEnumType <em>Enum Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum Type</em>' reference.
	 * @see #getEnumType()
	 * @generated
	 */
	void setEnumType(EnumerationBasedStructure value);

} // EnumBasedAttribute
