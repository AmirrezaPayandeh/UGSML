/**
 */
package org.eclipse.sirius.sample.UGSML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Attribute Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.GameAttributeContainer#getGameAttributes <em>Game Attributes</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getGameAttributeContainer()
 * @model
 * @generated
 */
public interface GameAttributeContainer extends GameFeatureContainer {
	/**
	 * Returns the value of the '<em><b>Game Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.UGSML.GameAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game Attributes</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getGameAttributeContainer_GameAttributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<GameAttribute> getGameAttributes();

} // GameAttributeContainer
