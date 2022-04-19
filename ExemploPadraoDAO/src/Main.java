import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

import modelo.Pessoa;
import modelo.repositorio.PessoaDAO;

public class Main
{
	public static void main(String[] args)
	{
//		INSTANCIANDO PESSOA DAO
		PessoaDAO pessoaDAO = new PessoaDAO();
		
//		--------------------------------------------------
		
//		INSTANCIANDO PESSOA PARA INSERIR NO BANCO DE DADOS
//		Pessoa p1 = new Pessoa();
//		p1.setNome("Airton Senna");
//		p1.setEndereco("Travessa Gonçalvez Ledo, 31");
//		p1.setCep(85948392);
//		p1.setTelefone("(11) 9851-903");
//		p1.setRenda(1030.0f);
		
//		INSERINDO PESSOA NO BANCO DE DADOS PELO PESSOA DAO
//		int id = pessoaDAO.criarPessoa(p1);
		
//		COLOCANDO O ID NA PESSOA
//		p1.setId(id);
		
//		MOSTRANDO PESSOA CRIADA NA TELA
//		System.out.println("Id da pessoa inserida: " + p1.getId());
		
//		----------------------------------------------
		
//		CHAMANDO FUNÇÃO DE "SELECT * PESSOAS"
//		ArrayList<Pessoa> pessoas = pessoaDAO.recuperarPessoas();
		
//		PRIMEIRA FORMA DE ITERAR O RESULTADO DA LISTA DE PESSOAS
//		pessoas.forEach(
//				p -> System.out.println(p.getNome())
//		);
		
//		SEGUNDA FORMA DE ITERAR O RESULTADO DA LISTA DE PESSOAS
//		Iterator<Pessoa> it = pessoas.iterator();
//		while (it.hasNext()) {
//			Pessoa p = it.next();
//			System.out.println(p.getId() + " - " + p.getNome());
//		}
		
//		-------------------------------------------------------
		
//		BUSCA PESSOA PELO ID NO BANCO DE DADOS
//		int id = 1;
//		Pessoa p = pessoaDAO.recuperarPessoaPorId(id);
		
//		ITERA O RESULTADO DA BUSCA POR ID
//		if( p != null ) {
//			System.out.println("Pessoa " + p.getId()
//			+ ": " + p.getNome());
//		} else {
//			System.out.println("Não encontrado registro de pessoa " + id);
//		}
		
//		----------------------------------------------------------
		
//		MUDA ALGUMA PESSOA PARA DEPOIS ALTERAR NO BANCO DE DADOS
//		int id = 10;
//		Pessoa p = pessoaDAO.recuperarPessoaPorId(id);
//		if( p != null ) {
//			p.setNome("Maria Antonieta");
//		}
		
//		TENTA EDITAR PESSOA NO BANCO, RECEBENDO QUANTAS LINHAS MUDARAM
//		int q = pessoaDAO.editarPessoa(p);
//		
//		MOSTRA O RESULTADO
//		if (q > 0) {
//			System.out.println("Update com sucesso! " + q + " linha(s) mudaram.");
//		}
		
//		------------------------------------------------------------
		
//		APAGAR PESSOA PELO ID
//		int id = 3;
//		int q = pessoaDAO.removerPessoa(id);
		
//		MOSTRA O RESULTADO
//		if (q > 0) {
//			System.out.println("Pessoa " + id + " apagada com sucesso!");
//		}
		
//		--------------------------------------------------------------
	}
}