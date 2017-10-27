package alecami.arqdesis.usjt.br.gerenciamentopredial;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {
    private EditText login;
    private EditText senha;
    private Button botao;
    private ArrayList<Usuario> lista;
    public static final String CHAVE = "alecami.arqdesis.usjt.br.gerenciamentopredial.tipoUsuario";

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

                Usuario usuarioLogin = new Usuario();
                usuarioLogin.setLogin(login.getText().toString());
                usuarioLogin.setSenha(senha.getText().toString());
                lista = geraListaUsuarios();
                if (lista.contains(usuarioLogin)) {
                    //Passando para a intent o tipo do usuário
                    String tipoUsuario = lista.get(lista.indexOf(usuarioLogin)).getTipoUsuario().getUsuario();
                    intent.putExtra(CHAVE,tipoUsuario);
                    //vai para proxima página
                    startActivity(intent);
                }else {
                    login.setText("");
                    senha.setText("");
                }
            }
        });
    }

    public ArrayList<Usuario> geraListaUsuarios() {
        ArrayList<Usuario> lista = new ArrayList();
        lista.add(new Usuario("alessandro", "1234", TipoUsuario.ATENDENTE));
        lista.add(new Usuario("camilla", "1234",TipoUsuario.FUNCIONARIO));
        lista.add(new Usuario("japa", "1234",TipoUsuario.SINDICO));
        return lista;
    }
}
