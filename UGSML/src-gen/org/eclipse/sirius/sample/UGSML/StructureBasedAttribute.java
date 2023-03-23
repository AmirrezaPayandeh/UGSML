/**
 */
package org.eclipse.sirius.sample.UGSML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Based Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.StructureBasedAttribute#getDataType <em>Data Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getStructureBasedAttribute()
 * @model
 * @generated
 */
public interface StructureBasedAttribute extends GameAttribute {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' reference.
	 * @see #setDataType(DataBasedStructure)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getStructureBasedAttribute_DataType()
	 * @model required="true"
	 * @generated
	 */
	DataBasedStructure getDataType();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.StructureBasedAttribute#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataBasedStructure value);

} // StructureBasedAttribute
