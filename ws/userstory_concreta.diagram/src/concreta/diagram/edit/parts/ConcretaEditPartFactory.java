/*
 * 
 */
package concreta.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import concreta.diagram.part.ConcretaVisualIDRegistry;

/**
 * @generated
 */
public class ConcretaEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ConcretaVisualIDRegistry.getVisualID(view)) {

			case WorkspaceEditPart.VISUAL_ID:
				return new WorkspaceEditPart(view);

			case UserStoryEditPart.VISUAL_ID:
				return new UserStoryEditPart(view);

			case UserStoryNombreEditPart.VISUAL_ID:
				return new UserStoryNombreEditPart(view);

			case ComoEditPart.VISUAL_ID:
				return new ComoEditPart(view);

			case ComoDescripcionEditPart.VISUAL_ID:
				return new ComoDescripcionEditPart(view);

			case QuieroEditPart.VISUAL_ID:
				return new QuieroEditPart(view);

			case QuieroDescripcionEditPart.VISUAL_ID:
				return new QuieroDescripcionEditPart(view);

			case ParaEditPart.VISUAL_ID:
				return new ParaEditPart(view);

			case ParaDescripcionEditPart.VISUAL_ID:
				return new ParaDescripcionEditPart(view);

			case UserStoryUserStoryTheComoCompartmentEditPart.VISUAL_ID:
				return new UserStoryUserStoryTheComoCompartmentEditPart(view);

			case UserStoryUserStoryTheQuieroCompartmentEditPart.VISUAL_ID:
				return new UserStoryUserStoryTheQuieroCompartmentEditPart(view);

			case UserStoryUserStoryTheParaCompartmentEditPart.VISUAL_ID:
				return new UserStoryUserStoryTheParaCompartmentEditPart(view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
