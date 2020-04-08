
package control;

import java.util.List;
import model.Usuario;
import model.dao.LoginDAO;

public class LoginControl {
    
    public void receber_lista_altentificacao(List<String> l){
     Usuario login = new Usuario();
     login.setEmail(l.get(0));
     login.setPassword(l.get(1));
     LoginDAO dao = new LoginDAO();
     dao.CRUD_busca(login);     
    }
}
