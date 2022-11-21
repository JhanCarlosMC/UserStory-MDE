package diagrama.model;

import java.util.ArrayList;

import concreta.*;

public class ModelFactoryModel {

	// ------------------------------ Singleton
	// ------------------------------------------------
	// Clase estatica oculta. Tan solo se instanciara el singleton una vez
	private static class SingletonHolder {
		// El constructor de Singleton puede ser llamado desde aquí al ser protected
		private final static ModelFactoryModel eINSTANCE = new ModelFactoryModel();
	}

	// Método para obtener la instancia de nuestra clase
	public static ModelFactoryModel getInstance() {
		return SingletonHolder.eINSTANCE;
	}

	// ------------------------------ Singleton
	// ------------------------------------------------
	ModelFactory modelFactory = ConcretaFactory.eINSTANCE.createModelFactory();
	private ModelFactory modelFactoryConcreta;
	private abstracta.ModelFactory modelFactoryAbstracta;

	public ModelFactoryModel() {
		// TODO Auto-generated constructor stub

		ModelFactory tempModelFactory = modelFactory;

		// modelFactory = cargar();

		if (modelFactory == null) {
			modelFactory = tempModelFactory;

		}
	}

	public ModelFactory cargarConcreta() {
		ModelFactory modelFactory = null;

		ConcretaPackage whoownmePackage = ConcretaPackage.eINSTANCE;
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();

		// EXISTEN 3 FORMAS DE CARGAR EL RECURSO

		// 1. CON LA SIGUIENTE RUTA (platform:/resource) SE CARGAR EL RECURSO CUANDO SE
		// HACE UNA NUEVA INSTANCIA DE ECLIPSE, EN DONDE SE CREA UN PROYECTO(test)
		// QUE CONTIENE LAS PRODUCCIONES, DONDE SE ESPECIFICA QUE RECURSO CARGAR
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI
				.createURI("platform:/resource/test/src/model/model.concreta");

		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);

		try {
			resource.load(null);
			modelFactory = (ModelFactory) resource.getContents().get(0);
			System.out.println("loaded: " + modelFactory);
		} catch (java.io.IOException e) {
			System.out.println("failed to read " + uri);
			System.out.println(e);
		}
		return modelFactory;
	}

	public abstracta.ModelFactory cargarAbstracta() {
		abstracta.ModelFactory modelFactory = null;

		ConcretaPackage whoownmePackage = ConcretaPackage.eINSTANCE;
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();

		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI
				.createURI("platform:/resource/test/src/model/model.abstracta");

		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);

		try {
			resource.load(null);
			modelFactory = (abstracta.ModelFactory) resource.getContents().get(0);
			System.out.println("loaded: " + modelFactory);
		} catch (java.io.IOException e) {
			System.out.println("failed to read " + uri);
			System.out.println(e);
		}
		return modelFactory;
	}

	public void salvarAbstracta() {

		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI
				.createURI("platform:/resource/test/src/model/model.abstracta");
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(modelFactoryAbstracta);
		try {
			resource.save(java.util.Collections.EMPTY_MAP);
		} catch (java.io.IOException e) {
			// TO-DO Auto-generated catch block
			e.printStackTrace();
		}

		return;

	}

	public void generarM2M() {

		modelFactoryConcreta = cargarConcreta();
		modelFactoryAbstracta = cargarAbstracta();
		
		TransformacionM2M transformacionM2M = new TransformacionM2M(modelFactoryConcreta, modelFactoryAbstracta);
		transformacionM2M.transformarM2M();
		salvarAbstracta();
	}

	public void generarM2T() {
		modelFactoryConcreta = cargarConcreta();
		modelFactoryAbstracta = cargarAbstracta();
		
		TransformacionM2T transformacionM2T = new TransformacionM2T(modelFactoryAbstracta);
		transformacionM2T.transformarM2T();
		salvarAbstracta();
	}

}
