
public class Cliente implements Autenticavel{
	
	private AutenticacaoUtil autenticador;
	
	public Cliente(){
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

	@Override
	public int getSenha() {
		return this.autenticador.getSenha();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);;
	}

}
