public class Countries {
  private   String id;
  private   String name;
  private   long citizen;

    @Override
    public String toString() {
        return name + "("
                + id + ")" +
                " ma " +  citizen +
                " ludności";
    }

    public Countries() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCitizen() {
        return citizen;
    }

    public void setCitizen(long citizen) {
        this.citizen = citizen;
    }

    public Countries(String id, String name, long citizen) {
        this.id = id;
        this.name = name;
        this.citizen = citizen;
    }
}
