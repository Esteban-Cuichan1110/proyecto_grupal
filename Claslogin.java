
package tienda;

import javax.swing.JOptionPane;

public class Claslogin {
    public String ususario;
    public String contrasenia;

  public boolean autenticar(String usu, String cla){
        if(usu.equals("Panda")&&cla.equals("Ferch@2006")){
        return true ;
        }else{
            return false;
        }
    }
}