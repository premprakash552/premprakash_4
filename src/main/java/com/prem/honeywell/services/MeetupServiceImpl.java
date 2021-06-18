package com.prem.honeywell.services;

import com.prem.honeywell.db.models.MeetupTable;
import com.prem.honeywell.db.repository.MeetupRepo;
import com.prem.honeywell.models.Meetup;
import com.prem.honeywell.utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class MeetupServiceImpl implements MeetupService{

    @Autowired
    private MeetupTable meetupTable;

    @Autowired
    private MeetupRepo meetupRepo;

    @Override
    public Meetup addMeetups(Meetup meetup) {
        UUID meetupId = UUID.randomUUID();
        meetup.setMeetupId(meetupId);
        MeetupTable table = Util.getMeetupTableFromModel(meetup);
        //Do the DB things here
        return meetup;
    }

    @Override
    public List<Meetup> getAllMeetup() {
        Meetup model = Util.getMeetupModelFromTable(meetupTable);
        return List.of(model);
    }

    @Override
    public Meetup getMeetup(String meetupId) {
        Meetup model = null;
        try {
            UUID id = UUID.fromString(meetupId);
            if (meetupTable.getMeetupId().equals(id)) {
                model = Util.getMeetupModelFromTable(meetupTable);
            }
        }catch (Exception e){
            //Wrap it to a runtime exception with proper message
        }
        return model;
    }
}
