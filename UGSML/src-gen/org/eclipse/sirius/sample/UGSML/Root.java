/**
 */
package org.eclipse.sirius.sample.UGSML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.Root#getGame <em>Game</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Game</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game</em>' containment reference.
	 * @see #setGame(Game)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getRoot_Game()
	 * @model containment="true"
	 * @generated
	 */
	Game getGame();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.Root#getGame <em>Game</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Game</em>' containment reference.
	 * @see #getGame()
	 * @generated
	 */
	void setGame(Game value);

} // Root
