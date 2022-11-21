package diagrama.model;

import abstracta.AbstractaFactory;
import abstracta.Como;
import abstracta.Para;
import abstracta.Quiero;
import concreta.ModelFactory;
import concreta.UserStory;
import concreta.Workspace;

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
		if (modelFactoryAbstracta.getListTodosUserStorys().size() != 0) {
			modelFactoryAbstracta.getListTodosUserStorys().clear();
			modelFactoryAbstracta.getListUserStorys().clear();
		}
		
		for (Workspace workspaceConcreta : modelFactoryConcreta.getListWorkspace()) {
			// Historias de usuario
			for (UserStory userStory : workspaceConcreta.getListUserStorys()) {
				crearUserStory(userStory);
			}
			
		}
		
		return mensaje;
	}

	private void crearUserStory(UserStory userStory) {
		// TODO Auto-generated method stub
//		abstracta.UserStory userStoryAbstracta = obtenerUserStoryAbstracta(userStory.getNombre());
		abstracta.UserStory userStoryAbstracta = AbstractaFactory.eINSTANCE.createUserStory();
		
		userStoryAbstracta.setNombre(userStory.getNombre());
		userStoryAbstracta.setEstimacion(userStory.getEstimacion());
		userStoryAbstracta.setIdentificador(userStory.getIdentificador());
		userStoryAbstracta.setPrioridad(userStory.getPrioridad());
		userStoryAbstracta.setRiesgo(userStory.getRiesgo());
		userStoryAbstracta.setIteracion(userStory.getIteracion());
		userStoryAbstracta.setResponsable(userStory.getResponsable());
		
		Como newComo = AbstractaFactory.eINSTANCE.createComo();
		newComo.setDescripcion(userStory.getTheComo().getDescripcion());
		userStoryAbstracta.setTheComo(newComo);
		
		Quiero newQuiero = AbstractaFactory.eINSTANCE.createQuiero();
		newQuiero.setDescripcion(userStory.getTheQuiero().getDescripcion());
		userStoryAbstracta.setTheQuiero(newQuiero);
		
		Para newPara = AbstractaFactory.eINSTANCE.createPara();
		newPara.setDescripcion(userStory.getThePara().getDescripcion());
		userStoryAbstracta.setThePara(newPara);
		
		modelFactoryAbstracta.getListTodosUserStorys().add(userStoryAbstracta);
		modelFactoryAbstracta.getListUserStorys().add(userStoryAbstracta);
	}

	private abstracta.UserStory obtenerUserStoryAbstracta(String nombre) {
		// TODO Auto-generated method stub

		for(int i=0; i<modelFactoryAbstracta.getListTodosUserStorys().size();i++) {
			
		}

		return null;
	}


}
