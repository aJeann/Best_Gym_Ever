import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.Scanner;

/**
 * Created by Axel Jeansson
 * Date: 2020-10-09
 * Time: 15:25
 * Project: Inlämning2
 * Copyright: MIT
 */
public class readFile {

    private Scanner s;
    Gym g = new Gym();
    Membership time = new Membership();


    //Öppnar filen
    public void openFile() throws FileNotFoundException {
        try {
            s = new Scanner(new File("customers.txt"));
        } catch (Exception e) {
            System.out.println("Filen hittades inte.");
        }
    }

    //Läser filen
    public void readFile() {
        while (s.hasNext()) {
            String pNum = s.next();
            int komma = pNum.indexOf(",");
            pNum = pNum.substring(0, komma);
            String name = s.next() + " " + s.next();
            String member = s.next();
            g.gymMembers.add(new GymMember(pNum, name, member));
            //System.out.printf("%s %s %s\n", pNum, name ,member);
        }
    }

    //Hittar gymmedlem
    public void userInput() {
        boolean isMember = false;
        String input = JOptionPane.showInputDialog("Skriv in namn eller personnummer: ");


        for (GymMember m : g.gymMembers) {
            if (m.getName().equalsIgnoreCase(input)) {
                isMember = true;
            }
        }

        if (isMember) {
            for (GymMember m : g.gymMembers) {
                if (m.getName().equalsIgnoreCase(input) || m.getPersNmbr().equals(input)) {
                    if (time.MembershipDate(m.getMembershipDate())) {
                        try (PrintWriter ut = new PrintWriter(new BufferedWriter(new FileWriter("gymlista.txt", true)))) {
                            ut.println(m.getMember() + "tränade " + time.getDate() + ", klockan " + time.getTime());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        System.out.println("Medlem tränade.");
                    } else
                        JOptionPane.showMessageDialog(null, "Medlem har inte betalat avgiften senaste året.");
                }


                //else JOptionPane.showMessageDialog(null, "Medlem finns inte.");
                //System.out.println("Gymmedlem: " + m.getMember())

            }

        } else JOptionPane.showMessageDialog(null, "Medlem finns inte!");



    }

    //Stänger filen
    public void closeFile() {
        s.close();
    }

}
