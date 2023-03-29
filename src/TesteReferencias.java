
public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
		
		EditorVideo e1 = new EditorVideo();
		e1.setNome("João");
		e1.setSalario(2500.0);
		
		ControleBonificacao controle1 = new ControleBonificacao();
		ControleBonificacao controle2 = new ControleBonificacao();
		controle1.registra(g1);
		controle2.registra(e1);
		
		System.out.println("A bonificação do gerente é R$" + controle1.getSoma());
		System.out.println("A bonificação do editor de video é R$" + controle2.getSoma());
	}

}
