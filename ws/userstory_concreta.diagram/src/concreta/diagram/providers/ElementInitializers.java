/*
 * 
 */
package concreta.diagram.providers;

import concreta.diagram.part.ConcretaDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = ConcretaDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			ConcretaDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
