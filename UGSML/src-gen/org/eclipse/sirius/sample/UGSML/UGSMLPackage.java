/**
 */
package org.eclipse.sirius.sample.UGSML;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.sirius.sample.UGSML.UGSMLFactory
 * @model kind="package"
 * @generated
 */
public interface UGSMLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "UGSML";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/UGSML";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "UGSML";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UGSMLPackage eINSTANCE = org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.RootImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 0;

	/**
	 * The feature id for the '<em><b>Game</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__GAME = 0;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.GameImpl <em>Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.GameImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getGame()
	 * @generated
	 */
	int GAME = 1;

	/**
	 * The feature id for the '<em><b>Game Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__GAME_TITLE = 0;

	/**
	 * The feature id for the '<em><b>Game Feature Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__GAME_FEATURE_CONTAINERS = 1;

	/**
	 * The feature id for the '<em><b>Game Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__GAME_SYSTEMS = 2;

	/**
	 * The feature id for the '<em><b>Game Version Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__GAME_VERSION_NAME = 3;

	/**
	 * The feature id for the '<em><b>Game Version Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__GAME_VERSION_NUMBER = 4;

	/**
	 * The number of structural features of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.GameFeatureContainer <em>Game Feature Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.GameFeatureContainer
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getGameFeatureContainer()
	 * @generated
	 */
	int GAME_FEATURE_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Feature Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_FEATURE_CONTAINER__FEATURE_CATEGORY = 0;

	/**
	 * The number of structural features of the '<em>Game Feature Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_FEATURE_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Game Feature Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_FEATURE_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.GameAttributeContainerImpl <em>Game Attribute Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.GameAttributeContainerImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getGameAttributeContainer()
	 * @generated
	 */
	int GAME_ATTRIBUTE_CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Feature Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_ATTRIBUTE_CONTAINER__FEATURE_CATEGORY = GAME_FEATURE_CONTAINER__FEATURE_CATEGORY;

	/**
	 * The feature id for the '<em><b>Game Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_ATTRIBUTE_CONTAINER__GAME_ATTRIBUTES = GAME_FEATURE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Game Attribute Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_ATTRIBUTE_CONTAINER_FEATURE_COUNT = GAME_FEATURE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Game Attribute Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_ATTRIBUTE_CONTAINER_OPERATION_COUNT = GAME_FEATURE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.GameFeature <em>Game Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.GameFeature
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getGameFeature()
	 * @generated
	 */
	int GAME_FEATURE = 4;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_FEATURE__FEATURE_NAME = 0;

	/**
	 * The number of structural features of the '<em>Game Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_FEATURE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Game Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.GameAttribute <em>Game Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.GameAttribute
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getGameAttribute()
	 * @generated
	 */
	int GAME_ATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_ATTRIBUTE__FEATURE_NAME = GAME_FEATURE__FEATURE_NAME;

	/**
	 * The number of structural features of the '<em>Game Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_ATTRIBUTE_FEATURE_COUNT = GAME_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Game Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_ATTRIBUTE_OPERATION_COUNT = GAME_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.GameStructure <em>Game Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.GameStructure
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getGameStructure()
	 * @generated
	 */
	int GAME_STRUCTURE = 93;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_STRUCTURE__FEATURE_NAME = GAME_FEATURE__FEATURE_NAME;

	/**
	 * The number of structural features of the '<em>Game Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_STRUCTURE_FEATURE_COUNT = GAME_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Game Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_STRUCTURE_OPERATION_COUNT = GAME_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.EnumerationBasedStructure <em>Enumeration Based Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.EnumerationBasedStructure
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getEnumerationBasedStructure()
	 * @generated
	 */
	int ENUMERATION_BASED_STRUCTURE = 6;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_BASED_STRUCTURE__FEATURE_NAME = GAME_STRUCTURE__FEATURE_NAME;

	/**
	 * The feature id for the '<em><b>Enum States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_BASED_STRUCTURE__ENUM_STATES = GAME_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration Based Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_BASED_STRUCTURE_FEATURE_COUNT = GAME_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enumeration Based Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_BASED_STRUCTURE_OPERATION_COUNT = GAME_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.EnumStateImpl <em>Enum State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.EnumStateImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getEnumState()
	 * @generated
	 */
	int ENUM_STATE = 7;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_STATE__FEATURE_NAME = GAME_FEATURE__FEATURE_NAME;

	/**
	 * The number of structural features of the '<em>Enum State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_STATE_FEATURE_COUNT = GAME_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Enum State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_STATE_OPERATION_COUNT = GAME_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.DataBasedStructureImpl <em>Data Based Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.DataBasedStructureImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getDataBasedStructure()
	 * @generated
	 */
	int DATA_BASED_STRUCTURE = 8;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASED_STRUCTURE__FEATURE_NAME = GAME_STRUCTURE__FEATURE_NAME;

	/**
	 * The feature id for the '<em><b>Structure Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASED_STRUCTURE__STRUCTURE_ATTRIBUTES = GAME_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Based Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASED_STRUCTURE_FEATURE_COUNT = GAME_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Based Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASED_STRUCTURE_OPERATION_COUNT = GAME_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.BooleanBasedAttributeImpl <em>Boolean Based Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.BooleanBasedAttributeImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getBooleanBasedAttribute()
	 * @generated
	 */
	int BOOLEAN_BASED_ATTRIBUTE = 9;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BASED_ATTRIBUTE__FEATURE_NAME = GAME_ATTRIBUTE__FEATURE_NAME;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BASED_ATTRIBUTE__DEFAULT_VALUE = GAME_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Based Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BASED_ATTRIBUTE_FEATURE_COUNT = GAME_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Based Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BASED_ATTRIBUTE_OPERATION_COUNT = GAME_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.ValueBasedAttribute <em>Value Based Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.ValueBasedAttribute
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getValueBasedAttribute()
	 * @generated
	 */
	int VALUE_BASED_ATTRIBUTE = 10;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BASED_ATTRIBUTE__FEATURE_NAME = GAME_ATTRIBUTE__FEATURE_NAME;

	/**
	 * The number of structural features of the '<em>Value Based Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BASED_ATTRIBUTE_FEATURE_COUNT = GAME_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Value Based Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BASED_ATTRIBUTE_OPERATION_COUNT = GAME_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.LetterBasedAttribute <em>Letter Based Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.LetterBasedAttribute
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getLetterBasedAttribute()
	 * @generated
	 */
	int LETTER_BASED_ATTRIBUTE = 11;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LETTER_BASED_ATTRIBUTE__FEATURE_NAME = GAME_ATTRIBUTE__FEATURE_NAME;

	/**
	 * The number of structural features of the '<em>Letter Based Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LETTER_BASED_ATTRIBUTE_FEATURE_COUNT = GAME_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Letter Based Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LETTER_BASED_ATTRIBUTE_OPERATION_COUNT = GAME_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.NameBasedAttributeImpl <em>Name Based Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.NameBasedAttributeImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getNameBasedAttribute()
	 * @generated
	 */
	int NAME_BASED_ATTRIBUTE = 12;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_BASED_ATTRIBUTE__FEATURE_NAME = LETTER_BASED_ATTRIBUTE__FEATURE_NAME;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_BASED_ATTRIBUTE__DEFAULT_VALUE = LETTER_BASED_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Name Based Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_BASED_ATTRIBUTE_FEATURE_COUNT = LETTER_BASED_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Name Based Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_BASED_ATTRIBUTE_OPERATION_COUNT = LETTER_BASED_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.StringBasedAttributeImpl <em>String Based Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.StringBasedAttributeImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getStringBasedAttribute()
	 * @generated
	 */
	int STRING_BASED_ATTRIBUTE = 13;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_BASED_ATTRIBUTE__FEATURE_NAME = LETTER_BASED_ATTRIBUTE__FEATURE_NAME;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_BASED_ATTRIBUTE__DEFAULT_VALUE = LETTER_BASED_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Based Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_BASED_ATTRIBUTE_FEATURE_COUNT = LETTER_BASED_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Based Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_BASED_ATTRIBUTE_OPERATION_COUNT = LETTER_BASED_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.TextBasedAttributeImpl <em>Text Based Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.TextBasedAttributeImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getTextBasedAttribute()
	 * @generated
	 */
	int TEXT_BASED_ATTRIBUTE = 14;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BASED_ATTRIBUTE__FEATURE_NAME = LETTER_BASED_ATTRIBUTE__FEATURE_NAME;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BASED_ATTRIBUTE__DEFAULT_VALUE = LETTER_BASED_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Based Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BASED_ATTRIBUTE_FEATURE_COUNT = LETTER_BASED_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text Based Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BASED_ATTRIBUTE_OPERATION_COUNT = LETTER_BASED_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.Vector2DBasedAttributeImpl <em>Vector2 DBased Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.Vector2DBasedAttributeImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getVector2DBasedAttribute()
	 * @generated
	 */
	int VECTOR2_DBASED_ATTRIBUTE = 15;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR2_DBASED_ATTRIBUTE__FEATURE_NAME = GAME_ATTRIBUTE__FEATURE_NAME;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR2_DBASED_ATTRIBUTE__X = GAME_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR2_DBASED_ATTRIBUTE__Y = GAME_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Vector2 DBased Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR2_DBASED_ATTRIBUTE_FEATURE_COUNT = GAME_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Vector2 DBased Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR2_DBASED_ATTRIBUTE_OPERATION_COUNT = GAME_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.VectorBasedAttributeImpl <em>Vector Based Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.VectorBasedAttributeImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getVectorBasedAttribute()
	 * @generated
	 */
	int VECTOR_BASED_ATTRIBUTE = 16;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_BASED_ATTRIBUTE__FEATURE_NAME = GAME_ATTRIBUTE__FEATURE_NAME;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_BASED_ATTRIBUTE__X = GAME_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_BASED_ATTRIBUTE__Y = GAME_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_BASED_ATTRIBUTE__Z = GAME_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>TOwning Transformation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_BASED_ATTRIBUTE__TOWNING_TRANSFORMATION = GAME_ATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>SOwning Transformation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_BASED_ATTRIBUTE__SOWNING_TRANSFORMATION = GAME_ATTRIBUTE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Vector Based Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_BASED_ATTRIBUTE_FEATURE_COUNT = GAME_ATTRIBUTE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Vector Based Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_BASED_ATTRIBUTE_OPERATION_COUNT = GAME_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.RotatorBasedAttributeImpl <em>Rotator Based Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.RotatorBasedAttributeImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getRotatorBasedAttribute()
	 * @generated
	 */
	int ROTATOR_BASED_ATTRIBUTE = 17;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATOR_BASED_ATTRIBUTE__FEATURE_NAME = GAME_ATTRIBUTE__FEATURE_NAME;

	/**
	 * The feature id for the '<em><b>Roll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATOR_BASED_ATTRIBUTE__ROLL = GAME_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pitch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATOR_BASED_ATTRIBUTE__PITCH = GAME_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Yaw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATOR_BASED_ATTRIBUTE__YAW = GAME_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>ROwning Transformation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATOR_BASED_ATTRIBUTE__ROWNING_TRANSFORMATION = GAME_ATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Rotator Based Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATOR_BASED_ATTRIBUTE_FEATURE_COUNT = GAME_ATTRIBUTE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Rotator Based Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATOR_BASED_ATTRIBUTE_OPERATION_COUNT = GAME_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.TransformationBasedAttributeImpl <em>Transformation Based Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.TransformationBasedAttributeImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getTransformationBasedAttribute()
	 * @generated
	 */
	int TRANSFORMATION_BASED_ATTRIBUTE = 18;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_BASED_ATTRIBUTE__FEATURE_NAME = GAME_ATTRIBUTE__FEATURE_NAME;

	/**
	 * The feature id for the '<em><b>Translation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_BASED_ATTRIBUTE__TRANSLATION = GAME_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_BASED_ATTRIBUTE__ROTATION = GAME_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scale3 D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_BASED_ATTRIBUTE__SCALE3_D = GAME_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Transformation Based Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_BASED_ATTRIBUTE_FEATURE_COUNT = GAME_ATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Transformation Based Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_BASED_ATTRIBUTE_OPERATION_COUNT = GAME_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.ColorBasedAttributeImpl <em>Color Based Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.ColorBasedAttributeImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getColorBasedAttribute()
	 * @generated
	 */
	int COLOR_BASED_ATTRIBUTE = 19;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_BASED_ATTRIBUTE__FEATURE_NAME = GAME_ATTRIBUTE__FEATURE_NAME;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_BASED_ATTRIBUTE__R = GAME_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_BASED_ATTRIBUTE__G = GAME_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_BASED_ATTRIBUTE__B = GAME_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_BASED_ATTRIBUTE__A = GAME_ATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Color Based Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_BASED_ATTRIBUTE_FEATURE_COUNT = GAME_ATTRIBUTE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Color Based Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_BASED_ATTRIBUTE_OPERATION_COUNT = GAME_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.TextureBasedAttributeImpl <em>Texture Based Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.TextureBasedAttributeImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getTextureBasedAttribute()
	 * @generated
	 */
	int TEXTURE_BASED_ATTRIBUTE = 20;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE_BASED_ATTRIBUTE__FEATURE_NAME = GAME_ATTRIBUTE__FEATURE_NAME;

	/**
	 * The number of structural features of the '<em>Texture Based Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE_BASED_ATTRIBUTE_FEATURE_COUNT = GAME_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Texture Based Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE_BASED_ATTRIBUTE_OPERATION_COUNT = GAME_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.GameItemContainerImpl <em>Game Item Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.GameItemContainerImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getGameItemContainer()
	 * @generated
	 */
	int GAME_ITEM_CONTAINER = 21;

	/**
	 * The feature id for the '<em><b>Feature Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_ITEM_CONTAINER__FEATURE_CATEGORY = GAME_FEATURE_CONTAINER__FEATURE_CATEGORY;

	/**
	 * The feature id for the '<em><b>Game Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_ITEM_CONTAINER__GAME_ITEMS = GAME_FEATURE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Game Item Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_ITEM_CONTAINER_FEATURE_COUNT = GAME_FEATURE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Game Item Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_ITEM_CONTAINER_OPERATION_COUNT = GAME_FEATURE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.GameItemImpl <em>Game Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.GameItemImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getGameItem()
	 * @generated
	 */
	int GAME_ITEM = 22;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_ITEM__FEATURE_NAME = GAME_FEATURE__FEATURE_NAME;

	/**
	 * The feature id for the '<em><b>Item Attribute Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_ITEM__ITEM_ATTRIBUTE_INSTANCES = GAME_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Item Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_ITEM__ITEM_MODES = GAME_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Derived Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_ITEM__DERIVED_ITEMS = GAME_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Item</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_ITEM__PARENT_ITEM = GAME_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Placable Inventories</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_ITEM__PLACABLE_INVENTORIES = GAME_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_ITEM__IS_ABSTRACT = GAME_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Game Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_ITEM_FEATURE_COUNT = GAME_FEATURE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Game Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_ITEM_OPERATION_COUNT = GAME_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.ItemModeImpl <em>Item Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.ItemModeImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getItemMode()
	 * @generated
	 */
	int ITEM_MODE = 23;

	/**
	 * The number of structural features of the '<em>Item Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_MODE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Item Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_MODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.GameSystem <em>Game System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.GameSystem
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getGameSystem()
	 * @generated
	 */
	int GAME_SYSTEM = 24;

	/**
	 * The feature id for the '<em><b>System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_SYSTEM__SYSTEM_NAME = 0;

	/**
	 * The number of structural features of the '<em>Game System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_SYSTEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Game System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.AttributeSystemImpl <em>Attribute System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.AttributeSystemImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getAttributeSystem()
	 * @generated
	 */
	int ATTRIBUTE_SYSTEM = 25;

	/**
	 * The feature id for the '<em><b>System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SYSTEM__SYSTEM_NAME = GAME_SYSTEM__SYSTEM_NAME;

	/**
	 * The feature id for the '<em><b>Array Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SYSTEM__ARRAY_CONSTRAINTS = GAME_SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Single Value Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SYSTEM__SINGLE_VALUE_CONSTRAINTS = GAME_SYSTEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent Attribute System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SYSTEM__PARENT_ATTRIBUTE_SYSTEM = GAME_SYSTEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Attribute System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SYSTEM_FEATURE_COUNT = GAME_SYSTEM_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Attribute System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SYSTEM_OPERATION_COUNT = GAME_SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.GameSystemConstraint <em>Game System Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.GameSystemConstraint
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getGameSystemConstraint()
	 * @generated
	 */
	int GAME_SYSTEM_CONSTRAINT = 26;

	/**
	 * The number of structural features of the '<em>Game System Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_SYSTEM_CONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Game System Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_SYSTEM_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.AttributeSystemConstraint <em>Attribute System Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.AttributeSystemConstraint
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getAttributeSystemConstraint()
	 * @generated
	 */
	int ATTRIBUTE_SYSTEM_CONSTRAINT = 27;

	/**
	 * The number of structural features of the '<em>Attribute System Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SYSTEM_CONSTRAINT_FEATURE_COUNT = GAME_SYSTEM_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attribute System Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SYSTEM_CONSTRAINT_OPERATION_COUNT = GAME_SYSTEM_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.BaseGameConstraintRule <em>Base Game Constraint Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.BaseGameConstraintRule
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getBaseGameConstraintRule()
	 * @generated
	 */
	int BASE_GAME_CONSTRAINT_RULE = 28;

	/**
	 * The number of structural features of the '<em>Base Game Constraint Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_GAME_CONSTRAINT_RULE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Base Game Constraint Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_GAME_CONSTRAINT_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.AttributeConstraintRule <em>Attribute Constraint Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.AttributeConstraintRule
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getAttributeConstraintRule()
	 * @generated
	 */
	int ATTRIBUTE_CONSTRAINT_RULE = 29;

	/**
	 * The number of structural features of the '<em>Attribute Constraint Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT_RULE_FEATURE_COUNT = BASE_GAME_CONSTRAINT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attribute Constraint Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT_RULE_OPERATION_COUNT = BASE_GAME_CONSTRAINT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.ArrayConstraintImpl <em>Array Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.ArrayConstraintImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getArrayConstraint()
	 * @generated
	 */
	int ARRAY_CONSTRAINT = 30;

	/**
	 * The feature id for the '<em><b>Constrained Attribute Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE = ATTRIBUTE_SYSTEM_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_CONSTRAINT_FEATURE_COUNT = ATTRIBUTE_SYSTEM_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Array Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_CONSTRAINT_OPERATION_COUNT = ATTRIBUTE_SYSTEM_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.SingleValueConstraint <em>Single Value Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.SingleValueConstraint
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getSingleValueConstraint()
	 * @generated
	 */
	int SINGLE_VALUE_CONSTRAINT = 55;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VALUE_CONSTRAINT__VARIABILITY = ATTRIBUTE_SYSTEM_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Single Value Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VALUE_CONSTRAINT_FEATURE_COUNT = ATTRIBUTE_SYSTEM_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Single Value Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VALUE_CONSTRAINT_OPERATION_COUNT = ATTRIBUTE_SYSTEM_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.BooleanBasedConstraintImpl <em>Boolean Based Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.BooleanBasedConstraintImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getBooleanBasedConstraint()
	 * @generated
	 */
	int BOOLEAN_BASED_CONSTRAINT = 31;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BASED_CONSTRAINT__VARIABILITY = SINGLE_VALUE_CONSTRAINT__VARIABILITY;

	/**
	 * The feature id for the '<em><b>Constrained Attribute Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE = SINGLE_VALUE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Based Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BASED_CONSTRAINT_FEATURE_COUNT = SINGLE_VALUE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Based Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BASED_CONSTRAINT_OPERATION_COUNT = SINGLE_VALUE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.ValueBasedConstraintImpl <em>Value Based Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.ValueBasedConstraintImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getValueBasedConstraint()
	 * @generated
	 */
	int VALUE_BASED_CONSTRAINT = 32;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BASED_CONSTRAINT__VARIABILITY = SINGLE_VALUE_CONSTRAINT__VARIABILITY;

	/**
	 * The feature id for the '<em><b>Constrained Attribute Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE = SINGLE_VALUE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Or Range Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BASED_CONSTRAINT__BASE_OR_RANGE_CONSTRAINT = SINGLE_VALUE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Margin Of Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BASED_CONSTRAINT__MARGIN_OF_ERROR = SINGLE_VALUE_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Regeneration Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BASED_CONSTRAINT__REGENERATION_CONSTRAINT = SINGLE_VALUE_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Direct Dependency Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BASED_CONSTRAINT__DIRECT_DEPENDENCY_CONSTRAINT = SINGLE_VALUE_CONSTRAINT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Distortion Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BASED_CONSTRAINT__DISTORTION_CONSTRAINTS = SINGLE_VALUE_CONSTRAINT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Value Based Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BASED_CONSTRAINT_FEATURE_COUNT = SINGLE_VALUE_CONSTRAINT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Value Based Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BASED_CONSTRAINT_OPERATION_COUNT = SINGLE_VALUE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.ValueConstraintRule <em>Value Constraint Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.ValueConstraintRule
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getValueConstraintRule()
	 * @generated
	 */
	int VALUE_CONSTRAINT_RULE = 75;

	/**
	 * The number of structural features of the '<em>Value Constraint Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CONSTRAINT_RULE_FEATURE_COUNT = ATTRIBUTE_CONSTRAINT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Value Constraint Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CONSTRAINT_RULE_OPERATION_COUNT = ATTRIBUTE_CONSTRAINT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.BaseValueRangedConstraint <em>Base Value Ranged Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.BaseValueRangedConstraint
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getBaseValueRangedConstraint()
	 * @generated
	 */
	int BASE_VALUE_RANGED_CONSTRAINT = 54;

	/**
	 * The feature id for the '<em><b>Remap Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_VALUE_RANGED_CONSTRAINT__REMAP_VALUE = VALUE_CONSTRAINT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Base Value Ranged Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_VALUE_RANGED_CONSTRAINT_FEATURE_COUNT = VALUE_CONSTRAINT_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Base Value Ranged Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_VALUE_RANGED_CONSTRAINT_OPERATION_COUNT = VALUE_CONSTRAINT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.MinimumValueImpl <em>Minimum Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.MinimumValueImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getMinimumValue()
	 * @generated
	 */
	int MINIMUM_VALUE = 33;

	/**
	 * The feature id for the '<em><b>Remap Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMUM_VALUE__REMAP_VALUE = BASE_VALUE_RANGED_CONSTRAINT__REMAP_VALUE;

	/**
	 * The feature id for the '<em><b>Minimum Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMUM_VALUE__MINIMUM_ATTRIBUTE = BASE_VALUE_RANGED_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Minimum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMUM_VALUE_FEATURE_COUNT = BASE_VALUE_RANGED_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Minimum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMUM_VALUE_OPERATION_COUNT = BASE_VALUE_RANGED_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.MaximumValueImpl <em>Maximum Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.MaximumValueImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getMaximumValue()
	 * @generated
	 */
	int MAXIMUM_VALUE = 34;

	/**
	 * The feature id for the '<em><b>Remap Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXIMUM_VALUE__REMAP_VALUE = BASE_VALUE_RANGED_CONSTRAINT__REMAP_VALUE;

	/**
	 * The feature id for the '<em><b>Maximum Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXIMUM_VALUE__MAXIMUM_ATTRIBUTE = BASE_VALUE_RANGED_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Maximum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXIMUM_VALUE_FEATURE_COUNT = BASE_VALUE_RANGED_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Maximum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXIMUM_VALUE_OPERATION_COUNT = BASE_VALUE_RANGED_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.RegenerationConstraintImpl <em>Regeneration Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.RegenerationConstraintImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getRegenerationConstraint()
	 * @generated
	 */
	int REGENERATION_CONSTRAINT = 35;

	/**
	 * The feature id for the '<em><b>Regeneration Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGENERATION_CONSTRAINT__REGENERATION_ATTRIBUTE = VALUE_CONSTRAINT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Regeneration Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGENERATION_CONSTRAINT_FEATURE_COUNT = VALUE_CONSTRAINT_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Regeneration Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGENERATION_CONSTRAINT_OPERATION_COUNT = VALUE_CONSTRAINT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.DependencyConstraint <em>Dependency Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.DependencyConstraint
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getDependencyConstraint()
	 * @generated
	 */
	int DEPENDENCY_CONSTRAINT = 36;

	/**
	 * The number of structural features of the '<em>Dependency Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_CONSTRAINT_FEATURE_COUNT = VALUE_CONSTRAINT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dependency Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_CONSTRAINT_OPERATION_COUNT = VALUE_CONSTRAINT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.LetterBasedConstraintImpl <em>Letter Based Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.LetterBasedConstraintImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getLetterBasedConstraint()
	 * @generated
	 */
	int LETTER_BASED_CONSTRAINT = 37;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LETTER_BASED_CONSTRAINT__VARIABILITY = SINGLE_VALUE_CONSTRAINT__VARIABILITY;

	/**
	 * The feature id for the '<em><b>Constrained Attribute Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LETTER_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE = SINGLE_VALUE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Letter Length Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LETTER_BASED_CONSTRAINT__LETTER_LENGTH_CONSTRAINT = SINGLE_VALUE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Letter Customization Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LETTER_BASED_CONSTRAINT__LETTER_CUSTOMIZATION_CONSTRAINT = SINGLE_VALUE_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Letter Based Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LETTER_BASED_CONSTRAINT_FEATURE_COUNT = SINGLE_VALUE_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Letter Based Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LETTER_BASED_CONSTRAINT_OPERATION_COUNT = SINGLE_VALUE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.InventorySystemImpl <em>Inventory System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.InventorySystemImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getInventorySystem()
	 * @generated
	 */
	int INVENTORY_SYSTEM = 38;

	/**
	 * The feature id for the '<em><b>System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_SYSTEM__SYSTEM_NAME = GAME_SYSTEM__SYSTEM_NAME;

	/**
	 * The feature id for the '<em><b>Inventory Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_SYSTEM__INVENTORY_CONSTRAINTS = GAME_SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>System Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_SYSTEM__SYSTEM_ITEMS = GAME_SYSTEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Inventory System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_SYSTEM_FEATURE_COUNT = GAME_SYSTEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Inventory System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_SYSTEM_OPERATION_COUNT = GAME_SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.InventorySystemConstraintImpl <em>Inventory System Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.InventorySystemConstraintImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getInventorySystemConstraint()
	 * @generated
	 */
	int INVENTORY_SYSTEM_CONSTRAINT = 39;

	/**
	 * The feature id for the '<em><b>Selection Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_SYSTEM_CONSTRAINT__SELECTION_CONSTRAINT = GAME_SYSTEM_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Equip Item Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_SYSTEM_CONSTRAINT__EQUIP_ITEM_CONSTRAINT = GAME_SYSTEM_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Slot Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_SYSTEM_CONSTRAINT__SLOT_CONSTRAINT = GAME_SYSTEM_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Stack Weight Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_SYSTEM_CONSTRAINT__STACK_WEIGHT_CONSTRAINT = GAME_SYSTEM_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Auto Craft Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_SYSTEM_CONSTRAINT__AUTO_CRAFT_CONSTRAINT = GAME_SYSTEM_CONSTRAINT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Vain Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_SYSTEM_CONSTRAINT__VAIN_CONSTRAINT = GAME_SYSTEM_CONSTRAINT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Inventory System Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_SYSTEM_CONSTRAINT_FEATURE_COUNT = GAME_SYSTEM_CONSTRAINT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Inventory System Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_SYSTEM_CONSTRAINT_OPERATION_COUNT = GAME_SYSTEM_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.InventoryConstraintRule <em>Inventory Constraint Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.InventoryConstraintRule
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getInventoryConstraintRule()
	 * @generated
	 */
	int INVENTORY_CONSTRAINT_RULE = 40;

	/**
	 * The number of structural features of the '<em>Inventory Constraint Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_CONSTRAINT_RULE_FEATURE_COUNT = BASE_GAME_CONSTRAINT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Inventory Constraint Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_CONSTRAINT_RULE_OPERATION_COUNT = BASE_GAME_CONSTRAINT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.AutoCraftConstraintImpl <em>Auto Craft Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.AutoCraftConstraintImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getAutoCraftConstraint()
	 * @generated
	 */
	int AUTO_CRAFT_CONSTRAINT = 41;

	/**
	 * The number of structural features of the '<em>Auto Craft Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_CRAFT_CONSTRAINT_FEATURE_COUNT = INVENTORY_CONSTRAINT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Auto Craft Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_CRAFT_CONSTRAINT_OPERATION_COUNT = INVENTORY_CONSTRAINT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.StackWeightConstraint <em>Stack Weight Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.StackWeightConstraint
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getStackWeightConstraint()
	 * @generated
	 */
	int STACK_WEIGHT_CONSTRAINT = 42;

	/**
	 * The number of structural features of the '<em>Stack Weight Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_WEIGHT_CONSTRAINT_FEATURE_COUNT = INVENTORY_CONSTRAINT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stack Weight Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_WEIGHT_CONSTRAINT_OPERATION_COUNT = INVENTORY_CONSTRAINT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.StackConstraintImpl <em>Stack Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.StackConstraintImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getStackConstraint()
	 * @generated
	 */
	int STACK_CONSTRAINT = 43;

	/**
	 * The feature id for the '<em><b>Stack Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_CONSTRAINT__STACK_AMOUNT = STACK_WEIGHT_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stack Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_CONSTRAINT_FEATURE_COUNT = STACK_WEIGHT_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Stack Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_CONSTRAINT_OPERATION_COUNT = STACK_WEIGHT_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.WeightConstraintImpl <em>Weight Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.WeightConstraintImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getWeightConstraint()
	 * @generated
	 */
	int WEIGHT_CONSTRAINT = 44;

	/**
	 * The feature id for the '<em><b>Total Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHT_CONSTRAINT__TOTAL_WEIGHT = STACK_WEIGHT_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Weight Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHT_CONSTRAINT_FEATURE_COUNT = STACK_WEIGHT_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Weight Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHT_CONSTRAINT_OPERATION_COUNT = STACK_WEIGHT_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.SlotConstraintImpl <em>Slot Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.SlotConstraintImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getSlotConstraint()
	 * @generated
	 */
	int SLOT_CONSTRAINT = 45;

	/**
	 * The feature id for the '<em><b>Number Of Slots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_CONSTRAINT__NUMBER_OF_SLOTS = INVENTORY_CONSTRAINT_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximum Slots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_CONSTRAINT__MAXIMUM_SLOTS = INVENTORY_CONSTRAINT_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Slot Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_CONSTRAINT_FEATURE_COUNT = INVENTORY_CONSTRAINT_RULE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Slot Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_CONSTRAINT_OPERATION_COUNT = INVENTORY_CONSTRAINT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.EquipItemConstraintImpl <em>Equip Item Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.EquipItemConstraintImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getEquipItemConstraint()
	 * @generated
	 */
	int EQUIP_ITEM_CONSTRAINT = 46;

	/**
	 * The number of structural features of the '<em>Equip Item Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIP_ITEM_CONSTRAINT_FEATURE_COUNT = INVENTORY_CONSTRAINT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Equip Item Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIP_ITEM_CONSTRAINT_OPERATION_COUNT = INVENTORY_CONSTRAINT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.SelectionConstraintImpl <em>Selection Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.SelectionConstraintImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getSelectionConstraint()
	 * @generated
	 */
	int SELECTION_CONSTRAINT = 47;

	/**
	 * The feature id for the '<em><b>Selectable Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CONSTRAINT__SELECTABLE_AMOUNT = INVENTORY_CONSTRAINT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Selection Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CONSTRAINT_FEATURE_COUNT = INVENTORY_CONSTRAINT_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Selection Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CONSTRAINT_OPERATION_COUNT = INVENTORY_CONSTRAINT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.ModelBasedAttributeImpl <em>Model Based Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.ModelBasedAttributeImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getModelBasedAttribute()
	 * @generated
	 */
	int MODEL_BASED_ATTRIBUTE = 48;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_BASED_ATTRIBUTE__FEATURE_NAME = GAME_ATTRIBUTE__FEATURE_NAME;

	/**
	 * The number of structural features of the '<em>Model Based Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_BASED_ATTRIBUTE_FEATURE_COUNT = GAME_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Model Based Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_BASED_ATTRIBUTE_OPERATION_COUNT = GAME_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.ParticleBasedAttributeImpl <em>Particle Based Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.ParticleBasedAttributeImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getParticleBasedAttribute()
	 * @generated
	 */
	int PARTICLE_BASED_ATTRIBUTE = 49;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICLE_BASED_ATTRIBUTE__FEATURE_NAME = GAME_ATTRIBUTE__FEATURE_NAME;

	/**
	 * The number of structural features of the '<em>Particle Based Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICLE_BASED_ATTRIBUTE_FEATURE_COUNT = GAME_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Particle Based Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICLE_BASED_ATTRIBUTE_OPERATION_COUNT = GAME_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.VainConstraintImpl <em>Vain Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.VainConstraintImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getVainConstraint()
	 * @generated
	 */
	int VAIN_CONSTRAINT = 50;

	/**
	 * The number of structural features of the '<em>Vain Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAIN_CONSTRAINT_FEATURE_COUNT = INVENTORY_CONSTRAINT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Vain Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAIN_CONSTRAINT_OPERATION_COUNT = INVENTORY_CONSTRAINT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.BaseOrRangeConstraint <em>Base Or Range Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.BaseOrRangeConstraint
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getBaseOrRangeConstraint()
	 * @generated
	 */
	int BASE_OR_RANGE_CONSTRAINT = 52;

	/**
	 * The number of structural features of the '<em>Base Or Range Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_OR_RANGE_CONSTRAINT_FEATURE_COUNT = VALUE_CONSTRAINT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Base Or Range Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_OR_RANGE_CONSTRAINT_OPERATION_COUNT = VALUE_CONSTRAINT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.BaseValueConstraintImpl <em>Base Value Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.BaseValueConstraintImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getBaseValueConstraint()
	 * @generated
	 */
	int BASE_VALUE_CONSTRAINT = 51;

	/**
	 * The feature id for the '<em><b>Default Base Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_VALUE_CONSTRAINT__DEFAULT_BASE_VALUE = BASE_OR_RANGE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Base Value Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_VALUE_CONSTRAINT_FEATURE_COUNT = BASE_OR_RANGE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Base Value Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_VALUE_CONSTRAINT_OPERATION_COUNT = BASE_OR_RANGE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.ValueRangeBasedConstraintImpl <em>Value Range Based Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.ValueRangeBasedConstraintImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getValueRangeBasedConstraint()
	 * @generated
	 */
	int VALUE_RANGE_BASED_CONSTRAINT = 53;

	/**
	 * The feature id for the '<em><b>Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RANGE_BASED_CONSTRAINT__LIMIT = BASE_OR_RANGE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Minimum Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RANGE_BASED_CONSTRAINT__MINIMUM_VALUE = BASE_OR_RANGE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Maximum Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RANGE_BASED_CONSTRAINT__MAXIMUM_VALUE = BASE_OR_RANGE_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Initializer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RANGE_BASED_CONSTRAINT__INITIALIZER = BASE_OR_RANGE_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Conversion Dependency Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RANGE_BASED_CONSTRAINT__CONVERSION_DEPENDENCY_CONSTRAINT = BASE_OR_RANGE_CONSTRAINT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Value Range Based Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RANGE_BASED_CONSTRAINT_FEATURE_COUNT = BASE_OR_RANGE_CONSTRAINT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Value Range Based Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RANGE_BASED_CONSTRAINT_OPERATION_COUNT = BASE_OR_RANGE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.MarginOfErrorConstraintImpl <em>Margin Of Error Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.MarginOfErrorConstraintImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getMarginOfErrorConstraint()
	 * @generated
	 */
	int MARGIN_OF_ERROR_CONSTRAINT = 56;

	/**
	 * The feature id for the '<em><b>MOE Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGIN_OF_ERROR_CONSTRAINT__MOE_ATTRIBUTE = VALUE_CONSTRAINT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Margin Of Error Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGIN_OF_ERROR_CONSTRAINT_FEATURE_COUNT = VALUE_CONSTRAINT_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Margin Of Error Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGIN_OF_ERROR_CONSTRAINT_OPERATION_COUNT = VALUE_CONSTRAINT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.AudioBasedAttributeImpl <em>Audio Based Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.AudioBasedAttributeImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getAudioBasedAttribute()
	 * @generated
	 */
	int AUDIO_BASED_ATTRIBUTE = 57;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_BASED_ATTRIBUTE__FEATURE_NAME = GAME_ATTRIBUTE__FEATURE_NAME;

	/**
	 * The number of structural features of the '<em>Audio Based Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_BASED_ATTRIBUTE_FEATURE_COUNT = GAME_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Audio Based Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_BASED_ATTRIBUTE_OPERATION_COUNT = GAME_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.CharacterBasedAttributeImpl <em>Character Based Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.CharacterBasedAttributeImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getCharacterBasedAttribute()
	 * @generated
	 */
	int CHARACTER_BASED_ATTRIBUTE = 58;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_BASED_ATTRIBUTE__FEATURE_NAME = LETTER_BASED_ATTRIBUTE__FEATURE_NAME;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_BASED_ATTRIBUTE__DEFAULT_VALUE = LETTER_BASED_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Character Based Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_BASED_ATTRIBUTE_FEATURE_COUNT = LETTER_BASED_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Character Based Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_BASED_ATTRIBUTE_OPERATION_COUNT = LETTER_BASED_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.IntegerBasedAttributeImpl <em>Integer Based Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.IntegerBasedAttributeImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getIntegerBasedAttribute()
	 * @generated
	 */
	int INTEGER_BASED_ATTRIBUTE = 59;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_BASED_ATTRIBUTE__FEATURE_NAME = VALUE_BASED_ATTRIBUTE__FEATURE_NAME;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_BASED_ATTRIBUTE__DEFAULT_VALUE = VALUE_BASED_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Based Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_BASED_ATTRIBUTE_FEATURE_COUNT = VALUE_BASED_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Based Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_BASED_ATTRIBUTE_OPERATION_COUNT = VALUE_BASED_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.DecimalBasedAttributeImpl <em>Decimal Based Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.DecimalBasedAttributeImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getDecimalBasedAttribute()
	 * @generated
	 */
	int DECIMAL_BASED_ATTRIBUTE = 60;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_BASED_ATTRIBUTE__FEATURE_NAME = VALUE_BASED_ATTRIBUTE__FEATURE_NAME;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_BASED_ATTRIBUTE__DEFAULT_VALUE = VALUE_BASED_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Decimal Based Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_BASED_ATTRIBUTE_FEATURE_COUNT = VALUE_BASED_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Decimal Based Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_BASED_ATTRIBUTE_OPERATION_COUNT = VALUE_BASED_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.DirectDependencyConstraintImpl <em>Direct Dependency Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.DirectDependencyConstraintImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getDirectDependencyConstraint()
	 * @generated
	 */
	int DIRECT_DEPENDENCY_CONSTRAINT = 61;

	/**
	 * The feature id for the '<em><b>Dependent Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_DEPENDENCY_CONSTRAINT__DEPENDENT_ATTRIBUTES = DEPENDENCY_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dependency Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_DEPENDENCY_CONSTRAINT__DEPENDENCY_FORMULA = DEPENDENCY_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Direct Dependency Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_DEPENDENCY_CONSTRAINT_FEATURE_COUNT = DEPENDENCY_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Direct Dependency Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_DEPENDENCY_CONSTRAINT_OPERATION_COUNT = DEPENDENCY_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.ConversionDependencyConstraintImpl <em>Conversion Dependency Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.ConversionDependencyConstraintImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getConversionDependencyConstraint()
	 * @generated
	 */
	int CONVERSION_DEPENDENCY_CONSTRAINT = 62;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_DEPENDENCY_CONSTRAINT__ATTRIBUTE_NAME = DEPENDENCY_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conversion Unit To Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_DEPENDENCY_CONSTRAINT__CONVERSION_UNIT_TO_BASE = DEPENDENCY_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Conversion Chain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_DEPENDENCY_CONSTRAINT__CONVERSION_CHAIN = DEPENDENCY_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value Range Based Constraint</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_DEPENDENCY_CONSTRAINT__VALUE_RANGE_BASED_CONSTRAINT = DEPENDENCY_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Next Attribute In Chain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_DEPENDENCY_CONSTRAINT__NEXT_ATTRIBUTE_IN_CHAIN = DEPENDENCY_CONSTRAINT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Conversion Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_DEPENDENCY_CONSTRAINT__CONVERSION_RATE = DEPENDENCY_CONSTRAINT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Conversion Dependency Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_DEPENDENCY_CONSTRAINT_FEATURE_COUNT = DEPENDENCY_CONSTRAINT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Conversion Dependency Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_DEPENDENCY_CONSTRAINT_OPERATION_COUNT = DEPENDENCY_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.DistortionConstraint <em>Distortion Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.DistortionConstraint
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getDistortionConstraint()
	 * @generated
	 */
	int DISTORTION_CONSTRAINT = 63;

	/**
	 * The feature id for the '<em><b>Distortion Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTORTION_CONSTRAINT__DISTORTION_ATTRIBUTE = VALUE_CONSTRAINT_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Distortion Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTORTION_CONSTRAINT__DISTORTION_MODE = VALUE_CONSTRAINT_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Distortion Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTORTION_CONSTRAINT_FEATURE_COUNT = VALUE_CONSTRAINT_RULE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Distortion Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTORTION_CONSTRAINT_OPERATION_COUNT = VALUE_CONSTRAINT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.Vector2DBasedConstraintImpl <em>Vector2 DBased Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.Vector2DBasedConstraintImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getVector2DBasedConstraint()
	 * @generated
	 */
	int VECTOR2_DBASED_CONSTRAINT = 64;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR2_DBASED_CONSTRAINT__VARIABILITY = SINGLE_VALUE_CONSTRAINT__VARIABILITY;

	/**
	 * The feature id for the '<em><b>Constrained Attribute Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR2_DBASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE = SINGLE_VALUE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vector2 DRange Based Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR2_DBASED_CONSTRAINT__VECTOR2_DRANGE_BASED_CONSTRAINT = SINGLE_VALUE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Vector2 DBased Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR2_DBASED_CONSTRAINT_FEATURE_COUNT = SINGLE_VALUE_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Vector2 DBased Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR2_DBASED_CONSTRAINT_OPERATION_COUNT = SINGLE_VALUE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.VectorBasedConstraintImpl <em>Vector Based Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.VectorBasedConstraintImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getVectorBasedConstraint()
	 * @generated
	 */
	int VECTOR_BASED_CONSTRAINT = 65;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_BASED_CONSTRAINT__VARIABILITY = SINGLE_VALUE_CONSTRAINT__VARIABILITY;

	/**
	 * The feature id for the '<em><b>Constrained Attribute Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE = SINGLE_VALUE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vector Range Based Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_BASED_CONSTRAINT__VECTOR_RANGE_BASED_CONSTRAINT = SINGLE_VALUE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Vector Based Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_BASED_CONSTRAINT_FEATURE_COUNT = SINGLE_VALUE_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Vector Based Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_BASED_CONSTRAINT_OPERATION_COUNT = SINGLE_VALUE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.RotatorBasedConstraintImpl <em>Rotator Based Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.RotatorBasedConstraintImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getRotatorBasedConstraint()
	 * @generated
	 */
	int ROTATOR_BASED_CONSTRAINT = 66;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATOR_BASED_CONSTRAINT__VARIABILITY = SINGLE_VALUE_CONSTRAINT__VARIABILITY;

	/**
	 * The feature id for the '<em><b>Constrained Attribute Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATOR_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE = SINGLE_VALUE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rotator Range Based Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATOR_BASED_CONSTRAINT__ROTATOR_RANGE_BASED_CONSTRAINT = SINGLE_VALUE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rotator Based Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATOR_BASED_CONSTRAINT_FEATURE_COUNT = SINGLE_VALUE_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rotator Based Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATOR_BASED_CONSTRAINT_OPERATION_COUNT = SINGLE_VALUE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.TransformationBasedConstraintImpl <em>Transformation Based Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.TransformationBasedConstraintImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getTransformationBasedConstraint()
	 * @generated
	 */
	int TRANSFORMATION_BASED_CONSTRAINT = 67;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_BASED_CONSTRAINT__VARIABILITY = SINGLE_VALUE_CONSTRAINT__VARIABILITY;

	/**
	 * The feature id for the '<em><b>Constrained Attribute Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE = SINGLE_VALUE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transformation Range Based Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_BASED_CONSTRAINT__TRANSFORMATION_RANGE_BASED_CONSTRAINT = SINGLE_VALUE_CONSTRAINT_FEATURE_COUNT
			+ 1;

	/**
	 * The number of structural features of the '<em>Transformation Based Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_BASED_CONSTRAINT_FEATURE_COUNT = SINGLE_VALUE_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Transformation Based Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_BASED_CONSTRAINT_OPERATION_COUNT = SINGLE_VALUE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.ColorBasedConstraintImpl <em>Color Based Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.ColorBasedConstraintImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getColorBasedConstraint()
	 * @generated
	 */
	int COLOR_BASED_CONSTRAINT = 68;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_BASED_CONSTRAINT__VARIABILITY = SINGLE_VALUE_CONSTRAINT__VARIABILITY;

	/**
	 * The feature id for the '<em><b>Constrained Attribute Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE = SINGLE_VALUE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color Customization Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_BASED_CONSTRAINT__COLOR_CUSTOMIZATION_CONSTRAINT = SINGLE_VALUE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Color Based Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_BASED_CONSTRAINT_FEATURE_COUNT = SINGLE_VALUE_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Color Based Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_BASED_CONSTRAINT_OPERATION_COUNT = SINGLE_VALUE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.TextureBasedConstraintImpl <em>Texture Based Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.TextureBasedConstraintImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getTextureBasedConstraint()
	 * @generated
	 */
	int TEXTURE_BASED_CONSTRAINT = 69;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE_BASED_CONSTRAINT__VARIABILITY = SINGLE_VALUE_CONSTRAINT__VARIABILITY;

	/**
	 * The feature id for the '<em><b>Constrained Attribute Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE = SINGLE_VALUE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Texture Based Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE_BASED_CONSTRAINT_FEATURE_COUNT = SINGLE_VALUE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Texture Based Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE_BASED_CONSTRAINT_OPERATION_COUNT = SINGLE_VALUE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.ModelBasedConstraintImpl <em>Model Based Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.ModelBasedConstraintImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getModelBasedConstraint()
	 * @generated
	 */
	int MODEL_BASED_CONSTRAINT = 70;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_BASED_CONSTRAINT__VARIABILITY = SINGLE_VALUE_CONSTRAINT__VARIABILITY;

	/**
	 * The feature id for the '<em><b>Constrained Attribute Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE = SINGLE_VALUE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model Based Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_BASED_CONSTRAINT_FEATURE_COUNT = SINGLE_VALUE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Model Based Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_BASED_CONSTRAINT_OPERATION_COUNT = SINGLE_VALUE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.ParticleBasedConstraintImpl <em>Particle Based Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.ParticleBasedConstraintImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getParticleBasedConstraint()
	 * @generated
	 */
	int PARTICLE_BASED_CONSTRAINT = 71;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICLE_BASED_CONSTRAINT__VARIABILITY = SINGLE_VALUE_CONSTRAINT__VARIABILITY;

	/**
	 * The feature id for the '<em><b>Constrained Attribute Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICLE_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE = SINGLE_VALUE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Particle Based Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICLE_BASED_CONSTRAINT_FEATURE_COUNT = SINGLE_VALUE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Particle Based Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICLE_BASED_CONSTRAINT_OPERATION_COUNT = SINGLE_VALUE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.AudioBasedConstraintImpl <em>Audio Based Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.AudioBasedConstraintImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getAudioBasedConstraint()
	 * @generated
	 */
	int AUDIO_BASED_CONSTRAINT = 72;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_BASED_CONSTRAINT__VARIABILITY = SINGLE_VALUE_CONSTRAINT__VARIABILITY;

	/**
	 * The feature id for the '<em><b>Constrained Attribute Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE = SINGLE_VALUE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Audio Based Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_BASED_CONSTRAINT_FEATURE_COUNT = SINGLE_VALUE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Audio Based Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_BASED_CONSTRAINT_OPERATION_COUNT = SINGLE_VALUE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.LetterConstraintRule <em>Letter Constraint Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.LetterConstraintRule
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getLetterConstraintRule()
	 * @generated
	 */
	int LETTER_CONSTRAINT_RULE = 76;

	/**
	 * The number of structural features of the '<em>Letter Constraint Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LETTER_CONSTRAINT_RULE_FEATURE_COUNT = ATTRIBUTE_CONSTRAINT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Letter Constraint Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LETTER_CONSTRAINT_RULE_OPERATION_COUNT = ATTRIBUTE_CONSTRAINT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.LetterLengthConstraintImpl <em>Letter Length Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.LetterLengthConstraintImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getLetterLengthConstraint()
	 * @generated
	 */
	int LETTER_LENGTH_CONSTRAINT = 73;

	/**
	 * The feature id for the '<em><b>Maximum Length Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LETTER_LENGTH_CONSTRAINT__MAXIMUM_LENGTH_ATTRIBUTE = LETTER_CONSTRAINT_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Minimum Length Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LETTER_LENGTH_CONSTRAINT__MINIMUM_LENGTH_ATTRIBUTE = LETTER_CONSTRAINT_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Letter Length Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LETTER_LENGTH_CONSTRAINT_FEATURE_COUNT = LETTER_CONSTRAINT_RULE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Letter Length Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LETTER_LENGTH_CONSTRAINT_OPERATION_COUNT = LETTER_CONSTRAINT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.LetterCustomizationConstraintImpl <em>Letter Customization Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.LetterCustomizationConstraintImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getLetterCustomizationConstraint()
	 * @generated
	 */
	int LETTER_CUSTOMIZATION_CONSTRAINT = 74;

	/**
	 * The feature id for the '<em><b>Filter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LETTER_CUSTOMIZATION_CONSTRAINT__FILTER_TYPE = LETTER_CONSTRAINT_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter Strings</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LETTER_CUSTOMIZATION_CONSTRAINT__FILTER_STRINGS = LETTER_CONSTRAINT_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Letter Customization Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LETTER_CUSTOMIZATION_CONSTRAINT_FEATURE_COUNT = LETTER_CONSTRAINT_RULE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Letter Customization Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LETTER_CUSTOMIZATION_CONSTRAINT_OPERATION_COUNT = LETTER_CONSTRAINT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.Vector2DConstraintRule <em>Vector2 DConstraint Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.Vector2DConstraintRule
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getVector2DConstraintRule()
	 * @generated
	 */
	int VECTOR2_DCONSTRAINT_RULE = 78;

	/**
	 * The number of structural features of the '<em>Vector2 DConstraint Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR2_DCONSTRAINT_RULE_FEATURE_COUNT = ATTRIBUTE_CONSTRAINT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Vector2 DConstraint Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR2_DCONSTRAINT_RULE_OPERATION_COUNT = ATTRIBUTE_CONSTRAINT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.Vector2DRangeBasedConstraintImpl <em>Vector2 DRange Based Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.Vector2DRangeBasedConstraintImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getVector2DRangeBasedConstraint()
	 * @generated
	 */
	int VECTOR2_DRANGE_BASED_CONSTRAINT = 77;

	/**
	 * The feature id for the '<em><b>Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR2_DRANGE_BASED_CONSTRAINT__LIMIT = VECTOR2_DCONSTRAINT_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Minimum Vector2 DAttribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR2_DRANGE_BASED_CONSTRAINT__MINIMUM_VECTOR2_DATTRIBUTE = VECTOR2_DCONSTRAINT_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Maximum Vector2 DAttribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR2_DRANGE_BASED_CONSTRAINT__MAXIMUM_VECTOR2_DATTRIBUTE = VECTOR2_DCONSTRAINT_RULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Vector2 DRange Based Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR2_DRANGE_BASED_CONSTRAINT_FEATURE_COUNT = VECTOR2_DCONSTRAINT_RULE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Vector2 DRange Based Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR2_DRANGE_BASED_CONSTRAINT_OPERATION_COUNT = VECTOR2_DCONSTRAINT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.VectorConstraintRule <em>Vector Constraint Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.VectorConstraintRule
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getVectorConstraintRule()
	 * @generated
	 */
	int VECTOR_CONSTRAINT_RULE = 79;

	/**
	 * The number of structural features of the '<em>Vector Constraint Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_CONSTRAINT_RULE_FEATURE_COUNT = ATTRIBUTE_CONSTRAINT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Vector Constraint Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_CONSTRAINT_RULE_OPERATION_COUNT = ATTRIBUTE_CONSTRAINT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.VectorRangeBasedConstraintImpl <em>Vector Range Based Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.VectorRangeBasedConstraintImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getVectorRangeBasedConstraint()
	 * @generated
	 */
	int VECTOR_RANGE_BASED_CONSTRAINT = 80;

	/**
	 * The feature id for the '<em><b>Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_RANGE_BASED_CONSTRAINT__LIMIT = VECTOR_CONSTRAINT_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximum Vector Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_RANGE_BASED_CONSTRAINT__MAXIMUM_VECTOR_ATTRIBUTE = VECTOR_CONSTRAINT_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Minimum Vector Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_RANGE_BASED_CONSTRAINT__MINIMUM_VECTOR_ATTRIBUTE = VECTOR_CONSTRAINT_RULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Vector Range Based Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_RANGE_BASED_CONSTRAINT_FEATURE_COUNT = VECTOR_CONSTRAINT_RULE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Vector Range Based Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_RANGE_BASED_CONSTRAINT_OPERATION_COUNT = VECTOR_CONSTRAINT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.RangeBasedConstraint <em>Range Based Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.RangeBasedConstraint
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getRangeBasedConstraint()
	 * @generated
	 */
	int RANGE_BASED_CONSTRAINT = 81;

	/**
	 * The feature id for the '<em><b>Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_BASED_CONSTRAINT__LIMIT = 0;

	/**
	 * The number of structural features of the '<em>Range Based Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_BASED_CONSTRAINT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Range Based Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_BASED_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.RotatorConstraintRule <em>Rotator Constraint Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.RotatorConstraintRule
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getRotatorConstraintRule()
	 * @generated
	 */
	int ROTATOR_CONSTRAINT_RULE = 82;

	/**
	 * The number of structural features of the '<em>Rotator Constraint Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATOR_CONSTRAINT_RULE_FEATURE_COUNT = ATTRIBUTE_CONSTRAINT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rotator Constraint Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATOR_CONSTRAINT_RULE_OPERATION_COUNT = ATTRIBUTE_CONSTRAINT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.RotatorRangeBasedConstraintImpl <em>Rotator Range Based Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.RotatorRangeBasedConstraintImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getRotatorRangeBasedConstraint()
	 * @generated
	 */
	int ROTATOR_RANGE_BASED_CONSTRAINT = 83;

	/**
	 * The feature id for the '<em><b>Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATOR_RANGE_BASED_CONSTRAINT__LIMIT = ROTATOR_CONSTRAINT_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximum Rotator Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATOR_RANGE_BASED_CONSTRAINT__MAXIMUM_ROTATOR_ATTRIBUTE = ROTATOR_CONSTRAINT_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Minimum Rotator Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATOR_RANGE_BASED_CONSTRAINT__MINIMUM_ROTATOR_ATTRIBUTE = ROTATOR_CONSTRAINT_RULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rotator Range Based Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATOR_RANGE_BASED_CONSTRAINT_FEATURE_COUNT = ROTATOR_CONSTRAINT_RULE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Rotator Range Based Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATOR_RANGE_BASED_CONSTRAINT_OPERATION_COUNT = ROTATOR_CONSTRAINT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.TransformationConstraintRule <em>Transformation Constraint Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.TransformationConstraintRule
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getTransformationConstraintRule()
	 * @generated
	 */
	int TRANSFORMATION_CONSTRAINT_RULE = 84;

	/**
	 * The number of structural features of the '<em>Transformation Constraint Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CONSTRAINT_RULE_FEATURE_COUNT = ATTRIBUTE_CONSTRAINT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transformation Constraint Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CONSTRAINT_RULE_OPERATION_COUNT = ATTRIBUTE_CONSTRAINT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.TransformationRangeBasedConstraintImpl <em>Transformation Range Based Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.TransformationRangeBasedConstraintImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getTransformationRangeBasedConstraint()
	 * @generated
	 */
	int TRANSFORMATION_RANGE_BASED_CONSTRAINT = 85;

	/**
	 * The feature id for the '<em><b>Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_RANGE_BASED_CONSTRAINT__LIMIT = TRANSFORMATION_CONSTRAINT_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximum Transformation Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_RANGE_BASED_CONSTRAINT__MAXIMUM_TRANSFORMATION_ATTRIBUTE = TRANSFORMATION_CONSTRAINT_RULE_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Minimum Transformation Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_RANGE_BASED_CONSTRAINT__MINIMUM_TRANSFORMATION_ATTRIBUTE = TRANSFORMATION_CONSTRAINT_RULE_FEATURE_COUNT
			+ 2;

	/**
	 * The number of structural features of the '<em>Transformation Range Based Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_RANGE_BASED_CONSTRAINT_FEATURE_COUNT = TRANSFORMATION_CONSTRAINT_RULE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Transformation Range Based Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_RANGE_BASED_CONSTRAINT_OPERATION_COUNT = TRANSFORMATION_CONSTRAINT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.CustomizationType <em>Customization Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.CustomizationType
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getCustomizationType()
	 * @generated
	 */
	int CUSTOMIZATION_TYPE = 86;

	/**
	 * The feature id for the '<em><b>Filter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMIZATION_TYPE__FILTER_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Customization Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMIZATION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Customization Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMIZATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.ColorConstraintRule <em>Color Constraint Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.ColorConstraintRule
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getColorConstraintRule()
	 * @generated
	 */
	int COLOR_CONSTRAINT_RULE = 88;

	/**
	 * The number of structural features of the '<em>Color Constraint Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_CONSTRAINT_RULE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Color Constraint Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_CONSTRAINT_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.ColorCustomizationConstraintImpl <em>Color Customization Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.ColorCustomizationConstraintImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getColorCustomizationConstraint()
	 * @generated
	 */
	int COLOR_CUSTOMIZATION_CONSTRAINT = 87;

	/**
	 * The feature id for the '<em><b>Filter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_CUSTOMIZATION_CONSTRAINT__FILTER_TYPE = COLOR_CONSTRAINT_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter Colors</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_CUSTOMIZATION_CONSTRAINT__FILTER_COLORS = COLOR_CONSTRAINT_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Color Customization Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_CUSTOMIZATION_CONSTRAINT_FEATURE_COUNT = COLOR_CONSTRAINT_RULE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Color Customization Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_CUSTOMIZATION_CONSTRAINT_OPERATION_COUNT = COLOR_CONSTRAINT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.EnumBasedConstraintImpl <em>Enum Based Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.EnumBasedConstraintImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getEnumBasedConstraint()
	 * @generated
	 */
	int ENUM_BASED_CONSTRAINT = 89;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_BASED_CONSTRAINT__VARIABILITY = SINGLE_VALUE_CONSTRAINT__VARIABILITY;

	/**
	 * The feature id for the '<em><b>Constrained Attribute Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE = SINGLE_VALUE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum Based Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_BASED_CONSTRAINT_FEATURE_COUNT = SINGLE_VALUE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enum Based Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_BASED_CONSTRAINT_OPERATION_COUNT = SINGLE_VALUE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.SimpleEnumStructureImpl <em>Simple Enum Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.SimpleEnumStructureImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getSimpleEnumStructure()
	 * @generated
	 */
	int SIMPLE_ENUM_STRUCTURE = 90;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ENUM_STRUCTURE__FEATURE_NAME = ENUMERATION_BASED_STRUCTURE__FEATURE_NAME;

	/**
	 * The feature id for the '<em><b>Enum States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ENUM_STRUCTURE__ENUM_STATES = ENUMERATION_BASED_STRUCTURE__ENUM_STATES;

	/**
	 * The number of structural features of the '<em>Simple Enum Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ENUM_STRUCTURE_FEATURE_COUNT = ENUMERATION_BASED_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Enum Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ENUM_STRUCTURE_OPERATION_COUNT = ENUMERATION_BASED_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.BitmaskedEnumStructureImpl <em>Bitmasked Enum Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.BitmaskedEnumStructureImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getBitmaskedEnumStructure()
	 * @generated
	 */
	int BITMASKED_ENUM_STRUCTURE = 91;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMASKED_ENUM_STRUCTURE__FEATURE_NAME = ENUMERATION_BASED_STRUCTURE__FEATURE_NAME;

	/**
	 * The feature id for the '<em><b>Enum States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMASKED_ENUM_STRUCTURE__ENUM_STATES = ENUMERATION_BASED_STRUCTURE__ENUM_STATES;

	/**
	 * The number of structural features of the '<em>Bitmasked Enum Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMASKED_ENUM_STRUCTURE_FEATURE_COUNT = ENUMERATION_BASED_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bitmasked Enum Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMASKED_ENUM_STRUCTURE_OPERATION_COUNT = ENUMERATION_BASED_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.GameStructureContainerImpl <em>Game Structure Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.GameStructureContainerImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getGameStructureContainer()
	 * @generated
	 */
	int GAME_STRUCTURE_CONTAINER = 92;

	/**
	 * The feature id for the '<em><b>Feature Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_STRUCTURE_CONTAINER__FEATURE_CATEGORY = GAME_FEATURE_CONTAINER__FEATURE_CATEGORY;

	/**
	 * The feature id for the '<em><b>Game Structures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_STRUCTURE_CONTAINER__GAME_STRUCTURES = GAME_FEATURE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Game Structure Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_STRUCTURE_CONTAINER_FEATURE_COUNT = GAME_FEATURE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Game Structure Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_STRUCTURE_CONTAINER_OPERATION_COUNT = GAME_FEATURE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.EnumBasedAttributeImpl <em>Enum Based Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.EnumBasedAttributeImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getEnumBasedAttribute()
	 * @generated
	 */
	int ENUM_BASED_ATTRIBUTE = 94;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_BASED_ATTRIBUTE__FEATURE_NAME = GAME_ATTRIBUTE__FEATURE_NAME;

	/**
	 * The feature id for the '<em><b>Enum Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_BASED_ATTRIBUTE__ENUM_TYPE = GAME_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum Based Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_BASED_ATTRIBUTE_FEATURE_COUNT = GAME_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enum Based Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_BASED_ATTRIBUTE_OPERATION_COUNT = GAME_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.StructureBasedAttributeImpl <em>Structure Based Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.StructureBasedAttributeImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getStructureBasedAttribute()
	 * @generated
	 */
	int STRUCTURE_BASED_ATTRIBUTE = 95;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_BASED_ATTRIBUTE__FEATURE_NAME = GAME_ATTRIBUTE__FEATURE_NAME;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_BASED_ATTRIBUTE__DATA_TYPE = GAME_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Structure Based Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_BASED_ATTRIBUTE_FEATURE_COUNT = GAME_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Structure Based Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_BASED_ATTRIBUTE_OPERATION_COUNT = GAME_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.StructureBasedConstraintImpl <em>Structure Based Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.StructureBasedConstraintImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getStructureBasedConstraint()
	 * @generated
	 */
	int STRUCTURE_BASED_CONSTRAINT = 96;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_BASED_CONSTRAINT__VARIABILITY = SINGLE_VALUE_CONSTRAINT__VARIABILITY;

	/**
	 * The feature id for the '<em><b>Constrained Attribute Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE = SINGLE_VALUE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Structure Based Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_BASED_CONSTRAINT_FEATURE_COUNT = SINGLE_VALUE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Structure Based Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_BASED_CONSTRAINT_OPERATION_COUNT = SINGLE_VALUE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.GetterDistortionConstraintImpl <em>Getter Distortion Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.GetterDistortionConstraintImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getGetterDistortionConstraint()
	 * @generated
	 */
	int GETTER_DISTORTION_CONSTRAINT = 97;

	/**
	 * The feature id for the '<em><b>Distortion Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GETTER_DISTORTION_CONSTRAINT__DISTORTION_ATTRIBUTE = DISTORTION_CONSTRAINT__DISTORTION_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Distortion Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GETTER_DISTORTION_CONSTRAINT__DISTORTION_MODE = DISTORTION_CONSTRAINT__DISTORTION_MODE;

	/**
	 * The number of structural features of the '<em>Getter Distortion Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GETTER_DISTORTION_CONSTRAINT_FEATURE_COUNT = DISTORTION_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Getter Distortion Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GETTER_DISTORTION_CONSTRAINT_OPERATION_COUNT = DISTORTION_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.SetterDistortionConstraintImpl <em>Setter Distortion Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.SetterDistortionConstraintImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getSetterDistortionConstraint()
	 * @generated
	 */
	int SETTER_DISTORTION_CONSTRAINT = 98;

	/**
	 * The feature id for the '<em><b>Distortion Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_DISTORTION_CONSTRAINT__DISTORTION_ATTRIBUTE = DISTORTION_CONSTRAINT__DISTORTION_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Distortion Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_DISTORTION_CONSTRAINT__DISTORTION_MODE = DISTORTION_CONSTRAINT__DISTORTION_MODE;

	/**
	 * The number of structural features of the '<em>Setter Distortion Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_DISTORTION_CONSTRAINT_FEATURE_COUNT = DISTORTION_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Setter Distortion Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_DISTORTION_CONSTRAINT_OPERATION_COUNT = DISTORTION_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.MaterialBasedConstraintImpl <em>Material Based Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.MaterialBasedConstraintImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getMaterialBasedConstraint()
	 * @generated
	 */
	int MATERIAL_BASED_CONSTRAINT = 99;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_BASED_CONSTRAINT__VARIABILITY = SINGLE_VALUE_CONSTRAINT__VARIABILITY;

	/**
	 * The feature id for the '<em><b>Constrained Attribute Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE = SINGLE_VALUE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Material Based Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_BASED_CONSTRAINT_FEATURE_COUNT = SINGLE_VALUE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Material Based Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_BASED_CONSTRAINT_OPERATION_COUNT = SINGLE_VALUE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.impl.MaterialBasedAttributeImpl <em>Material Based Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.impl.MaterialBasedAttributeImpl
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getMaterialBasedAttribute()
	 * @generated
	 */
	int MATERIAL_BASED_ATTRIBUTE = 100;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_BASED_ATTRIBUTE__FEATURE_NAME = GAME_ATTRIBUTE__FEATURE_NAME;

	/**
	 * The number of structural features of the '<em>Material Based Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_BASED_ATTRIBUTE_FEATURE_COUNT = GAME_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Material Based Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_BASED_ATTRIBUTE_OPERATION_COUNT = GAME_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.AdditionLimit <em>Addition Limit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.AdditionLimit
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getAdditionLimit()
	 * @generated
	 */
	int ADDITION_LIMIT = 101;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.VariabilityType <em>Variability Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.VariabilityType
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getVariabilityType()
	 * @generated
	 */
	int VARIABILITY_TYPE = 102;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.FilteringType <em>Filtering Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.FilteringType
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getFilteringType()
	 * @generated
	 */
	int FILTERING_TYPE = 103;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.ArithmeticOperations <em>Arithmetic Operations</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.ArithmeticOperations
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getArithmeticOperations()
	 * @generated
	 */
	int ARITHMETIC_OPERATIONS = 104;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.UGSML.InitializationMode <em>Initialization Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.UGSML.InitializationMode
	 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getInitializationMode()
	 * @generated
	 */
	int INITIALIZATION_MODE = 105;

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sirius.sample.UGSML.Root#getGame <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Game</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.Root#getGame()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Game();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.Game
	 * @generated
	 */
	EClass getGame();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.UGSML.Game#getGameTitle <em>Game Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Game Title</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.Game#getGameTitle()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_GameTitle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.UGSML.Game#getGameFeatureContainers <em>Game Feature Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Game Feature Containers</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.Game#getGameFeatureContainers()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_GameFeatureContainers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.UGSML.Game#getGameSystems <em>Game Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Game Systems</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.Game#getGameSystems()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_GameSystems();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.UGSML.Game#getGameVersionName <em>Game Version Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Game Version Name</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.Game#getGameVersionName()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_GameVersionName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.UGSML.Game#getGameVersionNumber <em>Game Version Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Game Version Number</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.Game#getGameVersionNumber()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_GameVersionNumber();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.GameFeatureContainer <em>Game Feature Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Feature Container</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.GameFeatureContainer
	 * @generated
	 */
	EClass getGameFeatureContainer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.UGSML.GameFeatureContainer#getFeatureCategory <em>Feature Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Category</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.GameFeatureContainer#getFeatureCategory()
	 * @see #getGameFeatureContainer()
	 * @generated
	 */
	EAttribute getGameFeatureContainer_FeatureCategory();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.GameAttributeContainer <em>Game Attribute Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Attribute Container</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.GameAttributeContainer
	 * @generated
	 */
	EClass getGameAttributeContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.UGSML.GameAttributeContainer#getGameAttributes <em>Game Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Game Attributes</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.GameAttributeContainer#getGameAttributes()
	 * @see #getGameAttributeContainer()
	 * @generated
	 */
	EReference getGameAttributeContainer_GameAttributes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.GameFeature <em>Game Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Feature</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.GameFeature
	 * @generated
	 */
	EClass getGameFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.UGSML.GameFeature#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.GameFeature#getFeatureName()
	 * @see #getGameFeature()
	 * @generated
	 */
	EAttribute getGameFeature_FeatureName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.GameAttribute <em>Game Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Attribute</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.GameAttribute
	 * @generated
	 */
	EClass getGameAttribute();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.EnumerationBasedStructure <em>Enumeration Based Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Based Structure</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.EnumerationBasedStructure
	 * @generated
	 */
	EClass getEnumerationBasedStructure();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.UGSML.EnumerationBasedStructure#getEnumStates <em>Enum States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enum States</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.EnumerationBasedStructure#getEnumStates()
	 * @see #getEnumerationBasedStructure()
	 * @generated
	 */
	EReference getEnumerationBasedStructure_EnumStates();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.EnumState <em>Enum State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum State</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.EnumState
	 * @generated
	 */
	EClass getEnumState();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.DataBasedStructure <em>Data Based Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Based Structure</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.DataBasedStructure
	 * @generated
	 */
	EClass getDataBasedStructure();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.UGSML.DataBasedStructure#getStructureAttributes <em>Structure Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Structure Attributes</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.DataBasedStructure#getStructureAttributes()
	 * @see #getDataBasedStructure()
	 * @generated
	 */
	EReference getDataBasedStructure_StructureAttributes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.BooleanBasedAttribute <em>Boolean Based Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Based Attribute</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.BooleanBasedAttribute
	 * @generated
	 */
	EClass getBooleanBasedAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.UGSML.BooleanBasedAttribute#isDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.BooleanBasedAttribute#isDefaultValue()
	 * @see #getBooleanBasedAttribute()
	 * @generated
	 */
	EAttribute getBooleanBasedAttribute_DefaultValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.ValueBasedAttribute <em>Value Based Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Based Attribute</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.ValueBasedAttribute
	 * @generated
	 */
	EClass getValueBasedAttribute();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.LetterBasedAttribute <em>Letter Based Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Letter Based Attribute</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.LetterBasedAttribute
	 * @generated
	 */
	EClass getLetterBasedAttribute();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.NameBasedAttribute <em>Name Based Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Based Attribute</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.NameBasedAttribute
	 * @generated
	 */
	EClass getNameBasedAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.UGSML.NameBasedAttribute#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.NameBasedAttribute#getDefaultValue()
	 * @see #getNameBasedAttribute()
	 * @generated
	 */
	EAttribute getNameBasedAttribute_DefaultValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.StringBasedAttribute <em>String Based Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Based Attribute</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.StringBasedAttribute
	 * @generated
	 */
	EClass getStringBasedAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.UGSML.StringBasedAttribute#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.StringBasedAttribute#getDefaultValue()
	 * @see #getStringBasedAttribute()
	 * @generated
	 */
	EAttribute getStringBasedAttribute_DefaultValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.TextBasedAttribute <em>Text Based Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Based Attribute</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.TextBasedAttribute
	 * @generated
	 */
	EClass getTextBasedAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.UGSML.TextBasedAttribute#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.TextBasedAttribute#getDefaultValue()
	 * @see #getTextBasedAttribute()
	 * @generated
	 */
	EAttribute getTextBasedAttribute_DefaultValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.Vector2DBasedAttribute <em>Vector2 DBased Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vector2 DBased Attribute</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.Vector2DBasedAttribute
	 * @generated
	 */
	EClass getVector2DBasedAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.UGSML.Vector2DBasedAttribute#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.Vector2DBasedAttribute#getX()
	 * @see #getVector2DBasedAttribute()
	 * @generated
	 */
	EAttribute getVector2DBasedAttribute_X();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.UGSML.Vector2DBasedAttribute#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.Vector2DBasedAttribute#getY()
	 * @see #getVector2DBasedAttribute()
	 * @generated
	 */
	EAttribute getVector2DBasedAttribute_Y();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.VectorBasedAttribute <em>Vector Based Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vector Based Attribute</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.VectorBasedAttribute
	 * @generated
	 */
	EClass getVectorBasedAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.UGSML.VectorBasedAttribute#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.VectorBasedAttribute#getX()
	 * @see #getVectorBasedAttribute()
	 * @generated
	 */
	EAttribute getVectorBasedAttribute_X();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.UGSML.VectorBasedAttribute#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.VectorBasedAttribute#getY()
	 * @see #getVectorBasedAttribute()
	 * @generated
	 */
	EAttribute getVectorBasedAttribute_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.UGSML.VectorBasedAttribute#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.VectorBasedAttribute#getZ()
	 * @see #getVectorBasedAttribute()
	 * @generated
	 */
	EAttribute getVectorBasedAttribute_Z();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.sirius.sample.UGSML.VectorBasedAttribute#getTOwningTransformation <em>TOwning Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>TOwning Transformation</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.VectorBasedAttribute#getTOwningTransformation()
	 * @see #getVectorBasedAttribute()
	 * @generated
	 */
	EReference getVectorBasedAttribute_TOwningTransformation();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.sirius.sample.UGSML.VectorBasedAttribute#getSOwningTransformation <em>SOwning Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>SOwning Transformation</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.VectorBasedAttribute#getSOwningTransformation()
	 * @see #getVectorBasedAttribute()
	 * @generated
	 */
	EReference getVectorBasedAttribute_SOwningTransformation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.RotatorBasedAttribute <em>Rotator Based Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotator Based Attribute</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.RotatorBasedAttribute
	 * @generated
	 */
	EClass getRotatorBasedAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.UGSML.RotatorBasedAttribute#getRoll <em>Roll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Roll</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.RotatorBasedAttribute#getRoll()
	 * @see #getRotatorBasedAttribute()
	 * @generated
	 */
	EAttribute getRotatorBasedAttribute_Roll();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.UGSML.RotatorBasedAttribute#getPitch <em>Pitch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pitch</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.RotatorBasedAttribute#getPitch()
	 * @see #getRotatorBasedAttribute()
	 * @generated
	 */
	EAttribute getRotatorBasedAttribute_Pitch();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.UGSML.RotatorBasedAttribute#getYaw <em>Yaw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yaw</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.RotatorBasedAttribute#getYaw()
	 * @see #getRotatorBasedAttribute()
	 * @generated
	 */
	EAttribute getRotatorBasedAttribute_Yaw();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.sirius.sample.UGSML.RotatorBasedAttribute#getROwningTransformation <em>ROwning Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>ROwning Transformation</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.RotatorBasedAttribute#getROwningTransformation()
	 * @see #getRotatorBasedAttribute()
	 * @generated
	 */
	EReference getRotatorBasedAttribute_ROwningTransformation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.TransformationBasedAttribute <em>Transformation Based Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation Based Attribute</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.TransformationBasedAttribute
	 * @generated
	 */
	EClass getTransformationBasedAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sirius.sample.UGSML.TransformationBasedAttribute#getTranslation <em>Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Translation</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.TransformationBasedAttribute#getTranslation()
	 * @see #getTransformationBasedAttribute()
	 * @generated
	 */
	EReference getTransformationBasedAttribute_Translation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sirius.sample.UGSML.TransformationBasedAttribute#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rotation</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.TransformationBasedAttribute#getRotation()
	 * @see #getTransformationBasedAttribute()
	 * @generated
	 */
	EReference getTransformationBasedAttribute_Rotation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sirius.sample.UGSML.TransformationBasedAttribute#getScale3D <em>Scale3 D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scale3 D</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.TransformationBasedAttribute#getScale3D()
	 * @see #getTransformationBasedAttribute()
	 * @generated
	 */
	EReference getTransformationBasedAttribute_Scale3D();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.ColorBasedAttribute <em>Color Based Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color Based Attribute</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.ColorBasedAttribute
	 * @generated
	 */
	EClass getColorBasedAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.UGSML.ColorBasedAttribute#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.ColorBasedAttribute#getR()
	 * @see #getColorBasedAttribute()
	 * @generated
	 */
	EAttribute getColorBasedAttribute_R();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.UGSML.ColorBasedAttribute#getG <em>G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>G</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.ColorBasedAttribute#getG()
	 * @see #getColorBasedAttribute()
	 * @generated
	 */
	EAttribute getColorBasedAttribute_G();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.UGSML.ColorBasedAttribute#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.ColorBasedAttribute#getB()
	 * @see #getColorBasedAttribute()
	 * @generated
	 */
	EAttribute getColorBasedAttribute_B();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.UGSML.ColorBasedAttribute#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>A</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.ColorBasedAttribute#getA()
	 * @see #getColorBasedAttribute()
	 * @generated
	 */
	EAttribute getColorBasedAttribute_A();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.TextureBasedAttribute <em>Texture Based Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Texture Based Attribute</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.TextureBasedAttribute
	 * @generated
	 */
	EClass getTextureBasedAttribute();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.GameItemContainer <em>Game Item Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Item Container</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.GameItemContainer
	 * @generated
	 */
	EClass getGameItemContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.UGSML.GameItemContainer#getGameItems <em>Game Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Game Items</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.GameItemContainer#getGameItems()
	 * @see #getGameItemContainer()
	 * @generated
	 */
	EReference getGameItemContainer_GameItems();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.GameItem <em>Game Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Item</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.GameItem
	 * @generated
	 */
	EClass getGameItem();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.UGSML.GameItem#getItemAttributeInstances <em>Item Attribute Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Item Attribute Instances</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.GameItem#getItemAttributeInstances()
	 * @see #getGameItem()
	 * @generated
	 */
	EReference getGameItem_ItemAttributeInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.UGSML.GameItem#getItemModes <em>Item Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item Modes</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.GameItem#getItemModes()
	 * @see #getGameItem()
	 * @generated
	 */
	EReference getGameItem_ItemModes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.UGSML.GameItem#getDerivedItems <em>Derived Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Derived Items</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.GameItem#getDerivedItems()
	 * @see #getGameItem()
	 * @generated
	 */
	EReference getGameItem_DerivedItems();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.sirius.sample.UGSML.GameItem#getParentItem <em>Parent Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Item</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.GameItem#getParentItem()
	 * @see #getGameItem()
	 * @generated
	 */
	EReference getGameItem_ParentItem();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.UGSML.GameItem#getPlacableInventories <em>Placable Inventories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Placable Inventories</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.GameItem#getPlacableInventories()
	 * @see #getGameItem()
	 * @generated
	 */
	EReference getGameItem_PlacableInventories();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.UGSML.GameItem#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.GameItem#isIsAbstract()
	 * @see #getGameItem()
	 * @generated
	 */
	EAttribute getGameItem_IsAbstract();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.ItemMode <em>Item Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Mode</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.ItemMode
	 * @generated
	 */
	EClass getItemMode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.GameSystem <em>Game System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game System</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.GameSystem
	 * @generated
	 */
	EClass getGameSystem();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.UGSML.GameSystem#getSystemName <em>System Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Name</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.GameSystem#getSystemName()
	 * @see #getGameSystem()
	 * @generated
	 */
	EAttribute getGameSystem_SystemName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.AttributeSystem <em>Attribute System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute System</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.AttributeSystem
	 * @generated
	 */
	EClass getAttributeSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.UGSML.AttributeSystem#getArrayConstraints <em>Array Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Array Constraints</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.AttributeSystem#getArrayConstraints()
	 * @see #getAttributeSystem()
	 * @generated
	 */
	EReference getAttributeSystem_ArrayConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.UGSML.AttributeSystem#getSingleValueConstraints <em>Single Value Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Single Value Constraints</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.AttributeSystem#getSingleValueConstraints()
	 * @see #getAttributeSystem()
	 * @generated
	 */
	EReference getAttributeSystem_SingleValueConstraints();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.UGSML.AttributeSystem#getParentAttributeSystem <em>Parent Attribute System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Attribute System</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.AttributeSystem#getParentAttributeSystem()
	 * @see #getAttributeSystem()
	 * @generated
	 */
	EReference getAttributeSystem_ParentAttributeSystem();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.GameSystemConstraint <em>Game System Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game System Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.GameSystemConstraint
	 * @generated
	 */
	EClass getGameSystemConstraint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.AttributeSystemConstraint <em>Attribute System Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute System Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.AttributeSystemConstraint
	 * @generated
	 */
	EClass getAttributeSystemConstraint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.BaseGameConstraintRule <em>Base Game Constraint Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Game Constraint Rule</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.BaseGameConstraintRule
	 * @generated
	 */
	EClass getBaseGameConstraintRule();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.AttributeConstraintRule <em>Attribute Constraint Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Constraint Rule</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.AttributeConstraintRule
	 * @generated
	 */
	EClass getAttributeConstraintRule();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.ArrayConstraint <em>Array Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.ArrayConstraint
	 * @generated
	 */
	EClass getArrayConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.UGSML.ArrayConstraint#getConstrainedAttributeInstance <em>Constrained Attribute Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constrained Attribute Instance</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.ArrayConstraint#getConstrainedAttributeInstance()
	 * @see #getArrayConstraint()
	 * @generated
	 */
	EReference getArrayConstraint_ConstrainedAttributeInstance();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.BooleanBasedConstraint <em>Boolean Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Based Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.BooleanBasedConstraint
	 * @generated
	 */
	EClass getBooleanBasedConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.UGSML.BooleanBasedConstraint#getConstrainedAttributeInstance <em>Constrained Attribute Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constrained Attribute Instance</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.BooleanBasedConstraint#getConstrainedAttributeInstance()
	 * @see #getBooleanBasedConstraint()
	 * @generated
	 */
	EReference getBooleanBasedConstraint_ConstrainedAttributeInstance();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.ValueBasedConstraint <em>Value Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Based Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.ValueBasedConstraint
	 * @generated
	 */
	EClass getValueBasedConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.UGSML.ValueBasedConstraint#getConstrainedAttributeInstance <em>Constrained Attribute Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constrained Attribute Instance</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.ValueBasedConstraint#getConstrainedAttributeInstance()
	 * @see #getValueBasedConstraint()
	 * @generated
	 */
	EReference getValueBasedConstraint_ConstrainedAttributeInstance();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sirius.sample.UGSML.ValueBasedConstraint#getBaseOrRangeConstraint <em>Base Or Range Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base Or Range Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.ValueBasedConstraint#getBaseOrRangeConstraint()
	 * @see #getValueBasedConstraint()
	 * @generated
	 */
	EReference getValueBasedConstraint_BaseOrRangeConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sirius.sample.UGSML.ValueBasedConstraint#getMarginOfError <em>Margin Of Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Margin Of Error</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.ValueBasedConstraint#getMarginOfError()
	 * @see #getValueBasedConstraint()
	 * @generated
	 */
	EReference getValueBasedConstraint_MarginOfError();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sirius.sample.UGSML.ValueBasedConstraint#getRegenerationConstraint <em>Regeneration Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Regeneration Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.ValueBasedConstraint#getRegenerationConstraint()
	 * @see #getValueBasedConstraint()
	 * @generated
	 */
	EReference getValueBasedConstraint_RegenerationConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sirius.sample.UGSML.ValueBasedConstraint#getDirectDependencyConstraint <em>Direct Dependency Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Direct Dependency Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.ValueBasedConstraint#getDirectDependencyConstraint()
	 * @see #getValueBasedConstraint()
	 * @generated
	 */
	EReference getValueBasedConstraint_DirectDependencyConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.UGSML.ValueBasedConstraint#getDistortionConstraints <em>Distortion Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Distortion Constraints</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.ValueBasedConstraint#getDistortionConstraints()
	 * @see #getValueBasedConstraint()
	 * @generated
	 */
	EReference getValueBasedConstraint_DistortionConstraints();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.MinimumValue <em>Minimum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minimum Value</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.MinimumValue
	 * @generated
	 */
	EClass getMinimumValue();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.UGSML.MinimumValue#getMinimumAttribute <em>Minimum Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Minimum Attribute</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.MinimumValue#getMinimumAttribute()
	 * @see #getMinimumValue()
	 * @generated
	 */
	EReference getMinimumValue_MinimumAttribute();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.MaximumValue <em>Maximum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maximum Value</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.MaximumValue
	 * @generated
	 */
	EClass getMaximumValue();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.UGSML.MaximumValue#getMaximumAttribute <em>Maximum Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Maximum Attribute</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.MaximumValue#getMaximumAttribute()
	 * @see #getMaximumValue()
	 * @generated
	 */
	EReference getMaximumValue_MaximumAttribute();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.RegenerationConstraint <em>Regeneration Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regeneration Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.RegenerationConstraint
	 * @generated
	 */
	EClass getRegenerationConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.UGSML.RegenerationConstraint#getRegenerationAttribute <em>Regeneration Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Regeneration Attribute</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.RegenerationConstraint#getRegenerationAttribute()
	 * @see #getRegenerationConstraint()
	 * @generated
	 */
	EReference getRegenerationConstraint_RegenerationAttribute();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.DependencyConstraint <em>Dependency Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.DependencyConstraint
	 * @generated
	 */
	EClass getDependencyConstraint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.LetterBasedConstraint <em>Letter Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Letter Based Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.LetterBasedConstraint
	 * @generated
	 */
	EClass getLetterBasedConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.UGSML.LetterBasedConstraint#getConstrainedAttributeInstance <em>Constrained Attribute Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constrained Attribute Instance</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.LetterBasedConstraint#getConstrainedAttributeInstance()
	 * @see #getLetterBasedConstraint()
	 * @generated
	 */
	EReference getLetterBasedConstraint_ConstrainedAttributeInstance();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sirius.sample.UGSML.LetterBasedConstraint#getLetterLengthConstraint <em>Letter Length Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Letter Length Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.LetterBasedConstraint#getLetterLengthConstraint()
	 * @see #getLetterBasedConstraint()
	 * @generated
	 */
	EReference getLetterBasedConstraint_LetterLengthConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sirius.sample.UGSML.LetterBasedConstraint#getLetterCustomizationConstraint <em>Letter Customization Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Letter Customization Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.LetterBasedConstraint#getLetterCustomizationConstraint()
	 * @see #getLetterBasedConstraint()
	 * @generated
	 */
	EReference getLetterBasedConstraint_LetterCustomizationConstraint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.InventorySystem <em>Inventory System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inventory System</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.InventorySystem
	 * @generated
	 */
	EClass getInventorySystem();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sirius.sample.UGSML.InventorySystem#getInventoryConstraints <em>Inventory Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inventory Constraints</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.InventorySystem#getInventoryConstraints()
	 * @see #getInventorySystem()
	 * @generated
	 */
	EReference getInventorySystem_InventoryConstraints();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.UGSML.InventorySystem#getSystemItems <em>System Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>System Items</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.InventorySystem#getSystemItems()
	 * @see #getInventorySystem()
	 * @generated
	 */
	EReference getInventorySystem_SystemItems();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.InventorySystemConstraint <em>Inventory System Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inventory System Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.InventorySystemConstraint
	 * @generated
	 */
	EClass getInventorySystemConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sirius.sample.UGSML.InventorySystemConstraint#getSelectionConstraint <em>Selection Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selection Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.InventorySystemConstraint#getSelectionConstraint()
	 * @see #getInventorySystemConstraint()
	 * @generated
	 */
	EReference getInventorySystemConstraint_SelectionConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sirius.sample.UGSML.InventorySystemConstraint#getEquipItemConstraint <em>Equip Item Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Equip Item Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.InventorySystemConstraint#getEquipItemConstraint()
	 * @see #getInventorySystemConstraint()
	 * @generated
	 */
	EReference getInventorySystemConstraint_EquipItemConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sirius.sample.UGSML.InventorySystemConstraint#getSlotConstraint <em>Slot Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Slot Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.InventorySystemConstraint#getSlotConstraint()
	 * @see #getInventorySystemConstraint()
	 * @generated
	 */
	EReference getInventorySystemConstraint_SlotConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sirius.sample.UGSML.InventorySystemConstraint#getStackWeightConstraint <em>Stack Weight Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stack Weight Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.InventorySystemConstraint#getStackWeightConstraint()
	 * @see #getInventorySystemConstraint()
	 * @generated
	 */
	EReference getInventorySystemConstraint_StackWeightConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sirius.sample.UGSML.InventorySystemConstraint#getAutoCraftConstraint <em>Auto Craft Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auto Craft Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.InventorySystemConstraint#getAutoCraftConstraint()
	 * @see #getInventorySystemConstraint()
	 * @generated
	 */
	EReference getInventorySystemConstraint_AutoCraftConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sirius.sample.UGSML.InventorySystemConstraint#getVainConstraint <em>Vain Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vain Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.InventorySystemConstraint#getVainConstraint()
	 * @see #getInventorySystemConstraint()
	 * @generated
	 */
	EReference getInventorySystemConstraint_VainConstraint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.InventoryConstraintRule <em>Inventory Constraint Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inventory Constraint Rule</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.InventoryConstraintRule
	 * @generated
	 */
	EClass getInventoryConstraintRule();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.AutoCraftConstraint <em>Auto Craft Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auto Craft Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.AutoCraftConstraint
	 * @generated
	 */
	EClass getAutoCraftConstraint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.StackWeightConstraint <em>Stack Weight Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stack Weight Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.StackWeightConstraint
	 * @generated
	 */
	EClass getStackWeightConstraint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.StackConstraint <em>Stack Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stack Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.StackConstraint
	 * @generated
	 */
	EClass getStackConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.UGSML.StackConstraint#getStackAmount <em>Stack Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stack Amount</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.StackConstraint#getStackAmount()
	 * @see #getStackConstraint()
	 * @generated
	 */
	EAttribute getStackConstraint_StackAmount();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.WeightConstraint <em>Weight Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weight Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.WeightConstraint
	 * @generated
	 */
	EClass getWeightConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.UGSML.WeightConstraint#getTotalWeight <em>Total Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Weight</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.WeightConstraint#getTotalWeight()
	 * @see #getWeightConstraint()
	 * @generated
	 */
	EAttribute getWeightConstraint_TotalWeight();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.SlotConstraint <em>Slot Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slot Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.SlotConstraint
	 * @generated
	 */
	EClass getSlotConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.UGSML.SlotConstraint#getNumberOfSlots <em>Number Of Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Slots</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.SlotConstraint#getNumberOfSlots()
	 * @see #getSlotConstraint()
	 * @generated
	 */
	EAttribute getSlotConstraint_NumberOfSlots();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.UGSML.SlotConstraint#getMaximumSlots <em>Maximum Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Slots</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.SlotConstraint#getMaximumSlots()
	 * @see #getSlotConstraint()
	 * @generated
	 */
	EAttribute getSlotConstraint_MaximumSlots();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.EquipItemConstraint <em>Equip Item Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equip Item Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.EquipItemConstraint
	 * @generated
	 */
	EClass getEquipItemConstraint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.SelectionConstraint <em>Selection Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.SelectionConstraint
	 * @generated
	 */
	EClass getSelectionConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.UGSML.SelectionConstraint#getSelectableAmount <em>Selectable Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selectable Amount</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.SelectionConstraint#getSelectableAmount()
	 * @see #getSelectionConstraint()
	 * @generated
	 */
	EAttribute getSelectionConstraint_SelectableAmount();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.ModelBasedAttribute <em>Model Based Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Based Attribute</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.ModelBasedAttribute
	 * @generated
	 */
	EClass getModelBasedAttribute();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.ParticleBasedAttribute <em>Particle Based Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Particle Based Attribute</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.ParticleBasedAttribute
	 * @generated
	 */
	EClass getParticleBasedAttribute();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.VainConstraint <em>Vain Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vain Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.VainConstraint
	 * @generated
	 */
	EClass getVainConstraint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.BaseValueConstraint <em>Base Value Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Value Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.BaseValueConstraint
	 * @generated
	 */
	EClass getBaseValueConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.UGSML.BaseValueConstraint#getDefaultBaseValue <em>Default Base Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Base Value</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.BaseValueConstraint#getDefaultBaseValue()
	 * @see #getBaseValueConstraint()
	 * @generated
	 */
	EAttribute getBaseValueConstraint_DefaultBaseValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.BaseOrRangeConstraint <em>Base Or Range Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Or Range Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.BaseOrRangeConstraint
	 * @generated
	 */
	EClass getBaseOrRangeConstraint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.ValueRangeBasedConstraint <em>Value Range Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Range Based Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.ValueRangeBasedConstraint
	 * @generated
	 */
	EClass getValueRangeBasedConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sirius.sample.UGSML.ValueRangeBasedConstraint#getMinimumValue <em>Minimum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Minimum Value</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.ValueRangeBasedConstraint#getMinimumValue()
	 * @see #getValueRangeBasedConstraint()
	 * @generated
	 */
	EReference getValueRangeBasedConstraint_MinimumValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sirius.sample.UGSML.ValueRangeBasedConstraint#getMaximumValue <em>Maximum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Maximum Value</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.ValueRangeBasedConstraint#getMaximumValue()
	 * @see #getValueRangeBasedConstraint()
	 * @generated
	 */
	EReference getValueRangeBasedConstraint_MaximumValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.UGSML.ValueRangeBasedConstraint#getInitializer <em>Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initializer</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.ValueRangeBasedConstraint#getInitializer()
	 * @see #getValueRangeBasedConstraint()
	 * @generated
	 */
	EAttribute getValueRangeBasedConstraint_Initializer();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sirius.sample.UGSML.ValueRangeBasedConstraint#getConversionDependencyConstraint <em>Conversion Dependency Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conversion Dependency Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.ValueRangeBasedConstraint#getConversionDependencyConstraint()
	 * @see #getValueRangeBasedConstraint()
	 * @generated
	 */
	EReference getValueRangeBasedConstraint_ConversionDependencyConstraint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.BaseValueRangedConstraint <em>Base Value Ranged Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Value Ranged Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.BaseValueRangedConstraint
	 * @generated
	 */
	EClass getBaseValueRangedConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.UGSML.BaseValueRangedConstraint#isRemapValue <em>Remap Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remap Value</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.BaseValueRangedConstraint#isRemapValue()
	 * @see #getBaseValueRangedConstraint()
	 * @generated
	 */
	EAttribute getBaseValueRangedConstraint_RemapValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.SingleValueConstraint <em>Single Value Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Value Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.SingleValueConstraint
	 * @generated
	 */
	EClass getSingleValueConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.UGSML.SingleValueConstraint#getVariability <em>Variability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variability</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.SingleValueConstraint#getVariability()
	 * @see #getSingleValueConstraint()
	 * @generated
	 */
	EAttribute getSingleValueConstraint_Variability();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.MarginOfErrorConstraint <em>Margin Of Error Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Margin Of Error Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.MarginOfErrorConstraint
	 * @generated
	 */
	EClass getMarginOfErrorConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.UGSML.MarginOfErrorConstraint#getMOEAttribute <em>MOE Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>MOE Attribute</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.MarginOfErrorConstraint#getMOEAttribute()
	 * @see #getMarginOfErrorConstraint()
	 * @generated
	 */
	EReference getMarginOfErrorConstraint_MOEAttribute();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.AudioBasedAttribute <em>Audio Based Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audio Based Attribute</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.AudioBasedAttribute
	 * @generated
	 */
	EClass getAudioBasedAttribute();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.CharacterBasedAttribute <em>Character Based Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character Based Attribute</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.CharacterBasedAttribute
	 * @generated
	 */
	EClass getCharacterBasedAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.UGSML.CharacterBasedAttribute#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.CharacterBasedAttribute#getDefaultValue()
	 * @see #getCharacterBasedAttribute()
	 * @generated
	 */
	EAttribute getCharacterBasedAttribute_DefaultValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.IntegerBasedAttribute <em>Integer Based Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Based Attribute</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.IntegerBasedAttribute
	 * @generated
	 */
	EClass getIntegerBasedAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.UGSML.IntegerBasedAttribute#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.IntegerBasedAttribute#getDefaultValue()
	 * @see #getIntegerBasedAttribute()
	 * @generated
	 */
	EAttribute getIntegerBasedAttribute_DefaultValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.DecimalBasedAttribute <em>Decimal Based Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decimal Based Attribute</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.DecimalBasedAttribute
	 * @generated
	 */
	EClass getDecimalBasedAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.UGSML.DecimalBasedAttribute#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.DecimalBasedAttribute#getDefaultValue()
	 * @see #getDecimalBasedAttribute()
	 * @generated
	 */
	EAttribute getDecimalBasedAttribute_DefaultValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.DirectDependencyConstraint <em>Direct Dependency Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Direct Dependency Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.DirectDependencyConstraint
	 * @generated
	 */
	EClass getDirectDependencyConstraint();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.UGSML.DirectDependencyConstraint#getDependentAttributes <em>Dependent Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependent Attributes</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.DirectDependencyConstraint#getDependentAttributes()
	 * @see #getDirectDependencyConstraint()
	 * @generated
	 */
	EReference getDirectDependencyConstraint_DependentAttributes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.UGSML.DirectDependencyConstraint#getDependencyFormula <em>Dependency Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dependency Formula</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.DirectDependencyConstraint#getDependencyFormula()
	 * @see #getDirectDependencyConstraint()
	 * @generated
	 */
	EAttribute getDirectDependencyConstraint_DependencyFormula();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.ConversionDependencyConstraint <em>Conversion Dependency Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conversion Dependency Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.ConversionDependencyConstraint
	 * @generated
	 */
	EClass getConversionDependencyConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.UGSML.ConversionDependencyConstraint#getAttributeName <em>Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Name</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.ConversionDependencyConstraint#getAttributeName()
	 * @see #getConversionDependencyConstraint()
	 * @generated
	 */
	EAttribute getConversionDependencyConstraint_AttributeName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.UGSML.ConversionDependencyConstraint#getConversionUnitToBase <em>Conversion Unit To Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conversion Unit To Base</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.ConversionDependencyConstraint#getConversionUnitToBase()
	 * @see #getConversionDependencyConstraint()
	 * @generated
	 */
	EAttribute getConversionDependencyConstraint_ConversionUnitToBase();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.UGSML.ConversionDependencyConstraint#getConversionChain <em>Conversion Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conversion Chain</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.ConversionDependencyConstraint#getConversionChain()
	 * @see #getConversionDependencyConstraint()
	 * @generated
	 */
	EReference getConversionDependencyConstraint_ConversionChain();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.sirius.sample.UGSML.ConversionDependencyConstraint#getValueRangeBasedConstraint <em>Value Range Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Value Range Based Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.ConversionDependencyConstraint#getValueRangeBasedConstraint()
	 * @see #getConversionDependencyConstraint()
	 * @generated
	 */
	EReference getConversionDependencyConstraint_ValueRangeBasedConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.UGSML.ConversionDependencyConstraint#getNextAttributeInChain <em>Next Attribute In Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Attribute In Chain</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.ConversionDependencyConstraint#getNextAttributeInChain()
	 * @see #getConversionDependencyConstraint()
	 * @generated
	 */
	EReference getConversionDependencyConstraint_NextAttributeInChain();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.UGSML.ConversionDependencyConstraint#getConversionRate <em>Conversion Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conversion Rate</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.ConversionDependencyConstraint#getConversionRate()
	 * @see #getConversionDependencyConstraint()
	 * @generated
	 */
	EAttribute getConversionDependencyConstraint_ConversionRate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.DistortionConstraint <em>Distortion Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distortion Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.DistortionConstraint
	 * @generated
	 */
	EClass getDistortionConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.UGSML.DistortionConstraint#getDistortionAttribute <em>Distortion Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Distortion Attribute</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.DistortionConstraint#getDistortionAttribute()
	 * @see #getDistortionConstraint()
	 * @generated
	 */
	EReference getDistortionConstraint_DistortionAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.UGSML.DistortionConstraint#getDistortionMode <em>Distortion Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distortion Mode</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.DistortionConstraint#getDistortionMode()
	 * @see #getDistortionConstraint()
	 * @generated
	 */
	EAttribute getDistortionConstraint_DistortionMode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.Vector2DBasedConstraint <em>Vector2 DBased Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vector2 DBased Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.Vector2DBasedConstraint
	 * @generated
	 */
	EClass getVector2DBasedConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.UGSML.Vector2DBasedConstraint#getConstrainedAttributeInstance <em>Constrained Attribute Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constrained Attribute Instance</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.Vector2DBasedConstraint#getConstrainedAttributeInstance()
	 * @see #getVector2DBasedConstraint()
	 * @generated
	 */
	EReference getVector2DBasedConstraint_ConstrainedAttributeInstance();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sirius.sample.UGSML.Vector2DBasedConstraint#getVector2DRangeBasedConstraint <em>Vector2 DRange Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vector2 DRange Based Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.Vector2DBasedConstraint#getVector2DRangeBasedConstraint()
	 * @see #getVector2DBasedConstraint()
	 * @generated
	 */
	EReference getVector2DBasedConstraint_Vector2DRangeBasedConstraint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.VectorBasedConstraint <em>Vector Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vector Based Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.VectorBasedConstraint
	 * @generated
	 */
	EClass getVectorBasedConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.UGSML.VectorBasedConstraint#getConstrainedAttributeInstance <em>Constrained Attribute Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constrained Attribute Instance</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.VectorBasedConstraint#getConstrainedAttributeInstance()
	 * @see #getVectorBasedConstraint()
	 * @generated
	 */
	EReference getVectorBasedConstraint_ConstrainedAttributeInstance();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sirius.sample.UGSML.VectorBasedConstraint#getVectorRangeBasedConstraint <em>Vector Range Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vector Range Based Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.VectorBasedConstraint#getVectorRangeBasedConstraint()
	 * @see #getVectorBasedConstraint()
	 * @generated
	 */
	EReference getVectorBasedConstraint_VectorRangeBasedConstraint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.RotatorBasedConstraint <em>Rotator Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotator Based Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.RotatorBasedConstraint
	 * @generated
	 */
	EClass getRotatorBasedConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.UGSML.RotatorBasedConstraint#getConstrainedAttributeInstance <em>Constrained Attribute Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constrained Attribute Instance</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.RotatorBasedConstraint#getConstrainedAttributeInstance()
	 * @see #getRotatorBasedConstraint()
	 * @generated
	 */
	EReference getRotatorBasedConstraint_ConstrainedAttributeInstance();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sirius.sample.UGSML.RotatorBasedConstraint#getRotatorRangeBasedConstraint <em>Rotator Range Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rotator Range Based Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.RotatorBasedConstraint#getRotatorRangeBasedConstraint()
	 * @see #getRotatorBasedConstraint()
	 * @generated
	 */
	EReference getRotatorBasedConstraint_RotatorRangeBasedConstraint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.TransformationBasedConstraint <em>Transformation Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation Based Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.TransformationBasedConstraint
	 * @generated
	 */
	EClass getTransformationBasedConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.UGSML.TransformationBasedConstraint#getConstrainedAttributeInstance <em>Constrained Attribute Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constrained Attribute Instance</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.TransformationBasedConstraint#getConstrainedAttributeInstance()
	 * @see #getTransformationBasedConstraint()
	 * @generated
	 */
	EReference getTransformationBasedConstraint_ConstrainedAttributeInstance();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sirius.sample.UGSML.TransformationBasedConstraint#getTransformationRangeBasedConstraint <em>Transformation Range Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformation Range Based Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.TransformationBasedConstraint#getTransformationRangeBasedConstraint()
	 * @see #getTransformationBasedConstraint()
	 * @generated
	 */
	EReference getTransformationBasedConstraint_TransformationRangeBasedConstraint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.ColorBasedConstraint <em>Color Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color Based Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.ColorBasedConstraint
	 * @generated
	 */
	EClass getColorBasedConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.UGSML.ColorBasedConstraint#getConstrainedAttributeInstance <em>Constrained Attribute Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constrained Attribute Instance</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.ColorBasedConstraint#getConstrainedAttributeInstance()
	 * @see #getColorBasedConstraint()
	 * @generated
	 */
	EReference getColorBasedConstraint_ConstrainedAttributeInstance();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sirius.sample.UGSML.ColorBasedConstraint#getColorCustomizationConstraint <em>Color Customization Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Color Customization Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.ColorBasedConstraint#getColorCustomizationConstraint()
	 * @see #getColorBasedConstraint()
	 * @generated
	 */
	EReference getColorBasedConstraint_ColorCustomizationConstraint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.TextureBasedConstraint <em>Texture Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Texture Based Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.TextureBasedConstraint
	 * @generated
	 */
	EClass getTextureBasedConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.UGSML.TextureBasedConstraint#getConstrainedAttributeInstance <em>Constrained Attribute Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constrained Attribute Instance</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.TextureBasedConstraint#getConstrainedAttributeInstance()
	 * @see #getTextureBasedConstraint()
	 * @generated
	 */
	EReference getTextureBasedConstraint_ConstrainedAttributeInstance();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.ModelBasedConstraint <em>Model Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Based Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.ModelBasedConstraint
	 * @generated
	 */
	EClass getModelBasedConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.UGSML.ModelBasedConstraint#getConstrainedAttributeInstance <em>Constrained Attribute Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constrained Attribute Instance</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.ModelBasedConstraint#getConstrainedAttributeInstance()
	 * @see #getModelBasedConstraint()
	 * @generated
	 */
	EReference getModelBasedConstraint_ConstrainedAttributeInstance();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.ParticleBasedConstraint <em>Particle Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Particle Based Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.ParticleBasedConstraint
	 * @generated
	 */
	EClass getParticleBasedConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.UGSML.ParticleBasedConstraint#getConstrainedAttributeInstance <em>Constrained Attribute Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constrained Attribute Instance</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.ParticleBasedConstraint#getConstrainedAttributeInstance()
	 * @see #getParticleBasedConstraint()
	 * @generated
	 */
	EReference getParticleBasedConstraint_ConstrainedAttributeInstance();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.AudioBasedConstraint <em>Audio Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audio Based Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.AudioBasedConstraint
	 * @generated
	 */
	EClass getAudioBasedConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.UGSML.AudioBasedConstraint#getConstrainedAttributeInstance <em>Constrained Attribute Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constrained Attribute Instance</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.AudioBasedConstraint#getConstrainedAttributeInstance()
	 * @see #getAudioBasedConstraint()
	 * @generated
	 */
	EReference getAudioBasedConstraint_ConstrainedAttributeInstance();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.LetterLengthConstraint <em>Letter Length Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Letter Length Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.LetterLengthConstraint
	 * @generated
	 */
	EClass getLetterLengthConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.UGSML.LetterLengthConstraint#getMaximumLengthAttribute <em>Maximum Length Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Maximum Length Attribute</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.LetterLengthConstraint#getMaximumLengthAttribute()
	 * @see #getLetterLengthConstraint()
	 * @generated
	 */
	EReference getLetterLengthConstraint_MaximumLengthAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.UGSML.LetterLengthConstraint#getMinimumLengthAttribute <em>Minimum Length Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Minimum Length Attribute</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.LetterLengthConstraint#getMinimumLengthAttribute()
	 * @see #getLetterLengthConstraint()
	 * @generated
	 */
	EReference getLetterLengthConstraint_MinimumLengthAttribute();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.LetterCustomizationConstraint <em>Letter Customization Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Letter Customization Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.LetterCustomizationConstraint
	 * @generated
	 */
	EClass getLetterCustomizationConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.UGSML.LetterCustomizationConstraint#getFilterStrings <em>Filter Strings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Filter Strings</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.LetterCustomizationConstraint#getFilterStrings()
	 * @see #getLetterCustomizationConstraint()
	 * @generated
	 */
	EReference getLetterCustomizationConstraint_FilterStrings();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.ValueConstraintRule <em>Value Constraint Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Constraint Rule</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.ValueConstraintRule
	 * @generated
	 */
	EClass getValueConstraintRule();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.LetterConstraintRule <em>Letter Constraint Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Letter Constraint Rule</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.LetterConstraintRule
	 * @generated
	 */
	EClass getLetterConstraintRule();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.Vector2DRangeBasedConstraint <em>Vector2 DRange Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vector2 DRange Based Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.Vector2DRangeBasedConstraint
	 * @generated
	 */
	EClass getVector2DRangeBasedConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.UGSML.Vector2DRangeBasedConstraint#getMinimumVector2DAttribute <em>Minimum Vector2 DAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Minimum Vector2 DAttribute</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.Vector2DRangeBasedConstraint#getMinimumVector2DAttribute()
	 * @see #getVector2DRangeBasedConstraint()
	 * @generated
	 */
	EReference getVector2DRangeBasedConstraint_MinimumVector2DAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.UGSML.Vector2DRangeBasedConstraint#getMaximumVector2DAttribute <em>Maximum Vector2 DAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Maximum Vector2 DAttribute</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.Vector2DRangeBasedConstraint#getMaximumVector2DAttribute()
	 * @see #getVector2DRangeBasedConstraint()
	 * @generated
	 */
	EReference getVector2DRangeBasedConstraint_MaximumVector2DAttribute();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.Vector2DConstraintRule <em>Vector2 DConstraint Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vector2 DConstraint Rule</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.Vector2DConstraintRule
	 * @generated
	 */
	EClass getVector2DConstraintRule();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.VectorConstraintRule <em>Vector Constraint Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vector Constraint Rule</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.VectorConstraintRule
	 * @generated
	 */
	EClass getVectorConstraintRule();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.VectorRangeBasedConstraint <em>Vector Range Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vector Range Based Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.VectorRangeBasedConstraint
	 * @generated
	 */
	EClass getVectorRangeBasedConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.UGSML.VectorRangeBasedConstraint#getMaximumVectorAttribute <em>Maximum Vector Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Maximum Vector Attribute</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.VectorRangeBasedConstraint#getMaximumVectorAttribute()
	 * @see #getVectorRangeBasedConstraint()
	 * @generated
	 */
	EReference getVectorRangeBasedConstraint_MaximumVectorAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.UGSML.VectorRangeBasedConstraint#getMinimumVectorAttribute <em>Minimum Vector Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Minimum Vector Attribute</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.VectorRangeBasedConstraint#getMinimumVectorAttribute()
	 * @see #getVectorRangeBasedConstraint()
	 * @generated
	 */
	EReference getVectorRangeBasedConstraint_MinimumVectorAttribute();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.RangeBasedConstraint <em>Range Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Based Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.RangeBasedConstraint
	 * @generated
	 */
	EClass getRangeBasedConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.UGSML.RangeBasedConstraint#getLimit <em>Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limit</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.RangeBasedConstraint#getLimit()
	 * @see #getRangeBasedConstraint()
	 * @generated
	 */
	EAttribute getRangeBasedConstraint_Limit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.RotatorConstraintRule <em>Rotator Constraint Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotator Constraint Rule</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.RotatorConstraintRule
	 * @generated
	 */
	EClass getRotatorConstraintRule();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.RotatorRangeBasedConstraint <em>Rotator Range Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotator Range Based Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.RotatorRangeBasedConstraint
	 * @generated
	 */
	EClass getRotatorRangeBasedConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.UGSML.RotatorRangeBasedConstraint#getMaximumRotatorAttribute <em>Maximum Rotator Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Maximum Rotator Attribute</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.RotatorRangeBasedConstraint#getMaximumRotatorAttribute()
	 * @see #getRotatorRangeBasedConstraint()
	 * @generated
	 */
	EReference getRotatorRangeBasedConstraint_MaximumRotatorAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.UGSML.RotatorRangeBasedConstraint#getMinimumRotatorAttribute <em>Minimum Rotator Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Minimum Rotator Attribute</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.RotatorRangeBasedConstraint#getMinimumRotatorAttribute()
	 * @see #getRotatorRangeBasedConstraint()
	 * @generated
	 */
	EReference getRotatorRangeBasedConstraint_MinimumRotatorAttribute();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.TransformationConstraintRule <em>Transformation Constraint Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation Constraint Rule</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.TransformationConstraintRule
	 * @generated
	 */
	EClass getTransformationConstraintRule();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.TransformationRangeBasedConstraint <em>Transformation Range Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation Range Based Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.TransformationRangeBasedConstraint
	 * @generated
	 */
	EClass getTransformationRangeBasedConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.UGSML.TransformationRangeBasedConstraint#getMaximumTransformationAttribute <em>Maximum Transformation Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Maximum Transformation Attribute</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.TransformationRangeBasedConstraint#getMaximumTransformationAttribute()
	 * @see #getTransformationRangeBasedConstraint()
	 * @generated
	 */
	EReference getTransformationRangeBasedConstraint_MaximumTransformationAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.UGSML.TransformationRangeBasedConstraint#getMinimumTransformationAttribute <em>Minimum Transformation Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Minimum Transformation Attribute</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.TransformationRangeBasedConstraint#getMinimumTransformationAttribute()
	 * @see #getTransformationRangeBasedConstraint()
	 * @generated
	 */
	EReference getTransformationRangeBasedConstraint_MinimumTransformationAttribute();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.CustomizationType <em>Customization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customization Type</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.CustomizationType
	 * @generated
	 */
	EClass getCustomizationType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.UGSML.CustomizationType#getFilterType <em>Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter Type</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.CustomizationType#getFilterType()
	 * @see #getCustomizationType()
	 * @generated
	 */
	EAttribute getCustomizationType_FilterType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.ColorCustomizationConstraint <em>Color Customization Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color Customization Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.ColorCustomizationConstraint
	 * @generated
	 */
	EClass getColorCustomizationConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.UGSML.ColorCustomizationConstraint#getFilterColors <em>Filter Colors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Filter Colors</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.ColorCustomizationConstraint#getFilterColors()
	 * @see #getColorCustomizationConstraint()
	 * @generated
	 */
	EReference getColorCustomizationConstraint_FilterColors();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.ColorConstraintRule <em>Color Constraint Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color Constraint Rule</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.ColorConstraintRule
	 * @generated
	 */
	EClass getColorConstraintRule();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.EnumBasedConstraint <em>Enum Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Based Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.EnumBasedConstraint
	 * @generated
	 */
	EClass getEnumBasedConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.UGSML.EnumBasedConstraint#getConstrainedAttributeInstance <em>Constrained Attribute Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constrained Attribute Instance</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.EnumBasedConstraint#getConstrainedAttributeInstance()
	 * @see #getEnumBasedConstraint()
	 * @generated
	 */
	EReference getEnumBasedConstraint_ConstrainedAttributeInstance();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.SimpleEnumStructure <em>Simple Enum Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Enum Structure</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.SimpleEnumStructure
	 * @generated
	 */
	EClass getSimpleEnumStructure();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.BitmaskedEnumStructure <em>Bitmasked Enum Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bitmasked Enum Structure</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.BitmaskedEnumStructure
	 * @generated
	 */
	EClass getBitmaskedEnumStructure();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.GameStructureContainer <em>Game Structure Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Structure Container</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.GameStructureContainer
	 * @generated
	 */
	EClass getGameStructureContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.UGSML.GameStructureContainer#getGameStructures <em>Game Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Game Structures</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.GameStructureContainer#getGameStructures()
	 * @see #getGameStructureContainer()
	 * @generated
	 */
	EReference getGameStructureContainer_GameStructures();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.GameStructure <em>Game Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Structure</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.GameStructure
	 * @generated
	 */
	EClass getGameStructure();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.EnumBasedAttribute <em>Enum Based Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Based Attribute</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.EnumBasedAttribute
	 * @generated
	 */
	EClass getEnumBasedAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.UGSML.EnumBasedAttribute#getEnumType <em>Enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enum Type</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.EnumBasedAttribute#getEnumType()
	 * @see #getEnumBasedAttribute()
	 * @generated
	 */
	EReference getEnumBasedAttribute_EnumType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.StructureBasedAttribute <em>Structure Based Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure Based Attribute</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.StructureBasedAttribute
	 * @generated
	 */
	EClass getStructureBasedAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.UGSML.StructureBasedAttribute#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.StructureBasedAttribute#getDataType()
	 * @see #getStructureBasedAttribute()
	 * @generated
	 */
	EReference getStructureBasedAttribute_DataType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.StructureBasedConstraint <em>Structure Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure Based Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.StructureBasedConstraint
	 * @generated
	 */
	EClass getStructureBasedConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.UGSML.StructureBasedConstraint#getConstrainedAttributeInstance <em>Constrained Attribute Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constrained Attribute Instance</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.StructureBasedConstraint#getConstrainedAttributeInstance()
	 * @see #getStructureBasedConstraint()
	 * @generated
	 */
	EReference getStructureBasedConstraint_ConstrainedAttributeInstance();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.GetterDistortionConstraint <em>Getter Distortion Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Getter Distortion Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.GetterDistortionConstraint
	 * @generated
	 */
	EClass getGetterDistortionConstraint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.SetterDistortionConstraint <em>Setter Distortion Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setter Distortion Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.SetterDistortionConstraint
	 * @generated
	 */
	EClass getSetterDistortionConstraint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.MaterialBasedConstraint <em>Material Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Material Based Constraint</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.MaterialBasedConstraint
	 * @generated
	 */
	EClass getMaterialBasedConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.UGSML.MaterialBasedConstraint#getConstrainedAttributeInstance <em>Constrained Attribute Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constrained Attribute Instance</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.MaterialBasedConstraint#getConstrainedAttributeInstance()
	 * @see #getMaterialBasedConstraint()
	 * @generated
	 */
	EReference getMaterialBasedConstraint_ConstrainedAttributeInstance();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.UGSML.MaterialBasedAttribute <em>Material Based Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Material Based Attribute</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.MaterialBasedAttribute
	 * @generated
	 */
	EClass getMaterialBasedAttribute();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.sirius.sample.UGSML.AdditionLimit <em>Addition Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Addition Limit</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.AdditionLimit
	 * @generated
	 */
	EEnum getAdditionLimit();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.sirius.sample.UGSML.VariabilityType <em>Variability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Variability Type</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.VariabilityType
	 * @generated
	 */
	EEnum getVariabilityType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.sirius.sample.UGSML.FilteringType <em>Filtering Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Filtering Type</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.FilteringType
	 * @generated
	 */
	EEnum getFilteringType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.sirius.sample.UGSML.ArithmeticOperations <em>Arithmetic Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Arithmetic Operations</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.ArithmeticOperations
	 * @generated
	 */
	EEnum getArithmeticOperations();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.sirius.sample.UGSML.InitializationMode <em>Initialization Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Initialization Mode</em>'.
	 * @see org.eclipse.sirius.sample.UGSML.InitializationMode
	 * @generated
	 */
	EEnum getInitializationMode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UGSMLFactory getUGSMLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.RootImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Game</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__GAME = eINSTANCE.getRoot_Game();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.GameImpl <em>Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.GameImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getGame()
		 * @generated
		 */
		EClass GAME = eINSTANCE.getGame();

		/**
		 * The meta object literal for the '<em><b>Game Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__GAME_TITLE = eINSTANCE.getGame_GameTitle();

		/**
		 * The meta object literal for the '<em><b>Game Feature Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__GAME_FEATURE_CONTAINERS = eINSTANCE.getGame_GameFeatureContainers();

		/**
		 * The meta object literal for the '<em><b>Game Systems</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__GAME_SYSTEMS = eINSTANCE.getGame_GameSystems();

		/**
		 * The meta object literal for the '<em><b>Game Version Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__GAME_VERSION_NAME = eINSTANCE.getGame_GameVersionName();

		/**
		 * The meta object literal for the '<em><b>Game Version Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__GAME_VERSION_NUMBER = eINSTANCE.getGame_GameVersionNumber();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.GameFeatureContainer <em>Game Feature Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.GameFeatureContainer
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getGameFeatureContainer()
		 * @generated
		 */
		EClass GAME_FEATURE_CONTAINER = eINSTANCE.getGameFeatureContainer();

		/**
		 * The meta object literal for the '<em><b>Feature Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_FEATURE_CONTAINER__FEATURE_CATEGORY = eINSTANCE.getGameFeatureContainer_FeatureCategory();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.GameAttributeContainerImpl <em>Game Attribute Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.GameAttributeContainerImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getGameAttributeContainer()
		 * @generated
		 */
		EClass GAME_ATTRIBUTE_CONTAINER = eINSTANCE.getGameAttributeContainer();

		/**
		 * The meta object literal for the '<em><b>Game Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_ATTRIBUTE_CONTAINER__GAME_ATTRIBUTES = eINSTANCE.getGameAttributeContainer_GameAttributes();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.GameFeature <em>Game Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.GameFeature
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getGameFeature()
		 * @generated
		 */
		EClass GAME_FEATURE = eINSTANCE.getGameFeature();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_FEATURE__FEATURE_NAME = eINSTANCE.getGameFeature_FeatureName();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.GameAttribute <em>Game Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.GameAttribute
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getGameAttribute()
		 * @generated
		 */
		EClass GAME_ATTRIBUTE = eINSTANCE.getGameAttribute();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.EnumerationBasedStructure <em>Enumeration Based Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.EnumerationBasedStructure
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getEnumerationBasedStructure()
		 * @generated
		 */
		EClass ENUMERATION_BASED_STRUCTURE = eINSTANCE.getEnumerationBasedStructure();

		/**
		 * The meta object literal for the '<em><b>Enum States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_BASED_STRUCTURE__ENUM_STATES = eINSTANCE.getEnumerationBasedStructure_EnumStates();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.EnumStateImpl <em>Enum State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.EnumStateImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getEnumState()
		 * @generated
		 */
		EClass ENUM_STATE = eINSTANCE.getEnumState();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.DataBasedStructureImpl <em>Data Based Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.DataBasedStructureImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getDataBasedStructure()
		 * @generated
		 */
		EClass DATA_BASED_STRUCTURE = eINSTANCE.getDataBasedStructure();

		/**
		 * The meta object literal for the '<em><b>Structure Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BASED_STRUCTURE__STRUCTURE_ATTRIBUTES = eINSTANCE.getDataBasedStructure_StructureAttributes();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.BooleanBasedAttributeImpl <em>Boolean Based Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.BooleanBasedAttributeImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getBooleanBasedAttribute()
		 * @generated
		 */
		EClass BOOLEAN_BASED_ATTRIBUTE = eINSTANCE.getBooleanBasedAttribute();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_BASED_ATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getBooleanBasedAttribute_DefaultValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.ValueBasedAttribute <em>Value Based Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.ValueBasedAttribute
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getValueBasedAttribute()
		 * @generated
		 */
		EClass VALUE_BASED_ATTRIBUTE = eINSTANCE.getValueBasedAttribute();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.LetterBasedAttribute <em>Letter Based Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.LetterBasedAttribute
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getLetterBasedAttribute()
		 * @generated
		 */
		EClass LETTER_BASED_ATTRIBUTE = eINSTANCE.getLetterBasedAttribute();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.NameBasedAttributeImpl <em>Name Based Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.NameBasedAttributeImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getNameBasedAttribute()
		 * @generated
		 */
		EClass NAME_BASED_ATTRIBUTE = eINSTANCE.getNameBasedAttribute();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_BASED_ATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getNameBasedAttribute_DefaultValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.StringBasedAttributeImpl <em>String Based Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.StringBasedAttributeImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getStringBasedAttribute()
		 * @generated
		 */
		EClass STRING_BASED_ATTRIBUTE = eINSTANCE.getStringBasedAttribute();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_BASED_ATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getStringBasedAttribute_DefaultValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.TextBasedAttributeImpl <em>Text Based Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.TextBasedAttributeImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getTextBasedAttribute()
		 * @generated
		 */
		EClass TEXT_BASED_ATTRIBUTE = eINSTANCE.getTextBasedAttribute();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_BASED_ATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getTextBasedAttribute_DefaultValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.Vector2DBasedAttributeImpl <em>Vector2 DBased Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.Vector2DBasedAttributeImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getVector2DBasedAttribute()
		 * @generated
		 */
		EClass VECTOR2_DBASED_ATTRIBUTE = eINSTANCE.getVector2DBasedAttribute();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR2_DBASED_ATTRIBUTE__X = eINSTANCE.getVector2DBasedAttribute_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR2_DBASED_ATTRIBUTE__Y = eINSTANCE.getVector2DBasedAttribute_Y();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.VectorBasedAttributeImpl <em>Vector Based Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.VectorBasedAttributeImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getVectorBasedAttribute()
		 * @generated
		 */
		EClass VECTOR_BASED_ATTRIBUTE = eINSTANCE.getVectorBasedAttribute();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR_BASED_ATTRIBUTE__X = eINSTANCE.getVectorBasedAttribute_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR_BASED_ATTRIBUTE__Y = eINSTANCE.getVectorBasedAttribute_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR_BASED_ATTRIBUTE__Z = eINSTANCE.getVectorBasedAttribute_Z();

		/**
		 * The meta object literal for the '<em><b>TOwning Transformation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VECTOR_BASED_ATTRIBUTE__TOWNING_TRANSFORMATION = eINSTANCE
				.getVectorBasedAttribute_TOwningTransformation();

		/**
		 * The meta object literal for the '<em><b>SOwning Transformation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VECTOR_BASED_ATTRIBUTE__SOWNING_TRANSFORMATION = eINSTANCE
				.getVectorBasedAttribute_SOwningTransformation();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.RotatorBasedAttributeImpl <em>Rotator Based Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.RotatorBasedAttributeImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getRotatorBasedAttribute()
		 * @generated
		 */
		EClass ROTATOR_BASED_ATTRIBUTE = eINSTANCE.getRotatorBasedAttribute();

		/**
		 * The meta object literal for the '<em><b>Roll</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATOR_BASED_ATTRIBUTE__ROLL = eINSTANCE.getRotatorBasedAttribute_Roll();

		/**
		 * The meta object literal for the '<em><b>Pitch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATOR_BASED_ATTRIBUTE__PITCH = eINSTANCE.getRotatorBasedAttribute_Pitch();

		/**
		 * The meta object literal for the '<em><b>Yaw</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATOR_BASED_ATTRIBUTE__YAW = eINSTANCE.getRotatorBasedAttribute_Yaw();

		/**
		 * The meta object literal for the '<em><b>ROwning Transformation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROTATOR_BASED_ATTRIBUTE__ROWNING_TRANSFORMATION = eINSTANCE
				.getRotatorBasedAttribute_ROwningTransformation();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.TransformationBasedAttributeImpl <em>Transformation Based Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.TransformationBasedAttributeImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getTransformationBasedAttribute()
		 * @generated
		 */
		EClass TRANSFORMATION_BASED_ATTRIBUTE = eINSTANCE.getTransformationBasedAttribute();

		/**
		 * The meta object literal for the '<em><b>Translation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_BASED_ATTRIBUTE__TRANSLATION = eINSTANCE
				.getTransformationBasedAttribute_Translation();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_BASED_ATTRIBUTE__ROTATION = eINSTANCE.getTransformationBasedAttribute_Rotation();

		/**
		 * The meta object literal for the '<em><b>Scale3 D</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_BASED_ATTRIBUTE__SCALE3_D = eINSTANCE.getTransformationBasedAttribute_Scale3D();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.ColorBasedAttributeImpl <em>Color Based Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.ColorBasedAttributeImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getColorBasedAttribute()
		 * @generated
		 */
		EClass COLOR_BASED_ATTRIBUTE = eINSTANCE.getColorBasedAttribute();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR_BASED_ATTRIBUTE__R = eINSTANCE.getColorBasedAttribute_R();

		/**
		 * The meta object literal for the '<em><b>G</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR_BASED_ATTRIBUTE__G = eINSTANCE.getColorBasedAttribute_G();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR_BASED_ATTRIBUTE__B = eINSTANCE.getColorBasedAttribute_B();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR_BASED_ATTRIBUTE__A = eINSTANCE.getColorBasedAttribute_A();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.TextureBasedAttributeImpl <em>Texture Based Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.TextureBasedAttributeImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getTextureBasedAttribute()
		 * @generated
		 */
		EClass TEXTURE_BASED_ATTRIBUTE = eINSTANCE.getTextureBasedAttribute();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.GameItemContainerImpl <em>Game Item Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.GameItemContainerImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getGameItemContainer()
		 * @generated
		 */
		EClass GAME_ITEM_CONTAINER = eINSTANCE.getGameItemContainer();

		/**
		 * The meta object literal for the '<em><b>Game Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_ITEM_CONTAINER__GAME_ITEMS = eINSTANCE.getGameItemContainer_GameItems();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.GameItemImpl <em>Game Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.GameItemImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getGameItem()
		 * @generated
		 */
		EClass GAME_ITEM = eINSTANCE.getGameItem();

		/**
		 * The meta object literal for the '<em><b>Item Attribute Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_ITEM__ITEM_ATTRIBUTE_INSTANCES = eINSTANCE.getGameItem_ItemAttributeInstances();

		/**
		 * The meta object literal for the '<em><b>Item Modes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_ITEM__ITEM_MODES = eINSTANCE.getGameItem_ItemModes();

		/**
		 * The meta object literal for the '<em><b>Derived Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_ITEM__DERIVED_ITEMS = eINSTANCE.getGameItem_DerivedItems();

		/**
		 * The meta object literal for the '<em><b>Parent Item</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_ITEM__PARENT_ITEM = eINSTANCE.getGameItem_ParentItem();

		/**
		 * The meta object literal for the '<em><b>Placable Inventories</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_ITEM__PLACABLE_INVENTORIES = eINSTANCE.getGameItem_PlacableInventories();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_ITEM__IS_ABSTRACT = eINSTANCE.getGameItem_IsAbstract();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.ItemModeImpl <em>Item Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.ItemModeImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getItemMode()
		 * @generated
		 */
		EClass ITEM_MODE = eINSTANCE.getItemMode();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.GameSystem <em>Game System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.GameSystem
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getGameSystem()
		 * @generated
		 */
		EClass GAME_SYSTEM = eINSTANCE.getGameSystem();

		/**
		 * The meta object literal for the '<em><b>System Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_SYSTEM__SYSTEM_NAME = eINSTANCE.getGameSystem_SystemName();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.AttributeSystemImpl <em>Attribute System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.AttributeSystemImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getAttributeSystem()
		 * @generated
		 */
		EClass ATTRIBUTE_SYSTEM = eINSTANCE.getAttributeSystem();

		/**
		 * The meta object literal for the '<em><b>Array Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_SYSTEM__ARRAY_CONSTRAINTS = eINSTANCE.getAttributeSystem_ArrayConstraints();

		/**
		 * The meta object literal for the '<em><b>Single Value Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_SYSTEM__SINGLE_VALUE_CONSTRAINTS = eINSTANCE.getAttributeSystem_SingleValueConstraints();

		/**
		 * The meta object literal for the '<em><b>Parent Attribute System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_SYSTEM__PARENT_ATTRIBUTE_SYSTEM = eINSTANCE.getAttributeSystem_ParentAttributeSystem();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.GameSystemConstraint <em>Game System Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.GameSystemConstraint
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getGameSystemConstraint()
		 * @generated
		 */
		EClass GAME_SYSTEM_CONSTRAINT = eINSTANCE.getGameSystemConstraint();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.AttributeSystemConstraint <em>Attribute System Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.AttributeSystemConstraint
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getAttributeSystemConstraint()
		 * @generated
		 */
		EClass ATTRIBUTE_SYSTEM_CONSTRAINT = eINSTANCE.getAttributeSystemConstraint();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.BaseGameConstraintRule <em>Base Game Constraint Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.BaseGameConstraintRule
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getBaseGameConstraintRule()
		 * @generated
		 */
		EClass BASE_GAME_CONSTRAINT_RULE = eINSTANCE.getBaseGameConstraintRule();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.AttributeConstraintRule <em>Attribute Constraint Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.AttributeConstraintRule
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getAttributeConstraintRule()
		 * @generated
		 */
		EClass ATTRIBUTE_CONSTRAINT_RULE = eINSTANCE.getAttributeConstraintRule();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.ArrayConstraintImpl <em>Array Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.ArrayConstraintImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getArrayConstraint()
		 * @generated
		 */
		EClass ARRAY_CONSTRAINT = eINSTANCE.getArrayConstraint();

		/**
		 * The meta object literal for the '<em><b>Constrained Attribute Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE = eINSTANCE
				.getArrayConstraint_ConstrainedAttributeInstance();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.BooleanBasedConstraintImpl <em>Boolean Based Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.BooleanBasedConstraintImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getBooleanBasedConstraint()
		 * @generated
		 */
		EClass BOOLEAN_BASED_CONSTRAINT = eINSTANCE.getBooleanBasedConstraint();

		/**
		 * The meta object literal for the '<em><b>Constrained Attribute Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE = eINSTANCE
				.getBooleanBasedConstraint_ConstrainedAttributeInstance();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.ValueBasedConstraintImpl <em>Value Based Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.ValueBasedConstraintImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getValueBasedConstraint()
		 * @generated
		 */
		EClass VALUE_BASED_CONSTRAINT = eINSTANCE.getValueBasedConstraint();

		/**
		 * The meta object literal for the '<em><b>Constrained Attribute Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE = eINSTANCE
				.getValueBasedConstraint_ConstrainedAttributeInstance();

		/**
		 * The meta object literal for the '<em><b>Base Or Range Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_BASED_CONSTRAINT__BASE_OR_RANGE_CONSTRAINT = eINSTANCE
				.getValueBasedConstraint_BaseOrRangeConstraint();

		/**
		 * The meta object literal for the '<em><b>Margin Of Error</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_BASED_CONSTRAINT__MARGIN_OF_ERROR = eINSTANCE.getValueBasedConstraint_MarginOfError();

		/**
		 * The meta object literal for the '<em><b>Regeneration Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_BASED_CONSTRAINT__REGENERATION_CONSTRAINT = eINSTANCE
				.getValueBasedConstraint_RegenerationConstraint();

		/**
		 * The meta object literal for the '<em><b>Direct Dependency Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_BASED_CONSTRAINT__DIRECT_DEPENDENCY_CONSTRAINT = eINSTANCE
				.getValueBasedConstraint_DirectDependencyConstraint();

		/**
		 * The meta object literal for the '<em><b>Distortion Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_BASED_CONSTRAINT__DISTORTION_CONSTRAINTS = eINSTANCE
				.getValueBasedConstraint_DistortionConstraints();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.MinimumValueImpl <em>Minimum Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.MinimumValueImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getMinimumValue()
		 * @generated
		 */
		EClass MINIMUM_VALUE = eINSTANCE.getMinimumValue();

		/**
		 * The meta object literal for the '<em><b>Minimum Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINIMUM_VALUE__MINIMUM_ATTRIBUTE = eINSTANCE.getMinimumValue_MinimumAttribute();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.MaximumValueImpl <em>Maximum Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.MaximumValueImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getMaximumValue()
		 * @generated
		 */
		EClass MAXIMUM_VALUE = eINSTANCE.getMaximumValue();

		/**
		 * The meta object literal for the '<em><b>Maximum Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAXIMUM_VALUE__MAXIMUM_ATTRIBUTE = eINSTANCE.getMaximumValue_MaximumAttribute();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.RegenerationConstraintImpl <em>Regeneration Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.RegenerationConstraintImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getRegenerationConstraint()
		 * @generated
		 */
		EClass REGENERATION_CONSTRAINT = eINSTANCE.getRegenerationConstraint();

		/**
		 * The meta object literal for the '<em><b>Regeneration Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGENERATION_CONSTRAINT__REGENERATION_ATTRIBUTE = eINSTANCE
				.getRegenerationConstraint_RegenerationAttribute();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.DependencyConstraint <em>Dependency Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.DependencyConstraint
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getDependencyConstraint()
		 * @generated
		 */
		EClass DEPENDENCY_CONSTRAINT = eINSTANCE.getDependencyConstraint();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.LetterBasedConstraintImpl <em>Letter Based Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.LetterBasedConstraintImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getLetterBasedConstraint()
		 * @generated
		 */
		EClass LETTER_BASED_CONSTRAINT = eINSTANCE.getLetterBasedConstraint();

		/**
		 * The meta object literal for the '<em><b>Constrained Attribute Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LETTER_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE = eINSTANCE
				.getLetterBasedConstraint_ConstrainedAttributeInstance();

		/**
		 * The meta object literal for the '<em><b>Letter Length Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LETTER_BASED_CONSTRAINT__LETTER_LENGTH_CONSTRAINT = eINSTANCE
				.getLetterBasedConstraint_LetterLengthConstraint();

		/**
		 * The meta object literal for the '<em><b>Letter Customization Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LETTER_BASED_CONSTRAINT__LETTER_CUSTOMIZATION_CONSTRAINT = eINSTANCE
				.getLetterBasedConstraint_LetterCustomizationConstraint();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.InventorySystemImpl <em>Inventory System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.InventorySystemImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getInventorySystem()
		 * @generated
		 */
		EClass INVENTORY_SYSTEM = eINSTANCE.getInventorySystem();

		/**
		 * The meta object literal for the '<em><b>Inventory Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_SYSTEM__INVENTORY_CONSTRAINTS = eINSTANCE.getInventorySystem_InventoryConstraints();

		/**
		 * The meta object literal for the '<em><b>System Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_SYSTEM__SYSTEM_ITEMS = eINSTANCE.getInventorySystem_SystemItems();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.InventorySystemConstraintImpl <em>Inventory System Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.InventorySystemConstraintImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getInventorySystemConstraint()
		 * @generated
		 */
		EClass INVENTORY_SYSTEM_CONSTRAINT = eINSTANCE.getInventorySystemConstraint();

		/**
		 * The meta object literal for the '<em><b>Selection Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_SYSTEM_CONSTRAINT__SELECTION_CONSTRAINT = eINSTANCE
				.getInventorySystemConstraint_SelectionConstraint();

		/**
		 * The meta object literal for the '<em><b>Equip Item Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_SYSTEM_CONSTRAINT__EQUIP_ITEM_CONSTRAINT = eINSTANCE
				.getInventorySystemConstraint_EquipItemConstraint();

		/**
		 * The meta object literal for the '<em><b>Slot Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_SYSTEM_CONSTRAINT__SLOT_CONSTRAINT = eINSTANCE
				.getInventorySystemConstraint_SlotConstraint();

		/**
		 * The meta object literal for the '<em><b>Stack Weight Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_SYSTEM_CONSTRAINT__STACK_WEIGHT_CONSTRAINT = eINSTANCE
				.getInventorySystemConstraint_StackWeightConstraint();

		/**
		 * The meta object literal for the '<em><b>Auto Craft Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_SYSTEM_CONSTRAINT__AUTO_CRAFT_CONSTRAINT = eINSTANCE
				.getInventorySystemConstraint_AutoCraftConstraint();

		/**
		 * The meta object literal for the '<em><b>Vain Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_SYSTEM_CONSTRAINT__VAIN_CONSTRAINT = eINSTANCE
				.getInventorySystemConstraint_VainConstraint();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.InventoryConstraintRule <em>Inventory Constraint Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.InventoryConstraintRule
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getInventoryConstraintRule()
		 * @generated
		 */
		EClass INVENTORY_CONSTRAINT_RULE = eINSTANCE.getInventoryConstraintRule();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.AutoCraftConstraintImpl <em>Auto Craft Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.AutoCraftConstraintImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getAutoCraftConstraint()
		 * @generated
		 */
		EClass AUTO_CRAFT_CONSTRAINT = eINSTANCE.getAutoCraftConstraint();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.StackWeightConstraint <em>Stack Weight Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.StackWeightConstraint
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getStackWeightConstraint()
		 * @generated
		 */
		EClass STACK_WEIGHT_CONSTRAINT = eINSTANCE.getStackWeightConstraint();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.StackConstraintImpl <em>Stack Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.StackConstraintImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getStackConstraint()
		 * @generated
		 */
		EClass STACK_CONSTRAINT = eINSTANCE.getStackConstraint();

		/**
		 * The meta object literal for the '<em><b>Stack Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_CONSTRAINT__STACK_AMOUNT = eINSTANCE.getStackConstraint_StackAmount();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.WeightConstraintImpl <em>Weight Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.WeightConstraintImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getWeightConstraint()
		 * @generated
		 */
		EClass WEIGHT_CONSTRAINT = eINSTANCE.getWeightConstraint();

		/**
		 * The meta object literal for the '<em><b>Total Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEIGHT_CONSTRAINT__TOTAL_WEIGHT = eINSTANCE.getWeightConstraint_TotalWeight();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.SlotConstraintImpl <em>Slot Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.SlotConstraintImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getSlotConstraint()
		 * @generated
		 */
		EClass SLOT_CONSTRAINT = eINSTANCE.getSlotConstraint();

		/**
		 * The meta object literal for the '<em><b>Number Of Slots</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOT_CONSTRAINT__NUMBER_OF_SLOTS = eINSTANCE.getSlotConstraint_NumberOfSlots();

		/**
		 * The meta object literal for the '<em><b>Maximum Slots</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOT_CONSTRAINT__MAXIMUM_SLOTS = eINSTANCE.getSlotConstraint_MaximumSlots();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.EquipItemConstraintImpl <em>Equip Item Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.EquipItemConstraintImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getEquipItemConstraint()
		 * @generated
		 */
		EClass EQUIP_ITEM_CONSTRAINT = eINSTANCE.getEquipItemConstraint();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.SelectionConstraintImpl <em>Selection Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.SelectionConstraintImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getSelectionConstraint()
		 * @generated
		 */
		EClass SELECTION_CONSTRAINT = eINSTANCE.getSelectionConstraint();

		/**
		 * The meta object literal for the '<em><b>Selectable Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTION_CONSTRAINT__SELECTABLE_AMOUNT = eINSTANCE.getSelectionConstraint_SelectableAmount();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.ModelBasedAttributeImpl <em>Model Based Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.ModelBasedAttributeImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getModelBasedAttribute()
		 * @generated
		 */
		EClass MODEL_BASED_ATTRIBUTE = eINSTANCE.getModelBasedAttribute();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.ParticleBasedAttributeImpl <em>Particle Based Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.ParticleBasedAttributeImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getParticleBasedAttribute()
		 * @generated
		 */
		EClass PARTICLE_BASED_ATTRIBUTE = eINSTANCE.getParticleBasedAttribute();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.VainConstraintImpl <em>Vain Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.VainConstraintImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getVainConstraint()
		 * @generated
		 */
		EClass VAIN_CONSTRAINT = eINSTANCE.getVainConstraint();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.BaseValueConstraintImpl <em>Base Value Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.BaseValueConstraintImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getBaseValueConstraint()
		 * @generated
		 */
		EClass BASE_VALUE_CONSTRAINT = eINSTANCE.getBaseValueConstraint();

		/**
		 * The meta object literal for the '<em><b>Default Base Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_VALUE_CONSTRAINT__DEFAULT_BASE_VALUE = eINSTANCE.getBaseValueConstraint_DefaultBaseValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.BaseOrRangeConstraint <em>Base Or Range Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.BaseOrRangeConstraint
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getBaseOrRangeConstraint()
		 * @generated
		 */
		EClass BASE_OR_RANGE_CONSTRAINT = eINSTANCE.getBaseOrRangeConstraint();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.ValueRangeBasedConstraintImpl <em>Value Range Based Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.ValueRangeBasedConstraintImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getValueRangeBasedConstraint()
		 * @generated
		 */
		EClass VALUE_RANGE_BASED_CONSTRAINT = eINSTANCE.getValueRangeBasedConstraint();

		/**
		 * The meta object literal for the '<em><b>Minimum Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_RANGE_BASED_CONSTRAINT__MINIMUM_VALUE = eINSTANCE.getValueRangeBasedConstraint_MinimumValue();

		/**
		 * The meta object literal for the '<em><b>Maximum Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_RANGE_BASED_CONSTRAINT__MAXIMUM_VALUE = eINSTANCE.getValueRangeBasedConstraint_MaximumValue();

		/**
		 * The meta object literal for the '<em><b>Initializer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_RANGE_BASED_CONSTRAINT__INITIALIZER = eINSTANCE.getValueRangeBasedConstraint_Initializer();

		/**
		 * The meta object literal for the '<em><b>Conversion Dependency Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_RANGE_BASED_CONSTRAINT__CONVERSION_DEPENDENCY_CONSTRAINT = eINSTANCE
				.getValueRangeBasedConstraint_ConversionDependencyConstraint();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.BaseValueRangedConstraint <em>Base Value Ranged Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.BaseValueRangedConstraint
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getBaseValueRangedConstraint()
		 * @generated
		 */
		EClass BASE_VALUE_RANGED_CONSTRAINT = eINSTANCE.getBaseValueRangedConstraint();

		/**
		 * The meta object literal for the '<em><b>Remap Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_VALUE_RANGED_CONSTRAINT__REMAP_VALUE = eINSTANCE.getBaseValueRangedConstraint_RemapValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.SingleValueConstraint <em>Single Value Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.SingleValueConstraint
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getSingleValueConstraint()
		 * @generated
		 */
		EClass SINGLE_VALUE_CONSTRAINT = eINSTANCE.getSingleValueConstraint();

		/**
		 * The meta object literal for the '<em><b>Variability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_VALUE_CONSTRAINT__VARIABILITY = eINSTANCE.getSingleValueConstraint_Variability();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.MarginOfErrorConstraintImpl <em>Margin Of Error Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.MarginOfErrorConstraintImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getMarginOfErrorConstraint()
		 * @generated
		 */
		EClass MARGIN_OF_ERROR_CONSTRAINT = eINSTANCE.getMarginOfErrorConstraint();

		/**
		 * The meta object literal for the '<em><b>MOE Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARGIN_OF_ERROR_CONSTRAINT__MOE_ATTRIBUTE = eINSTANCE.getMarginOfErrorConstraint_MOEAttribute();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.AudioBasedAttributeImpl <em>Audio Based Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.AudioBasedAttributeImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getAudioBasedAttribute()
		 * @generated
		 */
		EClass AUDIO_BASED_ATTRIBUTE = eINSTANCE.getAudioBasedAttribute();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.CharacterBasedAttributeImpl <em>Character Based Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.CharacterBasedAttributeImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getCharacterBasedAttribute()
		 * @generated
		 */
		EClass CHARACTER_BASED_ATTRIBUTE = eINSTANCE.getCharacterBasedAttribute();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_BASED_ATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getCharacterBasedAttribute_DefaultValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.IntegerBasedAttributeImpl <em>Integer Based Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.IntegerBasedAttributeImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getIntegerBasedAttribute()
		 * @generated
		 */
		EClass INTEGER_BASED_ATTRIBUTE = eINSTANCE.getIntegerBasedAttribute();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_BASED_ATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getIntegerBasedAttribute_DefaultValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.DecimalBasedAttributeImpl <em>Decimal Based Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.DecimalBasedAttributeImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getDecimalBasedAttribute()
		 * @generated
		 */
		EClass DECIMAL_BASED_ATTRIBUTE = eINSTANCE.getDecimalBasedAttribute();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECIMAL_BASED_ATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getDecimalBasedAttribute_DefaultValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.DirectDependencyConstraintImpl <em>Direct Dependency Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.DirectDependencyConstraintImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getDirectDependencyConstraint()
		 * @generated
		 */
		EClass DIRECT_DEPENDENCY_CONSTRAINT = eINSTANCE.getDirectDependencyConstraint();

		/**
		 * The meta object literal for the '<em><b>Dependent Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECT_DEPENDENCY_CONSTRAINT__DEPENDENT_ATTRIBUTES = eINSTANCE
				.getDirectDependencyConstraint_DependentAttributes();

		/**
		 * The meta object literal for the '<em><b>Dependency Formula</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECT_DEPENDENCY_CONSTRAINT__DEPENDENCY_FORMULA = eINSTANCE
				.getDirectDependencyConstraint_DependencyFormula();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.ConversionDependencyConstraintImpl <em>Conversion Dependency Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.ConversionDependencyConstraintImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getConversionDependencyConstraint()
		 * @generated
		 */
		EClass CONVERSION_DEPENDENCY_CONSTRAINT = eINSTANCE.getConversionDependencyConstraint();

		/**
		 * The meta object literal for the '<em><b>Attribute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_DEPENDENCY_CONSTRAINT__ATTRIBUTE_NAME = eINSTANCE
				.getConversionDependencyConstraint_AttributeName();

		/**
		 * The meta object literal for the '<em><b>Conversion Unit To Base</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_DEPENDENCY_CONSTRAINT__CONVERSION_UNIT_TO_BASE = eINSTANCE
				.getConversionDependencyConstraint_ConversionUnitToBase();

		/**
		 * The meta object literal for the '<em><b>Conversion Chain</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSION_DEPENDENCY_CONSTRAINT__CONVERSION_CHAIN = eINSTANCE
				.getConversionDependencyConstraint_ConversionChain();

		/**
		 * The meta object literal for the '<em><b>Value Range Based Constraint</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSION_DEPENDENCY_CONSTRAINT__VALUE_RANGE_BASED_CONSTRAINT = eINSTANCE
				.getConversionDependencyConstraint_ValueRangeBasedConstraint();

		/**
		 * The meta object literal for the '<em><b>Next Attribute In Chain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSION_DEPENDENCY_CONSTRAINT__NEXT_ATTRIBUTE_IN_CHAIN = eINSTANCE
				.getConversionDependencyConstraint_NextAttributeInChain();

		/**
		 * The meta object literal for the '<em><b>Conversion Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_DEPENDENCY_CONSTRAINT__CONVERSION_RATE = eINSTANCE
				.getConversionDependencyConstraint_ConversionRate();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.DistortionConstraint <em>Distortion Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.DistortionConstraint
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getDistortionConstraint()
		 * @generated
		 */
		EClass DISTORTION_CONSTRAINT = eINSTANCE.getDistortionConstraint();

		/**
		 * The meta object literal for the '<em><b>Distortion Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTORTION_CONSTRAINT__DISTORTION_ATTRIBUTE = eINSTANCE
				.getDistortionConstraint_DistortionAttribute();

		/**
		 * The meta object literal for the '<em><b>Distortion Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTORTION_CONSTRAINT__DISTORTION_MODE = eINSTANCE.getDistortionConstraint_DistortionMode();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.Vector2DBasedConstraintImpl <em>Vector2 DBased Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.Vector2DBasedConstraintImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getVector2DBasedConstraint()
		 * @generated
		 */
		EClass VECTOR2_DBASED_CONSTRAINT = eINSTANCE.getVector2DBasedConstraint();

		/**
		 * The meta object literal for the '<em><b>Constrained Attribute Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VECTOR2_DBASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE = eINSTANCE
				.getVector2DBasedConstraint_ConstrainedAttributeInstance();

		/**
		 * The meta object literal for the '<em><b>Vector2 DRange Based Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VECTOR2_DBASED_CONSTRAINT__VECTOR2_DRANGE_BASED_CONSTRAINT = eINSTANCE
				.getVector2DBasedConstraint_Vector2DRangeBasedConstraint();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.VectorBasedConstraintImpl <em>Vector Based Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.VectorBasedConstraintImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getVectorBasedConstraint()
		 * @generated
		 */
		EClass VECTOR_BASED_CONSTRAINT = eINSTANCE.getVectorBasedConstraint();

		/**
		 * The meta object literal for the '<em><b>Constrained Attribute Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VECTOR_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE = eINSTANCE
				.getVectorBasedConstraint_ConstrainedAttributeInstance();

		/**
		 * The meta object literal for the '<em><b>Vector Range Based Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VECTOR_BASED_CONSTRAINT__VECTOR_RANGE_BASED_CONSTRAINT = eINSTANCE
				.getVectorBasedConstraint_VectorRangeBasedConstraint();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.RotatorBasedConstraintImpl <em>Rotator Based Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.RotatorBasedConstraintImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getRotatorBasedConstraint()
		 * @generated
		 */
		EClass ROTATOR_BASED_CONSTRAINT = eINSTANCE.getRotatorBasedConstraint();

		/**
		 * The meta object literal for the '<em><b>Constrained Attribute Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROTATOR_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE = eINSTANCE
				.getRotatorBasedConstraint_ConstrainedAttributeInstance();

		/**
		 * The meta object literal for the '<em><b>Rotator Range Based Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROTATOR_BASED_CONSTRAINT__ROTATOR_RANGE_BASED_CONSTRAINT = eINSTANCE
				.getRotatorBasedConstraint_RotatorRangeBasedConstraint();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.TransformationBasedConstraintImpl <em>Transformation Based Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.TransformationBasedConstraintImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getTransformationBasedConstraint()
		 * @generated
		 */
		EClass TRANSFORMATION_BASED_CONSTRAINT = eINSTANCE.getTransformationBasedConstraint();

		/**
		 * The meta object literal for the '<em><b>Constrained Attribute Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE = eINSTANCE
				.getTransformationBasedConstraint_ConstrainedAttributeInstance();

		/**
		 * The meta object literal for the '<em><b>Transformation Range Based Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_BASED_CONSTRAINT__TRANSFORMATION_RANGE_BASED_CONSTRAINT = eINSTANCE
				.getTransformationBasedConstraint_TransformationRangeBasedConstraint();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.ColorBasedConstraintImpl <em>Color Based Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.ColorBasedConstraintImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getColorBasedConstraint()
		 * @generated
		 */
		EClass COLOR_BASED_CONSTRAINT = eINSTANCE.getColorBasedConstraint();

		/**
		 * The meta object literal for the '<em><b>Constrained Attribute Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLOR_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE = eINSTANCE
				.getColorBasedConstraint_ConstrainedAttributeInstance();

		/**
		 * The meta object literal for the '<em><b>Color Customization Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLOR_BASED_CONSTRAINT__COLOR_CUSTOMIZATION_CONSTRAINT = eINSTANCE
				.getColorBasedConstraint_ColorCustomizationConstraint();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.TextureBasedConstraintImpl <em>Texture Based Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.TextureBasedConstraintImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getTextureBasedConstraint()
		 * @generated
		 */
		EClass TEXTURE_BASED_CONSTRAINT = eINSTANCE.getTextureBasedConstraint();

		/**
		 * The meta object literal for the '<em><b>Constrained Attribute Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXTURE_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE = eINSTANCE
				.getTextureBasedConstraint_ConstrainedAttributeInstance();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.ModelBasedConstraintImpl <em>Model Based Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.ModelBasedConstraintImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getModelBasedConstraint()
		 * @generated
		 */
		EClass MODEL_BASED_CONSTRAINT = eINSTANCE.getModelBasedConstraint();

		/**
		 * The meta object literal for the '<em><b>Constrained Attribute Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE = eINSTANCE
				.getModelBasedConstraint_ConstrainedAttributeInstance();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.ParticleBasedConstraintImpl <em>Particle Based Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.ParticleBasedConstraintImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getParticleBasedConstraint()
		 * @generated
		 */
		EClass PARTICLE_BASED_CONSTRAINT = eINSTANCE.getParticleBasedConstraint();

		/**
		 * The meta object literal for the '<em><b>Constrained Attribute Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICLE_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE = eINSTANCE
				.getParticleBasedConstraint_ConstrainedAttributeInstance();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.AudioBasedConstraintImpl <em>Audio Based Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.AudioBasedConstraintImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getAudioBasedConstraint()
		 * @generated
		 */
		EClass AUDIO_BASED_CONSTRAINT = eINSTANCE.getAudioBasedConstraint();

		/**
		 * The meta object literal for the '<em><b>Constrained Attribute Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDIO_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE = eINSTANCE
				.getAudioBasedConstraint_ConstrainedAttributeInstance();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.LetterLengthConstraintImpl <em>Letter Length Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.LetterLengthConstraintImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getLetterLengthConstraint()
		 * @generated
		 */
		EClass LETTER_LENGTH_CONSTRAINT = eINSTANCE.getLetterLengthConstraint();

		/**
		 * The meta object literal for the '<em><b>Maximum Length Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LETTER_LENGTH_CONSTRAINT__MAXIMUM_LENGTH_ATTRIBUTE = eINSTANCE
				.getLetterLengthConstraint_MaximumLengthAttribute();

		/**
		 * The meta object literal for the '<em><b>Minimum Length Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LETTER_LENGTH_CONSTRAINT__MINIMUM_LENGTH_ATTRIBUTE = eINSTANCE
				.getLetterLengthConstraint_MinimumLengthAttribute();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.LetterCustomizationConstraintImpl <em>Letter Customization Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.LetterCustomizationConstraintImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getLetterCustomizationConstraint()
		 * @generated
		 */
		EClass LETTER_CUSTOMIZATION_CONSTRAINT = eINSTANCE.getLetterCustomizationConstraint();

		/**
		 * The meta object literal for the '<em><b>Filter Strings</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LETTER_CUSTOMIZATION_CONSTRAINT__FILTER_STRINGS = eINSTANCE
				.getLetterCustomizationConstraint_FilterStrings();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.ValueConstraintRule <em>Value Constraint Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.ValueConstraintRule
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getValueConstraintRule()
		 * @generated
		 */
		EClass VALUE_CONSTRAINT_RULE = eINSTANCE.getValueConstraintRule();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.LetterConstraintRule <em>Letter Constraint Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.LetterConstraintRule
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getLetterConstraintRule()
		 * @generated
		 */
		EClass LETTER_CONSTRAINT_RULE = eINSTANCE.getLetterConstraintRule();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.Vector2DRangeBasedConstraintImpl <em>Vector2 DRange Based Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.Vector2DRangeBasedConstraintImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getVector2DRangeBasedConstraint()
		 * @generated
		 */
		EClass VECTOR2_DRANGE_BASED_CONSTRAINT = eINSTANCE.getVector2DRangeBasedConstraint();

		/**
		 * The meta object literal for the '<em><b>Minimum Vector2 DAttribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VECTOR2_DRANGE_BASED_CONSTRAINT__MINIMUM_VECTOR2_DATTRIBUTE = eINSTANCE
				.getVector2DRangeBasedConstraint_MinimumVector2DAttribute();

		/**
		 * The meta object literal for the '<em><b>Maximum Vector2 DAttribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VECTOR2_DRANGE_BASED_CONSTRAINT__MAXIMUM_VECTOR2_DATTRIBUTE = eINSTANCE
				.getVector2DRangeBasedConstraint_MaximumVector2DAttribute();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.Vector2DConstraintRule <em>Vector2 DConstraint Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.Vector2DConstraintRule
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getVector2DConstraintRule()
		 * @generated
		 */
		EClass VECTOR2_DCONSTRAINT_RULE = eINSTANCE.getVector2DConstraintRule();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.VectorConstraintRule <em>Vector Constraint Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.VectorConstraintRule
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getVectorConstraintRule()
		 * @generated
		 */
		EClass VECTOR_CONSTRAINT_RULE = eINSTANCE.getVectorConstraintRule();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.VectorRangeBasedConstraintImpl <em>Vector Range Based Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.VectorRangeBasedConstraintImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getVectorRangeBasedConstraint()
		 * @generated
		 */
		EClass VECTOR_RANGE_BASED_CONSTRAINT = eINSTANCE.getVectorRangeBasedConstraint();

		/**
		 * The meta object literal for the '<em><b>Maximum Vector Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VECTOR_RANGE_BASED_CONSTRAINT__MAXIMUM_VECTOR_ATTRIBUTE = eINSTANCE
				.getVectorRangeBasedConstraint_MaximumVectorAttribute();

		/**
		 * The meta object literal for the '<em><b>Minimum Vector Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VECTOR_RANGE_BASED_CONSTRAINT__MINIMUM_VECTOR_ATTRIBUTE = eINSTANCE
				.getVectorRangeBasedConstraint_MinimumVectorAttribute();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.RangeBasedConstraint <em>Range Based Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.RangeBasedConstraint
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getRangeBasedConstraint()
		 * @generated
		 */
		EClass RANGE_BASED_CONSTRAINT = eINSTANCE.getRangeBasedConstraint();

		/**
		 * The meta object literal for the '<em><b>Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE_BASED_CONSTRAINT__LIMIT = eINSTANCE.getRangeBasedConstraint_Limit();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.RotatorConstraintRule <em>Rotator Constraint Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.RotatorConstraintRule
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getRotatorConstraintRule()
		 * @generated
		 */
		EClass ROTATOR_CONSTRAINT_RULE = eINSTANCE.getRotatorConstraintRule();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.RotatorRangeBasedConstraintImpl <em>Rotator Range Based Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.RotatorRangeBasedConstraintImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getRotatorRangeBasedConstraint()
		 * @generated
		 */
		EClass ROTATOR_RANGE_BASED_CONSTRAINT = eINSTANCE.getRotatorRangeBasedConstraint();

		/**
		 * The meta object literal for the '<em><b>Maximum Rotator Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROTATOR_RANGE_BASED_CONSTRAINT__MAXIMUM_ROTATOR_ATTRIBUTE = eINSTANCE
				.getRotatorRangeBasedConstraint_MaximumRotatorAttribute();

		/**
		 * The meta object literal for the '<em><b>Minimum Rotator Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROTATOR_RANGE_BASED_CONSTRAINT__MINIMUM_ROTATOR_ATTRIBUTE = eINSTANCE
				.getRotatorRangeBasedConstraint_MinimumRotatorAttribute();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.TransformationConstraintRule <em>Transformation Constraint Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.TransformationConstraintRule
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getTransformationConstraintRule()
		 * @generated
		 */
		EClass TRANSFORMATION_CONSTRAINT_RULE = eINSTANCE.getTransformationConstraintRule();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.TransformationRangeBasedConstraintImpl <em>Transformation Range Based Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.TransformationRangeBasedConstraintImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getTransformationRangeBasedConstraint()
		 * @generated
		 */
		EClass TRANSFORMATION_RANGE_BASED_CONSTRAINT = eINSTANCE.getTransformationRangeBasedConstraint();

		/**
		 * The meta object literal for the '<em><b>Maximum Transformation Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_RANGE_BASED_CONSTRAINT__MAXIMUM_TRANSFORMATION_ATTRIBUTE = eINSTANCE
				.getTransformationRangeBasedConstraint_MaximumTransformationAttribute();

		/**
		 * The meta object literal for the '<em><b>Minimum Transformation Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_RANGE_BASED_CONSTRAINT__MINIMUM_TRANSFORMATION_ATTRIBUTE = eINSTANCE
				.getTransformationRangeBasedConstraint_MinimumTransformationAttribute();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.CustomizationType <em>Customization Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.CustomizationType
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getCustomizationType()
		 * @generated
		 */
		EClass CUSTOMIZATION_TYPE = eINSTANCE.getCustomizationType();

		/**
		 * The meta object literal for the '<em><b>Filter Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMIZATION_TYPE__FILTER_TYPE = eINSTANCE.getCustomizationType_FilterType();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.ColorCustomizationConstraintImpl <em>Color Customization Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.ColorCustomizationConstraintImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getColorCustomizationConstraint()
		 * @generated
		 */
		EClass COLOR_CUSTOMIZATION_CONSTRAINT = eINSTANCE.getColorCustomizationConstraint();

		/**
		 * The meta object literal for the '<em><b>Filter Colors</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLOR_CUSTOMIZATION_CONSTRAINT__FILTER_COLORS = eINSTANCE
				.getColorCustomizationConstraint_FilterColors();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.ColorConstraintRule <em>Color Constraint Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.ColorConstraintRule
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getColorConstraintRule()
		 * @generated
		 */
		EClass COLOR_CONSTRAINT_RULE = eINSTANCE.getColorConstraintRule();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.EnumBasedConstraintImpl <em>Enum Based Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.EnumBasedConstraintImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getEnumBasedConstraint()
		 * @generated
		 */
		EClass ENUM_BASED_CONSTRAINT = eINSTANCE.getEnumBasedConstraint();

		/**
		 * The meta object literal for the '<em><b>Constrained Attribute Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE = eINSTANCE
				.getEnumBasedConstraint_ConstrainedAttributeInstance();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.SimpleEnumStructureImpl <em>Simple Enum Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.SimpleEnumStructureImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getSimpleEnumStructure()
		 * @generated
		 */
		EClass SIMPLE_ENUM_STRUCTURE = eINSTANCE.getSimpleEnumStructure();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.BitmaskedEnumStructureImpl <em>Bitmasked Enum Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.BitmaskedEnumStructureImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getBitmaskedEnumStructure()
		 * @generated
		 */
		EClass BITMASKED_ENUM_STRUCTURE = eINSTANCE.getBitmaskedEnumStructure();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.GameStructureContainerImpl <em>Game Structure Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.GameStructureContainerImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getGameStructureContainer()
		 * @generated
		 */
		EClass GAME_STRUCTURE_CONTAINER = eINSTANCE.getGameStructureContainer();

		/**
		 * The meta object literal for the '<em><b>Game Structures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_STRUCTURE_CONTAINER__GAME_STRUCTURES = eINSTANCE.getGameStructureContainer_GameStructures();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.GameStructure <em>Game Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.GameStructure
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getGameStructure()
		 * @generated
		 */
		EClass GAME_STRUCTURE = eINSTANCE.getGameStructure();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.EnumBasedAttributeImpl <em>Enum Based Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.EnumBasedAttributeImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getEnumBasedAttribute()
		 * @generated
		 */
		EClass ENUM_BASED_ATTRIBUTE = eINSTANCE.getEnumBasedAttribute();

		/**
		 * The meta object literal for the '<em><b>Enum Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_BASED_ATTRIBUTE__ENUM_TYPE = eINSTANCE.getEnumBasedAttribute_EnumType();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.StructureBasedAttributeImpl <em>Structure Based Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.StructureBasedAttributeImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getStructureBasedAttribute()
		 * @generated
		 */
		EClass STRUCTURE_BASED_ATTRIBUTE = eINSTANCE.getStructureBasedAttribute();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_BASED_ATTRIBUTE__DATA_TYPE = eINSTANCE.getStructureBasedAttribute_DataType();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.StructureBasedConstraintImpl <em>Structure Based Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.StructureBasedConstraintImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getStructureBasedConstraint()
		 * @generated
		 */
		EClass STRUCTURE_BASED_CONSTRAINT = eINSTANCE.getStructureBasedConstraint();

		/**
		 * The meta object literal for the '<em><b>Constrained Attribute Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE = eINSTANCE
				.getStructureBasedConstraint_ConstrainedAttributeInstance();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.GetterDistortionConstraintImpl <em>Getter Distortion Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.GetterDistortionConstraintImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getGetterDistortionConstraint()
		 * @generated
		 */
		EClass GETTER_DISTORTION_CONSTRAINT = eINSTANCE.getGetterDistortionConstraint();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.SetterDistortionConstraintImpl <em>Setter Distortion Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.SetterDistortionConstraintImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getSetterDistortionConstraint()
		 * @generated
		 */
		EClass SETTER_DISTORTION_CONSTRAINT = eINSTANCE.getSetterDistortionConstraint();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.MaterialBasedConstraintImpl <em>Material Based Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.MaterialBasedConstraintImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getMaterialBasedConstraint()
		 * @generated
		 */
		EClass MATERIAL_BASED_CONSTRAINT = eINSTANCE.getMaterialBasedConstraint();

		/**
		 * The meta object literal for the '<em><b>Constrained Attribute Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATERIAL_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE = eINSTANCE
				.getMaterialBasedConstraint_ConstrainedAttributeInstance();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.impl.MaterialBasedAttributeImpl <em>Material Based Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.impl.MaterialBasedAttributeImpl
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getMaterialBasedAttribute()
		 * @generated
		 */
		EClass MATERIAL_BASED_ATTRIBUTE = eINSTANCE.getMaterialBasedAttribute();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.AdditionLimit <em>Addition Limit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.AdditionLimit
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getAdditionLimit()
		 * @generated
		 */
		EEnum ADDITION_LIMIT = eINSTANCE.getAdditionLimit();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.VariabilityType <em>Variability Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.VariabilityType
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getVariabilityType()
		 * @generated
		 */
		EEnum VARIABILITY_TYPE = eINSTANCE.getVariabilityType();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.FilteringType <em>Filtering Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.FilteringType
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getFilteringType()
		 * @generated
		 */
		EEnum FILTERING_TYPE = eINSTANCE.getFilteringType();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.ArithmeticOperations <em>Arithmetic Operations</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.ArithmeticOperations
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getArithmeticOperations()
		 * @generated
		 */
		EEnum ARITHMETIC_OPERATIONS = eINSTANCE.getArithmeticOperations();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.UGSML.InitializationMode <em>Initialization Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.UGSML.InitializationMode
		 * @see org.eclipse.sirius.sample.UGSML.impl.UGSMLPackageImpl#getInitializationMode()
		 * @generated
		 */
		EEnum INITIALIZATION_MODE = eINSTANCE.getInitializationMode();

	}

} //UGSMLPackage
