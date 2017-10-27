package alecami.arqdesis.usjt.br.gerenciamentopredial;

public enum TipoUsuario {
    SINDICO(1,"Sindico"), FUNCIONARIO(2,"Funcionario"), ATENDENTE(3, "Atendente");

    private int codigo;
    private String usuario;

    TipoUsuario(int codigo, String usuario){
        this.codigo=codigo;
        this.usuario = usuario;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getUsuario() {
        return usuario;
    }
}
