/**
 */
package concreta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workspace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link concreta.Workspace#getNombre <em>Nombre</em>}</li>
 *   <li>{@link concreta.Workspace#getListUserStorys <em>List User Storys</em>}</li>
 * </ul>
 *
 * @see concreta.ConcretaPackage#getWorkspace()
 * @model
 * @generated
 */
public interface Workspace extends EObject {
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
	 * @see concreta.ConcretaPackage#getWorkspace_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link concreta.Workspace#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>List User Storys</b></em>' containment reference list.
	 * The list contents are of type {@link concreta.UserStory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List User Storys</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List User Storys</em>' containment reference list.
	 * @see concreta.ConcretaPackage#getWorkspace_ListUserStorys()
	 * @model containment="true"
	 * @generated
	 */
	EList<UserStory> getListUserStorys();

} // Workspace
