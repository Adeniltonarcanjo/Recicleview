package adeniltonmorais.android.recicleview.datasource

import adeniltonmorais.android.recicleview.model.Jogo


class Datasource {

    companion object {

        fun getJogos():ArrayList<Jogo> {
            var jogos=ArrayList<Jogo>()
            jogos.add(Jogo(130,"Mario Kart",4,"pc"))
            jogos.add(Jogo(100,"Resident Evil",5,"ps4"))
            jogos.add(Jogo(200,"Zobier ARme",4,"pc"))
            jogos.add(Jogo(229,"crach",5,"ps2"))
            jogos.add(Jogo(214,"mario",4,"ps1"))
            jogos.add(Jogo(110,"Tob Raider",3,"ps"))
            jogos.add(Jogo(105,"race car",5,"pc"))
            jogos.add(Jogo(106,"sonic",4,"ps2"))

            return jogos
        }

    }
}