/*
 * 
 */
package concreta.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import concreta.ConcretaPackage;
import concreta.diagram.edit.parts.ComoDescripcionEditPart;
import concreta.diagram.edit.parts.ComoNombreEditPart;
import concreta.diagram.edit.parts.ParaDescripcionEditPart;
import concreta.diagram.edit.parts.ParaNombreEditPart;
import concreta.diagram.edit.parts.QuieroDescripcionEditPart;
import concreta.diagram.edit.parts.QuieroNombreEditPart;
import concreta.diagram.edit.parts.UserStoryNombreEditPart;
import concreta.diagram.parsers.MessageFormatParser;
import concreta.diagram.part.ConcretaVisualIDRegistry;

/**
 * @generated
 */
public class ConcretaParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser userStoryNombre_5004Parser;

	/**
	* @generated
	*/
	private IParser getUserStoryNombre_5004Parser() {
		if (userStoryNombre_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretaPackage.eINSTANCE.getUserStory_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			userStoryNombre_5004Parser = parser;
		}
		return userStoryNombre_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser comoDescripcion_5001Parser;

	/**
	* @generated
	*/
	private IParser getComoDescripcion_5001Parser() {
		if (comoDescripcion_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretaPackage.eINSTANCE.getComo_Descripcion() };
			MessageFormatParser parser = new MessageFormatParser(features);
			comoDescripcion_5001Parser = parser;
		}
		return comoDescripcion_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser quieroDescripcion_5002Parser;

	/**
	* @generated
	*/
	private IParser getQuieroDescripcion_5002Parser() {
		if (quieroDescripcion_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretaPackage.eINSTANCE.getQuiero_Descripcion() };
			MessageFormatParser parser = new MessageFormatParser(features);
			quieroDescripcion_5002Parser = parser;
		}
		return quieroDescripcion_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser paraDescripcion_5003Parser;

	/**
	* @generated
	*/
	private IParser getParaDescripcion_5003Parser() {
		if (paraDescripcion_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretaPackage.eINSTANCE.getPara_Descripcion() };
			MessageFormatParser parser = new MessageFormatParser(features);
			paraDescripcion_5003Parser = parser;
		}
		return paraDescripcion_5003Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case UserStoryNombreEditPart.VISUAL_ID:
			return getUserStoryNombre_5004Parser();
		case ComoDescripcionEditPart.VISUAL_ID:
			return getComoDescripcion_5001Parser();
		case QuieroDescripcionEditPart.VISUAL_ID:
			return getQuieroDescripcion_5002Parser();
		case ParaDescripcionEditPart.VISUAL_ID:
			return getParaDescripcion_5003Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(ConcretaVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ConcretaVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ConcretaElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
