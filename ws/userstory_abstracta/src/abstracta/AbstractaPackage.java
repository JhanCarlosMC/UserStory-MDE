/**
 */
package abstracta;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see abstracta.AbstractaFactory
 * @model kind="package"
 * @generated
 */
public interface AbstractaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "abstracta";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "abstracta";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "abstracta";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AbstractaPackage eINSTANCE = abstracta.impl.AbstractaPackageImpl.init();

	/**
	 * The meta object id for the '{@link abstracta.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.ModelFactoryImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getModelFactory()
	 * @generated
	 */
	int MODEL_FACTORY = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Ruta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__RUTA = 1;

	/**
	 * The feature id for the '<em><b>List User Storys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__LIST_USER_STORYS = 2;

	/**
	 * The feature id for the '<em><b>List Todos User Storys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__LIST_TODOS_USER_STORYS = 3;

	/**
	 * The number of structural features of the '<em>Model Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link abstracta.impl.UserStoryImpl <em>User Story</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.UserStoryImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getUserStory()
	 * @generated
	 */
	int USER_STORY = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Identificador</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__IDENTIFICADOR = 1;

	/**
	 * The feature id for the '<em><b>Estimacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__ESTIMACION = 2;

	/**
	 * The feature id for the '<em><b>Prioridad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__PRIORIDAD = 3;

	/**
	 * The feature id for the '<em><b>Riesgo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__RIESGO = 4;

	/**
	 * The feature id for the '<em><b>Responsable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__RESPONSABLE = 5;

	/**
	 * The feature id for the '<em><b>Iteracion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__ITERACION = 6;

	/**
	 * The feature id for the '<em><b>The Como</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__THE_COMO = 7;

	/**
	 * The feature id for the '<em><b>The Quiero</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__THE_QUIERO = 8;

	/**
	 * The feature id for the '<em><b>The Para</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__THE_PARA = 9;

	/**
	 * The number of structural features of the '<em>User Story</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link abstracta.impl.ComoImpl <em>Como</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.ComoImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getComo()
	 * @generated
	 */
	int COMO = 2;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMO__DESCRIPCION = 0;

	/**
	 * The number of structural features of the '<em>Como</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMO_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link abstracta.impl.QuieroImpl <em>Quiero</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.QuieroImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getQuiero()
	 * @generated
	 */
	int QUIERO = 3;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIERO__DESCRIPCION = 0;

	/**
	 * The number of structural features of the '<em>Quiero</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIERO_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link abstracta.impl.ParaImpl <em>Para</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.ParaImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getPara()
	 * @generated
	 */
	int PARA = 4;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARA__DESCRIPCION = 0;

	/**
	 * The number of structural features of the '<em>Para</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARA_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link abstracta.ModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Factory</em>'.
	 * @see abstracta.ModelFactory
	 * @generated
	 */
	EClass getModelFactory();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.ModelFactory#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see abstracta.ModelFactory#getNombre()
	 * @see #getModelFactory()
	 * @generated
	 */
	EAttribute getModelFactory_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.ModelFactory#getRuta <em>Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ruta</em>'.
	 * @see abstracta.ModelFactory#getRuta()
	 * @see #getModelFactory()
	 * @generated
	 */
	EAttribute getModelFactory_Ruta();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.ModelFactory#getListUserStorys <em>List User Storys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List User Storys</em>'.
	 * @see abstracta.ModelFactory#getListUserStorys()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_ListUserStorys();

	/**
	 * Returns the meta object for the reference list '{@link abstracta.ModelFactory#getListTodosUserStorys <em>List Todos User Storys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>List Todos User Storys</em>'.
	 * @see abstracta.ModelFactory#getListTodosUserStorys()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_ListTodosUserStorys();

	/**
	 * Returns the meta object for class '{@link abstracta.UserStory <em>User Story</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Story</em>'.
	 * @see abstracta.UserStory
	 * @generated
	 */
	EClass getUserStory();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.UserStory#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see abstracta.UserStory#getNombre()
	 * @see #getUserStory()
	 * @generated
	 */
	EAttribute getUserStory_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.UserStory#getIdentificador <em>Identificador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identificador</em>'.
	 * @see abstracta.UserStory#getIdentificador()
	 * @see #getUserStory()
	 * @generated
	 */
	EAttribute getUserStory_Identificador();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.UserStory#getEstimacion <em>Estimacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimacion</em>'.
	 * @see abstracta.UserStory#getEstimacion()
	 * @see #getUserStory()
	 * @generated
	 */
	EAttribute getUserStory_Estimacion();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.UserStory#getPrioridad <em>Prioridad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prioridad</em>'.
	 * @see abstracta.UserStory#getPrioridad()
	 * @see #getUserStory()
	 * @generated
	 */
	EAttribute getUserStory_Prioridad();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.UserStory#getRiesgo <em>Riesgo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Riesgo</em>'.
	 * @see abstracta.UserStory#getRiesgo()
	 * @see #getUserStory()
	 * @generated
	 */
	EAttribute getUserStory_Riesgo();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.UserStory#getResponsable <em>Responsable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Responsable</em>'.
	 * @see abstracta.UserStory#getResponsable()
	 * @see #getUserStory()
	 * @generated
	 */
	EAttribute getUserStory_Responsable();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.UserStory#getIteracion <em>Iteracion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iteracion</em>'.
	 * @see abstracta.UserStory#getIteracion()
	 * @see #getUserStory()
	 * @generated
	 */
	EAttribute getUserStory_Iteracion();

	/**
	 * Returns the meta object for the containment reference '{@link abstracta.UserStory#getTheComo <em>The Como</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Como</em>'.
	 * @see abstracta.UserStory#getTheComo()
	 * @see #getUserStory()
	 * @generated
	 */
	EReference getUserStory_TheComo();

	/**
	 * Returns the meta object for the containment reference '{@link abstracta.UserStory#getTheQuiero <em>The Quiero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Quiero</em>'.
	 * @see abstracta.UserStory#getTheQuiero()
	 * @see #getUserStory()
	 * @generated
	 */
	EReference getUserStory_TheQuiero();

	/**
	 * Returns the meta object for the containment reference '{@link abstracta.UserStory#getThePara <em>The Para</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Para</em>'.
	 * @see abstracta.UserStory#getThePara()
	 * @see #getUserStory()
	 * @generated
	 */
	EReference getUserStory_ThePara();

	/**
	 * Returns the meta object for class '{@link abstracta.Como <em>Como</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Como</em>'.
	 * @see abstracta.Como
	 * @generated
	 */
	EClass getComo();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.Como#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see abstracta.Como#getDescripcion()
	 * @see #getComo()
	 * @generated
	 */
	EAttribute getComo_Descripcion();

	/**
	 * Returns the meta object for class '{@link abstracta.Quiero <em>Quiero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quiero</em>'.
	 * @see abstracta.Quiero
	 * @generated
	 */
	EClass getQuiero();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.Quiero#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see abstracta.Quiero#getDescripcion()
	 * @see #getQuiero()
	 * @generated
	 */
	EAttribute getQuiero_Descripcion();

	/**
	 * Returns the meta object for class '{@link abstracta.Para <em>Para</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Para</em>'.
	 * @see abstracta.Para
	 * @generated
	 */
	EClass getPara();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.Para#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see abstracta.Para#getDescripcion()
	 * @see #getPara()
	 * @generated
	 */
	EAttribute getPara_Descripcion();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AbstractaFactory getAbstractaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link abstracta.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.ModelFactoryImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getModelFactory()
		 * @generated
		 */
		EClass MODEL_FACTORY = eINSTANCE.getModelFactory();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_FACTORY__NOMBRE = eINSTANCE.getModelFactory_Nombre();

		/**
		 * The meta object literal for the '<em><b>Ruta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_FACTORY__RUTA = eINSTANCE.getModelFactory_Ruta();

		/**
		 * The meta object literal for the '<em><b>List User Storys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY__LIST_USER_STORYS = eINSTANCE.getModelFactory_ListUserStorys();

		/**
		 * The meta object literal for the '<em><b>List Todos User Storys</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY__LIST_TODOS_USER_STORYS = eINSTANCE.getModelFactory_ListTodosUserStorys();

		/**
		 * The meta object literal for the '{@link abstracta.impl.UserStoryImpl <em>User Story</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.UserStoryImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getUserStory()
		 * @generated
		 */
		EClass USER_STORY = eINSTANCE.getUserStory();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_STORY__NOMBRE = eINSTANCE.getUserStory_Nombre();

		/**
		 * The meta object literal for the '<em><b>Identificador</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_STORY__IDENTIFICADOR = eINSTANCE.getUserStory_Identificador();

		/**
		 * The meta object literal for the '<em><b>Estimacion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_STORY__ESTIMACION = eINSTANCE.getUserStory_Estimacion();

		/**
		 * The meta object literal for the '<em><b>Prioridad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_STORY__PRIORIDAD = eINSTANCE.getUserStory_Prioridad();

		/**
		 * The meta object literal for the '<em><b>Riesgo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_STORY__RIESGO = eINSTANCE.getUserStory_Riesgo();

		/**
		 * The meta object literal for the '<em><b>Responsable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_STORY__RESPONSABLE = eINSTANCE.getUserStory_Responsable();

		/**
		 * The meta object literal for the '<em><b>Iteracion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_STORY__ITERACION = eINSTANCE.getUserStory_Iteracion();

		/**
		 * The meta object literal for the '<em><b>The Como</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_STORY__THE_COMO = eINSTANCE.getUserStory_TheComo();

		/**
		 * The meta object literal for the '<em><b>The Quiero</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_STORY__THE_QUIERO = eINSTANCE.getUserStory_TheQuiero();

		/**
		 * The meta object literal for the '<em><b>The Para</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_STORY__THE_PARA = eINSTANCE.getUserStory_ThePara();

		/**
		 * The meta object literal for the '{@link abstracta.impl.ComoImpl <em>Como</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.ComoImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getComo()
		 * @generated
		 */
		EClass COMO = eINSTANCE.getComo();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMO__DESCRIPCION = eINSTANCE.getComo_Descripcion();

		/**
		 * The meta object literal for the '{@link abstracta.impl.QuieroImpl <em>Quiero</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.QuieroImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getQuiero()
		 * @generated
		 */
		EClass QUIERO = eINSTANCE.getQuiero();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUIERO__DESCRIPCION = eINSTANCE.getQuiero_Descripcion();

		/**
		 * The meta object literal for the '{@link abstracta.impl.ParaImpl <em>Para</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.ParaImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getPara()
		 * @generated
		 */
		EClass PARA = eINSTANCE.getPara();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARA__DESCRIPCION = eINSTANCE.getPara_Descripcion();

	}

} //AbstractaPackage