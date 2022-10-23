public class klient {

    private Long id;
    private String imie;
    private String nazwisko;
    private String miejscowosc;

    public klient (String id, String imie, String nazwisko, String miejscowosc) {
        this.id = Long.valueOf(id);
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.miejscowosc= miejscowosc;
    }

    public Long getId(){
        return id;
    }
    public String getImie() {
        return imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public String getMiejscowosc() {
        return miejscowosc;
    }

    @Override
    public String toString() {
        return "klient{" +
                "id=" + id +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", miejscowosc='" + miejscowosc + '\'' +
                '}';
    }
}
