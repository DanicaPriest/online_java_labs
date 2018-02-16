public class The_Clash extends Band {
    private String lead_singer;
    private String lead_guitar;

    public The_Clash(int members, String first_album, String lead_singer, String lead_guitar) {
        super(members, first_album);
        this.lead_singer = lead_singer;
        this.lead_guitar = lead_guitar;
    }

    public String getLead_singer() {
        return lead_singer;
    }

    public void setLead_singer(String lead_singer) {
        this.lead_singer = lead_singer;
    }

    public String getLead_guitar() {
        return lead_guitar;
    }

    public void setLead_guitar(String lead_guitar) {
        this.lead_guitar = lead_guitar;
    }
    @Override
    public int getMembers() {
        return super.getMembers();
    }

    @Override
    public void setMembers(int members) {
        super.setMembers(members);
    }

    @Override
    public String getFirst_album() {
        return super.getFirst_album();
    }

    @Override
    public void setFirst_album(String first_album) {
        super.setFirst_album(first_album);
    }

    @Override
    public void print_info() {
        super.print_info();
        System.out.println("The Clash has " + members + " and their first album is " + first_album);
    }
}
