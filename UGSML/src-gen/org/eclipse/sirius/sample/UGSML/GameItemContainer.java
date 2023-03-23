/**
 */
package org.eclipse.sirius.sample.UGSML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Item Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.GameItemContainer#getGameItems <em>Game Items</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getGameItemContainer()
 * @model
 * @generated
 */
public interface GameItemContainer extends GameFeatureContainer {
	/**
	 * Returns the value of the '<em><b>Game Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.UGSML.GameItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game Items</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getGameItemContainer_GameItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<GameItem> getGameItems();

} // GameItemContainer
