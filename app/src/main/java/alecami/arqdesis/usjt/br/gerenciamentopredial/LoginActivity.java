package alecami.arqdesis.usjt.br.gerenciamentopredial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {
    private EditText login;
    private EditText senha;
    ArrayList<Usuario> lista;
    private Button botao;
    public static final String CHAVE = "alecami.arqdesis.usjt.br.gerenciamentopredial.chave";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login = (EditText) findViewById(R.id.login_sistema);
        senha = (EditText) findViewById(R.id.senha_sistema);
        botao = (Button) findViewById(R.id.botao);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                Usuario usuarioLogin = new Usuario(login.getText().toString(), senha.getText().toString());
                lista = geraListaUsuarios();

                if (lista.contains(usuarioLogin)) {
                    //vai para proxima página
                    startActivity(intent);
                }
                //voltar para página de login
                return;
            }
        });
    }

    public ArrayList<Usuario> geraListaUsuarios() {
        ArrayList<Usuario> lista = new ArrayList();
        lista.add(new Usuario("alessandro", "1234"));
        lista.add(new Usuario("camilla", "1234"));
        return lista;
    }
}
