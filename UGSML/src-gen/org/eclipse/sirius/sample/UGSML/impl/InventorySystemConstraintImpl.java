/**
 */
package org.eclipse.sirius.sample.UGSML.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sirius.sample.UGSML.AutoCraftConstraint;
import org.eclipse.sirius.sample.UGSML.EquipItemConstraint;
import org.eclipse.sirius.sample.UGSML.InventorySystemConstraint;
import org.eclipse.sirius.sample.UGSML.SelectionConstraint;
import org.eclipse.sirius.sample.UGSML.SlotConstraint;
import org.eclipse.sirius.sample.UGSML.StackWeightConstraint;
import org.eclipse.sirius.sample.UGSML.UGSMLPackage;
import org.eclipse.sirius.sample.UGSML.VainConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inventory System Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.InventorySystemConstraintImpl#getSelectionConstraint <em>Selection Constraint</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.InventorySystemConstraintImpl#getEquipItemConstraint <em>Equip Item Constraint</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.InventorySystemConstraintImpl#getSlotConstraint <em>Slot Constraint</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.InventorySystemConstraintImpl#getStackWeightConstraint <em>Stack Weight Constraint</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.InventorySystemConstraintImpl#getAutoCraftConstraint <em>Auto Craft Constraint</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.InventorySystemConstraintImpl#getVainConstraint <em>Vain Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InventorySystemConstraintImpl extends MinimalEObjectImpl.Container implements InventorySystemConstraint {
	/**
	 * The cached value of the '{@link #getSelectionConstraint() <em>Selection Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionConstraint()
	 * @generated
	 * @ordered
	 */
	protected SelectionConstraint selectionConstraint;

	/**
	 * The cached value of the '{@link #getEquipItemConstraint() <em>Equip Item Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquipItemConstraint()
	 * @generated
	 * @ordered
	 */
	protected EquipItemConstraint equipItemConstraint;

	/**
	 * The cached value of the '{@link #getSlotConstraint() <em>Slot Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlotConstraint()
	 * @generated
	 * @ordered
	 */
	protected SlotConstraint slotConstraint;

	/**
	 * The cached value of the '{@link #getStackWeightConstraint() <em>Stack Weight Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStackWeightConstraint()
	 * @generated
	 * @ordered
	 */
	protected StackWeightConstraint stackWeightConstraint;

	/**
	 * The cached value of the '{@link #getAutoCraftConstraint() <em>Auto Craft Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoCraftConstraint()
	 * @generated
	 * @ordered
	 */
	protected AutoCraftConstraint autoCraftConstraint;

	/**
	 * The cached value of the '{@link #getVainConstraint() <em>Vain Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVainConstraint()
	 * @generated
	 * @ordered
	 */
	protected VainConstraint vainConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InventorySystemConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UGSMLPackage.Literals.INVENTORY_SYSTEM_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionConstraint getSelectionConstraint() {
		return selectionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectionConstraint(SelectionConstraint newSelectionConstraint,
			NotificationChain msgs) {
		SelectionConstraint oldSelectionConstraint = selectionConstraint;
		selectionConstraint = newSelectionConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__SELECTION_CONSTRAINT, oldSelectionConstraint,
					newSelectionConstraint);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectionConstraint(SelectionConstraint newSelectionConstraint) {
		if (newSelectionConstraint != selectionConstraint) {
			NotificationChain msgs = null;
			if (selectionConstraint != null)
				msgs = ((InternalEObject) selectionConstraint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__SELECTION_CONSTRAINT, null,
						msgs);
			if (newSelectionConstraint != null)
				msgs = ((InternalEObject) newSelectionConstraint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__SELECTION_CONSTRAINT, null,
						msgs);
			msgs = basicSetSelectionConstraint(newSelectionConstraint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__SELECTION_CONSTRAINT, newSelectionConstraint,
					newSelectionConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquipItemConstraint getEquipItemConstraint() {
		return equipItemConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEquipItemConstraint(EquipItemConstraint newEquipItemConstraint,
			NotificationChain msgs) {
		EquipItemConstraint oldEquipItemConstraint = equipItemConstraint;
		equipItemConstraint = newEquipItemConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__EQUIP_ITEM_CONSTRAINT, oldEquipItemConstraint,
					newEquipItemConstraint);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEquipItemConstraint(EquipItemConstraint newEquipItemConstraint) {
		if (newEquipItemConstraint != equipItemConstraint) {
			NotificationChain msgs = null;
			if (equipItemConstraint != null)
				msgs = ((InternalEObject) equipItemConstraint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__EQUIP_ITEM_CONSTRAINT, null,
						msgs);
			if (newEquipItemConstraint != null)
				msgs = ((InternalEObject) newEquipItemConstraint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__EQUIP_ITEM_CONSTRAINT, null,
						msgs);
			msgs = basicSetEquipItemConstraint(newEquipItemConstraint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__EQUIP_ITEM_CONSTRAINT, newEquipItemConstraint,
					newEquipItemConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlotConstraint getSlotConstraint() {
		return slotConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSlotConstraint(SlotConstraint newSlotConstraint, NotificationChain msgs) {
		SlotConstraint oldSlotConstraint = slotConstraint;
		slotConstraint = newSlotConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__SLOT_CONSTRAINT, oldSlotConstraint, newSlotConstraint);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlotConstraint(SlotConstraint newSlotConstraint) {
		if (newSlotConstraint != slotConstraint) {
			NotificationChain msgs = null;
			if (slotConstraint != null)
				msgs = ((InternalEObject) slotConstraint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__SLOT_CONSTRAINT, null, msgs);
			if (newSlotConstraint != null)
				msgs = ((InternalEObject) newSlotConstraint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__SLOT_CONSTRAINT, null, msgs);
			msgs = basicSetSlotConstraint(newSlotConstraint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__SLOT_CONSTRAINT, newSlotConstraint, newSlotConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StackWeightConstraint getStackWeightConstraint() {
		return stackWeightConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStackWeightConstraint(StackWeightConstraint newStackWeightConstraint,
			NotificationChain msgs) {
		StackWeightConstraint oldStackWeightConstraint = stackWeightConstraint;
		stackWeightConstraint = newStackWeightConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__STACK_WEIGHT_CONSTRAINT, oldStackWeightConstraint,
					newStackWeightConstraint);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStackWeightConstraint(StackWeightConstraint newStackWeightConstraint) {
		if (newStackWeightConstraint != stackWeightConstraint) {
			NotificationChain msgs = null;
			if (stackWeightConstraint != null)
				msgs = ((InternalEObject) stackWeightConstraint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__STACK_WEIGHT_CONSTRAINT,
						null, msgs);
			if (newStackWeightConstraint != null)
				msgs = ((InternalEObject) newStackWeightConstraint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__STACK_WEIGHT_CONSTRAINT,
						null, msgs);
			msgs = basicSetStackWeightConstraint(newStackWeightConstraint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__STACK_WEIGHT_CONSTRAINT, newStackWeightConstraint,
					newStackWeightConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoCraftConstraint getAutoCraftConstraint() {
		return autoCraftConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutoCraftConstraint(AutoCraftConstraint newAutoCraftConstraint,
			NotificationChain msgs) {
		AutoCraftConstraint oldAutoCraftConstraint = autoCraftConstraint;
		autoCraftConstraint = newAutoCraftConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__AUTO_CRAFT_CONSTRAINT, oldAutoCraftConstraint,
					newAutoCraftConstraint);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoCraftConstraint(AutoCraftConstraint newAutoCraftConstraint) {
		if (newAutoCraftConstraint != autoCraftConstraint) {
			NotificationChain msgs = null;
			if (autoCraftConstraint != null)
				msgs = ((InternalEObject) autoCraftConstraint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__AUTO_CRAFT_CONSTRAINT, null,
						msgs);
			if (newAutoCraftConstraint != null)
				msgs = ((InternalEObject) newAutoCraftConstraint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__AUTO_CRAFT_CONSTRAINT, null,
						msgs);
			msgs = basicSetAutoCraftConstraint(newAutoCraftConstraint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__AUTO_CRAFT_CONSTRAINT, newAutoCraftConstraint,
					newAutoCraftConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VainConstraint getVainConstraint() {
		return vainConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVainConstraint(VainConstraint newVainConstraint, NotificationChain msgs) {
		VainConstraint oldVainConstraint = vainConstraint;
		vainConstraint = newVainConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__VAIN_CONSTRAINT, oldVainConstraint, newVainConstraint);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVainConstraint(VainConstraint newVainConstraint) {
		if (newVainConstraint != vainConstraint) {
			NotificationChain msgs = null;
			if (vainConstraint != null)
				msgs = ((InternalEObject) vainConstraint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__VAIN_CONSTRAINT, null, msgs);
			if (newVainConstraint != null)
				msgs = ((InternalEObject) newVainConstraint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__VAIN_CONSTRAINT, null, msgs);
			msgs = basicSetVainConstraint(newVainConstraint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__VAIN_CONSTRAINT, newVainConstraint, newVainConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__SELECTION_CONSTRAINT:
			return basicSetSelectionConstraint(null, msgs);
		case UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__EQUIP_ITEM_CONSTRAINT:
			return basicSetEquipItemConstraint(null, msgs);
		case UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__SLOT_CONSTRAINT:
			return basicSetSlotConstraint(null, msgs);
		case UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__STACK_WEIGHT_CONSTRAINT:
			return basicSetStackWeightConstraint(null, msgs);
		case UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__AUTO_CRAFT_CONSTRAINT:
			return basicSetAutoCraftConstraint(null, msgs);
		case UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__VAIN_CONSTRAINT:
			return basicSetVainConstraint(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__SELECTION_CONSTRAINT:
			return getSelectionConstraint();
		case UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__EQUIP_ITEM_CONSTRAINT:
			return getEquipItemConstraint();
		case UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__SLOT_CONSTRAINT:
			return getSlotConstraint();
		case UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__STACK_WEIGHT_CONSTRAINT:
			return getStackWeightConstraint();
		case UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__AUTO_CRAFT_CONSTRAINT:
			return getAutoCraftConstraint();
		case UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__VAIN_CONSTRAINT:
			return getVainConstraint();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__SELECTION_CONSTRAINT:
			setSelectionConstraint((SelectionConstraint) newValue);
			return;
		case UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__EQUIP_ITEM_CONSTRAINT:
			setEquipItemConstraint((EquipItemConstraint) newValue);
			return;
		case UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__SLOT_CONSTRAINT:
			setSlotConstraint((SlotConstraint) newValue);
			return;
		case UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__STACK_WEIGHT_CONSTRAINT:
			setStackWeightConstraint((StackWeightConstraint) newValue);
			return;
		case UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__AUTO_CRAFT_CONSTRAINT:
			setAutoCraftConstraint((AutoCraftConstraint) newValue);
			return;
		case UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__VAIN_CONSTRAINT:
			setVainConstraint((VainConstraint) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__SELECTION_CONSTRAINT:
			setSelectionConstraint((SelectionConstraint) null);
			return;
		case UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__EQUIP_ITEM_CONSTRAINT:
			setEquipItemConstraint((EquipItemConstraint) null);
			return;
		case UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__SLOT_CONSTRAINT:
			setSlotConstraint((SlotConstraint) null);
			return;
		case UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__STACK_WEIGHT_CONSTRAINT:
			setStackWeightConstraint((StackWeightConstraint) null);
			return;
		case UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__AUTO_CRAFT_CONSTRAINT:
			setAutoCraftConstraint((AutoCraftConstraint) null);
			return;
		case UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__VAIN_CONSTRAINT:
			setVainConstraint((VainConstraint) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__SELECTION_CONSTRAINT:
			return selectionConstraint != null;
		case UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__EQUIP_ITEM_CONSTRAINT:
			return equipItemConstraint != null;
		case UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__SLOT_CONSTRAINT:
			return slotConstraint != null;
		case UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__STACK_WEIGHT_CONSTRAINT:
			return stackWeightConstraint != null;
		case UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__AUTO_CRAFT_CONSTRAINT:
			return autoCraftConstraint != null;
		case UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT__VAIN_CONSTRAINT:
			return vainConstraint != null;
		}
		return super.eIsSet(featureID);
	}

} //InventorySystemConstraintImpl
