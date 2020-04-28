package com.blueradix.android.monsterssqlite.services;

import android.content.Context;

import com.blueradix.android.monsterssqlite.database.MonsterDatabaseHelper;
import com.blueradix.android.monsterssqlite.entities.Monster;

import java.util.List;

public class DataService {

    private MonsterDatabaseHelper sqlite;

    public void connect(){

    }

    public void disconnect(){

    }

    public void init(Context context){
        sqlite = sqlite.getInstance(context);
    }

    public Long add(Monster monster){
        /**
         * TODO: Call MonsterDatabaseHelper insert method
         */
        return 1L;
    }

    public boolean delete(Monster monster){
        /**
         * TODO: Call MonsterDatabaseHelper delete method
         */
        return true;
    }

    public boolean update(Monster monster){
        /**
         * TODO: Call MonsterDatabaseHelper update method
         */
        return true;
    }

    public List<Monster> getMonsters(){
        /**
         * TODO: Call MonsterDatabaseHelper getMonsters method and return them
         */
        return null;
    }

}