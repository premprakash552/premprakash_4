package com.prem.honeywell.services;

import com.prem.honeywell.models.Meetup;

import java.util.List;

public interface MeetupService {
    Meetup addMeetups(Meetup meetup);
    List<Meetup> getAllMeetup();
    Meetup getMeetup(String meetupId);
}
