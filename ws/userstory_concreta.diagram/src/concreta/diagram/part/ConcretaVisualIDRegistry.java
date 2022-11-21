/*
* 
*/
package concreta.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import concreta.ConcretaPackage;
import concreta.Workspace;
import concreta.diagram.edit.parts.ComoDescripcionEditPart;
import concreta.diagram.edit.parts.ComoEditPart;
import concreta.diagram.edit.parts.ComoNombreEditPart;
import concreta.diagram.edit.parts.ParaDescripcionEditPart;
import concreta.diagram.edit.parts.ParaEditPart;
import concreta.diagram.edit.parts.ParaNombreEditPart;
import concreta.diagram.edit.parts.QuieroDescripcionEditPart;
import concreta.diagram.edit.parts.QuieroEditPart;
import concreta.diagram.edit.parts.QuieroNombreEditPart;
import concreta.diagram.edit.parts.UserStoryEditPart;
import concreta.diagram.edit.parts.UserStoryNombreEditPart;
import concreta.diagram.edit.parts.UserStoryUserStoryTheComoCompartmentEditPart;
import concreta.diagram.edit.parts.UserStoryUserStoryTheParaCompartmentEditPart;
import concreta.diagram.edit.parts.UserStoryUserStoryTheQuieroCompartmentEditPart;
import concreta.diagram.edit.parts.WorkspaceEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ConcretaVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "userstory_concreta.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (WorkspaceEditPart.MODEL_ID.equals(view.getType())) {
				return WorkspaceEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return concreta.diagram.part.ConcretaVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				ConcretaDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ConcretaPackage.eINSTANCE.getWorkspace().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((Workspace) domainElement)) {
			return WorkspaceEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = concreta.diagram.part.ConcretaVisualIDRegistry.getModelID(containerView);
		if (!WorkspaceEditPart.MODEL_ID.equals(containerModelID) && !"concreta".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (WorkspaceEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = concreta.diagram.part.ConcretaVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = WorkspaceEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case WorkspaceEditPart.VISUAL_ID:
			if (ConcretaPackage.eINSTANCE.getUserStory().isSuperTypeOf(domainElement.eClass())) {
				return UserStoryEditPart.VISUAL_ID;
			}
			break;
		case UserStoryUserStoryTheComoCompartmentEditPart.VISUAL_ID:
			if (ConcretaPackage.eINSTANCE.getComo().isSuperTypeOf(domainElement.eClass())) {
				return ComoEditPart.VISUAL_ID;
			}
			break;
		case UserStoryUserStoryTheQuieroCompartmentEditPart.VISUAL_ID:
			if (ConcretaPackage.eINSTANCE.getQuiero().isSuperTypeOf(domainElement.eClass())) {
				return QuieroEditPart.VISUAL_ID;
			}
			break;
		case UserStoryUserStoryTheParaCompartmentEditPart.VISUAL_ID:
			if (ConcretaPackage.eINSTANCE.getPara().isSuperTypeOf(domainElement.eClass())) {
				return ParaEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = concreta.diagram.part.ConcretaVisualIDRegistry.getModelID(containerView);
		if (!WorkspaceEditPart.MODEL_ID.equals(containerModelID) && !"concreta".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (WorkspaceEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = concreta.diagram.part.ConcretaVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = WorkspaceEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case WorkspaceEditPart.VISUAL_ID:
			if (UserStoryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UserStoryEditPart.VISUAL_ID:
			if (UserStoryNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UserStoryUserStoryTheComoCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UserStoryUserStoryTheQuieroCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UserStoryUserStoryTheParaCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComoEditPart.VISUAL_ID:
			if (ComoDescripcionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case QuieroEditPart.VISUAL_ID:
			if (QuieroDescripcionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParaEditPart.VISUAL_ID:
			if (ParaDescripcionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UserStoryUserStoryTheComoCompartmentEditPart.VISUAL_ID:
			if (ComoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UserStoryUserStoryTheQuieroCompartmentEditPart.VISUAL_ID:
			if (QuieroEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UserStoryUserStoryTheParaCompartmentEditPart.VISUAL_ID:
			if (ParaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(Workspace element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case UserStoryUserStoryTheComoCompartmentEditPart.VISUAL_ID:
		case UserStoryUserStoryTheQuieroCompartmentEditPart.VISUAL_ID:
		case UserStoryUserStoryTheParaCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case WorkspaceEditPart.VISUAL_ID:
			return false;
		case ComoEditPart.VISUAL_ID:
		case QuieroEditPart.VISUAL_ID:
		case ParaEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return concreta.diagram.part.ConcretaVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return concreta.diagram.part.ConcretaVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return concreta.diagram.part.ConcretaVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return concreta.diagram.part.ConcretaVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return concreta.diagram.part.ConcretaVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return concreta.diagram.part.ConcretaVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
