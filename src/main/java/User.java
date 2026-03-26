import java.time.LocalDate;

public class User {
    private String cognome;
    private String nome;
    private Sesso sesso;
    private String luogoNascita;
    private String provicia;
    private LocalDate dataNascita;

    public User(String cognome, String nome, String sesso, String luogoNascita, String provicia, String giorno, String mese, String anno) {
        this.cognome = cognome;
        this.nome = nome;
        this.sesso = Sesso.valueOf(sesso);
        this.luogoNascita = luogoNascita;
        this.provicia = provicia;
        dataNascita = LocalDate.of(
                Integer.parseInt(anno),
                Integer.parseInt(mese),
                Integer.parseInt(giorno)
        );
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Sesso getSesso() {
        return sesso;
    }

    public void setSesso(Sesso sesso) {
        this.sesso = sesso;
    }

    public String getLuogoNascita() {
        return luogoNascita;
    }

    public void setLuogoNascita(String luogoNascita) {
        this.luogoNascita = luogoNascita;
    }

    public String getProvicia() {
        return provicia;
    }

    public void setProvicia(String provicia) {
        this.provicia = provicia;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }
}
