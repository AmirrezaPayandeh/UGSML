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

import org.eclipse.sirius.sample.UGSML.GameAttribute;
import org.eclipse.sirius.sample.UGSML.GameAttributeContainer;
import org.eclipse.sirius.sample.UGSML.UGSMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game Attribute Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.GameAttributeContainerImpl#getFeatureCategory <em>Feature Category</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.GameAttributeContainerImpl#getGameAttributes <em>Game Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameAttributeContainerImpl extends MinimalEObjectImpl.Container implements GameAttributeContainer {
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
	 * The cached value of the '{@link #getGameAttributes() <em>Game Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<GameAttribute> gameAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameAttributeContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UGSMLPackage.Literals.GAME_ATTRIBUTE_CONTAINER;
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.GAME_ATTRIBUTE_CONTAINER__FEATURE_CATEGORY, oldFeatureCategory, featureCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GameAttribute> getGameAttributes() {
		if (gameAttributes == null) {
			gameAttributes = new EObjectContainmentEList<GameAttribute>(GameAttribute.class, this,
					UGSMLPackage.GAME_ATTRIBUTE_CONTAINER__GAME_ATTRIBUTES);
		}
		return gameAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UGSMLPackage.GAME_ATTRIBUTE_CONTAINER__GAME_ATTRIBUTES:
			return ((InternalEList<?>) getGameAttributes()).basicRemove(otherEnd, msgs);
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
		case UGSMLPackage.GAME_ATTRIBUTE_CONTAINER__FEATURE_CATEGORY:
			return getFeatureCategory();
		case UGSMLPackage.GAME_ATTRIBUTE_CONTAINER__GAME_ATTRIBUTES:
			return getGameAttributes();
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
		case UGSMLPackage.GAME_ATTRIBUTE_CONTAINER__FEATURE_CATEGORY:
			setFeatureCategory((String) newValue);
			return;
		case UGSMLPackage.GAME_ATTRIBUTE_CONTAINER__GAME_ATTRIBUTES:
			getGameAttributes().clear();
			getGameAttributes().addAll((Collection<? extends GameAttribute>) newValue);
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
		case UGSMLPackage.GAME_ATTRIBUTE_CONTAINER__FEATURE_CATEGORY:
			setFeatureCategory(FEATURE_CATEGORY_EDEFAULT);
			return;
		case UGSMLPackage.GAME_ATTRIBUTE_CONTAINER__GAME_ATTRIBUTES:
			getGameAttributes().clear();
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
		case UGSMLPackage.GAME_ATTRIBUTE_CONTAINER__FEATURE_CATEGORY:
			return FEATURE_CATEGORY_EDEFAULT == null ? featureCategory != null
					: !FEATURE_CATEGORY_EDEFAULT.equals(featureCategory);
		case UGSMLPackage.GAME_ATTRIBUTE_CONTAINER__GAME_ATTRIBUTES:
			return gameAttributes != null && !gameAttributes.isEmpty();
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

} //GameAttributeContainerImpl
