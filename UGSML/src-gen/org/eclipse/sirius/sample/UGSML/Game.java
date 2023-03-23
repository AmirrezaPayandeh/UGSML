/**
 */
package org.eclipse.sirius.sample.UGSML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.Game#getGameTitle <em>Game Title</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.Game#getGameFeatureContainers <em>Game Feature Containers</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.Game#getGameSystems <em>Game Systems</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.Game#getGameVersionName <em>Game Version Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.Game#getGameVersionNumber <em>Game Version Number</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getGame()
 * @model
 * @generated
 */
public interface Game extends EObject {
	/**
	 * Returns the value of the '<em><b>Game Title</b></em>' attribute.
	 * The default value is <code>"Game Title"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game Title</em>' attribute.
	 * @see #setGameTitle(String)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getGame_GameTitle()
	 * @model default="Game Title" required="true"
	 * @generated
	 */
	String getGameTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.Game#getGameTitle <em>Game Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Game Title</em>' attribute.
	 * @see #getGameTitle()
	 * @generated
	 */
	void setGameTitle(String value);

	/**
	 * Returns the value of the '<em><b>Game Feature Containers</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.UGSML.GameFeatureContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game Feature Containers</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getGame_GameFeatureContainers()
	 * @model containment="true"
	 * @generated
	 */
	EList<GameFeatureContainer> getGameFeatureContainers();

	/**
	 * Returns the value of the '<em><b>Game Systems</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.UGSML.GameSystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game Systems</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getGame_GameSystems()
	 * @model containment="true"
	 * @generated
	 */
	EList<GameSystem> getGameSystems();

	/**
	 * Returns the value of the '<em><b>Game Version Name</b></em>' attribute.
	 * The default value is <code>"V1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game Version Name</em>' attribute.
	 * @see #setGameVersionName(String)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getGame_GameVersionName()
	 * @model default="V1" required="true"
	 * @generated
	 */
	String getGameVersionName();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.Game#getGameVersionName <em>Game Version Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Game Version Name</em>' attribute.
	 * @see #getGameVersionName()
	 * @generated
	 */
	void setGameVersionName(String value);

	/**
	 * Returns the value of the '<em><b>Game Version Number</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game Version Number</em>' attribute.
	 * @see #setGameVersionNumber(float)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getGame_GameVersionNumber()
	 * @model default="1.0" required="true"
	 * @generated
	 */
	float getGameVersionNumber();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.Game#getGameVersionNumber <em>Game Version Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Game Version Number</em>' attribute.
	 * @see #getGameVersionNumber()
	 * @generated
	 */
	void setGameVersionNumber(float value);

} // Game
