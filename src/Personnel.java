public class Personnel {
    private String name;
    private String profession;
    private long tally_number;
    private String email;

    public Personnel(String name, String profession, long tally_number, String email) {
        this.name = name;
        this.profession = profession;
        this.tally_number = tally_number;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public long getTally_number() {
        return tally_number;
    }

    public void setTally_number(long tally_number) {
        this.tally_number = tally_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
