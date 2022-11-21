package diagrama.model;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Shell;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import ucdiagram.LimitBox;
import ucdiagram.ModelFactory;
import ucdiagram.UseCase;
import ucdiagram.comRelationship;
import ucdiagram.extendsRelationship;
import ucdiagram.includeRelationship;
import ucdiagram.uc_diagram;

public class TransformacionM2D {
	
	private ucdiagram.ModelFactory modelFactoryUcDiagram;

	public TransformacionM2D(ModelFactory modelFactoryUcDiagram) {
		super();
		this.modelFactoryUcDiagram = modelFactoryUcDiagram;
	}
	
	public String transformarM2D() {
		
		try {
			
			String pathRaiz = "";
			DirectoryDialog fd = new DirectoryDialog(new Shell(), SWT.SELECTED);
			fd.setText("Generacion de documento");
		    pathRaiz = fd.open();
		    
			Document document = new Document();
			PdfWriter.getInstance(document, new FileOutputStream(pathRaiz+"/"+"documentoCasosUso.pdf"));
			document.open();
			
			Font f = new Font(FontFamily.TIMES_ROMAN);
			Paragraph p = new Paragraph("Documentación de casos de uso", f);
			p.setAlignment(Element.ALIGN_CENTER);
			p.setSpacingAfter(30);
			document.add(p);
			
			for(uc_diagram diagram : modelFactoryUcDiagram.getListDiagrams()) {
				
				for(LimitBox limitBox : diagram.getListBoxes()) {
					
					for(UseCase uc : limitBox.getUseCases()) {
						
						generateUseCaseTable(document, uc, diagram);
					}
				}
			}
			
			document.close();
			System.out.println("PDF generado");
			
		} catch (FileNotFoundException | DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "Se ha generado el documento de su modelo";
	}
	
	public void generateUseCaseTable(Document document, UseCase useCase, uc_diagram diagram) {
		
		PdfPTable t = new PdfPTable(2);
		Font f = new Font(FontFamily.TIMES_ROMAN);
		Paragraph p = new Paragraph("Caso de uso "+useCase.getName(), f);
		p.setAlignment(Element.ALIGN_CENTER);
		p.setSpacingAfter(20);
		
		try {
			t.setWidths(new int[]{80,200});
			document.add(p);
			t.addCell(generateCell("Código de caso de uso", true));
			t.addCell(generateCell(useCase.getUseCaseId(), true));
			t.addCell(generateCell("Nombre del caso de uso", true));
			t.addCell(generateCell(useCase.getName(), true));
			t.addCell(generateCell("Fecha", true));
			t.addCell(generateCell(useCase.getDate(), true));
			t.addCell(generateCell("Descripción", true));
			t.addCell(generateCell(useCase.getDescription(), false));
			t.addCell(generateCell("Actores", true));
			t.addCell(generateCell(generateActors(diagram, useCase.getName()), false));
			t.addCell(generateCell("Objetivo", true));
			t.addCell(generateCell(useCase.getObjective(), false));
			t.addCell(generateCell("Precondiciones", true));
			t.addCell(generateCell(generatePreconditions(useCase), false));
			t.addCell(generateCell("Postcondiciones", true));
			t.addCell(generateCell(generatePostconditions(useCase), false));
			t.addCell(generateCell("Flujo de eventos", true));
			t.addCell(generateCell(generateFlowEvents(useCase), false));
			t.addCell(generateCell("Situaciones excepcionales", true));
			t.addCell(generateCell(generateExceptions(useCase), false));
			t.addCell(generateCell("Anotaciones", true));
			t.addCell(generateCell(useCase.getAnnotations(), false));
			t.addCell(generateCell("Puntos de extensión", true));
			t.addCell(generateCell(generateExtendsPoints(diagram, useCase.getName()), false));
			t.addCell(generateCell("Puntos de inclusión", true));
			t.addCell(generateCell(generateIncludePoints(diagram, useCase.getName()), false));
			document.add(t);	
			
			Phrase space2 = new Phrase("\n");
			document.add(space2);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public PdfPCell generateCell(String text, Boolean center) {
		
		Font f = new Font(FontFamily.TIMES_ROMAN);
		Paragraph p = new Paragraph(text, f);
		PdfPCell cell = new PdfPCell(p);
		
		if(center) {
			
			cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
			cell.setPadding(5);
		}
		
		return cell;
	}
	
	public String generateActors(uc_diagram diagram, String useCaseName) {
		
		String listActors = "";
		
		for(comRelationship r : diagram.getListComRels()) {
			
			if(r.getTarget().getName().equals(useCaseName)) {
				listActors += "- "+r.getSource().getName()+"\n\n";
			}
		}
		
		return listActors;
	}
	
	public String generatePreconditions(UseCase useCase) {
		
		String preconditions = "";
		
		if(useCase.getListPreconditions()!=null && useCase.getListPreconditions().size()>0) {
			
			for(String c : useCase.getListPreconditions()) {
				
				preconditions += "- "+c+"\n\n";
			}
			
			return preconditions;
		}
		
		return "Sin precondiciones";
	}
	
	public String generatePostconditions(UseCase useCase) {
		
		String postconditions = "";
		
		if(useCase.getListPostconditions()!=null && useCase.getListPostconditions().size()>0) {
			
			for(String c : useCase.getListPreconditions()) {
				
				postconditions += "- "+c+"\n\n";
			}
			
			return postconditions;
		}
		
		return "Sin postcondiciones";
	}
	
	public String generateFlowEvents(UseCase useCase) {
		
		String flowEvents = "";
		
		if(useCase.getListFlowEvents()!=null && useCase.getListFlowEvents().size()>0) {
			
			for(String fe : useCase.getListFlowEvents()) {
				
				flowEvents += "- "+fe+"\n\n";
			}
			
			return flowEvents;
		}
		
		return "Sin flujo de eventos";
	}
	
	public String generateExceptions(UseCase useCase) {
		
		String listExceptions = "";
		
		if(useCase.getListExceptions()!=null && useCase.getListExceptions().size()>0) {
			
			for(String e : useCase.getListExceptions()) {
				
				listExceptions += "- "+e+"\n\n";
			}
			
			return listExceptions;
		}
		
		return "Sin excepciones";
	}
	
	public String generateExtendsPoints(uc_diagram diagram, String useCaseName) {
		
		String listExtendsPoints = "";
		
		for(extendsRelationship r : diagram.getListExtRels()) {

			if(r.getTarget().getName().equals(useCaseName)) {
				
				listExtendsPoints += "- Caso de uso "+r.getSource().getName()+"\n\n";
			}
		}
		
		if(listExtendsPoints.equals("")) {
			return "Sin puntos de extension";
		}
		
		return listExtendsPoints;
	}
	
	public String generateIncludePoints(uc_diagram diagram, String useCaseName) {
		
		String listIncludePoints = "";
		
		for(includeRelationship r : diagram.getListIncRels()) {
			
			if(r.getSource().getName().equals(useCaseName)) {
				
				listIncludePoints += "- Caso de uso "+r.getTarget().getName()+"\n\n";
			}
		}
		
		if(listIncludePoints.equals("")) {
			
			return "Sin puntos de inclusion";
		}
		
		return listIncludePoints;
	}

}
