package com.kMahmood

class Nurse {

String nurseName
String qualification
String nurseEmail
String nurseOffice
int nursePhone

    static constraints = {
nurseName blank: false, nullable: false
qualification blank: false, nullable: false
nurseEmail blank: false, nullable: false, email: true
nurseOffice blank: false, nullable: false
nursePhone blank: false, nullable: false


    }
}
