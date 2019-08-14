package br.senac.rn.agenda;

import br.senac.rn.agenda.model.Contato;
import br.senac.rn.agenda.repository.ContatoRepository;

import java.util.List;

public class TestaPrograma {
    public static void main(String[] args) {

        ContatoRepository bancoDeDados = new ContatoRepository();

        Contato jota = new Contato( "Jota Lopes", "9999-8888");
        bancoDeDados.salva(jota);
        Contato filipe = new Contato("Filipe Pontes", "8888-6666");
        Contato michele = new Contato("Michele Silva", "3232-1423");

        bancoDeDados.salva(filipe);
        bancoDeDados.salva(michele);

        List<Contato> contatos = bancoDeDados.buscaTodos();
        for (Contato contato : contatos) {
            System.out.println(contato.getNome());
        }
       Contato contatoBuscado = bancoDeDados.buscaPeloNome("Jota Lopes");
        System.out.println(contatoBuscado.getNome());
        bancoDeDados.remove(michele);



    }
}
