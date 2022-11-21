package diagrama.model;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Shell;

import abstracta.ModelFactory;
import abstracta.UserStory;

public class TransformacionTemplate {

	private ModelFactory modelFactoryAbstracta;

	public TransformacionTemplate(ModelFactory modelFactoryAbstracta) {
		super();
		this.modelFactoryAbstracta = modelFactoryAbstracta;
	}

	public String crearPDF() {

		try {

			String pathRaiz = "";
			DirectoryDialog fd = new DirectoryDialog(new Shell(), SWT.SELECTED);
			fd.setText("Generacion de documento");
			pathRaiz = fd.open();
			// Se crea el documento
			Document documento = new Document();

			// El OutPutStream para el fichero donde crearemos el PDF
			FileOutputStream ficheroPDF = new FileOutputStream("HistoriasDeUsuario.pdf");

			// Se asocia el documento de OutPutStream
			PdfWriter.getInstance(documento, new FileOutputStream(pathRaiz + "/" + ficheroPDF));

			// Se abre el documento
			documento.open();

			// Parrafo
			Paragraph titulo = new Paragraph("Lista Historias De Usuario \n\n",
					FontFactory.getFont("arial", 16, Font.BOLD, BaseColor.BLACK));
			titulo.setAlignment(Element.ALIGN_CENTER);

			// A�adimos el titulo al documento
			documento.add(titulo);

			// Creamos las tablas que se soliciten con sus respectivas celdas
			// El 5 se puso por que si, se modifica para la cantidad de HU que haga el
			// usuario
			for (UserStory userStory : modelFactoryAbstracta.getListUserStorys()) {
				// Creamos al tabla
				PdfPTable tabla = new PdfPTable(4);

				// Creamos las celdas de la tabla

				Paragraph textoInicial = new Paragraph("Historia de Usuario",
						FontFactory.getFont("arial", 12, Font.BOLD, BaseColor.BLACK));
				PdfPCell celdaInicial = new PdfPCell(textoInicial);
				celdaInicial.setColspan(4);
				celdaInicial.setBackgroundColor(BaseColor.LIGHT_GRAY);
				tabla.addCell(celdaInicial);

				Paragraph numeroText = new Paragraph("Numero:");
				numeroText.add(" " + userStory.getIdentificador()); // Linea para a�adir m�s informaci�n al texto que lleva la celda, aqu� se a�ade
											// la info que viene de la abstracta
				PdfPCell numero = new PdfPCell(numeroText);
				numero.setColspan(1);
				tabla.addCell(numero);

				Paragraph usuarioText = new Paragraph("Usuario:");
				usuarioText.add(" " + userStory.getTheComo().getDescripcion());// Linea para a�adir m�s informaci�n al texto que lleva la celda, aqu� se a�ade
									// la info que viene de la abstracta
				PdfPCell usuario = new PdfPCell(usuarioText);
				usuario.setColspan(3);
				tabla.addCell(usuario);

				Paragraph nombreHUText = new Paragraph("Nombre Historia Usuario:");
				nombreHUText.add(" " + userStory.getNombre());// Linea para a�adir m�s informaci�n al texto que lleva la celda, aqu� se a�ade
										// la info que viene de la abstracta
				PdfPCell nombreHU = new PdfPCell(nombreHUText);
				nombreHU.setColspan(4);
				tabla.addCell(nombreHU);

				Paragraph prioridadText = new Paragraph("Prioridad en el negocio:");
				prioridadText.add(" " + userStory.getPrioridad());// Linea para a�adir m�s informaci�n al texto que lleva la celda, aqu� se a�ade
										// la info que viene de la abstracta
				PdfPCell prioridad = new PdfPCell(prioridadText);
				prioridad.setColspan(2);
				tabla.addCell(prioridad);

				Paragraph riesgoText = new Paragraph("Riesgo en desarrollo:");
				riesgoText.add(" " + userStory.getRiesgo());// Linea para a�adir m�s informaci�n al texto que lleva la celda, aqu� se a�ade
									// la info que viene de la abstracta
				PdfPCell riesgo = new PdfPCell(riesgoText);
				riesgo.setColspan(2);
				tabla.addCell(riesgo);

				Paragraph puntosText = new Paragraph("Puntos estimados:");
				puntosText.add(" " + userStory.getEstimacion());// Linea para a�adir m�s informaci�n al texto que lleva la celda, aqu� se a�ade
									// la info que viene de la abstracta
				PdfPCell puntos = new PdfPCell(puntosText);
				puntos.setColspan(2);
				tabla.addCell(puntos);

				Paragraph interracionText = new Paragraph("Iteraci�n asignada:");
				interracionText.add(" " + userStory.getIteracion());// Linea para a�adir m�s informaci�n al texto que lleva la celda, aqu� se a�ade
										// la info que viene de la abstracta
				PdfPCell iteracion = new PdfPCell(interracionText);
				iteracion.setColspan(2);
				tabla.addCell(iteracion);

				Paragraph responsableText = new Paragraph("Programador Responsable:");
				responsableText.add(" " + userStory.getResponsable());// Linea para a�adir m�s informaci�n al texto que lleva la celda, aqu� se a�ade
										// la info que viene de la abstracta
				PdfPCell responsable = new PdfPCell(responsableText);
				responsable.setColspan(4);
				tabla.addCell(responsable);

				Paragraph descripcionText = new Paragraph("Descripcion:");
				descripcionText.add(" " + userStory.getTheQuiero());// Linea para a�adir m�s informaci�n al texto que lleva la celda, aqu� se a�ade
										// la info que viene de la abstracta
				PdfPCell descripcion = new PdfPCell(descripcionText);
				descripcion.setColspan(4);
				tabla.addCell(descripcion);

				Paragraph validacionText = new Paragraph("Validacion:");
				validacionText.add(" " + userStory.getThePara());// Linea para a�adir m�s informaci�n al texto que lleva la celda, aqu� se a�ade
										// la info que viene de la abstracta
				PdfPCell validacion = new PdfPCell(validacionText);
				validacion.setColspan(4);
				tabla.addCell(validacion);

				// A�adimos la tabla al documento
				documento.add(tabla);
				// Se a�ade el espacio entre las tablas
				Paragraph espacio = new Paragraph(" \n");
				documento.add(espacio);
			}

			// Se cierra el documento
			documento.close();
		} catch (FileNotFoundException | DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Se ha realizado la generacion del archivo de historias de usuario";
	}

}