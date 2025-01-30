package BancoX_Herdado;

public class Administrador extends Funcionario implements Autenticavel{

	private AutenticacaoUtil autenticador;
	
	public Administrador() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificacao do Administrador");
		return 50;
	}

}
