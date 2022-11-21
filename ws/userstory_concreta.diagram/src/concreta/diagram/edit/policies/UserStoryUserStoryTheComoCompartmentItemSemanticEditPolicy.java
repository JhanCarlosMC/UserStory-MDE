/*
* 
*/
package concreta.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import concreta.diagram.edit.commands.ComoCreateCommand;
import concreta.diagram.providers.ConcretaElementTypes;

/**
 * @generated
 */
public class UserStoryUserStoryTheComoCompartmentItemSemanticEditPolicy extends ConcretaBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public UserStoryUserStoryTheComoCompartmentItemSemanticEditPolicy() {
		super(ConcretaElementTypes.UserStory_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ConcretaElementTypes.Como_3001 == req.getElementType()) {
			return getGEFWrapper(new ComoCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
