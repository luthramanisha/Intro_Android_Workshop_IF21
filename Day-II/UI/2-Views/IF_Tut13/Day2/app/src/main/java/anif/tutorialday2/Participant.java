package anif.tutorialday2;

import android.provider.Telephony;

import java.util.ArrayList;

/**
 * Created by manishaluthra247 on 18/08/2016.
 */
public class Participant {

    public String mName;
    public String mAddress;
    public Integer mPhoneNo;
    public String mSchool;

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmAddress() {
        return mAddress;
    }

    public void setmAddress(String mAddress) {
        this.mAddress = mAddress;
    }

    public Integer getmPhoneNo() {
        return mPhoneNo;
    }

    public void setmPhoneNo(Integer mPhoneNo) {
        this.mPhoneNo = mPhoneNo;
    }

    public String getmSchool() {
        return mSchool;
    }

    public void setmSchool(String mSchool) {
        this.mSchool = mSchool;
    }

    public Participant(String name) {
        this.mName = name;
    }

    public Participant(String name, String address, Integer phoneNo, String school) {
        this.mName = name;
        this.mAddress = address;
        this.mPhoneNo = phoneNo;
        this.mSchool = school;
    }

    public static ArrayList<Participant> getParticipants() {
        ArrayList<Participant> participants = new ArrayList<Participant>();
        participants.add(new Participant("Oksana"));
        participants.add(new Participant("Janny"));
        participants.add(new Participant("Angela"));
        return participants;
    }
}
