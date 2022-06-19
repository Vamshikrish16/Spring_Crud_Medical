package com.example.crud.dao;

import java.util.ArrayList;
import java.util.List;

import com.example.crud.entity.MedicalResearch;
import com.example.crud.entity.Participant;
import org.springframework.stereotype.Repository;

@Repository
public class ParticipantDaoImpl implements ParticipantDao{

    // save participants in in-memory
    private ArrayList<Participant> participantDb;

    private ArrayList<MedicalResearch> medicalResearhDb;

    public ParticipantDaoImpl(){
        participantDb = new ArrayList<Participant>();

        // create medical research objects

        MedicalResearch research1 = new MedicalResearch("Cancer Research");
        MedicalResearch research2 = new MedicalResearch("AIDS Research");
        MedicalResearch research3 = new MedicalResearch("Akshay Research");
        research1.setId(1);
        research2.setId(2);
        research2.setId(3);
        medicalResearhDb = new ArrayList<MedicalResearch>();
        medicalResearhDb.add(research1);
        medicalResearhDb.add(research2);
        medicalResearhDb.add(research3);

    }

    public Participant save(Participant participant){
        int id = participant.getId();
        int len = participantDb.size();
        if (id==-1){

            participant.setId(len);
            participant.setMedicalResearch(medicalResearhDb);
            participantDb.add(len, participant);

        }
        else{
            participantDb.add(id, participant);
        }

        return participant;
    };

    public Participant getParticipantById(int id){

    try{    
        Participant participant = participantDb.get(id);
        return participant;
    }
    catch(Exception ex){
        return null;
    }

    
    }

    public Participant deleteParticipantById(int id){

    try{    
        Participant participant = participantDb.remove(id);

        return participant;
    }

    catch(Exception ex){
        return null;
    }


    }
}