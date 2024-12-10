package PKA.VL_01.PR_01;

import java.util.Objects;

public class RefinedPerson extends Person {

    private String nickname;

    public RefinedPerson(String name, String city, String street, String zipcode, String nickname) {
        super(name, city, street, zipcode);
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return super.toString() + ", nickname='" + nickname + "'";
    }

    @Override
    public boolean equals(Object o) {
        // Überprüfen, ob es sich um das gleiche Objekt handelt
        if (this == o) return true;

        // Überprüfen, ob das andere Objekt null ist oder von einem anderen Typ ist
        if (o == null || getClass() != o.getClass()) return false;

        // Der Typ des Objekts ist RefinedPerson, daher casten wir es
        RefinedPerson that = (RefinedPerson) o;

        // Vergleichen der Felder von Person und RefinedPerson
        return super.equals(o) && Objects.equals(nickname, that.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nickname);
    }
}
