import java.util.InputMismatchException;

public class ValidacaoCPF {



    public static boolean ValidacaoCPF(String cpf) {

        // Remove caracteres não numéricos do CPF

        cpf = cpf.replaceAll("[^0-9]", "");



        // Verifica se o CPF possui 11 dígitos

        if (cpf.length() != 11) {

            return false;

        }



        // Calcula o primeiro dígito verificador

        int soma = 0;

        for (int i = 0; i < 9; i++) {

            soma += Character.getNumericValue(cpf.charAt(i)) * (10 - i);

        }

        int primeiroDigito = 11 - (soma % 11);



        // Se o primeiro dígito verificador for maior que 9, define-o como 0

        if (primeiroDigito > 9) {

            primeiroDigito = 0;

        }



        // Calcula o segundo dígito verificador

        soma = 0;

        for (int i = 0; i < 10; i++) {

            soma += Character.getNumericValue(cpf.charAt(i)) * (11 - i);

        }

        int segundoDigito = 11 - (soma % 11);



        // Se o segundo dígito verificador for maior que 9, define-o como 0

        if (segundoDigito > 9) {

            segundoDigito = 0;

        }



        // Verifica se os dígitos calculados correspondem aos dígitos originais do CPF

        return cpf.charAt(9) - '0' == primeiroDigito && cpf.charAt(10) - '0' == segundoDigito;

    }



    public static void main(String[] args) {

        String cpf = "123.456.789-09"; // Substitua pelo CPF que deseja validar

        if (ValidacaoCPF(cpf)) {

            System.out.println("CPF válido!");

        } else {

            System.out.println("CPF inválido!");

        }

    }

}

