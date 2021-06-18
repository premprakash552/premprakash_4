package com.prem.honeywell.utils;

import com.prem.honeywell.db.models.MeetupTable;
import com.prem.honeywell.models.Meetup;

public class Util {

    public static MeetupTable getMeetupTableFromModel(Meetup meetup){
        MeetupTable table = new MeetupTable();
        table.setMeetupId(meetup.getMeetupId());
        table.setMeetupName(meetup.getMeetupName());
        table.setMeetupDescription(meetup.getMeetupDescription());
        table.setOrganizerId(meetup.getOrganizerId());
        table.setStartTime(meetup.getStartTime());
        table.setEndTime(meetup.getEndTime());
        table.setLocation(meetup.getLocation());
        table.setLatitude(meetup.getLatitude());
        table.setLongitude(meetup.getLongitude());
        return table;
    }

    public static Meetup getMeetupModelFromTable(MeetupTable meetupTable){
        Meetup model = new Meetup();
        model.setMeetupId(meetupTable.getMeetupId());
        model.setMeetupName(meetupTable.getMeetupName());
        model.setMeetupDescription(meetupTable.getMeetupDescription());
        model.setOrganizerId(meetupTable.getOrganizerId());
        model.setStartTime(meetupTable.getStartTime());
        model.setEndTime(meetupTable.getEndTime());
        model.setLocation(meetupTable.getLocation());
        model.setLatitude(meetupTable.getLatitude());
        model.setLongitude(meetupTable.getLongitude());
        return model;
    }
}
