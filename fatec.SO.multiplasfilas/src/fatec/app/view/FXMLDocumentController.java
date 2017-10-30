package fatec.app.view;

import fatec.app.process.Fila;
import fatec.app.process.FilaBatch;
import fatec.app.process.FilaInterativa;
import fatec.app.process.FilaSistema;
import fatec.app.process.Processo;
import java.awt.Rectangle;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Line;
import static javax.swing.text.StyleConstants.Background;
import javafx.scene.layout.AnchorPane;
import javax.swing.JOptionPane;

/**
 * 
 *
 * @author Vinicius Lelis
 */
public class FXMLDocumentController implements Initializable {
    
    private Fila sistema;
    private Fila interativa;
    private Fila batch;
    
    @FXML
    private AnchorPane AnchorPane;
    @FXML
    private Button sy01;
    @FXML
    private Button sy02;
    @FXML
    private Button sy03;
    @FXML
    private Button sy04;
    @FXML
    private Button int01;
    @FXML
    private Button int02;
    @FXML
    private Button int03;
    @FXML
    private Button int04;
    @FXML
    private Button batch01;
    @FXML
    private Button batch02;
    @FXML
    private Button batch03;
    @FXML
    private Button batch04;
    @FXML
    private Rectangle retangulo;
    @FXML
    private Button syLineB;
    @FXML
    private Button intLineB;
    @FXML
    private Button batchLineB;
        
    private void callPane() {
        
    }
    
    public FXMLDocumentController(){
        sistema = new FilaSistema();
        interativa = new FilaInterativa();
        batch = new FilaBatch();
    }
    
    private Processo newProcess(){
        int id = Integer.parseInt(JOptionPane.showInputDialog("Insira o ID do processo"));
        int prioridade = Integer.parseInt(JOptionPane.showInputDialog("Insira A prioridade do processo"));
        int tempo = Integer.parseInt("Insira o tempo de execução do processo");
        
        return new Processo(id, prioridade, tempo);
    }
    
    @FXML 
    private void addProcessoSistema(ActionEvent event) {
        sistema.addProcesso(this.newProcess());
    }
    @FXML
    private void addProcessoInterativo(ActionEvent event) {
        interativa.addProcesso(this.newProcess());
    }
    @FXML
    private void addProcessoBatch(ActionEvent event) {
        batch.addProcesso(this.newProcess());
    }
   
    // Alterar cores dos botões
    private void setVazio(Button button) {
        button.setStyle("-fx-background-color:WHITE;");
    }
    private void setExecutando(Button button) {
        button.setStyle("-fx-background-color:#79ff75;");
    }
    private void setAguardando(Button button) {
        button.setStyle("-fx-background-color:#f1ff1f;");
    }
    private void setPronto(Button button) {
        button.setStyle("-fx-background-color:#ff28de;");
    }
    private void setLineExecutando(Button button) {
        button.setStyle("-fx-background-color:#79ff75;");
    }
    private void setLineVazio(Button button) {
        button.setStyle("-fx-background-color:WHITE;");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}