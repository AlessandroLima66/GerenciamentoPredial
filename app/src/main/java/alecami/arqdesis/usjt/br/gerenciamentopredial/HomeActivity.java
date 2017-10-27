package alecami.arqdesis.usjt.br.gerenciamentopredial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    private Button cadUsuario;
    private Button cadEmpresa;
    private Button gerarArquivo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        cadUsuario = (Button) findViewById(R.id.botao_cadUsuario);
        cadEmpresa = (Button) findViewById(R.id.botao_cadEmpresa);
        gerarArquivo = (Button) findViewById(R.id.botao_GerarArquivo);
        ativaBotoesPorUsuario();
    }

    public void ativaBotoesPorUsuario(){
        Intent intent = getIntent();
        String tipo = intent.getStringExtra(LoginActivity.CHAVE);
        //int tipo = intent.getIntExtra(LoginActivity.CHAVE,4);

        switch (tipo){
            case "Sindico":
                cadEmpresa.setEnabled(true);
                cadUsuario.setEnabled(true);
                gerarArquivo.setEnabled(true);
                break;
            case "Funcionario":
                cadEmpresa.setEnabled(true);
                break;
            case "Atendente":
                cadEmpresa.setEnabled(true);
                cadUsuario.setEnabled(true);
                break;
        }
    }
}
