/**
 */
package concreta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Story</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link concreta.UserStory#getNombre <em>Nombre</em>}</li>
 *   <li>{@link concreta.UserStory#getIdentificador <em>Identificador</em>}</li>
 *   <li>{@link concreta.UserStory#getEstimacion <em>Estimacion</em>}</li>
 *   <li>{@link concreta.UserStory#getPrioridad <em>Prioridad</em>}</li>
 *   <li>{@link concreta.UserStory#getRiesgo <em>Riesgo</em>}</li>
 *   <li>{@link concreta.UserStory#getResponsable <em>Responsable</em>}</li>
 *   <li>{@link concreta.UserStory#getIteracion <em>Iteracion</em>}</li>
 *   <li>{@link concreta.UserStory#getTheComo <em>The Como</em>}</li>
 *   <li>{@link concreta.UserStory#getTheQuiero <em>The Quiero</em>}</li>
 *   <li>{@link concreta.UserStory#getThePara <em>The Para</em>}</li>
 * </ul>
 *
 * @see concreta.ConcretaPackage#getUserStory()
 * @model annotation="gmf.node label='nombre' color='230,224,99' margin='1'"
 * @generated
 */
public interface UserStory extends EObject {
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
	 * @see concreta.ConcretaPackage#getUserStory_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link concreta.UserStory#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Identificador</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identificador</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identificador</em>' attribute.
	 * @see #setIdentificador(String)
	 * @see concreta.ConcretaPackage#getUserStory_Identificador()
	 * @model
	 * @generated
	 */
	String getIdentificador();

	/**
	 * Sets the value of the '{@link concreta.UserStory#getIdentificador <em>Identificador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identificador</em>' attribute.
	 * @see #getIdentificador()
	 * @generated
	 */
	void setIdentificador(String value);

	/**
	 * Returns the value of the '<em><b>Estimacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimacion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimacion</em>' attribute.
	 * @see #setEstimacion(String)
	 * @see concreta.ConcretaPackage#getUserStory_Estimacion()
	 * @model
	 * @generated
	 */
	String getEstimacion();

	/**
	 * Sets the value of the '{@link concreta.UserStory#getEstimacion <em>Estimacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimacion</em>' attribute.
	 * @see #getEstimacion()
	 * @generated
	 */
	void setEstimacion(String value);

	/**
	 * Returns the value of the '<em><b>Prioridad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prioridad</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prioridad</em>' attribute.
	 * @see #setPrioridad(String)
	 * @see concreta.ConcretaPackage#getUserStory_Prioridad()
	 * @model
	 * @generated
	 */
	String getPrioridad();

	/**
	 * Sets the value of the '{@link concreta.UserStory#getPrioridad <em>Prioridad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prioridad</em>' attribute.
	 * @see #getPrioridad()
	 * @generated
	 */
	void setPrioridad(String value);

	/**
	 * Returns the value of the '<em><b>Riesgo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Riesgo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Riesgo</em>' attribute.
	 * @see #setRiesgo(String)
	 * @see concreta.ConcretaPackage#getUserStory_Riesgo()
	 * @model
	 * @generated
	 */
	String getRiesgo();

	/**
	 * Sets the value of the '{@link concreta.UserStory#getRiesgo <em>Riesgo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Riesgo</em>' attribute.
	 * @see #getRiesgo()
	 * @generated
	 */
	void setRiesgo(String value);

	/**
	 * Returns the value of the '<em><b>Responsable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsable</em>' attribute.
	 * @see #setResponsable(String)
	 * @see concreta.ConcretaPackage#getUserStory_Responsable()
	 * @model
	 * @generated
	 */
	String getResponsable();

	/**
	 * Sets the value of the '{@link concreta.UserStory#getResponsable <em>Responsable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsable</em>' attribute.
	 * @see #getResponsable()
	 * @generated
	 */
	void setResponsable(String value);

	/**
	 * Returns the value of the '<em><b>Iteracion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iteracion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iteracion</em>' attribute.
	 * @see #setIteracion(String)
	 * @see concreta.ConcretaPackage#getUserStory_Iteracion()
	 * @model
	 * @generated
	 */
	String getIteracion();

	/**
	 * Sets the value of the '{@link concreta.UserStory#getIteracion <em>Iteracion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iteracion</em>' attribute.
	 * @see #getIteracion()
	 * @generated
	 */
	void setIteracion(String value);

	/**
	 * Returns the value of the '<em><b>The Como</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Como</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Como</em>' containment reference.
	 * @see #setTheComo(Como)
	 * @see concreta.ConcretaPackage#getUserStory_TheComo()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	Como getTheComo();

	/**
	 * Sets the value of the '{@link concreta.UserStory#getTheComo <em>The Como</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Como</em>' containment reference.
	 * @see #getTheComo()
	 * @generated
	 */
	void setTheComo(Como value);

	/**
	 * Returns the value of the '<em><b>The Quiero</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Quiero</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Quiero</em>' containment reference.
	 * @see #setTheQuiero(Quiero)
	 * @see concreta.ConcretaPackage#getUserStory_TheQuiero()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	Quiero getTheQuiero();

	/**
	 * Sets the value of the '{@link concreta.UserStory#getTheQuiero <em>The Quiero</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Quiero</em>' containment reference.
	 * @see #getTheQuiero()
	 * @generated
	 */
	void setTheQuiero(Quiero value);

	/**
	 * Returns the value of the '<em><b>The Para</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Para</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Para</em>' containment reference.
	 * @see #setThePara(Para)
	 * @see concreta.ConcretaPackage#getUserStory_ThePara()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	Para getThePara();

	/**
	 * Sets the value of the '{@link concreta.UserStory#getThePara <em>The Para</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Para</em>' containment reference.
	 * @see #getThePara()
	 * @generated
	 */
	void setThePara(Para value);

} // UserStory
