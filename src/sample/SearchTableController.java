package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class SearchTableController implements Initializable {
//    @FXML
//    public javafx.scene.control.TableColumn col_prodName;
    @FXML
    public TableView<modelTable> table;
    @FXML
    public TableColumn<modelTable, Integer> col_prodCode;
    @FXML
    public TableColumn<modelTable, String> col_mfd;
    @FXML
    public TableColumn<modelTable, String> col_type;
    @FXML
    public TableColumn<modelTable, String> col_company;
    @FXML
    public TableColumn<modelTable, String> col_stockLocation;
    @FXML
    public TableColumn<modelTable, String> col_lastDate;




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        col_prodName.setCellValueFactory(new PropertyValueFactory<>("Pid"));
        col_prodCode.setCellValueFactory(new PropertyValueFactory<>("Pid"));
        col_mfd.setCellValueFactory(new PropertyValueFactory<>("Pmfd"));
        col_type.setCellValueFactory(new PropertyValueFactory<>("Pstock"));
        col_company.setCellValueFactory(new PropertyValueFactory<>("Ptype"));
        col_stockLocation.setCellValueFactory(new PropertyValueFactory<>("Pcompany"));
        col_lastDate.setCellValueFactory(new PropertyValueFactory<>("Plastdate"));

        table.setItems(observableList);
    }

    ObservableList<modelTable> observableList = FXCollections.observableArrayList(
            new modelTable(1, "2021-01-25", "lko", "goodType", "brandName", "2022-05-01")
    );
}
