public class Gerenciador {

    //a
    public static Escolaridade getEscolaridade(Pessoa pessoa){
        return pessoa.getEscolaridade();
    }

    //b
    public static Escolaridade getEscolaridadeCoordenador(Curso curso){
        return curso.getCoordenador().getEscolaridade();
    }

    //c
    public static Escolaridade getEscolaridadeDiretor(Escola escola){
        return escola.getDiretor().getEscolaridade();
    }

    //d
    public static Estado getNaturalidadeEstado(Pessoa pessoa){
        return pessoa.getNaturalidade().getEstado();
    }

    //e
    public static Cidade getNaturalidadeCidade(Pessoa pessoa){
        return pessoa.getNaturalidade();
    }

    //f
    public static Estado getEstadoMatricula(Aluno aluno){
        return aluno.getCurso().getEscola().getCidade().getEstado();
    }

    //g
    public static TipoEnsino getTipoEnsino(Professor professor){
        return professor.getCursoContratado().getTipoEnsino();
    }

    //h
    public static Professor getCoordenador(Aluno aluno){
        return aluno.getCurso().getCoordenador();
    }

    //i
    public static Professor getDiretor(Professor professor){
        return professor.getCursoContratado().getEscola().getDiretor();
    }

    //j
    public static Professor getCoordenador(Professor professor){
        return professor.getCursoContratado().getCoordenador();
    }





}
