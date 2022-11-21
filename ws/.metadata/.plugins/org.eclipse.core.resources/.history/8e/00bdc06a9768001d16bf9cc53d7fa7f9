package diagrama.model;

import abstracta.AbstractaFactory;
import concreta.MKJAgregacion;
import concreta.MKJAsociacion;
import concreta.MKJAtributo;
import concreta.MKJClase;
import concreta.MKJConteinment;
import concreta.MKJDiagramaClases;
import concreta.MKJHerencia;
import concreta.MKJInterface;
import concreta.MKJMetodo;
import concreta.MKJPaquete;
import concreta.ModelFactory;

public class TransformacionM2M {

	private ModelFactory modelFactoryConcreta;
	private abstracta.ModelFactory modelFactoryAbstracta;

	public TransformacionM2M(ModelFactory modelFactoryConcreta, abstracta.ModelFactory modelFactoryAbstracta) {
		super();
		this.modelFactoryConcreta = modelFactoryConcreta;
		this.modelFactoryAbstracta = modelFactoryAbstracta;
	}

	public String transformarM2M() {
		String mensaje = "Se ha realizado la transformacion M2M";
		if (modelFactoryAbstracta.getListaTodasLasClases().size() != 0) {
			modelFactoryAbstracta.getPaquetes().get(0).getClases().clear();
			modelFactoryAbstracta.getPaquetes().get(0).getPaquetes().clear();
			modelFactoryAbstracta.getListaTodasLasClases().clear();
			modelFactoryAbstracta.getListaTodosLosPaquetes().clear();
		}

		for (MKJDiagramaClases diagramaConcreta : modelFactoryConcreta.getListaDiagramas()) {
			// Crear los paquetes
			for (MKJPaquete paquete : diagramaConcreta.getListaPaquetes()) {
				crearPaquete(paquete);
			}
			for (MKJClase clase : diagramaConcreta.getListaClases()) {
				crearClase(clase);
			}
			for (MKJAsociacion asociacion : diagramaConcreta.getListaAsociaciones()) {
				crearAsociacion(asociacion);
			}
			for (MKJAgregacion agregacion : diagramaConcreta.getListaAgregaciones()) {
				crearAgregacion(agregacion);
			}
			for (MKJConteinment conteinment : diagramaConcreta.getListaConteiments()) {
				crearContainment(conteinment);
			}
			for (MKJHerencia herencia : diagramaConcreta.getListaHerencias()) {
				crearHerencia(herencia);
			}
			for (MKJInterface mkjInterface : diagramaConcreta.getListaInterfaces()) {
				crearInterface(mkjInterface);
			}
		}

		return mensaje;
	}

	private void crearInterface(MKJInterface mkjInterface) {
		// TODO Auto-generated method stub
		MKJClase sourceConcreta = mkjInterface.getSource();
		MKJClase targetConcreta = mkjInterface.getTarget();

		abstracta.MKJClase sourceAbstracta = obtenerClaseAbstracta(sourceConcreta.getNombre(),
				sourceConcreta.getRuta());
		abstracta.MKJClase targetAbstracta = obtenerClaseAbstracta(targetConcreta.getNombre(),
				targetConcreta.getRuta());

		abstracta.MKJInterface relacionSource = AbstractaFactory.eINSTANCE.createMKJInterface();
		relacionSource.setSource(sourceAbstracta);
		relacionSource.setTarget(targetAbstracta);
		sourceAbstracta.getInterfaces().add(relacionSource);

		abstracta.MKJInterface relacionTarget = AbstractaFactory.eINSTANCE.createMKJInterface();
		relacionTarget.setSource(sourceAbstracta);
		relacionTarget.setTarget(targetAbstracta);
		targetAbstracta.getInterfaces().add(relacionTarget);
	}

