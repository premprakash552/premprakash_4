package com.prem.honeywell.api;

import com.prem.honeywell.models.Meetup;
import com.prem.honeywell.services.MeetupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MeetUpController {

    @Autowired(required = true)
    private MeetupService service;

    // Add a Meetup
    @PostMapping(path = "/v1/honeywell/meetups", consumes = "application/json", produces = "application/json")
    @ResponseBody
    public Meetup addMeetups(@RequestBody Meetup meetup) {
       return service.addMeetups(meetup);
    }

    //Get All Meetups based on criteria
    @GetMapping("/v1/honeywell/meetups")
    @ResponseBody
    public List<Meetup> getAllMeetup() {
        return service.getAllMeetup();
    }

    //Get particular meetup and details
    @GetMapping("/v1/honeywell/meetups/{meetupId}")
    @ResponseBody
    public Meetup getMeetup(@PathVariable String meetupId) {
        return service.getMeetup(meetupId);
    }

}
