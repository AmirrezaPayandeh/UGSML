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

import org.eclipse.sirius.sample.UGSML.Game;
import org.eclipse.sirius.sample.UGSML.GameFeatureContainer;
import org.eclipse.sirius.sample.UGSML.GameSystem;
import org.eclipse.sirius.sample.UGSML.UGSMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.GameImpl#getGameTitle <em>Game Title</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.GameImpl#getGameFeatureContainers <em>Game Feature Containers</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.GameImpl#getGameSystems <em>Game Systems</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.GameImpl#getGameVersionName <em>Game Version Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.GameImpl#getGameVersionNumber <em>Game Version Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameImpl extends MinimalEObjectImpl.Container implements Game {
	/**
	 * The default value of the '{@link #getGameTitle() <em>Game Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String GAME_TITLE_EDEFAULT = "Game Title";

	/**
	 * The cached value of the '{@link #getGameTitle() <em>Game Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameTitle()
	 * @generated
	 * @ordered
	 */
	protected String gameTitle = GAME_TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGameFeatureContainers() <em>Game Feature Containers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameFeatureContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<GameFeatureContainer> gameFeatureContainers;

	/**
	 * The cached value of the '{@link #getGameSystems() <em>Game Systems</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameSystems()
	 * @generated
	 * @ordered
	 */
	protected EList<GameSystem> gameSystems;

	/**
	 * The default value of the '{@link #getGameVersionName() <em>Game Version Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameVersionName()
	 * @generated
	 * @ordered
	 */
	protected static final String GAME_VERSION_NAME_EDEFAULT = "V1";

	/**
	 * The cached value of the '{@link #getGameVersionName() <em>Game Version Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameVersionName()
	 * @generated
	 * @ordered
	 */
	protected String gameVersionName = GAME_VERSION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getGameVersionNumber() <em>Game Version Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameVersionNumber()
	 * @generated
	 * @ordered
	 */
	protected static final float GAME_VERSION_NUMBER_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getGameVersionNumber() <em>Game Version Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameVersionNumber()
	 * @generated
	 * @ordered
	 */
	protected float gameVersionNumber = GAME_VERSION_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UGSMLPackage.Literals.GAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGameTitle() {
		return gameTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGameTitle(String newGameTitle) {
		String oldGameTitle = gameTitle;
		gameTitle = newGameTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UGSMLPackage.GAME__GAME_TITLE, oldGameTitle,
					gameTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GameFeatureContainer> getGameFeatureContainers() {
		if (gameFeatureContainers == null) {
			gameFeatureContainers = new EObjectContainmentEList<GameFeatureContainer>(GameFeatureContainer.class, this,
					UGSMLPackage.GAME__GAME_FEATURE_CONTAINERS);
		}
		return gameFeatureContainers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GameSystem> getGameSystems() {
		if (gameSystems == null) {
			gameSystems = new EObjectContainmentEList<GameSystem>(GameSystem.class, this,
					UGSMLPackage.GAME__GAME_SYSTEMS);
		}
		return gameSystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGameVersionName() {
		return gameVersionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGameVersionName(String newGameVersionName) {
		String oldGameVersionName = gameVersionName;
		gameVersionName = newGameVersionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UGSMLPackage.GAME__GAME_VERSION_NAME,
					oldGameVersionName, gameVersionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getGameVersionNumber() {
		return gameVersionNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGameVersionNumber(float newGameVersionNumber) {
		float oldGameVersionNumber = gameVersionNumber;
		gameVersionNumber = newGameVersionNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UGSMLPackage.GAME__GAME_VERSION_NUMBER,
					oldGameVersionNumber, gameVersionNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UGSMLPackage.GAME__GAME_FEATURE_CONTAINERS:
			return ((InternalEList<?>) getGameFeatureContainers()).basicRemove(otherEnd, msgs);
		case UGSMLPackage.GAME__GAME_SYSTEMS:
			return ((InternalEList<?>) getGameSystems()).basicRemove(otherEnd, msgs);
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
		case UGSMLPackage.GAME__GAME_TITLE:
			return getGameTitle();
		case UGSMLPackage.GAME__GAME_FEATURE_CONTAINERS:
			return getGameFeatureContainers();
		case UGSMLPackage.GAME__GAME_SYSTEMS:
			return getGameSystems();
		case UGSMLPackage.GAME__GAME_VERSION_NAME:
			return getGameVersionName();
		case UGSMLPackage.GAME__GAME_VERSION_NUMBER:
			return getGameVersionNumber();
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
		case UGSMLPackage.GAME__GAME_TITLE:
			setGameTitle((String) newValue);
			return;
		case UGSMLPackage.GAME__GAME_FEATURE_CONTAINERS:
			getGameFeatureContainers().clear();
			getGameFeatureContainers().addAll((Collection<? extends GameFeatureContainer>) newValue);
			return;
		case UGSMLPackage.GAME__GAME_SYSTEMS:
			getGameSystems().clear();
			getGameSystems().addAll((Collection<? extends GameSystem>) newValue);
			return;
		case UGSMLPackage.GAME__GAME_VERSION_NAME:
			setGameVersionName((String) newValue);
			return;
		case UGSMLPackage.GAME__GAME_VERSION_NUMBER:
			setGameVersionNumber((Float) newValue);
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
		case UGSMLPackage.GAME__GAME_TITLE:
			setGameTitle(GAME_TITLE_EDEFAULT);
			return;
		case UGSMLPackage.GAME__GAME_FEATURE_CONTAINERS:
			getGameFeatureContainers().clear();
			return;
		case UGSMLPackage.GAME__GAME_SYSTEMS:
			getGameSystems().clear();
			return;
		case UGSMLPackage.GAME__GAME_VERSION_NAME:
			setGameVersionName(GAME_VERSION_NAME_EDEFAULT);
			return;
		case UGSMLPackage.GAME__GAME_VERSION_NUMBER:
			setGameVersionNumber(GAME_VERSION_NUMBER_EDEFAULT);
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
		case UGSMLPackage.GAME__GAME_TITLE:
			return GAME_TITLE_EDEFAULT == null ? gameTitle != null : !GAME_TITLE_EDEFAULT.equals(gameTitle);
		case UGSMLPackage.GAME__GAME_FEATURE_CONTAINERS:
			return gameFeatureContainers != null && !gameFeatureContainers.isEmpty();
		case UGSMLPackage.GAME__GAME_SYSTEMS:
			return gameSystems != null && !gameSystems.isEmpty();
		case UGSMLPackage.GAME__GAME_VERSION_NAME:
			return GAME_VERSION_NAME_EDEFAULT == null ? gameVersionName != null
					: !GAME_VERSION_NAME_EDEFAULT.equals(gameVersionName);
		case UGSMLPackage.GAME__GAME_VERSION_NUMBER:
			return gameVersionNumber != GAME_VERSION_NUMBER_EDEFAULT;
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
		result.append(" (GameTitle: ");
		result.append(gameTitle);
		result.append(", GameVersionName: ");
		result.append(gameVersionName);
		result.append(", GameVersionNumber: ");
		result.append(gameVersionNumber);
		result.append(')');
		return result.toString();
	}

} //GameImpl