	private void crearHerencia(MKJHerencia herencia) {
		// TODO Auto-generated method stub
		MKJClase sourceConcreta = herencia.getSource();
		MKJClase targetConcreta = herencia.getTarget();

		abstracta.MKJClase sourceAbstracta = obtenerClaseAbstracta(sourceConcreta.getNombre(),
				sourceConcreta.getRuta());
		abstracta.MKJClase targetAbstracta = obtenerClaseAbstracta(targetConcreta.getNombre(),
				targetConcreta.getRuta());

		abstracta.MKJHerencia relacionSource = AbstractaFactory.eINSTANCE.createMKJHerencia();
		relacionSource.setTarget(targetAbstracta);
		relacionSource.setSource(sourceAbstracta);
		sourceAbstracta.getHerencias().add(relacionSource);

		abstracta.MKJHerencia relacionTarget = AbstractaFactory.eINSTANCE.createMKJHerencia();
		relacionTarget.setSource(sourceAbstracta);
		relacionTarget.setTarget(targetAbstracta);
		targetAbstracta.getHerencias().add(relacionTarget);
	}

	private void crearContainment(MKJConteinment conteinment) {
		// TODO Auto-generated method stub
		MKJClase sourceConcreta = conteinment.getSource();
		MKJClase targetConcreta = conteinment.getTarget();

		abstracta.MKJClase sourceAbstracta = obtenerClaseAbstracta(sourceConcreta.getNombre(),
				sourceConcreta.getRuta());
		abstracta.MKJClase targetAbstracta = obtenerClaseAbstracta(targetConcreta.getNombre(),
				targetConcreta.getRuta());

		abstracta.MKJRelacion relacionSource = AbstractaFactory.eINSTANCE.createMKJContainment();
		relacionSource.setMultiplicidad1(conteinment.getMultiplicidad1());
		relacionSource.setMultiplicidad2(conteinment.getMultiplicidad2());
		relacionSource.setNavegabilidad1(conteinment.getNavegabilidad1());
		relacionSource.setNavegabilidad2(conteinment.getNavegabilidad2());
		relacionSource.setRol1(conteinment.getRol1());
		relacionSource.setRol2(conteinment.getRol2());
		relacionSource.setNombre(conteinment.getNombre());

		relacionSource.setSource(sourceAbstracta);
		relacionSource.setTarget(targetAbstracta);

		sourceAbstracta.getRelaciones().add(relacionSource);

		abstracta.MKJRelacion relacionTarget = AbstractaFactory.eINSTANCE.createMKJContainment();
		relacionTarget.setMultiplicidad1(conteinment.getMultiplicidad2());
		relacionTarget.setMultiplicidad2(conteinment.getMultiplicidad1());
		relacionTarget.setNavegabilidad1(conteinment.getNavegabilidad2());
		relacionTarget.setNavegabilidad2(conteinment.getNavegabilidad1());
		relacionTarget.setRol1(conteinment.getRol2());
		relacionTarget.setRol2(conteinment.getRol1());
		relacionTarget.setNombre(conteinment.getNombre());

		relacionTarget.setSource(sourceAbstracta);
		relacionTarget.setTarget(targetAbstracta);

		targetAbstracta.getRelaciones().add(relacionTarget);
	}

	private void crearAgregacion(MKJAgregacion agregacion) {
		// TODO Auto-generated method stub
		MKJClase sourceConcreta = agregacion.getSource();
		MKJClase targetConcreta = agregacion.getTarget();
		abstracta.MKJClase sourceAbstracta = obtenerClaseAbstracta(sourceConcreta.getNombre(),
				sourceConcreta.getRuta());
		abstracta.MKJClase targetAbstracta = obtenerClaseAbstracta(targetConcreta.getNombre(),
				targetConcreta.getRuta());

		abstracta.MKJRelacion relacionSource = AbstractaFactory.eINSTANCE.createMKJAgregacion();
		relacionSource.setMultiplicidad1(agregacion.getMultiplicidad1());
		relacionSource.setMultiplicidad2(agregacion.getMultiplicidad2());
		relacionSource.setNavegabilidad1(agregacion.getNavegabilidad1());
		relacionSource.setNavegabilidad2(agregacion.getNavegabilidad2());
		relacionSource.setRol1(agregacion.getRol1());
		relacionSource.setRol2(agregacion.getRol2());
		relacionSource.setNombre(agregacion.getNombre());

		relacionSource.setSource(sourceAbstracta);
		relacionSource.setTarget(targetAbstracta);

		sourceAbstracta.getRelaciones().add(relacionSource);

		abstracta.MKJRelacion relacionTarget = AbstractaFactory.eINSTANCE.createMHJAsociacion();
		relacionTarget.setMultiplicidad1(agregacion.getMultiplicidad2());
		relacionTarget.setMultiplicidad2(agregacion.getMultiplicidad1());
		relacionTarget.setNavegabilidad1(agregacion.getNavegabilidad2());
		relacionTarget.setNavegabilidad2(agregacion.getNavegabilidad1());
		relacionTarget.setRol1(agregacion.getRol2());
		relacionTarget.setRol2(agregacion.getRol1());
		relacionTarget.setNombre(agregacion.getNombre());

		relacionTarget.setSource(sourceAbstracta);
		relacionTarget.setTarget(targetAbstracta);

		targetAbstracta.getRelaciones().add(relacionTarget);
	}

