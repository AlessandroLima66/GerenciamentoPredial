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
        int tipo = intent.getIntExtra(LoginActivity.CHAVE,4);

        switch (tipo){
            case 1:
                cadEmpresa.setEnabled(true);
                cadUsuario.setEnabled(true);
                gerarArquivo.setEnabled(true);
                break;
            case 2:
                cadEmpresa.setEnabled(true);
                break;
            case 3:
                cadEmpresa.setEnabled(true);
                cadUsuario.setEnabled(true);
                break;
        }
    }
}
