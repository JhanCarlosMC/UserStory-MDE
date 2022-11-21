/*
* 
*/
package concreta.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import concreta.Como;
import concreta.Para;
import concreta.Quiero;
import concreta.UserStory;
import concreta.Workspace;
import concreta.diagram.edit.parts.ComoEditPart;
import concreta.diagram.edit.parts.ParaEditPart;
import concreta.diagram.edit.parts.QuieroEditPart;
import concreta.diagram.edit.parts.UserStoryEditPart;
import concreta.diagram.edit.parts.UserStoryUserStoryTheComoCompartmentEditPart;
import concreta.diagram.edit.parts.UserStoryUserStoryTheParaCompartmentEditPart;
import concreta.diagram.edit.parts.UserStoryUserStoryTheQuieroCompartmentEditPart;
import concreta.diagram.edit.parts.WorkspaceEditPart;

/**
 * @generated
 */
public class ConcretaDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<ConcretaNodeDescriptor> getSemanticChildren(View view) {
		switch (ConcretaVisualIDRegistry.getVisualID(view)) {
		case WorkspaceEditPart.VISUAL_ID:
			return getWorkspace_1000SemanticChildren(view);
		case UserStoryUserStoryTheComoCompartmentEditPart.VISUAL_ID:
			return getUserStoryUserStoryTheComoCompartment_7001SemanticChildren(view);
		case UserStoryUserStoryTheQuieroCompartmentEditPart.VISUAL_ID:
			return getUserStoryUserStoryTheQuieroCompartment_7002SemanticChildren(view);
		case UserStoryUserStoryTheParaCompartmentEditPart.VISUAL_ID:
			return getUserStoryUserStoryTheParaCompartment_7003SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConcretaNodeDescriptor> getWorkspace_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Workspace modelElement = (Workspace) view.getElement();
		LinkedList<ConcretaNodeDescriptor> result = new LinkedList<ConcretaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListUserStorys().iterator(); it.hasNext();) {
			UserStory childElement = (UserStory) it.next();
			int visualID = ConcretaVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == UserStoryEditPart.VISUAL_ID) {
				result.add(new ConcretaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConcretaNodeDescriptor> getUserStoryUserStoryTheComoCompartment_7001SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		UserStory modelElement = (UserStory) containerView.getElement();
		LinkedList<ConcretaNodeDescriptor> result = new LinkedList<ConcretaNodeDescriptor>();
		{
			Como childElement = modelElement.getTheComo();
			int visualID = ConcretaVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ComoEditPart.VISUAL_ID) {
				result.add(new ConcretaNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConcretaNodeDescriptor> getUserStoryUserStoryTheQuieroCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		UserStory modelElement = (UserStory) containerView.getElement();
		LinkedList<ConcretaNodeDescriptor> result = new LinkedList<ConcretaNodeDescriptor>();
		{
			Quiero childElement = modelElement.getTheQuiero();
			int visualID = ConcretaVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == QuieroEditPart.VISUAL_ID) {
				result.add(new ConcretaNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConcretaNodeDescriptor> getUserStoryUserStoryTheParaCompartment_7003SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		UserStory modelElement = (UserStory) containerView.getElement();
		LinkedList<ConcretaNodeDescriptor> result = new LinkedList<ConcretaNodeDescriptor>();
		{
			Para childElement = modelElement.getThePara();
			int visualID = ConcretaVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ParaEditPart.VISUAL_ID) {
				result.add(new ConcretaNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConcretaLinkDescriptor> getContainedLinks(View view) {
		switch (ConcretaVisualIDRegistry.getVisualID(view)) {
		case WorkspaceEditPart.VISUAL_ID:
			return getWorkspace_1000ContainedLinks(view);
		case UserStoryEditPart.VISUAL_ID:
			return getUserStory_2001ContainedLinks(view);
		case ComoEditPart.VISUAL_ID:
			return getComo_3001ContainedLinks(view);
		case QuieroEditPart.VISUAL_ID:
			return getQuiero_3002ContainedLinks(view);
		case ParaEditPart.VISUAL_ID:
			return getPara_3003ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConcretaLinkDescriptor> getIncomingLinks(View view) {
		switch (ConcretaVisualIDRegistry.getVisualID(view)) {
		case UserStoryEditPart.VISUAL_ID:
			return getUserStory_2001IncomingLinks(view);
		case ComoEditPart.VISUAL_ID:
			return getComo_3001IncomingLinks(view);
		case QuieroEditPart.VISUAL_ID:
			return getQuiero_3002IncomingLinks(view);
		case ParaEditPart.VISUAL_ID:
			return getPara_3003IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConcretaLinkDescriptor> getOutgoingLinks(View view) {
		switch (ConcretaVisualIDRegistry.getVisualID(view)) {
		case UserStoryEditPart.VISUAL_ID:
			return getUserStory_2001OutgoingLinks(view);
		case ComoEditPart.VISUAL_ID:
			return getComo_3001OutgoingLinks(view);
		case QuieroEditPart.VISUAL_ID:
			return getQuiero_3002OutgoingLinks(view);
		case ParaEditPart.VISUAL_ID:
			return getPara_3003OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getWorkspace_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getUserStory_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getComo_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getQuiero_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getPara_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getUserStory_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getComo_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getQuiero_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getPara_3003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getUserStory_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getComo_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getQuiero_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getPara_3003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<ConcretaNodeDescriptor> getSemanticChildren(View view) {
			return ConcretaDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ConcretaLinkDescriptor> getContainedLinks(View view) {
			return ConcretaDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ConcretaLinkDescriptor> getIncomingLinks(View view) {
			return ConcretaDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ConcretaLinkDescriptor> getOutgoingLinks(View view) {
			return ConcretaDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
