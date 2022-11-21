
/*
 * 
 */
package concreta.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import concreta.diagram.providers.ConcretaElementTypes;

/**
 * @generated
 */
public class ConcretaPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createComo1CreationTool());
		paletteContainer.add(createPara2CreationTool());
		paletteContainer.add(createQuiero3CreationTool());
		paletteContainer.add(createUserStory4CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createComo1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Como1CreationTool_title,
				Messages.Como1CreationTool_desc, Collections.singletonList(ConcretaElementTypes.Como_3001));
		entry.setId("createComo1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcretaElementTypes.getImageDescriptor(ConcretaElementTypes.Como_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPara2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Para2CreationTool_title,
				Messages.Para2CreationTool_desc, Collections.singletonList(ConcretaElementTypes.Para_3003));
		entry.setId("createPara2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcretaElementTypes.getImageDescriptor(ConcretaElementTypes.Para_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createQuiero3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Quiero3CreationTool_title,
				Messages.Quiero3CreationTool_desc, Collections.singletonList(ConcretaElementTypes.Quiero_3002));
		entry.setId("createQuiero3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcretaElementTypes.getImageDescriptor(ConcretaElementTypes.Quiero_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUserStory4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.UserStory4CreationTool_title,
				Messages.UserStory4CreationTool_desc, Collections.singletonList(ConcretaElementTypes.UserStory_2001));
		entry.setId("createUserStory4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcretaElementTypes.getImageDescriptor(ConcretaElementTypes.UserStory_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
