/**
 */
package concreta.impl;

import concreta.Como;
import concreta.ConcretaFactory;
import concreta.ConcretaPackage;
import concreta.ModelFactory;
import concreta.Para;
import concreta.Quiero;
import concreta.UserStory;
import concreta.Workspace;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConcretaPackageImpl extends EPackageImpl implements ConcretaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workspaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userStoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quieroEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paraEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see concreta.ConcretaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConcretaPackageImpl() {
		super(eNS_URI, ConcretaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ConcretaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConcretaPackage init() {
		if (isInited) return (ConcretaPackage)EPackage.Registry.INSTANCE.getEPackage(ConcretaPackage.eNS_URI);

		// Obtain or create and register package
		ConcretaPackageImpl theConcretaPackage = (ConcretaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConcretaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConcretaPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theConcretaPackage.createPackageContents();

		// Initialize created meta-data
		theConcretaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConcretaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConcretaPackage.eNS_URI, theConcretaPackage);
		return theConcretaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelFactory() {
		return modelFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelFactory_Nombre() {
		return (EAttribute)modelFactoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelFactory_Ruta() {
		return (EAttribute)modelFactoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelFactory_ListWorkspace() {
		return (EReference)modelFactoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkspace() {
		return workspaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkspace_Nombre() {
		return (EAttribute)workspaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkspace_ListUserStorys() {
		return (EReference)workspaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserStory() {
		return userStoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserStory_Nombre() {
		return (EAttribute)userStoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserStory_Identificador() {
		return (EAttribute)userStoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserStory_Estimacion() {
		return (EAttribute)userStoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserStory_Prioridad() {
		return (EAttribute)userStoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserStory_Riesgo() {
		return (EAttribute)userStoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserStory_Responsable() {
		return (EAttribute)userStoryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserStory_Iteracion() {
		return (EAttribute)userStoryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserStory_TheComo() {
		return (EReference)userStoryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserStory_TheQuiero() {
		return (EReference)userStoryEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserStory_ThePara() {
		return (EReference)userStoryEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComo() {
		return comoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComo_Descripcion() {
		return (EAttribute)comoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuiero() {
		return quieroEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuiero_Descripcion() {
		return (EAttribute)quieroEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPara() {
		return paraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPara_Descripcion() {
		return (EAttribute)paraEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcretaFactory getConcretaFactory() {
		return (ConcretaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelFactoryEClass = createEClass(MODEL_FACTORY);
		createEAttribute(modelFactoryEClass, MODEL_FACTORY__NOMBRE);
		createEAttribute(modelFactoryEClass, MODEL_FACTORY__RUTA);
		createEReference(modelFactoryEClass, MODEL_FACTORY__LIST_WORKSPACE);

		workspaceEClass = createEClass(WORKSPACE);
		createEAttribute(workspaceEClass, WORKSPACE__NOMBRE);
		createEReference(workspaceEClass, WORKSPACE__LIST_USER_STORYS);

		userStoryEClass = createEClass(USER_STORY);
		createEAttribute(userStoryEClass, USER_STORY__NOMBRE);
		createEAttribute(userStoryEClass, USER_STORY__IDENTIFICADOR);
		createEAttribute(userStoryEClass, USER_STORY__ESTIMACION);
		createEAttribute(userStoryEClass, USER_STORY__PRIORIDAD);
		createEAttribute(userStoryEClass, USER_STORY__RIESGO);
		createEAttribute(userStoryEClass, USER_STORY__RESPONSABLE);
		createEAttribute(userStoryEClass, USER_STORY__ITERACION);
		createEReference(userStoryEClass, USER_STORY__THE_COMO);
		createEReference(userStoryEClass, USER_STORY__THE_QUIERO);
		createEReference(userStoryEClass, USER_STORY__THE_PARA);

		comoEClass = createEClass(COMO);
		createEAttribute(comoEClass, COMO__DESCRIPCION);

		quieroEClass = createEClass(QUIERO);
		createEAttribute(quieroEClass, QUIERO__DESCRIPCION);

		paraEClass = createEClass(PARA);
		createEAttribute(paraEClass, PARA__DESCRIPCION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(modelFactoryEClass, ModelFactory.class, "ModelFactory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelFactory_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, ModelFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelFactory_Ruta(), ecorePackage.getEString(), "ruta", null, 0, 1, ModelFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelFactory_ListWorkspace(), this.getWorkspace(), null, "listWorkspace", null, 0, -1, ModelFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workspaceEClass, Workspace.class, "Workspace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkspace_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Workspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkspace_ListUserStorys(), this.getUserStory(), null, "listUserStorys", null, 0, -1, Workspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userStoryEClass, UserStory.class, "UserStory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserStory_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, UserStory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserStory_Identificador(), ecorePackage.getEString(), "identificador", null, 0, 1, UserStory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserStory_Estimacion(), ecorePackage.getEString(), "estimacion", null, 0, 1, UserStory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserStory_Prioridad(), ecorePackage.getEString(), "prioridad", null, 0, 1, UserStory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserStory_Riesgo(), ecorePackage.getEString(), "riesgo", null, 0, 1, UserStory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserStory_Responsable(), ecorePackage.getEString(), "responsable", null, 0, 1, UserStory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserStory_Iteracion(), ecorePackage.getEString(), "iteracion", null, 0, 1, UserStory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserStory_TheComo(), this.getComo(), null, "theComo", null, 0, 1, UserStory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserStory_TheQuiero(), this.getQuiero(), null, "theQuiero", null, 0, 1, UserStory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserStory_ThePara(), this.getPara(), null, "thePara", null, 0, 1, UserStory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comoEClass, Como.class, "Como", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComo_Descripcion(), ecorePackage.getEString(), "descripcion", null, 0, 1, Como.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quieroEClass, Quiero.class, "Quiero", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuiero_Descripcion(), ecorePackage.getEString(), "descripcion", null, 0, 1, Quiero.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paraEClass, Para.class, "Para", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPara_Descripcion(), ecorePackage.getEString(), "descripcion", null, 0, 1, Para.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";	
		addAnnotation
		  (workspaceEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (userStoryEClass, 
		   source, 
		   new String[] {
			 "label", "nombre",
			 "color", "230,224,99",
			 "margin", "1"
		   });	
		addAnnotation
		  (comoEClass, 
		   source, 
		   new String[] {
			 "label", "descripcion",
			 "color", "230,224,99",
			 "figure", "rectangle"
		   });	
		addAnnotation
		  (quieroEClass, 
		   source, 
		   new String[] {
			 "label", "descripcion",
			 "color", "230,224,99"
		   });	
		addAnnotation
		  (paraEClass, 
		   source, 
		   new String[] {
			 "label", "descripcion",
			 "color", "230,224,99"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.compartment";	
		addAnnotation
		  (getUserStory_TheComo(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getUserStory_TheQuiero(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getUserStory_ThePara(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });
	}

} //ConcretaPackageImpl
