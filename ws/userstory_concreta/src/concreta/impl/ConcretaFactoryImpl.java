/**
 */
package concreta.impl;

import concreta.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConcretaFactoryImpl extends EFactoryImpl implements ConcretaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConcretaFactory init() {
		try {
			ConcretaFactory theConcretaFactory = (ConcretaFactory)EPackage.Registry.INSTANCE.getEFactory(ConcretaPackage.eNS_URI);
			if (theConcretaFactory != null) {
				return theConcretaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConcretaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcretaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ConcretaPackage.MODEL_FACTORY: return createModelFactory();
			case ConcretaPackage.WORKSPACE: return createWorkspace();
			case ConcretaPackage.USER_STORY: return createUserStory();
			case ConcretaPackage.COMO: return createComo();
			case ConcretaPackage.QUIERO: return createQuiero();
			case ConcretaPackage.PARA: return createPara();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory createModelFactory() {
		ModelFactoryImpl modelFactory = new ModelFactoryImpl();
		return modelFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workspace createWorkspace() {
		WorkspaceImpl workspace = new WorkspaceImpl();
		return workspace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserStory createUserStory() {
		UserStoryImpl userStory = new UserStoryImpl();
		return userStory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Como createComo() {
		ComoImpl como = new ComoImpl();
		return como;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quiero createQuiero() {
		QuieroImpl quiero = new QuieroImpl();
		return quiero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Para createPara() {
		ParaImpl para = new ParaImpl();
		return para;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcretaPackage getConcretaPackage() {
		return (ConcretaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConcretaPackage getPackage() {
		return ConcretaPackage.eINSTANCE;
	}

} //ConcretaFactoryImpl
