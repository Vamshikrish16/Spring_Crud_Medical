package com.example.crud.rest;

import com.example.crud.dao.ParticipantDao;
import com.example.crud.entity.Participant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class MedicalCrudController{




    @Autowired
    private ParticipantDao participantDao;


    // get participant and his enrolled research
    @GetMapping("/Participant/{id}")
    public Participant getParticipant(@PathVariable int id){

        Participant participant = participantDao.getParticipantById(id);

        return participant;
    }



    @PutMapping("/Participant")
    public Participant updateParticipant(@RequestBody Participant participant){

        participantDao.save(participant);

        return participant;

    }

    @PostMapping("/Participant")
    public Participant saveParticipant(@RequestBody Participant participant){

        System.out.println(participant.getName());
        participant.setId(-1);
        participantDao.save(participant);

        return participant;

    }

    @DeleteMapping("/Participant/{id}")
    public String deleteParticipant(@PathVariable int id){

        participantDao.deleteParticipantById(id);

        return  "deleted the resource";
    }

}