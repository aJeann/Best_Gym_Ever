import java.time.LocalDate;

/**
 * Created by Axel Jeansson
 * Date: 2020-10-09
 * Time: 15:47
 * Project: Inlämning2
 * Copyright: MIT
 */
public class GymMember {
    private String persNmbr;
    private String name;
    private String membershipDate;

    public GymMember(){
    }

    public GymMember(String persNmbr, String name, String membershipDate) {
        this.persNmbr = persNmbr;
        this.name = name;
        this.membershipDate = membershipDate;
    }

    public String getPersNmbr(){
        return persNmbr;
    }

    public String getName(){
        return name;
    }

    public LocalDate getMembershipDate() {
        return LocalDate.parse(membershipDate);
    }

    public String getMember(){
        return name + " (" + persNmbr+ ") ";
    }

}
