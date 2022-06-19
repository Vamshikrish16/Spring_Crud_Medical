package com.example.crud.dao;

import com.example.crud.entity.Participant;

public interface ParticipantDao{

    public Participant save(Participant participant);

    public Participant getParticipantById(int id);

    public Participant deleteParticipantById(int id);


}