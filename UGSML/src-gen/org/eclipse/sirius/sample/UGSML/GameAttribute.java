/**
 */
package org.eclipse.sirius.sample.UGSML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.GameAttribute#isDataStructureArray <em>Data Structure Array</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getGameAttribute()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface GameAttribute extends GameFeature {

	/**
	 * Returns the value of the '<em><b>Data Structure Array</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Structure Array</em>' attribute.
	 * @see #setDataStructureArray(boolean)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getGameAttribute_DataStructureArray()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isDataStructureArray();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.GameAttribute#isDataStructureArray <em>Data Structure Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Structure Array</em>' attribute.
	 * @see #isDataStructureArray()
	 * @generated
	 */
	void setDataStructureArray(boolean value);
} // GameAttribute
