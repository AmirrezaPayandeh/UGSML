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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.sirius.sample.UGSML.GameAttribute;
import org.eclipse.sirius.sample.UGSML.GameItem;
import org.eclipse.sirius.sample.UGSML.InventorySystem;
import org.eclipse.sirius.sample.UGSML.ItemMode;
import org.eclipse.sirius.sample.UGSML.UGSMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.GameItemImpl#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.GameItemImpl#getItemAttributeInstances <em>Item Attribute Instances</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.GameItemImpl#getItemModes <em>Item Modes</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.GameItemImpl#getDerivedItems <em>Derived Items</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.GameItemImpl#getParentItem <em>Parent Item</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.GameItemImpl#getPlacableInventories <em>Placable Inventories</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.GameItemImpl#isIsAbstract <em>Is Abstract</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameItemImpl extends MinimalEObjectImpl.Container implements GameItem {
	/**
	 * The default value of the '{@link #getFeatureName() <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureName()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_NAME_EDEFAULT = "FeatureName";

	/**
	 * The cached value of the '{@link #getFeatureName() <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureName()
	 * @generated
	 * @ordered
	 */
	protected String featureName = FEATURE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getItemAttributeInstances() <em>Item Attribute Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemAttributeInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<GameAttribute> itemAttributeInstances;

	/**
	 * The cached value of the '{@link #getItemModes() <em>Item Modes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemModes()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemMode> itemModes;

	/**
	 * The cached value of the '{@link #getDerivedItems() <em>Derived Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedItems()
	 * @generated
	 * @ordered
	 */
	protected EList<GameItem> derivedItems;

	/**
	 * The cached value of the '{@link #getPlacableInventories() <em>Placable Inventories</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacableInventories()
	 * @generated
	 * @ordered
	 */
	protected InventorySystem placableInventories;

	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UGSMLPackage.Literals.GAME_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeatureName() {
		return featureName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureName(String newFeatureName) {
		String oldFeatureName = featureName;
		featureName = newFeatureName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UGSMLPackage.GAME_ITEM__FEATURE_NAME, oldFeatureName,
					featureName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GameAttribute> getItemAttributeInstances() {
		if (itemAttributeInstances == null) {
			itemAttributeInstances = new EObjectResolvingEList<GameAttribute>(GameAttribute.class, this,
					UGSMLPackage.GAME_ITEM__ITEM_ATTRIBUTE_INSTANCES);
		}
		return itemAttributeInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemMode> getItemModes() {
		if (itemModes == null) {
			itemModes = new EObjectContainmentEList<ItemMode>(ItemMode.class, this, UGSMLPackage.GAME_ITEM__ITEM_MODES);
		}
		return itemModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GameItem> getDerivedItems() {
		if (derivedItems == null) {
			derivedItems = new EObjectContainmentWithInverseEList<GameItem>(GameItem.class, this,
					UGSMLPackage.GAME_ITEM__DERIVED_ITEMS, UGSMLPackage.GAME_ITEM__PARENT_ITEM);
		}
		return derivedItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameItem getParentItem() {
		if (eContainerFeatureID() != UGSMLPackage.GAME_ITEM__PARENT_ITEM)
			return null;
		return (GameItem) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentItem(GameItem newParentItem, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newParentItem, UGSMLPackage.GAME_ITEM__PARENT_ITEM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentItem(GameItem newParentItem) {
		if (newParentItem != eInternalContainer()
				|| (eContainerFeatureID() != UGSMLPackage.GAME_ITEM__PARENT_ITEM && newParentItem != null)) {
			if (EcoreUtil.isAncestor(this, newParentItem))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentItem != null)
				msgs = ((InternalEObject) newParentItem).eInverseAdd(this, UGSMLPackage.GAME_ITEM__DERIVED_ITEMS,
						GameItem.class, msgs);
			msgs = basicSetParentItem(newParentItem, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UGSMLPackage.GAME_ITEM__PARENT_ITEM, newParentItem,
					newParentItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventorySystem getPlacableInventories() {
		if (placableInventories != null && placableInventories.eIsProxy()) {
			InternalEObject oldPlacableInventories = (InternalEObject) placableInventories;
			placableInventories = (InventorySystem) eResolveProxy(oldPlacableInventories);
			if (placableInventories != oldPlacableInventories) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UGSMLPackage.GAME_ITEM__PLACABLE_INVENTORIES, oldPlacableInventories, placableInventories));
			}
		}
		return placableInventories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventorySystem basicGetPlacableInventories() {
		return placableInventories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlacableInventories(InventorySystem newPlacableInventories,
			NotificationChain msgs) {
		InventorySystem oldPlacableInventories = placableInventories;
		placableInventories = newPlacableInventories;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.GAME_ITEM__PLACABLE_INVENTORIES, oldPlacableInventories, newPlacableInventories);
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
	public void setPlacableInventories(InventorySystem newPlacableInventories) {
		if (newPlacableInventories != placableInventories) {
			NotificationChain msgs = null;
			if (placableInventories != null)
				msgs = ((InternalEObject) placableInventories).eInverseRemove(this,
						UGSMLPackage.INVENTORY_SYSTEM__SYSTEM_ITEMS, InventorySystem.class, msgs);
			if (newPlacableInventories != null)
				msgs = ((InternalEObject) newPlacableInventories).eInverseAdd(this,
						UGSMLPackage.INVENTORY_SYSTEM__SYSTEM_ITEMS, InventorySystem.class, msgs);
			msgs = basicSetPlacableInventories(newPlacableInventories, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UGSMLPackage.GAME_ITEM__PLACABLE_INVENTORIES,
					newPlacableInventories, newPlacableInventories));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UGSMLPackage.GAME_ITEM__IS_ABSTRACT, oldIsAbstract,
					isAbstract));
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
		case UGSMLPackage.GAME_ITEM__DERIVED_ITEMS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDerivedItems()).basicAdd(otherEnd, msgs);
		case UGSMLPackage.GAME_ITEM__PARENT_ITEM:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetParentItem((GameItem) otherEnd, msgs);
		case UGSMLPackage.GAME_ITEM__PLACABLE_INVENTORIES:
			if (placableInventories != null)
				msgs = ((InternalEObject) placableInventories).eInverseRemove(this,
						UGSMLPackage.INVENTORY_SYSTEM__SYSTEM_ITEMS, InventorySystem.class, msgs);
			return basicSetPlacableInventories((InventorySystem) otherEnd, msgs);
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
		case UGSMLPackage.GAME_ITEM__ITEM_MODES:
			return ((InternalEList<?>) getItemModes()).basicRemove(otherEnd, msgs);
		case UGSMLPackage.GAME_ITEM__DERIVED_ITEMS:
			return ((InternalEList<?>) getDerivedItems()).basicRemove(otherEnd, msgs);
		case UGSMLPackage.GAME_ITEM__PARENT_ITEM:
			return basicSetParentItem(null, msgs);
		case UGSMLPackage.GAME_ITEM__PLACABLE_INVENTORIES:
			return basicSetPlacableInventories(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case UGSMLPackage.GAME_ITEM__PARENT_ITEM:
			return eInternalContainer().eInverseRemove(this, UGSMLPackage.GAME_ITEM__DERIVED_ITEMS, GameItem.class,
					msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UGSMLPackage.GAME_ITEM__FEATURE_NAME:
			return getFeatureName();
		case UGSMLPackage.GAME_ITEM__ITEM_ATTRIBUTE_INSTANCES:
			return getItemAttributeInstances();
		case UGSMLPackage.GAME_ITEM__ITEM_MODES:
			return getItemModes();
		case UGSMLPackage.GAME_ITEM__DERIVED_ITEMS:
			return getDerivedItems();
		case UGSMLPackage.GAME_ITEM__PARENT_ITEM:
			return getParentItem();
		case UGSMLPackage.GAME_ITEM__PLACABLE_INVENTORIES:
			if (resolve)
				return getPlacableInventories();
			return basicGetPlacableInventories();
		case UGSMLPackage.GAME_ITEM__IS_ABSTRACT:
			return isIsAbstract();
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
		case UGSMLPackage.GAME_ITEM__FEATURE_NAME:
			setFeatureName((String) newValue);
			return;
		case UGSMLPackage.GAME_ITEM__ITEM_ATTRIBUTE_INSTANCES:
			getItemAttributeInstances().clear();
			getItemAttributeInstances().addAll((Collection<? extends GameAttribute>) newValue);
			return;
		case UGSMLPackage.GAME_ITEM__ITEM_MODES:
			getItemModes().clear();
			getItemModes().addAll((Collection<? extends ItemMode>) newValue);
			return;
		case UGSMLPackage.GAME_ITEM__DERIVED_ITEMS:
			getDerivedItems().clear();
			getDerivedItems().addAll((Collection<? extends GameItem>) newValue);
			return;
		case UGSMLPackage.GAME_ITEM__PARENT_ITEM:
			setParentItem((GameItem) newValue);
			return;
		case UGSMLPackage.GAME_ITEM__PLACABLE_INVENTORIES:
			setPlacableInventories((InventorySystem) newValue);
			return;
		case UGSMLPackage.GAME_ITEM__IS_ABSTRACT:
			setIsAbstract((Boolean) newValue);
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
		case UGSMLPackage.GAME_ITEM__FEATURE_NAME:
			setFeatureName(FEATURE_NAME_EDEFAULT);
			return;
		case UGSMLPackage.GAME_ITEM__ITEM_ATTRIBUTE_INSTANCES:
			getItemAttributeInstances().clear();
			return;
		case UGSMLPackage.GAME_ITEM__ITEM_MODES:
			getItemModes().clear();
			return;
		case UGSMLPackage.GAME_ITEM__DERIVED_ITEMS:
			getDerivedItems().clear();
			return;
		case UGSMLPackage.GAME_ITEM__PARENT_ITEM:
			setParentItem((GameItem) null);
			return;
		case UGSMLPackage.GAME_ITEM__PLACABLE_INVENTORIES:
			setPlacableInventories((InventorySystem) null);
			return;
		case UGSMLPackage.GAME_ITEM__IS_ABSTRACT:
			setIsAbstract(IS_ABSTRACT_EDEFAULT);
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
		case UGSMLPackage.GAME_ITEM__FEATURE_NAME:
			return FEATURE_NAME_EDEFAULT == null ? featureName != null : !FEATURE_NAME_EDEFAULT.equals(featureName);
		case UGSMLPackage.GAME_ITEM__ITEM_ATTRIBUTE_INSTANCES:
			return itemAttributeInstances != null && !itemAttributeInstances.isEmpty();
		case UGSMLPackage.GAME_ITEM__ITEM_MODES:
			return itemModes != null && !itemModes.isEmpty();
		case UGSMLPackage.GAME_ITEM__DERIVED_ITEMS:
			return derivedItems != null && !derivedItems.isEmpty();
		case UGSMLPackage.GAME_ITEM__PARENT_ITEM:
			return getParentItem() != null;
		case UGSMLPackage.GAME_ITEM__PLACABLE_INVENTORIES:
			return placableInventories != null;
		case UGSMLPackage.GAME_ITEM__IS_ABSTRACT:
			return isAbstract != IS_ABSTRACT_EDEFAULT;
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
		result.append(" (FeatureName: ");
		result.append(featureName);
		result.append(", IsAbstract: ");
		result.append(isAbstract);
		result.append(')');
		return result.toString();
	}

} //GameItemImpl
