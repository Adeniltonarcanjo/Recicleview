package adeniltonmorais.android.recicleview.datasource

import adeniltonmorais.android.recicleview.model.Jogo

class Datasource {

    companion object {

        fun getJogos():ArrayList<Jogo> {
            var jogos=ArrayList<Jogo>()
            jogos.add(Jogo(100,"Resident Eviel",5,"ps4"))
            jogos.add(Jogo(200,"Zobier ARme",4,"pc"))
            return jogos
        }

    }
}