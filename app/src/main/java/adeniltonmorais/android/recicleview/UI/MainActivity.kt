package adeniltonmorais.android.recicleview.UI

import adeniltonmorais.android.recicleview.R
import adeniltonmorais.android.recicleview.adapter.JogosAdapter
import adeniltonmorais.android.recicleview.datasource.Datasource
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.toolbar.*


class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iniciarRecyclerView()
        buttonCadastrarJogo.setOnClickListener (this)

        insertToolbar()

    }

    private fun insertToolbar() {
        setSupportActionBar(toolbar)
        supportActionBar!!.title="My Game App"
    }

    private fun iniciarRecyclerView(){

       recyclerviewJogos.layoutManager=LinearLayoutManager(this)
       recyclerviewJogos.adapter= JogosAdapter(Datasource.getJogos() )


    }

    override fun onClick(v: View) {

       if(v.id==R.id.buttonCadastrarJogo){
           val intent= Intent(this,CadastroJogoActivity::class.java)
           startActivity(intent)
       }
    }


}