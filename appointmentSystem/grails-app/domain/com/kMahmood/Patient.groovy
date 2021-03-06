package com.kMahmood

class Patient {

String patientName
String patientAddress
String patientResidence
Date patientDob
String patientID
Date dateRegistered
int patientPhone
Prescription prescriptions
Appointment appointments

static hasMany=[surgeries: Surgery, doctors: Doctor]

    static constraints = {
patientName blank: false, nullable: false
patientAddress blank: false, nullable: false
patientResidence blank: false, nullable: false
patientDob blank: false, nullable: false
patientID blank: false, nullable: false
dateRegistered blank: false, nullable: false
patientPhone blank: false, nullable: false

    }
}
