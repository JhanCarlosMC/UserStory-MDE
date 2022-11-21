/*
* 
*/
package concreta.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import concreta.diagram.edit.commands.QuieroCreateCommand;
import concreta.diagram.providers.ConcretaElementTypes;

/**
 * @generated
 */
public class UserStoryUserStoryTheQuieroCompartmentItemSemanticEditPolicy extends ConcretaBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public UserStoryUserStoryTheQuieroCompartmentItemSemanticEditPolicy() {
		super(ConcretaElementTypes.UserStory_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ConcretaElementTypes.Quiero_3002 == req.getElementType()) {
			return getGEFWrapper(new QuieroCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
