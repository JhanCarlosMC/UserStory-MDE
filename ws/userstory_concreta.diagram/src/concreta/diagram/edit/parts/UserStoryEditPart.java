/*
 * 
 */
package concreta.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.graphics.Color;

import concreta.diagram.edit.policies.OpenDiagramEditPolicy;
import concreta.diagram.edit.policies.UserStoryItemSemanticEditPolicy;
import concreta.diagram.part.ConcretaVisualIDRegistry;
import concreta.diagram.providers.ConcretaElementTypes;

/**
 * @generated
 */
public class UserStoryEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 2001;

	/**
	* @generated
	*/
	protected IFigure contentPane;

	/**
	* @generated
	*/
	protected IFigure primaryShape;

	/**
	* @generated
	*/
	public UserStoryEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(ConcretaVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new UserStoryItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenDiagramEditPolicy()); // XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	* @generated
	*/
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	* @generated
	*/
	protected IFigure createNodeShape() {
		return primaryShape = new UserStoryFigure();
	}

	/**
	* @generated
	*/
	public UserStoryFigure getPrimaryShape() {
		return (UserStoryFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof UserStoryNombreEditPart) {
			((UserStoryNombreEditPart) childEditPart).setLabel(getPrimaryShape().getFigureUserStoryLabelFigure());
			return true;
		}
		if (childEditPart instanceof UserStoryUserStoryTheComoCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getUserStoryTheComoCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((UserStoryUserStoryTheComoCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof UserStoryUserStoryTheQuieroCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getUserStoryTheQuieroCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((UserStoryUserStoryTheQuieroCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof UserStoryUserStoryTheParaCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getUserStoryTheParaCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((UserStoryUserStoryTheParaCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof UserStoryNombreEditPart) {
			return true;
		}
		if (childEditPart instanceof UserStoryUserStoryTheComoCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getUserStoryTheComoCompartmentFigure();
			pane.remove(((UserStoryUserStoryTheComoCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof UserStoryUserStoryTheQuieroCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getUserStoryTheQuieroCompartmentFigure();
			pane.remove(((UserStoryUserStoryTheQuieroCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof UserStoryUserStoryTheParaCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getUserStoryTheParaCompartmentFigure();
			pane.remove(((UserStoryUserStoryTheParaCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	* @generated
	*/
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	* @generated
	*/
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof UserStoryUserStoryTheComoCompartmentEditPart) {
			return getPrimaryShape().getUserStoryTheComoCompartmentFigure();
		}
		if (editPart instanceof UserStoryUserStoryTheQuieroCompartmentEditPart) {
			return getPrimaryShape().getUserStoryTheQuieroCompartmentFigure();
		}
		if (editPart instanceof UserStoryUserStoryTheParaCompartmentEditPart) {
			return getPrimaryShape().getUserStoryTheParaCompartmentFigure();
		}
		return getContentPane();
	}

	/**
	* @generated
	*/
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	* Default implementation treats passed figure as content pane.
	* Respects layout one may have set for generated figure.
	* @param nodeShape instance of generated figure class
	* @generated
	*/
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	* @generated
	*/
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	* @generated
	*/
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	* @generated
	*/
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	* @generated
	*/
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(ConcretaVisualIDRegistry.getType(UserStoryNombreEditPart.VISUAL_ID));
	}

	/**
	* @generated
	*/
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == ConcretaElementTypes.Como_3001) {
				return getChildBySemanticHint(
						ConcretaVisualIDRegistry.getType(UserStoryUserStoryTheComoCompartmentEditPart.VISUAL_ID));
			}
			if (type == ConcretaElementTypes.Quiero_3002) {
				return getChildBySemanticHint(
						ConcretaVisualIDRegistry.getType(UserStoryUserStoryTheQuieroCompartmentEditPart.VISUAL_ID));
			}
			if (type == ConcretaElementTypes.Para_3003) {
				return getChildBySemanticHint(
						ConcretaVisualIDRegistry.getType(UserStoryUserStoryTheParaCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	* @generated
	*/
	protected void handleNotificationEvent(Notification event) {
		if (event.getNotifier() == getModel()
				&& EcorePackage.eINSTANCE.getEModelElement_EAnnotations().equals(event.getFeature())) {
			handleMajorSemanticChange();
		} else {
			super.handleNotificationEvent(event);
		}
	}

	/**
	 * @generated
	 */
	public class UserStoryFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureUserStoryLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fUserStoryTheComoCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fUserStoryTheQuieroCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fUserStoryTheParaCompartmentFigure;

		/**
		 * @generated
		 */
		public UserStoryFigure() {
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8), getMapMode().DPtoLP(8)));
			this.setBackgroundColor(THIS_BACK);
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(1), getMapMode().DPtoLP(1), getMapMode().DPtoLP(1),
					getMapMode().DPtoLP(1)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureUserStoryLabelFigure = new WrappingLabel();

			fFigureUserStoryLabelFigure.setText("UserStory");
			fFigureUserStoryLabelFigure
					.setMaximumSize(new Dimension(getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureUserStoryLabelFigure);

			fUserStoryTheComoCompartmentFigure = new RectangleFigure();

			fUserStoryTheComoCompartmentFigure.setOutline(false);

			this.add(fUserStoryTheComoCompartmentFigure);

			fUserStoryTheQuieroCompartmentFigure = new RectangleFigure();

			fUserStoryTheQuieroCompartmentFigure.setOutline(false);

			this.add(fUserStoryTheQuieroCompartmentFigure);

			fUserStoryTheParaCompartmentFigure = new RectangleFigure();

			fUserStoryTheParaCompartmentFigure.setOutline(false);

			this.add(fUserStoryTheParaCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureUserStoryLabelFigure() {
			return fFigureUserStoryLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getUserStoryTheComoCompartmentFigure() {
			return fUserStoryTheComoCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getUserStoryTheQuieroCompartmentFigure() {
			return fUserStoryTheQuieroCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getUserStoryTheParaCompartmentFigure() {
			return fUserStoryTheParaCompartmentFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 230, 224, 99);

}