	private void crearAsociacion(MKJAsociacion asociacion) {
		// TODO Auto-generated method stub
		MKJClase sourceConcreta = asociacion.getSource();
		MKJClase targetConcreta = asociacion.getTarget();

		abstracta.MKJClase sourceAbstracta = obtenerClaseAbstracta(sourceConcreta.getNombre(),
				sourceConcreta.getRuta());
		abstracta.MKJClase targetAbstracta = obtenerClaseAbstracta(targetConcreta.getNombre(),
				targetConcreta.getRuta());

		abstracta.MKJRelacion relacionSource = AbstractaFactory.eINSTANCE.createMHJAsociacion();
		relacionSource.setMultiplicidad1(asociacion.getMultiplicidad1());
		relacionSource.setMultiplicidad2(asociacion.getMultiplicidad2());
		relacionSource.setNavegabilidad1(asociacion.getNavegabilidad1());
		relacionSource.setNavegabilidad2(asociacion.getNavegabilidad2());
		relacionSource.setRol1(asociacion.getRol1());
		relacionSource.setRol2(asociacion.getRol2());
		relacionSource.setNombre(asociacion.getNombre());

		relacionSource.setSource(sourceAbstracta);
		relacionSource.setTarget(targetAbstracta);

		sourceAbstracta.getRelaciones().add(relacionSource);

		abstracta.MKJRelacion relacionTarget = AbstractaFactory.eINSTANCE.createMHJAsociacion();
		relacionTarget.setMultiplicidad1(asociacion.getMultiplicidad2());
		relacionTarget.setMultiplicidad2(asociacion.getMultiplicidad1());
		relacionTarget.setNavegabilidad1(asociacion.getNavegabilidad2());
		relacionTarget.setNavegabilidad2(asociacion.getNavegabilidad1());
		relacionTarget.setRol1(asociacion.getRol2());
		relacionTarget.setRol2(asociacion.getRol1());
		relacionTarget.setNombre(asociacion.getNombre());

		relacionTarget.setSource(sourceAbstracta);
		relacionTarget.setTarget(targetAbstracta);

		targetAbstracta.getRelaciones().add(relacionTarget);
	}

	private void crearClase(MKJClase clase) {
		String ruta = clase.getRuta();
		String name = clase.getNombre();

		abstracta.MKJClase claseAbstracta = obtenerClaseAbstracta(name, ruta);
		if (claseAbstracta == null) {
			abstracta.MKJClase mkjClase = AbstractaFactory.eINSTANCE.createMKJClase();
			mkjClase.setNombre(clase.getNombre());
			mkjClase.setRuta(clase.getRuta());

			for (MKJAtributo atributo : clase.getAtributos()) {
				abstracta.MKJAtributo mkjAtributo = AbstractaFactory.eINSTANCE.createMKJAtributo();
				mkjAtributo.setNombre(atributo.getNombre());
				mkjClase.getAtributos().add(mkjAtributo);
			}

			for (MKJMetodo metodo : clase.getMetodos()) {
				abstracta.MKJMetodo mkjMetodo = AbstractaFactory.eINSTANCE.createMKJMetodo();
				mkjMetodo.setNombre(metodo.getNombre());
				mkjMetodo.setSemantics(metodo.getSemantics());
				mkjClase.getMetodos().add(mkjMetodo);
			}

			modelFactoryAbstracta.getListaTodasLasClases().add(mkjClase);
			abstracta.MKJPaquete paquetePadre = obtenerPaquete(ruta);
			paquetePadre.getClases().add(mkjClase);
		}
	}

