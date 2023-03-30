
public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
		
		EditorVideo e1 = new EditorVideo();
		e1.setNome("João");
		e1.setSalario(2500.0);
		
		Designer d1 = new Designer();
		d1.setSalario(2000.0);
		
		ControleBonificacao controleGerente = new ControleBonificacao();
		controleGerente.registra(g1);
		System.out.println("A bonificação do gerente é R$" + controleGerente.getSoma());
		ControleBonificacao controleEditor = new ControleBonificacao();
		controleEditor.registra(e1);
		System.out.println("A bonificação do editor de video é R$" + controleEditor.getSoma());
		ControleBonificacao controleDesigner = new ControleBonificacao();
		controleDesigner.registra(d1);
		System.out.println("A bonificação do designer é R$" + controleDesigner.getSoma());
		ControleBonificacao total = new ControleBonificacao();
		total.registra(g1);
		total.registra(e1);
		total.registra(d1);
		System.out.println("O total das bonificacões é R$" + total.getSoma());
	}

}
