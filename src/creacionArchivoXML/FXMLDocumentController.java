
package creacionArchivoXML;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JTextField;
import modelo.Empleado;


public class FXMLDocumentController implements Initializable {

    @FXML
    private Label ltitulo;
    @FXML
    private Label lnombre;
    @FXML
    private Label ldireccion;
    @FXML
    private Label ledad;
    @FXML
    private Label lcodigo;
    @FXML
    private Label ldepartamento;
    @FXML
    private TextField tnombre;
    @FXML
    private TextField tdireccion;
    @FXML
    private TextField tedad;
    @FXML
    private TextField tcodigo;
    @FXML
    private TextField tdepartamento;

    LinkedList<Empleado> listaEmpleados;

    @FXML
    private void agregarempleadoLista(ActionEvent event) {
        String Nombre = tnombre.getText();
        String Direccion = tdireccion.getText();
        int Edad = Integer.parseInt(tedad.getText());
        String Codigo = tcodigo.getText();
        String Departamento = tdepartamento.getText();

        Empleado objE = new Empleado(Departamento, Codigo, Nombre, Edad, Direccion);
        listaEmpleados.add(objE);

    }

    @FXML
    private void crearArchivitoXML(ActionEvent event) {
        Empleado objE = new Empleado();
        boolean guardar = objE.crearFileXML(listaEmpleados);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        listaEmpleados = new LinkedList<>();
    }

}
