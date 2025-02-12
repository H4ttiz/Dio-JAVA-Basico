class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if (parametro1 >= parametro2) {
            throw new ParametrosInvalidosException("Parâmetros inválidos");
        } else {
            int soma = parametro2 - parametro1;
            System.out.println("Contando...");
            for (int i = 1; i <= soma; i++) {
                System.out.println(i);
            }
            System.out.println("ou");
            for (int i = parametro1; i <= parametro2; i++) {
                System.out.println(i);
            }
        }
    }
}
