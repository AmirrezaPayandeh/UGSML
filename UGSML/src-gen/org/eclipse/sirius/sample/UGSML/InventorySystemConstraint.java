/**
 */
package org.eclipse.sirius.sample.UGSML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inventory System Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.InventorySystemConstraint#getSelectionConstraint <em>Selection Constraint</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.InventorySystemConstraint#getEquipItemConstraint <em>Equip Item Constraint</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.InventorySystemConstraint#getSlotConstraint <em>Slot Constraint</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.InventorySystemConstraint#getStackWeightConstraint <em>Stack Weight Constraint</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.InventorySystemConstraint#getAutoCraftConstraint <em>Auto Craft Constraint</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.InventorySystemConstraint#getVainConstraint <em>Vain Constraint</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getInventorySystemConstraint()
 * @model
 * @generated
 */
public interface InventorySystemConstraint extends GameSystemConstraint {
	/**
	 * Returns the value of the '<em><b>Selection Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection Constraint</em>' containment reference.
	 * @see #setSelectionConstraint(SelectionConstraint)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getInventorySystemConstraint_SelectionConstraint()
	 * @model containment="true"
	 * @generated
	 */
	SelectionConstraint getSelectionConstraint();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.InventorySystemConstraint#getSelectionConstraint <em>Selection Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection Constraint</em>' containment reference.
	 * @see #getSelectionConstraint()
	 * @generated
	 */
	void setSelectionConstraint(SelectionConstraint value);

	/**
	 * Returns the value of the '<em><b>Equip Item Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equip Item Constraint</em>' containment reference.
	 * @see #setEquipItemConstraint(EquipItemConstraint)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getInventorySystemConstraint_EquipItemConstraint()
	 * @model containment="true"
	 * @generated
	 */
	EquipItemConstraint getEquipItemConstraint();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.InventorySystemConstraint#getEquipItemConstraint <em>Equip Item Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equip Item Constraint</em>' containment reference.
	 * @see #getEquipItemConstraint()
	 * @generated
	 */
	void setEquipItemConstraint(EquipItemConstraint value);

	/**
	 * Returns the value of the '<em><b>Slot Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot Constraint</em>' containment reference.
	 * @see #setSlotConstraint(SlotConstraint)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getInventorySystemConstraint_SlotConstraint()
	 * @model containment="true"
	 * @generated
	 */
	SlotConstraint getSlotConstraint();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.InventorySystemConstraint#getSlotConstraint <em>Slot Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slot Constraint</em>' containment reference.
	 * @see #getSlotConstraint()
	 * @generated
	 */
	void setSlotConstraint(SlotConstraint value);

	/**
	 * Returns the value of the '<em><b>Stack Weight Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stack Weight Constraint</em>' containment reference.
	 * @see #setStackWeightConstraint(StackWeightConstraint)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getInventorySystemConstraint_StackWeightConstraint()
	 * @model containment="true"
	 * @generated
	 */
	StackWeightConstraint getStackWeightConstraint();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.InventorySystemConstraint#getStackWeightConstraint <em>Stack Weight Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stack Weight Constraint</em>' containment reference.
	 * @see #getStackWeightConstraint()
	 * @generated
	 */
	void setStackWeightConstraint(StackWeightConstraint value);

	/**
	 * Returns the value of the '<em><b>Auto Craft Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Craft Constraint</em>' containment reference.
	 * @see #setAutoCraftConstraint(AutoCraftConstraint)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getInventorySystemConstraint_AutoCraftConstraint()
	 * @model containment="true"
	 * @generated
	 */
	AutoCraftConstraint getAutoCraftConstraint();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.InventorySystemConstraint#getAutoCraftConstraint <em>Auto Craft Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Craft Constraint</em>' containment reference.
	 * @see #getAutoCraftConstraint()
	 * @generated
	 */
	void setAutoCraftConstraint(AutoCraftConstraint value);

	/**
	 * Returns the value of the '<em><b>Vain Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vain Constraint</em>' containment reference.
	 * @see #setVainConstraint(VainConstraint)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getInventorySystemConstraint_VainConstraint()
	 * @model containment="true"
	 * @generated
	 */
	VainConstraint getVainConstraint();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.InventorySystemConstraint#getVainConstraint <em>Vain Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vain Constraint</em>' containment reference.
	 * @see #getVainConstraint()
	 * @generated
	 */
	void setVainConstraint(VainConstraint value);

} // InventorySystemConstraint
