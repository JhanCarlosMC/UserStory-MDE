/*
* 
*/
package concreta.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

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
import concreta.diagram.edit.parts.WorkspaceEditPart;
import concreta.diagram.part.ConcretaDiagramEditorPlugin;
import concreta.diagram.part.ConcretaVisualIDRegistry;
import concreta.diagram.providers.ConcretaElementTypes;
import concreta.diagram.providers.ConcretaParserProvider;

/**
 * @generated
 */
public class ConcretaNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		ConcretaDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		ConcretaDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ConcretaNavigatorItem && !isOwnView(((ConcretaNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof ConcretaNavigatorGroup) {
			ConcretaNavigatorGroup group = (ConcretaNavigatorGroup) element;
			return ConcretaDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof ConcretaNavigatorItem) {
			ConcretaNavigatorItem navigatorItem = (ConcretaNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (ConcretaVisualIDRegistry.getVisualID(view)) {
		case WorkspaceEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?concreta?Workspace", ConcretaElementTypes.Workspace_1000); //$NON-NLS-1$
		case UserStoryEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?concreta?UserStory", ConcretaElementTypes.UserStory_2001); //$NON-NLS-1$
		case ComoEditPart.VISUAL_ID:
			return getImage("Navigator?Node?concreta?Como", ConcretaElementTypes.Como_3001); //$NON-NLS-1$
		case QuieroEditPart.VISUAL_ID:
			return getImage("Navigator?Node?concreta?Quiero", ConcretaElementTypes.Quiero_3002); //$NON-NLS-1$
		case ParaEditPart.VISUAL_ID:
			return getImage("Navigator?Node?concreta?Para", ConcretaElementTypes.Para_3003); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ConcretaDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && ConcretaElementTypes.isKnownElementType(elementType)) {
			image = ConcretaElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof ConcretaNavigatorGroup) {
			ConcretaNavigatorGroup group = (ConcretaNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ConcretaNavigatorItem) {
			ConcretaNavigatorItem navigatorItem = (ConcretaNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (ConcretaVisualIDRegistry.getVisualID(view)) {
		case WorkspaceEditPart.VISUAL_ID:
			return getWorkspace_1000Text(view);
		case UserStoryEditPart.VISUAL_ID:
			return getUserStory_2001Text(view);
		case ComoEditPart.VISUAL_ID:
			return getComo_3001Text(view);
		case QuieroEditPart.VISUAL_ID:
			return getQuiero_3002Text(view);
		case ParaEditPart.VISUAL_ID:
			return getPara_3003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getWorkspace_1000Text(View view) {
		Workspace domainModelElement = (Workspace) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNombre();
		} else {
			ConcretaDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUserStory_2001Text(View view) {
		IParser parser = ConcretaParserProvider.getParser(ConcretaElementTypes.UserStory_2001,
				view.getElement() != null ? view.getElement() : view,
				ConcretaVisualIDRegistry.getType(UserStoryNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConcretaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getComo_3001Text(View view) {
		IParser parser = ConcretaParserProvider.getParser(ConcretaElementTypes.Como_3001,
				view.getElement() != null ? view.getElement() : view,
				ConcretaVisualIDRegistry.getType(ComoDescripcionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConcretaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getQuiero_3002Text(View view) {
		IParser parser = ConcretaParserProvider.getParser(ConcretaElementTypes.Quiero_3002,
				view.getElement() != null ? view.getElement() : view,
				ConcretaVisualIDRegistry.getType(QuieroDescripcionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConcretaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPara_3003Text(View view) {
		IParser parser = ConcretaParserProvider.getParser(ConcretaElementTypes.Para_3003,
				view.getElement() != null ? view.getElement() : view,
				ConcretaVisualIDRegistry.getType(ParaDescripcionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConcretaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return WorkspaceEditPart.MODEL_ID.equals(ConcretaVisualIDRegistry.getModelID(view));
	}

}
