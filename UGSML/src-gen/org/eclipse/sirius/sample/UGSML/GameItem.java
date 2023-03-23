/**
 */
package org.eclipse.sirius.sample.UGSML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.GameItem#getItemAttributeInstances <em>Item Attribute Instances</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.GameItem#getItemModes <em>Item Modes</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.GameItem#getDerivedItems <em>Derived Items</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.GameItem#getParentItem <em>Parent Item</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.GameItem#getPlacableInventories <em>Placable Inventories</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.GameItem#isIsAbstract <em>Is Abstract</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getGameItem()
 * @model
 * @generated
 */
public interface GameItem extends GameFeature {
	/**
	 * Returns the value of the '<em><b>Item Attribute Instances</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.UGSML.GameAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Attribute Instances</em>' reference list.
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getGameItem_ItemAttributeInstances()
	 * @model
	 * @generated
	 */
	EList<GameAttribute> getItemAttributeInstances();

	/**
	 * Returns the value of the '<em><b>Item Modes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.UGSML.ItemMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Modes</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getGameItem_ItemModes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ItemMode> getItemModes();

	/**
	 * Returns the value of the '<em><b>Derived Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.UGSML.GameItem}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.UGSML.GameItem#getParentItem <em>Parent Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived Items</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getGameItem_DerivedItems()
	 * @see org.eclipse.sirius.sample.UGSML.GameItem#getParentItem
	 * @model opposite="ParentItem" containment="true"
	 * @generated
	 */
	EList<GameItem> getDerivedItems();

	/**
	 * Returns the value of the '<em><b>Parent Item</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.UGSML.GameItem#getDerivedItems <em>Derived Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Item</em>' container reference.
	 * @see #setParentItem(GameItem)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getGameItem_ParentItem()
	 * @see org.eclipse.sirius.sample.UGSML.GameItem#getDerivedItems
	 * @model opposite="DerivedItems" transient="false"
	 * @generated
	 */
	GameItem getParentItem();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.GameItem#getParentItem <em>Parent Item</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Item</em>' container reference.
	 * @see #getParentItem()
	 * @generated
	 */
	void setParentItem(GameItem value);

	/**
	 * Returns the value of the '<em><b>Placable Inventories</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.UGSML.InventorySystem#getSystemItems <em>System Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placable Inventories</em>' reference.
	 * @see #setPlacableInventories(InventorySystem)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getGameItem_PlacableInventories()
	 * @see org.eclipse.sirius.sample.UGSML.InventorySystem#getSystemItems
	 * @model opposite="SystemItems" required="true"
	 * @generated
	 */
	InventorySystem getPlacableInventories();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.GameItem#getPlacableInventories <em>Placable Inventories</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placable Inventories</em>' reference.
	 * @see #getPlacableInventories()
	 * @generated
	 */
	void setPlacableInventories(InventorySystem value);

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether we can actually create an item instance from this class or not.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getGameItem_IsAbstract()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.GameItem#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

} // GameItem
