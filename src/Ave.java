public class Ave extends Animal {

    private String corPena;

    @Override
    public void locomover() {
        System.out.println("Voaando");
    }

    @Override
    public void alimentar() {
        System.out.println("Frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }

    public void fazerNinho(){
        System.out.println("Contruindo ninho");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    

}
