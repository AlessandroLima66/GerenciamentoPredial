package alecami.arqdesis.usjt.br.gerenciamentopredial;

public class Usuario {
    private String login;
    private String senha;
    private TipoUsuario tipoUsuario;

    public Usuario(){

    }

    public Usuario(String login, String senha, TipoUsuario tipoUsuario){
        setLogin(login);
        setSenha(senha);
        setTipoUsuario(tipoUsuario);
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) { this.tipoUsuario = tipoUsuario; }

    public TipoUsuario getTipoUsuario() { return tipoUsuario; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;

        Usuario usuario = (Usuario) o;

        if (!getLogin().equals(usuario.getLogin())) return false;
        return getSenha().equals(usuario.getSenha());
    }


}
