/**
 */
package org.eclipse.sirius.sample.UGSML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inventory System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.InventorySystem#getInventoryConstraints <em>Inventory Constraints</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.InventorySystem#getSystemItems <em>System Items</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getInventorySystem()
 * @model
 * @generated
 */
public interface InventorySystem extends GameSystem {
	/**
	 * Returns the value of the '<em><b>Inventory Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Constraints</em>' containment reference.
	 * @see #setInventoryConstraints(InventorySystemConstraint)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getInventorySystem_InventoryConstraints()
	 * @model containment="true"
	 * @generated
	 */
	InventorySystemConstraint getInventoryConstraints();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.InventorySystem#getInventoryConstraints <em>Inventory Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Constraints</em>' containment reference.
	 * @see #getInventoryConstraints()
	 * @generated
	 */
	void setInventoryConstraints(InventorySystemConstraint value);

	/**
	 * Returns the value of the '<em><b>System Items</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.UGSML.GameItem}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.UGSML.GameItem#getPlacableInventories <em>Placable Inventories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Items</em>' reference list.
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getInventorySystem_SystemItems()
	 * @see org.eclipse.sirius.sample.UGSML.GameItem#getPlacableInventories
	 * @model opposite="PlacableInventories"
	 * @generated
	 */
	EList<GameItem> getSystemItems();

} // InventorySystem
