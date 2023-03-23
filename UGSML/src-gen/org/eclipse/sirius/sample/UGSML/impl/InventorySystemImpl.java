/**
 */
package org.eclipse.sirius.sample.UGSML.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.sirius.sample.UGSML.GameItem;
import org.eclipse.sirius.sample.UGSML.InventorySystem;
import org.eclipse.sirius.sample.UGSML.InventorySystemConstraint;
import org.eclipse.sirius.sample.UGSML.UGSMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inventory System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.InventorySystemImpl#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.InventorySystemImpl#getInventoryConstraints <em>Inventory Constraints</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.InventorySystemImpl#getSystemItems <em>System Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InventorySystemImpl extends MinimalEObjectImpl.Container implements InventorySystem {
	/**
	 * The default value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_NAME_EDEFAULT = "SystemName";

	/**
	 * The cached value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected String systemName = SYSTEM_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInventoryConstraints() <em>Inventory Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryConstraints()
	 * @generated
	 * @ordered
	 */
	protected InventorySystemConstraint inventoryConstraints;

	/**
	 * The cached value of the '{@link #getSystemItems() <em>System Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemItems()
	 * @generated
	 * @ordered
	 */
	protected EList<GameItem> systemItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InventorySystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UGSMLPackage.Literals.INVENTORY_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSystemName() {
		return systemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemName(String newSystemName) {
		String oldSystemName = systemName;
		systemName = newSystemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UGSMLPackage.INVENTORY_SYSTEM__SYSTEM_NAME,
					oldSystemName, systemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventorySystemConstraint getInventoryConstraints() {
		return inventoryConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInventoryConstraints(InventorySystemConstraint newInventoryConstraints,
			NotificationChain msgs) {
		InventorySystemConstraint oldInventoryConstraints = inventoryConstraints;
		inventoryConstraints = newInventoryConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.INVENTORY_SYSTEM__INVENTORY_CONSTRAINTS, oldInventoryConstraints,
					newInventoryConstraints);
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
	public void setInventoryConstraints(InventorySystemConstraint newInventoryConstraints) {
		if (newInventoryConstraints != inventoryConstraints) {
			NotificationChain msgs = null;
			if (inventoryConstraints != null)
				msgs = ((InternalEObject) inventoryConstraints).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UGSMLPackage.INVENTORY_SYSTEM__INVENTORY_CONSTRAINTS, null, msgs);
			if (newInventoryConstraints != null)
				msgs = ((InternalEObject) newInventoryConstraints).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UGSMLPackage.INVENTORY_SYSTEM__INVENTORY_CONSTRAINTS, null, msgs);
			msgs = basicSetInventoryConstraints(newInventoryConstraints, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UGSMLPackage.INVENTORY_SYSTEM__INVENTORY_CONSTRAINTS,
					newInventoryConstraints, newInventoryConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GameItem> getSystemItems() {
		if (systemItems == null) {
			systemItems = new EObjectWithInverseResolvingEList<GameItem>(GameItem.class, this,
					UGSMLPackage.INVENTORY_SYSTEM__SYSTEM_ITEMS, UGSMLPackage.GAME_ITEM__PLACABLE_INVENTORIES);
		}
		return systemItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UGSMLPackage.INVENTORY_SYSTEM__SYSTEM_ITEMS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSystemItems()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UGSMLPackage.INVENTORY_SYSTEM__INVENTORY_CONSTRAINTS:
			return basicSetInventoryConstraints(null, msgs);
		case UGSMLPackage.INVENTORY_SYSTEM__SYSTEM_ITEMS:
			return ((InternalEList<?>) getSystemItems()).basicRemove(otherEnd, msgs);
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
		case UGSMLPackage.INVENTORY_SYSTEM__SYSTEM_NAME:
			return getSystemName();
		case UGSMLPackage.INVENTORY_SYSTEM__INVENTORY_CONSTRAINTS:
			return getInventoryConstraints();
		case UGSMLPackage.INVENTORY_SYSTEM__SYSTEM_ITEMS:
			return getSystemItems();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case UGSMLPackage.INVENTORY_SYSTEM__SYSTEM_NAME:
			setSystemName((String) newValue);
			return;
		case UGSMLPackage.INVENTORY_SYSTEM__INVENTORY_CONSTRAINTS:
			setInventoryConstraints((InventorySystemConstraint) newValue);
			return;
		case UGSMLPackage.INVENTORY_SYSTEM__SYSTEM_ITEMS:
			getSystemItems().clear();
			getSystemItems().addAll((Collection<? extends GameItem>) newValue);
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
		case UGSMLPackage.INVENTORY_SYSTEM__SYSTEM_NAME:
			setSystemName(SYSTEM_NAME_EDEFAULT);
			return;
		case UGSMLPackage.INVENTORY_SYSTEM__INVENTORY_CONSTRAINTS:
			setInventoryConstraints((InventorySystemConstraint) null);
			return;
		case UGSMLPackage.INVENTORY_SYSTEM__SYSTEM_ITEMS:
			getSystemItems().clear();
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
		case UGSMLPackage.INVENTORY_SYSTEM__SYSTEM_NAME:
			return SYSTEM_NAME_EDEFAULT == null ? systemName != null : !SYSTEM_NAME_EDEFAULT.equals(systemName);
		case UGSMLPackage.INVENTORY_SYSTEM__INVENTORY_CONSTRAINTS:
			return inventoryConstraints != null;
		case UGSMLPackage.INVENTORY_SYSTEM__SYSTEM_ITEMS:
			return systemItems != null && !systemItems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (SystemName: ");
		result.append(systemName);
		result.append(')');
		return result.toString();
	}

} //InventorySystemImpl
