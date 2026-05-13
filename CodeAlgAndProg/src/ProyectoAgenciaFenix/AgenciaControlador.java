package ProyectoAgenciaFenix; //Programa de CGCC, clave única:208410

//Importar elementos para construir el Controlador
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;

//Controlador que extiende la Vista
public class AgenciaControlador extends AgenciaVista{
	
	//Incluir un objeto Agencia en los atributos
	private Agencia agencia;
	private static final long serialVersionUID = 1L;
	
	//Constructor del Controlador
	public AgenciaControlador(String mensaje) {
		super(mensaje);
		
		//Botones que ocupan el ActionListener con las clases definidas
		btnSubmitTerreno.addActionListener(new TerrenosConP());
		btnSubmitCasa.addActionListener(new CasasConP());
		
		//Terminar de construir la agencia
		this.agencia = new Agencia("Fénix", "Río Hondo");
	}
	//Primer clase de Terreno
	private class TerrenosConP implements ActionListener{
		//Método que depende de ActionEvent
		public void actionPerformed(ActionEvent e) {
				//Conversión del txt en variable
				String parametro1=txtTerrenoParametro.getText().toUpperCase();
				
				//Try y catch para leer un archivo de texto de Terrenos
				try {
				//Definir variables y leer archivo
				File archivo = new File("Terrenos");
				Scanner lee = new Scanner(archivo);
				StringBuilder sB=new StringBuilder();
				double numTerreno,metros,precio;
				double par1=Double.parseDouble(parametro1);
				boolean band=true;
				
				//Guardar el numT y m2 del terreno dentro del parámetro
				while(lee.hasNextDouble() && band) {
					numTerreno=lee.nextDouble();
					metros=lee.nextDouble();
					precio=lee.nextDouble();
					if(precio==par1) {
						sB.append("Número de terreno: " + numTerreno + "  Metros cuadrados: " + metros);
						band=false;
					}	
				}
				
				//Establecer el nuevo texto
				if(sB.length()==0)
					txtTerrenos.setText("No existe ese terreno");
				else {
					txtTerrenos.setText(sB.toString());
				}
			}catch(Exception e1) { //En caso de que no se pueda abrir el archivo
				txtTerrenos.setText("No se pudo abrir");
			}
			
		}
	}
	//Segunda clase de Casa
	private class CasasConP implements ActionListener{
		//Método que depende de ActionEvent
		public void actionPerformed(ActionEvent e) {
				//Convertir entrada de texto en variable y construir Agencia
				String parametro2=txtCasaParametro.getText().toUpperCase();
				int par2=Integer.parseInt(parametro2);
				Agencia agencia=new Agencia("Fénix", "Río Hondo");
				
				//Alta de Casas
				agencia.altaCasa(255.7, 2780000.9, 2, 3, 2);
				agencia.altaCasa(300.1, 3000129.2, 2, 3, 2);
				agencia.altaCasa(205.2, 2080011.8, 2, 3, 2);
				agencia.altaCasa(267.8, 2921900.1, 2, 3, 2);
				agencia.altaCasa(305.5, 3800111.2, 3, 3, 3);
				agencia.altaCasa(399.7, 4200123.5, 4, 5, 3);
				agencia.altaCasa(225.5, 2435091.7, 2, 3, 2);
				agencia.altaCasa(299.1, 2999000.0, 2, 3, 2);
				agencia.altaCasa(401.0, 4909303.1, 4, 5, 3);
				agencia.altaCasa(322.3, 3708000.2, 3, 3, 3);
				
				//Llamar método y guardar en variable, establecer el nuevo texo
				String res1= agencia.infoCasasEnCategoria(par2);
				txtCasas.setText(res1);
		}
	}
	//Main con el Controlador
	public static void main(String[] args) {
		new AgenciaControlador("Agencia Fénix");
	}
}
