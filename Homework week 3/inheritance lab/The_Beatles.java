public class The_Beatles extends Band {
    private String bassist;
    private String rhythm_guitar;

    public The_Beatles(int members, String first_album, String bassist, String rhythm_guitar) {
        super(members, first_album);
        this.bassist = bassist;
        this.rhythm_guitar = rhythm_guitar;
    }

    public String getBassist() {
        return bassist;
    }

    public void setBassist(String bassist) {
        this.bassist = bassist;
    }

    public String getRhythm_guitar() {
        return rhythm_guitar;
    }

    public void setRhythm_guitar(String rhythm_guitar) {
        this.rhythm_guitar = rhythm_guitar;
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
    public void more_info(){
        System.out.println("The bassist is " + bassist);
    }
}

