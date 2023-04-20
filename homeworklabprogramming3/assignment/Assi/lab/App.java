/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg1.lab;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;

import javafx.stage.Stage;
import view.ViewManager;
import static view.ViewManager.loginPage;
import view.loginPage;


public class App extends Application {
          loginPage loginPage;

    
    @Override
    public void start(Stage primaryStage) throws IOException  {
         
      ViewManager.openloginPage();

    }


    public static void main(String[] args) {
        launch(args);
    }
    
    
}
