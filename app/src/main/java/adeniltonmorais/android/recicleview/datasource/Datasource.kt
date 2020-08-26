package adeniltonmorais.android.recicleview.datasource

import adeniltonmorais.android.recicleview.model.Jogo


class Datasource {

    companion object {

        fun getJogos():ArrayList<Jogo> {
            var jogos=ArrayList<Jogo>()
            jogos.add(Jogo(130,"Mario Kart",4.0f,"pc"))
            jogos.add(Jogo(100,"Resident Evil",5.0f,"ps4"))
            jogos.add(Jogo(200,"Zobier ARme",4.0f,"pc"))
            jogos.add(Jogo(229,"crach",5.0f,"ps2"))
            jogos.add(Jogo(214,"mario",4.0f,"ps1"))
            jogos.add(Jogo(110,"Tob Raider",3.0f,"ps"))
            jogos.add(Jogo(105,"race car",5.0f,"pc"))
            jogos.add(Jogo(106,"sonic",4.0f,"ps2"))

            return jogos
        }

    }
}