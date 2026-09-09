public class TestaFuncionario {

    public static void main(String[] args) {
        Funcionario rainhadoExpediente1 = new Funcionario();
        rainhadoExpediente1.setCpf("888.126.479-45");
        rainhadoExpediente1.setNome("Bianca");
        rainhadoExpediente1.setSalario(3654.25);

        System.out.println(rainhadoExpediente1.getNome());
        System.out.println(rainhadoExpediente1.getCpf());
        System.out.println(rainhadoExpediente1.getSalario());
        System.out.println(rainhadoExpediente1.getBonificacao());
    }
}