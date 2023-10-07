class TestaIdade{
    public static void main(String[] args) {
        // imprime a idade
        int idade = 20;
        System.out.println(idade);

        // gera uma idade no ano seguinte
        int idadeNoAnoQueVem = idade + 1;

        // imprime a idade.
        System.out.println(idadeNoAnoQueVem);
    }
}

class GastoTotal{
    public static void main(String[] args) {
        int janeiro = 15000;
        int fevereiro = 23000;
        int marco = 17000;
        int gastototal = janeiro + fevereiro + marco;
        System.out.println(gastototal);
    }
}

class CondicaoIf {
    public static void main(String[] args) {
        int idade = 15;
        boolean amigoDoDono = true;
        if (idade < 18 && !amigoDoDono) { // em vez de escrever "amigoDoDono == false"
            System.out.println("Não pode entrar");
        } else {
            System.out.println("Pode entrar");
        }
    }
}

class CondicaoWhile {
    public static void main(String[] args) {
        int idade = 15;
        while (idade < 18) {
            System.out.println(idade);
            idade = idade + 1;
        }
    }
}

class CondicaoFor {
    public static void main(String[] args) {
        for (int idade = 0; idade < 18; idade = idade + 1) { // o incremento pode ser também "idade++"
            System.out.println(idade);
        }
    }
}

class ControleLoop {
    public static void main(String[] args) {
        int x = 0;
        int y = 50;
        for (int i = x; i < y; i++) {
            if (i % 19 == 0) {
                System.out.println("Achei um número divisível por 19 entre x e y");
                break; // aqui poderíamos usar o "continue" para ir para o próximo laço
            }
        }
    }
}
