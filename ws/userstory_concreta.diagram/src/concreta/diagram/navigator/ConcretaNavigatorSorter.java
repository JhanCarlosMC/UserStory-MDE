/*
* 
*/
package concreta.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import concreta.diagram.part.ConcretaVisualIDRegistry;

/**
 * @generated
 */
public class ConcretaNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7005;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7004;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof ConcretaNavigatorItem) {
			ConcretaNavigatorItem item = (ConcretaNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return ConcretaVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
