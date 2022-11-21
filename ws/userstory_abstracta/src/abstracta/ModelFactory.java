/**
 */
package abstracta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstracta.ModelFactory#getNombre <em>Nombre</em>}</li>
 *   <li>{@link abstracta.ModelFactory#getRuta <em>Ruta</em>}</li>
 *   <li>{@link abstracta.ModelFactory#getListUserStorys <em>List User Storys</em>}</li>
 *   <li>{@link abstracta.ModelFactory#getListTodosUserStorys <em>List Todos User Storys</em>}</li>
 * </ul>
 *
 * @see abstracta.AbstractaPackage#getModelFactory()
 * @model
 * @generated
 */
public interface ModelFactory extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see abstracta.AbstractaPackage#getModelFactory_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link abstracta.ModelFactory#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Ruta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ruta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ruta</em>' attribute.
	 * @see #setRuta(String)
	 * @see abstracta.AbstractaPackage#getModelFactory_Ruta()
	 * @model
	 * @generated
	 */
	String getRuta();

	/**
	 * Sets the value of the '{@link abstracta.ModelFactory#getRuta <em>Ruta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruta</em>' attribute.
	 * @see #getRuta()
	 * @generated
	 */
	void setRuta(String value);

	/**
	 * Returns the value of the '<em><b>List User Storys</b></em>' containment reference list.
	 * The list contents are of type {@link abstracta.UserStory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List User Storys</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List User Storys</em>' containment reference list.
	 * @see abstracta.AbstractaPackage#getModelFactory_ListUserStorys()
	 * @model containment="true"
	 * @generated
	 */
	EList<UserStory> getListUserStorys();

	/**
	 * Returns the value of the '<em><b>List Todos User Storys</b></em>' reference list.
	 * The list contents are of type {@link abstracta.UserStory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Todos User Storys</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Todos User Storys</em>' reference list.
	 * @see abstracta.AbstractaPackage#getModelFactory_ListTodosUserStorys()
	 * @model
	 * @generated
	 */
	EList<UserStory> getListTodosUserStorys();

} // ModelFactory
