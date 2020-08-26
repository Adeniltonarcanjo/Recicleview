package adeniltonmorais.android.recicleview.UI

import adeniltonmorais.android.recicleview.R
import adeniltonmorais.android.recicleview.adapter.JogosAdapter
import adeniltonmorais.android.recicleview.datasource.Datasource
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import androidx.recyclerview.widget.LinearLayoutManager


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iniciarRecyclerView()


    }

    private fun iniciarRecyclerView(){

       recyclerviewJogos.layoutManager=LinearLayoutManager(this)
       recyclerviewJogos.adapter= JogosAdapter(Datasource.getJogos() )


    }


}