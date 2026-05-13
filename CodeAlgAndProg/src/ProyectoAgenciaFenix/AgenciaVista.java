package ProyectoAgenciaFenix; //Programa de CGCC, clave única:208410

//Se importan los recursos necesarios para construir la GUI
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//Clase Agencia Vista
public class AgenciaVista extends JFrame {
	private static final long serialVersionUID = 1L;
	//Atributos: JLable,JTextField,JButton
	protected JLabel lParametroCasa,lParametroTerreno;
	protected JTextField txtCasaParametro,txtTerrenoParametro,txtCasas,txtTerrenos;
	protected JButton btnSubmitTerreno,btnSubmitCasa;
	
	//Constructor con el mensaje de la ventana en el parámetro
	public AgenciaVista(String mensaje) {
		super(mensaje);
		
		//Construir los elementos gráficos
		lParametroCasa=new JLabel("                        Parámetro de la casa (categoría):");
		lParametroTerreno=new JLabel("                       Parámetro del terreno (precio):");
		txtCasaParametro=new JTextField(10);
		txtTerrenoParametro=new JTextField(10);
		txtCasas=new JTextField(10);
		txtTerrenos=new JTextField(10);
		btnSubmitTerreno=new JButton("Muestra Terreno");
		btnSubmitCasa=new JButton("Muestra Casa");
		
		//Creación de un panel donde se pondrán los elementos
		JPanel panel=new JPanel();
		panel.setLayout(new GridLayout(4,2));
		
		//Añadir los elementos al panel
		panel.add(lParametroCasa);
		panel.add(lParametroTerreno);
		panel.add(txtCasaParametro);
		panel.add(txtTerrenoParametro);
		panel.add(txtCasas);
		panel.add(txtTerrenos);
		panel.add(btnSubmitCasa);
		panel.add(btnSubmitTerreno);
		
		//Se añade el panel, se definen las dimensiones y se hace visible
		this.add(panel);
		this.setBounds(500,200,800,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		//Se construye la Vista en el main
		AgenciaVista agenciaVista=new AgenciaVista("Agencia");

	}

}
