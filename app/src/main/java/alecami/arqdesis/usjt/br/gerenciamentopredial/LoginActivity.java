package alecami.arqdesis.usjt.br.gerenciamentopredial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {

    private EditText login;
    private EditText senha;
    ArrayList<Usuario> lista;
    Intent intent;
    public static final String CHAVE = "alecami.arqdesis.usjt.br.gerenciamentopredial.chave";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login = (EditText)findViewById(R.id.login_sistema);
        senha = (EditText) findViewById(R.id.senha_sistema);
    }

    public void loginSistema(View view){
        intent = new Intent(this, HomeActivity.class);

        Usuario usuarioLogin = new Usuario(login.toString(), senha.toString());
        lista = geraListaUsuarios();

        for (int i = 0 ; i < lista.size(); i++){
            if (lista.get(i).equals( usuarioLogin)){
                //vai para proxima página
                startActivity(intent);
            }
        }
        //voltar para página de login
    }

    public ArrayList<Usuario> geraListaUsuarios() {
        ArrayList<Usuario> lista = new ArrayList();
        lista.add(new Usuario("alessandro", "1234"));
        lista.add(new Usuario("camilla", "1234"));
        return lista;
    }
}
