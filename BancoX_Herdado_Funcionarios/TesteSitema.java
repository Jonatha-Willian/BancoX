package BancoX_Herdado;

public class TesteSitema {

	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		Administrador adm = new Administrador();
		adm.setSenha(2222);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(2222);
		
		SitemaInterno si = new SitemaInterno();
		si.autentica(g);
		si.autentica(adm);
		si.autentica(cliente);
	
	}

}
