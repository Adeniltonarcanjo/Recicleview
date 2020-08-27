package adeniltonmorais.android.recicleview.UI

import adeniltonmorais.android.recicleview.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_cadastro_jogo.*
import kotlinx.android.synthetic.main.toolbar.*


class CadastroJogoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_jogo)

        insertToolbar()
    }

    private fun insertToolbar() {
        setSupportActionBar(toolbar)
        supportActionBar!!.title="Novo Jogo"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true) // botão de voltar no actionBar do layout de cadastro
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_game,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.menu_cancelar -> {
                alert()
            }
            R.id.menu_salvar -> {
                Toast.makeText(this, "Salvar", Toast.LENGTH_SHORT)
            }
            else -> {onBackPressed()}


        }
        return true
    }

    private fun alert() {
       var builderDialog=AlertDialog.Builder(this)
        builderDialog.setTitle("Cancelar Cadastro")
        builderDialog.setMessage("Tem certeza que deseja cancelar o cadastro do seu jogo?")
        builderDialog.setIcon(R.drawable.ic_baseline_help_outline_red_24)

        builderDialog.setPositiveButton("Sim"){_,_-> onBackPressed()

        }
        builderDialog.setNegativeButton("Não"){_,_ ->
            editTextNomeDoJogo.requestFocus()
        }

        builderDialog.show()
    }


}