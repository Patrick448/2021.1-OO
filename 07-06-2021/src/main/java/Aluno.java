public class Aluno {
    private int frequencia;
    private float notaAvaliacao1;
    private float notaAvaliacao2;
    private float notaAvaliacaoFinal;

    public Aluno(){
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    public float getNotaAvaliacao1() {
        return notaAvaliacao1;
    }

    public void setNotaAvaliacao1(float notaAvaliacao1) {
        this.notaAvaliacao1 = notaAvaliacao1;
    }

    public float getNotaAvaliacao2() {
        return notaAvaliacao2;
    }

    public void setNotaAvaliacao2(float notaAvaliacao2) {
        this.notaAvaliacao2 = notaAvaliacao2;
    }

    public float getNotaAvaliacaoFinal() {
        return notaAvaliacaoFinal;
    }

    public void setNotaAvaliacaoFinal(float notaAvaliacaoFinal) {
        this.notaAvaliacaoFinal = notaAvaliacaoFinal;
    }

    public boolean verificarAprovacao(){
        float media = (notaAvaliacao1+notaAvaliacao2)/2;

        if(frequencia < 75){
            return false;
        }else if((frequencia >= 75) && (media < 3.0f)){
            return false;
        }else if(media >= 7){
            return true;
        }
        else if((media + notaAvaliacaoFinal)/2>=5.0f){
            return true;
        }else{
            return false;
        }

    }
}

