/**
 */
package org.eclipse.sirius.sample.UGSML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Feature Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.GameFeatureContainer#getFeatureCategory <em>Feature Category</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getGameFeatureContainer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface GameFeatureContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature Category</b></em>' attribute.
	 * The default value is <code>"Category Name"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Category</em>' attribute.
	 * @see #setFeatureCategory(String)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getGameFeatureContainer_FeatureCategory()
	 * @model default="Category Name" required="true"
	 * @generated
	 */
	String getFeatureCategory();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.GameFeatureContainer#getFeatureCategory <em>Feature Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Category</em>' attribute.
	 * @see #getFeatureCategory()
	 * @generated
	 */
	void setFeatureCategory(String value);

} // GameFeatureContainer
