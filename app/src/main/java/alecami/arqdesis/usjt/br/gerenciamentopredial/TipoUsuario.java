package alecami.arqdesis.usjt.br.gerenciamentopredial;

public enum TipoUsuario {
    SINDICO(1), FUNCIONARIO(2), ATENDENTE(3);

    private int usuario;

    TipoUsuario(int usuario){
        this.usuario = usuario;
    }

    public int getUsuario() {
        return usuario;
    }
}
