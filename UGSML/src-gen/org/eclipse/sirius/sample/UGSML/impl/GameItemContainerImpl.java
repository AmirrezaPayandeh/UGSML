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
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.sirius.sample.UGSML.GameItem;
import org.eclipse.sirius.sample.UGSML.GameItemContainer;
import org.eclipse.sirius.sample.UGSML.UGSMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game Item Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.GameItemContainerImpl#getFeatureCategory <em>Feature Category</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.GameItemContainerImpl#getGameItems <em>Game Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameItemContainerImpl extends MinimalEObjectImpl.Container implements GameItemContainer {
	/**
	 * The default value of the '{@link #getFeatureCategory() <em>Feature Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_CATEGORY_EDEFAULT = "Category Name";

	/**
	 * The cached value of the '{@link #getFeatureCategory() <em>Feature Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureCategory()
	 * @generated
	 * @ordered
	 */
	protected String featureCategory = FEATURE_CATEGORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGameItems() <em>Game Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameItems()
	 * @generated
	 * @ordered
	 */
	protected EList<GameItem> gameItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameItemContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UGSMLPackage.Literals.GAME_ITEM_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeatureCategory() {
		return featureCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureCategory(String newFeatureCategory) {
		String oldFeatureCategory = featureCategory;
		featureCategory = newFeatureCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UGSMLPackage.GAME_ITEM_CONTAINER__FEATURE_CATEGORY,
					oldFeatureCategory, featureCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GameItem> getGameItems() {
		if (gameItems == null) {
			gameItems = new EObjectContainmentEList<GameItem>(GameItem.class, this,
					UGSMLPackage.GAME_ITEM_CONTAINER__GAME_ITEMS);
		}
		return gameItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UGSMLPackage.GAME_ITEM_CONTAINER__GAME_ITEMS:
			return ((InternalEList<?>) getGameItems()).basicRemove(otherEnd, msgs);
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
		case UGSMLPackage.GAME_ITEM_CONTAINER__FEATURE_CATEGORY:
			return getFeatureCategory();
		case UGSMLPackage.GAME_ITEM_CONTAINER__GAME_ITEMS:
			return getGameItems();
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
		case UGSMLPackage.GAME_ITEM_CONTAINER__FEATURE_CATEGORY:
			setFeatureCategory((String) newValue);
			return;
		case UGSMLPackage.GAME_ITEM_CONTAINER__GAME_ITEMS:
			getGameItems().clear();
			getGameItems().addAll((Collection<? extends GameItem>) newValue);
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
		case UGSMLPackage.GAME_ITEM_CONTAINER__FEATURE_CATEGORY:
			setFeatureCategory(FEATURE_CATEGORY_EDEFAULT);
			return;
		case UGSMLPackage.GAME_ITEM_CONTAINER__GAME_ITEMS:
			getGameItems().clear();
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
		case UGSMLPackage.GAME_ITEM_CONTAINER__FEATURE_CATEGORY:
			return FEATURE_CATEGORY_EDEFAULT == null ? featureCategory != null
					: !FEATURE_CATEGORY_EDEFAULT.equals(featureCategory);
		case UGSMLPackage.GAME_ITEM_CONTAINER__GAME_ITEMS:
			return gameItems != null && !gameItems.isEmpty();
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
		result.append(" (FeatureCategory: ");
		result.append(featureCategory);
		result.append(')');
		return result.toString();
	}

} //GameItemContainerImpl
