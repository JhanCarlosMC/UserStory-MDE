/*
 * 
 */
package concreta.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import concreta.diagram.edit.parts.ConcretaEditPartFactory;
import concreta.diagram.edit.parts.WorkspaceEditPart;
import concreta.diagram.part.ConcretaVisualIDRegistry;

/**
 * @generated
 */
public class ConcretaEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public ConcretaEditPartProvider() {
		super(new ConcretaEditPartFactory(), ConcretaVisualIDRegistry.TYPED_INSTANCE, WorkspaceEditPart.MODEL_ID);
	}

}
