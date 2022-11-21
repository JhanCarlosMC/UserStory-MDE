/*
* 
*/
package concreta.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import concreta.diagram.edit.commands.ParaCreateCommand;
import concreta.diagram.providers.ConcretaElementTypes;

/**
 * @generated
 */
public class UserStoryUserStoryTheParaCompartmentItemSemanticEditPolicy extends ConcretaBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public UserStoryUserStoryTheParaCompartmentItemSemanticEditPolicy() {
		super(ConcretaElementTypes.UserStory_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ConcretaElementTypes.Para_3003 == req.getElementType()) {
			return getGEFWrapper(new ParaCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
