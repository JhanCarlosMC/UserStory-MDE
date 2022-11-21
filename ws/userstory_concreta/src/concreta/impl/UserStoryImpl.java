/**
 */
package concreta.impl;

import concreta.Como;
import concreta.ConcretaPackage;
import concreta.Para;
import concreta.Quiero;
import concreta.UserStory;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Story</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link concreta.impl.UserStoryImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link concreta.impl.UserStoryImpl#getIdentificador <em>Identificador</em>}</li>
 *   <li>{@link concreta.impl.UserStoryImpl#getEstimacion <em>Estimacion</em>}</li>
 *   <li>{@link concreta.impl.UserStoryImpl#getPrioridad <em>Prioridad</em>}</li>
 *   <li>{@link concreta.impl.UserStoryImpl#getRiesgo <em>Riesgo</em>}</li>
 *   <li>{@link concreta.impl.UserStoryImpl#getResponsable <em>Responsable</em>}</li>
 *   <li>{@link concreta.impl.UserStoryImpl#getIteracion <em>Iteracion</em>}</li>
 *   <li>{@link concreta.impl.UserStoryImpl#getTheComo <em>The Como</em>}</li>
 *   <li>{@link concreta.impl.UserStoryImpl#getTheQuiero <em>The Quiero</em>}</li>
 *   <li>{@link concreta.impl.UserStoryImpl#getThePara <em>The Para</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserStoryImpl extends EObjectImpl implements UserStory {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentificador() <em>Identificador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentificador()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFICADOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentificador() <em>Identificador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentificador()
	 * @generated
	 * @ordered
	 */
	protected String identificador = IDENTIFICADOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimacion() <em>Estimacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimacion()
	 * @generated
	 * @ordered
	 */
	protected static final String ESTIMACION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstimacion() <em>Estimacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimacion()
	 * @generated
	 * @ordered
	 */
	protected String estimacion = ESTIMACION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrioridad() <em>Prioridad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrioridad()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIORIDAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrioridad() <em>Prioridad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrioridad()
	 * @generated
	 * @ordered
	 */
	protected String prioridad = PRIORIDAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getRiesgo() <em>Riesgo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiesgo()
	 * @generated
	 * @ordered
	 */
	protected static final String RIESGO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRiesgo() <em>Riesgo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiesgo()
	 * @generated
	 * @ordered
	 */
	protected String riesgo = RIESGO_EDEFAULT;

	/**
	 * The default value of the '{@link #getResponsable() <em>Responsable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsable()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponsable() <em>Responsable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsable()
	 * @generated
	 * @ordered
	 */
	protected String responsable = RESPONSABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIteracion() <em>Iteracion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIteracion()
	 * @generated
	 * @ordered
	 */
	protected static final String ITERACION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIteracion() <em>Iteracion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIteracion()
	 * @generated
	 * @ordered
	 */
	protected String iteracion = ITERACION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTheComo() <em>The Como</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheComo()
	 * @generated
	 * @ordered
	 */
	protected Como theComo;

	/**
	 * The cached value of the '{@link #getTheQuiero() <em>The Quiero</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheQuiero()
	 * @generated
	 * @ordered
	 */
	protected Quiero theQuiero;

	/**
	 * The cached value of the '{@link #getThePara() <em>The Para</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThePara()
	 * @generated
	 * @ordered
	 */
	protected Para thePara;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserStoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConcretaPackage.Literals.USER_STORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.USER_STORY__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentificador() {
		return identificador;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentificador(String newIdentificador) {
		String oldIdentificador = identificador;
		identificador = newIdentificador;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.USER_STORY__IDENTIFICADOR, oldIdentificador, identificador));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEstimacion() {
		return estimacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstimacion(String newEstimacion) {
		String oldEstimacion = estimacion;
		estimacion = newEstimacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.USER_STORY__ESTIMACION, oldEstimacion, estimacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrioridad() {
		return prioridad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrioridad(String newPrioridad) {
		String oldPrioridad = prioridad;
		prioridad = newPrioridad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.USER_STORY__PRIORIDAD, oldPrioridad, prioridad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRiesgo() {
		return riesgo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRiesgo(String newRiesgo) {
		String oldRiesgo = riesgo;
		riesgo = newRiesgo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.USER_STORY__RIESGO, oldRiesgo, riesgo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResponsable() {
		return responsable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsable(String newResponsable) {
		String oldResponsable = responsable;
		responsable = newResponsable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.USER_STORY__RESPONSABLE, oldResponsable, responsable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIteracion() {
		return iteracion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIteracion(String newIteracion) {
		String oldIteracion = iteracion;
		iteracion = newIteracion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.USER_STORY__ITERACION, oldIteracion, iteracion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Como getTheComo() {
		return theComo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheComo(Como newTheComo, NotificationChain msgs) {
		Como oldTheComo = theComo;
		theComo = newTheComo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConcretaPackage.USER_STORY__THE_COMO, oldTheComo, newTheComo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheComo(Como newTheComo) {
		if (newTheComo != theComo) {
			NotificationChain msgs = null;
			if (theComo != null)
				msgs = ((InternalEObject)theComo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConcretaPackage.USER_STORY__THE_COMO, null, msgs);
			if (newTheComo != null)
				msgs = ((InternalEObject)newTheComo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConcretaPackage.USER_STORY__THE_COMO, null, msgs);
			msgs = basicSetTheComo(newTheComo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.USER_STORY__THE_COMO, newTheComo, newTheComo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quiero getTheQuiero() {
		return theQuiero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheQuiero(Quiero newTheQuiero, NotificationChain msgs) {
		Quiero oldTheQuiero = theQuiero;
		theQuiero = newTheQuiero;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConcretaPackage.USER_STORY__THE_QUIERO, oldTheQuiero, newTheQuiero);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheQuiero(Quiero newTheQuiero) {
		if (newTheQuiero != theQuiero) {
			NotificationChain msgs = null;
			if (theQuiero != null)
				msgs = ((InternalEObject)theQuiero).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConcretaPackage.USER_STORY__THE_QUIERO, null, msgs);
			if (newTheQuiero != null)
				msgs = ((InternalEObject)newTheQuiero).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConcretaPackage.USER_STORY__THE_QUIERO, null, msgs);
			msgs = basicSetTheQuiero(newTheQuiero, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.USER_STORY__THE_QUIERO, newTheQuiero, newTheQuiero));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Para getThePara() {
		return thePara;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThePara(Para newThePara, NotificationChain msgs) {
		Para oldThePara = thePara;
		thePara = newThePara;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConcretaPackage.USER_STORY__THE_PARA, oldThePara, newThePara);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThePara(Para newThePara) {
		if (newThePara != thePara) {
			NotificationChain msgs = null;
			if (thePara != null)
				msgs = ((InternalEObject)thePara).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConcretaPackage.USER_STORY__THE_PARA, null, msgs);
			if (newThePara != null)
				msgs = ((InternalEObject)newThePara).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConcretaPackage.USER_STORY__THE_PARA, null, msgs);
			msgs = basicSetThePara(newThePara, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.USER_STORY__THE_PARA, newThePara, newThePara));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConcretaPackage.USER_STORY__THE_COMO:
				return basicSetTheComo(null, msgs);
			case ConcretaPackage.USER_STORY__THE_QUIERO:
				return basicSetTheQuiero(null, msgs);
			case ConcretaPackage.USER_STORY__THE_PARA:
				return basicSetThePara(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConcretaPackage.USER_STORY__NOMBRE:
				return getNombre();
			case ConcretaPackage.USER_STORY__IDENTIFICADOR:
				return getIdentificador();
			case ConcretaPackage.USER_STORY__ESTIMACION:
				return getEstimacion();
			case ConcretaPackage.USER_STORY__PRIORIDAD:
				return getPrioridad();
			case ConcretaPackage.USER_STORY__RIESGO:
				return getRiesgo();
			case ConcretaPackage.USER_STORY__RESPONSABLE:
				return getResponsable();
			case ConcretaPackage.USER_STORY__ITERACION:
				return getIteracion();
			case ConcretaPackage.USER_STORY__THE_COMO:
				return getTheComo();
			case ConcretaPackage.USER_STORY__THE_QUIERO:
				return getTheQuiero();
			case ConcretaPackage.USER_STORY__THE_PARA:
				return getThePara();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConcretaPackage.USER_STORY__NOMBRE:
				setNombre((String)newValue);
				return;
			case ConcretaPackage.USER_STORY__IDENTIFICADOR:
				setIdentificador((String)newValue);
				return;
			case ConcretaPackage.USER_STORY__ESTIMACION:
				setEstimacion((String)newValue);
				return;
			case ConcretaPackage.USER_STORY__PRIORIDAD:
				setPrioridad((String)newValue);
				return;
			case ConcretaPackage.USER_STORY__RIESGO:
				setRiesgo((String)newValue);
				return;
			case ConcretaPackage.USER_STORY__RESPONSABLE:
				setResponsable((String)newValue);
				return;
			case ConcretaPackage.USER_STORY__ITERACION:
				setIteracion((String)newValue);
				return;
			case ConcretaPackage.USER_STORY__THE_COMO:
				setTheComo((Como)newValue);
				return;
			case ConcretaPackage.USER_STORY__THE_QUIERO:
				setTheQuiero((Quiero)newValue);
				return;
			case ConcretaPackage.USER_STORY__THE_PARA:
				setThePara((Para)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ConcretaPackage.USER_STORY__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ConcretaPackage.USER_STORY__IDENTIFICADOR:
				setIdentificador(IDENTIFICADOR_EDEFAULT);
				return;
			case ConcretaPackage.USER_STORY__ESTIMACION:
				setEstimacion(ESTIMACION_EDEFAULT);
				return;
			case ConcretaPackage.USER_STORY__PRIORIDAD:
				setPrioridad(PRIORIDAD_EDEFAULT);
				return;
			case ConcretaPackage.USER_STORY__RIESGO:
				setRiesgo(RIESGO_EDEFAULT);
				return;
			case ConcretaPackage.USER_STORY__RESPONSABLE:
				setResponsable(RESPONSABLE_EDEFAULT);
				return;
			case ConcretaPackage.USER_STORY__ITERACION:
				setIteracion(ITERACION_EDEFAULT);
				return;
			case ConcretaPackage.USER_STORY__THE_COMO:
				setTheComo((Como)null);
				return;
			case ConcretaPackage.USER_STORY__THE_QUIERO:
				setTheQuiero((Quiero)null);
				return;
			case ConcretaPackage.USER_STORY__THE_PARA:
				setThePara((Para)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ConcretaPackage.USER_STORY__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ConcretaPackage.USER_STORY__IDENTIFICADOR:
				return IDENTIFICADOR_EDEFAULT == null ? identificador != null : !IDENTIFICADOR_EDEFAULT.equals(identificador);
			case ConcretaPackage.USER_STORY__ESTIMACION:
				return ESTIMACION_EDEFAULT == null ? estimacion != null : !ESTIMACION_EDEFAULT.equals(estimacion);
			case ConcretaPackage.USER_STORY__PRIORIDAD:
				return PRIORIDAD_EDEFAULT == null ? prioridad != null : !PRIORIDAD_EDEFAULT.equals(prioridad);
			case ConcretaPackage.USER_STORY__RIESGO:
				return RIESGO_EDEFAULT == null ? riesgo != null : !RIESGO_EDEFAULT.equals(riesgo);
			case ConcretaPackage.USER_STORY__RESPONSABLE:
				return RESPONSABLE_EDEFAULT == null ? responsable != null : !RESPONSABLE_EDEFAULT.equals(responsable);
			case ConcretaPackage.USER_STORY__ITERACION:
				return ITERACION_EDEFAULT == null ? iteracion != null : !ITERACION_EDEFAULT.equals(iteracion);
			case ConcretaPackage.USER_STORY__THE_COMO:
				return theComo != null;
			case ConcretaPackage.USER_STORY__THE_QUIERO:
				return theQuiero != null;
			case ConcretaPackage.USER_STORY__THE_PARA:
				return thePara != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(", identificador: ");
		result.append(identificador);
		result.append(", estimacion: ");
		result.append(estimacion);
		result.append(", prioridad: ");
		result.append(prioridad);
		result.append(", riesgo: ");
		result.append(riesgo);
		result.append(", responsable: ");
		result.append(responsable);
		result.append(", iteracion: ");
		result.append(iteracion);
		result.append(')');
		return result.toString();
	}

} //UserStoryImpl