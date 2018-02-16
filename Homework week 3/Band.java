public class Band {
    private int members;
    private String first_album;

    public Band(int members, String first_album) {
        this.members = members;
        this.first_album = first_album;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    public String getFirst_album() {
        return first_album;
    }

    public void setFirst_album(String first_album) {
        this.first_album = first_album;
    }


        public void print_info() {
            System.out.println("This band has " + members + " and their first album is " + first_album);
            }
            @Override
            public void more_info(){
                System.out.println("more info");

            }
}
