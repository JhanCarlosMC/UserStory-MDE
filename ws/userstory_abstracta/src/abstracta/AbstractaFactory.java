/**
 */
package abstracta;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see abstracta.AbstractaPackage
 * @generated
 */
public interface AbstractaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AbstractaFactory eINSTANCE = abstracta.impl.AbstractaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model Factory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Factory</em>'.
	 * @generated
	 */
	ModelFactory createModelFactory();

	/**
	 * Returns a new object of class '<em>User Story</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Story</em>'.
	 * @generated
	 */
	UserStory createUserStory();

	/**
	 * Returns a new object of class '<em>Como</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Como</em>'.
	 * @generated
	 */
	Como createComo();

	/**
	 * Returns a new object of class '<em>Quiero</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quiero</em>'.
	 * @generated
	 */
	Quiero createQuiero();

	/**
	 * Returns a new object of class '<em>Para</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Para</em>'.
	 * @generated
	 */
	Para createPara();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AbstractaPackage getAbstractaPackage();

} //AbstractaFactory
