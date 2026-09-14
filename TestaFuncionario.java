public class TestaFuncionario {

    public static void main(String[] args) {
        Funcionario rainhadoExpediente1 = new Funcionario();
        rainhadoExpediente1.setCpf("888.126.479-45");
        rainhadoExpediente1.setNome("Bianca");
        rainhadoExpediente1.setSalario(20954.25);
        rainhadoExpediente1.setTipo(2);

        System.out.println("O nome é: " + rainhadoExpediente1.getNome());
        System.out.println("O CPF é: " + rainhadoExpediente1.getCpf());
        System.out.println("O salário é: " + rainhadoExpediente1.getSalario());
        System.out.println("A bonificação é: " + rainhadoExpediente1.getBonificacao());

        Gerente Ana = new Gerente();
        Ana.setCpf("369.325.145-50");
        Ana.setNome("Ana Volgue Diniz");
        Ana.setSalario(10);
        Ana.setTipo(1);
        Ana.setSenha(123456);

        System.out.println("\n O nome é: " + Ana.getNome());
        System.out.println("O CPF é: " + Ana.getCpf());
        System.out.println("O salário é: " + Ana.getSalario());
        System.out.println("A bonificação é: " + Ana.getBonificacao());
        System.out.println(Ana.autentica(123456));


    }
}