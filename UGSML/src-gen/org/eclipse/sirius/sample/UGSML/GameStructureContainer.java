/**
 */
package org.eclipse.sirius.sample.UGSML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Structure Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.GameStructureContainer#getGameStructures <em>Game Structures</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getGameStructureContainer()
 * @model
 * @generated
 */
public interface GameStructureContainer extends GameFeatureContainer {
	/**
	 * Returns the value of the '<em><b>Game Structures</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.UGSML.GameStructure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game Structures</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getGameStructureContainer_GameStructures()
	 * @model containment="true"
	 * @generated
	 */
	EList<GameStructure> getGameStructures();

} // GameStructureContainer