	private abstracta.MKJPaquete obtenerPaquete(String ruta) {
		for (abstracta.MKJPaquete mkjPaquete : modelFactoryAbstracta.getListaTodosLosPaquetes()) {
			String rutaAux = mkjPaquete.getRuta() + mkjPaquete.getNombre() + "/";
			if (rutaAux.equals(ruta)) {
				return mkjPaquete;
			}
		}
		return null;
	}

	private abstracta.MKJClase obtenerClaseAbstracta(String name, String ruta) {

		abstracta.MKJPaquete mkjPaquete = modelFactoryAbstracta.getPaquetes().get(0);

		for (abstracta.MKJClase mkjClase : mkjPaquete.getClases()) {
			if (mkjClase.getNombre().equals(name)) {
				return mkjClase;
			}
		}
		for (abstracta.MKJPaquete mkjPaquete2 : mkjPaquete.getPaquetes()) {
			abstracta.MKJClase mkjClase = obtenerClasePaquete(mkjPaquete2, name, ruta);
			if (mkjClase != null) {
				return mkjClase;
			}
		}
		return null;
	}

	private abstracta.MKJClase obtenerClasePaquete(abstracta.MKJPaquete mkjPaquete, String name, String ruta) {
		// TODO Auto-generated method stub
		for (abstracta.MKJClase mkjClase : mkjPaquete.getClases()) {
			if (mkjClase.getNombre().equals(name)) {
				return mkjClase;
			}
		}
		for (abstracta.MKJPaquete mkjPaquete2 : mkjPaquete.getPaquetes()) {
			abstracta.MKJClase mkjClase = obtenerClasePaquete(mkjPaquete2, name, ruta);
			if (mkjClase != null) {
				return mkjClase;
			}
		}
		return null;
	}

	private void crearPaquete(MKJPaquete paquete) {

		String ruta = paquete.getRuta() + paquete.getNombre();
		String[] split = ruta.split("/");
		abstracta.MKJPaquete paqueteParent = null;

		String nuevaRuta = "";
		for (int i = 0; i < split.length; i++) {
			String rutaNombrePaquete = split[i];
			paqueteParent = obtenerPaqueteAbstracta(rutaNombrePaquete, nuevaRuta, paqueteParent);
			nuevaRuta += split[i] + "/";
		}
	}

	private abstracta.MKJPaquete obtenerPaqueteAbstracta(String nombrePaquete, String nuevaRuta,
			abstracta.MKJPaquete paqueteParent) {

		if (paqueteParent == null) {
			for (int i = 0; i < modelFactoryAbstracta.getPaquetes().size(); i++) {
				if (modelFactoryAbstracta.getPaquetes().get(i).getNombre().equals(nombrePaquete)) {
					return modelFactoryAbstracta.getPaquetes().get(i);
				}
			}
			abstracta.MKJPaquete nuevoPackage = AbstractaFactory.eINSTANCE.createMKJPaquete();
			nuevoPackage.setNombre(nombrePaquete);
			nuevoPackage.setRuta(nuevaRuta);
			modelFactoryAbstracta.getPaquetes().add(nuevoPackage);
			modelFactoryAbstracta.getListaTodosLosPaquetes().add(nuevoPackage);
			return nuevoPackage;

		} else {
			for (int i = 0; i < paqueteParent.getPaquetes().size(); i++) {
				if (paqueteParent.getPaquetes().get(i).getNombre().equals(nombrePaquete)) {
					if (paqueteParent.getPaquetes().get(i).getRuta().equals(nuevaRuta)) {
						return paqueteParent.getPaquetes().get(i);
					}
				}
			}
		}

		abstracta.MKJPaquete nuevoPackage = AbstractaFactory.eINSTANCE.createMKJPaquete();
		nuevoPackage.setNombre(nombrePaquete);
		nuevoPackage.setRuta(nuevaRuta);
		paqueteParent.getPaquetes().add(nuevoPackage);
		modelFactoryAbstracta.getListaTodosLosPaquetes().add(nuevoPackage);
		return nuevoPackage;
	}
}
