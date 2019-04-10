package com.kMahmood

class Appointment {

Date appDate
int appTime
int appDuration
int roomNumber

Patient patients

static hasMany=[surgeries: Surgery, appointments: Appointment]

    static constraints = {

appDate blank: false, nullable: false
appTime blank: false, nullable: false
appDuration blank: false, nullable: false
roomNumber blank: false, nullable: false

    }
}
