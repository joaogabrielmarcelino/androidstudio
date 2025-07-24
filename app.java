// Etapa 1: Pacote do projeto
package com.example.joao;

// Etapa 2: Importação das classes necessárias
import android.os.Bundle; // Para salvar e restaurar o estado da activity
import android.widget.TextView; // Para exibir e alterar textos na interface
import androidx.appcompat.app.AppCompatActivity; // Base para activities modernas
import java.util.Random; // Para gerar números aleatórios
import android.view.View; // Para capturar eventos de clique na interface

// Etapa 3: Definição da classe principal que representa a tela (activity)
public class MainActivity extends AppCompatActivity {

    // Etapa 4: chamado automaticamente quando a activity é criada
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // Chama a criação da activity pai
        setContentView(R.layout.activity_main); // Liga o layout XML com essa classe Java
    }

    // Etapa 5: Função que é chamada quando o botão é clicado (via android:onClick no XML)
    public void sortear(View view) {
        // Etapa 6: Acessa o TextView com o id 'resultado'
        TextView sorteado = findViewById(R.id.resultado);

        // Etapa 7: Cria um gerador de números aleatórios
        Random random = new Random();

        // Etapa 8: Gera um número aleatório entre 1 e 11 (inclusive 11 por erro, deveria ser 1 a 10)
        int numero = random.nextInt(11) + 1;

        // Etapa 9: Exibe o resultado no TextView
        sorteado.setText("Resultado: " + numero);
    }
}
