/*
 * 
 */
package concreta.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import concreta.ConcretaPackage;
import concreta.diagram.edit.parts.ComoEditPart;
import concreta.diagram.edit.parts.ParaEditPart;
import concreta.diagram.edit.parts.QuieroEditPart;
import concreta.diagram.edit.parts.UserStoryEditPart;
import concreta.diagram.edit.parts.WorkspaceEditPart;
import concreta.diagram.part.ConcretaDiagramEditorPlugin;

/**
 * @generated
 */
public class ConcretaElementTypes {

	/**
	* @generated
	*/
	private ConcretaElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			ConcretaDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType Workspace_1000 = getElementType("userstory_concreta.diagram.Workspace_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType UserStory_2001 = getElementType("userstory_concreta.diagram.UserStory_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Como_3001 = getElementType("userstory_concreta.diagram.Como_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Quiero_3002 = getElementType("userstory_concreta.diagram.Quiero_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Para_3003 = getElementType("userstory_concreta.diagram.Para_3003"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Workspace_1000, ConcretaPackage.eINSTANCE.getWorkspace());

			elements.put(UserStory_2001, ConcretaPackage.eINSTANCE.getUserStory());

			elements.put(Como_3001, ConcretaPackage.eINSTANCE.getComo());

			elements.put(Quiero_3002, ConcretaPackage.eINSTANCE.getQuiero());

			elements.put(Para_3003, ConcretaPackage.eINSTANCE.getPara());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Workspace_1000);
			KNOWN_ELEMENT_TYPES.add(UserStory_2001);
			KNOWN_ELEMENT_TYPES.add(Como_3001);
			KNOWN_ELEMENT_TYPES.add(Quiero_3002);
			KNOWN_ELEMENT_TYPES.add(Para_3003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case WorkspaceEditPart.VISUAL_ID:
			return Workspace_1000;
		case UserStoryEditPart.VISUAL_ID:
			return UserStory_2001;
		case ComoEditPart.VISUAL_ID:
			return Como_3001;
		case QuieroEditPart.VISUAL_ID:
			return Quiero_3002;
		case ParaEditPart.VISUAL_ID:
			return Para_3003;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return concreta.diagram.providers.ConcretaElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return concreta.diagram.providers.ConcretaElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return concreta.diagram.providers.ConcretaElementTypes.getElement(elementTypeAdapter);
		}
	};

}
